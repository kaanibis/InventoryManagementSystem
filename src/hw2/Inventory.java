/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw2;

/**
 *
 * @author v1
 */
public class Inventory implements InventoryInterface{
    Device head =null;
    Device headR=null,
            headC=null,
            headI=null,
            headT=null,
            tailR=null,
            tailC=null,
            tailI=null,
            tailT=null;
   
    
    @Override
    public void addResistor(String val, Integer cnt) {
        Device newDevice = new Device("Resistor",null,val,cnt);
        boolean flag=false;
        
        if(head==null){ 
            //If the list is empty ::::
            head=newDevice;
            
        }
        else{
            //If the list in NOT empty ::::
            Device Dummy=head;
            while(Dummy!=null){
                //If there are same value ::::
                if(Dummy.getValue().equals(val)){
                    Dummy.setCount(cnt);
                    flag=true;
                    break;
                }
                Dummy=Dummy.link;
            }
            if(flag==false){
                //If the value is a new value resistor ::::
                newDevice.link=head;
                head=newDevice;
            }
        }
    }

    @Override
    public void addCapacitor(String val, Integer cnt) {
        Device newDevice = new Device("Capacitor",null,val,cnt);
        boolean flag=false;
        
        if(head==null){ 
            //If the list is empty ::::
            head=newDevice;
            
        }
        else{
            //If the list in NOT empty ::::
            Device Dummy=head;
            while(Dummy!=null){
                //If there are same value ::::
                if(Dummy.getValue().equals(val)){
                    Dummy.setCount(cnt);
                    flag=true;
                    break;
                }
                Dummy=Dummy.link;
            }
            if(flag==false){
                //If the value is a new value resistor ::::
                newDevice.link=head;
                head=newDevice;
            }
        }
    }

    @Override
    public void addInductor(String val, Integer cnt) {
        Device newDevice = new Device("Inductor",null,val,cnt);
        boolean flag=false;
        
        if(head==null){ 
            //If the list is empty ::::
            head=newDevice;
            
        }
        else{
            //If the list in NOT empty ::::
            Device Dummy=head;
            while(Dummy!=null){
                //If there are same value ::::
                if(Dummy.getValue().equals(val)){
                    Dummy.setCount(cnt);
                    flag=true;
                    break;
                }
                Dummy=Dummy.link;
            }
            if(flag==false){
                //If the value is a new value resistor ::::
                newDevice.link=head;
                head=newDevice;
            }
        }
    }

    @Override
    public void addTransistor(String val, Integer cnt) {
        Device newDevice = new Device("Transistor",null,val,cnt);
        boolean flag=false;
        
        if(head==null){ 
            //If the list is empty ::::
            head=newDevice;
            
        }
        else{
            //If the list in NOT empty ::::
            Device Dummy=head;
            while(Dummy!=null){
                //If there are same value ::::
                if(Dummy.getValue().equals(val)){
                    Dummy.setCount(cnt);
                    flag=true;
                    break;
                }
                Dummy=Dummy.link;
            }
            if(flag==false){
                //If the value is a new value resistor ::::
                newDevice.link=head;
                head=newDevice;
            }
        }
    }

    @Override
    public int deleteResistor(String val, Integer cnt) {
        Device Dummy = head;
        boolean flag=false;
        
        while(Dummy!=null){
            
            if((Dummy.getValue().equals(val)) && (Dummy.getCount()>=cnt)){
                Dummy.decCount(cnt);
                flag=true;
                break;
            }
            Dummy=Dummy.link;
        }
        
        if(flag){
            return Dummy.getCount();
        }
        else{
            return -1;
        }

    }

    @Override
    public int deleteCapacitor(String val, Integer cnt) {
        Device Dummy = head;
        boolean flag=false;
        while(Dummy!=null){
            if((Dummy.getValue().equals(val)) && (Dummy.getCount()>=cnt)){
                Dummy.decCount(cnt);
                flag=true;
                break;
            }
            Dummy=Dummy.link;
        }
        if(flag){
            return Dummy.getCount();
        }
        else{
            return -1;
        }
    }

    @Override
    public int deleteInductor(String val, Integer cnt) {
        Device Dummy = head;
        boolean flag=false;
        while(Dummy!=null){
            if((Dummy.getValue().equals(val)) && (Dummy.getCount()>=cnt)){
                Dummy.decCount(cnt);
                flag=true;
                break;
            }
            Dummy=Dummy.link;
        }
        if(flag){
            return Dummy.getCount();
        }
        else{
            return -1;
        }
    }

    @Override
    public int deleteTransistor(String val, Integer cnt) {
        Device Dummy = head;
        boolean flag=false;
        while(Dummy!=null){
            if((Dummy.getValue().equals(val)) && (Dummy.getCount()>=cnt)){
                Dummy.decCount(cnt);
                flag=true;
                break;
            }
            Dummy=Dummy.link;
        }
        if(flag){
            return Dummy.getCount();
        }
        else{
            return -1;
        }
    }

    @Override
    public void printInventory() {
        headR=null;
            headC=null;
            headI=null;
            headT=null;
            tailR=null;
            tailC=null;
            tailI=null;
            tailT=null;
        Device Dummy=head;
        while(Dummy!=null){
            if(Dummy.getName().equals("Resistor") && headR==null){
                headR=Dummy;
                tailR=Dummy;
            }
            else if(Dummy.getName().equals("Capacitor") && headC==null){
                headC=Dummy;
                tailC=Dummy;
            }
            else if(Dummy.getName().equals("Inductor") && headI==null){
                headI=Dummy;
                tailI=Dummy;
            }
            else if(Dummy.getName().equals("Transistor") && headT==null){
                headT=Dummy;
                tailT=Dummy;
            }
            else if(Dummy.getName().equals("Resistor") && headR!=null){
                tailR.link=Dummy;
                tailR=Dummy;
            }
            else if(Dummy.getName().equals("Capacitor") && headC!=null){
                tailC.link=Dummy;
                tailC=Dummy;
            }
            else if(Dummy.getName().equals("Inductor") && headI!=null){
                tailI.link=Dummy;
                tailI=Dummy;
            }
            else if(Dummy.getName().equals("Transistor") && headT!=null){
                tailT.link=Dummy;
                tailT=Dummy;
            }
            
            Dummy=Dummy.link;
        }
        
        if(tailT==null && tailI!=null && tailC!=null && tailR!=null){
            head=headR;
            tailR.link=headC;
            tailC.link=headI;
            tailI.link=null;
        }else if(tailT!=null && tailI==null && tailC!=null && tailR!=null){
            head=headR;
            tailR.link=headC;
            tailC.link=headT;
            tailT.link=null;
        }else if(tailT!=null && tailI!=null && tailC==null && tailR!=null){
            head=headR;
            tailR.link=headI;
            tailI.link=headT;
            tailT.link=null;
        }
        else if(tailT!=null && tailI!=null && tailC!=null && tailR==null){
            head=headC;
            tailC.link=headI;
            tailI.link=headT;
            tailT.link=null;
        }
        else if(tailT==null && tailI==null && tailC!=null && tailR!=null){
            head=headR;
            tailR.link=headC;
            tailC.link=null;
        }
        else if(tailT!=null && tailI==null && tailC==null && tailR!=null){
            head=headR;
            tailR.link=headI;
            tailI.link=null;
        }
        else if(tailT!=null && tailI!=null && tailC==null && tailR==null){
            head=headI;
            tailI.link=headT;
            tailT.link=null;
        }
        else if(tailT==null && tailI==null && tailC==null && tailR!=null){
            head=headR;
            tailR.link=null;
        }
        else if(tailT!=null && tailI==null && tailC==null && tailR==null){
            head=headT;
            tailT.link=null;
        }
        else if(tailT!=null && tailI!=null && tailC!=null && tailR!=null){
            head=headR;
            tailR.link=headC;
            tailC.link=headI;
            tailI.link=headT;
            tailT.link=null;
        }
        
        
        Dummy = head;
        while(Dummy!=null){

            System.out.println("There are "+Dummy.getCount() +" amount of "+Dummy.getValue()+" "+Dummy.getName()+"(s) in Inventory.");
            Dummy=Dummy.link;
        }
       
        System.out.println("----------------------------------");
        
    }

   
}
