package tc.elp.java.datastructures; 

public class StackByArray extends DynamicArray implements Stack{

	public StackByArray(){
		super();
	}
	
	public boolean empty(){
		if(mySize==0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public int top() throws EmptyStackException{
		if(this.empty()){
			throw new EmptyStackException();
		}
		else{
			return super.get(this.size()-1);
		}
	}
	
	public void pop() throws EmptyStackException{
		if(this.empty()){
			throw new EmptyStackException();
		}
		else{
			super.push(this.mySize-1,0);
			this.mySize--;
		}
		//Gérer l'exception dans la classe DynamicArray
	}	
	
	public void push(int value){
		super.push(value);
	}

}
