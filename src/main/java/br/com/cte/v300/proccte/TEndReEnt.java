//
// Este arquivo foi gerado pela Arquitetura JavaTM para ImplementaÃ§Ã£o de ReferÃªncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificaÃ§Ãµes neste arquivo serÃ£o perdidas apÃ³s a recompilaÃ§Ã£o do esquema de origem. 
// Gerado em: 2017.03.13 Ã s 04:40:34 PM BRT 
//


package br.com.cte.v300.proccte;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Tipo Dados do Local de Retirada ou Entrega
 * 
 * <p>Classe Java de TEndReEnt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteÃºdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TEndReEnt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *         &lt;/choice>
 *         &lt;element name="xNome">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xLgr">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="255"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xCpl" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xBairro">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="cMun" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *         &lt;element name="xMun">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;maxLength value="60"/>
 *               &lt;minLength value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEndReEnt", propOrder = {
    "cnpj",
    "cpf",
    "xNome",
    "xLgr",
    "nro",
    "xCpl",
    "xBairro",
    "cMun",
    "xMun",
    "uf"
})
public class TEndReEnt {

    @XmlElement(name = "CNPJ")
    protected String cnpj;
    @XmlElement(name = "CPF")
    protected String cpf;
    @XmlElement(required = true)
    protected String xNome;
    @XmlElement(required = true)
    protected String xLgr;
    @XmlElement(required = true)
    protected String nro;
    protected String xCpl;
    @XmlElement(required = true)
    protected String xBairro;
    @XmlElement(required = true)
    protected String cMun;
    @XmlElement(required = true)
    protected String xMun;
    @XmlElement(name = "UF", required = true)
    @XmlSchemaType(name = "string")
    protected TUf uf;

    /**
     * ObtÃ©m o valor da propriedade cnpj.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJ() {
        return cnpj;
    }

    /**
     * Define o valor da propriedade cnpj.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJ(String value) {
        this.cnpj = value;
    }

    /**
     * ObtÃ©m o valor da propriedade cpf.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCPF() {
        return cpf;
    }

    /**
     * Define o valor da propriedade cpf.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCPF(String value) {
        this.cpf = value;
    }

    /**
     * ObtÃ©m o valor da propriedade xNome.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXNome() {
        return xNome;
    }

    /**
     * Define o valor da propriedade xNome.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXNome(String value) {
        this.xNome = value;
    }

    /**
     * ObtÃ©m o valor da propriedade xLgr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXLgr() {
        return xLgr;
    }

    /**
     * Define o valor da propriedade xLgr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXLgr(String value) {
        this.xLgr = value;
    }

    /**
     * ObtÃ©m o valor da propriedade nro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNro() {
        return nro;
    }

    /**
     * Define o valor da propriedade nro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNro(String value) {
        this.nro = value;
    }

    /**
     * ObtÃ©m o valor da propriedade xCpl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXCpl() {
        return xCpl;
    }

    /**
     * Define o valor da propriedade xCpl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXCpl(String value) {
        this.xCpl = value;
    }

    /**
     * ObtÃ©m o valor da propriedade xBairro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXBairro() {
        return xBairro;
    }

    /**
     * Define o valor da propriedade xBairro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXBairro(String value) {
        this.xBairro = value;
    }

    /**
     * ObtÃ©m o valor da propriedade cMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCMun() {
        return cMun;
    }

    /**
     * Define o valor da propriedade cMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCMun(String value) {
        this.cMun = value;
    }

    /**
     * ObtÃ©m o valor da propriedade xMun.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMun() {
        return xMun;
    }

    /**
     * Define o valor da propriedade xMun.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXMun(String value) {
        this.xMun = value;
    }

    /**
     * ObtÃ©m o valor da propriedade uf.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUF() {
        return uf;
    }

    /**
     * Define o valor da propriedade uf.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUF(TUf value) {
        this.uf = value;
    }

}
