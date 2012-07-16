/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.conventionsframework.scaffold.model;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rmpestano Oct 28, 2011 10:47:55 PM
 */
public enum BeanTypes {
    
    BASE_MANAGED_BEAN("BaseMBean"),
    HISTORY_STACK_MANAGED_BEAN("StateMBean"),
    MODAL_MANAGED_BEAN("ModalMBean"),
    CONVERSATIONAL_MANAGED_BEAN("ConversationalMBean");
    
    BeanTypes(String type){
        this.name = type;
    }
    private final String name;

    public String getName() {
        return name;
    }
    
    
    public static List<String> getTypes(){
       List<String>retorno = new ArrayList<String>();
        for (BeanTypes type : BeanTypes.values()) {
            retorno.add(type.name);
        }
        return retorno;
    }

    @Override
    public String toString() {
        return  name ;
    }
    
    
    
}
