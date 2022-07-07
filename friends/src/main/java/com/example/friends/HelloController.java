package com.example.friends;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.io.*;
import java.util.ArrayList;
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
    public ChoiceBox saveToChoice;
    public ChoiceBox loadFromChoice;

    ObservableList<String> fileList = FXCollections.observableArrayList("schoolFriends.txt", "workFriends.txt");

    @FXML
    public void initialize()
    {
        saveToChoice.setValue("schoolFriends.txt");
        saveToChoice.setItems(fileList);
        loadFromChoice.setValue("schoolFriends.txt");
        loadFromChoice.setItems(fileList);
    }

    public void SaveFriends(ActionEvent actionEvent) throws IOException {

        FileWriter fw = new FileWriter("src/" + saveToChoice.getValue(), true);
        BufferedWriter bw = new BufferedWriter(fw);

        ObservableList<Friend> list = friendsList.getItems();
        for (int i=0; i<list.size(); i++)
        {
            String friendStr = list.get(i).GetName() + " " + String.valueOf(list.get(i).GetPhone()) + " " + String.valueOf(list.get(i).GetAge());
            bw.write("\n" + friendStr);
            System.out.println(friendStr);
        }
        bw.close();
    }

    public void LoadFriends(ActionEvent actionEvent) throws IOException {
        FileInputStream fstream = new FileInputStream("src/" + loadFromChoice.getValue());
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line;
        while ((line = br.readLine()) != null)
        {
            String[] split = line.split(" ");


            Friend temp = new Friend( split[0], Long.parseLong(split[1]), Integer.parseInt(split[2]) );

            friendsList.getItems().add(temp);

            getNameText.clear();
            getPhoneText.clear();
            getAgeText.clear();
        }

    }

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