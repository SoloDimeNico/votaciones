package com.alcaldia.votaciones.services;

import com.alcaldia.votaciones.models.Mesa;
import com.alcaldia.votaciones.repository.IMesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MesaService implements IMesaService {

    @Autowired
    private IMesaRepository mesaRepository;

    @Override
    public List<Mesa> obtenerMesas(Integer id) {
        return mesaRepository.obtenerMesas(id);
    }
}
