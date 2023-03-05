package viewsV01.commandsClass.Logging;

import java.io.IOException;

public interface Logging {
    default void handOverLog(String data) throws IOException {
        new AppLogger().addLog(data);
    };
}
