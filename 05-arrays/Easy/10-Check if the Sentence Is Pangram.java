class Solution {
    public boolean checkIfPangram(String sentence) {

        ArrayList<Integer> temp = new ArrayList<Integer>();

        for(int i=97;i<=122;i++){
            temp.add(i);
        }

        for(int i=0;i<sentence.length();i++){

            Integer letter = (int)(sentence.charAt(i));

            if(temp.contains(letter)){
                temp.remove(letter);
            }
        }
        
        if(temp.size()==0)
            return true;
        
        return false;
    }
}