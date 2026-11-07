package org.bouncycastle.voms;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.asn1.ASN1IA5String;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.x509.Attribute;
import org.bouncycastle.asn1.x509.IetfAttrSyntax;
import org.bouncycastle.cert.X509AttributeCertificateHolder;

/* loaded from: classes3.dex */
public class VOMSAttribute {
    public static final String VOMS_ATTR_OID = "1.3.6.1.4.1.8005.100.100.4";
    private X509AttributeCertificateHolder myAC;
    private String myHostPort;
    private String myVo;
    private List myStringList = new ArrayList();
    private List myFQANs = new ArrayList();

    public static class FQAN {
        String capability;
        String fqan;
        String group;
        String role;

        public FQAN(String str) {
            this.fqan = str;
        }

        public String getCapability() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.capability;
        }

        public String getFQAN() {
            String str = this.fqan;
            if (str != null) {
                return str;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.group);
            sb.append("/Role=");
            String str2 = this.role;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
            if (this.capability != null) {
                str3 = "/Capability=" + this.capability;
            }
            sb.append(str3);
            String string = sb.toString();
            this.fqan = string;
            return string;
        }

        public String getGroup() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.group;
        }

        public String getRole() {
            if (this.group == null && this.fqan != null) {
                split();
            }
            return this.role;
        }

        public void split() {
            this.fqan.getClass();
            int iIndexOf = this.fqan.indexOf("/Role=");
            if (iIndexOf < 0) {
                return;
            }
            this.group = this.fqan.substring(0, iIndexOf);
            int i10 = iIndexOf + 6;
            int iIndexOf2 = this.fqan.indexOf("/Capability=", i10);
            String str = this.fqan;
            String strSubstring = iIndexOf2 < 0 ? str.substring(i10) : str.substring(i10, iIndexOf2);
            String str2 = null;
            if (strSubstring.length() == 0) {
                strSubstring = null;
            }
            this.role = strSubstring;
            String strSubstring2 = iIndexOf2 < 0 ? null : this.fqan.substring(iIndexOf2 + 12);
            if (strSubstring2 != null && strSubstring2.length() != 0) {
                str2 = strSubstring2;
            }
            this.capability = str2;
        }

        public String toString() {
            return getFQAN();
        }

        public FQAN(String str, String str2, String str3) {
            this.group = str;
            this.role = str2;
            this.capability = str3;
        }
    }

    public VOMSAttribute(X509AttributeCertificateHolder x509AttributeCertificateHolder) {
        if (x509AttributeCertificateHolder == null) {
            throw new IllegalArgumentException("VOMSAttribute: AttributeCertificate is NULL");
        }
        this.myAC = x509AttributeCertificateHolder;
        Attribute[] attributes = x509AttributeCertificateHolder.getAttributes(new ASN1ObjectIdentifier(VOMS_ATTR_OID));
        if (attributes == null) {
            return;
        }
        for (int i10 = 0; i10 != attributes.length; i10++) {
            try {
                IetfAttrSyntax ietfAttrSyntax = IetfAttrSyntax.getInstance(attributes[i10].getAttributeValues()[0]);
                String string = ((ASN1IA5String) ietfAttrSyntax.getPolicyAuthority().getNames()[0].getName()).getString();
                int iIndexOf = string.indexOf("://");
                if (iIndexOf < 0 || iIndexOf == string.length() - 1) {
                    throw new IllegalArgumentException("Bad encoding of VOMS policyAuthority : [" + string + "]");
                }
                this.myVo = string.substring(0, iIndexOf);
                this.myHostPort = string.substring(iIndexOf + 3);
                if (ietfAttrSyntax.getValueType() != 1) {
                    throw new IllegalArgumentException("VOMS attribute values are not encoded as octet strings, policyAuthority = " + string);
                }
                ASN1OctetString[] aSN1OctetStringArr = (ASN1OctetString[]) ietfAttrSyntax.getValues();
                for (int i11 = 0; i11 != aSN1OctetStringArr.length; i11++) {
                    String str = new String(aSN1OctetStringArr[i11].getOctets());
                    FQAN fqan = new FQAN(str);
                    if (!this.myStringList.contains(str)) {
                        if (str.startsWith("/" + this.myVo + "/")) {
                            this.myStringList.add(str);
                            this.myFQANs.add(fqan);
                        }
                    }
                }
            } catch (IllegalArgumentException e10) {
                throw e10;
            } catch (Exception unused) {
                throw new IllegalArgumentException("Badly encoded VOMS extension in AC issued by " + x509AttributeCertificateHolder.getIssuer());
            }
        }
    }

    public X509AttributeCertificateHolder getAC() {
        return this.myAC;
    }

    public List getFullyQualifiedAttributes() {
        return this.myStringList;
    }

    public String getHostPort() {
        return this.myHostPort;
    }

    public List getListOfFQAN() {
        return this.myFQANs;
    }

    public String getVO() {
        return this.myVo;
    }

    public String toString() {
        return "VO      :" + this.myVo + "\nHostPort:" + this.myHostPort + "\nFQANs   :" + this.myFQANs;
    }
}
