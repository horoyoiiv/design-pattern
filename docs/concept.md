

# Concept  
### [좋은 사이트](https://effectiveprogramming.tistory.com/entry/%EA%B0%9D%EC%B2%B4%EC%A7%80%ED%96%A5%EC%9D%98-%EC%98%AC%EB%B0%94%EB%A5%B8-%EC%9D%B4%ED%95%B4-%EC%B1%85%EC%9E%84Responsibility)  

* 목표 : 객체지향적인 접근을 통하여 **유연한** 소프트웨어를 개발하는 것이다.  
* **유연하다는 것** : 다양한 `요구사항`의 변화에 대하여 얼마나 쉽게 이를 대처할 수 있는가이다.  

## 용어 정리  
#### 1. 메세지  
* **다른 객체의 메서드를 실행**시키는 것 정도로 이해.  

```java
class Task {
  public void doTask(){}
}

class Client {
  
  public run(){
    Task t = new Task();
    
    t.doTask();         // 메세지를 호출한다. 다른 객체의 메서드를 호출한다.  
                        // 또한 Task 객체에게 위임한다.
                        // 또한, Client 객체는 Task 객체에 의존한다.
  }
}
```

#### 2. 위임  
* Delegation  
* 다른 객체의 메서드를 호출함으로써, 그 객체에 작업을 위임한다.  
* `위임` : 걍 객체 내부에서 지가 할 일을 전가할려고, 다른 객체의 메서드 호출하는 거...  

#### 3. 의존  
* Dependency  
* 위의 예에서 Client 객체는 Task 객체와 **의존관계**에 있다.  


## 의존 관계가 내포하는 문제  
* `객체 간의 의존관계` 혹은 `강한 결합`이 된 상태인 경우  
**문제**는 **의존되는 객체의 변화**가 **의존하는 객체의 변화**로 이어질 수 있다는 점이다.  

```java
class Task {
  public void doTask(){}
}

class Client {
  Task task;
  
  public Client(){
    this.task = new Task(); // 의존 1
  }
  
  public run(){
    t.doTask();             // 의존 2
  }
}
```

* 위의 예제 코드에서는 Client가 두 번의 명시적인 의존을 하고 있다.  
만일 이 상태에서 Task 클래스에 변경을 가하면 어떻게 될까?  

* 예를 들어,  
1) Task 클래스 명이 모호하여 수정을 가한다.  
2) Task의 생성자를 변경한다.  
3) Task의 doTask() 메서드가 제공하는 기능을 변경한다.  
4) Task의 doTask() 메서드 명을 바꾸거나, 매개변수를 변경한다.  


* **이러한 모든 Task 객체의 변화는 의도치않게, 이에 의존하고 있던 Client 객체에 영향을 끼치게 되버린다.**  


* 하나의 객체를 수정해야겠다는 마음을 먹는 이유는 그것을 수정해야 할 이유가 있기 때문이다.  
* 하지만 이로 인해 의도치 않게, 엉뚱하게 (수정할) 객체의 의존하던 객체까지 수정해버린는 것은 정말 귀찮은 일이다.  












