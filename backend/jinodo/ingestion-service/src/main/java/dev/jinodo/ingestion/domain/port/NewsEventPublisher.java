package dev.jinodo.ingestion.domain.port;

import dev.jinodo.domain.model.NewsItem;

public interface NewsEventPublisher {

    void publish(NewsItem newsItem);
}
