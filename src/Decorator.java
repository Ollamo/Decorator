
public abstract class Decorator extends Componet {  
    private Componet myComp;  
      
    public Decorator(Componet myComp) {  
        this.myComp = myComp;  
    }  
      
    @Override  
    public void prtTicket() {  
        if(myComp != null)  
            myComp.prtTicket();  
    }  
  
}  

