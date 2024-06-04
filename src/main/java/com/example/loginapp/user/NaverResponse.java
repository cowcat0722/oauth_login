package com.example.loginapp.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

public class NaverResponse {

    @Data
    public static class TokenDTO {
        @JsonProperty("access_token")
        private String accessToken;
        @JsonProperty("token_type")
        private String tokenType;
        @JsonProperty("refresh_token")
        private String refreshToken;
        @JsonProperty("expires_in")
        private String expiresIn;
    }

    @Data
    public static class NaverUserDTO {
        @JsonProperty("resultcode")
        private String resultcode;
        @JsonProperty("message")
        private String message;
        @JsonProperty("response")
        private Responses response;

        @Data
        static class Responses {
            @JsonProperty("id")
            private String id;
            @JsonProperty("nickname")
            private String nickname;
            @JsonProperty("email")
            private String email;
            @JsonProperty("mobile")
            private String mobile;
            @JsonProperty("name")
            private String name;
        }
    }
}