
public class Foot2 extends Decorator {  
  
    public Foot2(Componet myComp) {  
        super(myComp);  
        // TODO Auto-generated constructor stub  
    }  
  
    @Override  
    public void prtTicket() {  
        // TODO Auto-generated method stub  
        super.prtTicket();  
        //place the code of print sales foot  
        System.out.println("Sales Ticket Footer2");  
    }  
  
}  
