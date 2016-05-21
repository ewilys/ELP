
class Node{
	
	private int numNode;

	public Node(int n){
		numNode=n;
	}

	public int getId(){
		return numNode;
	}

	public boolean hasSameId(int id){
		return numNode==id;
	}

	@Override
	public String toString(){
		return "N"+numNode;
	}

	
}
