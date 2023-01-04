package commonUdf;

import java.util.List;

import static java.util.Arrays.asList;

public class testDemo {
    public static void main(String[] args) {
        System.out.println("测试余弦相似度: ");
        List<Double> x = asList(2.0, 3.0, 5.0);
        List<Double> y = asList(1.0, 2.0, 4.0);
        arrayDoubleSimCosine udf1 = new arrayDoubleSimCosine();
        double result = udf1.evaluate(x, y);
        System.out.println(result);

        System.out.println("测试交集");
        List<Integer> list1 = asList(1,2,3,4,3,4,5,6);
        List<Integer> list2 = asList(3,4,5,6,7,8,9,4);
        listIntIntersectionNum udf2 = new listIntIntersectionNum();
        int res2 = udf2.evaluate(list1, list2);
        System.out.println(res2);

        List<String> list1_string = asList("1","2","3","4","3","4","5","6");
        List<String> list2_string = asList("3","4","5","6","7","8","9","4");
        listStringIntersectionNum udf3 = new listStringIntersectionNum();
        int res3 = udf3.evaluate(list1_string, list2_string);
        System.out.println(res3);

    }
}
