package factoryMethod2;

import java.io.IOException;

//数据库日志记录器
public class DBLogger implements Logger{
    @Override
    public void writeLog() throws IOException {
        System.out.println("输出数据库日志");
    }
}
