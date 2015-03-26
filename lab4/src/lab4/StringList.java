package lab4;

public class StringList {
	
	int lenght = 0;
	ListNode base = null;
	ListNode last = null;
	
	public StringList () { // no-arg constructor
	} 

	public void insert(String s) {
		ListNode aux = new ListNode();
		aux.s = s;
		
		if(base == null)
		{
			base.next = aux;
		}
		
		last.next = aux;
		aux = null;
		lenght++;
	} 
	
	public int remove(String s) {
		int removed = 0;  
		
		while(!(base.s.equals(s)) && base != null)
		{
			base = base.next;
		}
		
		ListNode aux = base;
		ListNode aux2 = null;
		
		while(aux != null)
		{
			if(aux.next.s.equals(s)) // não queremos comparar as posições de
			// memória, mas sim ver se as strings são iguais
			{
				aux2 = aux.next.next;
				aux.next = aux2;
				removed++;
			}
			else
			{
				aux = aux2;
			}
		}		
		
		lenght -= removed;
		return removed;
	} 
	
	public int lenght() 
	{
		return lenght;
	} 
	
	public String toString() 
	{
		ListNode aux = base;
		String liststring = "{";
		
		while(aux != null)
		{
			liststring = liststring + aux.s;
			if(aux.next != null){
				liststring += ",";	
			}
			aux = aux.next;
		}
	
		liststring += "}";
		
		return liststring;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}

