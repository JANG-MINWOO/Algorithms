class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int lcm;       
        if(n<m){
            int temp=n;
            n=m;
            m=temp;
        } //항상 n이 크게만들기            
        lcm=(n*m)/gcd(n,m);
        answer[0]=gcd(n,m);
        answer[1]=lcm;
        return answer;
    }
    
    public static int gcd(int a, int b){
        while(b!=0){
            int r=a%b;
            a=b;
            b=r;
        }
        return a;
    }
}


//유클리드 호제법
//GCD(a,b)=GCD(b,r) 이다.
//두수 a와 b가 있을때 a를b로 나눈 나머지가 r이라고 하면, 위의식이 성립한다.
//r이 0될때까지 진행
//최소공배수는 a*b를GCD로 나눈것과 같다.