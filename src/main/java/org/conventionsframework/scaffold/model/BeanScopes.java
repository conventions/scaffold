/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.conventionsframework.scaffold.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 *
 * @author rmpestano Oct 24, 2011 7:12:02 PM
 */
public enum BeanScopes {

    REQUEST_SCOPED("RequestScoped", "javax.enterprise.context.RequestScoped"),
    VIEW_ACCESS_SCOPED("ViewAccessScoped", "org.apache.myfaces.extensions.cdi.core.api.scope.conversation.ViewAccessScoped"),
    CONVERSATION_SCOPED("ConversationScoped", "javax.enterprise.context.ConversationScoped"),
    SESSION_SCOPED("SessionScoped", "javax.enterprise.context.SessionScoped");

    BeanScopes(String name, String scopePackage) {
        this.name = name;
        this.scopePackage = scopePackage;
    }
    private final String name;
    private final String scopePackage;

    public String getName() {
        return name;
    }

    public String getScopePackage() {
        return scopePackage;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public static List<String> getScopes(){
        List<String>retorno = new ArrayList<String>();
        for (BeanScopes scope : BeanScopes.values()) {
            retorno.add(scope.name);
        }
        return retorno;
    }
    
     public static String getScopePackage(String beanScope) {
        String scopePackage = null;
        if (beanScope.equalsIgnoreCase(BeanScopes.VIEW_ACCESS_SCOPED.getName())) {
            scopePackage = BeanScopes.VIEW_ACCESS_SCOPED.getScopePackage();
        } else if (beanScope.equalsIgnoreCase(BeanScopes.CONVERSATION_SCOPED.getName())) {
            scopePackage = BeanScopes.CONVERSATION_SCOPED.getScopePackage();
        } else if (beanScope.equalsIgnoreCase(BeanScopes.SESSION_SCOPED.getName())) {
            scopePackage = BeanScopes.SESSION_SCOPED.getScopePackage();
        } else if (beanScope.equalsIgnoreCase(BeanScopes.REQUEST_SCOPED.getName())) {
            scopePackage = BeanScopes.REQUEST_SCOPED.getScopePackage();
        }

        return scopePackage;
    }
    
    
    
}
