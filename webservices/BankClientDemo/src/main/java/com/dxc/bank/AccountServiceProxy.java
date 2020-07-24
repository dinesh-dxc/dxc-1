package com.dxc.bank;

public class AccountServiceProxy implements com.dxc.bank.AccountService {
  private String _endpoint = null;
  private com.dxc.bank.AccountService accountService = null;
  
  public AccountServiceProxy() {
    _initAccountServiceProxy();
  }
  
  public AccountServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountServiceProxy();
  }
  
  private void _initAccountServiceProxy() {
    try {
      accountService = (new com.dxc.bank.AccountServiceServiceLocator()).getAccountService();
      if (accountService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountService != null)
      ((javax.xml.rpc.Stub)accountService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dxc.bank.AccountService getAccountService() {
    if (accountService == null)
      _initAccountServiceProxy();
    return accountService;
  }
  
  public java.lang.String createAccount(com.dxc.bank.Account account) throws java.rmi.RemoteException{
    if (accountService == null)
      _initAccountServiceProxy();
    return accountService.createAccount(account);
  }
  
  public com.dxc.bank.Account searchAccount(int accountNo) throws java.rmi.RemoteException{
    if (accountService == null)
      _initAccountServiceProxy();
    return accountService.searchAccount(accountNo);
  }
  
  
}