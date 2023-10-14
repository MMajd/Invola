package com.invola.system.application.port.out;

import com.invola.system.application.domain.model.Story;
import com.invola.system.application.domain.model.Story.StoryId;

public interface LoadStoryPort {
    Story loadStory(StoryId storyId);
}
