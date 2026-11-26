class NumberContainers {

    Map<Integer, TreeSet<Integer>> map;
    Map<Integer, Integer> indMap;
    public NumberContainers() {
        map = new HashMap<>();
        indMap = new HashMap<>();
    }
    
    public void change(int index, int number) {
        if(indMap.containsKey(index)) {
            int num = indMap.get(index);
            TreeSet<Integer> set = map.get(num);
            set.remove(index);
            if(set.isEmpty()) {
                map.remove(num);
            } else {
                map.put(num, set);
            }
        }
        indMap.put(index, number);
        map.computeIfAbsent(number, k -> new TreeSet<>()).add(index);
    }
    
    public int find(int number) {
        if(map.containsKey(number)) {
            TreeSet<Integer> set = map.get(number);
            for(int ele : set) {
                return ele;
            }
        }
        return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */