import java.util.*;

class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BinaryTreeInorderTraversal {

    // Build tree from level order input
    public static TreeNode buildTree(int[] arr) {
        if (arr.length == 0 || arr[0] == -1)
            return null;

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);

        int i = 1;
        while (!q.isEmpty() && i < arr.length) {
            TreeNode curr = q.poll();

            // Left child
            if (i < arr.length && arr[i] != -1) {
                curr.left = new TreeNode(arr[i]);
                q.offer(curr.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != -1) {
                curr.right = new TreeNode(arr[i]);
                q.offer(curr.right);
            }
            i++;
        }

        return root;
    }

    // Iterative inorder traversal
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            res.add(root.val);
            root = root.right;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        TreeNode root = buildTree(arr);

        List<Integer> ans = inorderTraversal(root);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}