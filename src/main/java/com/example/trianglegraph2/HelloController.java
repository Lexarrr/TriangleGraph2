package com.example.trianglegraph2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    TextField sideA;
    @FXML
    TextField sideB;
    @FXML
    TextField sideC;
    @FXML
    Label resArea;

    @FXML
    protected void onClickCalcArea() {

        Triangle triangle = new Triangle(Integer.parseInt(sideA.getText()),
                                         Integer.parseInt(sideB.getText()),
                                         Integer.parseInt(sideC.getText()));

        resArea.setText(String.valueOf(triangle.getArea()));
    }


}