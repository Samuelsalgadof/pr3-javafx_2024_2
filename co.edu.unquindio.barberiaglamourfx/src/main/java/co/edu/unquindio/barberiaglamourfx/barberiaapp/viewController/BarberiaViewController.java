package co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.BarberiaController;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.service.IBarberiaControllerService;
import javafx.fxml.FXML;

public class BarberiaViewController {
    IBarberiaControllerService bancoControllerService;

    @FXML
    void initialize() {
        bancoControllerService = new BarberiaController();
    }
}
