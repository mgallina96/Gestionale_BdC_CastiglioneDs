package system.gui;

/**
 * Gestore dell'interfaccia grafica.
 *
 * @author Manuel Gallina
 */
public class GuiManager {

    public void start() {
        LoginScreen loginScreen = new LoginScreen();
        loginScreen.build();
    }
}
