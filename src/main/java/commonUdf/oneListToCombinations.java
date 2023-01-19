package commonUdf;
import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.ArrayList;

public class oneListToCombinations extends UDF{
    public ArrayList<ArrayList<Integer>> evaluate (ArrayList<Integer> all_num) {
        int all_num_size = all_num.size();
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < all_num_size; i++) {
            for (int j = i + 1; j < all_num_size; j++) {
                ArrayList<Integer> tmp = new ArrayList<Integer>();
                tmp.add(all_num.get(i));
                tmp.add(all_num.get(j));
                res.add(tmp);
            }
        }
//        System.out.println(res);
        return res;
    }
}
