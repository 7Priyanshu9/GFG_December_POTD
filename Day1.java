public class Day1 {

    static class TreeNode {
        int data;
        TreeNode left, right;

        public TreeNode(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static class DeadEndChecker {

        public static boolean isDeadEnd(TreeNode root) {
            return isDeadEndUtil(root, 0, Integer.MAX_VALUE);
        }

        private static boolean isDeadEndUtil(TreeNode node, int min, int max) {
            if (node == null) {
                return false; // Non-existent nodes don't form dead ends
            }

            // Check if the current node forms a dead end
            if (min == max) {
                return true;
            }

            // Recursively check left and right subtrees
            boolean left = isDeadEndUtil(node.left, min, node.data - 1);
            boolean right = isDeadEndUtil(node.right, node.data + 1, max);

            // Return true if a dead end is found in either subtree
            return left || right;
        }

        public static void main(String[] args) {
            // Example usage:
            TreeNode root = new TreeNode(8);
            root.left = new TreeNode(5);
            root.right = new TreeNode(9);
            root.left.left = new TreeNode(2);
            root.left.right = new TreeNode(7);
            root.right.right = new TreeNode(12);

            boolean result = isDeadEnd(root);
            System.out.println("Does the BST contain a dead end? " + result);
        }
    }
}
