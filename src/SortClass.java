import java.util.Comparator;

public class SortClass implements Comparator <String>{
    @Override
    public int compare(String x1, String x2) {
        return Integer.compare(x1.length(), x2.length());
    }
}

