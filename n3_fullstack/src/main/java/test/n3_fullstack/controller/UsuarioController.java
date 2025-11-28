package test.n3_fullstack.controller;

import test.n3_fullstack.Entity.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException; // Importar la clase de excepción
import org.springframework.http.HttpStatus; // Importar para códigos de estado
import org.springframework.http.ResponseEntity; // Importar para construir respuestas
import org.springframework.web.bind.annotation.*;
import test.n3_fullstack.service.UsuariosService;

/**
 * Controlador REST para la entidad Usuarios.
 */
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class UsuarioController {
    
    @Autowired
    private UsuariosService service;
 
    // 1. CREATE: Agregar un solo usuario (Endpoint de Registro)
    @PostMapping("/addUsuario")
    public ResponseEntity<?> addUsuarios(@RequestBody Usuarios u) { 
        System.out.println("Intentando registrar usuario: " + u.getCorreo());
        try {
            Usuarios savedUser = service.saveUsuarios(u);
            // Retorna 201 Created si es exitoso
            return new ResponseEntity<>(savedUser, HttpStatus.CREATED); 
        } catch (DataIntegrityViolationException e) {
            // ❌ CORRECCIÓN CLAVE: Atrapa la excepción de la DB 
            
            // Loguea el error en la consola de Java para el desarrollador
            e.printStackTrace(); 
            
            // Retorna 409 Conflict (El frontend lo detectará como !response.ok)
            return new ResponseEntity<>("El correo ya está registrado o faltan datos obligatorios.", HttpStatus.CONFLICT); 
            
        } catch (Exception e) {
            // Maneja otros errores inesperados (ej: NPEs en el servicio)
            e.printStackTrace();
            return new ResponseEntity<>("Error interno inesperado: " + e.getMessage(), 
                                        HttpStatus.INTERNAL_SERVER_ERROR); // 500
        }
    }
 
    // 2. CREATE: Agregar una lista de usuarios (análogo a addPokemones)
    @PostMapping("/addUsuarios")
    public List<Usuarios> addUsuariosList(@RequestBody List<Usuarios> usuarios) {
        return service.saveUsuarios(usuarios); 
    }
 
    // 3. READ: Obtener todos los usuarios (análogo a findAllPokemones)
    @GetMapping("/usuarios")
    public List<Usuarios> findAllUsuarios() {
        return service.getUsuarios();
    }
 
    // 4. READ: Obtener un usuario por ID (análogo a pokemonByNumero/{numero})
    @GetMapping("/usuarioById/{user_id}")
    public Usuarios findUsuarioById(@PathVariable int user_id) {
        return service.getUsuariosById(user_id);
    }
 
    // 5. READ: Obtener un usuario por nombre (análogo a pokemon/{titulo})
    @GetMapping("/usuarioByNombre/{nombre}") 
    public Usuarios findUsuarioByNombre(@PathVariable String nombre) { 
        return service.getUsuariosByPrimerNombre(nombre);
    }
        
    // 6. UPDATE: Actualizar un usuario existente (análogo a /update)
    @PutMapping("/updateUsuario")
    public Usuarios updateUsuario(@RequestBody Usuarios u) {
        return service.updateUsuarios(u);
    }
 
    // 7. DELETE: Eliminar un usuario por ID (análogo a /delete/{numero})
    @DeleteMapping("/deleteUsuario/{id}")
    public String deleteUsuario(@PathVariable int id) {
        return service.deleUsuarios(id); 
    }
}