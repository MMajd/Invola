package com.invola.system.adapter.out.persistence;

import com.invola.system.adapter.out.persistence.entity.StoryEntity;
import com.invola.system.adapter.out.persistence.mapper.StoryMapper;
import com.invola.system.adapter.out.persistence.repository.StoryEntityJpaRepository;
import com.invola.system.application.domain.model.Story;
import com.invola.system.application.domain.model.Story.StoryId;
import com.invola.system.application.port.out.AddStoryPort;
import com.invola.system.application.port.out.LoadStoryPort;
import com.invola.system.application.port.out.UpdateStoryPort;
import com.invola.system.common.PersistenceAdapter;

import lombok.RequiredArgsConstructor;

@PersistenceAdapter
@RequiredArgsConstructor
class StoryPersistenceAdapter implements AddStoryPort, LoadStoryPort, UpdateStoryPort {
    private final StoryMapper storyMapper;
    private final StoryEntityJpaRepository storyEntityJpaRepository;

    @Override
    public void updateStory(Story story) {
        storyEntityJpaRepository.save(storyMapper.fromDomainToEntity(story));
    }

    @Override
    public Story loadStory(StoryId storyId) {
        StoryEntity storyEntity = storyEntityJpaRepository.findById(storyId.getValue())
                .orElseThrow(() -> new RuntimeException("Cannot find story with given id"));
        return storyMapper.fromEntityToDomain(storyEntity);
    }

    @Override
    public void addStory(Story story) {
        storyEntityJpaRepository.save(
                storyMapper.fromDomainToEntity(story));
    }

}
