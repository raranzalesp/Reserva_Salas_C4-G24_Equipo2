package co.edu.unab.salas_computo.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import co.edu.unab.salas_computo.models.UsuarioModel;
import co.edu.unab.salas_computo.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;

    public ArrayList <UsuarioModel> obtenerUsuarios(){
        return (ArrayList <UsuarioModel>) usuarioRepository.findAll();
    }

    public UsuarioModel guardarUsuario(UsuarioModel usuario){
        return usuarioRepository.save(usuario);
    }
}
