package prototypePattern.deepClone;

import java.io.IOException;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //创建附件对象
        Attachment attachment = new Attachment();
        //创建原型对象
        WeeklyLog weeklyLog = new WeeklyLog();
        weeklyLog.setAttachment(attachment);
        //克隆(序列化实现深克隆这里就不是用的java自带的clone()方法，而是自己写的deepClone()
        WeeklyLog weeklyLog_clone = weeklyLog.deepClone();
        //比较原型对象和克隆对象的地址
        boolean result1 = weeklyLog == weeklyLog_clone;
        System.out.println("原型对象和克隆对象地址是否相等："+result1);
        //比较原型对象和克隆对象两个对象里引用类型的地址
        boolean result2 = weeklyLog.getAttachment() == weeklyLog_clone.getAttachment();
        System.out.println("原型对象和克隆对象两个对象里引用类型的地址是否相等："+result2);
    }
}
