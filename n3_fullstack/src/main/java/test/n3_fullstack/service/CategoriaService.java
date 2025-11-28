/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.service;
import test.n3_fullstack.Entity.Categoria;
import test.n3_fullstack.repository.CateRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Duoc
 */
@Service
public class CategoriaService {
    @Autowired
    private CateRepository repository;

    // 1. CREATE: Guarda una sola categoría
    public Categoria saveCategoria(Categoria c) {
        return repository.save(c);
    }

    // 2. CREATE: Guarda una lista de categorías
    public List<Categoria> saveCategorias(List<Categoria> categorias) {
        return repository.saveAll(categorias);
    }

    // 3. READ: Obtiene todas las categorías
    public List<Categoria> getCategorias() {
        return repository.findAll();
    }

    // 4. READ: Obtiene una categoría por su ID (categoria_id)
    public Categoria getCategoriaById(int id) {
        return repository.findById(id).orElse(null);
    }

    // 5. READ: Obtiene una categoría por su nombre
    // Utiliza el método 'nombreCategoria' definido en el repositorio
    public Categoria getCategoriaByNombre(String nombre) {
        return repository.findByNombreCategoria(nombre);
    }

    // 6. DELETE: Elimina una categoría por su ID
    public String deleteCategoria(int id) {
        repository.deleteById(id);
        return "Categoría eliminada: " + id;
    }

    // 7. UPDATE: Actualiza los detalles de una categoría
    public Categoria updateCategoria(Categoria c) {
        Categoria existingCategoria = repository.findById(c.getCategoria_id()).orElse(null);

        if (existingCategoria != null) {
            existingCategoria.setNombreCategoria(c.getNombreCategoria());
            return repository.save(existingCategoria);
        }
        return null;
    }
}
