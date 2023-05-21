package logs;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

public class MyLogHandler extends Handler {

    private Handler fileHandler;

    public MyLogHandler() {
        try {
            fileHandler = new FileHandler("logs.txt");
            fileHandler.setFormatter(new SimpleFormatter());
        } catch (IOException ignored) {
        }
    }

    @Override
    public void publish(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append(record.getMillis())
                .append(" - ")
                .append(record.getSourceClassName())
                .append("#")
                .append(record.getSourceMethodName())
                .append(" - ")
                .append(record.getMessage());
        String log = sb.toString();

        if (fileHandler != null) {
            fileHandler.publish(record);
        }
    }

    @Override
    public void flush() {
        if (fileHandler != null) {
            fileHandler.flush();
        }
    }

    @Override
    public void close() throws SecurityException {
        if (fileHandler != null) {
            fileHandler.close();
        }
    }
}

