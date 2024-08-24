module co.edu.unquindio.barberiaglamourfx.barberiaapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.mapstruct;


    opens co.edu.unquindio.barberiaglamourfx.barberiaapp to javafx.fxml;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController;
    opens co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController to java.fx.fxml;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.controller;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.dto;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.mappers;
    exports co.edu.unquindio.barberiaglamourfx.barberiaapp.model;
    opens co.edu.unquindio.barberiaglamourfx.barberiaapp.controller to javafx.fxml;


}