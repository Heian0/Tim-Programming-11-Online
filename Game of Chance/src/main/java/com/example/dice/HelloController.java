package com.example.dice;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import java.io.File;
import java.util.Random;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HelloController
{
    @FXML
    public TextField currentMoneyText;
    public TextField currentBetText;
    public TextField diceScoreOneText;
    public TextField diceScoreTwoText;
    public Button higherButton;
    public Button lowerButton;
    public Button rollButton;
    public Button continueButton;
    public Button quitButton;

    public int rollCount = 0;
    public int diceScoreOne;
    public int diceScoreTwo;
    public String playerBet;
    public int currentMoney = 100;
    public int betMoney;

    public void RollDice(ActionEvent actionEvent)
    {
        if (rollCount == 0)
        {
            diceScoreOneText.setDisable(true);
            diceScoreTwoText.setDisable(true);
            currentMoneyText.setDisable(true);
            higherButton.setDisable(true);
            lowerButton.setDisable(true);
            rollButton.setDisable(true);
            continueButton.setDisable(true);

            quitButton.setDisable(false);
            currentBetText.setDisable(false);

            diceScoreOne = (int)Math.floor(Math.random()*(6)+1);
            diceScoreOneText.setText(String.valueOf(diceScoreOne));
            rollCount++;

            return;
        }

        if (rollCount == 1)
        {
            diceScoreTwo = (int)Math.floor(Math.random()*(6)+1);
            diceScoreTwoText.setText(String.valueOf(diceScoreTwo));
            rollCount = 0;

            if (
                    (diceScoreTwo > diceScoreOne && playerBet == "higher")
                    ||
                    (diceScoreOne > diceScoreTwo && playerBet == "lower")
                )
            {
                System.out.println("you win.");
                currentMoney = currentMoney + betMoney;
                currentMoneyText.setText("$" + String.valueOf(currentMoney));
            }

            else if (
                    (diceScoreTwo > diceScoreOne && playerBet == "lower")
                    ||
                    (diceScoreOne > diceScoreTwo && playerBet == "higher")
                )
            {
                System.out.println("you lose.");
                currentMoney = currentMoney - betMoney;
                currentMoneyText.setText("$" + String.valueOf(currentMoney));
            }

            else
            {
                System.out.println("you lose.");
                currentMoney = currentMoney - betMoney;
                currentMoneyText.setText("$" + String.valueOf(currentMoney));
            }

            diceScoreOneText.setDisable(true);
            diceScoreTwoText.setDisable(true);
            currentMoneyText.setDisable(true);
            currentBetText.setDisable(true);
            higherButton.setDisable(true);
            lowerButton.setDisable(true);
            rollButton.setDisable(true);
            continueButton.setDisable(false);
            quitButton.setDisable(false);

            return;
        }
    }

    public void setCurrentMoney(ActionEvent actionEvent) 
    {
        currentMoney = Integer.valueOf(currentMoneyText.getText());
    }

    public void setBetMoney(ActionEvent actionEvent)
    {
        diceScoreOneText.setDisable(true);
        diceScoreTwoText.setDisable(true);
        currentMoneyText.setDisable(true);
        higherButton.setDisable(false);
        lowerButton.setDisable(false);
        currentBetText.setDisable(true);

        betMoney = Integer.valueOf(currentBetText.getText());
        currentBetText.setText("$" + currentBetText.getText());

    }

    public void higherClicked(ActionEvent actionEvent)
    {
        diceScoreOneText.setDisable(true);
        diceScoreTwoText.setDisable(true);
        currentMoneyText.setDisable(true);

        playerBet = "higher";

        higherButton.setDisable(true);
        lowerButton.setDisable(true);
        rollButton.setDisable(false);
    }

    public void lowerClicked(ActionEvent actionEvent)
    {
        diceScoreOneText.setDisable(true);
        diceScoreTwoText.setDisable(true);
        currentMoneyText.setDisable(true);

        playerBet = "lower";

        higherButton.setDisable(true);
        lowerButton.setDisable(true);
        rollButton.setDisable(false);
    }

    public void quitClicked(ActionEvent actionEvent)
    {
        Stage diceStage = (Stage) quitButton.getScene().getWindow();
        diceStage.close();
    }

    public void continueClicked(ActionEvent actionEvent)
    {
        diceScoreOneText.setDisable(true);
        diceScoreTwoText.setDisable(true);
        currentMoneyText.setDisable(true);
        currentBetText.setDisable(true);
        higherButton.setDisable(true);
        lowerButton.setDisable(true);
        continueButton.setDisable(true);

        quitButton.setDisable(false);
        rollButton.setDisable(false);

        diceScoreOneText.setText(null);
        diceScoreTwoText.setText(null);
        currentBetText.setText(null);
    }
}