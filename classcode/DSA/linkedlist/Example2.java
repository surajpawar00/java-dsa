import java.util.*;

class Node{
	int data ;
	Node next = null;
	Node(int data ){
		this.data = data ;
	}
}
class LinkedList{
	Node head = null;
	//addNode
	void addNode(int data){
		Node newNode = new Node(data);
		if(head == null)
			head = newNode;
		else{
			Node temp = head ;
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = newNode;
		}
	
	}
	//printll
	void printll(){
		if (head == null){	
			System.out.println("Empty LinkedList");
			return;
		}else{
			Node temp = head;
			while(temp.next != null){
				System.out.print(temp.data + "->");
				temp = temp.next;
			}
            		System.out.println(temp.data);
		}
	}
	//reverse
	void reverseItr(){
		if(head == null)
			return;

		Node prev = null;
		Node curr = head;
		Node forward = null;

		while(curr != null){
			forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr= forward;
		}
		head = prev;
	
	}
	//reverse recursion
	void reverseRec(Node prev,Node curr){
		if(curr == null){
			head = prev;
			return;
		}else{

			Node forward = curr.next;
			curr.next = prev;
			prev = curr;
			curr= forward;
		}
		reverseRec(prev,curr);
		}
	//CountNode
	int countNode(){
		Node temp = head;
		int count = 0;
		while(temp != null){
			count++;
			temp = temp.next;

		}return count;
	}
	//middleNode1
	void middleNode(){
		int len = countNode();
		Node temp = head ;
		int cnt = 0;
		while (cnt<len/2){
			temp = temp.next;
			cnt++;
		}
		System.out.println(temp.data);
	
	}
	//middleNode2
	void middleNode2(){
		if(head == null)
			return;
		Node slow = head ;
		Node fast = head.next;
		while(fast != null){
			 fast = fast.next;
			 if(fast != null)
				 fast = fast.next;
			 slow = slow.next;
		}
		System.out.println(slow.data);

	}


	
class Client {
	public static void main(String []args){
		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		char ch ;
		do{
			System.out.println("1.addNode");
			System.out.println("2.printll");
			System.out.println("3.reverseItr");
			System.out.println("4.reverseRec");
			System.out.println("5.MiddleNode1");
			System.out.println("6.MiddleNode2");


			System.out.println("Enter your Choice");
			int choice = sc.nextInt();
			switch(choice){
				case 1:
					{
						System.out.println("Enter a Node");
						int data = sc.nextInt();
						ll.addNode(data);
					}
					break;
				case 2:
						ll.printll();
						break;

				case 3 : 
						ll.reverseItr();
						break;
				case 4 :
					{
						Node prev = null;
						ll.reverseRec(prev,ll.head);
						break;
					}
				case 5 :{
					ll.middleNode1();
					break;
				}

				case 6 :{
					ll.middleNode2();
					break; 
				}

				default:
						System.out.println("Wrong Choice");
							break;


			}

			System.out.println("Do you want to coumtinue ?");
			ch = sc.next().charAt(0);



		
		}while(ch == 'Y' || ch == 'y');

	}

}

