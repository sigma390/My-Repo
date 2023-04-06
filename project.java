import java.util.Scanner;

import javax.xml.bind.annotation.XmlElement.DEFAULT;
import java.lang.FunctionalInterface;

interface x1{

    void allot();
    void release();
    void carDet();

}
interface v{
   public int collection(int p);
}


class car {
    Scanner n = new Scanner(System.in);
    
    public 
    String cname;
    int chN;
    String Date;
    int pay;
    // conctructor
    public car(String cname,int chN, String Date, int pay){
        this.cname = cname;
        this.chN = chN;
        this.Date = Date;
        this.pay = pay;
    }
    //setters for Taking user Input
    public void setCname(String cname) {
        this.cname = cname;
    }
    public void setChN(int chN) {
        this.chN = chN;
    }
    public void setDate(String date) {
        Date = date;
    }
    // getters
    public String getCname() {
        return cname;
    }

    //   function to allot car
    void allot(){
        System.out.println("Your "+ cname +" is Taken in for Service");
        System.out.println("kindly wait for 30 mins");
        
        
    }
    // function for details Of Car
    void carDet(){
        System.out.println("\n\nName is : "+cname);
        System.out.println("Chassi Number is : "+chN);

        System.out.println("payment status :");
        if (pay!=0) {
            System.out.println("paid "+ pay +" Rs");
        }
        else{
            System.out.println("not paid yet , collect at exit ");

        }
        System.out.println("Service Done :"+ Date);
        System.out.println("next Service is in 120 Days From " +Date);
    }


    // defined for exit button
    void release(){
        int t2 = 10;

        while(t2 >5){
        System.out.println("Your "+ cname+ " is Ready !!!\n kindly Pay the Charge ");

        
        int charge = n.nextInt();

        // exception handleing 
        if (charge==100 || charge==150 || charge==50) {
          
            System.out.println("--> Thank You Please Visit again <---");
            break;
        
        }
        else{
            throw new IllegalStateException("Make Valid Payment Please");
        }
    }





}
}


public class project {
    public static void main(String[] args) {
        car c1 = new car("gtr",5666,"10/12/121",55); // constructor dummy
        int ch, x =10;
        System.out.println("--> WELCOME TO CAR Service Centre <--\n");
        
        Scanner inp = new Scanner(System.in);

        

        
        // while loop for user choice entry, exit, details
        while(x>5){

        System.out.println("** enter Your Choice plzz **");
        System.out.println("1.Entry\n2.Exit\n3.Details of car");
        ch = inp.nextInt();

        try {
            int y = 10/ch;
        } catch (Exception e) {
            System.out.println("---> u written 0 Write Correct Option!!!!!! <---");
        }
        switch(ch){

            case 1 : 
                    System.out.println("Please Enter Details Of your Vehicle");
                    System.out.println("Enter Name :"); // taking car details from user
                    inp.nextLine();
                    String car1 = inp.nextLine();
                    c1.setCname(car1);
                    System.out.println("Enter Chassi Number :");
                    int t = inp.nextInt();
                    c1.setChN(t);//.....


                    System.out.println("Choose Your Plan"); // choice for plan
                    System.out.println("1.Basic Wash------> Rs. 100 \n2.Foam Wash------> Rs. 150 \n3.Oil CheckUp------> Rs. 50 ");
                    int i = inp.nextInt();
                    inp.nextLine();
                    System.out.println("Enter Todays Date");
                    String u = inp.nextLine();
                    c1.setDate(u);
                    switch(i){
                        case 1: System.out.println("\nYOU CHOSE BASIC WASH");
                                
                        c1.allot();
                        
                        break;
                        case 2:
                        System.out.println("\nYOU CHOSE FOAM WASH");
                        c1.allot(); // calling functions 
                        break;
                        case 3:
                        System.out.println("\nYOU CHOSE OIL CHECK");
                        c1.allot(); 
                        break;
                        
                        default :System.out.println("\nchoose a option");
                        break;

                    }
                    break;
            case 2: c1.release();
            break;
            
                    
            case 3 : c1.carDet();
            break;

            default:
            System.out.println("Enter Valid Choice");




        }
    } 



    }
}
