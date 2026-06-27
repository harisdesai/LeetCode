class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = Stream.of(s.split("")).sorted().collect(Collectors.joining());
        String t1 = Stream.of(t.split("")).sorted().collect(Collectors.joining());

        if(s1.equals(t1)){
            return true;
        }

        else{
            return false;
        }

    }
}