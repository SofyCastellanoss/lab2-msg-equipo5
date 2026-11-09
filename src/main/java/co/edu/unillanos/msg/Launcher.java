package co.edu.unillanos.msg;

import javafx.application.Application;

/** Punto de entrada compatible con la ejecución de JavaFX desde el IDE. */
public final class Launcher {

    private Launcher() {
    }

    public static void main(String[] args) {
        Application.launch(App.class, args);
    }
}
