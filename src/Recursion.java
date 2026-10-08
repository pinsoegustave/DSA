public class Recursion {

    public static void main(String[] args) {
        int x = 3;

        int arr[] = new int[] {25, 60, 18, 3, 10, 47};

        int index = recursiveSearch(arr, 0, arr.length - 1, x);

        if (index != -1) {
            System.out.println("Found at index: " + index);
        } else {
            System.out.println("Not found");
        }
    }

    static int recursiveSearch(int[] arr, int l, int r, int x) {
        if(r < l) {
            return -1;
        }
        if(arr[r] == x) {
            return r;
        }
        if(arr[l] == x) {
            return l;
        }

        return recursiveSearch(arr, l+1, r-1, x);
    }

}

