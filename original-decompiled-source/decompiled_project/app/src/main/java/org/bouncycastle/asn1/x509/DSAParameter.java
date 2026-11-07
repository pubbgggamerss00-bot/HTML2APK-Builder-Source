package org.bouncycastle.asn1.x509;

import i8.c;
import i8.e;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;

/* loaded from: classes2.dex */
public class DSAParameter extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    ASN1Integer f19850g;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f19851p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f19852q;

    public DSAParameter(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f19851p = new ASN1Integer(bigInteger);
        this.f19852q = new ASN1Integer(bigInteger2);
        this.f19850g = new ASN1Integer(bigInteger3);
    }

    public static DSAParameter getInstance(Object obj) {
        if (obj instanceof DSAParameter) {
            return (DSAParameter) obj;
        }
        if (obj != null) {
            return new DSAParameter(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public BigInteger getG() {
        return this.f19850g.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f19851p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f19852q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(3);
        aSN1EncodableVector.add(this.f19851p);
        aSN1EncodableVector.add(this.f19852q);
        return c.c(aSN1EncodableVector, this.f19850g, aSN1EncodableVector);
    }

    private DSAParameter(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 3) {
            throw new IllegalArgumentException(e.b(aSN1Sequence, new StringBuilder("Bad sequence size: ")));
        }
        Enumeration objects = aSN1Sequence.getObjects();
        this.f19851p = ASN1Integer.getInstance(objects.nextElement());
        this.f19852q = ASN1Integer.getInstance(objects.nextElement());
        this.f19850g = ASN1Integer.getInstance(objects.nextElement());
    }

    public static DSAParameter getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
