import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EventLog {
    public static void main(String[] args) {
        Logger logger = Logger.getGlobal();
        // Include detailed messages
        logger.setLevel(Level.FINEST);     
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("app.log");
        } catch (IOException e) {
            System.exit(1);
        }
        logger.addHandler(fileHandler);    // Send output to file
        logger.fine("Called main");
    }
}
