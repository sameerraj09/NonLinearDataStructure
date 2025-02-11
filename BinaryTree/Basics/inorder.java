class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        return inorder(root,pre);

        
    }
    public static List<Integer> inorder(TreeNode root,List<Integer>in){
        if(root==null){
            return in;
        }
      
        inorder(root.left,in);
          in.add(root.val);
        inorder(root.right,in);
        return in;
    }
}
