/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.controller;

import test.n3_fullstack.Entity.Detalle;
import test.n3_fullstack.service.DetalleService;
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
public class DetalleController {

    @Autowired
    private DetalleService service;

    // 1. CREATE: Agregar un solo detalle (POST /addDetalle)
    @PostMapping("/addDetalle")
    public Detalle addDetalle(@RequestBody Detalle d) {
        return service.saveDetalle(d);
    }

    // 2. CREATE: Agregar una lista de detalles (POST /addDetalles)
    @PostMapping("/addDetalles")
    public List<Detalle> addDetalles(@RequestBody List<Detalle> detalles) {
        return service.saveDetalles(detalles);
    }

    // 3. READ: Obtener todos los detalles (GET /detalles)
    @GetMapping("/detalles")
    public List<Detalle> findAllDetalles() {
        return service.getDetalles();
    }

    // 4. READ: Obtener un detalle por ID (GET /detalleById/{id})
    @GetMapping("/detalleById/{id}")
    public Detalle findDetalleById(@PathVariable int id) {
        return service.getDetalleById(id);
    }

    // 5. UPDATE: Actualizar un detalle existente (PUT /updateDetalle)
    @PutMapping("/updateDetalle")
    public Detalle updateDetalle(@RequestBody Detalle d) {
        return service.updateDetalle(d);
    }

    // 6. DELETE: Eliminar un detalle por ID (DELETE /deleteDetalle/{id})
    @DeleteMapping("/deleteDetalle/{id}")
    public String deleteDetalle(@PathVariable int id) {
        return service.deleteDetalle(id);
    }
}
