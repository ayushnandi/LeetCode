class MedianFinder {
    private PriorityQueue<Integer> lowerHalf; // max-heap
    private PriorityQueue<Integer> upperHalf; // min-heap

    public MedianFinder() {
        lowerHalf = new PriorityQueue<>((a, b) -> b - a);
        upperHalf = new PriorityQueue<>();
    }

    public void addNum(int num) {
        lowerHalf.offer(num);
        upperHalf.offer(lowerHalf.poll());

        if (lowerHalf.size() < upperHalf.size()) {
            lowerHalf.offer(upperHalf.poll());
        }
    }

    public double findMedian() {
        if (lowerHalf.size() > upperHalf.size()) {
            return lowerHalf.peek();
        } else {
            return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
        }
    }
}