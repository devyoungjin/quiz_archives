import java.util.ArrayList;

class Solution {
    public int[] solution(int[] param) {
        
        List dupl = new ArrayList();
        
        int count=0;
        
        for(int i=0; i<param[i].length; i++){
            for(int j=i+1; j<param[j].length; j++){
                if(param[j]==param[i]){
                    count++;
                }
                dupl.add(count);
            }
        }
        
        int[] answer = new int[dupl.size()];
        dupl.toArray(answer);
        
        return answer;
    }
}