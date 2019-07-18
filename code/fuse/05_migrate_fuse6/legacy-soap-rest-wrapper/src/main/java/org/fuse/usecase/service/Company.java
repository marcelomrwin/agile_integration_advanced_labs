
package org.fuse.usecase.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de company complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="company"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="active" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="geo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "company", propOrder = {
    "active",
    "geo",
    "name"
})
public class Company {

    protected boolean active;
    protected String geo;
    protected String name;

    /**
     * Obtém o valor da propriedade active.
     * 
     */
    public boolean isActive() {
        return active;
    }

    /**
     * Define o valor da propriedade active.
     * 
     */
    public void setActive(boolean value) {
        this.active = value;
    }

    /**
     * Obtém o valor da propriedade geo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGeo() {
        return geo;
    }

    /**
     * Define o valor da propriedade geo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGeo(String value) {
        this.geo = value;
    }

    /**
     * Obtém o valor da propriedade name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define o valor da propriedade name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

}
