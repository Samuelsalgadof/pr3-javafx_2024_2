package co.edu.unquindio.barberiaglamourfx.barberiaapp.viewController;

import co.edu.unquindio.barberiaglamourfx.barberiaapp.controller.ReservaCitasController;
import co.edu.unquindio.barberiaglamourfx.barberiaapp.mapping.dto.ReservaDto;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


import java.util.Optional;

public class ReservaViewController {

        ReservaCitasController reservaController;
        ObservableList<ReservaDto> listaReservaDto = FXCollections.observableArrayList();
        ReservaDto reservaSeleccionado;

        @FXML
        private Button btnActualizarReserva;

        @FXML
        private Button btnCrearReserva;

        @FXML
        private Button btnEliminarReserva;

        @FXML
        private Button btnLimpiarReserva;

        @FXML
        private TableView<ReservaDto> tablaReservas;

        @FXML
        private TableColumn<ReservaDto, String> tcPrecio;

        @FXML
        private TableColumn<ReservaDto, String> tcbarbero;

        @FXML
        private TableColumn<ReservaDto, String> tcfecha;

        @FXML
        private TableColumn<ReservaDto, String> tcidReserva;

        @FXML
        private TableColumn<ReservaDto, String> tcnombreCliente;

        @FXML
        private TextField txtbarbero;

        @FXML
        private TextField txtfechaReserva;

        @FXML
        private TextField txtidReserva;

        @FXML
        private TextField txtnombreCliente;

        @FXML
        private TextField txtprecioReserva;


         @FXML
         void initialize() {
             reservaController = new ReservaCitasController();
             initTableReservas();
        }


         private void initTableReservas() {
             initDataBindingReservas();
             obtenerReserva();
             tablaReservas.getItems().clear();
             tablaReservas.setItems(listaReservaDto);
             listenerSelectionReserva();

        }

    private void initDataBindingReservas() {
        tcidReserva.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().idReserva()));
        tcnombreCliente.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().nombreCliente()));
        tcPrecio.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().precio()));
        tcbarbero.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().empleadoBarbero()));
        tcfecha.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().fecha()));
    }

    private void listenerSelectionReserva() {
             tablaReservas.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            reservaSeleccionado = newSelection;
            mostrarInformacionReserva(reservaSeleccionado);
        });
    }

    private void mostrarInformacionReserva(ReservaDto reservaSeleccionado) {
        if(reservaSeleccionado != null){

            txtidReserva.setText(reservaSeleccionado.idReserva());
            txtnombreCliente.setText(reservaSeleccionado.nombreCliente());
            txtprecioReserva.setText(reservaSeleccionado.precio());
            txtbarbero.setText(reservaSeleccionado.empleadoBarbero());
            txtfechaReserva.setText(reservaSeleccionado.fecha());

        }
    }

    private void obtenerReserva() {
        listaReservaDto.addAll(reservaController.obtenerReservas());
     }

     @FXML
        void onActualizarReserva(ActionEvent event) {

         boolean reservaActualizada = false;
         //1. Capturar los datos
         String idReserva = reservaSeleccionado.idReserva();
         ReservaDto reservaDto = construirDatosReserva();
         //2. verificar el empleado seleccionado
         if(reservaSeleccionado != null){
             //3. Validar la información
             if(datosValidos(reservaSeleccionado)){
                 reservaActualizada = reservaController.actualizarReserva(idReserva,reservaDto);
                 if(reservaActualizada){
                     listaReservaDto.remove(reservaSeleccionado);
                     listaReservaDto.add(reservaDto);
                     tablaReservas.refresh();
                     mostrarMensaje("Notificación reserva", "reserva actualizada", "La reserva se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                     limpiarCamposReservas();
                 }else{
                     mostrarMensaje("Notificación reserva", "reserva no actualizada", "La reserva no se ha actualizado con éxito", Alert.AlertType.INFORMATION);
                 }
             }else{
                 mostrarMensaje("Notificación reserva", "reserva no creada", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
             }

         }

        }

    private void limpiarCamposReservas() {
        txtidReserva.setText("");
        txtnombreCliente.setText("");
        txtprecioReserva.setText("");
        txtbarbero.setText("");
        txtfechaReserva.setText("");
    }

    private boolean datosValidos(ReservaDto reservaDto) {

        String mensaje = "";

        if(reservaDto.idReserva() == null || reservaDto.idReserva().equals(""))
         mensaje += "El ID es invalido \n" ;
        if(reservaDto.nombreCliente() == null || reservaDto.nombreCliente() .equals(""))
         mensaje += "El ID es invalido \n" ;
        if(reservaDto.precio() == null || reservaDto.precio().equals(""))
         mensaje += "La fecha es invalida \n" ;
        if(reservaDto.empleadoBarbero() == null || reservaDto.empleadoBarbero().equals(""))
         mensaje += "La cancha es invalida \n" ;
        if(reservaDto.precio() == null || reservaDto.precio().equals(""))
            mensaje += "El precio es invalido \n" ;
        if(mensaje.equals("")){
            return true;
        }else{
            mostrarMensaje("Notificación Reserva","Datos invalidos",mensaje, Alert.AlertType.WARNING);
            return false;
        }
    }

    private void mostrarMensaje(String titulo, String header, String contenido, Alert.AlertType alertType) {
        Alert aler = new Alert(alertType);
        aler.setTitle(titulo);
        aler.setHeaderText(header);
        aler.setContentText(contenido);
        aler.showAndWait();
    }

    private ReservaDto construirDatosReserva() {
        return new ReservaDto(
                txtidReserva.getText(),
                txtnombreCliente.getText(),
                txtprecioReserva.getText(),
                txtbarbero.getText(),
                txtfechaReserva.getText()
        );
    }

    @FXML
        void onCrearReserva(ActionEvent event) {

        //1. Capturar los datos
        ReservaDto reservaDto = construirDatosReserva();
        //2. Validar la información
        if(datosValidos(reservaDto)){
            if(reservaController.agregarReserva(reservaDto)){
                listaReservaDto.add(reservaDto);
                mostrarMensaje("Notificación reserva", "reserva creada", "La Reserva se ha creado con éxito", Alert.AlertType.INFORMATION);
                limpiarCamposReservas();
            }else{
                mostrarMensaje("Notificación reserva", "reserva no creada", "La Reserva no se ha creado con éxito", Alert.AlertType.ERROR);
            }
        }else{
            mostrarMensaje("Notificación reserva", "reserva no creada", "Los datos ingresados son invalidos", Alert.AlertType.ERROR);
        }

        }

        @FXML
        void onEliminarReserva(ActionEvent event) {

            boolean empleadoEliminado = false;
            if(reservaSeleccionado != null){
                if(mostrarMensajeConfirmacion("¿Estas seguro de elmininar La Reserva?")){
                    empleadoEliminado = reservaController.eliminarReserva(reservaSeleccionado.idReserva());
                    if(empleadoEliminado){
                        listaReservaDto.remove(reservaSeleccionado);
                        reservaSeleccionado = null;
                        tablaReservas.getSelectionModel().clearSelection();
                        limpiarCamposReservas();
                        mostrarMensaje("Notificación Reserva", "Reserva eliminada", "La Reserva se ha eliminado con éxito", Alert.AlertType.INFORMATION);
                    }else{
                        mostrarMensaje("Notificación Reserva", "Reserva no eliminada", "La Reserva no se puede eliminar", Alert.AlertType.ERROR);
                    }
                }
            }else{
                mostrarMensaje("Notificación empleado", "Empleado no seleccionado", "Seleccionado una reserva de la lista", Alert.AlertType.WARNING);
            }




        }

    private boolean mostrarMensajeConfirmacion(String mensaje) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmación");
        alert.setContentText(mensaje);
        Optional<ButtonType> action = alert.showAndWait();
        if (action.get() == ButtonType.OK) {
            return true;
        } else {
            return false;
        }
    }

    @FXML
        void onLimpiarReserva(ActionEvent event) {

        txtidReserva.setText("");
        txtnombreCliente.setText("");
        txtprecioReserva.setText("");
        txtbarbero.setText("");
        txtfechaReserva.setText("");

        }



}
