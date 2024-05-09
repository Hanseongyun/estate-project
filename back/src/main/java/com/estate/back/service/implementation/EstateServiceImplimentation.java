package com.estate.back.service.implementation;

import org.springframework.stereotype.Service;

import com.estate.back.repository.EstateRepository;
import com.estate.back.service.EsatateService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EstateServiceImplimentation implements EsatateService {
    
    private final EstateRepository estateRepository;
}
