package com.projetoWEG.api.controller;
import com.projetoWEG.api.assembler.UsuarioAssembler;
import com.projetoWEG.api.model.input.UsuarioInputDTO;
import lombok.AllArgsConstructor;
import com.projetoWEG.domain.model.AuthenticationResponse;
import com.projetoWEG.domain.model.Usuario;
import com.projetoWEG.security.ImplementsUserDetailsService;
import com.projetoWEG.security.JWTUtil;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
public class LoginController {

    private AuthenticationManager authenticationManager;
    private ImplementsUserDetailsService implementsUserDetailsService;
    private JWTUtil jwtUtil;
    private UsuarioAssembler usuarioAssembler;

    @PostMapping("/authenticate")
    public ResponseEntity<?> createAuthenticationToken(@RequestBody UsuarioInputDTO usuarioInputDTO) throws Exception{

        Usuario usuario = usuarioAssembler.toEntity(usuarioInputDTO);
        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
                    usuario.getUsername(), usuario.getPassword()));
        } catch (BadCredentialsException ex){
            throw new Exception("Usuário ou senha inválidos", ex);
        }

        final UserDetails userDetails = implementsUserDetailsService.loadUserByUsername(
                usuario.getUsername()
        );
        final String jwt = jwtUtil.generateToken(userDetails);

        return ResponseEntity.ok(new AuthenticationResponse(jwt, usuarioAssembler.toModel(usuario)));
    }
}
