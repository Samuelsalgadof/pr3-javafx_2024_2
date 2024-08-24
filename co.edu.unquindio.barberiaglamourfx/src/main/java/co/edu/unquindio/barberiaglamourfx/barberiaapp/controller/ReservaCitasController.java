package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

public class ReservaCitasController {

    ModelFactoryController modelFactoryController;

    public ReservaCitasController(ModelFactoryController modelFactoryController) {
        System.out.println("Llamando al singleton desde EmpleadoServiceController");
        modelFactoryController = ModelFactoryController.getInstance();
    }
}

