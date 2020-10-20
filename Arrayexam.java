package JC.Day68;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {

        double latitudel = 37.52127220511242;
        double longitudel = 127.0074462090625;
        double letitude2 = 35.137879119634185;
        double longitude2 = 129.04541015625;

        System.out.println(latitudel+"\t"+longitudel);

        double [] latlng1 = {latitudel, longitudel};
        double [] latlng2 = {letitude2, longitude2};
        System.out.println(latlng1[0]+"\t"+latlng1[0]);
        System.out.println();
        double [][] latlng = {{latitudel, longitudel}, {letitude2, longitude2}};
        System.out.println(latlng[0][0]+"\t"+latlng[0][1]);
        
        

    // 배열은 같은 타입의 데이터를 나열한 것이다.  배열 [] 사용하여 []가 1개이면 
    // 1차원 배열 [][]가 2개이면 2차원 배열이니 
    // 위도와 경도를 배열로  
    // 배열은 같은 타입의 데이터를 나열한 것이다. 배열 [] 사용하여 [] 가 1개이면 
    // 1차원 배열 , [][]가 2개이면 2차원 배열이다.
    // 배열은 참조 타입이다. 배열은 new로 생성하는 동적 할당 배열과 new를 사용하지 
    // 않는 정적 할당 뱅려이 있다. 여기서는 정적할당 배열을 사용한다.
    // 정적 할당 배열은 두번 사용할 수 없다. 
    // double [] lasting = [312321] 선언 초기화
    // lasting =(565444) 두번째 대입 불가

    }
}
