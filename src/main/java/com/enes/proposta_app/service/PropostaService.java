package com.enes.proposta_app.service;

import com.enes.proposta_app.dto.request.PropostaRequestDto;
import com.enes.proposta_app.dto.response.PropostaResponseDto;
import com.enes.proposta_app.entity.Proposta;
import com.enes.proposta_app.mapper.PropostaMapper;
import com.enes.proposta_app.repository.PropostaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class PropostaService {

    private PropostaRepository propostaRepository;

    public PropostaResponseDto criar(PropostaRequestDto propostaRequest) {
        Proposta proposta = PropostaMapper.INSTANCE.convertDtoToProposta(propostaRequest);
        propostaRepository.save(proposta);
        return PropostaMapper.INSTANCE.convertEntitytoDto(proposta);

    }
}
