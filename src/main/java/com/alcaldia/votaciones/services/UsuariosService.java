package com.alcaldia.votaciones.services;
import com.alcaldia.votaciones.models.Role;
import com.alcaldia.votaciones.models.User;
import com.alcaldia.votaciones.models.request.RegisterRequest;
import com.alcaldia.votaciones.models.request.UserRequest;
import com.alcaldia.votaciones.repository.IUsuariosRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import com.alcaldia.votaciones.models.response.UserResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuariosService {

    private final AuthenticationManager authenticationManager;
    private final IUsuariosRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public UserResponse login(UserRequest request){
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(),request.getPassword())); // esta parte se encarga de trabajar con las clases de configuracion
        User user=userRepository.findByUsername(request.getUsername()).orElseThrow();
        String token=jwtService.getToken(user);
        return UserResponse.builder()
                .token(token)
                .idUser(user.getIdUser())
                .build();
    }

    public UserResponse register(RegisterRequest request) {
        User user = User.builder()
                .username(request.getUsuario())
                .password(passwordEncoder.encode(request.getPassword()))
                .nombres(request.getNombres())
                .apellidoPaterno(request.getApellidoPaterno())
                .apellidoMaterno(request.getApellidoMaterno())
                .role(Role.USER)
                .build();

        userRepository.save(user);

        return UserResponse.builder()
                .token(jwtService.getToken(user))
                .build();
    }
}

