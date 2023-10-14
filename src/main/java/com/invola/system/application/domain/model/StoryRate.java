package com.invola.system.application.domain.model;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;

@AllArgsConstructor
public class StoryRate {
    private StoryRateId rateId;
    @Getter
    private final User.UserEmail userEmail;
    @Getter
    private final Story.StoryId storyId;
    @Getter
    private final Double rateValue;
    @Getter
    @NonNull
    private final String comment;

    public Optional<StoryRateId> getStoryRateId() {
        return Optional.ofNullable(rateId);
    }

    @Value
    public static final class StoryRateId {
        private Long value;
    }
}
