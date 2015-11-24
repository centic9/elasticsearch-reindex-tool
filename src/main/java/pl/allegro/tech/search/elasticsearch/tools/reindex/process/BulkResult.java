package pl.allegro.tech.search.elasticsearch.tools.reindex.process;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class BulkResult {

  private final int indexedCount;

  private final Collection<String> failedIds;

  private final Set<String> failureMessages;

  public BulkResult(int indexedCount, Collection<String> failedIds, Set<String> failureMessages) {
    this.indexedCount = indexedCount;
    this.failedIds = Collections.unmodifiableCollection(failedIds);
    this.failureMessages = failureMessages;
  }

  public int getIndexedCount() {
    return indexedCount;
  }

  public long getFailedCount() {
    return failedIds.size();
  }

  public Collection<String> getFailedIds() {
    return failedIds;
  }

  public Set<String> getFailureMessages() {
    return failureMessages;
  }
}
