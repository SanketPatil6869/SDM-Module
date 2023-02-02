import java.util.Scanner;

class BubbleSort {

    public static void main(String[] args) {

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 2;
        arr[3] = 11;
        arr[4] = 7;

        System.out.println("Enter 1 for Bubble sort & 2 for Insertion sort 3 for exit");
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        switch (no) {
            case 1:
                for (int i = 0; i < arr.length; i++) {

                    for (int j = 0; j < arr.length; j++) {

                        if (arr[j] < arr[i]) {

                            int temp = arr[j];
                            arr[j] = arr[i];
                            arr[i] = temp;
                        }

                    }

                }

                break;
            case 2:
                int high = arr[0];

                for (int i = 0; i < arr.length; i++) {

                    for (int j = 0; j < arr.length; j++) {

                        if (arr[j] < high) {

                            int temp = arr[j];
                            arr[j] = high;
                            high = temp;
                        }

                    }

                }

                break;

        }
        while (no == 3)

            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

    }
}