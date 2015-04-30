package lab8;

public class CircularLinkedList <T> {
	CLLNode<T> ultimo = null; //ultimo.next é a base
	
	public void add(T t){
		if(ultimo == null){
			CLLNode<T> novo = new CLLNode<T>(t, null);
			ultimo = novo;
			ultimo.next = novo;
		}else{
			CLLNode<T> novo = new CLLNode<T>(t, ultimo.next);
			ultimo.next = (CLLNode<T>) novo;
			ultimo = (CLLNode<T>) novo;
		}		
	}
	
	public void remove(T t){
		if(ultimo != null){
			CLLNode<T> aux = (CLLNode<T>) ultimo.next;
			CLLNode<T> startPoint = aux;
			
			while(aux.next != startPoint){
				if(aux.next.elem.equals(t)){
					aux.next = aux.next.next;
				}else{
					aux = aux.next;
				}
			}
			if(aux.next.elem.equals(t)){ // é o ultimo
				aux.next = aux.next.next;
				ultimo = aux.next;
			}
			
			if(aux == aux.next){ // aux é o único elemento da lista
				if(aux.elem.equals(t)){
					ultimo = null; // apaga a lista
				}
			}
		}
	}	
}
