package dz6;

import org.junit.jupiter.api.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

class CompareAvgArrayTest {

    private CompareAvgArray sut;
    ArrayList<Integer> arr1 = new ArrayList<Integer>();
    ArrayList<Integer> arrGreat = new ArrayList<Integer>();

    @BeforeEach
    void setUp() {
        arr1.add(2);
        arr1.add(2);
        arr1.add(2);

        arrGreat.add(3);
        arrGreat.add(3);
        arrGreat.add(3);
    }

    @AfterEach
    void tearDown() {

    }

    @Test
    @DisplayName("Проверка среднего списка")
    void avgArrayTest() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        sut = new CompareAvgArray(arr1, arrGreat);

        double result = sut.avgArray(arr);

        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("Среднее 2го списка больше среднего 1го списка")
    void compareGreatAvgArray2Test() {
        sut = new CompareAvgArray(arr1, arrGreat);
        sut.compareArray();
        Assertions.assertEquals(CompareAvgArray.GREAT_AVG_ARRAY_2, sut.getResultMessage());
    }

    @Test
    @DisplayName("Среднее 1го списка больше среднего 2го списка")
    void compareGreatAvgArray1Test() {
        sut = new CompareAvgArray(arrGreat, arr1);
        sut.compareArray();
        Assertions.assertEquals(CompareAvgArray.GREAT_AVG_ARRAY_1, sut.getResultMessage());
    }

    @Test
    @DisplayName("Среднее значение двух списков равны")
    void compareEqualityAvgTest() {
        sut = new CompareAvgArray(arrGreat, arrGreat);
        sut.compareArray();
        Assertions.assertEquals(CompareAvgArray.EQUALITY_AVG, sut.getResultMessage());
    }
}