package com.manager.backend.application.token;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TokenDto {
    private String token;
    private String userId;
}
