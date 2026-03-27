package com.strife.strife_api.controller;

import com.strife.strife_api.dto.FamilyDto;
import com.strife.strife_api.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/domains")
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;

    @GetMapping("/{domain}/countries/{country}/families")
    public List<FamilyDto> getFamilies(
            @PathVariable String domain,
            @PathVariable String country) {
        return familyService.getFamiliesByDomainAndCountry(domain, country);
    }
}