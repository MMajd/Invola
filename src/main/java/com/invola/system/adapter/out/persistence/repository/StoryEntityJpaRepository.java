package com.invola.system.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.invola.system.adapter.out.persistence.entity.StoryEntity;

@Service
public interface StoryEntityJpaRepository extends JpaRepository<StoryEntity, Long> {
}
