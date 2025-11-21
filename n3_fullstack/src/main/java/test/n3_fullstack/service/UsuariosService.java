
package test.n3_fullstack.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import test.n3_fullstack.Entity.Usuarios;
import test.n3_fullstack.repository.UsuRepository;

/**
 *
 * @author PAAWSA02LC1009
 */
@Service
public class UsuariosService {
    
    @Autowired
    private UsuRepository repository;

    public Usuarios saveUsuarios(Usuarios u){
        return repository.save(u);
    }

    public List<Usuarios> saveUsuarios(List<Usuarios> usuarios){
        return repository.saveAll(usuarios);
    }

    public List<Usuarios> getUsuarios(){
        return repository.findAll();
    }

    public Usuarios getUsuariosById(int user_id){
        return repository.findById(user_id).orElse(null);
    }

    public Usuarios getUsuariosByPrimerNombre(String nombre){
        return repository.nombreCompleto(nombre);
    }

    public String deleUsuarios(int id){
        repository.deleteById(id);
        return "Usueario eliminado" + id;
    }

    public Usuarios updateUsuarios(Usuarios u){
        Usuarios existingUsuario = repository.findById(u.getUser_id()).orElse(null);
        existingUsuario.setNombreCompleto(u.getNombreCompleto());
        existingUsuario.setCorreo(u.getCorreo());
        existingUsuario.setContrasena(u.getContrasena());
        existingUsuario.setDireccion(u.getDireccion());
        return repository.save(existingUsuario);
    }
}
