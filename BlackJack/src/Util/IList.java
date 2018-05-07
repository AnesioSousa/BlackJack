/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *
 * @author Anésio
 */
public interface IList{
    
    public void add(Object data);
    
    public void set(int index, Object data);
    
    public Object get(int index);
    
    public boolean contains(Object obj);
    
    public void remove(int index);
    
    public void remove(Object data);
    
    public int size();
    
    public Iterator iterator();
}
