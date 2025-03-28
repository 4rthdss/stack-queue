public class Stack<T> {

    private Node<T> top;
    private int totalElements;

    public void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.setNext(top);
        top = newNode;
        totalElements += 1;
    }

    public T pop() {
        if (!isEmpty()) {
            T value = top.getValue();
            top = top.getNext();
            totalElements -= 1;
            return value;
        }
        return null;
    }

    public T peek() {
        return isEmpty() ? null : top.getValue();
    }

    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[ ]";
        }
        Node<T> currentNode = top;
        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalElements; i++) {
            builder.append(currentNode.getValue());
            builder.append(", ");

            currentNode = currentNode.getNext();
        }

        builder.append("]");
        return builder.toString();
    }
}
