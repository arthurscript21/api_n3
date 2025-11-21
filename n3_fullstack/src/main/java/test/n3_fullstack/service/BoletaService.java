/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.service;
import test.n3_fullstack.Entity.Boleta;
import test.n3_fullstack.repository.BoleRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Duoc
 */
@Service
public class BoletaService {
    @Autowired
    private BoleRepository repository;

    // 1. CREATE: Guarda una sola boleta
    public Boleta saveBoleta(Boleta b) {
        return repository.save(b);
    }

    // 2. CREATE: Guarda una lista de boletas
    public List<Boleta> saveBoletas(List<Boleta> boletas) {
        return repository.saveAll(boletas);
    }

    // 3. READ: Obtiene todas las boletas
    public List<Boleta> getBoletas() {
        return repository.findAll();
    }

    // 4. READ: Obtiene una boleta por su ID (boleta_id)
    public Boleta getBoletaById(int id) {
        return repository.findById(id).orElse(null);
    }

    // 5. READ: Obtiene una boleta por el nombre de usuario
    // Utiliza el método 'usuarioboleta' definido en el repositorio
    public Boleta getBoletaByUsuario(String usuario) {
        return repository.findByUsuarioNombreCompleto(usuario);
    }

    // 6. DELETE: Elimina una boleta por su ID
    public String deleteBoleta(int id) {
        repository.deleteById(id);
        return "Boleta eliminada: " + id;
    }

    // 7. UPDATE: Actualiza los detalles de una boleta
    public Boleta updateBoleta(Boleta b) {
        // 1. Busca la boleta existente por su ID
        Boleta existingBoleta = repository.findById(b.getBoleta_id()).orElse(null);

        if (existingBoleta != null) {
            // 2. Actualiza los campos
            existingBoleta.setTotalboleta(b.getTotalboleta());

            // 3. Guarda y retorna la boleta actualizada
            return repository.save(existingBoleta);
        }
        return null;
    }
}
