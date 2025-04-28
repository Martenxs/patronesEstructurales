package controlador;

import modelo.ProductoFlyweight;

public class FlyweightControlador {

    public String ejecutarFlyweight() {
        ProductoFlyweight producto1 = new ProductoFlyweight("Arepa de queso", 3000, "ProveArepas", "contacto@arepas.com");
        ProductoFlyweight producto2 = new ProductoFlyweight("Arepa de choclo", 3500, "ProveArepas", "contacto@arepas.com");
        ProductoFlyweight producto3 = new ProductoFlyweight("Arepa con huevo", 4000, "ProveArepas", "contacto@arepas.com");

        return producto1.mostrarProducto() + "\n\n" +
                producto2.mostrarProducto() + "\n\n" +
                producto3.mostrarProducto();
    }
}
