package Execute;

public class Methods {


    /**
     * Rounds up each element (i) in a give array
     * if the difference between i and the next multiple
     * @param arrayOfGrades: array of grades
     * @return: array of rounded up grades
     */
    public int[] roundUp(int[] arrayOfGrades) {
        int[] arrayOfGrades1 = arrayOfGrades.clone();
        for (int i = 0; i < arrayOfGrades1.length; i++) {
            if ((arrayOfGrades1[i] + 1) % 5 == 0)
                arrayOfGrades1[i] = arrayOfGrades1[i] + 1;
            else if ((arrayOfGrades1[i] + 2) % 5 == 0)
                arrayOfGrades1[i] = arrayOfGrades1[i] + 2;
        }
        return arrayOfGrades1;
    }

    /**
     * Determines if a note is not sufficient (<40)
     * @param arrayOfGrades: array of grades
     * @return: array of insufficient grades
     */
    public int[] notSufficient(int[] arrayOfGrades) {
        int[] notSufficientGrades = new int[arrayOfGrades.length];
        int j = 0;
        for (int arrayOfNote : arrayOfGrades) {
            if (arrayOfNote < 40) {
                notSufficientGrades[j] = arrayOfNote;
                j++;
            }
        }

        int[] notSufficientGradesFiltered = new int[j];
        System.arraycopy(notSufficientGrades, 0, notSufficientGradesFiltered, 0, j);

        return notSufficientGradesFiltered;
    }

    /**
     * Computes average of grades
     * @param arrayOfGrades: array of grades
     * @return: average of grades
     */
    public int average(int[] arrayOfGrades){
        int average=0;
        for (int arrayOfNote : arrayOfGrades) {
            average += arrayOfNote;
        }
        average /= arrayOfGrades.length;
        return average;
    }

    /**
     * Determines the maximum rounded up grade
     * @param arrayOfGrades: array of grades
     * @return: max grade
     */
    public int maxRoundedUp(int[] arrayOfGrades) {
        int max = 0;
        for (int arrayOfGrade : arrayOfGrades)
            if (arrayOfGrade % 5 >= 3 && arrayOfGrade > max)
                max = arrayOfGrade + (5 - arrayOfGrade % 5);

        return max;
    }

}
