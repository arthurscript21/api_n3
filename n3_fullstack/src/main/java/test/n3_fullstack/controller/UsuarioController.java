package test.n3_fullstack.controller;

import test.n3_fullstack.Entity.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import test.n3_fullstack.service.UsuariosService;

/**
 * Controlador REST para la entidad Usuarios.
 */
@RestController // ✅ Importante: Marca la clase como un controlador REST.
public class UsuarioController {
    
    @Autowired
    private UsuariosService service;
  
    // 1. CREATE: Agregar un solo usuario (análogo a addPokemon)
    @PostMapping("/addUsuario")
    public Usuarios addUsuarios(@RequestBody Usuarios u) {
        System.out.println(u);
        return service.saveUsuarios(u);
    }
  
    // 2. CREATE: Agregar una lista de usuarios (análogo a addPokemones)
    @PostMapping("/addUsuarios")
    public List<Usuarios> addUsuariosList(@RequestBody List<Usuarios> usuarios) {
        // En el archivo UsuariosService, el nombre de este método es saveUsuarios,
        // pero se diferencia por la lista de argumentos.
        return service.saveUsuarios(usuarios); 
    }
  
    // 3. READ: Obtener todos los usuarios (análogo a findAllPokemones)
    @GetMapping("/usuarios")
    public List<Usuarios> findAllUsuarios() {
        // CORRECCIÓN: Tu archivo incompleto tenía @PostMapping aquí. Se corrige a @GetMapping.
        return service.getUsuarios();
    }
  
    // 4. READ: Obtener un usuario por ID (análogo a pokemonByNumero/{numero})
    // Usa 'user_id' como clave, basado en tu UsuariosService.
    @GetMapping("/usuarioById/{user_id}")
    public Usuarios findUsuarioById(@PathVariable int user_id) {
        return service.getUsuariosById(user_id);
    }
  
    // 5. READ: Obtener un usuario por nombre (análogo a pokemon/{titulo})
    @GetMapping("/usuarioByNombre/{nombre}") 
    public Usuarios findUsuarioByNombre(@PathVariable String nombre) { 
        // Llama al método del servicio que usa 'primerNomnbre' del repositorio.
        return service.getUsuariosByPrimerNombre(nombre);
    }
       
    // 6. UPDATE: Actualizar un usuario existente (análogo a /update)
    @PutMapping("/updateUsuario")
    public Usuarios updateUsuario(@RequestBody Usuarios u) {
        return service.updateUsuarios(u);
    }
  
    // 7. DELETE: Eliminar un usuario por ID (análogo a /delete/{numero})
    // El método en tu servicio es 'deleUsuarios'.
    @DeleteMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable int id) {
        return service.deleUsuarios(id); 
    }
}