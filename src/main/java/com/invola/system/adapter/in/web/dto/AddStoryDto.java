package com.invola.system.adapter.in.web.dto;

import org.springframework.lang.NonNull;

public record AddStoryDto(@NonNull String mail, @NonNull String title, @NonNull String body) {
}
