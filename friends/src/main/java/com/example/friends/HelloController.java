package com.example.friends;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.List;

public class HelloController
{
    public TextField getNameText;
    public TextField getPhoneText;
    public TextField getAgeText;

    public ListView<Friend> friendsList = new ListView<>();

    public Label nameLabel;
    public Label phoneLabel;
    public Label ageLabel;

    public Friend selectedFriend;

    public void NewFriendClicked(ActionEvent actionEvent)
    {
        String name = getNameText.getText();
        long phone = Long.parseLong(getPhoneText.getText());
        int age = Integer.parseInt(getAgeText.getText());

        Friend temp = new Friend(name, phone, age);

        friendsList.getItems().add(temp);

        getNameText.clear();
        getPhoneText.clear();
        getAgeText.clear();
    }

    public void displayFriend(MouseEvent mouseEvent)
    {
        Friend temp;
        temp = friendsList.getSelectionModel().getSelectedItem();
        selectedFriend = friendsList.getSelectionModel().getSelectedItem();

        nameLabel.setText(temp.GetName());
        phoneLabel.setText(Long.toString(temp.GetPhone()));
        ageLabel.setText(Integer.toString(temp.GetAge()));
    }

    public void DeleteFriend(ActionEvent actionEvent)
    {
        friendsList.getItems().remove(selectedFriend);

        nameLabel.setText("");
        phoneLabel.setText("");
        ageLabel.setText("");
    }
}