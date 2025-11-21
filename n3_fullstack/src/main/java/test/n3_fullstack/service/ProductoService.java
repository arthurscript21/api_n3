/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test.n3_fullstack.service;

import test.n3_fullstack.Entity.Producto;
import test.n3_fullstack.repository.ProductoRepository; // Asegúrate de que este repositorio exista
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Duoc
 */
@Service
public class ProductoService {
    
    @Autowired
    private ProductoRepository repository; // Se inyecta el repositorio

    // 1. CREATE: Guarda un solo producto
    public Producto saveProducto(Producto p){
        return repository.save(p);
    }

    // 2. CREATE: Guarda una lista de productos
    public List<Producto> saveProductos(List<Producto> productos){
        return repository.saveAll(productos);
    }

    // 3. READ: Obtiene todos los productos
    public List<Producto> getProductos(){
        return repository.findAll();
    }

    // 4. READ: Obtiene un producto por su ID (Producto_id)
    public Producto getProductoById(int id){
        // Usa el método findById de JpaRepository
        return repository.findById(id).orElse(null);
    }

    // 5. READ: Obtiene un producto por su nombre
    // Asume que ProductoRepository tiene el método findByNombreProducto(String nombre)
    public Producto getProductoByNombre(String nombre){
        return repository.findByNombreProducto(nombre);
    }

    // 6. DELETE: Elimina un producto por su ID
    public String deleteProducto(int id){
        repository.deleteById(id);
        return "Producto eliminado: " + id;
    }

    // 7. UPDATE: Actualiza los detalles de un producto
    public Producto updateProducto(Producto p){
        // 1. Busca el producto existente por su ID
        Producto existingProducto = repository.findById(p.getProducto_id()).orElse(null);
        
        if (existingProducto != null) {
            // 2. Actualiza los campos con los valores del objeto entrante (p)
            existingProducto.setNombreProducto(p.getNombreProducto());
            existingProducto.setPrecio(p.getPrecio());
            existingProducto.setDetalle(p.getDetalle());
            
            // 3. Guarda y retorna el producto actualizado
            return repository.save(existingProducto);
        }
        
        // Manejo de error: Producto no encontrado
        return null; 
    }
}