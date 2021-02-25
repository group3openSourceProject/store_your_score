/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store_youe_score;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.lang.Integer.parseInt;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JTextField;

/**
 *
 * @author marci
 */
public class Store_youe_score extends Application {
    private Label lblName;
    private Label lblSurname;
    private Label lblCourseName;
    private Label lblModule;
    private Label lblProject1;
    private Label lblProject2;
    private Label lblProject3;
    private Label lblProject4;
    private Label lblProject5;
    private Label lblExam;
    private Label lblTotal;
    private TextField txtName;
    private TextField txtSurname;
    private TextField txtCourseName;
    private TextField txtModule1, txtProject1M1, txtProject2M1, txtProject3M1, txtProject4M1, txtProject5M1, txtExamM1;
    private Label lblFinalScoreM1;
    private TextField txtModule2, txtProject1M2, txtProject2M2, txtProject3M2, txtProject4M2, txtProject5M2, txtExamM2;
    private Label lblFinalScoreM2;
    private TextField txtModule3, txtProject1M3, txtProject2M3, txtProject3M3, txtProject4M3, txtProject5M3, txtExamM3;
    private Label lblFinalScoreM3;
    private TextField txtModule4, txtProject1M4, txtProject2M4, txtProject3M4, txtProject4M4, txtProject5M4, txtExamM4;
    private Label lblFinalScoreM4;
    private TextField txtModule5, txtProject1M5, txtProject2M5, txtProject3M5, txtProject4M5, txtProject5M5, txtExamM5;
    private Label lblFinalScoreM5;
    private TextField txtModule6, txtProject1M6, txtProject2M6,  txtProject3M6, txtProject4M6, txtProject5M6, txtExamM6;
    private Label lblFinalScoreM6;
    private Button btnAdd;
    private Button button;
    private TextArea textArea;
    private ComboBox<String> comboBox;
    private DatePicker datePicker;
    private Alert alert;

    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 285, Color.GREEN);
        
        //Name Box
        lblName = new Label("Name:");
        lblName.setPrefWidth(70);
        lblSurname = new Label("Surname:");
        lblSurname.setPrefWidth(70);
        lblCourseName = new Label("Course Title:");
        lblCourseName.setPrefWidth(70);
        txtName = new TextField();
        txtSurname = new TextField();
        txtCourseName = new TextField();
        HBox hBoxName = new HBox(lblName, txtName);  
        hBoxName.setPadding(new Insets(10,10,10,10));
        HBox hBoxSurname = new HBox(lblSurname, txtSurname);  
        hBoxSurname.setPadding(new Insets(10,10,10,10));
        HBox hBoxCourseTitle = new HBox(lblCourseName, txtCourseName);  
        hBoxCourseTitle.setPadding(new Insets(10,10,10,10));
        VBox vBoxPersonal = new VBox (hBoxName, hBoxSurname, hBoxCourseTitle);
        
        //Menu
        lblModule = new Label("MODULE");
        lblModule.setPrefWidth(70);
        lblProject1 = new Label("Project 1");
        lblProject1.setPrefWidth(70);
        lblProject2 = new Label("Project 2");
        lblProject2.setPrefWidth(70);
        lblProject3 = new Label("Project 3");
        lblProject3.setPrefWidth(70);
        lblProject4 = new Label("Project 4");
        lblProject4.setPrefWidth(70);
        lblProject5 = new Label("Project 5");
        lblProject5.setPrefWidth(70);
        lblExam = new Label("Exam");
        lblExam.setPrefWidth(70);
        lblTotal = new Label("Final Score");
        lblTotal.setPrefWidth(70);
        HBox hBoxMenu = new HBox(lblModule, lblProject1, lblProject2, lblProject3, lblProject4, lblProject5, lblExam, lblTotal);
        
        lblFinalScoreM1 = new Label();
        txtModule1 = new TextField();
        txtModule1.setPrefWidth(70);
        txtProject1M1 = new TextField();
        txtProject1M1.setPrefWidth(70);
        txtProject2M1 = new TextField();
        txtProject2M1.setPrefWidth(70);
        txtProject3M1 = new TextField();
        txtProject3M1.setPrefWidth(70);
        txtProject4M1 = new TextField();
        txtProject4M1.setPrefWidth(70);
        txtProject5M1 = new TextField();
        txtProject5M1.setPrefWidth(70);
        txtExamM1 = new TextField();
        txtExamM1.setPrefWidth(70);
        txtProject1M1.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                lblFinalScoreM1.setText(newValue);
                getTotal(txtProject1M1.getText(), txtProject2M1.getText(), txtProject3M1.getText(), txtProject4M1.getText(), txtProject5M1.getText(), txtExamM1.getText());
            }
        
        });
        HBox hBoxModule1 = new HBox(txtModule1, txtProject1M1, txtProject2M1, txtProject3M1, txtProject4M1, txtProject5M1, txtExamM1, lblFinalScoreM1);
        txtModule2 = new TextField();
        txtModule2.setPrefWidth(70);
        txtProject1M2 = new TextField();
        txtProject1M2.setPrefWidth(70);
        txtProject2M2 = new TextField();
        txtProject2M2.setPrefWidth(70);
        txtProject3M2 = new TextField();
        txtProject3M2.setPrefWidth(70);
        txtProject4M2 = new TextField();
        txtProject4M2.setPrefWidth(70);
        txtProject5M2 = new TextField();
        txtProject5M2.setPrefWidth(70);
        txtExamM2 = new TextField();
        txtExamM2.setPrefWidth(70);
        lblFinalScoreM2 = new Label();
        HBox hBoxModule2 = new HBox(txtModule2, txtProject1M2, txtProject2M2, txtProject3M2, txtProject4M2, txtProject5M2, txtExamM2, lblFinalScoreM2);
        txtModule3 = new TextField();
        txtModule3.setPrefWidth(70);
        txtProject1M3 = new TextField();
        txtProject1M3.setPrefWidth(70);
        txtProject2M3 = new TextField();
        txtProject2M3.setPrefWidth(70);
        txtProject3M3 = new TextField();
        txtProject3M3.setPrefWidth(70);
        txtProject4M3 = new TextField();
        txtProject4M3.setPrefWidth(70);
        txtProject5M3 = new TextField();
        txtProject5M3.setPrefWidth(70);
        txtExamM3 = new TextField();
        txtExamM3.setPrefWidth(70);
        lblFinalScoreM3 = new Label();
        HBox hBoxModule3 = new HBox(txtModule3, txtProject1M3, txtProject2M3, txtProject3M3, txtProject4M3, txtProject5M3, txtExamM3, lblFinalScoreM3);
        txtModule4 = new TextField();
        txtModule4.setPrefWidth(70);
        txtProject1M4 = new TextField();
        txtProject1M4.setPrefWidth(70);
        txtProject2M4 = new TextField();
        txtProject2M4.setPrefWidth(70);
        txtProject3M4 = new TextField();
        txtProject3M4.setPrefWidth(70);
        txtProject4M4 = new TextField();
        txtProject4M4.setPrefWidth(70);
        txtProject5M4 = new TextField();
        txtProject5M4.setPrefWidth(70);
        txtExamM4 = new TextField();
        txtExamM4.setPrefWidth(70);
        lblFinalScoreM4 = new Label();
        HBox hBoxModule4 = new HBox(txtModule4, txtProject1M4, txtProject2M4, txtProject3M4, txtProject4M4, txtProject5M4, txtExamM4, lblFinalScoreM4);
        txtModule5 = new TextField();
        txtModule5.setPrefWidth(70);
        txtProject1M5 = new TextField();
        txtProject1M5.setPrefWidth(70);
        txtProject2M5 = new TextField();
        txtProject2M5.setPrefWidth(70);
        txtProject3M5 = new TextField();
        txtProject3M5.setPrefWidth(70);
        txtProject4M5 = new TextField();
        txtProject4M5.setPrefWidth(70);
        txtProject5M5 = new TextField();
        txtProject5M5.setPrefWidth(70);
        txtExamM5 = new TextField();
        txtExamM5.setPrefWidth(70);
        lblFinalScoreM5 = new Label();
        HBox hBoxModule5 = new HBox(txtModule5, txtProject1M5, txtProject2M5, txtProject3M5, txtProject4M5, txtProject5M5, txtExamM5, lblFinalScoreM5);
        
        txtModule6 = new TextField();
        txtModule6.setPrefWidth(70);
        txtProject1M6 = new TextField();
        txtProject1M6.setPrefWidth(70);
        txtProject2M6 = new TextField();
        txtProject2M6.setPrefWidth(70);
        txtProject3M6 = new TextField();
        txtProject3M6.setPrefWidth(70);
        txtProject4M6 = new TextField();
        txtProject4M6.setPrefWidth(70);
        txtProject5M6 = new TextField();
        txtProject5M6.setPrefWidth(70);
        txtExamM6 = new TextField();
        txtExamM6.setPrefWidth(70);
        lblFinalScoreM6 = new Label();
        HBox hBoxModule6 = new HBox(txtModule6, txtProject1M6, txtProject2M6, txtProject3M6, txtProject4M6, txtProject5M6, txtExamM6, lblFinalScoreM6);
        
        VBox vBoxScores = new VBox(hBoxMenu, hBoxModule1, hBoxModule2, hBoxModule3, hBoxModule4, hBoxModule5, hBoxModule6);
        
        HBox overall = new HBox(vBoxPersonal, vBoxScores);
        //Display
        root.setCenter(overall);
        primaryStage.setTitle("Store your score");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public HBox fillFields(TextField txtModule, TextField txtProject1, TextField txtProject2, TextField txtProject3, TextField txtProject4, TextField txtProject5, TextField txtExam, Label lblFinalScore){
        txtModule = new TextField();
        txtModule.setPrefWidth(70);
        lblFinalScore = new Label();
        txtProject1 = new TextField();
        txtProject1.setPrefWidth(70);
        txtProject2 = new TextField();
        txtProject2.setPrefWidth(70);
        txtProject3 = new TextField();
        txtProject3.setPrefWidth(70);
        txtProject4 = new TextField();
        txtProject4.setPrefWidth(70);
        txtProject5 = new TextField();
        txtProject5.setPrefWidth(70);
        txtExam = new TextField();
        txtExam.setPrefWidth(70);
        
        HBox temp = new HBox(txtModule, txtProject1, txtProject2, txtProject3, txtProject4, txtProject5, txtExam, lblFinalScore);
        return temp;
    }
    public void getTotal(String i1, String i2, String i3, String i4, String i5, String i6){
        int temp;
        System.out.println(i1 + i2 + i3 + i4 + i5 + i6);
        if(i1 == ""){i1 = "0";}
        if(i2 == ""){i2 = "0";}
        if(i3 == ""){i3 = "0";}
        if(i4 == ""){i4 = "0";}
        if(i5 == ""){i5 = "0";}
        if(i6 == ""){i6 = "0";}
        System.out.println(i1 + i2 + i3 + i4 + i5 + i6);
        temp = parseInt(i1) + parseInt(i2) + parseInt(i3) +parseInt(i4) + parseInt(i5) + parseInt(i6);
        String res = " " + temp;
    }
}

/*
package store_youe_score;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JTextField;

public class Store_youe_score extends Application {
    private Label lblName;
    private Label lblSurname;
    private Label lblCourseName;
    private Label lblModule;
    private Label lblProject1;
    private Label lblProject2;
    private Label lblProject3;
    private Label lblProject4;
    private Label lblProject5;
    private Label lblExam;
    private Label lblTotal;
    private TextField txtName;
    private TextField txtSurname;
    private TextField txtCourseName;
    private TextField txtModule1, txtProject1M1, txtProject2M1, txtProject3M1, txtProject4M1, txtProject5M1, txtExamM1;
    private Label lblFinalScoreM1;
    private TextField txtModule2, txtProject1M2, txtProject2M2, txtProject3M2, txtProject4M2, txtProject5M2, txtExamM2;
    private Label lblFinalScoreM2;
    private TextField txtModule3, txtProject1M3, txtProject2M3, txtProject3M3, txtProject4M3, txtProject5M3, txtExamM3;
    private Label lblFinalScoreM3;
    private TextField txtModule4, txtProject1M4, txtProject2M4, txtProject3M4, txtProject4M4, txtProject5M4, txtExamM4;
    private Label lblFinalScoreM4;
    private TextField txtModule5, txtProject1M5, txtProject2M5, txtProject3M5, txtProject4M5, txtProject5M5, txtExamM5;
    private Label lblFinalScoreM5;
    private TextField txtModule6, txtProject1M6, txtProject2M6,  txtProject3M6, txtProject4M6, txtProject5M6, txtExamM6;
    private Label lblFinalScoreM6;
    private Button btnAdd;
    private Button button;
    private TextArea textArea;
    private ComboBox<String> comboBox;
    private DatePicker datePicker;
    private Alert alert;

    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        Scene scene = new Scene(root, 800, 285, Color.GREEN);
        
        //Name Box
        lblName = new Label("Name:");
        lblName.setPrefWidth(70);
        lblSurname = new Label("Surname:");
        lblSurname.setPrefWidth(70);
        lblCourseName = new Label("Course Title:");
        lblCourseName.setPrefWidth(70);
        txtName = new TextField();
        txtSurname = new TextField();
        txtCourseName = new TextField();
        HBox hBoxName = new HBox(lblName, txtName);  
        hBoxName.setPadding(new Insets(10,10,10,10));
        HBox hBoxSurname = new HBox(lblSurname, txtSurname);  
        hBoxSurname.setPadding(new Insets(10,10,10,10));
        HBox hBoxCourseTitle = new HBox(lblCourseName, txtCourseName);  
        hBoxCourseTitle.setPadding(new Insets(10,10,10,10));
        VBox vBoxPersonal = new VBox (hBoxName, hBoxSurname, hBoxCourseTitle);
        
        //Menu
        lblModule = new Label("MODULE");
        lblModule.setPrefWidth(70);
        lblProject1 = new Label("Project 1");
        lblProject1.setPrefWidth(70);
        lblProject2 = new Label("Project 2");
        lblProject2.setPrefWidth(70);
        lblProject3 = new Label("Project 3");
        lblProject3.setPrefWidth(70);
        lblProject4 = new Label("Project 4");
        lblProject4.setPrefWidth(70);
        lblProject5 = new Label("Project 5");
        lblProject5.setPrefWidth(70);
        lblExam = new Label("Exam");
        lblExam.setPrefWidth(70);
        lblTotal = new Label("Final Score");
        lblTotal.setPrefWidth(70);
        HBox hBoxMenu = new HBox(lblModule, lblProject1, lblProject2, lblProject3, lblProject4, lblProject5, lblExam, lblTotal);
        
        

        HBox hBoxModule2 = fillFields(txtModule2, txtProject1M2, txtProject2M2, txtProject3M2, txtProject4M2, txtProject5M2, txtExamM2, lblFinalScoreM2);
        
        HBox hBoxModule3 = fillFields(txtModule3, txtProject1M3, txtProject2M3, txtProject3M3, txtProject4M3, txtProject5M3, txtExamM3, lblFinalScoreM3);
        
        HBox hBoxModule4 = fillFields(txtModule4, txtProject1M4, txtProject2M4, txtProject3M4, txtProject4M4, txtProject5M4, txtExamM4, lblFinalScoreM4);
        
        HBox hBoxModule5 = fillFields(txtModule5, txtProject1M5, txtProject2M5, txtProject3M5, txtProject4M5, txtProject5M5, txtExamM5, lblFinalScoreM5);
        
        HBox hBoxModule6 = fillFields(txtModule6, txtProject1M6, txtProject2M6, txtProject3M6, txtProject4M6, txtProject5M6, txtExamM6, lblFinalScoreM6);
        
        VBox vBoxScores = new VBox(hBoxMenu, hBoxModule1, hBoxModule2, hBoxModule3, hBoxModule4, hBoxModule5, hBoxModule6);
        
        HBox overall = new HBox(vBoxPersonal, vBoxScores);
        //Display
        root.setCenter(overall);
        primaryStage.setTitle("Store your score");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
    public HBox fillFields(TextField txtModule, TextField txtProject1, TextField txtProject2, TextField txtProject3, TextField txtProject4, TextField txtProject5, TextField txtExam, Label lblFinalScore){
        txtModule = new TextField();
        txtModule.setPrefWidth(70);
        lblFinalScore = new Label();
        txtProject1 = new TextField();
        txtProject1.setPrefWidth(70);
        txtProject2 = new TextField();
        txtProject2.setPrefWidth(70);
        txtProject3 = new TextField();
        txtProject3.setPrefWidth(70);
        txtProject4 = new TextField();
        txtProject4.setPrefWidth(70);
        txtProject5 = new TextField();
        txtProject5.setPrefWidth(70);
        txtExam = new TextField();
        txtExam.setPrefWidth(70);
        
        HBox temp = new HBox(txtModule, txtProject1, txtProject2, txtProject3, txtProject4, txtProject5, txtExam, lblFinalScore);
        return temp;
    }
}

*/