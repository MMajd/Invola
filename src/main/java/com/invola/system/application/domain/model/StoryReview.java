package com.invola.system.application.domain.model;

import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Value;

@AllArgsConstructor
@Builder
public class StoryReview {
    private StoryReviewId storyReviewId;
    @Getter
    private final User.UserEmail userEmail;
    @Getter
    private final Story.StoryId storyId;
    @Getter
    private final Double rateValue;
    @Getter
    @NonNull
    private final String comment;

    public Optional<StoryReviewId> getStoryRateId() {
        return Optional.ofNullable(storyReviewId);
    }

    @Value
    public static final class StoryReviewId {
        private Long value;
    }
}
