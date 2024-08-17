class Solution {
    public int strStr(String haystack, String needle) {

        char [] hayArr = haystack.toCharArray();
        char [] arr= needle.toCharArray();
        int i = 0;
       
        for(int j =0; j< hayArr.length; j++){
            
            if(hayArr[j] == arr[i]){
                i++;
            }else{
                j=j-i;
                i = 0;
            }
            
            if(i==arr.length) return (j-arr.length+1);
        }

        return -1;

    }
}