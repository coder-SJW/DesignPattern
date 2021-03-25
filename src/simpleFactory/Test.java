import simpleFactory.ChartFactory;

import java.lang.reflect.InvocationTargetException;

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Chart pieChart = ChartFactory.getChart("PieChart");
    }
}
