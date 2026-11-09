package co.edu.unillanos.msg.infrastructure.ui;

import java.util.Locale;

/** Formato de presentación de montos para la interfaz de usuario. */
public final class MoneyFormat {

    private MoneyFormat() {
    }

    /** Devuelve el monto con dos decimales y punto decimal, por ejemplo "$ 1160.00". */
    public static String format(double amount) {
        return String.format(Locale.ROOT, "$ %.2f", amount);
    }
}
