package com.alcaldia.votaciones.services;
import com.alcaldia.votaciones.models.Recinto;
import java.util.List;

public interface IRecintoService {
    public List<Recinto> obtenerRecintos(Integer id);
}


