package com.strife.strife_api.dto;

import lombok.Getter;
import lombok.Setter;
import java.util.UUID;

@Getter
@Setter
public class OperatorRequest {
    private UUID countryId;
    private String notes;
}