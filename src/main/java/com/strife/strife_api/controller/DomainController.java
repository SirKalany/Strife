package com.strife.strife_api.controller;

import com.strife.strife_api.dto.DomainDto;
import com.strife.strife_api.service.DomainService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/domains")
@RequiredArgsConstructor
public class DomainController {

    private final DomainService domainService;

    @GetMapping
    public List<DomainDto> getAllDomains() {
        return domainService.getAllDomains();
    }
}