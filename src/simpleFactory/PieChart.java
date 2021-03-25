//图表类
public class PieChart implements Chart{
    public PieChart(){
        System.out.println("创建PieChart图表");
    }
    @Override
    public void display() {
        System.out.println("显示PieChart图表");
    }
}
