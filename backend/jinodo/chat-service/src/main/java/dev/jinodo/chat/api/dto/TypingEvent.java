package dev.jinodo.chat.api.dto;

import java.util.UUID;

public record TypingEvent(UUID channelId, String username) {}
