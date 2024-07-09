//construct a binarytree using preorder array
//print the countNode
import java.util.*;
class TreeNode{
	int data;
	TreeNode left;
	TreeNode right;
	TreeNode(int data){
		this.data = data;
		left = right = null;
	}
}
class BinaryTree {
	int index = -1;
	TreeNode constructBT(int nodeArr[]){

		index++;
		if(nodeArr[index] == -1 ){
			return null;
		}
		TreeNode newNode = new TreeNode(nodeArr[index]);
		newNode.left = constructBT(nodeArr);
		newNode.right = constructBT(nodeArr);

		return newNode;
	}

	void preOrderBT(TreeNode root){
		if(root == null)
			return;
		System.out.print(root.data + " ");
		preOrderBT(root.left);
		preOrderBT(root.right);
	}
	
	void inOrderBT(TreeNode root){
                if(root == null)
                        return;
                
                inOrderBT(root.left);
		 System.out.print(root.data + " ");
                inOrderBT(root.right);
        }
	
	void postOrderBT(TreeNode root){
                if(root == null)
                        return;
       
                postOrderBT(root.left);
                postOrderBT(root.right);
		 System.out.print(root.data + " ");
        }

	int countNodes(TreeNode root){
		if (root == null){
			return 0;
		}
		int leftSTNodes = countNodes(root.left);
		int rightSTNodes = countNodes(root.right);

		return leftSTNodes + rightSTNodes + 1 ;
	}

	void levelOrder(TreeNode root){
		
		Queue<TreeNode> que = new LinkedList<>();
		que.add(root);
		que.add(null);

		while(!que.isEmpty()){
			
			TreeNode tempNode = que.remove();
			
			if(tempNode == null ){
				System.out.println();
				if(que.isEmpty()){
					break;
				}
				else{
					que.add(null);
				}
		}
			else{
				System.out.print(tempNode.data + " ");
				if(tempNode.left != null )
					que.add(tempNode.left);
				if(tempNode.right != null)
					que.add(tempNode.right);

			}
		}

	}

	int sumOfBT(TreeNode root){
		if(root == null)
			return 0;

		int sumOfLST = sumOfBT(root.left);
		int sumOfRST = sumOfBT(root.right);

		return sumOfLST + sumOfRST + root.data;
	}

	int max(int LSTheight ,int RSTheight){
		if(LSTheight <= RSTheight)
			return RSTheight;
		else
			return LSTheight;
	}

	int heightOfBT(TreeNode root ){
		  if(root == null)
                        return 0;
		  int LSTheight = heightOfBT(root.left);
		  int RSTheight = heightOfBT(root.left);

		  int treeHeight = max(LSTheight,RSTheight) + 1;

		  return treeHeight;
	}


	public static void main(String [] args){
		int nodeArr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
		
		BinaryTree bt = new BinaryTree();

		TreeNode root = bt.constructBT(nodeArr);

		bt.preOrderBT(root);
		System.out.println();

		bt.inOrderBT(root);
                System.out.println();
		
		bt.postOrderBT(root);
                System.out.println();

		//countNode
		int count = bt.countNodes(root);
		System.out.println("Total nOdes = "+ count);

		//level order
		bt.levelOrder(root);
		System.out.println();

		//sumOfBt
		System.out.println("Sum of BT " + bt.sumOfBT(root));

		//heightof bt
		System.out.println("Height of BT "+ bt.heightOfBT(root));
	}
}
