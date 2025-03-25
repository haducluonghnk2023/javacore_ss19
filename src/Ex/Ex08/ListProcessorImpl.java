package Ex.Ex08;

import java.util.List;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public int sumOddNumbers(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                sum += integer;
            }
        }
        return sum;
    }

    @Override
    public boolean checkOdd(List<Integer> list) {
        return ListProcessor.super.checkOdd(list);
    }
}
