package co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IClienteControllerService;


public class ClienteController implements IClienteControllerService {

    ModelFactoryController modelFactoryController;

    public ClienteController(){
        System.out.println("Llamando al singleton desde BancoServiceController");
        modelFactoryController = ModelFactoryController.getinstance();
    }
}
