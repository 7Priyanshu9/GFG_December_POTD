import java.util.*;
class Node
{
	int data;
	Node left, right;

	Node(int val) {
		data = val;
		left = right = null;
	}
}

class Day3
{
	public static int countPairs(Node root1, Node root2, int x)
	{
		// Code here
		int count = 0;
		
		LinkedList<Node> list = new LinkedList<>();
		Set<Integer> set = new HashSet<>();
		
		if(root1 != null){
		    list.add(root1);
		}
		
		while(list.size() != 0){
		    
		   Node root = list.remove();
		   
		   set.add(root.data);
		    
		    if(root.left != null) list.add(root.left);
		    
		    if(root.right != null) list.add(root.right);
		}
		
		
		if(root2 != null){
		    list.add(root2);
		}
		
		while(list.size() != 0){
		    
		    Node root = list.remove();
		   
		   if(set.contains(x- root.data)) count++;
		   
		    
		    if(root.left != null) list.add(root.left);
		    
		    if(root.right != null) list.add(root.right);
		}
			
		return count;
	}
}