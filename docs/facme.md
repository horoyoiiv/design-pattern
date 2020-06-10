

# Factory Method Pattern  
#### [참고1](https://niceman.tistory.com/143)  

* **팩토리 메서드 패턴** : 객체의 생성을 대신 수행해준다.  
* `new 연산자`를 통해 직접적으로 객체를 생성하지 않고, `팩토리 객체`에 **객체의 생성**을 위임한다.  

* 인자에 따라 생성되는 객체가 결정된다.  

# 관계    
![스크린샷, 2020-06-11 01-27-12](https://user-images.githubusercontent.com/62331555/84293431-bc366100-ab82-11ea-8bc3-239571e0389d.png)  


# 용어  

1. **Product** : `abstract 클래스` 혹은 `interface`이다. 이들의 subclass는 **factory method**에 의해 **인스턴스화**된다.  
2. **Concrete Product** : Product을 구현 혹은 상속한 서브 클래스들.  
3. **Creator** : Product의 서브클래스를 생성하는 클래스.  



# 코드  

```java
interface Coffee {     
    String getName();
}

class MocaCoffee implements Coffee {
    private String name;
    private String desc;

    MocaCoffee(String name){
        this.name = name;
        this.desc = "goood";
    }
    
    @Override
    public String getName(){
        return name;
    }
}

class LateCoffee implements Coffee{
    private String name;
    private String desc;

    LateCoffee(String name){
        this.name = name;
        this.desc = "welll";
    }

    @Override
    public String getName(){
        return name;
    }
}

class CoffeeFactory {

    Coffee getCoffee(String name){
        if(name == "moca")
            return new MocaCoffee("moka...");
        else if(name == "late")
            return new LateCoffee("late...");
        
        return null; 
    }
}
```

# 이점  
* 객체 간의 결합도를 **낮춘다**.  
[+] **결합도** : 하나의 클래스를 변경했을 때, 이 클래스에 의존하던 다른 클래스에 까치게 되는 영향.  

* 없애는 것이 아니다. 낮추는 것이다.  
[+] `Moca 클래스` 명을 Moka로 바꾸게 될 경우 팩토리 메서드 패턴을 사용했기에 팩토리 메서드 안에서만 바꾸면 된다.  
```java
- return new MocaCoffee(); 
+ return new MokaCoffee();
```

* 팩토리 메서드가 없었다면  
new MocaCoffee()를 호출하던 모든 객체에서 이름을 바꿔줘야 한다.  









