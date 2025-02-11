class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        return preorder(root,pre);

        
    }
    public static List<Integer> preorder(TreeNode root,List<Integer>pre){
        if(root==null){
            return pre;
        }
        pre.add(root.val);
        preorder(root.left,pre);
        preorder(root.right,pre);
        return pre;
    }
}
