package heaps;

public class ElementPriority<T> implements Comparable<ElementPriority<T>> {

    private T element;
    private Priority priority;

    public ElementPriority(T element, Priority priority) {
        this.element = element;
        this.priority = priority;
    }

    @Override
    public int compareTo(ElementPriority<T> o) {
        return this.priority.compareTo(o.priority);
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public String toString() {
        return element.toString() + " " + priority.toString();
    }
}
