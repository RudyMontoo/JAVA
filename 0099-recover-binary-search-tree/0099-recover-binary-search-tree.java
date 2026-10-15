/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//  Method 1 
// class Solution {
//     List<TreeNode> list=new ArrayList<>();
    
//     public void recoverTree(TreeNode root){
//         if(root==null)return;
//         inorder(root);
//         List<TreeNode> list2=new ArrayList<>(list);
//         Collections.sort(list, (a, b) -> Integer.compare(a.val, b.val));
//         for(int i=0;i<list.size();i++){
//             if(list.get(i)!=list2.get(i)){swap(list.get(i),list2.get(i));
//             return;}
//         }
//     }
//     public void  inorder(TreeNode root){
//         if(root==null)return;
//         inorder(root.left);
//         list.add(root);
//         inorder(root.right);
//     }
//     public void swap(TreeNode a, TreeNode b){
//         int temp=a.val;
//         a.val=b.val;
//         b.val=temp;
//     }
// }

// method 2 optimize solution
class Solution{
    List<TreeNode> list=new ArrayList<>();
    TreeNode first=null,mid=null, last=null;

    public void recoverTree(TreeNode root){
        if(root==null)return;
        inorder(root);
        for(int i=1;i<list.size();i++){
            if(list.get(i-1).val>list.get(i).val){
                if(first==null){
                    first=list.get(i-1);
                    mid=list.get(i);
                }
                else last=list.get(i);
            }
        }
        if(last==null)swap(first,mid);
        else swap(first,last);
    }
    public void  inorder(TreeNode root){
        if(root==null)return;
        inorder(root.left);
        list.add(root);
        inorder(root.right);
    }
    public void swap(TreeNode a, TreeNode b){
        int temp=a.val;
        a.val=b.val;
        b.val=temp;
    }
}