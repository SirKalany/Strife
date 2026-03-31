package com.strife.strife_api.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class FamilyRequest {
    private String slug;
    private String name;
    private String imageUrl;
    private String description;
    private UUID domainId;
    private UUID countryId;
}