//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.5-2 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.09.08 às 04:15:54 PM BRT 
//


package br.com.cte.v104.modalrodoviario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RNTRC" type="{http://www.portalfiscal.inf.br/cte}TRNTRC"/>
 *         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *         &lt;element name="lota">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CIOT" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TCIOT">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="occ" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="serie" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="3"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nOcc">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9]{1}[0-9]{0,5}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                   &lt;element name="emiOcc">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                             &lt;element name="cInt" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="10"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
 *                             &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="fone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="7"/>
 *                                   &lt;maxLength value="12"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valePed" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CNPJForn">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TCnpj">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nCompra">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{1,20}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CNPJPg" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="veic" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cInt" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="10"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="RENAVAM">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;length value="9"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="placa">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TPlaca">
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tara">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="0|[1-9]{1}[0-9]{0,5}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="capKG">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="0|[1-9]{1}[0-9]{0,5}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="capM3">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="0|[1-9]{1}[0-9]{0,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpProp">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="P"/>
 *                         &lt;enumeration value="T"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpVeic">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpRod">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="00"/>
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="06"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="tpCar">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="00"/>
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                   &lt;element name="prop" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                             &lt;/choice>
 *                             &lt;element name="RNTRC" type="{http://www.portalfiscal.inf.br/cte}TRNTRC"/>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="IE">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;/sequence>
 *                             &lt;element name="tpProp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="lacRodo" maxOccurs="unbounded" minOccurs="0">
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
 *         &lt;element name="moto" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xNome">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;maxLength value="60"/>
 *                         &lt;minLength value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
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
    "rntrc",
    "dPrev",
    "lota",
    "ciot",
    "occ",
    "valePed",
    "veic",
    "lacRodo",
    "moto"
})
@XmlRootElement(name = "rodo")
public class Rodo {

    @XmlElement(name = "RNTRC", required = true)
    protected String rntrc;
    @XmlElement(required = true)
    protected String dPrev;
    @XmlElement(required = true)
    protected String lota;
    @XmlElement(name = "CIOT")
    protected String ciot;
    protected List<Rodo.Occ> occ;
    protected List<Rodo.ValePed> valePed;
    protected List<Rodo.Veic> veic;
    protected List<Rodo.LacRodo> lacRodo;
    protected List<Rodo.Moto> moto;

    /**
     * Obtém o valor da propriedade rntrc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRNTRC() {
        return rntrc;
    }

    /**
     * Define o valor da propriedade rntrc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRNTRC(String value) {
        this.rntrc = value;
    }

    /**
     * Obtém o valor da propriedade dPrev.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDPrev() {
        return dPrev;
    }

    /**
     * Define o valor da propriedade dPrev.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDPrev(String value) {
        this.dPrev = value;
    }

    /**
     * Obtém o valor da propriedade lota.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLota() {
        return lota;
    }

    /**
     * Define o valor da propriedade lota.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLota(String value) {
        this.lota = value;
    }

    /**
     * Obtém o valor da propriedade ciot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCIOT() {
        return ciot;
    }

    /**
     * Define o valor da propriedade ciot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCIOT(String value) {
        this.ciot = value;
    }

    /**
     * Gets the value of the occ property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the occ property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodo.Occ }
     * 
     * 
     */
    public List<Rodo.Occ> getOcc() {
        if (occ == null) {
            occ = new ArrayList<Rodo.Occ>();
        }
        return this.occ;
    }

    /**
     * Gets the value of the valePed property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the valePed property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValePed().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodo.ValePed }
     * 
     * 
     */
    public List<Rodo.ValePed> getValePed() {
        if (valePed == null) {
            valePed = new ArrayList<Rodo.ValePed>();
        }
        return this.valePed;
    }

    /**
     * Gets the value of the veic property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the veic property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVeic().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodo.Veic }
     * 
     * 
     */
    public List<Rodo.Veic> getVeic() {
        if (veic == null) {
            veic = new ArrayList<Rodo.Veic>();
        }
        return this.veic;
    }

    /**
     * Gets the value of the lacRodo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacRodo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacRodo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodo.LacRodo }
     * 
     * 
     */
    public List<Rodo.LacRodo> getLacRodo() {
        if (lacRodo == null) {
            lacRodo = new ArrayList<Rodo.LacRodo>();
        }
        return this.lacRodo;
    }

    /**
     * Gets the value of the moto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the moto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMoto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rodo.Moto }
     * 
     * 
     */
    public List<Rodo.Moto> getMoto() {
        if (moto == null) {
            moto = new ArrayList<Rodo.Moto>();
        }
        return this.moto;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
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
    public static class LacRodo {

        @XmlElement(required = true)
        protected String nLacre;

        /**
         * Obtém o valor da propriedade nLacre.
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


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="xNome">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;maxLength value="60"/>
     *               &lt;minLength value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
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
        "xNome",
        "cpf"
    })
    public static class Moto {

        @XmlElement(required = true)
        protected String xNome;
        @XmlElement(name = "CPF", required = true)
        protected String cpf;

        /**
         * Obtém o valor da propriedade xNome.
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
         * Obtém o valor da propriedade cpf.
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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="serie" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="3"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nOcc">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[1-9]{1}[0-9]{0,5}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *         &lt;element name="emiOcc">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                   &lt;element name="cInt" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="10"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
     *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="fone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="7"/>
     *                         &lt;maxLength value="12"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "serie",
        "nOcc",
        "dEmi",
        "emiOcc"
    })
    public static class Occ {

        protected String serie;
        @XmlElement(required = true)
        protected String nOcc;
        @XmlElement(required = true)
        protected String dEmi;
        @XmlElement(required = true)
        protected Rodo.Occ.EmiOcc emiOcc;

        /**
         * Obtém o valor da propriedade serie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Define o valor da propriedade serie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Obtém o valor da propriedade nOcc.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNOcc() {
            return nOcc;
        }

        /**
         * Define o valor da propriedade nOcc.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNOcc(String value) {
            this.nOcc = value;
        }

        /**
         * Obtém o valor da propriedade dEmi.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDEmi() {
            return dEmi;
        }

        /**
         * Define o valor da propriedade dEmi.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDEmi(String value) {
            this.dEmi = value;
        }

        /**
         * Obtém o valor da propriedade emiOcc.
         * 
         * @return
         *     possible object is
         *     {@link Rodo.Occ.EmiOcc }
         *     
         */
        public Rodo.Occ.EmiOcc getEmiOcc() {
            return emiOcc;
        }

        /**
         * Define o valor da propriedade emiOcc.
         * 
         * @param value
         *     allowed object is
         *     {@link Rodo.Occ.EmiOcc }
         *     
         */
        public void setEmiOcc(Rodo.Occ.EmiOcc value) {
            this.emiOcc = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *         &lt;element name="cInt" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="10"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
         *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="fone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="7"/>
         *               &lt;maxLength value="12"/>
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
            "cnpj",
            "cInt",
            "ie",
            "uf",
            "fone"
        })
        public static class EmiOcc {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            protected String cInt;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(name = "UF", required = true)
            protected TUf uf;
            protected String fone;

            /**
             * Obtém o valor da propriedade cnpj.
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
             * Obtém o valor da propriedade cInt.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCInt() {
                return cInt;
            }

            /**
             * Define o valor da propriedade cInt.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCInt(String value) {
                this.cInt = value;
            }

            /**
             * Obtém o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade uf.
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

            /**
             * Obtém o valor da propriedade fone.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFone() {
                return fone;
            }

            /**
             * Define o valor da propriedade fone.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFone(String value) {
                this.fone = value;
            }

        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CNPJForn">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TCnpj">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nCompra">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;pattern value="[0-9]{1,20}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CNPJPg" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc" minOccurs="0"/>
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
        "cnpjForn",
        "nCompra",
        "cnpjPg"
    })
    public static class ValePed {

        @XmlElement(name = "CNPJForn", required = true)
        protected String cnpjForn;
        @XmlElement(required = true)
        protected String nCompra;
        @XmlElement(name = "CNPJPg")
        protected String cnpjPg;

        /**
         * Obtém o valor da propriedade cnpjForn.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJForn() {
            return cnpjForn;
        }

        /**
         * Define o valor da propriedade cnpjForn.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJForn(String value) {
            this.cnpjForn = value;
        }

        /**
         * Obtém o valor da propriedade nCompra.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNCompra() {
            return nCompra;
        }

        /**
         * Define o valor da propriedade nCompra.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNCompra(String value) {
            this.nCompra = value;
        }

        /**
         * Obtém o valor da propriedade cnpjPg.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJPg() {
            return cnpjPg;
        }

        /**
         * Define o valor da propriedade cnpjPg.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJPg(String value) {
            this.cnpjPg = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cInt" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="10"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="RENAVAM">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;length value="9"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="placa">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TPlaca">
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tara">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="0|[1-9]{1}[0-9]{0,5}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="capKG">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="0|[1-9]{1}[0-9]{0,5}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="capM3">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="0|[1-9]{1}[0-9]{0,2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpProp">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="P"/>
     *               &lt;enumeration value="T"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpVeic">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpRod">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="00"/>
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="06"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="tpCar">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="00"/>
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *         &lt;element name="prop" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                   &lt;/choice>
     *                   &lt;element name="RNTRC" type="{http://www.portalfiscal.inf.br/cte}TRNTRC"/>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="IE">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;/sequence>
     *                   &lt;element name="tpProp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
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
        "cInt",
        "renavam",
        "placa",
        "tara",
        "capKG",
        "capM3",
        "tpProp",
        "tpVeic",
        "tpRod",
        "tpCar",
        "uf",
        "prop"
    })
    public static class Veic {

        protected String cInt;
        @XmlElement(name = "RENAVAM", required = true)
        protected String renavam;
        @XmlElement(required = true)
        protected String placa;
        @XmlElement(required = true)
        protected String tara;
        @XmlElement(required = true)
        protected String capKG;
        @XmlElement(required = true)
        protected String capM3;
        @XmlElement(required = true)
        protected String tpProp;
        @XmlElement(required = true)
        protected String tpVeic;
        @XmlElement(required = true)
        protected String tpRod;
        @XmlElement(required = true)
        protected String tpCar;
        @XmlElement(name = "UF", required = true)
        protected TUf uf;
        protected Rodo.Veic.Prop prop;

        /**
         * Obtém o valor da propriedade cInt.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCInt() {
            return cInt;
        }

        /**
         * Define o valor da propriedade cInt.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCInt(String value) {
            this.cInt = value;
        }

        /**
         * Obtém o valor da propriedade renavam.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRENAVAM() {
            return renavam;
        }

        /**
         * Define o valor da propriedade renavam.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRENAVAM(String value) {
            this.renavam = value;
        }

        /**
         * Obtém o valor da propriedade placa.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaca() {
            return placa;
        }

        /**
         * Define o valor da propriedade placa.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaca(String value) {
            this.placa = value;
        }

        /**
         * Obtém o valor da propriedade tara.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTara() {
            return tara;
        }

        /**
         * Define o valor da propriedade tara.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTara(String value) {
            this.tara = value;
        }

        /**
         * Obtém o valor da propriedade capKG.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCapKG() {
            return capKG;
        }

        /**
         * Define o valor da propriedade capKG.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCapKG(String value) {
            this.capKG = value;
        }

        /**
         * Obtém o valor da propriedade capM3.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCapM3() {
            return capM3;
        }

        /**
         * Define o valor da propriedade capM3.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCapM3(String value) {
            this.capM3 = value;
        }

        /**
         * Obtém o valor da propriedade tpProp.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpProp() {
            return tpProp;
        }

        /**
         * Define o valor da propriedade tpProp.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpProp(String value) {
            this.tpProp = value;
        }

        /**
         * Obtém o valor da propriedade tpVeic.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpVeic() {
            return tpVeic;
        }

        /**
         * Define o valor da propriedade tpVeic.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpVeic(String value) {
            this.tpVeic = value;
        }

        /**
         * Obtém o valor da propriedade tpRod.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpRod() {
            return tpRod;
        }

        /**
         * Define o valor da propriedade tpRod.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpRod(String value) {
            this.tpRod = value;
        }

        /**
         * Obtém o valor da propriedade tpCar.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpCar() {
            return tpCar;
        }

        /**
         * Define o valor da propriedade tpCar.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpCar(String value) {
            this.tpCar = value;
        }

        /**
         * Obtém o valor da propriedade uf.
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

        /**
         * Obtém o valor da propriedade prop.
         * 
         * @return
         *     possible object is
         *     {@link Rodo.Veic.Prop }
         *     
         */
        public Rodo.Veic.Prop getProp() {
            return prop;
        }

        /**
         * Define o valor da propriedade prop.
         * 
         * @param value
         *     allowed object is
         *     {@link Rodo.Veic.Prop }
         *     
         */
        public void setProp(Rodo.Veic.Prop value) {
            this.prop = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *         &lt;/choice>
         *         &lt;element name="RNTRC" type="{http://www.portalfiscal.inf.br/cte}TRNTRC"/>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="IE">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;/sequence>
         *         &lt;element name="tpProp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
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
            "cpf",
            "cnpj",
            "rntrc",
            "xNome",
            "ie",
            "uf",
            "tpProp"
        })
        public static class Prop {

            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "RNTRC", required = true)
            protected String rntrc;
            @XmlElement(required = true)
            protected String xNome;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(name = "UF")
            protected TUf uf;
            @XmlElement(required = true)
            protected String tpProp;

            /**
             * Obtém o valor da propriedade cpf.
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
             * Obtém o valor da propriedade cnpj.
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
             * Obtém o valor da propriedade rntrc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRNTRC() {
                return rntrc;
            }

            /**
             * Define o valor da propriedade rntrc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRNTRC(String value) {
                this.rntrc = value;
            }

            /**
             * Obtém o valor da propriedade xNome.
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
             * Obtém o valor da propriedade ie.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIE() {
                return ie;
            }

            /**
             * Define o valor da propriedade ie.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIE(String value) {
                this.ie = value;
            }

            /**
             * Obtém o valor da propriedade uf.
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

            /**
             * Obtém o valor da propriedade tpProp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpProp() {
                return tpProp;
            }

            /**
             * Define o valor da propriedade tpProp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpProp(String value) {
                this.tpProp = value;
            }

        }

    }

}
