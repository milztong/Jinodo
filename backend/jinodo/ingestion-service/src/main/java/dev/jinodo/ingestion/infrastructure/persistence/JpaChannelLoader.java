package dev.jinodo.ingestion.infrastructure.persistence;

import dev.jinodo.domain.model.Channel;
import dev.jinodo.ingestion.application.service.ChannelLoader;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaChannelLoader implements ChannelLoader {

    private final ChannelRepository repository;

    public JpaChannelLoader(ChannelRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Channel> loadAll() {
        return repository.findAll().stream()
                .map(JpaChannelLoader::toDomain)
                .toList();
    }

    @Override
    public List<Channel> loadIngestable() {
        return repository.findByExternalOnlyFalse().stream()
                .map(JpaChannelLoader::toDomain)
                .toList();
    }

    private static Channel toDomain(ChannelEntity e) {
        return new Channel(e.getId(), e.getName(), e.getDisplayName(),
                e.getDescription(), e.getSourceQueries());
    }
}
