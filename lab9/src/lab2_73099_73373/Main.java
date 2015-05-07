package lab2_73099_73373;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		IterableArray<String> stringArray = new IterableArray<String>(new String[4]); 
	
		try {
			stringArray.add("Hello");
			stringArray.add("Iterable");
			stringArray.add("Array");
			stringArray.add("!");
		}
		catch (IAException except){
			System.out.println("IAException :(");
		}
		
		Iterator<String> arrayIterator = stringArray.iterator();
		
		while(arrayIterator.hasNext()) {
			System.out.println(arrayIterator.next());			
		}
		
		arrayIterator = stringArray.iterator(); // iterador novo para começar do inicio
		
		while(arrayIterator.hasNext()) {			
			System.out.println("a remover: " + arrayIterator.next());
			arrayIterator.remove();
		}
	}
}
