package com.invola.system.application.port.in;

import com.invola.system.application.domain.model.Story.StoryId;
import com.invola.system.application.domain.model.User.UserEmail;
import com.invola.system.common.validation.Validation;

import jakarta.validation.constraints.NotNull;

public interface AddStoryReviewUseCase {
    void addStoryReview(AddStoryReviewCommand command);

    public record AddStoryReviewCommand(@NotNull UserEmail userEmail, @NotNull StoryId storyId, @NotNull Double rate,
            @NotNull String comment) {
        public AddStoryReviewCommand(UserEmail userEmail, StoryId storyId, Double rate, String comment) {
            this.userEmail = userEmail;
            this.storyId = storyId;
            this.rate = rate;
            this.comment = comment;

            Validation.validate(this);
        }
    }
}
