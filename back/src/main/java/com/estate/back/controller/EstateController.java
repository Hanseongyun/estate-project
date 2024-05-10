package com.estate.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estate.back.dto.response.estate.GetLocalDataResponseDto;
import com.estate.back.dto.response.estate.GetRatioDataResponseDto;
import com.estate.back.service.EsatateService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/estate")
@RequiredArgsConstructor
public class EstateController {
    
    private final EsatateService esatateService;

    @GetMapping("/local/{local}")
    public ResponseEntity<? super GetLocalDataResponseDto> getLocalData (
        @PathVariable("local") String local
    ) {
        ResponseEntity<? super GetLocalDataResponseDto> response = esatateService.getLocalData(local);
        return response;
    }

    @GetMapping("/ratio/{local}")
    public ResponseEntity<? super GetRatioDataResponseDto> getRatioData (
        @PathVariable("local") String local
    ) {
        ResponseEntity<? super GetRatioDataResponseDto> response = esatateService.getRatioData(local);
        return response;
}

}