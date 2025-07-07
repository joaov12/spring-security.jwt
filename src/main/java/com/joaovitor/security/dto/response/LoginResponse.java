package com.joaovitor.security.dto.response;

public record LoginResponse(String accessToken, Long expiresIn) {
}
