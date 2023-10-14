package com.invola.system.application.port.in;

import com.invola.system.application.domain.model.User.UserEmail;
import com.invola.system.common.validation.Validation;

import jakarta.validation.constraints.NotNull;

public interface AddStoryUseCase {
    void addStory(AddStoryCommand command);

    public record AddStoryCommand(@NotNull UserEmail userEmail, @NotNull String title, @NotNull String body) {
        public AddStoryCommand(UserEmail userEmail, String title, String body) {
            this.userEmail = userEmail;
            this.title = title;
            this.body = body;

            Validation.validate(this);
        }
    }
}
