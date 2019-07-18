
package org.fuse.usecase.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de account complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="account"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="company" type="{http://service.usecase.fuse.org/}company" minOccurs="0"/&gt;
 *         &lt;element name="contact" type="{http://service.usecase.fuse.org/}contact" minOccurs="0"/&gt;
 *         &lt;element name="salesRepresentative" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "account", propOrder = {
    "clientId",
    "company",
    "contact",
    "salesRepresentative"
})
public class Account {

    protected int clientId;
    protected Company company;
    protected Contact contact;
    protected String salesRepresentative;

    /**
     * Obtém o valor da propriedade clientId.
     * 
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Define o valor da propriedade clientId.
     * 
     */
    public void setClientId(int value) {
        this.clientId = value;
    }

    /**
     * Obtém o valor da propriedade company.
     * 
     * @return
     *     possible object is
     *     {@link Company }
     *     
     */
    public Company getCompany() {
        return company;
    }

    /**
     * Define o valor da propriedade company.
     * 
     * @param value
     *     allowed object is
     *     {@link Company }
     *     
     */
    public void setCompany(Company value) {
        this.company = value;
    }

    /**
     * Obtém o valor da propriedade contact.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Define o valor da propriedade contact.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Obtém o valor da propriedade salesRepresentative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepresentative() {
        return salesRepresentative;
    }

    /**
     * Define o valor da propriedade salesRepresentative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepresentative(String value) {
        this.salesRepresentative = value;
    }

}
