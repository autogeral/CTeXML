//
// Este arquivo foi gerado pela Arquitetura JavaTM para ImplementaÃ§Ã£o de ReferÃªncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificaÃ§Ãµes neste arquivo serÃ£o perdidas apÃ³s a recompilaÃ§Ã£o do esquema de origem. 
// Gerado em: 2017.03.13 Ã s 04:40:33 PM BRT 
//


package br.com.cte.v200.proccte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados Unidade de Transporte
 * 
 * <p>Classe Java de TUnidadeTransp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteÃºdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TUnidadeTransp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TtipoUnidTransp"/>
 *         &lt;element name="idUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TContainer"/>
 *         &lt;element name="lacUnidTransp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nLacre">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="qtdRat" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_0303" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUnidadeTransp", propOrder = {
    "tpUnidTransp",
    "idUnidTransp",
    "lacUnidTransp",
    "infUnidCarga",
    "qtdRat"
})
public class TUnidadeTransp {

    @XmlElement(required = true)
    protected String tpUnidTransp;
    @XmlElement(required = true)
    protected String idUnidTransp;
    protected List<TUnidadeTransp.LacUnidTransp> lacUnidTransp;
    protected List<TUnidCarga> infUnidCarga;
    protected String qtdRat;

    /**
     * ObtÃ©m o valor da propriedade tpUnidTransp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpUnidTransp() {
        return tpUnidTransp;
    }

    /**
     * Define o valor da propriedade tpUnidTransp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpUnidTransp(String value) {
        this.tpUnidTransp = value;
    }

    /**
     * ObtÃ©m o valor da propriedade idUnidTransp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidTransp() {
        return idUnidTransp;
    }

    /**
     * Define o valor da propriedade idUnidTransp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidTransp(String value) {
        this.idUnidTransp = value;
    }

    /**
     * Gets the value of the lacUnidTransp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacUnidTransp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacUnidTransp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUnidadeTransp.LacUnidTransp }
     * 
     * 
     */
    public List<TUnidadeTransp.LacUnidTransp> getLacUnidTransp() {
        if (lacUnidTransp == null) {
            lacUnidTransp = new ArrayList<TUnidadeTransp.LacUnidTransp>();
        }
        return this.lacUnidTransp;
    }

    /**
     * Gets the value of the infUnidCarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infUnidCarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfUnidCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUnidCarga }
     * 
     * 
     */
    public List<TUnidCarga> getInfUnidCarga() {
        if (infUnidCarga == null) {
            infUnidCarga = new ArrayList<TUnidCarga>();
        }
        return this.infUnidCarga;
    }

    /**
     * ObtÃ©m o valor da propriedade qtdRat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdRat() {
        return qtdRat;
    }

    /**
     * Define o valor da propriedade qtdRat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdRat(String value) {
        this.qtdRat = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteÃºdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="nLacre">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
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
        "nLacre"
    })
    public static class LacUnidTransp {

        @XmlElement(required = true)
        protected String nLacre;

        /**
         * ObtÃ©m o valor da propriedade nLacre.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNLacre() {
            return nLacre;
        }

        /**
         * Define o valor da propriedade nLacre.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNLacre(String value) {
            this.nLacre = value;
        }

    }

}
