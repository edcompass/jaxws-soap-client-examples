// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Initializer.java

package de.hpc.soap.commons;


public class Initializer
{

    private Initializer()
    {
    }
    
    static int counter = 0;
    static {
    	// com.sun.xml.ws.spi.ProviderImpl
    	// com.sun.xml.internal.ws.spi.ProviderImpl
    	System.setProperty("javax.xml.ws.spi.Provider", "com.sun.xml.internal.ws.spi.ProviderImpl");  
    	System.out.println("+++" + counter++ +"+++javax.xml.ws.spi.Provider ---> com.sun.xml.internal.ws.spi.ProviderImpl");  
    }

     

}
