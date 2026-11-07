package org.bouncycastle.asn1.x500.style;

import b.o;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1GeneralizedTime;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;

/* loaded from: classes2.dex */
public class BCStyle extends AbstractX500NameStyle {
    public static final ASN1ObjectIdentifier BUSINESS_CATEGORY;
    public static final ASN1ObjectIdentifier C;
    public static final ASN1ObjectIdentifier CN;
    public static final ASN1ObjectIdentifier COUNTRY_OF_CITIZENSHIP;
    public static final ASN1ObjectIdentifier COUNTRY_OF_RESIDENCE;
    public static final ASN1ObjectIdentifier DATE_OF_BIRTH;
    public static final ASN1ObjectIdentifier DC;
    public static final ASN1ObjectIdentifier DESCRIPTION;
    public static final ASN1ObjectIdentifier DMD_NAME;
    public static final ASN1ObjectIdentifier DN_QUALIFIER;
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final ASN1ObjectIdentifier E;
    public static final ASN1ObjectIdentifier EmailAddress;
    public static final ASN1ObjectIdentifier GENDER;
    public static final ASN1ObjectIdentifier GENERATION;
    public static final ASN1ObjectIdentifier GIVENNAME;
    public static final ASN1ObjectIdentifier INITIALS;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier JURISDICTION_C;
    public static final ASN1ObjectIdentifier JURISDICTION_L;
    public static final ASN1ObjectIdentifier JURISDICTION_ST;
    public static final ASN1ObjectIdentifier L;
    public static final ASN1ObjectIdentifier NAME;
    public static final ASN1ObjectIdentifier NAME_AT_BIRTH;
    public static final ASN1ObjectIdentifier O;
    public static final ASN1ObjectIdentifier ORGANIZATION_IDENTIFIER;
    public static final ASN1ObjectIdentifier OU;
    public static final ASN1ObjectIdentifier PLACE_OF_BIRTH;
    public static final ASN1ObjectIdentifier POSTAL_ADDRESS;
    public static final ASN1ObjectIdentifier POSTAL_CODE;
    public static final ASN1ObjectIdentifier PSEUDONYM;
    public static final ASN1ObjectIdentifier ROLE;
    public static final ASN1ObjectIdentifier SERIALNUMBER;
    public static final ASN1ObjectIdentifier SN;
    public static final ASN1ObjectIdentifier ST;
    public static final ASN1ObjectIdentifier STREET;
    public static final ASN1ObjectIdentifier SURNAME;
    public static final ASN1ObjectIdentifier T;
    public static final ASN1ObjectIdentifier TELEPHONE_NUMBER;
    public static final ASN1ObjectIdentifier UID;
    public static final ASN1ObjectIdentifier UNIQUE_IDENTIFIER;
    public static final ASN1ObjectIdentifier UnstructuredAddress;
    public static final ASN1ObjectIdentifier UnstructuredName;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierC = o.c("2.5.4.6");
        C = aSN1ObjectIdentifierC;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC2 = o.c("2.5.4.10");
        O = aSN1ObjectIdentifierC2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC3 = o.c("2.5.4.11");
        OU = aSN1ObjectIdentifierC3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC4 = o.c("2.5.4.12");
        T = aSN1ObjectIdentifierC4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC5 = o.c("2.5.4.3");
        CN = aSN1ObjectIdentifierC5;
        SN = o.c("2.5.4.5");
        ASN1ObjectIdentifier aSN1ObjectIdentifierC6 = o.c("2.5.4.9");
        STREET = aSN1ObjectIdentifierC6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC7 = o.c("2.5.4.5");
        SERIALNUMBER = aSN1ObjectIdentifierC7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC8 = o.c("2.5.4.7");
        L = aSN1ObjectIdentifierC8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC9 = o.c("2.5.4.8");
        ST = aSN1ObjectIdentifierC9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC10 = o.c("2.5.4.4");
        SURNAME = aSN1ObjectIdentifierC10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC11 = o.c("2.5.4.42");
        GIVENNAME = aSN1ObjectIdentifierC11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC12 = o.c("2.5.4.43");
        INITIALS = aSN1ObjectIdentifierC12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC13 = o.c("2.5.4.44");
        GENERATION = aSN1ObjectIdentifierC13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC14 = o.c("2.5.4.45");
        UNIQUE_IDENTIFIER = aSN1ObjectIdentifierC14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC15 = o.c("2.5.4.13");
        DESCRIPTION = aSN1ObjectIdentifierC15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC16 = o.c("2.5.4.15");
        BUSINESS_CATEGORY = aSN1ObjectIdentifierC16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC17 = o.c("2.5.4.17");
        POSTAL_CODE = aSN1ObjectIdentifierC17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC18 = o.c("2.5.4.46");
        DN_QUALIFIER = aSN1ObjectIdentifierC18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC19 = o.c("2.5.4.65");
        PSEUDONYM = aSN1ObjectIdentifierC19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC20 = o.c("2.5.4.72");
        ROLE = aSN1ObjectIdentifierC20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC21 = o.c("1.3.6.1.5.5.7.9.1");
        DATE_OF_BIRTH = aSN1ObjectIdentifierC21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC22 = o.c("1.3.6.1.5.5.7.9.2");
        PLACE_OF_BIRTH = aSN1ObjectIdentifierC22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC23 = o.c("1.3.6.1.5.5.7.9.3");
        GENDER = aSN1ObjectIdentifierC23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC24 = o.c("1.3.6.1.5.5.7.9.4");
        COUNTRY_OF_CITIZENSHIP = aSN1ObjectIdentifierC24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC25 = o.c("1.3.6.1.5.5.7.9.5");
        COUNTRY_OF_RESIDENCE = aSN1ObjectIdentifierC25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC26 = o.c("1.3.36.8.3.14");
        NAME_AT_BIRTH = aSN1ObjectIdentifierC26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC27 = o.c("2.5.4.16");
        POSTAL_ADDRESS = aSN1ObjectIdentifierC27;
        DMD_NAME = o.c("2.5.4.54");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = X509ObjectIdentifiers.id_at_telephoneNumber;
        TELEPHONE_NUMBER = aSN1ObjectIdentifier;
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = X509ObjectIdentifiers.id_at_name;
        NAME = aSN1ObjectIdentifier2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = X509ObjectIdentifiers.id_at_organizationIdentifier;
        ORGANIZATION_IDENTIFIER = aSN1ObjectIdentifier3;
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_emailAddress;
        EmailAddress = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredName;
        UnstructuredName = aSN1ObjectIdentifier5;
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = PKCSObjectIdentifiers.pkcs_9_at_unstructuredAddress;
        UnstructuredAddress = aSN1ObjectIdentifier6;
        E = aSN1ObjectIdentifier4;
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.25");
        DC = aSN1ObjectIdentifier7;
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = new ASN1ObjectIdentifier("0.9.2342.19200300.100.1.1");
        UID = aSN1ObjectIdentifier8;
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.3");
        JURISDICTION_C = aSN1ObjectIdentifier9;
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.2");
        JURISDICTION_ST = aSN1ObjectIdentifier10;
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = new ASN1ObjectIdentifier("1.3.6.1.4.1.311.60.2.1.1");
        JURISDICTION_L = aSN1ObjectIdentifier11;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierC, "C");
        hashtable.put(aSN1ObjectIdentifierC2, "O");
        hashtable.put(aSN1ObjectIdentifierC4, "T");
        hashtable.put(aSN1ObjectIdentifierC3, "OU");
        hashtable.put(aSN1ObjectIdentifierC5, "CN");
        hashtable.put(aSN1ObjectIdentifierC8, i.f7029u);
        hashtable.put(aSN1ObjectIdentifierC9, "ST");
        hashtable.put(aSN1ObjectIdentifierC7, "SERIALNUMBER");
        hashtable.put(aSN1ObjectIdentifier4, "E");
        hashtable.put(aSN1ObjectIdentifier7, "DC");
        hashtable.put(aSN1ObjectIdentifier8, "UID");
        hashtable.put(aSN1ObjectIdentifierC6, "STREET");
        hashtable.put(aSN1ObjectIdentifierC10, "SURNAME");
        hashtable.put(aSN1ObjectIdentifierC11, "GIVENNAME");
        hashtable.put(aSN1ObjectIdentifierC12, "INITIALS");
        hashtable.put(aSN1ObjectIdentifierC13, "GENERATION");
        hashtable.put(aSN1ObjectIdentifierC15, "DESCRIPTION");
        hashtable.put(aSN1ObjectIdentifierC20, "ROLE");
        hashtable.put(aSN1ObjectIdentifier6, "unstructuredAddress");
        hashtable.put(aSN1ObjectIdentifier5, "unstructuredName");
        hashtable.put(aSN1ObjectIdentifierC14, "UniqueIdentifier");
        hashtable.put(aSN1ObjectIdentifierC18, "DN");
        hashtable.put(aSN1ObjectIdentifierC19, "Pseudonym");
        hashtable.put(aSN1ObjectIdentifierC27, "PostalAddress");
        hashtable.put(aSN1ObjectIdentifierC26, "NameAtBirth");
        hashtable.put(aSN1ObjectIdentifierC24, "CountryOfCitizenship");
        hashtable.put(aSN1ObjectIdentifierC25, "CountryOfResidence");
        hashtable.put(aSN1ObjectIdentifierC23, "Gender");
        hashtable.put(aSN1ObjectIdentifierC22, "PlaceOfBirth");
        hashtable.put(aSN1ObjectIdentifierC21, "DateOfBirth");
        hashtable.put(aSN1ObjectIdentifierC17, "PostalCode");
        hashtable.put(aSN1ObjectIdentifierC16, "BusinessCategory");
        hashtable.put(aSN1ObjectIdentifier, "TelephoneNumber");
        hashtable.put(aSN1ObjectIdentifier2, "Name");
        hashtable.put(aSN1ObjectIdentifier3, "organizationIdentifier");
        hashtable.put(aSN1ObjectIdentifier9, "jurisdictionCountry");
        hashtable.put(aSN1ObjectIdentifier10, "jurisdictionState");
        hashtable.put(aSN1ObjectIdentifier11, "jurisdictionLocality");
        hashtable2.put("c", aSN1ObjectIdentifierC);
        hashtable2.put("o", aSN1ObjectIdentifierC2);
        hashtable2.put("t", aSN1ObjectIdentifierC4);
        hashtable2.put("ou", aSN1ObjectIdentifierC3);
        hashtable2.put("cn", aSN1ObjectIdentifierC5);
        hashtable2.put("l", aSN1ObjectIdentifierC8);
        hashtable2.put("st", aSN1ObjectIdentifierC9);
        hashtable2.put("sn", aSN1ObjectIdentifierC10);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierC7);
        hashtable2.put("street", aSN1ObjectIdentifierC6);
        hashtable2.put("emailaddress", aSN1ObjectIdentifier4);
        hashtable2.put("dc", aSN1ObjectIdentifier7);
        hashtable2.put("e", aSN1ObjectIdentifier4);
        hashtable2.put("uid", aSN1ObjectIdentifier8);
        hashtable2.put("surname", aSN1ObjectIdentifierC10);
        hashtable2.put("givenname", aSN1ObjectIdentifierC11);
        hashtable2.put("initials", aSN1ObjectIdentifierC12);
        hashtable2.put("generation", aSN1ObjectIdentifierC13);
        hashtable2.put("description", aSN1ObjectIdentifierC15);
        hashtable2.put("role", aSN1ObjectIdentifierC20);
        hashtable2.put("unstructuredaddress", aSN1ObjectIdentifier6);
        hashtable2.put("unstructuredname", aSN1ObjectIdentifier5);
        hashtable2.put("uniqueidentifier", aSN1ObjectIdentifierC14);
        hashtable2.put("dn", aSN1ObjectIdentifierC18);
        hashtable2.put("pseudonym", aSN1ObjectIdentifierC19);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierC27);
        hashtable2.put("nameatbirth", aSN1ObjectIdentifierC26);
        hashtable2.put("countryofcitizenship", aSN1ObjectIdentifierC24);
        hashtable2.put("countryofresidence", aSN1ObjectIdentifierC25);
        hashtable2.put("gender", aSN1ObjectIdentifierC23);
        hashtable2.put("placeofbirth", aSN1ObjectIdentifierC22);
        hashtable2.put("dateofbirth", aSN1ObjectIdentifierC21);
        hashtable2.put("postalcode", aSN1ObjectIdentifierC17);
        hashtable2.put("businesscategory", aSN1ObjectIdentifierC16);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifier);
        hashtable2.put("name", aSN1ObjectIdentifier2);
        hashtable2.put("organizationidentifier", aSN1ObjectIdentifier3);
        hashtable2.put("jurisdictionCountry", aSN1ObjectIdentifier9);
        hashtable2.put("jurisdictionState", aSN1ObjectIdentifier10);
        hashtable2.put("jurisdictionLocality", aSN1ObjectIdentifier11);
        INSTANCE = new BCStyle();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) EmailAddress) || aSN1ObjectIdentifier.equals((ASN1Primitive) DC)) ? new DERIA5String(str) : aSN1ObjectIdentifier.equals((ASN1Primitive) DATE_OF_BIRTH) ? new ASN1GeneralizedTime(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) C) || aSN1ObjectIdentifier.equals((ASN1Primitive) SERIALNUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) DN_QUALIFIER) || aSN1ObjectIdentifier.equals((ASN1Primitive) TELEPHONE_NUMBER) || aSN1ObjectIdentifier.equals((ASN1Primitive) JURISDICTION_C)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        return IETFUtils.rDNsFromString(str, this);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String[] oidToAttrNames(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return IETFUtils.findAttrNamesForOID(aSN1ObjectIdentifier, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String oidToDisplayName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) this.defaultSymbols.get(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public String toString(X500Name x500Name) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z10 = true;
        for (RDN rdn : x500Name.getRDNs()) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rdn, this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
