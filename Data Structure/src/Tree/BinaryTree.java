package Tree;

public class BinaryTree 
{
private TreeNode root; 

private class TreeNode
{
	private TreeNode left;
	private TreeNode right;
	private int data;
	
	public TreeNode(int data)
	{
		this.data=data;
	}
}


public void Binarytree()
{
	TreeNode First = new TreeNode(1);
	TreeNode Second = new TreeNode(2);
	TreeNode Third = new TreeNode(3);
	TreeNode Fourth = new TreeNode(4);
	TreeNode Fifth = new TreeNode(5);
	
	root=First;
	First.left=Second;
	First.right=Third;
	
	Second.right=Fourth;
	Second.left=Fifth;
	
}
public void traverseTree(TreeNode node)
{
    if (node != null) 
    {
      traverseTree(node.left);
      System.out.print(" " + node.data);
      traverseTree(node.right);
    }
  }

public void PreOrder(TreeNode root)
{
	if(root == null)
	{
		return;
	}
	   System.out.print(root.data +" ");
		PreOrder(root.left);
		PreOrder(root.right);
	
}
public void PostOrder(TreeNode root)
{
	if(root == null)
	{
		return;
	}
	PreOrder(root.left);
	PostOrder(root.right);
	System.out.print(root.data+" ");
}

public void InOrder(TreeNode root)
{
	if(root == null)
	{
		return;
	}
	InOrder(root.left);
	System.out.print(root.data +" ");
	InOrder(root.right);
}
public static void main(String[] args)
{
	BinaryTree bt=new BinaryTree();
	bt.Binarytree();
	System.out.print("Binary Tree: ");
    bt.traverseTree(bt.root);
    System.out.println();
    System.out.print("Preorder Traversal : " );
    bt.PreOrder(bt.root);
    System.out.println("");
    System.out.print("PostOrder Traversal : ");
    bt.PostOrder(bt.root);
    System.out.println("");
    System.out.print("InOrder Trtaversal : ");
    bt.InOrder(bt.root);
    
    
}

}
	
