package application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {

	@FXML
	private TextField searchField;

	@FXML
	private Button faceBookButton;

	@FXML
	private Button twitterButton;

	@FXML
	private Button instagramButton;

	@FXML
	private Button settingsButton;

	// Profile Radio Buttons
	@FXML
	private RadioButton profile1Button;

	@FXML
	private RadioButton profile2Button;

	@FXML
	private RadioButton profile3Button;

	@FXML
	private RadioButton profile4Button;

	@FXML
	private RadioButton profile5Button;

	@FXML
	private RadioButton profile6Button;

	@FXML
	private RadioButton profile7Button;

	@FXML
	private RadioButton profile8Button;

	@FXML
	private RadioButton profile9Button;

	@FXML
	private RadioButton profile10Button;

	// Profile Button name
	@FXML
	private Text profile1Name;

	@FXML
	private Text profile2Name;

	@FXML
	private Text profile3Name;

	@FXML
	private Text profile4Name;

	@FXML
	private Text profile5Name;

	@FXML
	private Text profile6Name;

	@FXML
	private Text profile7Name;

	@FXML
	private Text profile8Name;

	@FXML
	private Text profile9Name;

	@FXML
	private Text profile10Name;
	
	//contains profile urls
	@FXML
	private GridPane profile1Data;

	@FXML
	private GridPane profile2Data;

	@FXML
	private GridPane profile3Data;

	@FXML
	private GridPane profile4Data;

	@FXML
	private GridPane profile5Data;

	@FXML
	private GridPane profile6Data;

	@FXML
	private GridPane profile7Data;

	@FXML
	private GridPane profile8Data;

	@FXML
	private GridPane profile9Data;
	@FXML
	
	private GridPane profile10Data;

	@FXML
	private VBox displayBox;
	
	@FXML
	private ScrollPane scroller;

	public Controller() {
		// table = new DataTable();

	}
	
	public void initialize() {
		scroller.setFitToWidth(true);
		
	}

	@FXML
	private void showField() {
		setResultsArea();
		
	}

	@FXML
	private void buttonClicked(ActionEvent e) {
		if (e.getSource() == faceBookButton) {
			System.out.println("Switching to facebook searching");
		} else if (e.getSource() == twitterButton) {
			System.out.println("Switching to twitter searching");
		} else if (e.getSource() == instagramButton) {
			System.out.println("Switching to instagram searching");
		}
	}

	@FXML
	private void settingsButtonClicked(ActionEvent e) {
		//System.out.println(profile1Name.getText());
		DataTable table = new DataTable("savedprofiles.txt");
		
		// load data
		
		// save new data
		// update Profile changes

	}


	private void setResultsArea() {
		Profile ay = new Profile(searchField.getText(),"description of this person", "/resources/fb-art.png");
		
		displayBox.getChildren().addAll(ay.getPane());
	}

	public Text[] getProfileNames() {
		Text[] rtn = { profile1Name, profile2Name, profile3Name, profile4Name, profile5Name, profile6Name, profile7Name,
				profile8Name, profile9Name, profile10Name };
		
		return rtn;
	}
}
