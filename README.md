
[UML DIAGRAM](http://www.nextree.co.kr/p6753/)  

### 1. facade  

  **Client 에게 Simplified 되고 일관된 인터페이스를 제공하는 패턴**  

##### Abstract  
클라이언트 - 파사드 - Sub Systems  
  
복잡한 서브 시스템들의 동작을 퍼사드에서 캡슐화하여 단순한 인터페이스를 제공  
혹은 서브 시스템의 교체 시 퍼사드 내부의 코드 수정으로 클라이언트와 서브 시스템 간의 루즈 커플링  


### 2. Strategy  

  **동적으로 객체의 행위(알고리즘, 전략)을 수정할 수 있는 패턴**  

1) 행위를 인터페이스로 정의한다.  
2) 행위의 주체 클래스는 이를 멤버 필드로 가진다.  
3) 이를 구현한 클래스들을 runtime 도중 setter를 통해 교체해 나간다.  
4) 클라이언트는 행위를 제공하는 클래스의 일관된 method를 호출하면 된다.  

  * Sorting의 예제  

### 3. Builder  
#### [builder](/patterns/builder.md)  
* 생성자를 private으로 한 후, inner class인 Builder 클래스를 노출한다.  
* 이 builder를 통해 method chaining으로 보기 좋게 생성자의 매개변수를 지정하여, 객체를 생성하는 방식.  

### 4. Decorator  
#### [데코레이터](https://github.com/horoyoiiv/design-pattern/blob/master/docs/deco.md)  
* 데코레이터 패턴은 `상속`이 아닌, **구성**을 통하여 즉, Wrapper 클래스를 통하여 기능을 동적으로 확장할 수 있는 패턴이다.  



### 4. Singleton  




  
