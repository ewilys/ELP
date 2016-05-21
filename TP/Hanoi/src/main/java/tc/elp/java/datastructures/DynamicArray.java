package tc.elp.java.datastructures; 

public class DynamicArray{

	protected int mySize;
	protected int[] myArray;

	public DynamicArray(){
		mySize=0;
		myArray=new int[1];
		
	}

	public int get(int aIndex){
		if (aIndex >= capacity()){
			System.out.println("index out of array");
			return -256;
		}
			
		return myArray[aIndex];
	}
	
	public void push(int aIndex, int aValue){
		if(aIndex<0 || aIndex>= capacity()){
			System.out.println("index out of array");
		}
		else{
			myArray[aIndex]=aValue;
			if (aIndex >= mySize)
				mySize++;
		} 
	}

	public void push (int aValue){
		if (mySize+1 <= this.capacity()){ // there is still place inside the array
			myArray[mySize]=aValue;
			mySize++;
		}
		else{ // the array is too short
			int[] arrayBis= new int[2*this.capacity()];
			for(int i =0;i<this.capacity();i++){
				arrayBis[i]=myArray[i];
			}
			arrayBis[mySize]=aValue;
			myArray=arrayBis;
			mySize++;
		}	
	}

	public int size(){
		return mySize;
	}

	public int capacity(){
		return myArray.length;
	}
	
	public String toString(){
		String res="| ";
		for (int i=0;i<this.capacity();i++){
			res=res+myArray[i]+" | ";
		}
		res=res+"\n";
		return res;
	}	

}

