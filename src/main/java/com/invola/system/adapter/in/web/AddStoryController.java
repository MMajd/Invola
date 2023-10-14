package com.invola.system.adapter.in.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.invola.system.application.domain.model.User.UserEmail;
import com.invola.system.application.port.in.AddStoryUseCase;
import com.invola.system.application.port.in.AddStoryUseCase.AddStoryCommand;
import com.invola.system.common.WebAdapter;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@WebAdapter
@RestController
@RequiredArgsConstructor
class AddStoryController {
    private final AddStoryUseCase addStoryUseCase;

    @PostMapping("/story/add")
    void addStory(@Valid @RequestBody AddStoryDto addStoryDto) {
        addStoryUseCase.addStory(
                new AddStoryCommand(
                        new UserEmail(addStoryDto.mail()),
                        addStoryDto.title(),
                        addStoryDto.body()));
    }

}
