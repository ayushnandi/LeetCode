/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root==null)return list;
        postorder1(root);
        list.add(root.val);
        return list;
    }
    public List<Integer> postorder1(Node root) {
        if(root==null)return list;
        for(int i = 0; i < root.children.size() ; i++ ){
            postorder1(root.children.get(i));
            list.add(root.children.get(i).val);
        }
        return list;
    }
}