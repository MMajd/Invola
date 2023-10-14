package com.invola.system.application.domain.model;

import java.util.List;
import java.util.Optional;

import com.invola.system.application.domain.model.User.UserEmail;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor
@Builder
public class Story {
    private StoryId storyId;
    @Getter
    private final UserEmail userEmail;
    @Getter
    private String body;
    @Getter
    private String title;
    @Getter
    private Double avgRate;
    @Getter
    private List<StoryReview> rates;

    private Optional<StoryId> getId() {
        return Optional.ofNullable(storyId);
    }

    public void updateAvergateRate(Double newRate) {
        Double totalRates = newRate + rates.stream().map(r -> r.getRateValue()).reduce(Double.valueOf(0), Double::sum);
        avgRate = totalRates / rates.size();
    }

    @Value
    public static final class StoryId {
        private Long value;
    }
}
