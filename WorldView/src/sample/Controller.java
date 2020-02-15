package sample;

import javafx.animation.PathTransition;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.ArcTo;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.awt.event.MouseEvent;

public class Controller {

    public Controller() {}

    @FXML
    private Path tramPath;

    @FXML
    private MoveTo endPoint;

    @FXML
    private ArcTo leftArc;

    @FXML
    private MoveTo startPoint;

    @FXML
    private LineTo startLine;

    @FXML
    private MoveTo startOfLeftDownCross;

    @FXML
    private LineTo leftDownCross;

    @FXML
    private MoveTo startOfRightBridge;

    @FXML
    private LineTo rightBridge;

    @FXML
    private MoveTo endOfRightBridge;

    @FXML
    private LineTo rightDownCross;

    @FXML
    private MoveTo endOfRightDownCross;

    @FXML
    private LineTo endOfRightLine;

    @FXML
    private MoveTo endOfRightSide;

    @FXML
    private ArcTo rightArc;

    @FXML
    private MoveTo startOfLeftSide;

    @FXML
    private LineTo leftLine;

    @FXML
    private MoveTo startOfRightUpCross;

    @FXML
    private LineTo rightUpCross;

    @FXML
    private MoveTo startOfLeftBridge;

    @FXML
    private LineTo leftBridge;

    @FXML
    private MoveTo endOfLeftBridge;

    @FXML
    private LineTo LeftUpCross;

    @FXML
    private MoveTo startOfLastLine;

    @FXML
    private LineTo endOfLeftLine;

    @FXML
    private Path carPath;

    @FXML
    private MoveTo leftRoadBorder;

    @FXML
    private LineTo leftRoadLine;

    @FXML
    private MoveTo rightRoadBorder;

    @FXML
    private LineTo rightRoadLine;

    @FXML
    private Rectangle tram;

    @FXML
    private Rectangle AlphaCar;

    @FXML
    private Rectangle BetaCar;

    @FXML
    private Button playButton;

    @FXML
    private Button pauseButton;

    @FXML
    private Button resetButton;

    @FXML
    private Rectangle zeroLight;

    @FXML
    private Rectangle firstLight;

    @FXML
    private Rectangle seventhLight;

    @FXML
    private Rectangle thirdLight;

    @FXML
    private Rectangle fourthLight;

    @FXML
    private Rectangle secondLight;

    @FXML
    private Rectangle fifthLight;

    @FXML
    private Rectangle sixthLight;

    @FXML
    private Circle downCarLight;

    @FXML
    private Circle upCarLight;

    @FXML
    private Line linkZeroFirstLight;

    @FXML
    private Line linkSecondThirdLight;

    @FXML
    private Line linkForthFifthLight;

    @FXML
    private Line linkSixthSeventhLight;

    @FXML
    private Text status;

    @FXML
    private void initialize() { }

    @FXML
    public void displayPos(MouseEvent event) {
        status.setText("X= " + status.getX() + " Y= " + status.getY());
    }

    @FXML
    public void setTramDynamic() {
        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(10000));
        pathTransition.setNode(tram);
        pathTransition.setPath(tramPath);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(1);

        playButton.setOnAction(action -> {
            playButton.setDisable(true);
            pauseButton.setDisable(false);
            pathTransition.play();
        });

        pauseButton.setOnAction(action -> {
            playButton.setDisable(false);
            pauseButton.setDisable(true);
            pathTransition.pause();
        });

    }

    public void playTram() {
    }

    public void stopTram() {
    }

}