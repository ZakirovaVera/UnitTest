package dz6;

import java.util.ArrayList;

public class CompareAvgArray {
    public CompareAvgArray(ArrayList<Integer> array1, ArrayList<Integer> array2) {
        this.array1 = array1;
        this.array2 = array2;
    }


    private ArrayList<Integer> array1;
    private ArrayList<Integer> array2;

    public final String GreatAvgArray1 = "Первый список имеет большее среднее значение";
    public final String GreatAvgArray2 = "Второй список имеет большее среднее значение";
    public final String EqualityAvg = "Средние значения равны";

    public String getResultMessage() {
        return resultMessage;
    }

    private String resultMessage;


    public double AvgArray(ArrayList<Integer> array) {
        int sum = 0;
        for (int i = 0; i < array.size(); i++) {
            sum = sum + array.get(i);
        }

        double avg = sum / array.size();
        return avg;
    }

    public void CompareArray() {
        double avg1 = AvgArray(array1);
        double avg2 = AvgArray(array2);

        if (avg1 > avg2) {
            resultMessage = GreatAvgArray1;
            return;
        }

        if (avg1 < avg2) {
            resultMessage = GreatAvgArray2;
            return;
        }

        resultMessage = EqualityAvg;
    }
}
