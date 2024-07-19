package org.gerardocontreras.webapp.service;

import java.util.List;
import org.gerardocontreras.webapp.model.Producto;

public interface IProductoService {
    
    public List<Producto> listarProductos();
    
    public void agregarProducto();
    
    public void eliminarProducto(int productoId);
    
    public Producto buscarProductoPorId(int productoId);
    
    public void editarProducto(Producto producto);
}