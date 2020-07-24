/**
 * AccountServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.bank;

public interface AccountServiceService extends javax.xml.rpc.Service {
    public java.lang.String getAccountServiceAddress();

    public com.dxc.bank.AccountService getAccountService() throws javax.xml.rpc.ServiceException;

    public com.dxc.bank.AccountService getAccountService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
