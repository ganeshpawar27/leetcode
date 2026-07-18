class Solution {
    public int maxDepth(String s) {
        int count=0;
        int sum=0;
        for(char ch:s.toCharArray()){
            if(ch =='('){
                count++;
                sum=Math.max(sum,count);
            }
            if(ch == ')'){
                count--;
            }
        }
        return sum;
    }
}