//프로그래머스 로또 최고순위와 최저 순위를 구하는 문제  출처: https://programmers.co.kr/learn/courses/30/lessons/77484
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //결과물
        int[] answer = new int[2];
        int c = 0;
        int d = 0;
        //내가 뽑은 번호와 실제 당첨 번호가 일치하는지 확인
        for(int a=0;a<6;a++){
            for(int b=0;b<6;b++){
                if(lottos[a] == win_nums[b]){
               d ++;  
               if(lottos[a] == win_nums[b]){
               c ++;  
                }
        }
        }
        }
        for(int e =0;e<6;e++){
            if(lottos[e]==0){
                d++;
            }
        }
        if(d==6){
           answer[0]=1;
       } if(d==5){
           answer[0]=2;
       } if(d==4){
           answer[0]=3;
       } if(d==3){
           answer[0]=4;
       } if(d==2){
           answer[0]=5;
       }if(d<2){
           answer[0]=6;
       }
        if(c == 6){
           answer[1]=1;
       } if(c==5){
           answer[1]=2;
       }if(c==4){
           answer[1]=3;
       } if(c==3){
           answer[1]=4;
       } if(c==2){
           answer[1]=5;
       } if(c<2){
           answer[1]=6;
       }
        return answer;
    }
}