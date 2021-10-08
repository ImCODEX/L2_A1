package Execute;

public class Methods {

    int[] array_of_notes = new int[]{10, 14, 23, 25, 38, 41, 43, 47, 56, 59, 63, 66, 68, 74, 78, 86, 89, 90, 92, 95, 98};

    public int[] round_up() {
        for (int i = 0; i < array_of_notes.length; i++) {
            if ((array_of_notes[i] + 1) % 5 == 0)
                array_of_notes[i] = array_of_notes[i] + 1;
            else if ((array_of_notes[i] + 2) % 5 == 0)
                array_of_notes[i] = array_of_notes[i] + 2;
        }
        return array_of_notes;
    }

    public int[] not_sufficient() {
        int[] not_sufficient_notes = new int[array_of_notes.length];
        int j = 0;
        for (int i = 0; i < array_of_notes.length; i++) {
            if (array_of_notes[i] < 40) {
                not_sufficient_notes[j] = array_of_notes[i];
                j++;
            }
        }
        return not_sufficient_notes;
    }

    public int average(){
        int avg=0;
        for (int i = 0; i < array_of_notes.length; i++){
            avg += array_of_notes[i];
        }
        avg /= array_of_notes.length;
        return avg;
    }

    public int max_rounded_up() {
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
