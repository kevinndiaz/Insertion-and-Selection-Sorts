package labs;


/**
 * 
 *
 * @author diazk2
 * @version 1.0.0 2022-01-26 Initial implementation
 *
 */
public class DNode <T> {
private T data;
private DNode <T> next;
private DNode <T> prev;

public DNode (T item) {
    data = item;
    next = prev = null;
}

public T getData () {
    return data;
}

public void setData(T data) {
    this.data = data;
}

public DNode<T> getPrev() {
    return prev;
}

public DNode<T> getNext() {
    return next;
}

public void setPrev(DNode<T> prev) {
    this.prev = prev;
}

public void setNext(DNode<T> next) {
    this.next = next;
}
}
	// end class DNode