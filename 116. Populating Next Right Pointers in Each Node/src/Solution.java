/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
 
 
/* The idea is keep two pointer: 1. One pointer points the start of each level; 2. One pointer points the node in each level.
*/ 
public class Solution {
    public void connect(TreeLinkNode root) {
        TreeLinkNode level_start = root;
        while(level_start != null) {
            TreeLinkNode level_pointer = level_start;
            while(level_pointer != null) {
                if(level_pointer.left != null) level_pointer.left.next = level_pointer.right;
                if(level_pointer.right != null && level_pointer.next !=null) level_pointer.right.next = level_pointer.next.left;
                level_pointer = level_pointer.next;
            }
            level_start = level_start.left;
        }
    }
}

