import tc.elp.java.datastructures.*;

class Hanoi{

	void deplacer(Stack src, Stack dest){
		try{
			int val=src.top();
			src.pop();
			dest.push(val);
		}catch (EmptyStackException e){
			e.printStackTrace();
		} 
		
	}
	
	void hanoi(Stack src, Stack pivot, Stack dest, int val){
	
		if(val==1){
		deplacer(src,dest);
		}
		else{

		hanoi(src,dest,pivot,val-1);
		deplacer(src,dest);
		hanoi(pivot,src,dest,val-1);
		}
	}


	public static void main(String[]args){
	
		Stack src=new StackByArray();
		Stack pivot=new StackByArray();
		Stack dest=new StackByArray();
			
			if(src.empty()){
				int n = 10; 
	   		for (int i = n; i >= 1; i--){
	   		
					src.push(i);
				}
			}
			
		hanoi(src, pivot, dest, src.top());
	}
}
			
		
		
