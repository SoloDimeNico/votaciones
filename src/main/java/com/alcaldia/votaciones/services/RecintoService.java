package com.alcaldia.votaciones.services;

import com.alcaldia.votaciones.models.Recinto;
import com.alcaldia.votaciones.repository.IRecintoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RecintoService implements IRecintoService {

    @Autowired
    private IRecintoRepository recintoRepository;

    public List<Recinto> obtenerRecintos(Integer id){
        return recintoRepository.obtenerRecintos(id);
    }
}
