##PEI.java

package JC.Day68;

public enum PEI {
    PHYSICAL(23), EKOTIODNAL(28), INTELECTUAL(33);
    private final int peiValue;
    PEI(int pie){
        this.peiValue = pie;
    }
    public int getPei(){
        return peiValue;
    }
    public enum FRUIT {
        APPLE, BANANA, MANGO
    }
    
}

##Main.java

package JC.Day68;


/**
 * Main
 */
public class Main {

        // 조건에 따라 신체, 감정, 지성값을 출력 
        static String textInfor(PEI index, double value) {
            
        
            String result = "";
            switch (index) {
                case PHYSICAL: result = "신체지수: " ;break;
                case EKOTIODNAL: result = "감정지수: " ;break;
                case INTELECTUAL: result = "지성지수: " ;break;
                default : result = "미결정 : "; break;
            
            }
        
            return result + (value*100);
        
        
        }

    
    public static void main(String[] args) {
        PEI index = PEI.PHYSICAL;
        double value = -0.77;
        System.out.println("신체지수 추가값 : "+index.getPei());
        String st = textInfor(index, value);
        System.out.println(st);
        System.out.println(index.ordinal());
        System.out.println(index.name());
        System.out.println(index);
        System.out.println(index.getPei());
    }
}


// 입력된 정수가 23이면 전체 차수를 result에 대입하고 break를 만나면서
// switch문을 끝낸다.


