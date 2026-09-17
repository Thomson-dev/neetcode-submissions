class MyHashSet {
  int[] data;
    public MyHashSet() {
        data = new int[1000001];
        // Use -1 to mean "key doesn't exist"
        for (int i = 0; i < data.length; i++) {
            data[i] = -1;
        }
    }
    
    public void add(int key) {
        data[key] = 1;
    }
    
    public void remove(int key) {
        data[key] = -1;
        
    }
    
    public boolean contains(int key) {
        return data[key] == 1;
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */