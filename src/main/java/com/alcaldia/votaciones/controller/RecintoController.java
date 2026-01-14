package com.alcaldia.votaciones.controller;

import com.alcaldia.votaciones.models.Recinto;
import com.alcaldia.votaciones.services.IRecintoService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recintos")
@RequiredArgsConstructor

public class RecintoController {

   @Autowired
    private IRecintoService recintoService;

    @GetMapping("r/{idRecinto}")
    public ResponseEntity<List<Recinto>> obtenerRecintos(@PathVariable("idRecinto") Integer id){
        return ResponseEntity.ok(recintoService.obtenerRecintos(id));
    }
}
