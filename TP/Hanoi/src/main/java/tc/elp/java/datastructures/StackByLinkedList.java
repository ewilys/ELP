package tc.elp.java.datastructures;

public class StackByLinkedList implements Stack{

	private LinkedListNode myNode;

	public StackByLinkedList() {
		myNode=null;		
	}

	public boolean empty(){//indique si la pile est vide
		if(myNode==null){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int top()throws EmptyStackException{// renvoi element du dessus
		if (empty()){
			throw new EmptyStackException();
		}
		else{
			return myNode.value();
		}
	}

	public void push(int aValue){//ajoute un élément au-dessus
		myNode=new LinkedListNode(aValue, myNode);
	}


	public void pop() throws EmptyStackException{//supprime l'élément du dessus
		if(empty()){
			throw new EmptyStackException();
		}
		else{
			myNode=myNode.next();
		}
	}

	public String toString(){
		String res="	"+myNode.value()+"\n";
		LinkedListNode next=myNode.next();
		while(next !=null){
			res=res+"	"+next.value()+"\n";
			next=next.next();
		}
		return res;
	}


}
