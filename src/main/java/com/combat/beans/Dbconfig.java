//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2020.11.27 时间 10:37:17 AM GMT+08:00
//


package com.combat.beans;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}configpath"/>
 *         &lt;element ref="{}username"/>
 *         &lt;element ref="{}password"/>
 *         &lt;element ref="{}dburl"/>
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
        "configpath",
        "username",
        "password",
        "dburl"
})
@XmlRootElement(name = "dbconfig")
public class Dbconfig {

    @XmlElement(required = true)
    protected String configpath;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String username;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String password;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String dburl;

    /**
     * 获取configpath属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getConfigpath() {
        return configpath;
    }

    /**
     * 设置configpath属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setConfigpath(String value) {
        this.configpath = value;
    }

    /**
     * 获取username属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置username属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * 获取password属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置password属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPassword(String value) {
        this.password = value;
    }

    /**
     * 获取dburl属性的值。
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDburl() {
        return dburl;
    }

    /**
     * 设置dburl属性的值。
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDburl(String value) {
        this.dburl = value;
    }

}
