class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {

        val = x;
    }
}

class Sol {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q) return root;

        TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);


              if(left != null && right != null) return root;


                       return left != null ? left : right;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        Sol sol = new Sol();


        TreeNode ans = sol.lowestCommonAncestor(root, root.left, root.right);

System.out.println(ans.val);


    }
}
