package controlador;

import modelo.ClienteFacade;

public class FacadeControlador {

    private ClienteFacade clienteFacade;

    public FacadeControlador() {
        this.clienteFacade = new ClienteFacade("Carlos Pérez", "carlos@example.com");
    }

    public String ejecutarFacade() {
        return clienteFacade.gestionarTodo();
    }
}


