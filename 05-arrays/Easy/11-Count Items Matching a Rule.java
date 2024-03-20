class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;

        for(int i=0;i<items.size();i++){

            List<String> item = items.get(i);
            
            if(ruleKey.equals("type") && ruleValue.equals(item.get(0)))
                count++;

            if(ruleKey.equals("color") && ruleValue.equals(item.get(1)))
                count++;

            if(ruleKey.equals("name") && ruleValue.equals(item.get(2)))
                count++;
        }

        return count;
        
    }
}