package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
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
    private ImageView imageView1;

    @FXML
    private HBox hbox01;

    @FXML
    private ImageView imageView2;

    @FXML
    private HBox hbox03;

    @FXML
    private ImageView imageView4;

    @FXML
    private HBox hbox04;

    @FXML
    private ImageView imageView5;

    @FXML
    private HBox hbox05;

    @FXML
    private ImageView imageView6;

    @FXML
    private HBox hbox06;

    @FXML
    private ImageView imageView7;

    @FXML
    private HBox hbox07;

    @FXML
    private ImageView imageView8;

    @FXML
    private HBox hbox10;

    @FXML
    private ImageView imageView9;

    @FXML
    private HBox hbox11;

    @FXML
    private ImageView imageView10;

    @FXML
    private HBox hbox12;

    @FXML
    private ImageView imageView11;

    @FXML
    private HBox hbox14;

    @FXML
    private ImageView imageView13;

    @FXML
    private HBox hbox16;

    @FXML
    private ImageView imageView15;

    @FXML
    private HBox hbox13;

    @FXML
    private ImageView imageView12;

    @FXML
    private HBox hbox15;

    @FXML
    private ImageView imageView14;

    @FXML
    private HBox hbox17;

    @FXML
    private ImageView imageView16;

    @FXML
    private HBox hbox20;

    @FXML
    private HBox hbox21;

    @FXML
    private HBox hbox23;

    @FXML
    private HBox hbox25;

    @FXML
    private HBox hbox27;

    @FXML
    private HBox hbox30;

    @FXML
    private HBox hbox22;

    @FXML
    private HBox hbox24;

    @FXML
    private HBox hbox26;

    @FXML
    private HBox hbox31;

    @FXML
    private HBox hbox36;

    @FXML
    private HBox hbox34;

    @FXML
    private HBox hbox32;

    @FXML
    private HBox hbox35;

    @FXML
    private HBox hbox33;

    @FXML
    private HBox hbox37;

    @FXML
    private HBox hbox41;

    @FXML
    private HBox hbox40;

    @FXML
    private HBox hbox42;

    @FXML
    private HBox hbox43;

    @FXML
    private HBox hbox44;

    @FXML
    private HBox hbox45;

    @FXML
    private HBox hbox46;

    @FXML
    private HBox hbox47;

    @FXML
    private HBox hbox50;

    @FXML
    private HBox hbox51;

    @FXML
    private HBox hbox52;

    @FXML
    private HBox hbox53;

    @FXML
    private HBox hbox63;

    @FXML
    private ImageView imageView20;

    @FXML
    private HBox hbox61;

    @FXML
    private ImageView imageView18;

    @FXML
    private HBox hbox56;

    @FXML
    private HBox hbox54;

    @FXML
    private HBox hbox55;

    @FXML
    private HBox hbox57;

    @FXML
    private HBox hbox62;

    @FXML
    private ImageView imageView19;

    @FXML
    private HBox hbox60;

    @FXML
    private ImageView imageView17;

    @FXML
    private HBox hbox64;

    @FXML
    private ImageView imageView21;

    @FXML
    private HBox hbox67;

    @FXML
    private ImageView imageView24;

    @FXML
    private HBox hbox65;

    @FXML
    private ImageView imageView22;

    @FXML
    private HBox hbox71;

    @FXML
    private ImageView imageView26;

    @FXML
    private HBox hbox66;

    @FXML
    private ImageView imageView23;

    @FXML
    private HBox hbox72;

    @FXML
    private ImageView imageView27;

    @FXML
    private HBox hbox70;

    @FXML
    private ImageView imageView25;

    @FXML
    private HBox hbox76;

    @FXML
    private ImageView imageView31;

    @FXML
    private HBox hbox74;

    @FXML
    private ImageView imageView29;

    @FXML
    private HBox hbox77;

    @FXML
    private ImageView imageView32;

    @FXML
    private HBox hbox73;

    @FXML
    private ImageView imageView28;

    @FXML
    private HBox hbox75;

    @FXML
    private ImageView imageView30;

    @FXML
    private HBox hbox02;

    @FXML
    private ImageView imageView3;

	private Node nodeReference;
    
    private final DataFormat buttonFormat = new DataFormat("com.example.myapp.formats.button");

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		addDropHandling(hbox00);
		addDropHandling(hbox01);
		addDropHandling(hbox02);
		addDropHandling(hbox03);
		addDropHandling(hbox04);
		addDropHandling(hbox05);
		addDropHandling(hbox06);
		addDropHandling(hbox07);
		addDropHandling(hbox10);
		addDropHandling(hbox11);
		addDropHandling(hbox12);
		addDropHandling(hbox13);
		addDropHandling(hbox14);
		addDropHandling(hbox15);
		addDropHandling(hbox16);
		addDropHandling(hbox17);
		addDropHandling(hbox20);
		addDropHandling(hbox21);
		addDropHandling(hbox22);
		addDropHandling(hbox23);
		addDropHandling(hbox24);
		addDropHandling(hbox25);
		addDropHandling(hbox26);
		addDropHandling(hbox27);
		addDropHandling(hbox30);
		addDropHandling(hbox31);
		addDropHandling(hbox32);
		addDropHandling(hbox33);
		addDropHandling(hbox34);
		addDropHandling(hbox35);
		addDropHandling(hbox36);
		addDropHandling(hbox37);
		addDropHandling(hbox40);
		addDropHandling(hbox41);
		addDropHandling(hbox42);
		addDropHandling(hbox43);
		addDropHandling(hbox44);
		addDropHandling(hbox45);
		addDropHandling(hbox46);
		addDropHandling(hbox47);
		addDropHandling(hbox50);
		addDropHandling(hbox51);
		addDropHandling(hbox52);
		addDropHandling(hbox53);
		addDropHandling(hbox54);
		addDropHandling(hbox55);
		addDropHandling(hbox56);
		addDropHandling(hbox57);
		addDropHandling(hbox60);
		addDropHandling(hbox61);
		addDropHandling(hbox62);
		addDropHandling(hbox63);
		addDropHandling(hbox64);
		addDropHandling(hbox65);
		addDropHandling(hbox66);
		addDropHandling(hbox67);
		addDropHandling(hbox70);
		addDropHandling(hbox71);
		addDropHandling(hbox72);
		addDropHandling(hbox73);
		addDropHandling(hbox74);
		addDropHandling(hbox75);
		addDropHandling(hbox76);
		addDropHandling(hbox77);
		
		addEventHandler(imageView1);
		addEventHandler(imageView2);
		addEventHandler(imageView3);
		addEventHandler(imageView4);
		addEventHandler(imageView5);
		addEventHandler(imageView6);
		addEventHandler(imageView7);
		addEventHandler(imageView8);
		addEventHandler(imageView9);
		addEventHandler(imageView10);
		addEventHandler(imageView11);
		addEventHandler(imageView12);
		addEventHandler(imageView13);
		addEventHandler(imageView14);
		addEventHandler(imageView15);
		addEventHandler(imageView16);
		addEventHandler(imageView18);
		addEventHandler(imageView19);
		addEventHandler(imageView20);
		addEventHandler(imageView21);
		addEventHandler(imageView22);
		addEventHandler(imageView23);
		addEventHandler(imageView24);
		addEventHandler(imageView25);
		addEventHandler(imageView26);
		addEventHandler(imageView27);
		addEventHandler(imageView28);
		addEventHandler(imageView29);
		addEventHandler(imageView30);
		addEventHandler(imageView31);
		addEventHandler(imageView32);

			
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
