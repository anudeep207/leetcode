/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    
    private Map<Integer, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        if(null == node) {
            return null;
        }
        
        Node newNode = new Node(node.val);
        map.putIfAbsent(node.val, newNode);
        for(Node neighbour :  node.neighbors) {
            if (map.containsKey(neighbour.val)) {
                newNode.neighbors.add(map.get(neighbour.val));
               
            } else {
                 newNode.neighbors.add(cloneGraph(neighbour));
            }         
        }
        return newNode;
    }
}