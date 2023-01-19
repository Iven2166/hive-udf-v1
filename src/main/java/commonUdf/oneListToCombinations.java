package commonUdf;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.ArrayList;
import java.util.List;

public class oneListToCombinations extends UDF{
    public List<List<Integer>> evaluate (List<Integer> all_num) {
        int all_num_size = all_num.size();
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i = 0; i < all_num_size; i++) {
            for (int j = i + 1; j < all_num_size; j++) {
                List<Integer> tmp = new ArrayList<Integer>();
                tmp.add(all_num.get(i));
                tmp.add(all_num.get(j));
                res.add(tmp);
            }
        }
//        System.out.println(res);
        return res;
    }
}
