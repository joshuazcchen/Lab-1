/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int k = 100;
        int i = 1;
        while (i < k) {
            i = fizzbuzzinging(i);
        }
    }

    private static int fizzbuzzinging(int i) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Fizz Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Fizz");
        } else if (i % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(i);
        }
        i++;
        return i;
    }
}