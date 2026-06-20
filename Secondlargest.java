public class Secondlargest {
    public static void main(String[] args) {
        int a[] = {20, 40, 70, 60, 10, 80};
        int largest = a[0];
        int secondlargest = Integer.MIN_VALUE;

        for (int i = 1; i < a.length; i++) {
            if (largest < a[i]) {
                largest = a[i];
            }
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondlargest && a[i] < largest) {
                secondlargest = a[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondlargest);
    }
}
