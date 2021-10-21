package Execute;

public class Methods {

    int[] array_of_grades = new int[]{10, 14, 23, 25, 38, 41, 43, 47, 56, 59, 63, 66, 68, 74, 78, 86, 89, 90, 92, 95, 98};

    /**
     * Rounds up each element (i) in a give array
     * if the difference between i and the next multiple
     * @param array_of_grades: array of grades
     * @return: array of rounded up grades
     */
    public int[] round_up(int[] array_of_grades) {
        int[] array_of_grades1 = array_of_grades.clone();
        for (int i = 0; i < array_of_grades1.length; i++) {
            if ((array_of_grades1[i] + 1) % 5 == 0)
                array_of_grades1[i] = array_of_grades1[i] + 1;
            else if ((array_of_grades1[i] + 2) % 5 == 0)
                array_of_grades1[i] = array_of_grades1[i] + 2;
        }
        return array_of_grades1;
    }

    /**
     * Determines if a note is not sufficient (<40)
     * @param array_of_grades: array of grades
     * @return: array of insufficient grades
     */
    public int[] not_sufficient(int[] array_of_grades) {
        int[] not_sufficient_grades = new int[array_of_grades.length];
        int j = 0;
        for (int array_of_note : array_of_grades) {
            if (array_of_note < 40) {
                not_sufficient_grades[j] = array_of_note;
                j++;
            }
        }

        int[] not_sufficient_grades_filtered = new int[j];
        System.arraycopy(not_sufficient_grades, 0, not_sufficient_grades_filtered, 0, j);


        return not_sufficient_grades_filtered;
    }

    /**
     * Computes average of grades
     * @param array_of_grades: array of grades
     * @return: average of grades
     */
    public int average(int[] array_of_grades){
        int avg=0;
        for (int array_of_note : array_of_grades) {
            avg += array_of_note;
        }
        avg /= array_of_grades.length;
        return avg;
    }

    /**
     * Determines the maximum note that will be rounded up
     * @param array_of_grades: array of grades
     * @return: max note
     */
    public int max_rounded_up(int[] array_of_grades) {
        int max = 0;
        for (int i = 0; i < array_of_grades.length; i++) {
            if ((array_of_grades[i] + 1) % 5 == 0 && array_of_grades[i] > max) {
                array_of_grades[i] = array_of_grades[i] + 1;
                max = array_of_grades[i];
            }
            else if ((array_of_grades[i] + 2) % 5 == 0 && array_of_grades[i] > max) {
                array_of_grades[i] = array_of_grades[i] + 2;
                max = array_of_grades[i];
            }
        }
        return max;
    }

}
