package com.strife.strife_api.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Getter
@Setter
public class ModelRequest {
    private String slug;
    private String name;
    private Integer yearIntroduced;
    private Integer yearRetired;
    private String imageUrl;
    private String article;
    private Map<String, Object> specs;
    private UUID familyId;
    private List<OperatorRequest> operators;
}