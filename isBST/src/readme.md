# Problem 098. Validate Binary Search Tree
Given a binary tree, determine if it is a valid binary search tree (BST).

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.
confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.


OJ's Binary Tree Serialization:
The serialization of a binary tree follows a level order traversal, where '#' signifies a path terminator where no node exists below.

Here's an example:
```
   1
  / \
 2   3
    /
   4
    \
     5
     ```
The above binary tree is serialized as "{1,2,3,#,#,4,#,#,5}".

##Solution
+ java


##Analysis
解决这个问题，前提是要知道什么是binary tree和binary Search Tree。 binary tree就是除了leaf的根节点之外，每一个root有且只有两个子节点的树。binary search tree就是排好序的binary tree。也就是说一个对于每一个root，一定满足root.left.val<root.val<root.right.val.

有两种方法来做。第一种方法是先得到给定的binary tree的inorder排列，然后检验此排列是否是升序的。可以是recursive的，也可以是iterative的。

第二种方法是给定每个节点的最大值和最小值，看其是否满足。

###complexity
方法一：

时间：$$⍬(2n)$$

空间：$$O(n)$$

方法二：

时间：$$⍬(n)$$

空间：$$O(n)$$

###解法一 （java）［inorder］
```java
List<Integer> inorder =new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        helper(root);
        if(inorder==null||inorder.size()==1) return true;
        for(int i=0;i<inorder.size()-1;i++){
            if(inorder.get(i)>=inorder.get(i+1)) return false;
        }
        return true;
    }
    private void helper(TreeNode root){
        if(root==null) return;
        helper(root.left);
        inorder.add(root.val);
        helper(root.right);
    }
```

###解法一 （java）［边界］
```java
 public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    boolean helper(TreeNode root, Integer min, Integer max) {
        if (root == null)
            return true;
        if ((min != null && root.val <= min) || (max != null && root.val >= max))
            return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
```


## Reference

[^1] [LeetCode 098.  Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)

[^2] [LeetCode 098.  Validate Binary Search Tree discussion](https://leetcode.com/discuss/73291/1-ms-java-solution-using-recursion) by @  ryan76, L
