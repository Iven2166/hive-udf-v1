package commonUdf;

import com.google.common.collect.Sets;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.List;

public class twoItemsListOfStringToIntersectionNum extends UDF {
        public int evaluate (List<String> item1, List<String> item2) {
            Sets.SetView<String> res = Sets.intersection(Sets.newHashSet(item1),
                    Sets.newHashSet(item2));
            System.out.println(Sets.newHashSet(res));
            return res.size();
        }
    }
