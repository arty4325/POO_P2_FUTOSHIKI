package com.example.cronometro;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.util.Duration;


//Link del video del cual se tomo la referencia
//https://www.youtube.com/watch?v=lXr0Vf2HfhM

public class HelloController {

    @FXML
    private Label lblTiempo;

    private int miliSegundoActual=0;
    private Timeline timeline;
    public void initialize() {
        timeline = new Timeline(new KeyFrame(Duration.millis(1), e -> actualizarTiempo()));
        timeline.setCycleCount(Timeline.INDEFINITE);
    }

    private void actualizarTiempo() {
        miliSegundoActual++;
        actualizarLblTiempo();
    }

    private void actualizarLblTiempo() {
        int horas = miliSegundoActual / 3600000;
        int minutos = (miliSegundoActual % 3600000)/60000;
        int segundos = (miliSegundoActual % 60000)/1000;
        int milisegundos = (miliSegundoActual % 1000)/10;

        lblTiempo.setText(String.format("%02d:%02d:%02d:%02d", horas, minutos, segundos, milisegundos));
    }

    public void iniciarPausar(){
        if (Animation.Status.STOPPED.equals(timeline.getStatus()) || Animation.Status.PAUSED.equals(timeline.getStatus())) {
            timeline.play();
        } else if (Animation.Status.RUNNING.equals(timeline.getStatus())) {
            timeline.pause();
        }
    }
    public void reiniciar(){
        timeline.stop();
        miliSegundoActual=0;
        actualizarLblTiempo();
        iniciarPausar();
    }
}