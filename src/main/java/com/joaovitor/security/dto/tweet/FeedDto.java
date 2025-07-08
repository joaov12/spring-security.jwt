package com.joaovitor.security.dto.tweet;

import java.util.List;

public record FeedDto(List<FeedItemDto> feedItens,
                      int page,
                      int pageSize,
                      int totalpages,
                      Long totalElements) {
}
