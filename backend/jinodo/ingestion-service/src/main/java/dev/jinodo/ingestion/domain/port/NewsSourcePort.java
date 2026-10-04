package dev.jinodo.ingestion.domain.port;

import dev.jinodo.domain.model.Channel;
import dev.jinodo.domain.model.NewsItem;

import java.util.List;

public interface NewsSourcePort {

    List<NewsItem> fetchLatest(Channel channel);

    dev.jinodo.domain.model.NewsSource getSource();
}
