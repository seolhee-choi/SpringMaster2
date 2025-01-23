package hello_spring2.core.singleton;


public class SingletonService {

    //자기 자신을 static 으로 선언 - 클래스 레벨에 올라가서 딱 하나만 존재하게됨(자바 기본)
    private static final SingletonService instance = new SingletonService();

    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
