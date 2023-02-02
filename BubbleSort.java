class BubbleSort {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 2;
        arr[3] = 11;
        arr[4] = 7;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] < arr[i]) {

                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }

            }

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}