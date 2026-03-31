package com.strife.strife_api.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CountryRequest {
    private String slug;
    private String name;
    private String flagUrl;
}