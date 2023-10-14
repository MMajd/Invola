package com.invola.system.adapter.out.persistence.entity;

import org.hibernate.annotations.Formula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "stories")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class StoryEntity {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String body;

    @ManyToOne
    @JoinColumn(name = "user_email", nullable = false)
    private UserEntity user;

    @Formula(value = "SELECT avg(s.rate) FROM story_review s WHERE s.story_id = id")
    private Double avgRate;
}
