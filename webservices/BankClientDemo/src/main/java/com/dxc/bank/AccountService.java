/**
 * AccountService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.bank;

public interface AccountService extends java.rmi.Remote {
    public java.lang.String createAccount(com.dxc.bank.Account account) throws java.rmi.RemoteException;
    public com.dxc.bank.Account searchAccount(int accountNo) throws java.rmi.RemoteException;
}
