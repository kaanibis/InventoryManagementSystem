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
public class Device{
    Device link;
    private String Name;
    private String Type;
    private String Value;
    private Integer Count;
    public Device(String n, String t, String v, Integer c){
        Name = n;
        Type = t;
        Value = v;
        Count = c;
        link=null;
    }

    public void setCount(Integer Count) {
        this.Count += Count;
    }
    public void decCount(Integer Count) {
        this.Count -= Count;
    }
    
    public Integer getCount() {
        return Count;
    }

    public String getName() {
        return Name;
    }

    public String getType() {
        return Type;
    }

    public String getValue() {
        return Value;
    }
    
    
}

