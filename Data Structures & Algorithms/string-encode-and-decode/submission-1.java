class Solution {

    public String encode(List<String> strs) {

StringBuilder result=new StringBuilder();
for(String s:strs){
    result.append(s.length());
    result.append("#");
    result.append(s);
}
return result.toString();
    }

    public List<String> decode(String s) {
            List<String> result = new ArrayList<>();
        int i=0;
       
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;
            }
            int length=Integer.parseInt(s.substring(i,j));
            j++;

            String word=s.substring(j,j+length);
            result.add(word);
            i=j+length;
           
        }
        return result;

    }
}
