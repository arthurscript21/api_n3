package test.n3_fullstack.service;

import test.n3_fullstack.Entity.Detalle;
import test.n3_fullstack.repository.DetalleRepository; // 👈 Importante: La clase del repositorio
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetalleService {

    @Autowired
    private DetalleRepository repository; // 👈 Asegúrate de que el nombre del repositorio sea correcto

    // 1. CREATE: Guarda un solo detalle
    public Detalle saveDetalle(Detalle d) {
        return repository.save(d);
    }

    // 2. CREATE: Guarda una lista de detalles
    public List<Detalle> saveDetalles(List<Detalle> detalles) {
        return repository.saveAll(detalles);
    }

    // 3. READ: Obtiene todos los detalles
    public List<Detalle> getDetalles() {
        return repository.findAll();
    }

    // 4. READ: Obtiene un detalle por su ID
    public Detalle getDetalleById(int id) {
        return repository.findById(id).orElse(null);
    }

    // 5. DELETE: Elimina un detalle por su ID
    public String deleteDetalle(int id) {
        repository.deleteById(id);
        return "Detalle eliminado: " + id;
    }

    // 6. UPDATE: Actualiza los detalles de una línea de boleta
    public Detalle updateDetalle(Detalle d) {
        Detalle existingDetalle = repository.findById(d.getDetalle_id()).orElse(null);

        if (existingDetalle != null) {
            existingDetalle.setCantidad(d.getCantidad());
            existingDetalle.setTotal(d.getTotal());
            
            // Se asume que el objeto 'd' trae los objetos Producto y Boleta
            /*existingDetalle.setBoleta(d.getBoleta()); */
            existingDetalle.setDetalle_id(d.getDetalle_id());
            
            return repository.save(existingDetalle);
        }
        return null;
    }
}