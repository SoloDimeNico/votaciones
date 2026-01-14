package com.alcaldia.votaciones.models.request;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
        private String usuario;
        private String password;
        private String nombres;
        private String apellidoPaterno;
        private String apellidoMaterno;
}
