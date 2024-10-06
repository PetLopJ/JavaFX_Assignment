package com.example.javafx_assignment;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;


public class Controller {


    @FXML
    private AnchorPane AnchorPage;


    @FXML
    private Menu MenuHelp;
    @FXML
    private Menu MenuTheme;
    @FXML
    private Menu MenuEdit;
    @FXML
    private MenuItem MenuItemClose;
    @FXML
    private MenuItem MenuItemSave;
    @FXML
    private Menu MenuFile;
    @FXML
    private MenuItem MenuItemNew;
    @FXML
    private MenuBar MenuBar;
    @FXML
    private MenuItem MenuItemAbout;

    @FXML
    private Pane right;
    @FXML
    private Pane bottom;
    @FXML
    private Pane left;

    @FXML
    private TableView table;
    @FXML
    private TableColumn ID;
    @FXML
    private TableColumn Fname;
    @FXML
    private TableColumn Lname;
    @FXML
    private TableColumn Dep;
    @FXML
    private TableColumn Major;
    @FXML
    private TableColumn Email;

    @FXML
    private TextField text1;
    @FXML
    private TextField text2;
    @FXML
    private TextField text3;
    @FXML
    private TextField text4;
    @FXML
    private TextField text5;
    @FXML
    private TextField text6;

    @FXML
    private Button add;
    @FXML
    private Button clear;
    @FXML
    private Button delete;
    @FXML
    private Button edit;
}
