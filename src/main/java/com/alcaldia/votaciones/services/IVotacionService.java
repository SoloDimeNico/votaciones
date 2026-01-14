package com.alcaldia.votaciones.services;

import com.alcaldia.votaciones.models.request.MesaRequest;

public interface IVotacionService {

    public int RegistrarVotoMesa(Integer id, MesaRequest mesa);
}
