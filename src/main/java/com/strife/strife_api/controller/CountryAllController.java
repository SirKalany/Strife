package com.strife.strife_api.controller;

import com.strife.strife_api.dto.CountryDto;
import com.strife.strife_api.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class CountryAllController {

    private final CountryService countryService;

    @GetMapping("/api/countries")
    public List<CountryDto> getAllCountries() {
        return countryService.getAllCountries();
    }
}