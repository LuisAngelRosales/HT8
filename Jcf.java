public class Jcf<E extends Comparable<E>> implements PriorityQueue<E>{

    private java.util.PriorityQueue<E> data;

    public Jcf(){
        data = new java.util.PriorityQueue<E>();
    }

    @Override
    public E getFirst() {
        return data.peek();
    }

    @Override
    public E remove() {
        return data.remove();
    }

    @Override
    public void add(E value) {
        data.add(value);
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public int size() {
        return data.size();
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public PriorityQueue<E> clone() {
        PriorityQueue<E> temporal = new  Jcf<E>();
		for (E e:data) {
			temporal.add(e);
		}	
		return temporal;
    }   
}