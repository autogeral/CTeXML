//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementa��o de Refer�ncia (JAXB) de Bind XML, v2.2.5-2 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modifica��es neste arquivo ser�o perdidas ap�s a recompila��o do esquema de origem. 
// Gerado em: PM.09.08 �s 04:15:54 PM BRT 
//


package br.com.cte.v104.modalrodoviario;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * Tipo Conhecimento de Transporte Eletr�nico
 * 
 * <p>Classe Java de TCTe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infCte">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ide">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
 *                             &lt;element name="cCT">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
 *                             &lt;element name="natOp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="forPag">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
 *                             &lt;element name="serie">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
 *                             &lt;element name="dhEmi">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpImp">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpEmis">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="5"/>
 *                                   &lt;enumeration value="7"/>
 *                                   &lt;enumeration value="8"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cDV">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{1}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *                             &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTe"/>
 *                             &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/>
 *                             &lt;element name="verProc">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="refCTE" type="{http://www.portalfiscal.inf.br/cte}TChNFe" minOccurs="0"/>
 *                             &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                             &lt;element name="xMunEnv">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
 *                             &lt;element name="tpServ">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                             &lt;element name="xMunIni">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
 *                             &lt;element name="xMunFim">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="60"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                             &lt;element name="retira">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;enumeration value="0"/>
 *                                   &lt;enumeration value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xDetRetira" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="160"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;element name="toma03">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="toma">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="0"/>
 *                                               &lt;enumeration value="1"/>
 *                                               &lt;enumeration value="2"/>
 *                                               &lt;enumeration value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="toma4">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="toma">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="4"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;choice>
 *                                           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                                           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                                         &lt;/choice>
 *                                         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
 *                                         &lt;sequence>
 *                                           &lt;element name="xNome">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                 &lt;maxLength value="60"/>
 *                                                 &lt;minLength value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="xFant" minOccurs="0">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                 &lt;maxLength value="60"/>
 *                                                 &lt;minLength value="1"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="fone" minOccurs="0">
 *                                             &lt;simpleType>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                 &lt;whiteSpace value="preserve"/>
 *                                                 &lt;pattern value="[0-9]{7,12}"/>
 *                                               &lt;/restriction>
 *                                             &lt;/simpleType>
 *                                           &lt;/element>
 *                                           &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                                           &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                             &lt;sequence minOccurs="0">
 *                               &lt;element name="dhCont">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;whiteSpace value="preserve"/>
 *                                     &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="xJust">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                     &lt;minLength value="15"/>
 *                                     &lt;maxLength value="256"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="compl" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xCaracAd" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="15"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xCaracSer" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="30"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xEmi" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="20"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fluxo" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xOrig" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="xPass" minOccurs="0">
 *                                                   &lt;simpleType>
 *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                       &lt;minLength value="1"/>
 *                                                       &lt;maxLength value="15"/>
 *                                                     &lt;/restriction>
 *                                                   &lt;/simpleType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="xDest" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="15"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="xRota" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="10"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Entrega" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;choice>
 *                                         &lt;element name="semData">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpPer">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="0"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="comData">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpPer">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="noPeriodo">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpPer">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="4"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                   &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                       &lt;choice>
 *                                         &lt;element name="semHora">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpHor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="0"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="comHora">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpHor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="1"/>
 *                                                         &lt;enumeration value="2"/>
 *                                                         &lt;enumeration value="3"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="noInter">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="tpHor">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="4"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
 *                                                   &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/choice>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="origCalc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="destCalc" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="40"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xObs" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="2000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ObsCont" maxOccurs="10" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xTexto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="160"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="xCampo" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xTexto">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;minLength value="1"/>
 *                                             &lt;maxLength value="60"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="xCampo" use="required">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                           &lt;minLength value="1"/>
 *                                           &lt;maxLength value="20"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="emit">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                             &lt;element name="IE">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xFant" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="rem" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xFant" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{7,12}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;choice>
 *                               &lt;element name="infNF" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="nRoma" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nPed" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
 *                                         &lt;element name="serie">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="3"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nDoc">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
 *                                         &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
 *                                         &lt;element name="PIN" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;minLength value="2"/>
 *                                               &lt;maxLength value="9"/>
 *                                               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="locRet" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infNFe" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                         &lt;element name="PIN" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;minLength value="2"/>
 *                                               &lt;maxLength value="9"/>
 *                                               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infOutros" maxOccurs="unbounded">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="tpDoc">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="00"/>
 *                                               &lt;enumeration value="10"/>
 *                                               &lt;enumeration value="99"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="descOutros" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="100"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nDoc" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                         &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/choice>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="exped" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{7,12}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderExped" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="receb" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{7,12}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderReceb" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="dest" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;choice>
 *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                             &lt;/choice>
 *                             &lt;element name="IE" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="xNome">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="60"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="fone" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{7,12}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="ISUF" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;whiteSpace value="preserve"/>
 *                                   &lt;pattern value="[0-9]{8,9}"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
 *                             &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
 *                             &lt;element name="locEnt" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="vPrest">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                             &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="xNome">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                             &lt;maxLength value="15"/>
 *                                             &lt;minLength value="1"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                       &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="imp">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
 *                             &lt;element name="infAdFisco" minOccurs="0">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;maxLength value="2000"/>
 *                                   &lt;minLength value="1"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;choice>
 *                     &lt;element name="infCTeNorm">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="infCarga">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                                         &lt;element name="proPred">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="60"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xOutCat" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="30"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="infQ" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="cUnid">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                         &lt;whiteSpace value="preserve"/>
 *                                                         &lt;enumeration value="00"/>
 *                                                         &lt;enumeration value="01"/>
 *                                                         &lt;enumeration value="02"/>
 *                                                         &lt;enumeration value="03"/>
 *                                                         &lt;enumeration value="04"/>
 *                                                         &lt;enumeration value="05"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="tpMed">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="20"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="contQt" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="nCont" type="{http://www.portalfiscal.inf.br/cte}TContainer"/>
 *                                         &lt;element name="lacContQt" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="nLacre">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="20"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="docAnt" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="emiDocAnt" maxOccurs="unbounded">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;choice>
 *                                                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                                                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                                                   &lt;/choice>
 *                                                   &lt;sequence minOccurs="0">
 *                                                     &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
 *                                                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                                                   &lt;/sequence>
 *                                                   &lt;element name="xNome">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;maxLength value="60"/>
 *                                                         &lt;minLength value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="idDocAnt" maxOccurs="2">
 *                                                     &lt;complexType>
 *                                                       &lt;complexContent>
 *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                           &lt;choice>
 *                                                             &lt;element name="idDocAntPap" maxOccurs="unbounded">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
 *                                                                       &lt;element name="serie">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                                             &lt;minLength value="1"/>
 *                                                                             &lt;maxLength value="3"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="subser" minOccurs="0">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                                             &lt;minLength value="1"/>
 *                                                                             &lt;maxLength value="2"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="nDoc">
 *                                                                         &lt;simpleType>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                             &lt;whiteSpace value="preserve"/>
 *                                                                             &lt;minLength value="1"/>
 *                                                                             &lt;maxLength value="20"/>
 *                                                                             &lt;pattern value="[0-9]{1,20}"/>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/simpleType>
 *                                                                       &lt;/element>
 *                                                                       &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                             &lt;element name="idDocAntEle" maxOccurs="unbounded">
 *                                                               &lt;complexType>
 *                                                                 &lt;complexContent>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                     &lt;sequence>
 *                                                                       &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                                     &lt;/sequence>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/complexContent>
 *                                                               &lt;/complexType>
 *                                                             &lt;/element>
 *                                                           &lt;/choice>
 *                                                         &lt;/restriction>
 *                                                       &lt;/complexContent>
 *                                                     &lt;/complexType>
 *                                                   &lt;/element>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="seg" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="respSeg">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;enumeration value="0"/>
 *                                               &lt;enumeration value="1"/>
 *                                               &lt;enumeration value="2"/>
 *                                               &lt;enumeration value="3"/>
 *                                               &lt;enumeration value="4"/>
 *                                               &lt;enumeration value="5"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xSeg" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="30"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nApol" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="nAver" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;length value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infModal">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;any processContents='skip'/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="versaoModal" use="required">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                             &lt;whiteSpace value="preserve"/>
 *                                             &lt;pattern value="1\.04"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/attribute>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="peri" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="nONU">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;pattern value="[1-9]{1}[0-9]{0,3}|ND"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xNomeAE">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="150"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xClaRisco">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="40"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="grEmb" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="6"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="qTotProd">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="20"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="qVolTipo" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="60"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="pontoFulgor" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="6"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="veicNovos" maxOccurs="unbounded" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chassi">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;whiteSpace value="preserve"/>
 *                                               &lt;length value="17"/>
 *                                               &lt;pattern value="[A-Z0-9]+"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="cCor">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="4"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="xCor">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="40"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="cMod">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;minLength value="1"/>
 *                                               &lt;maxLength value="6"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="cobr" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="fat" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="nFat" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;minLength value="1"/>
 *                                                         &lt;maxLength value="60"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                   &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                         &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
 *                                           &lt;complexType>
 *                                             &lt;complexContent>
 *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                 &lt;sequence>
 *                                                   &lt;element name="nDup" minOccurs="0">
 *                                                     &lt;simpleType>
 *                                                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                         &lt;maxLength value="60"/>
 *                                                         &lt;minLength value="1"/>
 *                                                       &lt;/restriction>
 *                                                     &lt;/simpleType>
 *                                                   &lt;/element>
 *                                                   &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
 *                                                   &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
 *                                                 &lt;/sequence>
 *                                               &lt;/restriction>
 *                                             &lt;/complexContent>
 *                                           &lt;/complexType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="infCteSub" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="chCte">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                               &lt;pattern value="[0-9]{44}"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                         &lt;choice>
 *                                           &lt;element name="tomaICMS">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;choice>
 *                                                     &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                     &lt;element name="refNF">
 *                                                       &lt;complexType>
 *                                                         &lt;complexContent>
 *                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                             &lt;sequence>
 *                                                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                                                               &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
 *                                                               &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
 *                                                               &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
 *                                                               &lt;element name="nro">
 *                                                                 &lt;simpleType>
 *                                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                                     &lt;whiteSpace value="preserve"/>
 *                                                                     &lt;pattern value="[0-9]{1,6}"/>
 *                                                                   &lt;/restriction>
 *                                                                 &lt;/simpleType>
 *                                                               &lt;/element>
 *                                                               &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                                                             &lt;/sequence>
 *                                                           &lt;/restriction>
 *                                                         &lt;/complexContent>
 *                                                       &lt;/complexType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                                                   &lt;/choice>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element name="tomaNaoICMS">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="refCteAnu">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/choice>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="infCteComp" maxOccurs="10">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
 *                               &lt;element name="vPresComp">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                         &lt;sequence>
 *                                           &lt;element name="compComp" maxOccurs="unbounded" minOccurs="0">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element name="xNome">
 *                                                       &lt;simpleType>
 *                                                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                                           &lt;maxLength value="15"/>
 *                                                           &lt;minLength value="1"/>
 *                                                         &lt;/restriction>
 *                                                       &lt;/simpleType>
 *                                                     &lt;/element>
 *                                                     &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                                                   &lt;/sequence>
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                         &lt;/sequence>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="impComp">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="ICMSComp" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
 *                                         &lt;element name="infAdFisco" minOccurs="0">
 *                                           &lt;simpleType>
 *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                               &lt;maxLength value="1000"/>
 *                                               &lt;minLength value="1"/>
 *                                             &lt;/restriction>
 *                                           &lt;/simpleType>
 *                                         &lt;/element>
 *                                       &lt;/sequence>
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="infCteAnu">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="chCte">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;pattern value="[0-9]{44}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/element>
 *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="CTe[0-9]{44}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCTe", propOrder = {
    "infCte",
    "signature"
})
public class TCTe {

    @XmlElement(required = true)
    protected TCTe.InfCte infCte;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;

    /**
     * Obt�m o valor da propriedade infCte.
     * 
     * @return
     *     possible object is
     *     {@link TCTe.InfCte }
     *     
     */
    public TCTe.InfCte getInfCte() {
        return infCte;
    }

    /**
     * Define o valor da propriedade infCte.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTe.InfCte }
     *     
     */
    public void setInfCte(TCTe.InfCte value) {
        this.infCte = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="ide">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
     *                   &lt;element name="cCT">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
     *                   &lt;element name="natOp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="forPag">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
     *                   &lt;element name="serie">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
     *                   &lt;element name="dhEmi">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpImp">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpEmis">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="5"/>
     *                         &lt;enumeration value="7"/>
     *                         &lt;enumeration value="8"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cDV">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{1}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
     *                   &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTe"/>
     *                   &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/>
     *                   &lt;element name="verProc">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="refCTE" type="{http://www.portalfiscal.inf.br/cte}TChNFe" minOccurs="0"/>
     *                   &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                   &lt;element name="xMunEnv">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
     *                   &lt;element name="tpServ">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                   &lt;element name="xMunIni">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
     *                   &lt;element name="xMunFim">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="60"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                   &lt;element name="retira">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;enumeration value="0"/>
     *                         &lt;enumeration value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xDetRetira" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="160"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="toma03">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="toma">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="0"/>
     *                                     &lt;enumeration value="1"/>
     *                                     &lt;enumeration value="2"/>
     *                                     &lt;enumeration value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="toma4">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="toma">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="4"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;choice>
     *                                 &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                                 &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                               &lt;/choice>
     *                               &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
     *                               &lt;sequence>
     *                                 &lt;element name="xNome">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                       &lt;maxLength value="60"/>
     *                                       &lt;minLength value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="xFant" minOccurs="0">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                       &lt;maxLength value="60"/>
     *                                       &lt;minLength value="1"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="fone" minOccurs="0">
     *                                   &lt;simpleType>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                       &lt;whiteSpace value="preserve"/>
     *                                       &lt;pattern value="[0-9]{7,12}"/>
     *                                     &lt;/restriction>
     *                                   &lt;/simpleType>
     *                                 &lt;/element>
     *                                 &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                                 &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                               &lt;/sequence>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                   &lt;sequence minOccurs="0">
     *                     &lt;element name="dhCont">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;whiteSpace value="preserve"/>
     *                           &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="xJust">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                           &lt;minLength value="15"/>
     *                           &lt;maxLength value="256"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="compl" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xCaracAd" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="15"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xCaracSer" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="30"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xEmi" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="20"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fluxo" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xOrig" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="xPass" minOccurs="0">
     *                                         &lt;simpleType>
     *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                             &lt;minLength value="1"/>
     *                                             &lt;maxLength value="15"/>
     *                                           &lt;/restriction>
     *                                         &lt;/simpleType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="xDest" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="15"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="xRota" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="10"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Entrega" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;choice>
     *                               &lt;element name="semData">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpPer">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="0"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="comData">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpPer">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="noPeriodo">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpPer">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="4"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                         &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                             &lt;choice>
     *                               &lt;element name="semHora">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpHor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="0"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="comHora">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpHor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="1"/>
     *                                               &lt;enumeration value="2"/>
     *                                               &lt;enumeration value="3"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="noInter">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="tpHor">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="4"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
     *                                         &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/choice>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="origCalc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="destCalc" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="40"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xObs" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="2000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ObsCont" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xTexto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="160"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="xCampo" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xTexto">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;minLength value="1"/>
     *                                   &lt;maxLength value="60"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="xCampo" use="required">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                 &lt;minLength value="1"/>
     *                                 &lt;maxLength value="20"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="emit">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                   &lt;element name="IE">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xFant" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="rem" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xFant" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{7,12}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;choice>
     *                     &lt;element name="infNF" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="nRoma" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="nPed" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
     *                               &lt;element name="serie">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="3"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="nDoc">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                               &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
     *                               &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
     *                               &lt;element name="PIN" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;minLength value="2"/>
     *                                     &lt;maxLength value="9"/>
     *                                     &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="locRet" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infNFe" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                               &lt;element name="PIN" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;minLength value="2"/>
     *                                     &lt;maxLength value="9"/>
     *                                     &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infOutros" maxOccurs="unbounded">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="tpDoc">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="00"/>
     *                                     &lt;enumeration value="10"/>
     *                                     &lt;enumeration value="99"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="descOutros" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="100"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="nDoc" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                               &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/choice>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="exped" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{7,12}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderExped" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="receb" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{7,12}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderReceb" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="dest" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;choice>
     *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                   &lt;/choice>
     *                   &lt;element name="IE" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="xNome">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="60"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="fone" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{7,12}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="ISUF" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;whiteSpace value="preserve"/>
     *                         &lt;pattern value="[0-9]{8,9}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
     *                   &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
     *                   &lt;element name="locEnt" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="vPrest">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                   &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                   &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="xNome">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                   &lt;maxLength value="15"/>
     *                                   &lt;minLength value="1"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                             &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
     *         &lt;element name="imp">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
     *                   &lt;element name="infAdFisco" minOccurs="0">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;maxLength value="2000"/>
     *                         &lt;minLength value="1"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;choice>
     *           &lt;element name="infCTeNorm">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="infCarga">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *                               &lt;element name="proPred">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="60"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xOutCat" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="30"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="infQ" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="cUnid">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                               &lt;whiteSpace value="preserve"/>
     *                                               &lt;enumeration value="00"/>
     *                                               &lt;enumeration value="01"/>
     *                                               &lt;enumeration value="02"/>
     *                                               &lt;enumeration value="03"/>
     *                                               &lt;enumeration value="04"/>
     *                                               &lt;enumeration value="05"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="tpMed">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="20"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="contQt" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="nCont" type="{http://www.portalfiscal.inf.br/cte}TContainer"/>
     *                               &lt;element name="lacContQt" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="nLacre">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="20"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="docAnt" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="emiDocAnt" maxOccurs="unbounded">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;choice>
     *                                           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *                                           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *                                         &lt;/choice>
     *                                         &lt;sequence minOccurs="0">
     *                                           &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
     *                                           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *                                         &lt;/sequence>
     *                                         &lt;element name="xNome">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;maxLength value="60"/>
     *                                               &lt;minLength value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="idDocAnt" maxOccurs="2">
     *                                           &lt;complexType>
     *                                             &lt;complexContent>
     *                                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                 &lt;choice>
     *                                                   &lt;element name="idDocAntPap" maxOccurs="unbounded">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
     *                                                             &lt;element name="serie">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                                   &lt;minLength value="1"/>
     *                                                                   &lt;maxLength value="3"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="subser" minOccurs="0">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                                   &lt;minLength value="1"/>
     *                                                                   &lt;maxLength value="2"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="nDoc">
     *                                                               &lt;simpleType>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                                   &lt;whiteSpace value="preserve"/>
     *                                                                   &lt;minLength value="1"/>
     *                                                                   &lt;maxLength value="20"/>
     *                                                                   &lt;pattern value="[0-9]{1,20}"/>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/simpleType>
     *                                                             &lt;/element>
     *                                                             &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                   &lt;element name="idDocAntEle" maxOccurs="unbounded">
     *                                                     &lt;complexType>
     *                                                       &lt;complexContent>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                           &lt;sequence>
     *                                                             &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                                           &lt;/sequence>
     *                                                         &lt;/restriction>
     *                                                       &lt;/complexContent>
     *                                                     &lt;/complexType>
     *                                                   &lt;/element>
     *                                                 &lt;/choice>
     *                                               &lt;/restriction>
     *                                             &lt;/complexContent>
     *                                           &lt;/complexType>
     *                                         &lt;/element>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="seg" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="respSeg">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;enumeration value="0"/>
     *                                     &lt;enumeration value="1"/>
     *                                     &lt;enumeration value="2"/>
     *                                     &lt;enumeration value="3"/>
     *                                     &lt;enumeration value="4"/>
     *                                     &lt;enumeration value="5"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xSeg" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="30"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="nApol" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="nAver" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;length value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infModal">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;any processContents='skip'/>
     *                             &lt;/sequence>
     *                             &lt;attribute name="versaoModal" use="required">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                   &lt;whiteSpace value="preserve"/>
     *                                   &lt;pattern value="1\.04"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/attribute>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="peri" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="nONU">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;pattern value="[1-9]{1}[0-9]{0,3}|ND"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xNomeAE">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="150"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xClaRisco">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="40"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="grEmb" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="6"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="qTotProd">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="20"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="qVolTipo" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="60"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="pontoFulgor" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="6"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="veicNovos" maxOccurs="unbounded" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chassi">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;whiteSpace value="preserve"/>
     *                                     &lt;length value="17"/>
     *                                     &lt;pattern value="[A-Z0-9]+"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="cCor">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="4"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="xCor">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="40"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="cMod">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;minLength value="1"/>
     *                                     &lt;maxLength value="6"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="cobr" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="fat" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="nFat" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;minLength value="1"/>
     *                                               &lt;maxLength value="60"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                               &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
     *                                 &lt;complexType>
     *                                   &lt;complexContent>
     *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                       &lt;sequence>
     *                                         &lt;element name="nDup" minOccurs="0">
     *                                           &lt;simpleType>
     *                                             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                               &lt;maxLength value="60"/>
     *                                               &lt;minLength value="1"/>
     *                                             &lt;/restriction>
     *                                           &lt;/simpleType>
     *                                         &lt;/element>
     *                                         &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
     *                                         &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
     *                                       &lt;/sequence>
     *                                     &lt;/restriction>
     *                                   &lt;/complexContent>
     *                                 &lt;/complexType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="infCteSub" minOccurs="0">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="chCte">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                     &lt;pattern value="[0-9]{44}"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                               &lt;choice>
     *                                 &lt;element name="tomaICMS">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;choice>
     *                                           &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                           &lt;element name="refNF">
     *                                             &lt;complexType>
     *                                               &lt;complexContent>
     *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                   &lt;sequence>
     *                                                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                                                     &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
     *                                                     &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
     *                                                     &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
     *                                                     &lt;element name="nro">
     *                                                       &lt;simpleType>
     *                                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                                           &lt;whiteSpace value="preserve"/>
     *                                                           &lt;pattern value="[0-9]{1,6}"/>
     *                                                         &lt;/restriction>
     *                                                       &lt;/simpleType>
     *                                                     &lt;/element>
     *                                                     &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                                                   &lt;/sequence>
     *                                                 &lt;/restriction>
     *                                               &lt;/complexContent>
     *                                             &lt;/complexType>
     *                                           &lt;/element>
     *                                           &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                                         &lt;/choice>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                                 &lt;element name="tomaNaoICMS">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="refCteAnu">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                         &lt;/sequence>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/choice>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="infCteComp" maxOccurs="10">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
     *                     &lt;element name="vPresComp">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                               &lt;sequence>
     *                                 &lt;element name="compComp" maxOccurs="unbounded" minOccurs="0">
     *                                   &lt;complexType>
     *                                     &lt;complexContent>
     *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                         &lt;sequence>
     *                                           &lt;element name="xNome">
     *                                             &lt;simpleType>
     *                                               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                                 &lt;maxLength value="15"/>
     *                                                 &lt;minLength value="1"/>
     *                                               &lt;/restriction>
     *                                             &lt;/simpleType>
     *                                           &lt;/element>
     *                                           &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *                                         &lt;/sequence>
     *                                       &lt;/restriction>
     *                                     &lt;/complexContent>
     *                                   &lt;/complexType>
     *                                 &lt;/element>
     *                               &lt;/sequence>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                     &lt;element name="impComp">
     *                       &lt;complexType>
     *                         &lt;complexContent>
     *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                             &lt;sequence>
     *                               &lt;element name="ICMSComp" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
     *                               &lt;element name="infAdFisco" minOccurs="0">
     *                                 &lt;simpleType>
     *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                                     &lt;maxLength value="1000"/>
     *                                     &lt;minLength value="1"/>
     *                                   &lt;/restriction>
     *                                 &lt;/simpleType>
     *                               &lt;/element>
     *                             &lt;/sequence>
     *                           &lt;/restriction>
     *                         &lt;/complexContent>
     *                       &lt;/complexType>
     *                     &lt;/element>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="infCteAnu">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element name="chCte">
     *                       &lt;simpleType>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                           &lt;pattern value="[0-9]{44}"/>
     *                         &lt;/restriction>
     *                       &lt;/simpleType>
     *                     &lt;/element>
     *                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="CTe[0-9]{44}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ide",
        "compl",
        "emit",
        "rem",
        "exped",
        "receb",
        "dest",
        "vPrest",
        "imp",
        "infCTeNorm",
        "infCteComp",
        "infCteAnu"
    })
    public static class InfCte {

        @XmlElement(required = true)
        protected TCTe.InfCte.Ide ide;
        protected TCTe.InfCte.Compl compl;
        @XmlElement(required = true)
        protected TCTe.InfCte.Emit emit;
        protected TCTe.InfCte.Rem rem;
        protected TCTe.InfCte.Exped exped;
        protected TCTe.InfCte.Receb receb;
        protected TCTe.InfCte.Dest dest;
        @XmlElement(required = true)
        protected TCTe.InfCte.VPrest vPrest;
        @XmlElement(required = true)
        protected TCTe.InfCte.Imp imp;
        protected TCTe.InfCte.InfCTeNorm infCTeNorm;
        protected List<TCTe.InfCte.InfCteComp> infCteComp;
        protected TCTe.InfCte.InfCteAnu infCteAnu;
        @XmlAttribute(name = "versao", required = true)
        protected String versao;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obt�m o valor da propriedade ide.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Ide }
         *     
         */
        public TCTe.InfCte.Ide getIde() {
            return ide;
        }

        /**
         * Define o valor da propriedade ide.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Ide }
         *     
         */
        public void setIde(TCTe.InfCte.Ide value) {
            this.ide = value;
        }

        /**
         * Obt�m o valor da propriedade compl.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Compl }
         *     
         */
        public TCTe.InfCte.Compl getCompl() {
            return compl;
        }

        /**
         * Define o valor da propriedade compl.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Compl }
         *     
         */
        public void setCompl(TCTe.InfCte.Compl value) {
            this.compl = value;
        }

        /**
         * Obt�m o valor da propriedade emit.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Emit }
         *     
         */
        public TCTe.InfCte.Emit getEmit() {
            return emit;
        }

        /**
         * Define o valor da propriedade emit.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Emit }
         *     
         */
        public void setEmit(TCTe.InfCte.Emit value) {
            this.emit = value;
        }

        /**
         * Obt�m o valor da propriedade rem.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Rem }
         *     
         */
        public TCTe.InfCte.Rem getRem() {
            return rem;
        }

        /**
         * Define o valor da propriedade rem.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Rem }
         *     
         */
        public void setRem(TCTe.InfCte.Rem value) {
            this.rem = value;
        }

        /**
         * Obt�m o valor da propriedade exped.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Exped }
         *     
         */
        public TCTe.InfCte.Exped getExped() {
            return exped;
        }

        /**
         * Define o valor da propriedade exped.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Exped }
         *     
         */
        public void setExped(TCTe.InfCte.Exped value) {
            this.exped = value;
        }

        /**
         * Obt�m o valor da propriedade receb.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Receb }
         *     
         */
        public TCTe.InfCte.Receb getReceb() {
            return receb;
        }

        /**
         * Define o valor da propriedade receb.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Receb }
         *     
         */
        public void setReceb(TCTe.InfCte.Receb value) {
            this.receb = value;
        }

        /**
         * Obt�m o valor da propriedade dest.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Dest }
         *     
         */
        public TCTe.InfCte.Dest getDest() {
            return dest;
        }

        /**
         * Define o valor da propriedade dest.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Dest }
         *     
         */
        public void setDest(TCTe.InfCte.Dest value) {
            this.dest = value;
        }

        /**
         * Obt�m o valor da propriedade vPrest.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.VPrest }
         *     
         */
        public TCTe.InfCte.VPrest getVPrest() {
            return vPrest;
        }

        /**
         * Define o valor da propriedade vPrest.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.VPrest }
         *     
         */
        public void setVPrest(TCTe.InfCte.VPrest value) {
            this.vPrest = value;
        }

        /**
         * Obt�m o valor da propriedade imp.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.Imp }
         *     
         */
        public TCTe.InfCte.Imp getImp() {
            return imp;
        }

        /**
         * Define o valor da propriedade imp.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.Imp }
         *     
         */
        public void setImp(TCTe.InfCte.Imp value) {
            this.imp = value;
        }

        /**
         * Obt�m o valor da propriedade infCTeNorm.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.InfCTeNorm }
         *     
         */
        public TCTe.InfCte.InfCTeNorm getInfCTeNorm() {
            return infCTeNorm;
        }

        /**
         * Define o valor da propriedade infCTeNorm.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.InfCTeNorm }
         *     
         */
        public void setInfCTeNorm(TCTe.InfCte.InfCTeNorm value) {
            this.infCTeNorm = value;
        }

        /**
         * Gets the value of the infCteComp property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infCteComp property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfCteComp().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TCTe.InfCte.InfCteComp }
         * 
         * 
         */
        public List<TCTe.InfCte.InfCteComp> getInfCteComp() {
            if (infCteComp == null) {
                infCteComp = new ArrayList<TCTe.InfCte.InfCteComp>();
            }
            return this.infCteComp;
        }

        /**
         * Obt�m o valor da propriedade infCteAnu.
         * 
         * @return
         *     possible object is
         *     {@link TCTe.InfCte.InfCteAnu }
         *     
         */
        public TCTe.InfCte.InfCteAnu getInfCteAnu() {
            return infCteAnu;
        }

        /**
         * Define o valor da propriedade infCteAnu.
         * 
         * @param value
         *     allowed object is
         *     {@link TCTe.InfCte.InfCteAnu }
         *     
         */
        public void setInfCteAnu(TCTe.InfCte.InfCteAnu value) {
            this.infCteAnu = value;
        }

        /**
         * Obt�m o valor da propriedade versao.
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

        /**
         * Obt�m o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="xCaracAd" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="15"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xCaracSer" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="30"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xEmi" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fluxo" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xOrig" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="xPass" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="15"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="xDest" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="15"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xRota" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="10"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Entrega" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;choice>
         *                     &lt;element name="semData">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpPer">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="0"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="comData">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpPer">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="noPeriodo">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpPer">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="4"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                               &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                   &lt;choice>
         *                     &lt;element name="semHora">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpHor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="0"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="comHora">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpHor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="1"/>
         *                                     &lt;enumeration value="2"/>
         *                                     &lt;enumeration value="3"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="noInter">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="tpHor">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                     &lt;whiteSpace value="preserve"/>
         *                                     &lt;enumeration value="4"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
         *                               &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="origCalc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="destCalc" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="40"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xObs" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="2000"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ObsCont" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xTexto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="160"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="xCampo" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ObsFisco" maxOccurs="10" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xTexto">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="xCampo" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                       &lt;minLength value="1"/>
         *                       &lt;maxLength value="20"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
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
            "xCaracAd",
            "xCaracSer",
            "xEmi",
            "fluxo",
            "entrega",
            "origCalc",
            "destCalc",
            "xObs",
            "obsCont",
            "obsFisco"
        })
        public static class Compl {

            protected String xCaracAd;
            protected String xCaracSer;
            protected String xEmi;
            protected TCTe.InfCte.Compl.Fluxo fluxo;
            @XmlElement(name = "Entrega")
            protected TCTe.InfCte.Compl.Entrega entrega;
            protected String origCalc;
            protected String destCalc;
            protected String xObs;
            @XmlElement(name = "ObsCont")
            protected List<TCTe.InfCte.Compl.ObsCont> obsCont;
            @XmlElement(name = "ObsFisco")
            protected List<TCTe.InfCte.Compl.ObsFisco> obsFisco;

            /**
             * Obt�m o valor da propriedade xCaracAd.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCaracAd() {
                return xCaracAd;
            }

            /**
             * Define o valor da propriedade xCaracAd.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCaracAd(String value) {
                this.xCaracAd = value;
            }

            /**
             * Obt�m o valor da propriedade xCaracSer.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXCaracSer() {
                return xCaracSer;
            }

            /**
             * Define o valor da propriedade xCaracSer.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXCaracSer(String value) {
                this.xCaracSer = value;
            }

            /**
             * Obt�m o valor da propriedade xEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXEmi() {
                return xEmi;
            }

            /**
             * Define o valor da propriedade xEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXEmi(String value) {
                this.xEmi = value;
            }

            /**
             * Obt�m o valor da propriedade fluxo.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.Compl.Fluxo }
             *     
             */
            public TCTe.InfCte.Compl.Fluxo getFluxo() {
                return fluxo;
            }

            /**
             * Define o valor da propriedade fluxo.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.Compl.Fluxo }
             *     
             */
            public void setFluxo(TCTe.InfCte.Compl.Fluxo value) {
                this.fluxo = value;
            }

            /**
             * Obt�m o valor da propriedade entrega.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.Compl.Entrega }
             *     
             */
            public TCTe.InfCte.Compl.Entrega getEntrega() {
                return entrega;
            }

            /**
             * Define o valor da propriedade entrega.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.Compl.Entrega }
             *     
             */
            public void setEntrega(TCTe.InfCte.Compl.Entrega value) {
                this.entrega = value;
            }

            /**
             * Obt�m o valor da propriedade origCalc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrigCalc() {
                return origCalc;
            }

            /**
             * Define o valor da propriedade origCalc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrigCalc(String value) {
                this.origCalc = value;
            }

            /**
             * Obt�m o valor da propriedade destCalc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDestCalc() {
                return destCalc;
            }

            /**
             * Define o valor da propriedade destCalc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDestCalc(String value) {
                this.destCalc = value;
            }

            /**
             * Obt�m o valor da propriedade xObs.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXObs() {
                return xObs;
            }

            /**
             * Define o valor da propriedade xObs.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXObs(String value) {
                this.xObs = value;
            }

            /**
             * Gets the value of the obsCont property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the obsCont property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObsCont().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.Compl.ObsCont }
             * 
             * 
             */
            public List<TCTe.InfCte.Compl.ObsCont> getObsCont() {
                if (obsCont == null) {
                    obsCont = new ArrayList<TCTe.InfCte.Compl.ObsCont>();
                }
                return this.obsCont;
            }

            /**
             * Gets the value of the obsFisco property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the obsFisco property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getObsFisco().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.Compl.ObsFisco }
             * 
             * 
             */
            public List<TCTe.InfCte.Compl.ObsFisco> getObsFisco() {
                if (obsFisco == null) {
                    obsFisco = new ArrayList<TCTe.InfCte.Compl.ObsFisco>();
                }
                return this.obsFisco;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;choice>
             *           &lt;element name="semData">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpPer">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="comData">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpPer">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="noPeriodo">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpPer">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                     &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
             *         &lt;choice>
             *           &lt;element name="semHora">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpHor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="0"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="comHora">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpHor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="1"/>
             *                           &lt;enumeration value="2"/>
             *                           &lt;enumeration value="3"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="noInter">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="tpHor">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                           &lt;whiteSpace value="preserve"/>
             *                           &lt;enumeration value="4"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
             *                     &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
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
                "semData",
                "comData",
                "noPeriodo",
                "semHora",
                "comHora",
                "noInter"
            })
            public static class Entrega {

                protected TCTe.InfCte.Compl.Entrega.SemData semData;
                protected TCTe.InfCte.Compl.Entrega.ComData comData;
                protected TCTe.InfCte.Compl.Entrega.NoPeriodo noPeriodo;
                protected TCTe.InfCte.Compl.Entrega.SemHora semHora;
                protected TCTe.InfCte.Compl.Entrega.ComHora comHora;
                protected TCTe.InfCte.Compl.Entrega.NoInter noInter;

                /**
                 * Obt�m o valor da propriedade semData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.Compl.Entrega.SemData }
                 *     
                 */
                public TCTe.InfCte.Compl.Entrega.SemData getSemData() {
                    return semData;
                }

                /**
                 * Define o valor da propriedade semData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.Compl.Entrega.SemData }
                 *     
                 */
                public void setSemData(TCTe.InfCte.Compl.Entrega.SemData value) {
                    this.semData = value;
                }

                /**
                 * Obt�m o valor da propriedade comData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.Compl.Entrega.ComData }
                 *     
                 */
                public TCTe.InfCte.Compl.Entrega.ComData getComData() {
                    return comData;
                }

                /**
                 * Define o valor da propriedade comData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.Compl.Entrega.ComData }
                 *     
                 */
                public void setComData(TCTe.InfCte.Compl.Entrega.ComData value) {
                    this.comData = value;
                }

                /**
                 * Obt�m o valor da propriedade noPeriodo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.Compl.Entrega.NoPeriodo }
                 *     
                 */
                public TCTe.InfCte.Compl.Entrega.NoPeriodo getNoPeriodo() {
                    return noPeriodo;
                }

                /**
                 * Define o valor da propriedade noPeriodo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.Compl.Entrega.NoPeriodo }
                 *     
                 */
                public void setNoPeriodo(TCTe.InfCte.Compl.Entrega.NoPeriodo value) {
                    this.noPeriodo = value;
                }

                /**
                 * Obt�m o valor da propriedade semHora.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.Compl.Entrega.SemHora }
                 *     
                 */
                public TCTe.InfCte.Compl.Entrega.SemHora getSemHora() {
                    return semHora;
                }

                /**
                 * Define o valor da propriedade semHora.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.Compl.Entrega.SemHora }
                 *     
                 */
                public void setSemHora(TCTe.InfCte.Compl.Entrega.SemHora value) {
                    this.semHora = value;
                }

                /**
                 * Obt�m o valor da propriedade comHora.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.Compl.Entrega.ComHora }
                 *     
                 */
                public TCTe.InfCte.Compl.Entrega.ComHora getComHora() {
                    return comHora;
                }

                /**
                 * Define o valor da propriedade comHora.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.Compl.Entrega.ComHora }
                 *     
                 */
                public void setComHora(TCTe.InfCte.Compl.Entrega.ComHora value) {
                    this.comHora = value;
                }

                /**
                 * Obt�m o valor da propriedade noInter.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.Compl.Entrega.NoInter }
                 *     
                 */
                public TCTe.InfCte.Compl.Entrega.NoInter getNoInter() {
                    return noInter;
                }

                /**
                 * Define o valor da propriedade noInter.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.Compl.Entrega.NoInter }
                 *     
                 */
                public void setNoInter(TCTe.InfCte.Compl.Entrega.NoInter value) {
                    this.noInter = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpPer">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dProg" type="{http://www.portalfiscal.inf.br/cte}TData"/>
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
                    "tpPer",
                    "dProg"
                })
                public static class ComData {

                    @XmlElement(required = true)
                    protected String tpPer;
                    @XmlElement(required = true)
                    protected String dProg;

                    /**
                     * Obt�m o valor da propriedade tpPer.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpPer() {
                        return tpPer;
                    }

                    /**
                     * Define o valor da propriedade tpPer.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpPer(String value) {
                        this.tpPer = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dProg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDProg() {
                        return dProg;
                    }

                    /**
                     * Define o valor da propriedade dProg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDProg(String value) {
                        this.dProg = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpHor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="1"/>
                 *               &lt;enumeration value="2"/>
                 *               &lt;enumeration value="3"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="hProg" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
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
                    "tpHor",
                    "hProg"
                })
                public static class ComHora {

                    @XmlElement(required = true)
                    protected String tpHor;
                    @XmlElement(required = true)
                    protected String hProg;

                    /**
                     * Obt�m o valor da propriedade tpHor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpHor() {
                        return tpHor;
                    }

                    /**
                     * Define o valor da propriedade tpHor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpHor(String value) {
                        this.tpHor = value;
                    }

                    /**
                     * Obt�m o valor da propriedade hProg.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHProg() {
                        return hProg;
                    }

                    /**
                     * Define o valor da propriedade hProg.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHProg(String value) {
                        this.hProg = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpHor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="hIni" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
                 *         &lt;element name="hFim" type="{http://www.portalfiscal.inf.br/cte}TTime"/>
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
                    "tpHor",
                    "hIni",
                    "hFim"
                })
                public static class NoInter {

                    @XmlElement(required = true)
                    protected String tpHor;
                    @XmlElement(required = true)
                    protected String hIni;
                    @XmlElement(required = true)
                    protected String hFim;

                    /**
                     * Obt�m o valor da propriedade tpHor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpHor() {
                        return tpHor;
                    }

                    /**
                     * Define o valor da propriedade tpHor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpHor(String value) {
                        this.tpHor = value;
                    }

                    /**
                     * Obt�m o valor da propriedade hIni.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHIni() {
                        return hIni;
                    }

                    /**
                     * Define o valor da propriedade hIni.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHIni(String value) {
                        this.hIni = value;
                    }

                    /**
                     * Obt�m o valor da propriedade hFim.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHFim() {
                        return hFim;
                    }

                    /**
                     * Define o valor da propriedade hFim.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHFim(String value) {
                        this.hFim = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpPer">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="4"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *         &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
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
                    "tpPer",
                    "dIni",
                    "dFim"
                })
                public static class NoPeriodo {

                    @XmlElement(required = true)
                    protected String tpPer;
                    @XmlElement(required = true)
                    protected String dIni;
                    @XmlElement(required = true)
                    protected String dFim;

                    /**
                     * Obt�m o valor da propriedade tpPer.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpPer() {
                        return tpPer;
                    }

                    /**
                     * Define o valor da propriedade tpPer.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpPer(String value) {
                        this.tpPer = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dIni.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDIni() {
                        return dIni;
                    }

                    /**
                     * Define o valor da propriedade dIni.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDIni(String value) {
                        this.dIni = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dFim.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDFim() {
                        return dFim;
                    }

                    /**
                     * Define o valor da propriedade dFim.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDFim(String value) {
                        this.dFim = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpPer">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
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
                    "tpPer"
                })
                public static class SemData {

                    @XmlElement(required = true)
                    protected String tpPer;

                    /**
                     * Obt�m o valor da propriedade tpPer.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpPer() {
                        return tpPer;
                    }

                    /**
                     * Define o valor da propriedade tpPer.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpPer(String value) {
                        this.tpPer = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="tpHor">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *               &lt;whiteSpace value="preserve"/>
                 *               &lt;enumeration value="0"/>
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
                    "tpHor"
                })
                public static class SemHora {

                    @XmlElement(required = true)
                    protected String tpHor;

                    /**
                     * Obt�m o valor da propriedade tpHor.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpHor() {
                        return tpHor;
                    }

                    /**
                     * Define o valor da propriedade tpHor.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpHor(String value) {
                        this.tpHor = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xOrig" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="pass" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="xPass" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="15"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="xDest" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="15"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xRota" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="10"/>
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
                "xOrig",
                "pass",
                "xDest",
                "xRota"
            })
            public static class Fluxo {

                protected String xOrig;
                protected List<TCTe.InfCte.Compl.Fluxo.Pass> pass;
                protected String xDest;
                protected String xRota;

                /**
                 * Obt�m o valor da propriedade xOrig.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXOrig() {
                    return xOrig;
                }

                /**
                 * Define o valor da propriedade xOrig.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXOrig(String value) {
                    this.xOrig = value;
                }

                /**
                 * Gets the value of the pass property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the pass property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPass().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTe.InfCte.Compl.Fluxo.Pass }
                 * 
                 * 
                 */
                public List<TCTe.InfCte.Compl.Fluxo.Pass> getPass() {
                    if (pass == null) {
                        pass = new ArrayList<TCTe.InfCte.Compl.Fluxo.Pass>();
                    }
                    return this.pass;
                }

                /**
                 * Obt�m o valor da propriedade xDest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXDest() {
                    return xDest;
                }

                /**
                 * Define o valor da propriedade xDest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXDest(String value) {
                    this.xDest = value;
                }

                /**
                 * Obt�m o valor da propriedade xRota.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXRota() {
                    return xRota;
                }

                /**
                 * Define o valor da propriedade xRota.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXRota(String value) {
                    this.xRota = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="xPass" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="15"/>
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
                    "xPass"
                })
                public static class Pass {

                    protected String xPass;

                    /**
                     * Obt�m o valor da propriedade xPass.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getXPass() {
                        return xPass;
                    }

                    /**
                     * Define o valor da propriedade xPass.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setXPass(String value) {
                        this.xPass = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xTexto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="160"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="xCampo" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xTexto"
            })
            public static class ObsCont {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obt�m o valor da propriedade xTexto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obt�m o valor da propriedade xCampo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xTexto">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="xCampo" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *             &lt;minLength value="1"/>
             *             &lt;maxLength value="20"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "xTexto"
            })
            public static class ObsFisco {

                @XmlElement(required = true)
                protected String xTexto;
                @XmlAttribute(name = "xCampo", required = true)
                protected String xCampo;

                /**
                 * Obt�m o valor da propriedade xTexto.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXTexto() {
                    return xTexto;
                }

                /**
                 * Define o valor da propriedade xTexto.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXTexto(String value) {
                    this.xTexto = value;
                }

                /**
                 * Obt�m o valor da propriedade xCampo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCampo() {
                    return xCampo;
                }

                /**
                 * Define o valor da propriedade xCampo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXCampo(String value) {
                    this.xCampo = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="IE" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIeDest">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{7,12}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="ISUF" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8,9}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderDest" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
         *         &lt;element name="locEnt" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
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
            "cpf",
            "ie",
            "xNome",
            "fone",
            "isuf",
            "enderDest",
            "email",
            "locEnt"
        })
        public static class Dest {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE")
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String fone;
            @XmlElement(name = "ISUF")
            protected String isuf;
            @XmlElement(required = true)
            protected TEndereco enderDest;
            protected String email;
            protected TEndReEnt locEnt;

            /**
             * Obt�m o valor da propriedade cnpj.
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
             * Obt�m o valor da propriedade cpf.
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
             * Obt�m o valor da propriedade ie.
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
             * Obt�m o valor da propriedade xNome.
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
             * Obt�m o valor da propriedade fone.
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

            /**
             * Obt�m o valor da propriedade isuf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getISUF() {
                return isuf;
            }

            /**
             * Define o valor da propriedade isuf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setISUF(String value) {
                this.isuf = value;
            }

            /**
             * Obt�m o valor da propriedade enderDest.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderDest() {
                return enderDest;
            }

            /**
             * Define o valor da propriedade enderDest.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderDest(TEndereco value) {
                this.enderDest = value;
            }

            /**
             * Obt�m o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Obt�m o valor da propriedade locEnt.
             * 
             * @return
             *     possible object is
             *     {@link TEndReEnt }
             *     
             */
            public TEndReEnt getLocEnt() {
                return locEnt;
            }

            /**
             * Define o valor da propriedade locEnt.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndReEnt }
             *     
             */
            public void setLocEnt(TEndReEnt value) {
                this.locEnt = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *         &lt;element name="IE">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TIe">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xFant" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderEmit" type="{http://www.portalfiscal.inf.br/cte}TEndeEmi"/>
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
            "ie",
            "xNome",
            "xFant",
            "enderEmit"
        })
        public static class Emit {

            @XmlElement(name = "CNPJ", required = true)
            protected String cnpj;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String xFant;
            @XmlElement(required = true)
            protected TEndeEmi enderEmit;

            /**
             * Obt�m o valor da propriedade cnpj.
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
             * Obt�m o valor da propriedade ie.
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
             * Obt�m o valor da propriedade xNome.
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
             * Obt�m o valor da propriedade xFant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obt�m o valor da propriedade enderEmit.
             * 
             * @return
             *     possible object is
             *     {@link TEndeEmi }
             *     
             */
            public TEndeEmi getEnderEmit() {
                return enderEmit;
            }

            /**
             * Define o valor da propriedade enderEmit.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndeEmi }
             *     
             */
            public void setEnderEmit(TEndeEmi value) {
                this.enderEmit = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{7,12}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderExped" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
            "cpf",
            "ie",
            "xNome",
            "fone",
            "enderExped",
            "email"
        })
        public static class Exped {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderExped;
            protected String email;

            /**
             * Obt�m o valor da propriedade cnpj.
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
             * Obt�m o valor da propriedade cpf.
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
             * Obt�m o valor da propriedade ie.
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
             * Obt�m o valor da propriedade xNome.
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
             * Obt�m o valor da propriedade fone.
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

            /**
             * Obt�m o valor da propriedade enderExped.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderExped() {
                return enderExped;
            }

            /**
             * Define o valor da propriedade enderExped.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderExped(TEndereco value) {
                this.enderExped = value;
            }

            /**
             * Obt�m o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
         *         &lt;element name="cCT">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{8}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="CFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
         *         &lt;element name="natOp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="forPag">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT"/>
         *         &lt;element name="serie">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TSerie">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="nCT" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
         *         &lt;element name="dhEmi">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpImp">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpEmis">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="5"/>
         *               &lt;enumeration value="7"/>
         *               &lt;enumeration value="8"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cDV">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{1}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
         *         &lt;element name="tpCTe" type="{http://www.portalfiscal.inf.br/cte}TFinCTe"/>
         *         &lt;element name="procEmi" type="{http://www.portalfiscal.inf.br/cte}TProcEmi"/>
         *         &lt;element name="verProc">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="20"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="refCTE" type="{http://www.portalfiscal.inf.br/cte}TChNFe" minOccurs="0"/>
         *         &lt;element name="cMunEnv" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *         &lt;element name="xMunEnv">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFEnv" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
         *         &lt;element name="tpServ">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="cMunIni" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *         &lt;element name="xMunIni">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="cMunFim" type="{http://www.portalfiscal.inf.br/cte}TCodMunIBGE"/>
         *         &lt;element name="xMunFim">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="60"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *         &lt;element name="retira">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;enumeration value="0"/>
         *               &lt;enumeration value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xDetRetira" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="160"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="toma03">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="toma">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;enumeration value="0"/>
         *                           &lt;enumeration value="1"/>
         *                           &lt;enumeration value="2"/>
         *                           &lt;enumeration value="3"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="toma4">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="toma">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;enumeration value="4"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;choice>
         *                       &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *                       &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *                     &lt;/choice>
         *                     &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
         *                     &lt;sequence>
         *                       &lt;element name="xNome">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                             &lt;maxLength value="60"/>
         *                             &lt;minLength value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="xFant" minOccurs="0">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                             &lt;maxLength value="60"/>
         *                             &lt;minLength value="1"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="fone" minOccurs="0">
         *                         &lt;simpleType>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                             &lt;whiteSpace value="preserve"/>
         *                             &lt;pattern value="[0-9]{7,12}"/>
         *                           &lt;/restriction>
         *                         &lt;/simpleType>
         *                       &lt;/element>
         *                       &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *                       &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
         *                     &lt;/sequence>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
         *         &lt;sequence minOccurs="0">
         *           &lt;element name="dhCont">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                 &lt;whiteSpace value="preserve"/>
         *                 &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *           &lt;element name="xJust">
         *             &lt;simpleType>
         *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                 &lt;minLength value="15"/>
         *                 &lt;maxLength value="256"/>
         *               &lt;/restriction>
         *             &lt;/simpleType>
         *           &lt;/element>
         *         &lt;/sequence>
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
            "cuf",
            "cct",
            "cfop",
            "natOp",
            "forPag",
            "mod",
            "serie",
            "nct",
            "dhEmi",
            "tpImp",
            "tpEmis",
            "cdv",
            "tpAmb",
            "tpCTe",
            "procEmi",
            "verProc",
            "refCTE",
            "cMunEnv",
            "xMunEnv",
            "ufEnv",
            "modal",
            "tpServ",
            "cMunIni",
            "xMunIni",
            "ufIni",
            "cMunFim",
            "xMunFim",
            "ufFim",
            "retira",
            "xDetRetira",
            "toma03",
            "toma4",
            "dhCont",
            "xJust"
        })
        public static class Ide {

            @XmlElement(name = "cUF", required = true)
            protected String cuf;
            @XmlElement(name = "cCT", required = true)
            protected String cct;
            @XmlElement(name = "CFOP", required = true)
            protected String cfop;
            @XmlElement(required = true)
            protected String natOp;
            @XmlElement(required = true)
            protected String forPag;
            @XmlElement(required = true)
            protected String mod;
            @XmlElement(required = true)
            protected String serie;
            @XmlElement(name = "nCT", required = true)
            protected String nct;
            @XmlElement(required = true)
            protected String dhEmi;
            @XmlElement(required = true)
            protected String tpImp;
            @XmlElement(required = true)
            protected String tpEmis;
            @XmlElement(name = "cDV", required = true)
            protected String cdv;
            @XmlElement(required = true)
            protected String tpAmb;
            @XmlElement(required = true)
            protected String tpCTe;
            @XmlElement(required = true)
            protected String procEmi;
            @XmlElement(required = true)
            protected String verProc;
            protected String refCTE;
            @XmlElement(required = true)
            protected String cMunEnv;
            @XmlElement(required = true)
            protected String xMunEnv;
            @XmlElement(name = "UFEnv", required = true)
            protected TUf ufEnv;
            @XmlElement(required = true)
            protected String modal;
            @XmlElement(required = true)
            protected String tpServ;
            @XmlElement(required = true)
            protected String cMunIni;
            @XmlElement(required = true)
            protected String xMunIni;
            @XmlElement(name = "UFIni", required = true)
            protected TUf ufIni;
            @XmlElement(required = true)
            protected String cMunFim;
            @XmlElement(required = true)
            protected String xMunFim;
            @XmlElement(name = "UFFim", required = true)
            protected TUf ufFim;
            @XmlElement(required = true)
            protected String retira;
            protected String xDetRetira;
            protected TCTe.InfCte.Ide.Toma03 toma03;
            protected TCTe.InfCte.Ide.Toma4 toma4;
            protected String dhCont;
            protected String xJust;

            /**
             * Obt�m o valor da propriedade cuf.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCUF() {
                return cuf;
            }

            /**
             * Define o valor da propriedade cuf.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCUF(String value) {
                this.cuf = value;
            }

            /**
             * Obt�m o valor da propriedade cct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCCT() {
                return cct;
            }

            /**
             * Define o valor da propriedade cct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCCT(String value) {
                this.cct = value;
            }

            /**
             * Obt�m o valor da propriedade cfop.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCFOP() {
                return cfop;
            }

            /**
             * Define o valor da propriedade cfop.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCFOP(String value) {
                this.cfop = value;
            }

            /**
             * Obt�m o valor da propriedade natOp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNatOp() {
                return natOp;
            }

            /**
             * Define o valor da propriedade natOp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNatOp(String value) {
                this.natOp = value;
            }

            /**
             * Obt�m o valor da propriedade forPag.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getForPag() {
                return forPag;
            }

            /**
             * Define o valor da propriedade forPag.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setForPag(String value) {
                this.forPag = value;
            }

            /**
             * Obt�m o valor da propriedade mod.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMod() {
                return mod;
            }

            /**
             * Define o valor da propriedade mod.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMod(String value) {
                this.mod = value;
            }

            /**
             * Obt�m o valor da propriedade serie.
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
             * Obt�m o valor da propriedade nct.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNCT() {
                return nct;
            }

            /**
             * Define o valor da propriedade nct.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNCT(String value) {
                this.nct = value;
            }

            /**
             * Obt�m o valor da propriedade dhEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhEmi() {
                return dhEmi;
            }

            /**
             * Define o valor da propriedade dhEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhEmi(String value) {
                this.dhEmi = value;
            }

            /**
             * Obt�m o valor da propriedade tpImp.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpImp() {
                return tpImp;
            }

            /**
             * Define o valor da propriedade tpImp.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpImp(String value) {
                this.tpImp = value;
            }

            /**
             * Obt�m o valor da propriedade tpEmis.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpEmis() {
                return tpEmis;
            }

            /**
             * Define o valor da propriedade tpEmis.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpEmis(String value) {
                this.tpEmis = value;
            }

            /**
             * Obt�m o valor da propriedade cdv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCDV() {
                return cdv;
            }

            /**
             * Define o valor da propriedade cdv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCDV(String value) {
                this.cdv = value;
            }

            /**
             * Obt�m o valor da propriedade tpAmb.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpAmb() {
                return tpAmb;
            }

            /**
             * Define o valor da propriedade tpAmb.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpAmb(String value) {
                this.tpAmb = value;
            }

            /**
             * Obt�m o valor da propriedade tpCTe.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpCTe() {
                return tpCTe;
            }

            /**
             * Define o valor da propriedade tpCTe.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpCTe(String value) {
                this.tpCTe = value;
            }

            /**
             * Obt�m o valor da propriedade procEmi.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcEmi() {
                return procEmi;
            }

            /**
             * Define o valor da propriedade procEmi.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcEmi(String value) {
                this.procEmi = value;
            }

            /**
             * Obt�m o valor da propriedade verProc.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVerProc() {
                return verProc;
            }

            /**
             * Define o valor da propriedade verProc.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVerProc(String value) {
                this.verProc = value;
            }

            /**
             * Obt�m o valor da propriedade refCTE.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRefCTE() {
                return refCTE;
            }

            /**
             * Define o valor da propriedade refCTE.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRefCTE(String value) {
                this.refCTE = value;
            }

            /**
             * Obt�m o valor da propriedade cMunEnv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunEnv() {
                return cMunEnv;
            }

            /**
             * Define o valor da propriedade cMunEnv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunEnv(String value) {
                this.cMunEnv = value;
            }

            /**
             * Obt�m o valor da propriedade xMunEnv.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunEnv() {
                return xMunEnv;
            }

            /**
             * Define o valor da propriedade xMunEnv.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunEnv(String value) {
                this.xMunEnv = value;
            }

            /**
             * Obt�m o valor da propriedade ufEnv.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUFEnv() {
                return ufEnv;
            }

            /**
             * Define o valor da propriedade ufEnv.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUFEnv(TUf value) {
                this.ufEnv = value;
            }

            /**
             * Obt�m o valor da propriedade modal.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModal() {
                return modal;
            }

            /**
             * Define o valor da propriedade modal.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModal(String value) {
                this.modal = value;
            }

            /**
             * Obt�m o valor da propriedade tpServ.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTpServ() {
                return tpServ;
            }

            /**
             * Define o valor da propriedade tpServ.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTpServ(String value) {
                this.tpServ = value;
            }

            /**
             * Obt�m o valor da propriedade cMunIni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunIni() {
                return cMunIni;
            }

            /**
             * Define o valor da propriedade cMunIni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunIni(String value) {
                this.cMunIni = value;
            }

            /**
             * Obt�m o valor da propriedade xMunIni.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunIni() {
                return xMunIni;
            }

            /**
             * Define o valor da propriedade xMunIni.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunIni(String value) {
                this.xMunIni = value;
            }

            /**
             * Obt�m o valor da propriedade ufIni.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUFIni() {
                return ufIni;
            }

            /**
             * Define o valor da propriedade ufIni.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUFIni(TUf value) {
                this.ufIni = value;
            }

            /**
             * Obt�m o valor da propriedade cMunFim.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCMunFim() {
                return cMunFim;
            }

            /**
             * Define o valor da propriedade cMunFim.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCMunFim(String value) {
                this.cMunFim = value;
            }

            /**
             * Obt�m o valor da propriedade xMunFim.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXMunFim() {
                return xMunFim;
            }

            /**
             * Define o valor da propriedade xMunFim.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXMunFim(String value) {
                this.xMunFim = value;
            }

            /**
             * Obt�m o valor da propriedade ufFim.
             * 
             * @return
             *     possible object is
             *     {@link TUf }
             *     
             */
            public TUf getUFFim() {
                return ufFim;
            }

            /**
             * Define o valor da propriedade ufFim.
             * 
             * @param value
             *     allowed object is
             *     {@link TUf }
             *     
             */
            public void setUFFim(TUf value) {
                this.ufFim = value;
            }

            /**
             * Obt�m o valor da propriedade retira.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetira() {
                return retira;
            }

            /**
             * Define o valor da propriedade retira.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetira(String value) {
                this.retira = value;
            }

            /**
             * Obt�m o valor da propriedade xDetRetira.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXDetRetira() {
                return xDetRetira;
            }

            /**
             * Define o valor da propriedade xDetRetira.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXDetRetira(String value) {
                this.xDetRetira = value;
            }

            /**
             * Obt�m o valor da propriedade toma03.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.Ide.Toma03 }
             *     
             */
            public TCTe.InfCte.Ide.Toma03 getToma03() {
                return toma03;
            }

            /**
             * Define o valor da propriedade toma03.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.Ide.Toma03 }
             *     
             */
            public void setToma03(TCTe.InfCte.Ide.Toma03 value) {
                this.toma03 = value;
            }

            /**
             * Obt�m o valor da propriedade toma4.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.Ide.Toma4 }
             *     
             */
            public TCTe.InfCte.Ide.Toma4 getToma4() {
                return toma4;
            }

            /**
             * Define o valor da propriedade toma4.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.Ide.Toma4 }
             *     
             */
            public void setToma4(TCTe.InfCte.Ide.Toma4 value) {
                this.toma4 = value;
            }

            /**
             * Obt�m o valor da propriedade dhCont.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDhCont() {
                return dhCont;
            }

            /**
             * Define o valor da propriedade dhCont.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDhCont(String value) {
                this.dhCont = value;
            }

            /**
             * Obt�m o valor da propriedade xJust.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXJust() {
                return xJust;
            }

            /**
             * Define o valor da propriedade xJust.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXJust(String value) {
                this.xJust = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="toma">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
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
                "toma"
            })
            public static class Toma03 {

                @XmlElement(required = true)
                protected String toma;

                /**
                 * Obt�m o valor da propriedade toma.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getToma() {
                    return toma;
                }

                /**
                 * Define o valor da propriedade toma.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setToma(String value) {
                    this.toma = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="toma">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
             *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
             *         &lt;/choice>
             *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
             *         &lt;sequence>
             *           &lt;element name="xNome">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                 &lt;maxLength value="60"/>
             *                 &lt;minLength value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="xFant" minOccurs="0">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                 &lt;maxLength value="60"/>
             *                 &lt;minLength value="1"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="fone" minOccurs="0">
             *             &lt;simpleType>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                 &lt;whiteSpace value="preserve"/>
             *                 &lt;pattern value="[0-9]{7,12}"/>
             *               &lt;/restriction>
             *             &lt;/simpleType>
             *           &lt;/element>
             *           &lt;element name="enderToma" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
             *           &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
             *         &lt;/sequence>
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
                "toma",
                "cnpj",
                "cpf",
                "ie",
                "xNome",
                "xFant",
                "fone",
                "enderToma",
                "email"
            })
            public static class Toma4 {

                @XmlElement(required = true)
                protected String toma;
                @XmlElement(name = "CNPJ")
                protected String cnpj;
                @XmlElement(name = "CPF")
                protected String cpf;
                @XmlElement(name = "IE")
                protected String ie;
                @XmlElement(required = true)
                protected String xNome;
                protected String xFant;
                protected String fone;
                @XmlElement(required = true)
                protected TEndereco enderToma;
                protected String email;

                /**
                 * Obt�m o valor da propriedade toma.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getToma() {
                    return toma;
                }

                /**
                 * Define o valor da propriedade toma.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setToma(String value) {
                    this.toma = value;
                }

                /**
                 * Obt�m o valor da propriedade cnpj.
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
                 * Obt�m o valor da propriedade cpf.
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
                 * Obt�m o valor da propriedade ie.
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
                 * Obt�m o valor da propriedade xNome.
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
                 * Obt�m o valor da propriedade xFant.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXFant() {
                    return xFant;
                }

                /**
                 * Define o valor da propriedade xFant.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXFant(String value) {
                    this.xFant = value;
                }

                /**
                 * Obt�m o valor da propriedade fone.
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

                /**
                 * Obt�m o valor da propriedade enderToma.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TEndereco }
                 *     
                 */
                public TEndereco getEnderToma() {
                    return enderToma;
                }

                /**
                 * Define o valor da propriedade enderToma.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TEndereco }
                 *     
                 */
                public void setEnderToma(TEndereco value) {
                    this.enderToma = value;
                }

                /**
                 * Obt�m o valor da propriedade email.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEmail() {
                    return email;
                }

                /**
                 * Define o valor da propriedade email.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEmail(String value) {
                    this.email = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ICMS" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
         *         &lt;element name="infAdFisco" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="2000"/>
         *               &lt;minLength value="1"/>
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
            "icms",
            "infAdFisco"
        })
        public static class Imp {

            @XmlElement(name = "ICMS", required = true)
            protected TImp icms;
            protected String infAdFisco;

            /**
             * Obt�m o valor da propriedade icms.
             * 
             * @return
             *     possible object is
             *     {@link TImp }
             *     
             */
            public TImp getICMS() {
                return icms;
            }

            /**
             * Define o valor da propriedade icms.
             * 
             * @param value
             *     allowed object is
             *     {@link TImp }
             *     
             */
            public void setICMS(TImp value) {
                this.icms = value;
            }

            /**
             * Obt�m o valor da propriedade infAdFisco.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getInfAdFisco() {
                return infAdFisco;
            }

            /**
             * Define o valor da propriedade infAdFisco.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setInfAdFisco(String value) {
                this.infAdFisco = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="infCarga">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
         *                   &lt;element name="proPred">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xOutCat" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="infQ" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="cUnid">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                   &lt;whiteSpace value="preserve"/>
         *                                   &lt;enumeration value="00"/>
         *                                   &lt;enumeration value="01"/>
         *                                   &lt;enumeration value="02"/>
         *                                   &lt;enumeration value="03"/>
         *                                   &lt;enumeration value="04"/>
         *                                   &lt;enumeration value="05"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="tpMed">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
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
         *         &lt;element name="contQt" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nCont" type="{http://www.portalfiscal.inf.br/cte}TContainer"/>
         *                   &lt;element name="lacContQt" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nLacre">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="20"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="docAnt" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="emiDocAnt" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;choice>
         *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *                               &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *                             &lt;/choice>
         *                             &lt;sequence minOccurs="0">
         *                               &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
         *                               &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
         *                             &lt;/sequence>
         *                             &lt;element name="xNome">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;maxLength value="60"/>
         *                                   &lt;minLength value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="idDocAnt" maxOccurs="2">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element name="idDocAntPap" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
         *                                                 &lt;element name="serie">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="3"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="subser" minOccurs="0">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="2"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="nDoc">
         *                                                   &lt;simpleType>
         *                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                                       &lt;whiteSpace value="preserve"/>
         *                                                       &lt;minLength value="1"/>
         *                                                       &lt;maxLength value="20"/>
         *                                                       &lt;pattern value="[0-9]{1,20}"/>
         *                                                     &lt;/restriction>
         *                                                   &lt;/simpleType>
         *                                                 &lt;/element>
         *                                                 &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                       &lt;element name="idDocAntEle" maxOccurs="unbounded">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
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
         *         &lt;element name="seg" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="respSeg">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xSeg" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="30"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nApol" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="nAver" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;length value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="infModal">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;any processContents='skip'/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="versaoModal" use="required">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                       &lt;whiteSpace value="preserve"/>
         *                       &lt;pattern value="1\.04"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="peri" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="nONU">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;pattern value="[1-9]{1}[0-9]{0,3}|ND"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xNomeAE">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="150"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xClaRisco">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="grEmb" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="qTotProd">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="20"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="qVolTipo" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="60"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="pontoFulgor" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="veicNovos" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="chassi">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;whiteSpace value="preserve"/>
         *                         &lt;length value="17"/>
         *                         &lt;pattern value="[A-Z0-9]+"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="cCor">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="4"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="xCor">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="40"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="cMod">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;minLength value="1"/>
         *                         &lt;maxLength value="6"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="cobr" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="fat" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nFat" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;minLength value="1"/>
         *                                   &lt;maxLength value="60"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                             &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                             &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="nDup" minOccurs="0">
         *                               &lt;simpleType>
         *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                   &lt;maxLength value="60"/>
         *                                   &lt;minLength value="1"/>
         *                                 &lt;/restriction>
         *                               &lt;/simpleType>
         *                             &lt;/element>
         *                             &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                             &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
         *         &lt;element name="infCteSub" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="chCte">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                         &lt;pattern value="[0-9]{44}"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;choice>
         *                     &lt;element name="tomaICMS">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;choice>
         *                               &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                               &lt;element name="refNF">
         *                                 &lt;complexType>
         *                                   &lt;complexContent>
         *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                       &lt;sequence>
         *                                         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *                                         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
         *                                         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
         *                                         &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
         *                                         &lt;element name="nro">
         *                                           &lt;simpleType>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                               &lt;whiteSpace value="preserve"/>
         *                                               &lt;pattern value="[0-9]{1,6}"/>
         *                                             &lt;/restriction>
         *                                           &lt;/simpleType>
         *                                         &lt;/element>
         *                                         &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                                         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                                       &lt;/sequence>
         *                                     &lt;/restriction>
         *                                   &lt;/complexContent>
         *                                 &lt;/complexType>
         *                               &lt;/element>
         *                               &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                             &lt;/choice>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                     &lt;element name="tomaNaoICMS">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="refCteAnu">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/choice>
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
            "infCarga",
            "contQt",
            "docAnt",
            "seg",
            "infModal",
            "peri",
            "veicNovos",
            "cobr",
            "infCteSub"
        })
        public static class InfCTeNorm {

            @XmlElement(required = true)
            protected TCTe.InfCte.InfCTeNorm.InfCarga infCarga;
            protected List<TCTe.InfCte.InfCTeNorm.ContQt> contQt;
            protected TCTe.InfCte.InfCTeNorm.DocAnt docAnt;
            protected List<TCTe.InfCte.InfCTeNorm.Seg> seg;
            @XmlElement(required = true)
            protected TCTe.InfCte.InfCTeNorm.InfModal infModal;
            protected List<TCTe.InfCte.InfCTeNorm.Peri> peri;
            protected List<TCTe.InfCte.InfCTeNorm.VeicNovos> veicNovos;
            protected TCTe.InfCte.InfCTeNorm.Cobr cobr;
            protected TCTe.InfCte.InfCTeNorm.InfCteSub infCteSub;

            /**
             * Obt�m o valor da propriedade infCarga.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCTeNorm.InfCarga }
             *     
             */
            public TCTe.InfCte.InfCTeNorm.InfCarga getInfCarga() {
                return infCarga;
            }

            /**
             * Define o valor da propriedade infCarga.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCTeNorm.InfCarga }
             *     
             */
            public void setInfCarga(TCTe.InfCte.InfCTeNorm.InfCarga value) {
                this.infCarga = value;
            }

            /**
             * Gets the value of the contQt property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contQt property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContQt().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.InfCTeNorm.ContQt }
             * 
             * 
             */
            public List<TCTe.InfCte.InfCTeNorm.ContQt> getContQt() {
                if (contQt == null) {
                    contQt = new ArrayList<TCTe.InfCte.InfCTeNorm.ContQt>();
                }
                return this.contQt;
            }

            /**
             * Obt�m o valor da propriedade docAnt.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCTeNorm.DocAnt }
             *     
             */
            public TCTe.InfCte.InfCTeNorm.DocAnt getDocAnt() {
                return docAnt;
            }

            /**
             * Define o valor da propriedade docAnt.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCTeNorm.DocAnt }
             *     
             */
            public void setDocAnt(TCTe.InfCte.InfCTeNorm.DocAnt value) {
                this.docAnt = value;
            }

            /**
             * Gets the value of the seg property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seg property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeg().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.InfCTeNorm.Seg }
             * 
             * 
             */
            public List<TCTe.InfCte.InfCTeNorm.Seg> getSeg() {
                if (seg == null) {
                    seg = new ArrayList<TCTe.InfCte.InfCTeNorm.Seg>();
                }
                return this.seg;
            }

            /**
             * Obt�m o valor da propriedade infModal.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCTeNorm.InfModal }
             *     
             */
            public TCTe.InfCte.InfCTeNorm.InfModal getInfModal() {
                return infModal;
            }

            /**
             * Define o valor da propriedade infModal.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCTeNorm.InfModal }
             *     
             */
            public void setInfModal(TCTe.InfCte.InfCTeNorm.InfModal value) {
                this.infModal = value;
            }

            /**
             * Gets the value of the peri property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the peri property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPeri().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.InfCTeNorm.Peri }
             * 
             * 
             */
            public List<TCTe.InfCte.InfCTeNorm.Peri> getPeri() {
                if (peri == null) {
                    peri = new ArrayList<TCTe.InfCte.InfCTeNorm.Peri>();
                }
                return this.peri;
            }

            /**
             * Gets the value of the veicNovos property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the veicNovos property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getVeicNovos().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.InfCTeNorm.VeicNovos }
             * 
             * 
             */
            public List<TCTe.InfCte.InfCTeNorm.VeicNovos> getVeicNovos() {
                if (veicNovos == null) {
                    veicNovos = new ArrayList<TCTe.InfCte.InfCTeNorm.VeicNovos>();
                }
                return this.veicNovos;
            }

            /**
             * Obt�m o valor da propriedade cobr.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCTeNorm.Cobr }
             *     
             */
            public TCTe.InfCte.InfCTeNorm.Cobr getCobr() {
                return cobr;
            }

            /**
             * Define o valor da propriedade cobr.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCTeNorm.Cobr }
             *     
             */
            public void setCobr(TCTe.InfCte.InfCTeNorm.Cobr value) {
                this.cobr = value;
            }

            /**
             * Obt�m o valor da propriedade infCteSub.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub }
             *     
             */
            public TCTe.InfCte.InfCTeNorm.InfCteSub getInfCteSub() {
                return infCteSub;
            }

            /**
             * Define o valor da propriedade infCteSub.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub }
             *     
             */
            public void setInfCteSub(TCTe.InfCte.InfCTeNorm.InfCteSub value) {
                this.infCteSub = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="fat" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nFat" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="60"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                   &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                   &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="dup" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="nDup" minOccurs="0">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;maxLength value="60"/>
             *                         &lt;minLength value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *                   &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
                "fat",
                "dup"
            })
            public static class Cobr {

                protected TCTe.InfCte.InfCTeNorm.Cobr.Fat fat;
                protected List<TCTe.InfCte.InfCTeNorm.Cobr.Dup> dup;

                /**
                 * Obt�m o valor da propriedade fat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.InfCTeNorm.Cobr.Fat }
                 *     
                 */
                public TCTe.InfCte.InfCTeNorm.Cobr.Fat getFat() {
                    return fat;
                }

                /**
                 * Define o valor da propriedade fat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.InfCTeNorm.Cobr.Fat }
                 *     
                 */
                public void setFat(TCTe.InfCte.InfCTeNorm.Cobr.Fat value) {
                    this.fat = value;
                }

                /**
                 * Gets the value of the dup property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dup property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDup().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTe.InfCte.InfCTeNorm.Cobr.Dup }
                 * 
                 * 
                 */
                public List<TCTe.InfCte.InfCTeNorm.Cobr.Dup> getDup() {
                    if (dup == null) {
                        dup = new ArrayList<TCTe.InfCte.InfCTeNorm.Cobr.Dup>();
                    }
                    return this.dup;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="nDup" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;maxLength value="60"/>
                 *               &lt;minLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="dVenc" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
                 *         &lt;element name="vDup" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
                    "nDup",
                    "dVenc",
                    "vDup"
                })
                public static class Dup {

                    protected String nDup;
                    protected String dVenc;
                    protected String vDup;

                    /**
                     * Obt�m o valor da propriedade nDup.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNDup() {
                        return nDup;
                    }

                    /**
                     * Define o valor da propriedade nDup.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNDup(String value) {
                        this.nDup = value;
                    }

                    /**
                     * Obt�m o valor da propriedade dVenc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDVenc() {
                        return dVenc;
                    }

                    /**
                     * Define o valor da propriedade dVenc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDVenc(String value) {
                        this.dVenc = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vDup.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVDup() {
                        return vDup;
                    }

                    /**
                     * Define o valor da propriedade vDup.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVDup(String value) {
                        this.vDup = value;
                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="nFat" minOccurs="0">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="60"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vOrig" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vDesc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
                 *         &lt;element name="vLiq" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
                    "nFat",
                    "vOrig",
                    "vDesc",
                    "vLiq"
                })
                public static class Fat {

                    protected String nFat;
                    protected String vOrig;
                    protected String vDesc;
                    protected String vLiq;

                    /**
                     * Obt�m o valor da propriedade nFat.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNFat() {
                        return nFat;
                    }

                    /**
                     * Define o valor da propriedade nFat.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNFat(String value) {
                        this.nFat = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vOrig.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVOrig() {
                        return vOrig;
                    }

                    /**
                     * Define o valor da propriedade vOrig.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVOrig(String value) {
                        this.vOrig = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vDesc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVDesc() {
                        return vDesc;
                    }

                    /**
                     * Define o valor da propriedade vDesc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVDesc(String value) {
                        this.vDesc = value;
                    }

                    /**
                     * Obt�m o valor da propriedade vLiq.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVLiq() {
                        return vLiq;
                    }

                    /**
                     * Define o valor da propriedade vLiq.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVLiq(String value) {
                        this.vLiq = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nCont" type="{http://www.portalfiscal.inf.br/cte}TContainer"/>
             *         &lt;element name="lacContQt" maxOccurs="unbounded" minOccurs="0">
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
             *         &lt;element name="dPrev" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
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
                "nCont",
                "lacContQt",
                "dPrev"
            })
            public static class ContQt {

                @XmlElement(required = true)
                protected String nCont;
                protected List<TCTe.InfCte.InfCTeNorm.ContQt.LacContQt> lacContQt;
                protected String dPrev;

                /**
                 * Obt�m o valor da propriedade nCont.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNCont() {
                    return nCont;
                }

                /**
                 * Define o valor da propriedade nCont.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNCont(String value) {
                    this.nCont = value;
                }

                /**
                 * Gets the value of the lacContQt property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the lacContQt property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getLacContQt().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTe.InfCte.InfCTeNorm.ContQt.LacContQt }
                 * 
                 * 
                 */
                public List<TCTe.InfCte.InfCTeNorm.ContQt.LacContQt> getLacContQt() {
                    if (lacContQt == null) {
                        lacContQt = new ArrayList<TCTe.InfCte.InfCTeNorm.ContQt.LacContQt>();
                    }
                    return this.lacContQt;
                }

                /**
                 * Obt�m o valor da propriedade dPrev.
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
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
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
                public static class LacContQt {

                    @XmlElement(required = true)
                    protected String nLacre;

                    /**
                     * Obt�m o valor da propriedade nLacre.
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


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="emiDocAnt" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;choice>
             *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
             *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
             *                   &lt;/choice>
             *                   &lt;sequence minOccurs="0">
             *                     &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
             *                     &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
             *                   &lt;/sequence>
             *                   &lt;element name="xNome">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;maxLength value="60"/>
             *                         &lt;minLength value="1"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="idDocAnt" maxOccurs="2">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element name="idDocAntPap" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
             *                                       &lt;element name="serie">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="3"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="subser" minOccurs="0">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="2"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="nDoc">
             *                                         &lt;simpleType>
             *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                             &lt;whiteSpace value="preserve"/>
             *                                             &lt;minLength value="1"/>
             *                                             &lt;maxLength value="20"/>
             *                                             &lt;pattern value="[0-9]{1,20}"/>
             *                                           &lt;/restriction>
             *                                         &lt;/simpleType>
             *                                       &lt;/element>
             *                                       &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                             &lt;element name="idDocAntEle" maxOccurs="unbounded">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
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
                "emiDocAnt"
            })
            public static class DocAnt {

                @XmlElement(required = true)
                protected List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt> emiDocAnt;

                /**
                 * Gets the value of the emiDocAnt property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the emiDocAnt property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getEmiDocAnt().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt }
                 * 
                 * 
                 */
                public List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt> getEmiDocAnt() {
                    if (emiDocAnt == null) {
                        emiDocAnt = new ArrayList<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt>();
                    }
                    return this.emiDocAnt;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;choice>
                 *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
                 *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
                 *         &lt;/choice>
                 *         &lt;sequence minOccurs="0">
                 *           &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIe"/>
                 *           &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
                 *         &lt;/sequence>
                 *         &lt;element name="xNome">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;maxLength value="60"/>
                 *               &lt;minLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="idDocAnt" maxOccurs="2">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="idDocAntPap" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
                 *                             &lt;element name="serie">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="3"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="subser" minOccurs="0">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="2"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="nDoc">
                 *                               &lt;simpleType>
                 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                                   &lt;whiteSpace value="preserve"/>
                 *                                   &lt;minLength value="1"/>
                 *                                   &lt;maxLength value="20"/>
                 *                                   &lt;pattern value="[0-9]{1,20}"/>
                 *                                 &lt;/restriction>
                 *                               &lt;/simpleType>
                 *                             &lt;/element>
                 *                             &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                   &lt;element name="idDocAntEle" maxOccurs="unbounded">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/choice>
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
                    "cnpj",
                    "cpf",
                    "ie",
                    "uf",
                    "xNome",
                    "idDocAnt"
                })
                public static class EmiDocAnt {

                    @XmlElement(name = "CNPJ")
                    protected String cnpj;
                    @XmlElement(name = "CPF")
                    protected String cpf;
                    @XmlElement(name = "IE")
                    protected String ie;
                    @XmlElement(name = "UF")
                    protected TUf uf;
                    @XmlElement(required = true)
                    protected String xNome;
                    @XmlElement(required = true)
                    protected List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt> idDocAnt;

                    /**
                     * Obt�m o valor da propriedade cnpj.
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
                     * Obt�m o valor da propriedade cpf.
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
                     * Obt�m o valor da propriedade ie.
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
                     * Obt�m o valor da propriedade uf.
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
                     * Obt�m o valor da propriedade xNome.
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
                     * Gets the value of the idDocAnt property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the idDocAnt property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getIdDocAnt().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt }
                     * 
                     * 
                     */
                    public List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt> getIdDocAnt() {
                        if (idDocAnt == null) {
                            idDocAnt = new ArrayList<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt>();
                        }
                        return this.idDocAnt;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;choice>
                     *         &lt;element name="idDocAntPap" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
                     *                   &lt;element name="serie">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="3"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="subser" minOccurs="0">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="2"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="nDoc">
                     *                     &lt;simpleType>
                     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *                         &lt;whiteSpace value="preserve"/>
                     *                         &lt;minLength value="1"/>
                     *                         &lt;maxLength value="20"/>
                     *                         &lt;pattern value="[0-9]{1,20}"/>
                     *                       &lt;/restriction>
                     *                     &lt;/simpleType>
                     *                   &lt;/element>
                     *                   &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *         &lt;element name="idDocAntEle" maxOccurs="unbounded">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/choice>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "idDocAntPap",
                        "idDocAntEle"
                    })
                    public static class IdDocAnt {

                        protected List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntPap> idDocAntPap;
                        protected List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntEle> idDocAntEle;

                        /**
                         * Gets the value of the idDocAntPap property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the idDocAntPap property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdDocAntPap().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntPap }
                         * 
                         * 
                         */
                        public List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntPap> getIdDocAntPap() {
                            if (idDocAntPap == null) {
                                idDocAntPap = new ArrayList<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntPap>();
                            }
                            return this.idDocAntPap;
                        }

                        /**
                         * Gets the value of the idDocAntEle property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the idDocAntEle property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getIdDocAntEle().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntEle }
                         * 
                         * 
                         */
                        public List<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntEle> getIdDocAntEle() {
                            if (idDocAntEle == null) {
                                idDocAntEle = new ArrayList<TCTe.InfCte.InfCTeNorm.DocAnt.EmiDocAnt.IdDocAnt.IdDocAntEle>();
                            }
                            return this.idDocAntEle;
                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
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
                            "chave"
                        })
                        public static class IdDocAntEle {

                            @XmlElement(required = true)
                            protected String chave;

                            /**
                             * Obt�m o valor da propriedade chave.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getChave() {
                                return chave;
                            }

                            /**
                             * Define o valor da propriedade chave.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setChave(String value) {
                                this.chave = value;
                            }

                        }


                        /**
                         * <p>Classe Java de anonymous complex type.
                         * 
                         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="tpDoc" type="{http://www.portalfiscal.inf.br/cte}TDocAssoc"/>
                         *         &lt;element name="serie">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="3"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="subser" minOccurs="0">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="2"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="nDoc">
                         *           &lt;simpleType>
                         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                         *               &lt;whiteSpace value="preserve"/>
                         *               &lt;minLength value="1"/>
                         *               &lt;maxLength value="20"/>
                         *               &lt;pattern value="[0-9]{1,20}"/>
                         *             &lt;/restriction>
                         *           &lt;/simpleType>
                         *         &lt;/element>
                         *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
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
                            "tpDoc",
                            "serie",
                            "subser",
                            "nDoc",
                            "dEmi"
                        })
                        public static class IdDocAntPap {

                            @XmlElement(required = true)
                            protected String tpDoc;
                            @XmlElement(required = true)
                            protected String serie;
                            protected String subser;
                            @XmlElement(required = true)
                            protected String nDoc;
                            @XmlElement(required = true)
                            protected String dEmi;

                            /**
                             * Obt�m o valor da propriedade tpDoc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getTpDoc() {
                                return tpDoc;
                            }

                            /**
                             * Define o valor da propriedade tpDoc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setTpDoc(String value) {
                                this.tpDoc = value;
                            }

                            /**
                             * Obt�m o valor da propriedade serie.
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
                             * Obt�m o valor da propriedade subser.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getSubser() {
                                return subser;
                            }

                            /**
                             * Define o valor da propriedade subser.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setSubser(String value) {
                                this.subser = value;
                            }

                            /**
                             * Obt�m o valor da propriedade nDoc.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getNDoc() {
                                return nDoc;
                            }

                            /**
                             * Define o valor da propriedade nDoc.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setNDoc(String value) {
                                this.nDoc = value;
                            }

                            /**
                             * Obt�m o valor da propriedade dEmi.
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

                        }

                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
             *         &lt;element name="proPred">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xOutCat" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="infQ" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="cUnid">
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
             *                   &lt;element name="tpMed">
             *                     &lt;simpleType>
             *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                         &lt;minLength value="1"/>
             *                         &lt;maxLength value="20"/>
             *                       &lt;/restriction>
             *                     &lt;/simpleType>
             *                   &lt;/element>
             *                   &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
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
                "vCarga",
                "proPred",
                "xOutCat",
                "infQ"
            })
            public static class InfCarga {

                protected String vCarga;
                @XmlElement(required = true)
                protected String proPred;
                protected String xOutCat;
                @XmlElement(required = true)
                protected List<TCTe.InfCte.InfCTeNorm.InfCarga.InfQ> infQ;

                /**
                 * Obt�m o valor da propriedade vCarga.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVCarga() {
                    return vCarga;
                }

                /**
                 * Define o valor da propriedade vCarga.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVCarga(String value) {
                    this.vCarga = value;
                }

                /**
                 * Obt�m o valor da propriedade proPred.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProPred() {
                    return proPred;
                }

                /**
                 * Define o valor da propriedade proPred.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProPred(String value) {
                    this.proPred = value;
                }

                /**
                 * Obt�m o valor da propriedade xOutCat.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXOutCat() {
                    return xOutCat;
                }

                /**
                 * Define o valor da propriedade xOutCat.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXOutCat(String value) {
                    this.xOutCat = value;
                }

                /**
                 * Gets the value of the infQ property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the infQ property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getInfQ().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTe.InfCte.InfCTeNorm.InfCarga.InfQ }
                 * 
                 * 
                 */
                public List<TCTe.InfCte.InfCTeNorm.InfCarga.InfQ> getInfQ() {
                    if (infQ == null) {
                        infQ = new ArrayList<TCTe.InfCte.InfCTeNorm.InfCarga.InfQ>();
                    }
                    return this.infQ;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="cUnid">
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
                 *         &lt;element name="tpMed">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;minLength value="1"/>
                 *               &lt;maxLength value="20"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="qCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
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
                    "cUnid",
                    "tpMed",
                    "qCarga"
                })
                public static class InfQ {

                    @XmlElement(required = true)
                    protected String cUnid;
                    @XmlElement(required = true)
                    protected String tpMed;
                    @XmlElement(required = true)
                    protected String qCarga;

                    /**
                     * Obt�m o valor da propriedade cUnid.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCUnid() {
                        return cUnid;
                    }

                    /**
                     * Define o valor da propriedade cUnid.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCUnid(String value) {
                        this.cUnid = value;
                    }

                    /**
                     * Obt�m o valor da propriedade tpMed.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTpMed() {
                        return tpMed;
                    }

                    /**
                     * Define o valor da propriedade tpMed.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTpMed(String value) {
                        this.tpMed = value;
                    }

                    /**
                     * Obt�m o valor da propriedade qCarga.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getQCarga() {
                        return qCarga;
                    }

                    /**
                     * Define o valor da propriedade qCarga.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setQCarga(String value) {
                        this.qCarga = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="chCte">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;pattern value="[0-9]{44}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;choice>
             *           &lt;element name="tomaICMS">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;choice>
             *                     &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                     &lt;element name="refNF">
             *                       &lt;complexType>
             *                         &lt;complexContent>
             *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                             &lt;sequence>
             *                               &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
             *                               &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
             *                               &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
             *                               &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
             *                               &lt;element name="nro">
             *                                 &lt;simpleType>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                                     &lt;whiteSpace value="preserve"/>
             *                                     &lt;pattern value="[0-9]{1,6}"/>
             *                                   &lt;/restriction>
             *                                 &lt;/simpleType>
             *                               &lt;/element>
             *                               &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                               &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *                             &lt;/sequence>
             *                           &lt;/restriction>
             *                         &lt;/complexContent>
             *                       &lt;/complexType>
             *                     &lt;/element>
             *                     &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *                   &lt;/choice>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *           &lt;element name="tomaNaoICMS">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="refCteAnu">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/choice>
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
                "chCte",
                "tomaICMS",
                "tomaNaoICMS"
            })
            public static class InfCteSub {

                @XmlElement(required = true)
                protected String chCte;
                protected TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS tomaICMS;
                protected TCTe.InfCte.InfCTeNorm.InfCteSub.TomaNaoICMS tomaNaoICMS;

                /**
                 * Obt�m o valor da propriedade chCte.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChCte() {
                    return chCte;
                }

                /**
                 * Define o valor da propriedade chCte.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChCte(String value) {
                    this.chCte = value;
                }

                /**
                 * Obt�m o valor da propriedade tomaICMS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS }
                 *     
                 */
                public TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS getTomaICMS() {
                    return tomaICMS;
                }

                /**
                 * Define o valor da propriedade tomaICMS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS }
                 *     
                 */
                public void setTomaICMS(TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS value) {
                    this.tomaICMS = value;
                }

                /**
                 * Obt�m o valor da propriedade tomaNaoICMS.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub.TomaNaoICMS }
                 *     
                 */
                public TCTe.InfCte.InfCTeNorm.InfCteSub.TomaNaoICMS getTomaNaoICMS() {
                    return tomaNaoICMS;
                }

                /**
                 * Define o valor da propriedade tomaNaoICMS.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub.TomaNaoICMS }
                 *     
                 */
                public void setTomaNaoICMS(TCTe.InfCte.InfCTeNorm.InfCteSub.TomaNaoICMS value) {
                    this.tomaNaoICMS = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="refNFe" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *         &lt;element name="refNF">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
                 *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
                 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
                 *                   &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
                 *                   &lt;element name="nro">
                 *                     &lt;simpleType>
                 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *                         &lt;whiteSpace value="preserve"/>
                 *                         &lt;pattern value="[0-9]{1,6}"/>
                 *                       &lt;/restriction>
                 *                     &lt;/simpleType>
                 *                   &lt;/element>
                 *                   &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                 *                   &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="refCte" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "refNFe",
                    "refNF",
                    "refCte"
                })
                public static class TomaICMS {

                    protected String refNFe;
                    protected TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS.RefNF refNF;
                    protected String refCte;

                    /**
                     * Obt�m o valor da propriedade refNFe.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRefNFe() {
                        return refNFe;
                    }

                    /**
                     * Define o valor da propriedade refNFe.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRefNFe(String value) {
                        this.refNFe = value;
                    }

                    /**
                     * Obt�m o valor da propriedade refNF.
                     * 
                     * @return
                     *     possible object is
                     *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS.RefNF }
                     *     
                     */
                    public TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS.RefNF getRefNF() {
                        return refNF;
                    }

                    /**
                     * Define o valor da propriedade refNF.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS.RefNF }
                     *     
                     */
                    public void setRefNF(TCTe.InfCte.InfCTeNorm.InfCteSub.TomaICMS.RefNF value) {
                        this.refNF = value;
                    }

                    /**
                     * Obt�m o valor da propriedade refCte.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRefCte() {
                        return refCte;
                    }

                    /**
                     * Define o valor da propriedade refCte.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRefCte(String value) {
                        this.refCte = value;
                    }


                    /**
                     * <p>Classe Java de anonymous complex type.
                     * 
                     * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
                     *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModDoc"/>
                     *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
                     *         &lt;element name="subserie" type="{http://www.portalfiscal.inf.br/cte}TSerie" minOccurs="0"/>
                     *         &lt;element name="nro">
                     *           &lt;simpleType>
                     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                     *               &lt;whiteSpace value="preserve"/>
                     *               &lt;pattern value="[0-9]{1,6}"/>
                     *             &lt;/restriction>
                     *           &lt;/simpleType>
                     *         &lt;/element>
                     *         &lt;element name="valor" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
                     *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
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
                        "mod",
                        "serie",
                        "subserie",
                        "nro",
                        "valor",
                        "dEmi"
                    })
                    public static class RefNF {

                        @XmlElement(name = "CNPJ", required = true)
                        protected String cnpj;
                        @XmlElement(required = true)
                        protected String mod;
                        @XmlElement(required = true)
                        protected String serie;
                        protected String subserie;
                        @XmlElement(required = true)
                        protected String nro;
                        @XmlElement(required = true)
                        protected String valor;
                        @XmlElement(required = true)
                        protected String dEmi;

                        /**
                         * Obt�m o valor da propriedade cnpj.
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
                         * Obt�m o valor da propriedade mod.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMod() {
                            return mod;
                        }

                        /**
                         * Define o valor da propriedade mod.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMod(String value) {
                            this.mod = value;
                        }

                        /**
                         * Obt�m o valor da propriedade serie.
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
                         * Obt�m o valor da propriedade subserie.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getSubserie() {
                            return subserie;
                        }

                        /**
                         * Define o valor da propriedade subserie.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setSubserie(String value) {
                            this.subserie = value;
                        }

                        /**
                         * Obt�m o valor da propriedade nro.
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
                         * Obt�m o valor da propriedade valor.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getValor() {
                            return valor;
                        }

                        /**
                         * Define o valor da propriedade valor.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setValor(String value) {
                            this.valor = value;
                        }

                        /**
                         * Obt�m o valor da propriedade dEmi.
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

                    }

                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="refCteAnu">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TChNFe">
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
                    "refCteAnu"
                })
                public static class TomaNaoICMS {

                    @XmlElement(required = true)
                    protected String refCteAnu;

                    /**
                     * Obt�m o valor da propriedade refCteAnu.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRefCteAnu() {
                        return refCteAnu;
                    }

                    /**
                     * Define o valor da propriedade refCteAnu.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRefCteAnu(String value) {
                        this.refCteAnu = value;
                    }

                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;any processContents='skip'/>
             *       &lt;/sequence>
             *       &lt;attribute name="versaoModal" use="required">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *             &lt;whiteSpace value="preserve"/>
             *             &lt;pattern value="1\.04"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "any"
            })
            public static class InfModal {

                @XmlAnyElement
                protected Element any;
                @XmlAttribute(name = "versaoModal", required = true)
                protected String versaoModal;

                /**
                 * Obt�m o valor da propriedade any.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Element }
                 *     
                 */
                public Element getAny() {
                    return any;
                }

                /**
                 * Define o valor da propriedade any.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Element }
                 *     
                 */
                public void setAny(Element value) {
                    this.any = value;
                }

                /**
                 * Obt�m o valor da propriedade versaoModal.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVersaoModal() {
                    return versaoModal;
                }

                /**
                 * Define o valor da propriedade versaoModal.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVersaoModal(String value) {
                    this.versaoModal = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nONU">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;pattern value="[1-9]{1}[0-9]{0,3}|ND"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xNomeAE">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="150"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xClaRisco">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="grEmb" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qTotProd">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="qVolTipo" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="60"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="pontoFulgor" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="6"/>
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
                "nonu",
                "xNomeAE",
                "xClaRisco",
                "grEmb",
                "qTotProd",
                "qVolTipo",
                "pontoFulgor"
            })
            public static class Peri {

                @XmlElement(name = "nONU", required = true)
                protected String nonu;
                @XmlElement(required = true)
                protected String xNomeAE;
                @XmlElement(required = true)
                protected String xClaRisco;
                protected String grEmb;
                @XmlElement(required = true)
                protected String qTotProd;
                protected String qVolTipo;
                protected String pontoFulgor;

                /**
                 * Obt�m o valor da propriedade nonu.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNONU() {
                    return nonu;
                }

                /**
                 * Define o valor da propriedade nonu.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNONU(String value) {
                    this.nonu = value;
                }

                /**
                 * Obt�m o valor da propriedade xNomeAE.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXNomeAE() {
                    return xNomeAE;
                }

                /**
                 * Define o valor da propriedade xNomeAE.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXNomeAE(String value) {
                    this.xNomeAE = value;
                }

                /**
                 * Obt�m o valor da propriedade xClaRisco.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXClaRisco() {
                    return xClaRisco;
                }

                /**
                 * Define o valor da propriedade xClaRisco.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXClaRisco(String value) {
                    this.xClaRisco = value;
                }

                /**
                 * Obt�m o valor da propriedade grEmb.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getGrEmb() {
                    return grEmb;
                }

                /**
                 * Define o valor da propriedade grEmb.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setGrEmb(String value) {
                    this.grEmb = value;
                }

                /**
                 * Obt�m o valor da propriedade qTotProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQTotProd() {
                    return qTotProd;
                }

                /**
                 * Define o valor da propriedade qTotProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQTotProd(String value) {
                    this.qTotProd = value;
                }

                /**
                 * Obt�m o valor da propriedade qVolTipo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getQVolTipo() {
                    return qVolTipo;
                }

                /**
                 * Define o valor da propriedade qVolTipo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setQVolTipo(String value) {
                    this.qVolTipo = value;
                }

                /**
                 * Obt�m o valor da propriedade pontoFulgor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPontoFulgor() {
                    return pontoFulgor;
                }

                /**
                 * Define o valor da propriedade pontoFulgor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPontoFulgor(String value) {
                    this.pontoFulgor = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="respSeg">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xSeg" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="30"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nApol" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nAver" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;length value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
                "respSeg",
                "xSeg",
                "nApol",
                "nAver",
                "vCarga"
            })
            public static class Seg {

                @XmlElement(required = true)
                protected String respSeg;
                protected String xSeg;
                protected String nApol;
                protected String nAver;
                protected String vCarga;

                /**
                 * Obt�m o valor da propriedade respSeg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRespSeg() {
                    return respSeg;
                }

                /**
                 * Define o valor da propriedade respSeg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRespSeg(String value) {
                    this.respSeg = value;
                }

                /**
                 * Obt�m o valor da propriedade xSeg.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXSeg() {
                    return xSeg;
                }

                /**
                 * Define o valor da propriedade xSeg.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXSeg(String value) {
                    this.xSeg = value;
                }

                /**
                 * Obt�m o valor da propriedade nApol.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNApol() {
                    return nApol;
                }

                /**
                 * Define o valor da propriedade nApol.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNApol(String value) {
                    this.nApol = value;
                }

                /**
                 * Obt�m o valor da propriedade nAver.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNAver() {
                    return nAver;
                }

                /**
                 * Define o valor da propriedade nAver.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNAver(String value) {
                    this.nAver = value;
                }

                /**
                 * Obt�m o valor da propriedade vCarga.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVCarga() {
                    return vCarga;
                }

                /**
                 * Define o valor da propriedade vCarga.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVCarga(String value) {
                    this.vCarga = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="chassi">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;length value="17"/>
             *               &lt;pattern value="[A-Z0-9]+"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cCor">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="4"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="xCor">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="40"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="cMod">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="6"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vUnit" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vFrete" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
                "chassi",
                "cCor",
                "xCor",
                "cMod",
                "vUnit",
                "vFrete"
            })
            public static class VeicNovos {

                @XmlElement(required = true)
                protected String chassi;
                @XmlElement(required = true)
                protected String cCor;
                @XmlElement(required = true)
                protected String xCor;
                @XmlElement(required = true)
                protected String cMod;
                @XmlElement(required = true)
                protected String vUnit;
                @XmlElement(required = true)
                protected String vFrete;

                /**
                 * Obt�m o valor da propriedade chassi.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChassi() {
                    return chassi;
                }

                /**
                 * Define o valor da propriedade chassi.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChassi(String value) {
                    this.chassi = value;
                }

                /**
                 * Obt�m o valor da propriedade cCor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCCor() {
                    return cCor;
                }

                /**
                 * Define o valor da propriedade cCor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCCor(String value) {
                    this.cCor = value;
                }

                /**
                 * Obt�m o valor da propriedade xCor.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getXCor() {
                    return xCor;
                }

                /**
                 * Define o valor da propriedade xCor.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setXCor(String value) {
                    this.xCor = value;
                }

                /**
                 * Obt�m o valor da propriedade cMod.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCMod() {
                    return cMod;
                }

                /**
                 * Define o valor da propriedade cMod.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCMod(String value) {
                    this.cMod = value;
                }

                /**
                 * Obt�m o valor da propriedade vUnit.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVUnit() {
                    return vUnit;
                }

                /**
                 * Define o valor da propriedade vUnit.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVUnit(String value) {
                    this.vUnit = value;
                }

                /**
                 * Obt�m o valor da propriedade vFrete.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVFrete() {
                    return vFrete;
                }

                /**
                 * Define o valor da propriedade vFrete.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVFrete(String value) {
                    this.vFrete = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="chCte">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;pattern value="[0-9]{44}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
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
            "chCte",
            "dEmi"
        })
        public static class InfCteAnu {

            @XmlElement(required = true)
            protected String chCte;
            @XmlElement(required = true)
            protected String dEmi;

            /**
             * Obt�m o valor da propriedade chCte.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChCte() {
                return chCte;
            }

            /**
             * Define o valor da propriedade chCte.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChCte(String value) {
                this.chCte = value;
            }

            /**
             * Obt�m o valor da propriedade dEmi.
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

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *         &lt;element name="vPresComp">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                   &lt;sequence>
         *                     &lt;element name="compComp" maxOccurs="unbounded" minOccurs="0">
         *                       &lt;complexType>
         *                         &lt;complexContent>
         *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                             &lt;sequence>
         *                               &lt;element name="xNome">
         *                                 &lt;simpleType>
         *                                   &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                                     &lt;maxLength value="15"/>
         *                                     &lt;minLength value="1"/>
         *                                   &lt;/restriction>
         *                                 &lt;/simpleType>
         *                               &lt;/element>
         *                               &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                             &lt;/sequence>
         *                           &lt;/restriction>
         *                         &lt;/complexContent>
         *                       &lt;/complexType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="impComp">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="ICMSComp" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
         *                   &lt;element name="infAdFisco" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;maxLength value="1000"/>
         *                         &lt;minLength value="1"/>
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
            "chave",
            "vPresComp",
            "impComp"
        })
        public static class InfCteComp {

            @XmlElement(required = true)
            protected String chave;
            @XmlElement(required = true)
            protected TCTe.InfCte.InfCteComp.VPresComp vPresComp;
            @XmlElement(required = true)
            protected TCTe.InfCte.InfCteComp.ImpComp impComp;

            /**
             * Obt�m o valor da propriedade chave.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getChave() {
                return chave;
            }

            /**
             * Define o valor da propriedade chave.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setChave(String value) {
                this.chave = value;
            }

            /**
             * Obt�m o valor da propriedade vPresComp.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCteComp.VPresComp }
             *     
             */
            public TCTe.InfCte.InfCteComp.VPresComp getVPresComp() {
                return vPresComp;
            }

            /**
             * Define o valor da propriedade vPresComp.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCteComp.VPresComp }
             *     
             */
            public void setVPresComp(TCTe.InfCte.InfCteComp.VPresComp value) {
                this.vPresComp = value;
            }

            /**
             * Obt�m o valor da propriedade impComp.
             * 
             * @return
             *     possible object is
             *     {@link TCTe.InfCte.InfCteComp.ImpComp }
             *     
             */
            public TCTe.InfCte.InfCteComp.ImpComp getImpComp() {
                return impComp;
            }

            /**
             * Define o valor da propriedade impComp.
             * 
             * @param value
             *     allowed object is
             *     {@link TCTe.InfCte.InfCteComp.ImpComp }
             *     
             */
            public void setImpComp(TCTe.InfCte.InfCteComp.ImpComp value) {
                this.impComp = value;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="ICMSComp" type="{http://www.portalfiscal.inf.br/cte}TImp"/>
             *         &lt;element name="infAdFisco" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;maxLength value="1000"/>
             *               &lt;minLength value="1"/>
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
                "icmsComp",
                "infAdFisco"
            })
            public static class ImpComp {

                @XmlElement(name = "ICMSComp", required = true)
                protected TImp icmsComp;
                protected String infAdFisco;

                /**
                 * Obt�m o valor da propriedade icmsComp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TImp }
                 *     
                 */
                public TImp getICMSComp() {
                    return icmsComp;
                }

                /**
                 * Define o valor da propriedade icmsComp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TImp }
                 *     
                 */
                public void setICMSComp(TImp value) {
                    this.icmsComp = value;
                }

                /**
                 * Obt�m o valor da propriedade infAdFisco.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInfAdFisco() {
                    return infAdFisco;
                }

                /**
                 * Define o valor da propriedade infAdFisco.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInfAdFisco(String value) {
                    this.infAdFisco = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;sequence>
             *           &lt;element name="compComp" maxOccurs="unbounded" minOccurs="0">
             *             &lt;complexType>
             *               &lt;complexContent>
             *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                   &lt;sequence>
             *                     &lt;element name="xNome">
             *                       &lt;simpleType>
             *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *                           &lt;maxLength value="15"/>
             *                           &lt;minLength value="1"/>
             *                         &lt;/restriction>
             *                       &lt;/simpleType>
             *                     &lt;/element>
             *                     &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *                   &lt;/sequence>
             *                 &lt;/restriction>
             *               &lt;/complexContent>
             *             &lt;/complexType>
             *           &lt;/element>
             *         &lt;/sequence>
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
                "vtPrest",
                "compComp"
            })
            public static class VPresComp {

                @XmlElement(name = "vTPrest", required = true)
                protected String vtPrest;
                protected List<TCTe.InfCte.InfCteComp.VPresComp.CompComp> compComp;

                /**
                 * Obt�m o valor da propriedade vtPrest.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVTPrest() {
                    return vtPrest;
                }

                /**
                 * Define o valor da propriedade vtPrest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVTPrest(String value) {
                    this.vtPrest = value;
                }

                /**
                 * Gets the value of the compComp property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the compComp property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCompComp().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TCTe.InfCte.InfCteComp.VPresComp.CompComp }
                 * 
                 * 
                 */
                public List<TCTe.InfCte.InfCteComp.VPresComp.CompComp> getCompComp() {
                    if (compComp == null) {
                        compComp = new ArrayList<TCTe.InfCte.InfCteComp.VPresComp.CompComp>();
                    }
                    return this.compComp;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="xNome">
                 *           &lt;simpleType>
                 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
                 *               &lt;maxLength value="15"/>
                 *               &lt;minLength value="1"/>
                 *             &lt;/restriction>
                 *           &lt;/simpleType>
                 *         &lt;/element>
                 *         &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
                    "vComp"
                })
                public static class CompComp {

                    @XmlElement(required = true)
                    protected String xNome;
                    @XmlElement(required = true)
                    protected String vComp;

                    /**
                     * Obt�m o valor da propriedade xNome.
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
                     * Obt�m o valor da propriedade vComp.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getVComp() {
                        return vComp;
                    }

                    /**
                     * Define o valor da propriedade vComp.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setVComp(String value) {
                        this.vComp = value;
                    }

                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{7,12}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderReceb" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" type="{http://www.portalfiscal.inf.br/cte}TEmail" minOccurs="0"/>
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
            "cpf",
            "ie",
            "xNome",
            "fone",
            "enderReceb",
            "email"
        })
        public static class Receb {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderReceb;
            protected String email;

            /**
             * Obt�m o valor da propriedade cnpj.
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
             * Obt�m o valor da propriedade cpf.
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
             * Obt�m o valor da propriedade ie.
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
             * Obt�m o valor da propriedade xNome.
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
             * Obt�m o valor da propriedade fone.
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

            /**
             * Obt�m o valor da propriedade enderReceb.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderReceb() {
                return enderReceb;
            }

            /**
             * Define o valor da propriedade enderReceb.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderReceb(TEndereco value) {
                this.enderReceb = value;
            }

            /**
             * Obt�m o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;choice>
         *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
         *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
         *         &lt;/choice>
         *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest"/>
         *         &lt;element name="xNome">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="xFant" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;maxLength value="60"/>
         *               &lt;minLength value="1"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="fone" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;whiteSpace value="preserve"/>
         *               &lt;pattern value="[0-9]{7,12}"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="enderReme" type="{http://www.portalfiscal.inf.br/cte}TEndereco"/>
         *         &lt;element name="email" minOccurs="0">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TEmail">
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;choice>
         *           &lt;element name="infNF" maxOccurs="unbounded">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="nRoma" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="20"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="nPed" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="20"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
         *                     &lt;element name="serie">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="3"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="nDoc">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="20"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
         *                     &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                     &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                     &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                     &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                     &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                     &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *                     &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
         *                     &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
         *                     &lt;element name="PIN" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;minLength value="2"/>
         *                           &lt;maxLength value="9"/>
         *                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="locRet" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="infNFe" maxOccurs="unbounded">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
         *                     &lt;element name="PIN" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;minLength value="2"/>
         *                           &lt;maxLength value="9"/>
         *                           &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *           &lt;element name="infOutros" maxOccurs="unbounded">
         *             &lt;complexType>
         *               &lt;complexContent>
         *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                   &lt;sequence>
         *                     &lt;element name="tpDoc">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                           &lt;whiteSpace value="preserve"/>
         *                           &lt;enumeration value="00"/>
         *                           &lt;enumeration value="10"/>
         *                           &lt;enumeration value="99"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="descOutros" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="100"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="nDoc" minOccurs="0">
         *                       &lt;simpleType>
         *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                           &lt;minLength value="1"/>
         *                           &lt;maxLength value="20"/>
         *                         &lt;/restriction>
         *                       &lt;/simpleType>
         *                     &lt;/element>
         *                     &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
         *                     &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
         *                   &lt;/sequence>
         *                 &lt;/restriction>
         *               &lt;/complexContent>
         *             &lt;/complexType>
         *           &lt;/element>
         *         &lt;/choice>
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
            "cpf",
            "ie",
            "xNome",
            "xFant",
            "fone",
            "enderReme",
            "email",
            "infNF",
            "infNFe",
            "infOutros"
        })
        public static class Rem {

            @XmlElement(name = "CNPJ")
            protected String cnpj;
            @XmlElement(name = "CPF")
            protected String cpf;
            @XmlElement(name = "IE", required = true)
            protected String ie;
            @XmlElement(required = true)
            protected String xNome;
            protected String xFant;
            protected String fone;
            @XmlElement(required = true)
            protected TEndereco enderReme;
            protected String email;
            protected List<TCTe.InfCte.Rem.InfNF> infNF;
            protected List<TCTe.InfCte.Rem.InfNFe> infNFe;
            protected List<TCTe.InfCte.Rem.InfOutros> infOutros;

            /**
             * Obt�m o valor da propriedade cnpj.
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
             * Obt�m o valor da propriedade cpf.
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
             * Obt�m o valor da propriedade ie.
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
             * Obt�m o valor da propriedade xNome.
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
             * Obt�m o valor da propriedade xFant.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXFant() {
                return xFant;
            }

            /**
             * Define o valor da propriedade xFant.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXFant(String value) {
                this.xFant = value;
            }

            /**
             * Obt�m o valor da propriedade fone.
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

            /**
             * Obt�m o valor da propriedade enderReme.
             * 
             * @return
             *     possible object is
             *     {@link TEndereco }
             *     
             */
            public TEndereco getEnderReme() {
                return enderReme;
            }

            /**
             * Define o valor da propriedade enderReme.
             * 
             * @param value
             *     allowed object is
             *     {@link TEndereco }
             *     
             */
            public void setEnderReme(TEndereco value) {
                this.enderReme = value;
            }

            /**
             * Obt�m o valor da propriedade email.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * Define o valor da propriedade email.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

            /**
             * Gets the value of the infNF property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infNF property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfNF().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.Rem.InfNF }
             * 
             * 
             */
            public List<TCTe.InfCte.Rem.InfNF> getInfNF() {
                if (infNF == null) {
                    infNF = new ArrayList<TCTe.InfCte.Rem.InfNF>();
                }
                return this.infNF;
            }

            /**
             * Gets the value of the infNFe property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infNFe property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfNFe().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.Rem.InfNFe }
             * 
             * 
             */
            public List<TCTe.InfCte.Rem.InfNFe> getInfNFe() {
                if (infNFe == null) {
                    infNFe = new ArrayList<TCTe.InfCte.Rem.InfNFe>();
                }
                return this.infNFe;
            }

            /**
             * Gets the value of the infOutros property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infOutros property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfOutros().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.Rem.InfOutros }
             * 
             * 
             */
            public List<TCTe.InfCte.Rem.InfOutros> getInfOutros() {
                if (infOutros == null) {
                    infOutros = new ArrayList<TCTe.InfCte.Rem.InfOutros>();
                }
                return this.infOutros;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="nRoma" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nPed" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModNF"/>
             *         &lt;element name="serie">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="3"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nDoc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData"/>
             *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vBCST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="vNF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
             *         &lt;element name="nCFOP" type="{http://www.portalfiscal.inf.br/cte}TCfop"/>
             *         &lt;element name="nPeso" type="{http://www.portalfiscal.inf.br/cte}TDec_1203Opc" minOccurs="0"/>
             *         &lt;element name="PIN" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="9"/>
             *               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="locRet" type="{http://www.portalfiscal.inf.br/cte}TEndReEnt" minOccurs="0"/>
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
                "nRoma",
                "nPed",
                "mod",
                "serie",
                "nDoc",
                "dEmi",
                "vbc",
                "vicms",
                "vbcst",
                "vst",
                "vProd",
                "vnf",
                "ncfop",
                "nPeso",
                "pin",
                "locRet"
            })
            public static class InfNF {

                protected String nRoma;
                protected String nPed;
                @XmlElement(required = true)
                protected String mod;
                @XmlElement(required = true)
                protected String serie;
                @XmlElement(required = true)
                protected String nDoc;
                @XmlElement(required = true)
                protected String dEmi;
                @XmlElement(name = "vBC", required = true)
                protected String vbc;
                @XmlElement(name = "vICMS", required = true)
                protected String vicms;
                @XmlElement(name = "vBCST", required = true)
                protected String vbcst;
                @XmlElement(name = "vST", required = true)
                protected String vst;
                @XmlElement(required = true)
                protected String vProd;
                @XmlElement(name = "vNF", required = true)
                protected String vnf;
                @XmlElement(name = "nCFOP", required = true)
                protected String ncfop;
                protected String nPeso;
                @XmlElement(name = "PIN")
                protected String pin;
                protected TEndReEnt locRet;

                /**
                 * Obt�m o valor da propriedade nRoma.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNRoma() {
                    return nRoma;
                }

                /**
                 * Define o valor da propriedade nRoma.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNRoma(String value) {
                    this.nRoma = value;
                }

                /**
                 * Obt�m o valor da propriedade nPed.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNPed() {
                    return nPed;
                }

                /**
                 * Define o valor da propriedade nPed.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNPed(String value) {
                    this.nPed = value;
                }

                /**
                 * Obt�m o valor da propriedade mod.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMod() {
                    return mod;
                }

                /**
                 * Define o valor da propriedade mod.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMod(String value) {
                    this.mod = value;
                }

                /**
                 * Obt�m o valor da propriedade serie.
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
                 * Obt�m o valor da propriedade nDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNDoc() {
                    return nDoc;
                }

                /**
                 * Define o valor da propriedade nDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNDoc(String value) {
                    this.nDoc = value;
                }

                /**
                 * Obt�m o valor da propriedade dEmi.
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
                 * Obt�m o valor da propriedade vbc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBC() {
                    return vbc;
                }

                /**
                 * Define o valor da propriedade vbc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBC(String value) {
                    this.vbc = value;
                }

                /**
                 * Obt�m o valor da propriedade vicms.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVICMS() {
                    return vicms;
                }

                /**
                 * Define o valor da propriedade vicms.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVICMS(String value) {
                    this.vicms = value;
                }

                /**
                 * Obt�m o valor da propriedade vbcst.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVBCST() {
                    return vbcst;
                }

                /**
                 * Define o valor da propriedade vbcst.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVBCST(String value) {
                    this.vbcst = value;
                }

                /**
                 * Obt�m o valor da propriedade vst.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVST() {
                    return vst;
                }

                /**
                 * Define o valor da propriedade vst.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVST(String value) {
                    this.vst = value;
                }

                /**
                 * Obt�m o valor da propriedade vProd.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVProd() {
                    return vProd;
                }

                /**
                 * Define o valor da propriedade vProd.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVProd(String value) {
                    this.vProd = value;
                }

                /**
                 * Obt�m o valor da propriedade vnf.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVNF() {
                    return vnf;
                }

                /**
                 * Define o valor da propriedade vnf.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVNF(String value) {
                    this.vnf = value;
                }

                /**
                 * Obt�m o valor da propriedade ncfop.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNCFOP() {
                    return ncfop;
                }

                /**
                 * Define o valor da propriedade ncfop.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNCFOP(String value) {
                    this.ncfop = value;
                }

                /**
                 * Obt�m o valor da propriedade nPeso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNPeso() {
                    return nPeso;
                }

                /**
                 * Define o valor da propriedade nPeso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNPeso(String value) {
                    this.nPeso = value;
                }

                /**
                 * Obt�m o valor da propriedade pin.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPIN() {
                    return pin;
                }

                /**
                 * Define o valor da propriedade pin.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPIN(String value) {
                    this.pin = value;
                }

                /**
                 * Obt�m o valor da propriedade locRet.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TEndReEnt }
                 *     
                 */
                public TEndReEnt getLocRet() {
                    return locRet;
                }

                /**
                 * Define o valor da propriedade locRet.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TEndReEnt }
                 *     
                 */
                public void setLocRet(TEndReEnt value) {
                    this.locRet = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="chave" type="{http://www.portalfiscal.inf.br/cte}TChNFe"/>
             *         &lt;element name="PIN" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;minLength value="2"/>
             *               &lt;maxLength value="9"/>
             *               &lt;pattern value="[1-9]{1}[0-9]{1,8}"/>
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
                "chave",
                "pin"
            })
            public static class InfNFe {

                @XmlElement(required = true)
                protected String chave;
                @XmlElement(name = "PIN")
                protected String pin;

                /**
                 * Obt�m o valor da propriedade chave.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getChave() {
                    return chave;
                }

                /**
                 * Define o valor da propriedade chave.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setChave(String value) {
                    this.chave = value;
                }

                /**
                 * Obt�m o valor da propriedade pin.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPIN() {
                    return pin;
                }

                /**
                 * Define o valor da propriedade pin.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPIN(String value) {
                    this.pin = value;
                }

            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="tpDoc">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *               &lt;whiteSpace value="preserve"/>
             *               &lt;enumeration value="00"/>
             *               &lt;enumeration value="10"/>
             *               &lt;enumeration value="99"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="descOutros" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="100"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="nDoc" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;minLength value="1"/>
             *               &lt;maxLength value="20"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="dEmi" type="{http://www.portalfiscal.inf.br/cte}TData" minOccurs="0"/>
             *         &lt;element name="vDocFisc" type="{http://www.portalfiscal.inf.br/cte}TDec_1302Opc" minOccurs="0"/>
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
                "tpDoc",
                "descOutros",
                "nDoc",
                "dEmi",
                "vDocFisc"
            })
            public static class InfOutros {

                @XmlElement(required = true)
                protected String tpDoc;
                protected String descOutros;
                protected String nDoc;
                protected String dEmi;
                protected String vDocFisc;

                /**
                 * Obt�m o valor da propriedade tpDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTpDoc() {
                    return tpDoc;
                }

                /**
                 * Define o valor da propriedade tpDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTpDoc(String value) {
                    this.tpDoc = value;
                }

                /**
                 * Obt�m o valor da propriedade descOutros.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDescOutros() {
                    return descOutros;
                }

                /**
                 * Define o valor da propriedade descOutros.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDescOutros(String value) {
                    this.descOutros = value;
                }

                /**
                 * Obt�m o valor da propriedade nDoc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNDoc() {
                    return nDoc;
                }

                /**
                 * Define o valor da propriedade nDoc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNDoc(String value) {
                    this.nDoc = value;
                }

                /**
                 * Obt�m o valor da propriedade dEmi.
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
                 * Obt�m o valor da propriedade vDocFisc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVDocFisc() {
                    return vDocFisc;
                }

                /**
                 * Define o valor da propriedade vDocFisc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVDocFisc(String value) {
                    this.vDocFisc = value;
                }

            }

        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *         &lt;element name="vRec" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
         *         &lt;element name="Comp" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="xNome">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *                         &lt;maxLength value="15"/>
         *                         &lt;minLength value="1"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                   &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
            "vtPrest",
            "vRec",
            "comp"
        })
        public static class VPrest {

            @XmlElement(name = "vTPrest", required = true)
            protected String vtPrest;
            @XmlElement(required = true)
            protected String vRec;
            @XmlElement(name = "Comp")
            protected List<TCTe.InfCte.VPrest.Comp> comp;

            /**
             * Obt�m o valor da propriedade vtPrest.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVTPrest() {
                return vtPrest;
            }

            /**
             * Define o valor da propriedade vtPrest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVTPrest(String value) {
                this.vtPrest = value;
            }

            /**
             * Obt�m o valor da propriedade vRec.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVRec() {
                return vRec;
            }

            /**
             * Define o valor da propriedade vRec.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVRec(String value) {
                this.vRec = value;
            }

            /**
             * Gets the value of the comp property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comp property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComp().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TCTe.InfCte.VPrest.Comp }
             * 
             * 
             */
            public List<TCTe.InfCte.VPrest.Comp> getComp() {
                if (comp == null) {
                    comp = new ArrayList<TCTe.InfCte.VPrest.Comp>();
                }
                return this.comp;
            }


            /**
             * <p>Classe Java de anonymous complex type.
             * 
             * <p>O seguinte fragmento do esquema especifica o conte�do esperado contido dentro desta classe.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="xNome">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
             *               &lt;maxLength value="15"/>
             *               &lt;minLength value="1"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
             *         &lt;/element>
             *         &lt;element name="vComp" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
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
                "vComp"
            })
            public static class Comp {

                @XmlElement(required = true)
                protected String xNome;
                @XmlElement(required = true)
                protected String vComp;

                /**
                 * Obt�m o valor da propriedade xNome.
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
                 * Obt�m o valor da propriedade vComp.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVComp() {
                    return vComp;
                }

                /**
                 * Define o valor da propriedade vComp.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVComp(String value) {
                    this.vComp = value;
                }

            }

        }

    }

}
