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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de ConcessÃ£o de AutorizaÃ§Ã£o da CT-e
 * 
 * <p>Classe Java de TEnviCTe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteÃºdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TEnviCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idLote" type="{http://www.portalfiscal.inf.br/cte}TIdLote"/>
 *         &lt;element name="CTe" type="{http://www.portalfiscal.inf.br/cte}TCTe" maxOccurs="50"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEnviCTe", propOrder = {
    "idLote",
    "cTe"
})
public class TEnviCTe {

    @XmlElement(required = true)
    protected String idLote;
    @XmlElement(name = "CTe", required = true)
    protected List<TCTe> cTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * ObtÃ©m o valor da propriedade idLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdLote() {
        return idLote;
    }

    /**
     * Define o valor da propriedade idLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdLote(String value) {
        this.idLote = value;
    }

    /**
     * Gets the value of the cTe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cTe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCTe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TCTe }
     * 
     * 
     */
    public List<TCTe> getCTe() {
        if (cTe == null) {
            cTe = new ArrayList<TCTe>();
        }
        return this.cTe;
    }

    /**
     * ObtÃ©m o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

}
