package com.alcaldia.votaciones.controller;


import com.alcaldia.votaciones.models.Mesa;
import com.alcaldia.votaciones.services.IMesaService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("mesas")
@RequiredArgsConstructor

public class MesaController {

    @Autowired
    private IMesaService mesaService;

    @GetMapping("/m/{idMesa}")
    public ResponseEntity<List<Mesa>> obtenerMesas(@PathVariable("idMesa") Integer id){
        return ResponseEntity.ok(mesaService.obtenerMesas(id));
    }

}
