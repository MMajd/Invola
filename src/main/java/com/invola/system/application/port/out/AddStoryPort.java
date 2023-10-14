package com.invola.system.application.port.out;

import com.invola.system.application.domain.model.Story;

public interface AddStoryPort {
    void addStory(Story story);
}
