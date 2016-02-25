# Problem 129. Sum Root to Leaf Numbers
Given a binary tree containing digits from 0-9 only, each root-to-leaf path could represent a number.

An example is the root-to-leaf path 1->2->3 which represents the number 123.

Find the total sum of all root-to-leaf numbers.

For example,
```
    1
   / \
  2   3
```
The root-to-leaf path 1->2 represents the number 12.
The root-to-leaf path 1->3 represents the number 13.

Return the sum = 12 + 13 = 25.

##Solution
+ java


##Analysis
题目的意思是从根节点到每一个叶节点路径的所有值组成一个数字，要求所有这些路径所形成数字的和。

首先是去找规律。可以发现，从root到leaf的一个路径上（在一个数中），每一个节点的parent节点是他的高一位数。也就是说, 假如任意一个存在child的节点 root. root.val=10*root.child.val.

因此在遍历一个树的时候，就可以利用这个规律去叠加，得到每个路径所代表的数字。

然后将他们相加即可。

可以recursive的做，也可以iterative做。（基本上每到tree的算法题都可以有这两种思路）

###complexity
方法一（recursive）：

时间：$$O(n)$$

空间：$$O(n)$$

方法二(iterative)：

时间：$$O(n)$$

空间：$$O(n)$$

###解法一 （java）［recursive］
```java
public int sumNumbers(TreeNode root) {
        if (root == null)
            return 0;
        return sumR(root, 0);
    }
    public int sumR(TreeNode root, int x) {
        if (root.right == null && root.left == null)
            return 10 * x + root.val;
        int val = 0;
        if (root.left != null)
            val += sumR(root.left, 10 * x + root.val);
        if (root.right != null)
            val += sumR(root.right, 10 * x + root.val);
        return val;
    }
```

###解法一 （java）［iterative］
```java

public int sumNumbers(TreeNode root) {
    int total = 0;
    LinkedList<TreeNode> q = new LinkedList<TreeNode>();
    LinkedList<Integer> sumq = new LinkedList<Integer>();
    if(root !=null){
        q.addLast(root);
        sumq.addLast(root.val);
    }
    while(!q.isEmpty()){
        TreeNode current = q.removeFirst();
        int partialSum = sumq.removeFirst();
        if(current.left == null && current.right==null){
            total+=partialSum;
        }else{
            if(current.right !=null){
                q.addLast(current.right);
                sumq.addLast(partialSum*10+current.right.val);
            }
            if(current.left !=null){
                q.addLast(current.left);
                sumq.addLast(partialSum*10+current.left.val);
            }
        }
    }
    return total;
}

```

##contribution
@roy3221

## Reference

[^1] [LeetCode 129. Sum Root to Leaf Numbers](https://leetcode.com/problems/sum-root-to-leaf-numbers/)

[^2] [LeetCode 129. Sum Root to Leaf Numbers discussion](https://leetcode.com/discuss/1711/can-you-improve-this-algorithm) by @potpie 
