package Zad4;

import java.util.Arrays;

public class ExamResults {
    private int[] points;

    public ExamResults(int[] points) {
        this.points = points;
    }

    public int[] getPoints() {
        return points;
    }


    public  static void main(String[] args){
        int[] points = {};

        ExamResults examResults = new ExamResults(points);

        // to od edytora bo zapomniałem java.util.Arrays.toString , abym nie musiał sobie pisać pętli for do wyświetlania tablicy i tak sobie obciołem java.util.
        System.out.println(Arrays.toString(examResults.getPoints()));

        points = new int[]{85, 90, 78, 92, 88};

        System.out.println(Arrays.toString(examResults.getPoints()));

        // Zmiana tablicy nie zmienia wartości w obiekcie


    }
}
