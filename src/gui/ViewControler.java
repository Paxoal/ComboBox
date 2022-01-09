package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import model.entities.Person;

public class ViewControler implements Initializable {
	@FXML
	private ComboBox<Person> comboBoxPerson;
	
	private ObservableList<Person> obsList;
	
	@FXML
	public void onComboBoxPerson() {
		Person person = comboBoxPerson.getSelectionModel().getSelectedItem();
		System.out.println(person);
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "Paschoal", "paschoal@gmail.com"));
		list.add(new Person(2, "Midinhas", "midinhas@gmail.com"));
		list.add(new Person(3, "Goginho", "go@gmail.com"));
		
		obsList = FXCollections.observableArrayList(list);
		comboBoxPerson.setItems(obsList);
		
	}

}