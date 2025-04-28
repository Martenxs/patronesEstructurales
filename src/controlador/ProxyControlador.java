package controlador;

import modelo.ProductoProxy;
import modelo.Usuario;

public class ProxyControlador {

    public String ejecutarProxy() {
        Usuario usuarioBajo = new Usuario("Juan", 1);
        Usuario usuarioAlto = new Usuario("Laura", 3);

        ProductoProxy productoProtegido = new ProductoProxy("Arepa Especial", "Arepa con queso, jamón y maíz", 2);

        String intento1 = productoProtegido.verDetalles(usuarioBajo);
        String intento2 = productoProtegido.verDetalles(usuarioAlto);

        return intento1 + "\n\n" + intento2;
    }
}
