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
        for (int index = 0; index < words.size(); index++){
        listView.getItems().add(words.get(index));}
        TextInput.clear();
    }

    public void deleteFromTheCollection(ActionEvent actionEvent) {
        int deletedWord = listView.getSelectionModel().getSelectedIndex();
        words.remove(deletedWord);
        for (int index = 0; index < words.size(); index++){
            listView.getItems().add(words.get(index));}
    }

}