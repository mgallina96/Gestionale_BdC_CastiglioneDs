package system;

import system.gui.GuiManager;

/**
 * Gestionale per il Banco di Comunità di Castiglione delle Stiviere.
 *
 * @author Manuel Gallina
 * @version 0.1
 */
public class Main {
    /** Metodo main. */
    public static void main(String[] args) {
        GuiManager guiManager = new GuiManager();
        guiManager.start();
    }
}
