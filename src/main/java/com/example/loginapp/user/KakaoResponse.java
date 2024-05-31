package com.example.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class KakaoResponse {

    @Data
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private Integer expiresIn;
        @JsonProperty("scope")
        private String scope;
        @JsonProperty("refresh_token_expires_in")
        private Integer refreshTokenExpiresIn;
    }

// 토큰 DTO 정보
//{
//    "access_token": "_cr0_05S5urLbDiNoO3P9wjY-6KhnFusAAAAAQoqJVAAAAGPzTAo2UA9X5YOsAdz",
//        "token_type": "bearer",
//        "refresh_token": "ecyxC3iKtMTkc6o85cFyJTkPJ7FZ2NIJAAAAAgoqJVAAAAGPzTAo1kA9X5YOsAdz",
//        "expires_in": 21599,
//        "scope": "profile_nickname",
//        "refresh_token_expires_in": 5183999
//}

    @Data
    public static class KakaoUserDTO {
        @JsonProperty("id")
        private Long id;
        @JsonProperty("connected_at")
        private String connectedAt;
        @JsonProperty("properties")
        private Properties properties;

        @Data
        static class Properties {
            @JsonProperty("nickname")
            private String nickname;
        }
    }

// 유저 DTO 정보
//{
//    "id": 3506311658,
//        "connected_at": "2024-05-31T05:47:17Z",
//    "properties": {
//    "nickname": "박찬혁"
//}
}