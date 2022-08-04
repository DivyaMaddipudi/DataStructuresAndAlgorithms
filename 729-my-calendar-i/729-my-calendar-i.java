class MyCalendar {

    List<int[]> result;
    
    public MyCalendar() {
        result = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        
        for(int[] value : result) {
            if(value[0] < end && start < value[1]) return false;
            // System.out.println(result);
        }
        result.add(new int[] {start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */