package commonUdf;

import com.google.common.collect.Sets;
import org.apache.hadoop.hive.ql.exec.UDF;

public class twoItemsStringToIntersectionNum extends UDF {
    public int evaluate (String item1_str, String item2_str) {
        String[] item1 = item1_str.split(",");
        String[] item2 = item2_str.split(",");
//        System.out.println(Sets.newHashSet(item1));
        Sets.SetView<String> res = Sets.intersection(Sets.newHashSet(item1), Sets.newHashSet(item2));
        System.out.println(Sets.newHashSet(res));
        return res.size();
    }
}