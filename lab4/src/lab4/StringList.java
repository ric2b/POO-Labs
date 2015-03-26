package lab4;

//import java.io.*;

public class StringList 
{
	
	int lenght = 0;
	ListNode base = null;
	ListNode last = null;
	
	public StringList() 
	{ 
		// no-arg constructor
	} 
	
	public StringList(String s)
	{
		insert(s);
	}

	public void insert(String s)
	{
		ListNode aux = new ListNode();
		aux.s = s;
		
		if(base == null)
		{
			base = aux;
			last = aux;
		}
		else
		{
			last.next = aux;
		}		
		last = aux;
		aux = null;
		lenght++;
	} 
	
	public int remove(String s) 
	{
		int removed = 0;  
		
		while(base.s.equals(s) && base != null)
		{
			base = base.next;
			removed++;
		}
		
		ListNode aux = base;
		
		while(aux != null)
		{
			if(aux.next == null)
			{
				break;
			}
			if(aux.next.s.equals(s)) // nÃ£o queremos comparar as posiÃ§Ãµes de
			// memÃ³ria, mas sim ver se as strings sÃ£o iguais
			{
				if(aux.next.next != null)
				{
					aux.next = aux.next.next;
				}
				else
				{
					last = aux;
					aux.next = null;
				}
				
				removed++;
			}
			else
			{
				aux = aux.next;
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
	
	public static void main(String[] args) 
	{
		System.out.println("lab4444");
		
		StringList SL = new StringList("carro");
		
		//SL.insert("amendoa");
		//SL.insert("programa");
		//SL.remove("programa");
		//SL.insert("em 4K!");
		
		System.out.println(SL.toString());
		System.out.println(SL.lenght());
			
		// TODO Auto-generated method stub
	}

}
