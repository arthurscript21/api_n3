package test.n3_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.n3_fullstack.Entity.Categoria; // Asume que la entidad Categoria está en este paquete

/**
 * Repositorio para la entidad Categoria.
 */
public interface CateRepository extends JpaRepository<Categoria, Integer> {
    
    // Método para buscar una Categoria por su nombre.
    // Spring Data JPA implementará automáticamente la consulta.
    public Categoria findByNombreCategoria(String findByNombreCategoria);
    
}