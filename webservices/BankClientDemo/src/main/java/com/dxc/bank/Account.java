/**
 * Account.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.dxc.bank;

public class Account  implements java.io.Serializable {
    private int accountNo;

    private java.lang.String accountType;

    private int amount;

    private java.lang.String cheqFacil;

    private java.lang.String city;

    private java.util.Calendar dateOfOpen;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String state;

    private java.lang.String status;

    public Account() {
    }

    public Account(
           int accountNo,
           java.lang.String accountType,
           int amount,
           java.lang.String cheqFacil,
           java.lang.String city,
           java.util.Calendar dateOfOpen,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String state,
           java.lang.String status) {
           this.accountNo = accountNo;
           this.accountType = accountType;
           this.amount = amount;
           this.cheqFacil = cheqFacil;
           this.city = city;
           this.dateOfOpen = dateOfOpen;
           this.firstName = firstName;
           this.lastName = lastName;
           this.state = state;
           this.status = status;
    }


    /**
     * Gets the accountNo value for this Account.
     * 
     * @return accountNo
     */
    public int getAccountNo() {
        return accountNo;
    }


    /**
     * Sets the accountNo value for this Account.
     * 
     * @param accountNo
     */
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }


    /**
     * Gets the accountType value for this Account.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this Account.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the amount value for this Account.
     * 
     * @return amount
     */
    public int getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this Account.
     * 
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }


    /**
     * Gets the cheqFacil value for this Account.
     * 
     * @return cheqFacil
     */
    public java.lang.String getCheqFacil() {
        return cheqFacil;
    }


    /**
     * Sets the cheqFacil value for this Account.
     * 
     * @param cheqFacil
     */
    public void setCheqFacil(java.lang.String cheqFacil) {
        this.cheqFacil = cheqFacil;
    }


    /**
     * Gets the city value for this Account.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Account.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the dateOfOpen value for this Account.
     * 
     * @return dateOfOpen
     */
    public java.util.Calendar getDateOfOpen() {
        return dateOfOpen;
    }


    /**
     * Sets the dateOfOpen value for this Account.
     * 
     * @param dateOfOpen
     */
    public void setDateOfOpen(java.util.Calendar dateOfOpen) {
        this.dateOfOpen = dateOfOpen;
    }


    /**
     * Gets the firstName value for this Account.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this Account.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this Account.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this Account.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the state value for this Account.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Account.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the status value for this Account.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Account.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Account)) return false;
        Account other = (Account) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.accountNo == other.getAccountNo() &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            this.amount == other.getAmount() &&
            ((this.cheqFacil==null && other.getCheqFacil()==null) || 
             (this.cheqFacil!=null &&
              this.cheqFacil.equals(other.getCheqFacil()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.dateOfOpen==null && other.getDateOfOpen()==null) || 
             (this.dateOfOpen!=null &&
              this.dateOfOpen.equals(other.getDateOfOpen()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getAccountNo();
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        _hashCode += getAmount();
        if (getCheqFacil() != null) {
            _hashCode += getCheqFacil().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getDateOfOpen() != null) {
            _hashCode += getDateOfOpen().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Account.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://bank.dxc.com", "Account"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "accountNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cheqFacil");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "cheqFacil"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfOpen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "dateOfOpen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "firstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "lastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://bank.dxc.com", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
