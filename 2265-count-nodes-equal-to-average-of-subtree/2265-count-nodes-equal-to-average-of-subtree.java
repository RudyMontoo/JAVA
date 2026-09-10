class Solution {
    int res = 0;

    public int averageOfSubtree(TreeNode root) {
        return avg(root);
    }

    public int avg(TreeNode root) {
        if (root == null) return 0;

        int sum = sum(root.left) + sum(root.right) + root.val;
        int count = noEle(root.left) + noEle(root.right) + 1;

        if ((sum / count) == root.val)
            res++;

        avg(root.left);
        avg(root.right);

        return res;
    }

    public int sum(TreeNode root) {
        if (root == null) return 0;

        int l = sum(root.left);
        int r = sum(root.right);

        return l + r + root.val;
    }

    public int noEle(TreeNode root) {
    if (root == null) return 0;
    return 1 + noEle(root.left) + noEle(root.right);
}
}