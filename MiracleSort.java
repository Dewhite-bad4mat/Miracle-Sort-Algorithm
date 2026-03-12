import java.util.Arrays;

public class MiracleSort {
    private static long comparisons = 0;

    public static void main(String[] args) {
        int[] data = {3, 1, 4, 1, 5, 9};
        // If you provide a list that is already in descending order (e.g., {5, 4, 3, 2, 1})
        // then it will print the result
        System.out.println("Original: " + Arrays.toString(data));

        miracleSort(data);

        System.out.println("Sorted (Descending): " + Arrays.toString(data));
        System.out.println("Total Comparisons: " + comparisons);
        System.out.println("Total Swaps: 0 (The universe does the work!)");
    }

    public static void miracleSort(int[] array) {
        while (!isSortedDescending(array)) {
            // Wait for a miracle to occur.
            // In a real miracle sort, we perform no operations here.
            try {
                Thread.sleep(100); // Optional: prevents CPU meltdown while waiting for the miracle
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private static boolean isSortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            comparisons++;
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

/*
* Here is the breakdown of what happens when you hit "Run":

** Scenario A:
  //The list is already sortedIf you provide a list that is already in descending order (e.g., {5, 4, 3, 2, 1}), the code will:
* 1. Enter the miracleSort method.
* 2. 3Run the isSortedDescending check once.
* 3. Find that every element is $\ge$ the next one.
* 4. Exit the loop immediately and print the results.

** Scenario B:
  //The list is NOT sorted (The likely case)If you provide the list from the code snippet ({3, 1, 4, 1, 5, 9}), the code will:
* 1. Check the list and see that 3 > 1 (True), but 1 > 4 (False).
* 2. Return false to the while loop.
* 3. Enter an infinite loop.
* 4. Every 100 milliseconds (due to the Thread.sleep), it will wake up, check the list again, see it is still unsorted, and go back to sleep.

 __There is no final output.
 __The program will simply hang in your console indefinitely.
 __It will look like the program is "loading" or "frozen," but it's actually just waiting for that miracle.__
*/

/*
    __STEP-BY-STEP EXAMPLE__
  Initial List: [1, 5, 2]
 1. Check: Is $1 \ge 5$? No.
 2. Wait: The program pauses.
 3. Check: Is the list sorted yet? No.
 4. The Miracle: A solar flare hits the computer, flipping bits. The memory now reads [5, 2, 1].
 5. Check: Is $5 \ge 2$? Yes. Is $2 \ge 1$? Yes.
 6. Done: The list is now "sorted."
 */
/*COMPLEXITY ANALYSIS

    Case            Time Complexity             Reasoning
Best Case               0(n)                The list is already sorted; we check it once and finish.
Average Case            ∞(Infinity)         A miracle is statistically unlikely to occur within our lifetime.
Worst Case              ∞(Infinity)         Without external interference, the loop never terminates.

SPACE COMPLEXITY:
    $O(1)$. We aren't using any extra memory; we are just waiting for the memory we have to
    change on its own.

            __OUTPUT__
        Random Order
    Original: [3, 1, 4, 1, 5, 9]

        In Descending Oreder
    Original: [9, 7, 6, 5, 3, 1]
    Sorted (Descending): [9, 7, 6, 5, 3, 1]
    Total Comparisons: 5
    Total Swaps: 0 (The universe does the work!)
    
    Process finished with exit code 0
*/
