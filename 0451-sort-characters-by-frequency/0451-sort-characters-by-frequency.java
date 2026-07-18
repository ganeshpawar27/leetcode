class Solution {
    public String frequencySort(String s) {
        StringBuilder res=new StringBuilder();
        HashMap<Character,Integer> map =new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        ArrayList<Character> list=new ArrayList(map.keySet());
            list.sort((o1,o2)->map.get(o2)-map.get(o1));
        for(Character ch: list){
            for(int i=0;i<map.get(ch);i++){
                res.append(ch);
            }
        }
        return res.toString();

    }
}