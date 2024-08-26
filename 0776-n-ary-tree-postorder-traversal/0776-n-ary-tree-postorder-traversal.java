

class Solution {
    // List to store the postorder traversal result
    ArrayList<Integer> result = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        if (root == null) return result;

        // Recursively call postorder on each child
        for (Node child : root.children) {
            postorder(child);
        }

        // After all children are processed, add the current node's value
        result.add(root.val);

        return result;
    }
}