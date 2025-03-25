package Ex.Ex07;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        for (Integer integer : list) {
            if (integer < 0) {
                return true;
            }
        }
        return false;
    }
}
