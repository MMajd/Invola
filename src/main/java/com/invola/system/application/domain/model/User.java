package com.invola.system.application.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Value;

@AllArgsConstructor
@Getter
public class User {
    private final UserEmail email;
    private List<Story> stories;

    @Value
    public static final class UserEmail {
        private String value;
    }
}
