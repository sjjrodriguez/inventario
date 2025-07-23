import dao.ProductoDAO;
import model.Producto;

import java.util.List;

public class main {
    public static void main(String[] args) {
        ProductoDAO productoDAO = new ProductoDAO();

        // Crear nuevo producto
        Producto nuevoProducto = new Producto();
        nuevoProducto.setNombre("Teclado");
        nuevoProducto.setPrecio(99.99);
        nuevoProducto.setCantidad(10);

        productoDAO.guardar(nuevoProducto);
        System.out.println("✅ Producto guardado");

        // Listar todos los productos
        List<Producto> productos = productoDAO.listarTodos();
        System.out.println("📦 Lista de productos:");
        for (Producto p : productos) {
            System.out.println(p.getId() + " - " + p.getNombre() + " - $" + p.getPrecio());
        }

        // Buscar por ID
        Long idBuscar = nuevoProducto.getId();
        Producto encontrado = productoDAO.buscarPorId(idBuscar);
        if (encontrado != null) {
            System.out.println("🔍 Producto encontrado: " + encontrado.getNombre());
        }

        // Actualizar producto
        encontrado.setCantidad(20);
        productoDAO.actualizar(encontrado);
        System.out.println("🔄 Producto actualizado");

        // Eliminar producto
        productoDAO.eliminar(encontrado.getId());
        System.out.println("🗑️ Producto eliminado");
    }
}
