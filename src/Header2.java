public class Header2 extends Decorator {  
  
    public Header2(Componet myComp) {  
        super(myComp);  
        // TODO Auto-generated constructor stub  
    }  
  
    @Override  
    public void prtTicket() {  
        // place the code of print the sales head  
        System.out.println("Sales Ticket Header2");  
        super.prtTicket();  
    }  
  
  
}  
