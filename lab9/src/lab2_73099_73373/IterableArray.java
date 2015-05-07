package lab2_73099_73373;

import java.util.Iterator;

public class IterableArray<T> implements Iterable<T> {
	
	T[] array = null;
	
	public IterableArray(T[] arrayArg) {
		array = arrayArg; //estao a referenciar o mesmo objecto
	}		
	
	public void add(T element) throws IAException {
		int k = 0; // numero de entradas diferentes de null
		
		for(T aux : array) {
			if(k == array.length) {
				throw new IAException();
			}
			if(aux == null) {
				array[k] = element;
				break;
			}
			k++;							
		}	
	}
	
	public Iterator<T> iterator() {
		return new IAIterator();
	}
	
	protected class IAIterator implements Iterator<T> {
		int position = -1;
		boolean removable = false;
		
		@Override
		public boolean hasNext() {
			if(position+1 < array.length) {
				if(array[position+1] != null) {
					return true;
				}				
			}
			return false;
		}

		@Override
		public T next() {
			position++;
			removable = true;
			return array[position];
		}

		@Override
		public void remove() throws IllegalStateException {
			if(position == -1 || removable == false) {			
				throw new IllegalStateException();
			}
			removable = false;
			
			if(position != array.length-1) {
				for(int r = position+1; r < array.length && array[r-1] != null; r++) {
					array[r-1] = array[r];
				}
			}
									
			array[array.length-1] = null;
			position--;
		}
	}
}
