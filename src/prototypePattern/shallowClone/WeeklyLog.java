package prototypePattern.shallowClone;

/**
 * 周报类
 * 实现浅克隆：原型对象和克隆对象使用相同*引用类型*的指针（复制指针）
 * Cloneable接口为标记类：标记该类是否可被克隆
 */
public class WeeklyLog implements Cloneable{
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

    @Override
    public WeeklyLog clone(){
        try {
            return (WeeklyLog)super.clone();
        } catch (CloneNotSupportedException e) {
            //CloneAble接口为一个标记类，实现了才能使用Object的clone()进行克隆，否则抛出CloneNotSupportedException异常。
            System.out.println("当前类不支持克隆，需实现CloneAble接口");
            return null;
        }
    }
}
