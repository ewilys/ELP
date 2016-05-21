
class GraphStructByAdjMat extends SquareMatrix implements GraphStruct{
	
	private Node[] myNodeSet;

	public GraphStructByAdjMat(SquareMatrix m){
		super(m);
		if (!m.isSymmetric())
			throw new RuntimeException("Adj.Mat. not symmetric");

		//array of nodes
		myNodeSet=new Node[N];
		for(int i=0;i<N;i++){
			myNodeSet[i]= new Node(i);
		}
	}

	public GraphStructByAdjMat(int[][] data){
		this(new SquareMatrix(data));
	}

	public Node[] getNodeSet(){
		return myNodeSet;

	}

	public Node[] getNeighbors(Node aNode){
		
		int c=0;//counter
		for(int i=0;i<N;i++){
			if(data[aNode.getId()][i] !=0)
				c++;
		}

		Node[] res=new Node[c];
		c=0;
		for(int i=0;i<this.N;i++){	
			if(data[aNode.getId()][i] !=0){
				res[c]=myNodeSet[i];
				c++;
			}
		}
		
		return res;

	}

}
