public class Chooser<E extends Comparable<E>>{
    public PriorityQueue<E> getPrioridad(String prioridad){
        switch(prioridad){
        	case "Jcf":
        		return new Jcf<E>();
            case "VectorHeap":
                return new VectorHeap<E>();
            default: return null;
        }
    }
}