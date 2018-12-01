/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0){
            return new LinkedList<TreeNode>();
            
        }
        return generator(1,n);
        
    }
    public LinkedList<TreeNode> generator(int start, int end){
        LinkedList<TreeNode> alla = new LinkedList<TreeNode>();
        if(start>end){
            alla.add(null);
            return alla;
        }
        for(int i = start;i<=end;i++){
            LinkedList<TreeNode> lefty = generator(start,i-1);
            LinkedList<TreeNode> righty = generator(i+1,end);
            for(TreeNode l:lefty){
                for(TreeNode r:righty){
                    TreeNode current = new TreeNode(i);
                    current.left = l;
                    current.right = r;
                    alla.add(current);
                }
            }
        }
        return alla; 
    }
}
