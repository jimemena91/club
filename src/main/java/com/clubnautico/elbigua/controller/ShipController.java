package com.clubnautico.elbigua.controller;

import com.clubnautico.elbigua.model.Ship;
import com.clubnautico.elbigua.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.time.LocalDate;

public class ShipController {

    @FXML private TextField registrationNumberField;
    @FXML private DatePicker dueDatePicker;
    @FXML private TextField typeField;
    @FXML private TextField colorField;
    @FXML private TextField capacityField;
    @FXML private TextField brandField;
    @FXML private TextField hpField;
    @FXML private TextField fantasyNameField;
    @FXML private TextField insurerField;
    @FXML private DatePicker dueDateInsurancePicker;
    @FXML private TextArea infoArea;
    @FXML private ComboBox<User> userComboBox;
    @FXML private TableView<Ship> shipTable;

    private ObservableList<Ship> shipList = FXCollections.observableArrayList();
    private ObservableList<User> userList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        shipTable.setItems(shipList);
        userComboBox.setItems(userList);
        
        // TODO: Load users from database
    }

    @FXML
    private void handleAddShip() {
        Ship newShip = new Ship();
        newShip.setRegistrationNumber(registrationNumberField.getText());
        newShip.setDueDate(java.sql.Date.valueOf(dueDatePicker.getValue()));
        newShip.setType(typeField.getText());
        newShip.setColor(colorField.getText());
        newShip.setCapacity(Integer.parseInt(capacityField.getText()));
        newShip.setBrand(brandField.getText());
        newShip.setHp(hpField.getText().isEmpty() ? null : Integer.parseInt(hpField.getText()));
        newShip.setFantasyName(fantasyNameField.getText());
        newShip.setInsurer(insurerField.getText());
        newShip.setDueDateInsurance(java.sql.Date.valueOf(dueDateInsurancePicker.getValue()));
        newShip.setInfo(infoArea.getText());
        newShip.setUser(userComboBox.getValue());

        // TODO: Add validation logic here

        shipList.add(newShip);
        clearFields();
    }

    private void clearFields() {
        registrationNumberField.clear();
        dueDatePicker.setValue(null);
        typeField.clear();
        colorField.clear();
        capacityField.clear();
        brandField.clear();
        hpField.clear();
        fantasyNameField.clear();
        insurerField.clear();
        dueDateInsurancePicker.setValue(null);
        infoArea.clear();
        userComboBox.getSelectionModel().clearSelection();
    }

    // TODO: Add methods for editing and deleting ships
}