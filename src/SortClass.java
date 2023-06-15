import java.util.Comparator;

public class SortClass implements Comparator <String>{
    @Override
    public int compare(String x1, String x2) {
        if(x1.length() > x2.length()){
            return 1;
        }
        else if(x1.length() < x2.length()){
            return -1;
        }
        else{
            return 0;
        }
    }
}

