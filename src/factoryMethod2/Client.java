package factoryMethod2;

import java.io.IOException;

//客户
public class Client {
    public static void main(String[] args) throws IOException {
        //1、文件日志
        LoggerFactory fileLoggerFactory = new FileLoggerFactory();
        FileLogger fileLogger = (FileLogger) fileLoggerFactory.createLogger();
        fileLogger.writeLog();
        //2、数据库日志
        LoggerFactory DBloggerFactory = new DBLoggerFactory();
        DBLogger dbLogger = (DBLogger) DBloggerFactory.createLogger();
        dbLogger.writeLog();

        //
    }
}
