package org.bouncycastle.internal.asn1.oiw;

import i8.c;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;

/* loaded from: classes2.dex */
public class ElGamalParameter extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    ASN1Integer f20111g;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f20112p;

    public ElGamalParameter(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f20112p = new ASN1Integer(bigInteger);
        this.f20111g = new ASN1Integer(bigInteger2);
    }

    public static ElGamalParameter getInstance(Object obj) {
        if (obj instanceof ElGamalParameter) {
            return (ElGamalParameter) obj;
        }
        if (obj != null) {
            return new ElGamalParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f20111g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f20112p.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(2);
        aSN1EncodableVector.add(this.f20112p);
        return c.c(aSN1EncodableVector, this.f20111g, aSN1EncodableVector);
    }

    private ElGamalParameter(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f20112p = (ASN1Integer) objects.nextElement();
        this.f20111g = (ASN1Integer) objects.nextElement();
    }
}
