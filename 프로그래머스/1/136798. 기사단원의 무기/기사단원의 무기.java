import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(int number, int limit, int power) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=1;i<=number;i++){
            list.add(numberOfDivisor(i));
        }//여기까지 약수의 갯수 전부대입    
        
        return list.stream()
            .map(i -> i > limit ? power : i)
            .mapToInt(Integer::intValue)
            .sum();
    }
    
    public int numberOfDivisor(int number){
        int cnt=0;
        for(int i=1;i*i<=number;i++){
            if(i*i==number) cnt++; //제곱수일때는 약수는 한번만 카운트
            else if(number%i==0) cnt+=2;
        }
        return cnt;
    }
}

//내 약수의 갯수가 4개라도 협약으로 정해진 수가 3이라면 무기공격력4를 사용하지못하고 초과한 수치이기 때문에 초과한기사의 무기공격력 power를
//사용해야 한다.

//1. 1부터 number까지 기사단원의 약수의 갯수를 구한다.(List 등)
//2. List에 limit를 초과한 녀석은 power로 바꾼다.(stream().map() 등))
//3. 모든 요소를 합한다.