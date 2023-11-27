package dz6;

import java.util.ArrayList;

public class CompareAvgArray {
  public CompareAvgArray(ArrayList<Integer> array1, ArrayList<Integer> array2) {
    this.array1 = array1;
    this.array2 = array2;
  }


  private ArrayList<Integer> array1;
  private ArrayList<Integer> array2;

  public static final String GREAT_AVG_ARRAY_1 = "Первый список имеет большее среднее значение";
  public static final String GREAT_AVG_ARRAY_2 = "Второй список имеет большее среднее значение";
  public static final String EQUALITY_AVG = "Средние значения равны";

  public String getResultMessage() {
    return resultMessage;
  }

  private String resultMessage;


  public double avgArray(ArrayList<Integer> array) {
    int sum = 0;
    for (int i = 0; i < array.size(); i++) {
      sum = sum + array.get(i);
    }

    double avg = sum / array.size();
    return avg;
  }

  public void compareArray() {
    double avg1 = avgArray(array1);
    double avg2 = avgArray(array2);

    if (avg1 > avg2) {
      resultMessage = GREAT_AVG_ARRAY_1;
      return;
    }

    if (avg1 < avg2) {
      resultMessage = GREAT_AVG_ARRAY_2;
      return;
    }

    resultMessage = EQUALITY_AVG;
  }
}
