package com.invola.system.adapter.out.persistence.mapper;

import java.util.Optional;

import org.hibernate.mapping.UserDefinedType;
import org.springframework.stereotype.Component;

import com.invola.system.adapter.out.persistence.entity.StoryEntity;
import com.invola.system.adapter.out.persistence.entity.UserEntity;
import com.invola.system.adapter.out.persistence.repository.UserEntityJpaRepository;
import com.invola.system.application.domain.model.Story;
import com.invola.system.application.domain.model.User.UserEmail;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class StoryMapper {
    private final UserEntityJpaRepository userEntityJpaRepository;

    public Story fromEntityToDomain(StoryEntity storyEntity) {
        return Story.builder()
                .userEmail(new UserEmail(storyEntity.getUser().getEmail()))
                .title(storyEntity.getTitle())
                .body(storyEntity.getBody())
                .avgRate(storyEntity.getAvgRate())
                .build();
    }

    public StoryEntity fromDomainToEntity(Story story) {
        UserEntity userEntity = userEntityJpaRepository
                .findById(story.getUserEmail().getValue())
                .orElseThrow(() -> new RuntimeException("Cannot find user with given email"));

        Long storyId = story.getId().map(si -> si.getValue()).orElse(null);

        return StoryEntity.builder()
                .id(storyId)
                .avgRate(story.getAvgRate())
                .title(story.getTitle())
                .body(story.getBody())
                .user(userEntity)
                .build();
    }
}
