package factoryMethod2;
//数据库日志记录器工厂
public class DBLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DBLogger();
    }
}
