package viewsV01.commandsClass.Logging;

import viewsV01.Config;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AppLogger {
    private static final Logger logger = Logger.getLogger(
            AppLogger.class.getName());
    private FileHandler fileHandler = new FileHandler(Config.logPath, true);

    public AppLogger() throws IOException {
        logger.addHandler(fileHandler);
        logger.setUseParentHandlers(false);

    }

    public static void addLog(String logData) {
        logger.log(Level.INFO, logData);
    }
}
