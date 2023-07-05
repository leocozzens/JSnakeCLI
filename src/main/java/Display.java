import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

public class Display {
    private Terminal term = null;
    public Display(DefaultTerminalFactory defaultTerminalFactory) {
        try {
            term = defaultTerminalFactory.createTerminal();
            term.enterPrivateMode();
            term.putString("Hello!!");
            term.flush();

            Thread.sleep(2000);
            term.close();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
    public Terminal getTerm() {
        return term;
    }
}