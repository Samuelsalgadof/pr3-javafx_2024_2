package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IBarberiaControllerService;

public class BarberiaController implements IBarberiaControllerService{

    ModelFactoryController modelFactoryController;

    public BarberiaController() {
        System.out.println("Llamando al singleton desde BarberiaServiceController");
        modelFactoryController = ModelFactoryController.getInstance();
    }
}