package com.estate.back.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estate.back.service.EsatateService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/estate")
@RequiredArgsConstructor
public class EstateController {
    
    private final EsatateService esatateService;
}
