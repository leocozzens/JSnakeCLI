import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

public class Game {
    public static void main(String[] args) {
        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        Terminal term = null;
        try {
            term = defaultTerminalFactory.createTerminal();
            term.putCharacter('H');
            term.putCharacter('e');
            term.putCharacter('l');
            term.putCharacter('l');
            term.putCharacter('o');
            term.putCharacter('\n');
            term.flush();
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}