//Geo.java

package JC.Day68;

public class Geo {
    
    public double latitude;
    public double longitude;
}

//Main.java

package JC.Day68;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        //실수 변수 
        double latitudel = 37.52127220511242;
        double longitudel = 127.0074462090625;  //서울
        double latitude2 = 35.137879119634185;
        double longitude2 = 129.04541015625;    //부산

        Geo geo1 = new Geo();
        geo1.latitude = latitudel;
        geo1.longitude = longitudel;
        System.out.println(geo1.latitude+"\t"+geo1.longitude);

        Geo geo2 = new Geo();
        geo2.latitude = latitude2;
        geo2.longitude = longitude2;

        Geo geo = geo1;
        System.out.println(geo.latitude+"\t"+geo.longitude);
        
        Geo geoo = geo2;
        System.out.println(geoo.latitude+"\t"+geoo.longitude);
        

    // 객체의 멤버는 해당 객체에서 가장 중요한 데ㅐ이터이다. 
    // 위도와 경도를 찾는 객체는 위치를 표현하려고 한다 라는 성격이 보인다. 
    // 그래서 멤버를 객체의 속성, attribute라고 한다. 객체를 사용하려면 객체의 설계도면 클래스를 만들어야 한다.

    }
}
