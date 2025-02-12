class Solution {
    // Function to return a list of nodes visible from the top view
    // from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        // code here
        TreeMap<Integer,Integer> tm = new TreeMap<>();
       // tm.put(0,root.data);
        Queue<info> q = new LinkedList<>();
        q.add(new info(root,0));
        while(!q.isEmpty()){
            int sz = q.size();
            for(int i = 0;i<sz;i++){
                info  curr = q.remove();
                if (!tm.containsKey(curr.level)) {
                tm.put(curr.level, curr.node.data);
            }
                if(curr.node.left!=null) q.add(new info(curr.node.left,curr.level-1));
                if(curr.node.right!=null) q.add(new info(curr.node.right,curr.level+1));
            }
        }
            for(int val:tm.values()){
                ans.add(val);
            }
        
        return ans;
    }     
    
   static class info{
        Node node;
        int level;
        public info(Node node, int level){
            this.node = node;
            this.level = level;
        }
    }
}
