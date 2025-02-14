class ProductOfNumbers {
    List<Integer> list;
    int prev;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        prev = 1;
    }
    
    public void add(int num) {
        if(num == 0){
            list = new ArrayList<>();
            prev = 1;
            return;
        }
        list.add(num*prev);
        prev *= num;
    }
    
    public int getProduct(int k) {
        int size = list.size();
        if (size<k) return 0;  
        if(size== k) return list.get(size-1);
        return list.get(size-1)/list.get(size-k-1);
        
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */