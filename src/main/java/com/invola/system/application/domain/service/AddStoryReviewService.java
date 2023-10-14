package com.invola.system.application.domain.service;

import com.invola.system.application.domain.model.Story;
import com.invola.system.application.domain.model.StoryReview;
import com.invola.system.application.port.in.AddStoryReviewUseCase;
import com.invola.system.application.port.out.AddStoryReviewPort;
import com.invola.system.application.port.out.LoadStoryPort;
import com.invola.system.application.port.out.UpdateStoryPort;
import com.invola.system.common.UseCase;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@UseCase
public class AddStoryReviewService implements AddStoryReviewUseCase {
    private final AddStoryReviewPort addStoryReviewPort;
    private final UpdateStoryPort updateStoryPort;
    private final LoadStoryPort loadStoryPort;

    @Override
    @Transactional
    public void addStoryReview(AddStoryReviewCommand command) {
        Story story = loadStoryPort.loadStory(command.storyId());
        story.updateAvergateRate(command.rate());
        updateStoryPort.updateStory(story);
        addStoryReviewPort.addStoryReview(
                StoryReview.builder()
                        .userEmail(command.userEmail())
                        .storyId(command.storyId())
                        .rateValue(command.rate())
                        .comment(command.comment())
                        .build());
    }

}
