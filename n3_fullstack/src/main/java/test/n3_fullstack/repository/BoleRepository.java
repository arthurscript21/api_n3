package test.n3_fullstack.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import test.n3_fullstack.Entity.Boleta; // Asume que la entidad Boleto está en este paquete

/**
 * Repositorio para la entidad Boleto.
 */
public interface BoleRepository extends JpaRepository<Boleta, Integer> {
    
    // Método para buscar un Boleto por un código (ej. un número de ticket o código de reserva).
    // Debes asegurarte de que la entidad Boleto tenga un campo llamado 'codigo'.
    public Boleta findByUsuario_NombreCompleto(String nombre);
    
}