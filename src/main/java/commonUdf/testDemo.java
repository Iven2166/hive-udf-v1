package commonUdf;

import java.util.ArrayList;
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

        ArrayList<Integer> all_num = new ArrayList<Integer>();
        all_num.add(1);
        all_num.add(2);
        all_num.add(3);
        all_num.add(100);
        oneArrayIntToCombinations udf4 = new oneArrayIntToCombinations();
        ArrayList<ArrayList<Integer>> res4 = udf4.evaluate(all_num);
        System.out.println(res4);

        System.out.println("测试分割str后，得到两两组合");
        String users_str = "123,456,789,191,2421,12,2434,5555,6666,7777";
        usersStringToCombinations udf5 = new usersStringToCombinations();
        ArrayList<ArrayList<String>> res5 = udf5.evaluate(users_str);
        ArrayList<ArrayList<String>> res5_sample5 = udf5.evaluate(users_str,5);
        System.out.println(res5);
        System.out.println(res5_sample5);

        System.out.println("两个str用逗号分隔后，得到的交集");
        String item1_str = "123,456,789,191";
        String item2_str = "123,777,789";
        twoItemsStringToIntersectionNum udf6 = new twoItemsStringToIntersectionNum();
        int res6 = udf6.evaluate(item1_str, item2_str);
        System.out.println(res6);
    }
}
