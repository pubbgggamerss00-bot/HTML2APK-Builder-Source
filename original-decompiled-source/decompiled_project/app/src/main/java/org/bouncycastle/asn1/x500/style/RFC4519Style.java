package org.bouncycastle.asn1.x500.style;

import b.o;
import java.util.Hashtable;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERIA5String;
import org.bouncycastle.asn1.DERPrintableString;
import org.bouncycastle.asn1.x500.RDN;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.asn1.x500.X500NameStyle;

/* loaded from: classes2.dex */
public class RFC4519Style extends AbstractX500NameStyle {
    private static final Hashtable DefaultLookUp;
    private static final Hashtable DefaultSymbols;
    public static final X500NameStyle INSTANCE;
    public static final ASN1ObjectIdentifier businessCategory;

    /* renamed from: c, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f19845c;
    public static final ASN1ObjectIdentifier cn;

    /* renamed from: dc, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f19846dc;
    public static final ASN1ObjectIdentifier description;
    public static final ASN1ObjectIdentifier destinationIndicator;
    public static final ASN1ObjectIdentifier distinguishedName;
    public static final ASN1ObjectIdentifier dnQualifier;
    public static final ASN1ObjectIdentifier enhancedSearchGuide;
    public static final ASN1ObjectIdentifier facsimileTelephoneNumber;
    public static final ASN1ObjectIdentifier generationQualifier;
    public static final ASN1ObjectIdentifier givenName;
    public static final ASN1ObjectIdentifier houseIdentifier;
    public static final ASN1ObjectIdentifier initials;
    public static final ASN1ObjectIdentifier internationalISDNNumber;

    /* renamed from: l, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f19847l;
    public static final ASN1ObjectIdentifier member;
    public static final ASN1ObjectIdentifier name;

    /* renamed from: o, reason: collision with root package name */
    public static final ASN1ObjectIdentifier f19848o;
    public static final ASN1ObjectIdentifier ou;
    public static final ASN1ObjectIdentifier owner;
    public static final ASN1ObjectIdentifier physicalDeliveryOfficeName;
    public static final ASN1ObjectIdentifier postOfficeBox;
    public static final ASN1ObjectIdentifier postalAddress;
    public static final ASN1ObjectIdentifier postalCode;
    public static final ASN1ObjectIdentifier preferredDeliveryMethod;
    public static final ASN1ObjectIdentifier registeredAddress;
    public static final ASN1ObjectIdentifier roleOccupant;
    public static final ASN1ObjectIdentifier searchGuide;
    public static final ASN1ObjectIdentifier seeAlso;
    public static final ASN1ObjectIdentifier serialNumber;
    public static final ASN1ObjectIdentifier sn;
    public static final ASN1ObjectIdentifier st;
    public static final ASN1ObjectIdentifier street;
    public static final ASN1ObjectIdentifier telephoneNumber;
    public static final ASN1ObjectIdentifier teletexTerminalIdentifier;
    public static final ASN1ObjectIdentifier telexNumber;
    public static final ASN1ObjectIdentifier title;
    public static final ASN1ObjectIdentifier uid;
    public static final ASN1ObjectIdentifier uniqueMember;
    public static final ASN1ObjectIdentifier userPassword;
    public static final ASN1ObjectIdentifier x121Address;
    public static final ASN1ObjectIdentifier x500UniqueIdentifier;
    protected final Hashtable defaultSymbols = AbstractX500NameStyle.copyHashTable(DefaultSymbols);
    protected final Hashtable defaultLookUp = AbstractX500NameStyle.copyHashTable(DefaultLookUp);

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifierC = o.c("2.5.4.15");
        businessCategory = aSN1ObjectIdentifierC;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC2 = o.c("2.5.4.6");
        f19845c = aSN1ObjectIdentifierC2;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC3 = o.c("2.5.4.3");
        cn = aSN1ObjectIdentifierC3;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC4 = o.c("0.9.2342.19200300.100.1.25");
        f19846dc = aSN1ObjectIdentifierC4;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC5 = o.c("2.5.4.13");
        description = aSN1ObjectIdentifierC5;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC6 = o.c("2.5.4.27");
        destinationIndicator = aSN1ObjectIdentifierC6;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC7 = o.c("2.5.4.49");
        distinguishedName = aSN1ObjectIdentifierC7;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC8 = o.c("2.5.4.46");
        dnQualifier = aSN1ObjectIdentifierC8;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC9 = o.c("2.5.4.47");
        enhancedSearchGuide = aSN1ObjectIdentifierC9;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC10 = o.c("2.5.4.23");
        facsimileTelephoneNumber = aSN1ObjectIdentifierC10;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC11 = o.c("2.5.4.44");
        generationQualifier = aSN1ObjectIdentifierC11;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC12 = o.c("2.5.4.42");
        givenName = aSN1ObjectIdentifierC12;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC13 = o.c("2.5.4.51");
        houseIdentifier = aSN1ObjectIdentifierC13;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC14 = o.c("2.5.4.43");
        initials = aSN1ObjectIdentifierC14;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC15 = o.c("2.5.4.25");
        internationalISDNNumber = aSN1ObjectIdentifierC15;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC16 = o.c("2.5.4.7");
        f19847l = aSN1ObjectIdentifierC16;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC17 = o.c("2.5.4.31");
        member = aSN1ObjectIdentifierC17;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC18 = o.c("2.5.4.41");
        name = aSN1ObjectIdentifierC18;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC19 = o.c("2.5.4.10");
        f19848o = aSN1ObjectIdentifierC19;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC20 = o.c("2.5.4.11");
        ou = aSN1ObjectIdentifierC20;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC21 = o.c("2.5.4.32");
        owner = aSN1ObjectIdentifierC21;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC22 = o.c("2.5.4.19");
        physicalDeliveryOfficeName = aSN1ObjectIdentifierC22;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC23 = o.c("2.5.4.16");
        postalAddress = aSN1ObjectIdentifierC23;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC24 = o.c("2.5.4.17");
        postalCode = aSN1ObjectIdentifierC24;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC25 = o.c("2.5.4.18");
        postOfficeBox = aSN1ObjectIdentifierC25;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC26 = o.c("2.5.4.28");
        preferredDeliveryMethod = aSN1ObjectIdentifierC26;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC27 = o.c("2.5.4.26");
        registeredAddress = aSN1ObjectIdentifierC27;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC28 = o.c("2.5.4.33");
        roleOccupant = aSN1ObjectIdentifierC28;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC29 = o.c("2.5.4.14");
        searchGuide = aSN1ObjectIdentifierC29;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC30 = o.c("2.5.4.34");
        seeAlso = aSN1ObjectIdentifierC30;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC31 = o.c("2.5.4.5");
        serialNumber = aSN1ObjectIdentifierC31;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC32 = o.c("2.5.4.4");
        sn = aSN1ObjectIdentifierC32;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC33 = o.c("2.5.4.8");
        st = aSN1ObjectIdentifierC33;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC34 = o.c("2.5.4.9");
        street = aSN1ObjectIdentifierC34;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC35 = o.c("2.5.4.20");
        telephoneNumber = aSN1ObjectIdentifierC35;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC36 = o.c("2.5.4.22");
        teletexTerminalIdentifier = aSN1ObjectIdentifierC36;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC37 = o.c("2.5.4.21");
        telexNumber = aSN1ObjectIdentifierC37;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC38 = o.c("2.5.4.12");
        title = aSN1ObjectIdentifierC38;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC39 = o.c("0.9.2342.19200300.100.1.1");
        uid = aSN1ObjectIdentifierC39;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC40 = o.c("2.5.4.50");
        uniqueMember = aSN1ObjectIdentifierC40;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC41 = o.c("2.5.4.35");
        userPassword = aSN1ObjectIdentifierC41;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC42 = o.c("2.5.4.24");
        x121Address = aSN1ObjectIdentifierC42;
        ASN1ObjectIdentifier aSN1ObjectIdentifierC43 = o.c("2.5.4.45");
        x500UniqueIdentifier = aSN1ObjectIdentifierC43;
        Hashtable hashtable = new Hashtable();
        DefaultSymbols = hashtable;
        Hashtable hashtable2 = new Hashtable();
        DefaultLookUp = hashtable2;
        hashtable.put(aSN1ObjectIdentifierC, "businessCategory");
        hashtable.put(aSN1ObjectIdentifierC2, "c");
        hashtable.put(aSN1ObjectIdentifierC3, "cn");
        hashtable.put(aSN1ObjectIdentifierC4, "dc");
        hashtable.put(aSN1ObjectIdentifierC5, "description");
        hashtable.put(aSN1ObjectIdentifierC6, "destinationIndicator");
        hashtable.put(aSN1ObjectIdentifierC7, "distinguishedName");
        hashtable.put(aSN1ObjectIdentifierC8, "dnQualifier");
        hashtable.put(aSN1ObjectIdentifierC9, "enhancedSearchGuide");
        hashtable.put(aSN1ObjectIdentifierC10, "facsimileTelephoneNumber");
        hashtable.put(aSN1ObjectIdentifierC11, "generationQualifier");
        hashtable.put(aSN1ObjectIdentifierC12, "givenName");
        hashtable.put(aSN1ObjectIdentifierC13, "houseIdentifier");
        hashtable.put(aSN1ObjectIdentifierC14, "initials");
        hashtable.put(aSN1ObjectIdentifierC15, "internationalISDNNumber");
        hashtable.put(aSN1ObjectIdentifierC16, "l");
        hashtable.put(aSN1ObjectIdentifierC17, "member");
        hashtable.put(aSN1ObjectIdentifierC18, "name");
        hashtable.put(aSN1ObjectIdentifierC19, "o");
        hashtable.put(aSN1ObjectIdentifierC20, "ou");
        hashtable.put(aSN1ObjectIdentifierC21, "owner");
        hashtable.put(aSN1ObjectIdentifierC22, "physicalDeliveryOfficeName");
        hashtable.put(aSN1ObjectIdentifierC23, "postalAddress");
        hashtable.put(aSN1ObjectIdentifierC24, "postalCode");
        hashtable.put(aSN1ObjectIdentifierC25, "postOfficeBox");
        hashtable.put(aSN1ObjectIdentifierC26, "preferredDeliveryMethod");
        hashtable.put(aSN1ObjectIdentifierC27, "registeredAddress");
        hashtable.put(aSN1ObjectIdentifierC28, "roleOccupant");
        hashtable.put(aSN1ObjectIdentifierC29, "searchGuide");
        hashtable.put(aSN1ObjectIdentifierC30, "seeAlso");
        hashtable.put(aSN1ObjectIdentifierC31, "serialNumber");
        hashtable.put(aSN1ObjectIdentifierC32, "sn");
        hashtable.put(aSN1ObjectIdentifierC33, "st");
        hashtable.put(aSN1ObjectIdentifierC34, "street");
        hashtable.put(aSN1ObjectIdentifierC35, "telephoneNumber");
        hashtable.put(aSN1ObjectIdentifierC36, "teletexTerminalIdentifier");
        hashtable.put(aSN1ObjectIdentifierC37, "telexNumber");
        hashtable.put(aSN1ObjectIdentifierC38, "title");
        hashtable.put(aSN1ObjectIdentifierC39, "uid");
        hashtable.put(aSN1ObjectIdentifierC40, "uniqueMember");
        hashtable.put(aSN1ObjectIdentifierC41, "userPassword");
        hashtable.put(aSN1ObjectIdentifierC42, "x121Address");
        hashtable.put(aSN1ObjectIdentifierC43, "x500UniqueIdentifier");
        hashtable2.put("businesscategory", aSN1ObjectIdentifierC);
        hashtable2.put("c", aSN1ObjectIdentifierC2);
        hashtable2.put("cn", aSN1ObjectIdentifierC3);
        hashtable2.put("dc", aSN1ObjectIdentifierC4);
        hashtable2.put("description", aSN1ObjectIdentifierC5);
        hashtable2.put("destinationindicator", aSN1ObjectIdentifierC6);
        hashtable2.put("distinguishedname", aSN1ObjectIdentifierC7);
        hashtable2.put("dnqualifier", aSN1ObjectIdentifierC8);
        hashtable2.put("enhancedsearchguide", aSN1ObjectIdentifierC9);
        hashtable2.put("facsimiletelephonenumber", aSN1ObjectIdentifierC10);
        hashtable2.put("generationqualifier", aSN1ObjectIdentifierC11);
        hashtable2.put("givenname", aSN1ObjectIdentifierC12);
        hashtable2.put("houseidentifier", aSN1ObjectIdentifierC13);
        hashtable2.put("initials", aSN1ObjectIdentifierC14);
        hashtable2.put("internationalisdnnumber", aSN1ObjectIdentifierC15);
        hashtable2.put("l", aSN1ObjectIdentifierC16);
        hashtable2.put("member", aSN1ObjectIdentifierC17);
        hashtable2.put("name", aSN1ObjectIdentifierC18);
        hashtable2.put("o", aSN1ObjectIdentifierC19);
        hashtable2.put("ou", aSN1ObjectIdentifierC20);
        hashtable2.put("owner", aSN1ObjectIdentifierC21);
        hashtable2.put("physicaldeliveryofficename", aSN1ObjectIdentifierC22);
        hashtable2.put("postaladdress", aSN1ObjectIdentifierC23);
        hashtable2.put("postalcode", aSN1ObjectIdentifierC24);
        hashtable2.put("postofficebox", aSN1ObjectIdentifierC25);
        hashtable2.put("preferreddeliverymethod", aSN1ObjectIdentifierC26);
        hashtable2.put("registeredaddress", aSN1ObjectIdentifierC27);
        hashtable2.put("roleoccupant", aSN1ObjectIdentifierC28);
        hashtable2.put("searchguide", aSN1ObjectIdentifierC29);
        hashtable2.put("seealso", aSN1ObjectIdentifierC30);
        hashtable2.put("serialnumber", aSN1ObjectIdentifierC31);
        hashtable2.put("sn", aSN1ObjectIdentifierC32);
        hashtable2.put("st", aSN1ObjectIdentifierC33);
        hashtable2.put("street", aSN1ObjectIdentifierC34);
        hashtable2.put("telephonenumber", aSN1ObjectIdentifierC35);
        hashtable2.put("teletexterminalidentifier", aSN1ObjectIdentifierC36);
        hashtable2.put("telexnumber", aSN1ObjectIdentifierC37);
        hashtable2.put("title", aSN1ObjectIdentifierC38);
        hashtable2.put("uid", aSN1ObjectIdentifierC39);
        hashtable2.put("uniquemember", aSN1ObjectIdentifierC40);
        hashtable2.put("userpassword", aSN1ObjectIdentifierC41);
        hashtable2.put("x121address", aSN1ObjectIdentifierC42);
        hashtable2.put("x500uniqueidentifier", aSN1ObjectIdentifierC43);
        INSTANCE = new RFC4519Style();
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public ASN1ObjectIdentifier attrNameToOID(String str) {
        return IETFUtils.decodeAttrName(str, this.defaultLookUp);
    }

    @Override // org.bouncycastle.asn1.x500.style.AbstractX500NameStyle
    public ASN1Encodable encodeStringValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) f19846dc) ? new DERIA5String(str) : (aSN1ObjectIdentifier.equals((ASN1Primitive) f19845c) || aSN1ObjectIdentifier.equals((ASN1Primitive) serialNumber) || aSN1ObjectIdentifier.equals((ASN1Primitive) dnQualifier) || aSN1ObjectIdentifier.equals((ASN1Primitive) telephoneNumber)) ? new DERPrintableString(str) : super.encodeStringValue(aSN1ObjectIdentifier, str);
    }

    @Override // org.bouncycastle.asn1.x500.X500NameStyle
    public RDN[] fromString(String str) {
        RDN[] rdnArrRDNsFromString = IETFUtils.rDNsFromString(str, this);
        RDN[] rdnArr = new RDN[rdnArrRDNsFromString.length];
        for (int i10 = 0; i10 != rdnArrRDNsFromString.length; i10++) {
            rdnArr[(r0 - i10) - 1] = rdnArrRDNsFromString[i10];
        }
        return rdnArr;
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
        RDN[] rDNs = x500Name.getRDNs();
        boolean z10 = true;
        for (int length = rDNs.length - 1; length >= 0; length--) {
            if (z10) {
                z10 = false;
            } else {
                stringBuffer.append(',');
            }
            IETFUtils.appendRDN(stringBuffer, rDNs[length], this.defaultSymbols);
        }
        return stringBuffer.toString();
    }
}
