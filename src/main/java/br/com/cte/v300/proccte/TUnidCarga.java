//
// Este arquivo foi gerado pela Arquitetura JavaTM para ImplementaÃ§Ã£o de ReferÃªncia (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificaÃ§Ãµes neste arquivo serÃ£o perdidas apÃ³s a recompilaÃ§Ã£o do esquema de origem. 
// Gerado em: 2017.03.13 Ã s 04:40:34 PM BRT 
//


package br.com.cte.v300.proccte;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados Unidade de Carga
 * 
 * <p>Classe Java de TUnidCarga complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteÃºdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TUnidCarga">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TtipoUnidCarga"/>
 *         &lt;element name="idUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TContainer"/>
 *         &lt;element name="lacUnidCarga" maxOccurs="unbounded" minOccurs="0">
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
@XmlType(name = "TUnidCarga", propOrder = {
    "tpUnidCarga",
    "idUnidCarga",
    "lacUnidCarga",
    "qtdRat"
})
public class TUnidCarga {

    @XmlElement(required = true)
    protected String tpUnidCarga;
    @XmlElement(required = true)
    protected String idUnidCarga;
    protected List<TUnidCarga.LacUnidCarga> lacUnidCarga;
    protected String qtdRat;

    /**
     * ObtÃ©m o valor da propriedade tpUnidCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpUnidCarga() {
        return tpUnidCarga;
    }

    /**
     * Define o valor da propriedade tpUnidCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpUnidCarga(String value) {
        this.tpUnidCarga = value;
    }

    /**
     * ObtÃ©m o valor da propriedade idUnidCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidCarga() {
        return idUnidCarga;
    }

    /**
     * Define o valor da propriedade idUnidCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidCarga(String value) {
        this.idUnidCarga = value;
    }

    /**
     * Gets the value of the lacUnidCarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacUnidCarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacUnidCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUnidCarga.LacUnidCarga }
     * 
     * 
     */
    public List<TUnidCarga.LacUnidCarga> getLacUnidCarga() {
        if (lacUnidCarga == null) {
            lacUnidCarga = new ArrayList<TUnidCarga.LacUnidCarga>();
        }
        return this.lacUnidCarga;
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
    public static class LacUnidCarga {

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
