import java.util.*;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        inorder(root,in);
        ans.add(in);
         List<Integer> pre = new ArrayList<>();
        preorder(root,pre);
        ans.add(pre);
         List<Integer> post = new ArrayList<>();
        postorder(root,post);
        ans.add(post);

return ans;

        // Write your code here.

    }
    public static List<Integer> preorder(TreeNode root,List<Integer>pre){
        if(root==null){
            return pre;
        }
        pre.add(root.data);
        preorder(root.left,pre);
        preorder(root.right,pre);
        return pre;

    }
    public static List<Integer> inorder(TreeNode root,List<Integer>in){
        if(root==null){
            return in;
        }
        
        inorder(root.left,in);
        in.add(root.data);
        inorder(root.right,in);
        return in;

    }


        public static List<Integer> postorder(TreeNode root,List<Integer>post){
        if(root==null){
            return post;
        }
        
        postorder(root.left,post);
        postorder(root.right,post);
        post.add(root.data);
        return post;

    }
}
