/**
 * Calc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.calc;

public interface Calc extends java.rmi.Remote {
    public int sum(int x, int y) throws java.rmi.RemoteException;
    public int mult(int x, int y) throws java.rmi.RemoteException;
    public int sub(int x, int y) throws java.rmi.RemoteException;
}