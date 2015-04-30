package lab8;

class CLLNode<T> {
	T elem;
	CLLNode<T> next;
	
	CLLNode(T t, CLLNode<T> next){
		elem = t;
		this.next = next;
	}
}
