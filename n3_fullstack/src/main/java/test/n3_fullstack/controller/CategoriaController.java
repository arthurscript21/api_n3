/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.controller;

import test.n3_fullstack.Entity.Categoria;
import test.n3_fullstack.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Duoc
 */
@RestController
public class CategoriaController {
    @Autowired
    private CategoriaService service;

    // 1. CREATE: Agregar una sola categoría (POST /addCategoria)
    @PostMapping("/addCategoria")
    public Categoria addCategoria(@RequestBody Categoria c) {
        return service.saveCategoria(c);
    }

    // 2. CREATE: Agregar una lista de categorías (POST /addCategorias)
    @PostMapping("/addCategorias")
    public List<Categoria> addCategorias(@RequestBody List<Categoria> categorias) {
        return service.saveCategorias(categorias);
    }

    // 3. READ: Obtener todas las categorías (GET /categorias)
    @GetMapping("/categorias")
    public List<Categoria> findAllCategorias() {
        return service.getCategorias();
    }

    // 4. READ: Obtener una categoría por ID (GET /categoriaById/{id})
    @GetMapping("/categoriaById/{id}")
    public Categoria findCategoriaById(@PathVariable int id) {
        return service.getCategoriaById(id);
    }

    // 5. READ: Obtener una categoría por nombre (GET /categoriaByNombre/{nombre})
    @GetMapping("/categoriaByNombre/{nombre}")
    public Categoria findCategoriaByNombre(@PathVariable String nombre) {
        return service.getCategoriaByNombre(nombre);
    }

    // 6. UPDATE: Actualizar una categoría existente (PUT /updateCategoria)
    @PutMapping("/updateCategoria")
    public Categoria updateCategoria(@RequestBody Categoria c) {
        return service.updateCategoria(c);
    }

    // 7. DELETE: Eliminar una categoría por ID (DELETE /deleteCategoria/{id})
    @DeleteMapping("/deleteCategoria/{id}")
    public String deleteCategoria(@PathVariable int id) {
        return service.deleteCategoria(id);
    }
}
