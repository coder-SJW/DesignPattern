package prototypePattern.deepClone;

import prototypePattern.deepClone.Attachment;

import java.io.*;

/**
 * 周报类
 * 实现深克隆：原型对象和克隆对象使用不同*引用类型*的指针（复制值）
 * Cloneable接口为标记类：标记该类是否可被克隆
 */
public class WeeklyLog implements Serializable {
    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //使用序列化技术实现深克隆(不用Object的clone(),自己写deepClone())
    public WeeklyLog deepClone() throws IOException, ClassNotFoundException {
        //将此对象（原型对象）写入流中
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(this);
        //通过流生成克隆对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return (WeeklyLog)objectInputStream.readObject();
    }
}
