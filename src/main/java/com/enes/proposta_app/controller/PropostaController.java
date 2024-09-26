package com.enes.proposta_app.controller;

import com.enes.proposta_app.dto.request.PropostaRequestDto;
import com.enes.proposta_app.dto.response.PropostaResponseDto;
import com.enes.proposta_app.service.PropostaService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proposta")
@AllArgsConstructor
public class PropostaController {

    private PropostaService propostaService;

    @PostMapping
    public ResponseEntity<PropostaResponseDto> criar(@RequestBody PropostaRequestDto propostaRequest) {
        PropostaResponseDto response = propostaService.criar(propostaRequest);
        return ResponseEntity.ok(response);
    }
}
