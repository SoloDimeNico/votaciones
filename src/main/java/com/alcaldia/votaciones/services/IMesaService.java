package com.alcaldia.votaciones.services;
import com.alcaldia.votaciones.models.Mesa;

import java.util.List;

public interface IMesaService {
    public List<Mesa> obtenerMesas(Integer id);
}
