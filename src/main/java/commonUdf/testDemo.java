package commonUdf;

import java.util.List;

import static java.util.Arrays.asList;

public class testDemo {
    public static void main(String[] args) {
        System.out.println("测试余弦相似度: ");
        arrayDoubleSimCosine udf = new arrayDoubleSimCosine();
        List<Double> x = asList(2.0, 3.0, 5.0);
        List<Double> y = asList(1.0, 2.0, 4.0);
        double result = udf.evaluate(x, y);
        System.out.println(result);
    }
}
