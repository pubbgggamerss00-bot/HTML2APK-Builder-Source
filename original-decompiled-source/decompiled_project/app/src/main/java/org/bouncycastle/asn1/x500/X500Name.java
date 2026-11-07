package org.bouncycastle.asn1.x500;

import org.bouncycastle.asn1.ASN1Choice;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.x500.style.BCStyle;

/* loaded from: classes2.dex */
public class X500Name extends ASN1Object implements ASN1Choice {
    private static X500NameStyle defaultStyle = BCStyle.INSTANCE;
    private int hashCodeValue;
    private boolean isHashCodeCalculated;
    private DERSequence rdnSeq;
    private RDN[] rdns;
    private X500NameStyle style;

    public X500Name(String str) {
        this(defaultStyle, str);
    }

    public static X500NameStyle getDefaultStyle() {
        return defaultStyle;
    }

    public static X500Name getInstance(Object obj) {
        if (obj instanceof X500Name) {
            return (X500Name) obj;
        }
        if (obj != null) {
            return new X500Name(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public static void setDefaultStyle(X500NameStyle x500NameStyle) {
        if (x500NameStyle == null) {
            throw new NullPointerException("cannot set style to null");
        }
        defaultStyle = x500NameStyle;
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X500Name) && !(obj instanceof ASN1Sequence)) {
            return false;
        }
        if (toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive())) {
            return true;
        }
        try {
            return this.style.areEqual(this, getInstance(obj));
        } catch (Exception unused) {
            return false;
        }
    }

    public ASN1ObjectIdentifier[] getAttributeTypes() {
        int length = this.rdns.length;
        int size = 0;
        for (int i10 = 0; i10 < length; i10++) {
            size += this.rdns[i10].size();
        }
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr = new ASN1ObjectIdentifier[size];
        int iCollectAttributeTypes = 0;
        for (int i11 = 0; i11 < length; i11++) {
            iCollectAttributeTypes += this.rdns[i11].collectAttributeTypes(aSN1ObjectIdentifierArr, iCollectAttributeTypes);
        }
        return aSN1ObjectIdentifierArr;
    }

    public RDN[] getRDNs() {
        return (RDN[]) this.rdns.clone();
    }

    @Override // org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        if (this.isHashCodeCalculated) {
            return this.hashCodeValue;
        }
        this.isHashCodeCalculated = true;
        int iCalculateHashCode = this.style.calculateHashCode(this);
        this.hashCodeValue = iCalculateHashCode;
        return iCalculateHashCode;
    }

    public int size() {
        return this.rdns.length;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this.rdnSeq;
    }

    public String toString() {
        return this.style.toString(this);
    }

    private X500Name(ASN1Sequence aSN1Sequence) {
        this(defaultStyle, aSN1Sequence);
    }

    public static X500Name getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, true));
    }

    public RDN[] getRDNs(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        int length = this.rdns.length;
        RDN[] rdnArr = new RDN[length];
        int i10 = 0;
        int i11 = 0;
        while (true) {
            RDN[] rdnArr2 = this.rdns;
            if (i10 == rdnArr2.length) {
                break;
            }
            RDN rdn = rdnArr2[i10];
            if (rdn.containsAttributeType(aSN1ObjectIdentifier)) {
                rdnArr[i11] = rdn;
                i11++;
            }
            i10++;
        }
        if (i11 >= length) {
            return rdnArr;
        }
        RDN[] rdnArr3 = new RDN[i11];
        System.arraycopy(rdnArr, 0, rdnArr3, 0, i11);
        return rdnArr3;
    }

    public X500Name(X500NameStyle x500NameStyle, String str) {
        this(x500NameStyle.fromString(str));
        this.style = x500NameStyle;
    }

    public static X500Name getInstance(X500NameStyle x500NameStyle, Object obj) {
        if (obj instanceof X500Name) {
            return new X500Name(x500NameStyle, (X500Name) obj);
        }
        if (obj != null) {
            return new X500Name(x500NameStyle, ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    private X500Name(X500NameStyle x500NameStyle, ASN1Sequence aSN1Sequence) {
        int size = aSN1Sequence.size();
        this.style = x500NameStyle;
        this.rdns = new RDN[size];
        boolean z10 = true;
        for (int i10 = 0; i10 < size; i10++) {
            ASN1Encodable objectAt = aSN1Sequence.getObjectAt(i10);
            RDN rdn = RDN.getInstance(objectAt);
            z10 &= rdn == objectAt;
            this.rdns[i10] = rdn;
        }
        this.rdnSeq = z10 ? DERSequence.convert(aSN1Sequence) : new DERSequence(this.rdns);
    }

    public X500Name(X500NameStyle x500NameStyle, X500Name x500Name) {
        this.style = x500NameStyle;
        this.rdns = x500Name.rdns;
        this.rdnSeq = x500Name.rdnSeq;
    }

    public X500Name(X500NameStyle x500NameStyle, RDN[] rdnArr) {
        this.style = x500NameStyle;
        this.rdns = (RDN[]) rdnArr.clone();
        this.rdnSeq = new DERSequence(this.rdns);
    }

    public X500Name(RDN[] rdnArr) {
        this(defaultStyle, rdnArr);
    }
}
