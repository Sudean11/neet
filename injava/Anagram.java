package injava;

class Solution {
      public boolean isAnagram(String s, String t) {
        String[] a = s.split("");
        List<String> b = new ArrayList<>( Arrays.asList(t.split("")));

        if(a.length != b.size()){
            return false;
        }

        for(int i = 0; i<a.length; i++){
            if(b.contains(a[i])){
                b.remove(a[i]);
            }else{
                return false;
            }
        }

        return true;
        
    }
    public static void main(String[] args){
        System.out.println( new Solution().isAnagram("sudsin", "niduass"));
    }
}