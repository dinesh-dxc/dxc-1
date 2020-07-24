package com.dxc.calc;

public class CalcProxy implements com.dxc.calc.Calc {
  private String _endpoint = null;
  private com.dxc.calc.Calc calc = null;
  
  public CalcProxy() {
    _initCalcProxy();
  }
  
  public CalcProxy(String endpoint) {
    _endpoint = endpoint;
    _initCalcProxy();
  }
  
  private void _initCalcProxy() {
    try {
      calc = (new com.dxc.calc.CalcServiceLocator()).getCalc();
      if (calc != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)calc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)calc)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (calc != null)
      ((javax.xml.rpc.Stub)calc)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.dxc.calc.Calc getCalc() {
    if (calc == null)
      _initCalcProxy();
    return calc;
  }
  
  public int sum(int x, int y) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.sum(x, y);
  }
  
  public int mult(int x, int y) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.mult(x, y);
  }
  
  public int sub(int x, int y) throws java.rmi.RemoteException{
    if (calc == null)
      _initCalcProxy();
    return calc.sub(x, y);
  }
  
  
}