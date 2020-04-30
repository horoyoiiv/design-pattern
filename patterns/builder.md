

## Prerequisite  

#### 1. java bean?  
단순하다. 다음의 특징을 만족하면 자바 빈.  
1. member field는 private  
2. public NoArg Constructor를 가져야 한다.  
3. Serializable을 구현해야 함.  



## Builder Pattern  
* 생성자에 매개변수가 많다면 이 빌더 패턴을 고려하는게 어떤가?  


```java
class Computer{
    private String  name;
    private int     price;
    private String  mouse;
    private int     ram;

    static class Builder{
        // 필수로 가져야하는 매개변수
        String  name;
        int     price;
        
        // 선택 매개변수
        String  mouse   = "";
        int     ram     = 0;
        
        public Builder(String name, int price){
            this.name = name;
            this.price = price;
        }

        public Builder mouse(String mouse){
            this.mouse = mouse;   
            return this;
        }
        
        public Builder ram(int ram){
            this.ram = ram;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
    }

    private Computer(Builder builder){
        name    = builder.name;
        price   = builder.price;
        mouse   = builder.mouse;
        ram     = builder.ram;
    }

}
```

* 그리고 Builder를 통한 객체를 생성은 다음과 같이 할 수 있다.  
* **Method Chainginginging**  
```java
    
Computer computer = new Computer.Builder("acer", 10020)
                        .mouse("any")
                        .ram(4)
                        .build();                             
```

#### 1. 특징  
1. immutable object를 생성가능하다.  
java bean? setter로 불가능  


