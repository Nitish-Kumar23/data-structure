package Arrays;

public class EvenDigits {
    public static void main(String[] args) {
        int[] array = {12, 4278, 156, 37, 319};
        System.out.println(getEvenDigitsCount(array));
    }

    /**
     * Given an array nums of integers, return how many of them contain an even number of digits.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     * Example 2:
     * <p>
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     *
     * @param array
     * @return
     */
    private static int getEvenDigitsCount(int[] array) {
        int count = 0;
        for (int element : array) {
            if (element < 0) {
                element = element * -1;
            }
            if (isEvenDigitNumber(element)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isEvenDigitNumber(int element) {
        int digitCount = getDigitCountV2(element);
        return digitCount % 2 == 0;
    }

    private static int getDigitCount(int element) {
        int digitCount = 0;
        while (element != 0) {
            digitCount++;
            element = element / 10;
        }
        return digitCount;
    }

    /**
     * optimized way to get digits count
     *
     * @param element
     * @return
     */
    private static int getDigitCountV2(int element) {
        return (int) (Math.log10(element) + 1);
    }
}
