//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.11.27 时间 10:37:17 AM GMT+08:00
//


package com.combat.beans;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 *
 * <p>以下模式片段指定包含在此类中的预期内容。
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}dbconfig"/>
 *         &lt;element ref="{}sql" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "dbconfig",
        "sql"
})
@XmlRootElement(name = "dbsqls")
public class Dbsqls {

    @XmlElement(required = true)
    protected Dbconfig dbconfig;
    @XmlElement(required = true)
    protected List<Sql> sql;

    /**
     * 获取dbconfig属性的值。
     *
     * @return
     *     possible object is
     *     {@link Dbconfig }
     *
     */
    public Dbconfig getDbconfig() {
        return dbconfig;
    }

    /**
     * 设置dbconfig属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link Dbconfig }
     *
     */
    public void setDbconfig(Dbconfig value) {
        this.dbconfig = value;
    }

    /**
     * Gets the value of the sql property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sql property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSql().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Sql }
     *
     *
     */
    public List<Sql> getSql() {
        if (sql == null) {
            sql = new ArrayList<Sql>();
        }
        return this.sql;
    }

}
