package dev.jinodo.chat.api.dto;

import dev.jinodo.chat.domain.ChatMessageEntity;

import java.time.Instant;
import java.util.UUID;

public record ChatMessageResponse(
        UUID id,
        UUID channelId,
        String senderName,
        String content,
        Instant sentAt
) {
    public static ChatMessageResponse from(ChatMessageEntity e) {
        return new ChatMessageResponse(
                e.getId(), e.getChannelId(),
                e.getSenderName(), e.getContent(), e.getSentAt()
        );
    }
}
