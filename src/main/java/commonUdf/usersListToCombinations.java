package commonUdf;

import org.apache.hadoop.hive.ql.exec.UDF;

import java.util.*;

public class usersListToCombinations extends UDF {
    public ArrayList<ArrayList<String>> evaluate (List<String> users_list){
        int sample_largest_num = 1000;
        return evaluate(users_list, sample_largest_num);
    }

    public ArrayList<ArrayList<String>> evaluate (List<String> users_list, int sample_largest_num) {
//        List<String> users_str_split = Arrays.asList(users_str.split(","));
        List<String> users_str_split_sample = createRandoms(users_list, sample_largest_num);
        ArrayList<ArrayList<String>> res = new ArrayList<ArrayList<String>>();
        for (int i = 0; i < users_str_split_sample.size(); i++) {
            for (int j = i + 1; j < users_str_split_sample.size(); j++) {
                ArrayList<String> tmp = new ArrayList<>();
                tmp.add(users_str_split_sample.get(i));
                tmp.add(users_str_split_sample.get(j));
                res.add(tmp);
            }
        }
        return res;
    }

    private List<String> createRandoms(List<String> list, int n) {
        Map<Integer,String> map = new HashMap();
        List<String> news = new ArrayList();
        if (list.size() <= n) {
            return list;
        } else {
            while (map.size() < n) {
                int random = (int)(Math.random() * list.size());
                if (!map.containsKey(random)) {
                    map.put(random, "");
                    news.add(list.get(random));
                }
            }
            return news;
        }
    } // https://blog.csdn.net/breakaway_01/article/details/109094661
}
