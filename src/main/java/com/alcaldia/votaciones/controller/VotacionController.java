package com.alcaldia.votaciones.controller;

import com.alcaldia.votaciones.models.Mesa;
import com.alcaldia.votaciones.models.request.MesaRequest;
import com.alcaldia.votaciones.services.IVotacionService;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/votacion")
@RequiredArgsConstructor

public class VotacionController {

        @Autowired
        private IVotacionService votacionService;

        @PutMapping("/{id}")
        public int actualizarMesa(@PathVariable Integer id, @RequestBody MesaRequest mesa) {
                return votacionService.RegistrarVotoMesa(id, mesa);
        }
}
