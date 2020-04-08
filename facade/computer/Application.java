

class CPU{
    void freeze(){
        System.out.println("Start Cooling.....");
    }

    void jump(int addr){
        System.out.println("jump to "+addr);

    }

    void execute(){
        System.out.println("Excute.............!");
    }

}

class Memory{
    void load(int bAddr, int chunk){
        System.out.println(chunk+" is loaded into "+bAddr);
    }
}

class HardDrive{

    int read(int sAddr, int size){
        System.out.println("read "+size+" from HD");
        
        return size;
    }
}


class ComputerFacade{
    private int             BOOT_ADDRESS    = 123123;
    private int             BOOT_SECTOR     = 11;
    private int             BOOT_SIZE       = 1000;

    private CPU             processor;
    private Memory          ram;
    private HardDrive       hd;

    ComputerFacade(){
        this.processor  = new CPU();        // composition
        this.ram        = new Memory();
        this.hd         = new HardDrive();     
    }


    /*
        Simplifed API for Client
    */
    void start(){
        this.processor.freeze();
        this.ram.load(this.BOOT_ADDRESS, this.hd.read(this.BOOT_SECTOR, this.BOOT_SIZE));
        
        this.processor.jump(this.BOOT_ADDRESS);
        this.processor.execute();
    }
}

class Application{

    public static void main(String[] args){
        /*
         Facade가 있다면...
         사용자는 단지 Facade.start() API documents를 본 후

         start() 만 호출하면 컴퓨터가 부팅되는구나 생각할 수 있다.

         그리고 실제로 start() 호출한 후 다른 자신이 할것을 하면 된다.
        */
        
        ComputerFacade cf = new ComputerFacade();

        cf.start();




        //===============================================================
        // 만일 Facae가 없다면?
        /*
            CPU class, Memory class, HardDrive class 세 개 모두 읽고
            분석하고 이렇게 호출하면 되는구나
            파악한 후 

            사용자가 일일히 입력했는데 오류뜬다.

        */
        
        /*
            즉, 퍼사드는 사용자에게 Simplifed 된 인터페이스를 제공하는 패턴이다.
    
        */






    }
}
