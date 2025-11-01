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
}
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root==null) return res;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            Node curr = stack.pop();
            res.add(curr.val);
             List<Node> children = curr.children;
             if(children!=null) {
                for(int i=0; i<children.size(); i++) {
                    stack.push(children.get(i));
                }
             }
        }
        Collections.reverse(res);
        return res;
    }
}