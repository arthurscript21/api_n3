/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.controller;
import test.n3_fullstack.Entity.Producto; 
import test.n3_fullstack.service.ProductoService; 
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
/**
 *
 * @author Duoc
 */
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class ProductoController {
    @Autowired
    private ProductoService service;
  
    // Endpoint para agregar un solo producto (POST /addProduct)
    @PostMapping("/addProduct")
    public Producto addProducto(@RequestBody Producto producto) {
        // Llama al método para guardar un solo producto en el servicio
        System.out.println(producto);
        return service.saveProducto(producto);
    }
  
    // Endpoint para agregar una lista de productos (POST /addProducts)
    @PostMapping("/addProducts")
    public List<Producto> addProductos(@RequestBody List<Producto> productos) {
        // Llama al método para guardar una lista de productos en el servicio
        return service.saveProductos(productos);
    }
  
    // Endpoint para obtener todos los productos (GET /productos)
    @GetMapping("/productos")
    public List<Producto> findAllProductos() {
        // Llama al método para obtener todos los productos del servicio
        return service.getProductos();
    }
  
    // Endpoint para obtener un producto por su ID (GET /productoById/{id})
    @GetMapping("/productoById/{id}")
    public Producto findProductoById(@PathVariable int id) {
        // Llama al método para obtener un producto por su ID en el servicio
        return service.getProductoById(id);
    }
  
    // Endpoint para obtener un producto por su nombre (GET /producto/{nombre})
    @GetMapping("/producto/{nombre}") 
    public Producto findProductoByNombre(@PathVariable String nombre) { 
        // Llama al método para obtener un producto por su nombre en el servicio
        return service.getProductoByNombre(nombre);
    }
       
    // Endpoint para actualizar un producto existente (PUT /updateProduct)
    @PutMapping("/updateProduct")
    public Producto updateProducto(@RequestBody Producto producto) {
        // Llama al método para actualizar un producto en el servicio
        return service.updateProducto(producto);
    }
  
    // Endpoint para eliminar un producto por su ID (DELETE /deleteProduct/{id})
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProducto(@PathVariable int id) {
        // Llama al método para eliminar un producto por su ID en el servicio
        return service.deleteProducto(id);
    }
}
