package chapter7Exercise;

public class DataExtraction {
    public int[] extractByRow(int[][] dataSet, int row, int startPosition, int endPosition) {

        int[] rowData = dataSet[row - 1];
        int[] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;


        for (int i = startPosition - 1; i < endPosition; i++) {
            extractedData[count] = rowData[i];
            count ++;
            }

        return extractedData;
    }

    public int[] extractByColumn(int[][] dataSet, int column, int startPosition, int endPosition) {
        int[] columnData = dataSet[column - 1];
        int[] extractedData = new int[(endPosition - startPosition) + 1];
        int count = 0;

        for (int i = startPosition; i < endPosition; i++) {
            extractedData[count] = columnData[i];
            count++;

        }
        return extractedData;
    }
}
