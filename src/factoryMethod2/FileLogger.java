package factoryMethod2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

//文件日志记录器
public class FileLogger implements Logger {
    @Override
    public void writeLog() throws IOException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        //System.out.println("当前时间："+date);
        File file = new File("log" + date + ".txt");
        // if file doesnt exists, then create it
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("myLog");
        bw.close();
        System.out.println("输出文件日志");
        //System.out.println("Done");
}
}
