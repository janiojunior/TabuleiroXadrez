package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.DataFormat;
import javafx.scene.input.Dragboard;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class TabuleiroController implements Initializable{
    @FXML
    private HBox hbox00;

    @FXML
    private HBox hbox01;

    @FXML
    private HBox hbox10;

    @FXML
    private HBox hbox11;
    
	private Node nodeReference;
    
    @FXML
    private ImageView imageView1;
    
    @FXML
    private ImageView imageView2;
    
    private final DataFormat buttonFormat = new DataFormat("com.example.myapp.formats.button");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		addDropHandling(hbox00);
		addDropHandling(hbox01);
		addDropHandling(hbox10);
		addDropHandling(hbox11);
		
		addEventHandler(imageView1);
		addEventHandler(imageView2);
			
	}
	
	private void addEventHandler(Node node) {
		node.setOnDragDetected(e -> {
            Dragboard db = node.startDragAndDrop(TransferMode.MOVE);
            db.setDragView(node.snapshot(null, null));
            ClipboardContent cc = new ClipboardContent();
            cc.put(buttonFormat, "button");
            db.setContent(cc);
            nodeReference = node ;
        });
        node.setOnDragDone(e -> nodeReference = null);	
	}
	
	private void addDropHandling(Pane pane) {
        pane.setOnDragOver(e -> {
            Dragboard db = e.getDragboard();
            if (db.hasContent(buttonFormat) 
                    && nodeReference != null 
                    && nodeReference.getParent() != pane) {
                e.acceptTransferModes(TransferMode.MOVE);
            }
        });

        pane.setOnDragDropped(e -> {
            Dragboard db = e.getDragboard();
            if (db.hasContent(buttonFormat)) {
            	// remove do antigo hbox
                ((Pane)nodeReference.getParent()).getChildren().remove(nodeReference);
                // limpa o novo hbox
                pane.getChildren().clear();
                // adiciona no novo hbox
                pane.getChildren().add(nodeReference);
                // finaliza a acao do drop
                e.setDropCompleted(true);
            }           
        });
    }

}
