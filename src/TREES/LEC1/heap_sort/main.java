package TREES.LEC1.heap_sort;

public class main {
    public static void main(String[] args) throws Exception {
        heap<Integer> heap = new heap<>();
        heap.insert(34);
        heap.insert(12);
        heap.insert(56);
        heap.insert(9);
        heap.insert(27);
        System.out.println(heap.delete());
        System.out.println("Heap Sort Output: " + heap.heapSort());
    }
}