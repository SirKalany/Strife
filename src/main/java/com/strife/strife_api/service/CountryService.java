package com.strife.strife_api.service;

import com.strife.strife_api.dto.CountryDto;
import com.strife.strife_api.repository.CountryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService {

    private final CountryRepository countryRepository;

    public List<CountryDto> getCountriesByDomain(String domainSlug) {
        return countryRepository.findCountriesByDomainSlug(domainSlug)
                .stream()
                .map(c -> new CountryDto(c.getId(), c.getSlug(), c.getName(), c.getFlagUrl()))
                .toList();
    }

    public List<CountryDto> getAllCountries() {
        return countryRepository.findAll()
                .stream()
                .map(c -> new CountryDto(c.getId(), c.getSlug(), c.getName(), c.getFlagUrl()))
                .toList();
    }
}