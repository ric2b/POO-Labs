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
			if(aux.next.s.equals(s)) // nao queremos comparar as posicoes de
			// memoria, mas sim ver se as strings sao iguais
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
	
	@Override 
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
	
	@Override 
	public boolean equals(Object obj) 
	{
		/*ListNode aux1 = this.base;
		ListNode aux2 = ((StringList) obj).base;
		
		if(this.lenght() != ((StringList) obj).lenght()) // listas de tamanho diferente
			return false;
		
		while(aux1.s.equals(aux2.s))
		{
			aux1 = aux1.next;
			aux2 = aux2.next;
			if(aux1 == null)
				return true;
		}
		
		return false;*/
		
		/* implementacao alternativa */
		if(this.toString().equals(((StringList) obj).toString()))
			return true;
	
		return false;
	}
	
	@Override 
	public int hashCode() 
	{
		return this.toString().hashCode(); 
	}
	
	@Override
	protected void finalize() throws Throwable
	{		
		while(this.base != null)
		{
			System.out.println("matarem-me! " + this.base.s);
			this.base = this.base.next;	// perder a referencia
		}	
	}
	
	public static void main(String[] args) throws Throwable 
	{	
		StringList SL1 = new StringList("carro");
		StringList SL2 = new StringList("carro");
		
		SL1.insert("amendoa");
		SL1.insert("programa");
		//SL.remove("programa");
		SL1.insert("em 4K!");
				
		SL2.insert("amendoa");
		SL2.insert("programa");
		//SL.remove("programa");
		SL2.insert("em 4K!");
		
		System.out.println("SL1: " + SL1.toString());
		
		System.out.println("SL2: " + SL2.toString());
		
		System.out.println(SL1.equals(SL2));
		
		System.out.println("SL1: " + SL1.hashCode());
				
		System.out.println("SL2: " + SL2.hashCode());
		
		SL1.finalize();
		
		SL2 = null;
		
		System.gc(); // calls finalize, it is called by the garbage collector on an object 
		//when garbage collection determines that there are no more references to the object.
		//anteriormente pusemos a referencia de SL2 a null, dai ter chamado o finalize.
		
		System.out.println("SL1: " + SL1.toString());
	}
}
