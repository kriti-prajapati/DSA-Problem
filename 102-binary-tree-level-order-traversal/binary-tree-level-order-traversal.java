/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>() ;
        if(root == null){
            return ans;
        }
        Queue<TreeNode> treeNodeQueue=new LinkedList<>();
        treeNodeQueue .add(root);
        while(!treeNodeQueue.isEmpty()){
            int size=treeNodeQueue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode treeNode=treeNodeQueue.poll();
                level.add(treeNode.val);
                if(treeNode.left!=null){
                    treeNodeQueue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    treeNodeQueue.add(treeNode.right);
                }
            }
            ans.add(level);
        }
        return ans;
    }
}