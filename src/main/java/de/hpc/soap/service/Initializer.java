// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Initializer.java

package de.hpc.soap.service;


public class Initializer
{

    private Initializer()
    {
    }

    
	public static void init()
    {
        PREVIOUS.set(Thread.currentThread().getContextClassLoader());
        Thread.currentThread().setContextClassLoader(Initializer.class.getClassLoader());
    }

    public static void destroy()
    {
        Thread.currentThread().setContextClassLoader((ClassLoader)PREVIOUS.get());
        PREVIOUS.set(null);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
	private static final ThreadLocal<ClassLoader> PREVIOUS = new ThreadLocal();

}
