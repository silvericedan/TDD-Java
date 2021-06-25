public class MySet {

    private int size = 0;
    private Object[] elements = new Object[5];

    public boolean isEmpty() {
        return (size < 1 );
    }

    public void add(Object item) {
        if(!contains(item)){
            if (size == elements.length){
                Object[] bigElements = new Object[elements.length*2];
                System.arraycopy(elements,0,bigElements,0,elements.length);
                elements = bigElements;
            }
            elements[size]=item;
            size += 1;
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(Object item) {
        return indexOf(item) > -1;
    }

    public int indexOf(Object item) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public boolean remove(Object item) {
        int idx = indexOf(item);
        if (idx > -1){
            elements[idx]=elements[size-1];
            elements[size-1]=null;
            size--;
            return true;
        }
        return false;
    }
}
