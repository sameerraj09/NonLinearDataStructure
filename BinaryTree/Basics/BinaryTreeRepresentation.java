// You are given an array nodes. It contains 7 integers, which represents the value of nodes of the binary tree in level order traversal. You are also given a root of the tree which has a value equal to nodes[0].

// Your task to construct a binary tree by creating nodes for the remaining 6 nodes.
class Solution{
    public static void createTree(Node root0, ArrayList<Integer> v ){
        // Code here
        for(int i =0;i<v.size();i++){
        root0.left = new Node(v.get(1));
        root0.right = new Node(v.get(2));
        root0.left.left = new Node(v.get(3));
        root0.left.right = new Node(v.get(4)); 
        root0.right.left = new Node(v.get(5));
        root0.right.right = new Node(v.get(6));
        }
    }
}
