package Task2.Task2_classes;

import java.util.Comparator;

public class EvaluationSum_Comparator implements Comparator<Abiturient> {
    @Override
    public int compare(Abiturient a1, Abiturient a2) {
        if (a1.GetEvaluationSum() == a2.GetEvaluationSum())
            return 0;
        else if (a1.GetEvaluationSum() < a2.GetEvaluationSum())
            return 1;
        else
            return -1;
    }
}
