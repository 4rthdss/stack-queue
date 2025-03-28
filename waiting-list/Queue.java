public class Queue<T> {

    private Node<T> front;
    private Node<T> rear;
    private int totalElements;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.totalElements = 0;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node<>(value);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.setNext(newNode);
        }
        rear = newNode;
        totalElements++;
    }

    public T dequeue() {
        if (!isEmpty()) {
            T value = front.getValue();
            front = front.getNext();
            totalElements--;
            if (front == null) {
                rear = null;
            }
            return value;
        }
        return null;
    }

    public T peek() {
        return isEmpty() ? null : front.getValue();
    }

    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }
        Node<T> currentNode = front;
        StringBuilder builder = new StringBuilder("[");

        while (currentNode != null) {
            builder.append(currentNode.getValue());
            builder.append(", ");
            currentNode = currentNode.getNext();
        }

        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}
