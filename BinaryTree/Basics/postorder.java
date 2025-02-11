class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> pre = new ArrayList<>();
        return postorder(root,pre);

        
    }
    public static List<Integer> postorder(TreeNode root,List<Integer>post){
        if(root==null){
            return post;
        }
      
        postorder(root.left,post);
        postorder(root.right,post);
         post.add(root.val);
        return post;
    }
}
