package tc.elp.java.datastructures;

interface Stack{
	
	public boolean empty();//indique si la pile est vide
	
	public int top()throws EmptyStackException;// renvoi element du dessus

	public void push(int aValue);//ajoute un élément au-dessus


	public void pop() throws EmptyStackException;//supprime l'élément du dessus


}
