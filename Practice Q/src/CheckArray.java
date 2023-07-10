public class CheckArray {
    public static void main(String[] args) {
        int[] numbs = {2, 4, 5, 6, 8, 10, 2, 3};
        boolean ans = checkArray(numbs);
        System.out.println(ans);
    }

    static boolean checkArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) return false;
        }

        return true;
    }


}
