class MyCalendar {
    ArrayList<Integer> arr ;
    public MyCalendar() {
        arr = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(arr.size()==0){
            arr.add(start);
            arr.add(end);
            return true;
        }
        for (int i = 0; i < arr.size(); i += 2) {
            int existingStart = arr.get(i);
            int existingEnd = arr.get(i + 1);
            
            if (Math.max(existingStart, start) < Math.min(existingEnd, end)) {
                return false; // Event overlaps, reject booking
            }
        }
        arr.add(start);
        arr.add(end);
        return true;
        }
    }

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */