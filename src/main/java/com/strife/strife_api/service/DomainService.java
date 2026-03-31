package com.strife.strife_api.service;

import com.strife.strife_api.dto.DomainDto;
import com.strife.strife_api.repository.DomainRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DomainService {

    private final DomainRepository domainRepository;

    public List<DomainDto> getAllDomains() {
        return domainRepository.findAll()
                .stream()
                .map(d -> new DomainDto(d.getId(), d.getSlug(), d.getName()))
                .toList();
    }
}