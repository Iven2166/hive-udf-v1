package commonUdf;

import org.apache.hadoop.hive.ql.exec.UDF;
import java.util.List;

public class arrayDoubleSimCosine extends UDF {
    public double evaluate (List<Double> x, List<Double> y) {
//        求两个向量的余弦相似度
        double sum = 0.0;
        double x_square = 0.0;
        double y_square = 0.0;
        for (int i = 0; i < x.size (); i++) {
            sum += x.get (i) * y.get (i);
            x_square += Math.pow (x.get (i), 2);
            y_square += Math.pow (y.get (i), 2);
        }
        return sum / Math.sqrt (x_square) / Math.sqrt (y_square);
    }
}//