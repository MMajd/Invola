package com.invola.system.application.domain.service;

import com.invola.system.application.domain.model.Story;
import com.invola.system.application.port.in.AddStoryUseCase;
import com.invola.system.application.port.out.AddStoryPort;
import com.invola.system.common.UseCase;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
public class AddStoryService implements AddStoryUseCase {
    private final AddStoryPort addStoryPort;

    @Override
    public void addStory(AddStoryCommand command) {
        addStoryPort.addStory(
                Story.builder()
                        .userEmail(command.userEmail())
                        .title(command.title())
                        .body(command.body())
                        .build());
    }

}
