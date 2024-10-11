package com.clubnautico.elbigua.controller;

import com.clubnautico.elbigua.model.User;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class UserController {

    @FXML private TextField userNumberField;
    @FXML private TextField nameField;
    @FXML private TextField lastnameField;
    @FXML private TextField dniField;
    @FXML private TextField phoneField;
    @FXML private TextField emergencyContactField;
    @FXML private TextField nauticalLicenseField;
    @FXML private DatePicker expirationDatePicker;
    @FXML private TextArea observationsArea;
    @FXML private TableView<User> userTable;

    private ObservableList<User> userList = FXCollections.observableArrayList();

    @FXML
    private void initialize() {
        // Initialize the user table
        userTable.setItems(userList);
    }

    @FXML
    private void handleAddUser() {
        User newUser = new User();
        newUser.setUserNumber(userNumberField.getText());
        newUser.setName(nameField.getText());
        newUser.setLastname(lastnameField.getText());
        newUser.setDni(dniField.getText());
        newUser.setPhone(phoneField.getText());
        newUser.setEmergencyContact(emergencyContactField.getText());
        newUser.setNauticalLicense(nauticalLicenseField.getText());
        newUser.setExpiration(expirationDatePicker.getValue() != null ? java.sql.Date.valueOf(expirationDatePicker.getValue()) : null);
        newUser.setObservations(observationsArea.getText());

        // TODO: Add validation logic here

        userList.add(newUser);
        clearFields();
    }

    private void clearFields() {
        userNumberField.clear();
        nameField.clear();
        lastnameField.clear();
        dniField.clear();
        phoneField.clear();
        emergencyContactField.clear();
        nauticalLicenseField.clear();
        expirationDatePicker.setValue(null);
        observationsArea.clear();
    }

    // TODO: Add methods for editing and deleting users
}