package org.bouncycastle.asn1.pkcs;

import i8.c;
import java.math.BigInteger;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;

/* loaded from: classes2.dex */
public class PKCS12PBEParams extends ASN1Object {
    ASN1Integer iterations;
    ASN1OctetString iv;

    private PKCS12PBEParams(ASN1Sequence aSN1Sequence) {
        this.iv = (ASN1OctetString) aSN1Sequence.getObjectAt(0);
        this.iterations = ASN1Integer.getInstance(aSN1Sequence.getObjectAt(1));
    }

    public static PKCS12PBEParams getInstance(Object obj) {
        if (obj instanceof PKCS12PBEParams) {
            return (PKCS12PBEParams) obj;
        }
        if (obj != null) {
            return new PKCS12PBEParams(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getIV() {
        return this.iv.getOctets();
    }

    public BigInteger getIterations() {
        return this.iterations.getValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.iv);
        return c.c(aSN1EncodableVector, this.iterations, aSN1EncodableVector);
    }

    public PKCS12PBEParams(byte[] bArr, int i10) {
        this.iv = new DEROctetString(bArr);
        this.iterations = new ASN1Integer(i10);
    }
}
