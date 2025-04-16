package structures;

public class Queue {
    int queue[] = new int[5];
    int size = 0;
    int front = 0;
    int rear = 0;

    public static void main(String[] args) {
        Queue q = new Queue();

        q.enQueue(3);
        q.show();

        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);

        q.deQueue();

        q.show();
    }

    public void enQueue(int data) {
        if (rear < 5) {
            queue[rear] = data;
            rear++;
            size++;
        } else {
            System.out.println("Overflow");
        }
    }

    public int deQueue() {
        if (front <= rear) {
            int ret = queue[front];
            queue[front] = 0;
            front++;
            size--;
            return ret;
        }
        return -1;
    }

    public void show() {
        for (int i : queue) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
