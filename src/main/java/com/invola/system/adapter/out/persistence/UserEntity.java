package com.invola.system.adapter.out.persistence;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class UserEntity {
    @Id
    private String email;

    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private Set<StoryEntity> stories;
}
