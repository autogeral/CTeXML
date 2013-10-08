//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.02.11 at 02:45:03 PM BRST 
//


package br.com.cte.v104.canccte;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.javac.v104.canccte package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _CancCTe_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "cancCTe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.javac.v104.canccte
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TRetCancCTe.InfCanc }
     * 
     */
    public TRetCancCTe.InfCanc createTRetCancCTeInfCanc() {
        return new TRetCancCTe.InfCanc();
    }

    /**
     * Create an instance of {@link ReferenceType }
     * 
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TransformType }
     * 
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     * 
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TCancCTe }
     * 
     */
    public TCancCTe createTCancCTe() {
        return new TCancCTe();
    }

    /**
     * Create an instance of {@link TProcCancCTe }
     * 
     */
    public TProcCancCTe createTProcCancCTe() {
        return new TProcCancCTe();
    }

    /**
     * Create an instance of {@link ReferenceType.DigestMethod }
     * 
     */
    public ReferenceType.DigestMethod createReferenceTypeDigestMethod() {
        return new ReferenceType.DigestMethod();
    }

    /**
     * Create an instance of {@link TransformsType }
     * 
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     * 
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link SignedInfoType.SignatureMethod }
     * 
     */
    public SignedInfoType.SignatureMethod createSignedInfoTypeSignatureMethod() {
        return new SignedInfoType.SignatureMethod();
    }

    /**
     * Create an instance of {@link SignatureType }
     * 
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link SignedInfoType }
     * 
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link TRetCancCTe }
     * 
     */
    public TRetCancCTe createTRetCancCTe() {
        return new TRetCancCTe();
    }

    /**
     * Create an instance of {@link TCancCTe.InfCanc }
     * 
     */
    public TCancCTe.InfCanc createTCancCTeInfCanc() {
        return new TCancCTe.InfCanc();
    }

    /**
     * Create an instance of {@link X509DataType }
     * 
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link SignedInfoType.CanonicalizationMethod }
     * 
     */
    public SignedInfoType.CanonicalizationMethod createSignedInfoTypeCanonicalizationMethod() {
        return new SignedInfoType.CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TCancCTe }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "cancCTe")
    public JAXBElement<TCancCTe> createCancCTe(TCancCTe value) {
        return new JAXBElement<TCancCTe>(_CancCTe_QNAME, TCancCTe.class, null, value);
    }

}