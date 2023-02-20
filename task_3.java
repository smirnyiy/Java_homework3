public class task_3 {
    public static void main(String[] args) {
        Merge merge = new Merge();
        int[] array = merge.creatArray();
        merge.printer(array);
        merge.sortArray(array);
        merge.printer(array);

    }

}

class Merge {

    public int[] creatArray() {
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 100));
        }
        return array;
    }

    public void printer(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", array[i]);
        }
        System.out.println();
    }

    public void sortArray(int[] array) {
        if (array.length < 2) {
            return;
        }

        int[] arrayA = new int[array.length / 2];
        int[] arrayB = new int[array.length - array.length / 2];

        for (int i = 0; i < array.length / 2; i++) {
            arrayA[i] = array[i];
        }
        for (int i = array.length / 2; i < array.length; i++) {
            arrayB[i - array.length / 2] = array[i];
        }
        sortArray(arrayA);
        sortArray(arrayB);
        merge(array, arrayA, arrayB, array.length / 2, array.length - array.length / 2);
    }

    public static void merge(
            int[] array, int[] arrayA, int[] arrayB, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (arrayA[i] <= arrayB[j]) {
                array[k++] = arrayA[i++];
            } else {
                array[k++] = arrayB[j++];
            }
        }
        while (i < left) {
            array[k++] = arrayA[i++];
        }
        while (j < right) {
            array[k++] = arrayB[j++];
        }
    }

}