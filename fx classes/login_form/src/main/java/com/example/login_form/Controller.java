package com.example.login_form;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Controller {
    @FXML
    private TextField userId;

    @FXML
    private PasswordField password;

    @FXML
    private Button submit;

    @FXML
    private TextField ageField;

    @FXML
    private MenuButton gender;
    int age;
    public void login(ActionEvent e){
        String name=userId.getText();

        try {
            int age= Integer.parseInt(ageField.getText());
        }catch (java.lang.NumberFormatException exp){
            ageField.setPromptText("it must be a number");
        }catch (Exception exp){
            System.out.println(exp);
        }

        try {
            int pass = Integer.parseInt(password.getText());
            System.out.println(name+" "+pass+" "+age);
        }catch(java.lang.NumberFormatException exp){
            password.clear();
            password.setPromptText("Please give a number no letters or signs allowed");
        }catch (java.lang.ClassCastException exp){
            System.out.println("nothing all good");
        }

        catch (Exception exp){
            System.out.println(exp);
        }


    }


}