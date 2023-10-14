package com.invola.system.application.port.out;

import com.invola.system.application.domain.model.StoryReview;
import com.invola.system.application.domain.model.StoryReview.StoryReviewId;

public interface LoadStoryReviewPort {
    StoryReview loadStoryReview(StoryReviewId storyReviewId);
}
