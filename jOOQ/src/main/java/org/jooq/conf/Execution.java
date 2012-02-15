//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.0.5-b02-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.15 at 10:19:56 PM MEZ 
//


package org.jooq.conf;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Execution complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Execution">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="statementType" type="{http://www.jooq.org/xsd/jooq-runtime-2.0.5.xsd}StatementType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Execution", propOrder = {

})
public class Execution implements Serializable
{

    private final static long serialVersionUID = 205L;
    @XmlElement(defaultValue = "PREPARED_STATEMENT")
    protected StatementType statementType = StatementType.PREPARED_STATEMENT;

    /**
     * Default no-arg constructor
     * 
     */
    public Execution() {
        super();
    }

    /**
     * Fully-initialising value constructor
     * 
     */
    public Execution(final StatementType statementType) {
        this.statementType = statementType;
    }

    /**
     * Gets the value of the statementType property.
     * 
     * @return
     *     possible object is
     *     {@link StatementType }
     *     
     */
    public StatementType getStatementType() {
        return statementType;
    }

    /**
     * Sets the value of the statementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatementType }
     *     
     */
    public void setStatementType(StatementType value) {
        this.statementType = value;
    }

    public Execution withStatementType(StatementType value) {
        setStatementType(value);
        return this;
    }

}
