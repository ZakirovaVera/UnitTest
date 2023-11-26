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

        double result = sut.AvgArray(arr);

        Assertions.assertEquals(2, result);
    }

    @Test
    @DisplayName("Сравнить среднее двух списков")
    void compareGreatAvgArray2Test() {
        sut = new CompareAvgArray(arr1, arrGreat);
        sut.CompareArray();
        Assertions.assertEquals(sut.GreatAvgArray2, sut.getResultMessage());
    }

    @Test
    @DisplayName("Сравнить среднее двух списков")
    void compareGreatAvgArray1Test() {
        sut = new CompareAvgArray(arrGreat, arr1);
        sut.CompareArray();
        Assertions.assertEquals(sut.GreatAvgArray1, sut.getResultMessage());
    }

    @Test
    @DisplayName("Сравнить среднее двух списков")
    void compareEqualityAvgTest() {
        sut = new CompareAvgArray(arrGreat, arrGreat);
        sut.CompareArray();
        Assertions.assertEquals(sut.EqualityAvg, sut.getResultMessage());
    }
}