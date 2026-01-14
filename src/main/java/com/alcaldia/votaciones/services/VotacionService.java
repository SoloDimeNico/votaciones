package com.alcaldia.votaciones.services;

import com.alcaldia.votaciones.models.Mesa;
import com.alcaldia.votaciones.models.request.MesaRequest;
import com.alcaldia.votaciones.repository.IVotacionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VotacionService implements IVotacionService {

    @Autowired
    private IVotacionRepository iVotacionRepository;

    public int RegistrarVotoMesa(Integer id, MesaRequest mesa){
        return iVotacionRepository.actualizarCamposEspecificos(id,mesa.getTotalVotos());
    }
}
