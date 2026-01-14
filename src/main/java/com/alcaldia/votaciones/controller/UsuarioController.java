package com.alcaldia.votaciones.controller;

import com.alcaldia.votaciones.models.request.RegisterRequest;
import com.alcaldia.votaciones.models.request.UserRequest;
import com.alcaldia.votaciones.models.response.UserResponse;
import com.alcaldia.votaciones.services.UsuariosService;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor

public class UsuarioController {

    @Autowired
    private final UsuariosService usuariosService;

    @PostMapping(value = "login")
    public ResponseEntity<UserResponse> login(@RequestBody UserRequest request)
    {
        return ResponseEntity.ok(usuariosService.login(request));
    }

    @PostMapping(value = "register")
    public ResponseEntity<UserResponse> register(@RequestBody RegisterRequest request)
    {
        return ResponseEntity.ok(usuariosService.register(request));
    }

}
