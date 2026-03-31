package com.strife.strife_api.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class DomainDto {
    private UUID id;
    private String slug;
    private String name;
}