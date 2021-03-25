package simpleFactory;

import java.lang.reflect.InvocationTargetException;

//图表工厂
public class ChartFactory {
    public static Chart getChart(String chartType) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName(chartType);
        Chart chart = (Chart) c.getDeclaredConstructor().newInstance();
        return chart;
    }
}
