package com.example.vocabulary;
import javafx.event.ActionEvent;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;



public class HelloController {
    public ListView listView;
    public TextField TextInput=new TextField();;
    public ArrayList<String> words = new ArrayList<>();



    public void addToCollection(ActionEvent actionEvent) {
        words.add(TextInput.getText());
        listView.getItems().add(words.get(words.indexOf(TextInput.getText())));
        TextInput.clear();
    }

    public void deleteFromTheCollection(ActionEvent actionEvent) {
        int deletedWord = listView.getSelectionModel().getSelectedIndex();
        words.remove(deletedWord);
        listView.getItems().remove(deletedWord);
    }

}