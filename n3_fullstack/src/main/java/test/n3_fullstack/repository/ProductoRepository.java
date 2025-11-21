package test.n3_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.n3_fullstack.Entity.Producto; // Importa la entidad Producto

/**
 * Repositorio para la entidad Producto.
 */
public interface ProductoRepository extends JpaRepository<Producto, Integer>{
    
    // Método personalizado para buscar un Producto por el campo 'nombreProducto' de la entidad.
    Producto findByNombreProducto(String nombre);
    
}