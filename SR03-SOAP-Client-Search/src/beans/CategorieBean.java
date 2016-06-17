/**
 * CategorieBean.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package beans;

public class CategorieBean  implements java.io.Serializable {
    private beans.AnnonceBean[] anonces;

    private int id;

    private java.lang.String nom;

    public CategorieBean() {
    }

    public CategorieBean(
           beans.AnnonceBean[] anonces,
           int id,
           java.lang.String nom) {
           this.anonces = anonces;
           this.id = id;
           this.nom = nom;
    }


    /**
     * Gets the anonces value for this CategorieBean.
     * 
     * @return anonces
     */
    public beans.AnnonceBean[] getAnonces() {
        return anonces;
    }


    /**
     * Sets the anonces value for this CategorieBean.
     * 
     * @param anonces
     */
    public void setAnonces(beans.AnnonceBean[] anonces) {
        this.anonces = anonces;
    }


    /**
     * Gets the id value for this CategorieBean.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this CategorieBean.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the nom value for this CategorieBean.
     * 
     * @return nom
     */
    public java.lang.String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this CategorieBean.
     * 
     * @param nom
     */
    public void setNom(java.lang.String nom) {
        this.nom = nom;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CategorieBean)) return false;
        CategorieBean other = (CategorieBean) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.anonces==null && other.getAnonces()==null) || 
             (this.anonces!=null &&
              java.util.Arrays.equals(this.anonces, other.getAnonces()))) &&
            this.id == other.getId() &&
            ((this.nom==null && other.getNom()==null) || 
             (this.nom!=null &&
              this.nom.equals(other.getNom())));
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
        if (getAnonces() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAnonces());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAnonces(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getId();
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CategorieBean.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://beans", "CategorieBean"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anonces");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "anonces"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://beans", "AnnonceBean"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://DAO", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://beans", "nom"));
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
