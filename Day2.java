import java.util.Stack;

public class Day2 {

    public static boolean isBSTInorder(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int prev = Integer.MIN_VALUE;

        for (int num : arr) {
            // Check if the current element is smaller than the previous
            if (num < prev) {
                return false;
            }

            // Simulate inorder traversal using a stack
            while (!st.isEmpty() && num > st.peek()) {
                prev = st.pop();
            }

            // Push the current element onto the stack
            st.push(num);
        }

        return true;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {2,4,1};

        boolean result = isBSTInorder(arr);
        System.out.println("Does the array represent an inorder traversal of a BST? \n " + result);
    }
}