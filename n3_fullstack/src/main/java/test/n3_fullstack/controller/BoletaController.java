/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.controller;
import test.n3_fullstack.Entity.Boleta;
import test.n3_fullstack.service.BoletaService;
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
public class BoletaController {

    @Autowired
    private BoletaService service;

    // 1. CREATE: Agregar una sola boleta (POST /addBoleta)
    @PostMapping("/addBoleta")
    public Boleta addBoleta(@RequestBody Boleta b) {
        return service.saveBoleta(b);
    }

    // 2. CREATE: Agregar una lista de boletas (POST /addBoletas)
    @PostMapping("/addBoletas")
    public List<Boleta> addBoletas(@RequestBody List<Boleta> boletas) {
        return service.saveBoletas(boletas);
    }

    // 3. READ: Obtener todas las boletas (GET /boletas)
    @GetMapping("/boletas")
    public List<Boleta> findAllBoletas() {
        return service.getBoletas();
    }

    // 4. READ: Obtener una boleta por ID (GET /boletaById/{id})
    @GetMapping("/boletaById/{id}")
    public Boleta findBoletaById(@PathVariable int id) {
        return service.getBoletaById(id);
    }

   
    @GetMapping("/boletaByUsuario/{usuario}")
    public Boleta findBoletaByUsuario(@PathVariable String usuario) {
        return service.getBoletaByUsuario(usuario);
    }

    // 6. UPDATE: Actualizar una boleta existente (PUT /updateBoleta)
    @PutMapping("/updateBoleta")
    public Boleta updateBoleta(@RequestBody Boleta b) {
        return service.updateBoleta(b);
    }

    // 7. DELETE: Eliminar una boleta por ID (DELETE /deleteBoleta/{id})
    @DeleteMapping("/deleteBoleta/{id}")
    public String deleteBoleta(@PathVariable int id) {
        return service.deleteBoleta(id);
    }
}
