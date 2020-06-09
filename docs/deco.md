
# decorator pattern  
* 데코레이터 패턴  

# 프리뷰    
1. **Decorator**는 **Wrapper**이다.  
2. 신기하게도 Wrapper인 **Decorator**는 그것이 감싸는 Component와 **동일한 super type**을 가진다.  
[+] 왜? 그래야지만 Wrapping되고 있는 **객체**의 메서드가 제대로 노출되기 때문이다.  

![스크린샷, 2020-06-10 01-51-17](https://user-images.githubusercontent.com/62331555/84176786-e9204080-aabc-11ea-9fa1-f7643e71daaa.png)  

# 예제  
#### [예제 사이트](https://dzone.com/articles/decorator-design-pattern-in-java)  

![스크린샷, 2020-06-10 02-23-41](https://user-images.githubusercontent.com/62331555/84179772-6e0d5900-aac1-11ea-85cd-bdb20716886c.png)  

```java

interface Human {
    void attack();
    void walk();
    void jump();
}

class Warrior implements Human {
    
    @Override
    public void attack(){
        System.out.println("[attack] Swordd! ");
    }
    
    @Override
    public void walk(){
        System.out.println("[walk] just walk");
    }
    
    @Override
    public void jump(){
        System.out.println("[jump] 1 단 jump");
    }

}

class Archer implements Human {
    
    @Override
    public void attack(){
        System.out.println("[attack] Arrow ");
    }
    
    @Override
    public void walk(){
        System.out.println("[walk] just walk");
    }
    
    @Override
    public void jump(){
        System.out.println("[jump] 2 단 jump");
    }

}

abstract class HumanDecorator implements Human {
    Human human;
    
    public HumanDecorator(Human human){
        this.human = human;
    }

}

class GlitterDeco extends HumanDecorator {

    public GlitterDeco(Human human){
        super(human);
    }
    

    @Override
    public void attack(){
        glitter();
        human.attack();
    }

    @Override
    public void walk(){
        glitter();
        human.walk();
    }

    @Override
    public void jump(){
        glitter();
        human.jump();
    }

    private void glitter(){
        System.out.println("반짝이며...");
    }
}

class FastDeco extends HumanDecorator {
    private int num;

    public FastDeco(Human human, int num){
        super(human);
        this.num = num;
    }
    

    @Override
    public void attack(){
        boost();
        human.attack();
    }

    @Override
    public void walk(){
        boost();
        human.walk();
    }

    @Override
    public void jump(){
        boost();
        human.jump();
    }

    private void boost(){
        System.out.println(num+" 배 빠르게 ");
    }
}

```

# 무엇인가?  



# 언제 사용할까?  

### 1. 런타임에 객체의 기능을 확장할 수 있다.  

```java
Human human = new archer();
GlitterDeco gh = new GlitterDeco(human);

// gh로 감싸져서 human 객체 잘쓰다가
// 아래에서 fd로 다시 감싸서, 런타임에 기능을 바꾸고 확장할 수 있다.  

FastDeco fd = new FastDeco(human, 3);
```

### 2. 상속을 피할 수 있다.  
* 상속은 **런타임에 기능이 확장되는 것이 아닌, 컴파일 시점에 기능이 추가된다.**  
* 상속은 부모 클래스의 변화를 자식 클래스로 전파시킬 수가 있게 된다.  



