package com.invola.system.adapter.in.web;

import org.springframework.lang.NonNull;

public record AddStoryDto(@NonNull String mail, @NonNull String title, @NonNull String body) {
}
