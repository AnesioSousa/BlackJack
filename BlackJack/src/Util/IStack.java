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
public interface IStack {
    
    public void push(Object data);
    
    public Object pop();
    
    public Object peek();
    
    public boolean isEmpty();
    
}
