package JC.Day68;

/**
 * Main
 */
public class Main {

        //상수, 상수값은 변경할 수 없다.
        public static final int PHYSICAL= 23; // static 변수 생성없이 사용 
        
         
        //멤버 메서드(non static) 매서드 선언
        public double getBioPhythm(long days, int index, int max) {
            return max*Math.sin((days % index)* 2 * Math.PI / index);
            
        }
    public static void main(String[] args) {

        int days =1000;
        
        Main main = new Main(); // 객체 생성
        //맴버 메서드 호출 
        double phyval = main.getBioPhythm(days, PHYSICAL, 100);
        System.out.printf("나의 신체 지수는 %1$.2f 입니다.",phyval);

        // 매서드 밑에 statc이 붙으면 static 매서드(클래스 매서드) static이 붙지 않으면 멤버 매서드
        // 맴버 메서드는 new 예약어를 사용해서 객채를 생성해야 한다.
    }
    
}
