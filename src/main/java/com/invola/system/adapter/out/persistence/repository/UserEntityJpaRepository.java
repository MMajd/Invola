package com.invola.system.adapter.out.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.invola.system.adapter.out.persistence.entity.UserEntity;

public interface UserEntityJpaRepository extends JpaRepository<UserEntity, String> {

}
