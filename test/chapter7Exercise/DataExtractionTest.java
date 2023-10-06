package chapter7Exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataExtractionTest {
    @Test
    void canExtractDataFromDataSet(){
        DataExtraction dataExtraction = new DataExtraction();
        int[][] dataSet = {
                {4, 2, 4, 1},
                {6, 8, 3, 6},
                {2, 6, 8, 2},
                {5, 8, 2, 6},

        };
        int row = 2;
        int startPosition = 2;
        int endPosition = 4;
//        when
        int[]result = dataExtraction.extractByRow(dataSet, row, startPosition, endPosition);
//        assert
        assertEquals(8, result[0]);
        assertEquals(3, result[1]);
        assertEquals(6, result[2]);
        assertEquals(3, result.length);


    }

    @Test
    void canExtractDataFromDataSetColumn(){
        DataExtraction dataExtraction = new DataExtraction();
        int[][] dataSet = {
                {4, 2, 4, 1},
                {6, 8, 3, 6},
                {2, 6, 8, 2},
                {5, 8, 2, 6},

        };
        int column = 2;
        int startPosition = 2;
        int endPosition = 4;
//        when
        int[]result = dataExtraction.extractByColumn(dataSet, column, startPosition, endPosition);
//        assert
        assertEquals(8, result[0]);
        assertEquals(6, result[1]);
        assertEquals(8, result[2]);
        assertEquals(3, result.length);


    }
}
