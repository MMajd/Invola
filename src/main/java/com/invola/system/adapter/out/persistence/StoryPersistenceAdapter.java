package com.invola.system.adapter.out.persistence;

import com.invola.system.application.domain.model.Story;
import com.invola.system.application.domain.model.Story.StoryId;
import com.invola.system.application.port.out.LoadStoryPort;
import com.invola.system.application.port.out.UpdateStoryPort;
import com.invola.system.common.PersistenceAdapter;

import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
public class StoryPersistenceAdapter implements LoadStoryPort, UpdateStoryPort {
    @Override
    public void updateStory(Story story) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateStory'");
    }

    @Override
    public Story loadStory(StoryId storyId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loadStory'");
    }

}
