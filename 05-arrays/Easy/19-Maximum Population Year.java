class Solution {
    public int maximumPopulation(int[][] logs) {

        int[] pop = new int[logs.length];

        for(int i=0;i<pop.length;i++){

            pop[i] = 0;
            int year = logs[i][0];

            for(int j=0;j<logs.length;j++){

                if(logs[j][0]<=year && logs[j][1]>year){
                    pop[i]++;
                }
            }
        }

        int maxIndex = 0;
        int maxPop = 0;

        for(int i=0;i<pop.length;i++){
            System.out.print(" "+ pop[i]);
        }

        for(int i=0;i<pop.length;i++){

            if(pop[i]>maxPop){
                maxPop = pop[i];
                maxIndex = i;
            }

            if(pop[i]==maxPop){
                if(logs[maxIndex][0]>logs[i][0])
                    maxIndex = i;
            }
        }

        return logs[maxIndex][0];
        
    }
}