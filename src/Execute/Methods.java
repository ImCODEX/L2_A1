package Execute;

public class Methods {

    int[] array_of_notes = new int[]{10, 14, 23, 25, 38, 41, 43, 47, 56, 59, 63, 66, 68, 74, 78, 86, 89, 90, 92, 95, 98};

    public int[] round_up(int[] array_of_notes) {
        int[] array_of_notes1 = array_of_notes.clone();
        for (int i = 0; i < array_of_notes1.length; i++) {
            if ((array_of_notes1[i] + 1) % 5 == 0)
                array_of_notes1[i] = array_of_notes1[i] + 1;
            else if ((array_of_notes1[i] + 2) % 5 == 0)
                array_of_notes1[i] = array_of_notes1[i] + 2;
        }
        return array_of_notes1;
    }

    //in: int[]; out: int[]
    //Determines if a note is not sufficient (<40)
    public int[] not_sufficient(int[] array_of_notes) {
        int[] not_sufficient_notes = new int[array_of_notes.length];
        int j = 0;
        for (int array_of_note : array_of_notes) {
            if (array_of_note < 40) {
                not_sufficient_notes[j] = array_of_note;
                j++;
            }
        }
        return not_sufficient_notes;
    }

    //in: int[]; out: int
    //Computes average of notes
    public int average(int[] array_of_notes){
        int avg=0;
        for (int array_of_note : array_of_notes) {
            avg += array_of_note;
        }
        avg /= array_of_notes.length;
        return avg;
    }

    //in: int[]; out: int
    //Determines the maximum note that will be rounded up
    public int max_rounded_up(int[] array_of_notes) {
        int max = 0;
        for (int i = 0; i < array_of_notes.length; i++) {
            if ((array_of_notes[i] + 1) % 5 == 0 && array_of_notes[i] > max) {
                array_of_notes[i] = array_of_notes[i] + 1;
                max = array_of_notes[i];
            }
            else if ((array_of_notes[i] + 2) % 5 == 0 && array_of_notes[i] > max) {
                array_of_notes[i] = array_of_notes[i] + 2;
                max = array_of_notes[i];
            }
        }
        return max;
    }

}
