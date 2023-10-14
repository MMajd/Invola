package com.invola.system.adapter.out.persistence;

import com.invola.system.application.domain.model.StoryReview;
import com.invola.system.application.domain.model.StoryReview.StoryReviewId;
import com.invola.system.application.port.out.AddStoryReviewPort;
import com.invola.system.application.port.out.LoadStoryReviewPort;
import com.invola.system.common.PersistenceAdapter;

import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
class StoryReviewPersistenceAdapter implements AddStoryReviewPort, LoadStoryReviewPort {

    @Override
    public void addStoryReview(StoryReview review) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addStoryReview'");
    }

    @Override
    public StoryReview loadStoryReview(StoryReviewId storyReviewId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadStoryReview'");
    }

}
