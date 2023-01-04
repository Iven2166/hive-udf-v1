package commonUdf;
import com.google.common.collect.Sets;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.List;

public class listStringIntersectionNum extends UDF{
    public int evaluate (List<String> list1, List<String> list2) {
        // 提前确保两个list应该是都去重了
//        list1.retainAll(list2); // The code is simple but the algorithmic complexity is poor: O(n×m)
        Sets.SetView<String> res = Sets.intersection(Sets.newHashSet(list1), Sets.newHashSet(list2));
        System.out.println(res);
        return res.size();
    }
}
