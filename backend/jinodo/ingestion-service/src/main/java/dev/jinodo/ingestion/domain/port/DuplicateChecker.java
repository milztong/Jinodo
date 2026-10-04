package dev.jinodo.ingestion.domain.port;

public interface DuplicateChecker {

    boolean isAlreadySeen(String externalId);
}
