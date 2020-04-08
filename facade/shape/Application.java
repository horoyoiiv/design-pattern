package org.shape;


class Application{


    public static void main(String[] args){
        System.out.println("Helllo"); 
        
        ShapeFacade sf = new ShapeFacade();

        sf.drawCircle();

        sf.draw(2);

    }
}
