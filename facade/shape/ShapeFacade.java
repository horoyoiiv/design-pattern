package org.shape;

import org.shape.model.*;


/*
    //https://www.tutorialspoint.com/design_pattern/facade_pattern.html

    Facade 객체는 Client에게 제공할 "심플한" 인터페이스를 제공해준다.

    Client가 제공받은 인터페이스로 요청을 해오면 Facade는

    자신이 그 요청을 위임받아, 그 요청을 수행하는 Subsystem을 호출하여 작업을 대신 처리.

*/
class ShapeFacade{
    private Shape circle;   // sub system 1
    private Shape rect;     // sub system 2
    private Shape square;   // sub system 3

    public ShapeFacade(){
        circle = new Circle();
        rect = new Rect();
        square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRect(){
        rect.draw();
    }
        
    
    public void draw(int n){
     
        if(n == 1){
            circle.draw();   
        }else if(n==2)
            rect.draw();
        else
            square.draw();
    }
}
