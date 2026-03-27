package com.strife.strife_api.controller;

import com.strife.strife_api.dto.CountryDto;
import com.strife.strife_api.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/domains")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/{domain}/countries")
    public List<CountryDto> getCountriesByDomain(@PathVariable String domain) {
        return countryService.getCountriesByDomain(domain);
    }
}