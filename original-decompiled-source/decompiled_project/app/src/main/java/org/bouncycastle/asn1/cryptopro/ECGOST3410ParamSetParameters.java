package org.bouncycastle.asn1.cryptopro;

import i8.c;
import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1TaggedObject;
import p.i0;

/* loaded from: classes2.dex */
public class ECGOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a, reason: collision with root package name */
    ASN1Integer f19822a;

    /* renamed from: b, reason: collision with root package name */
    ASN1Integer f19823b;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f19824p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f19825q;

    /* renamed from: x, reason: collision with root package name */
    ASN1Integer f19826x;

    /* renamed from: y, reason: collision with root package name */
    ASN1Integer f19827y;

    public ECGOST3410ParamSetParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, BigInteger bigInteger5) {
        this.f19822a = new ASN1Integer(bigInteger);
        this.f19823b = new ASN1Integer(bigInteger2);
        this.f19824p = new ASN1Integer(bigInteger3);
        this.f19825q = new ASN1Integer(bigInteger4);
        this.f19826x = new ASN1Integer(i10);
        this.f19827y = new ASN1Integer(bigInteger5);
    }

    public static ECGOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof ECGOST3410ParamSetParameters)) {
            return (ECGOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new ECGOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(i0.a(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f19822a.getPositiveValue();
    }

    public BigInteger getP() {
        return this.f19824p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f19825q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(6);
        aSN1EncodableVector.add(this.f19822a);
        aSN1EncodableVector.add(this.f19823b);
        aSN1EncodableVector.add(this.f19824p);
        aSN1EncodableVector.add(this.f19825q);
        aSN1EncodableVector.add(this.f19826x);
        return c.c(aSN1EncodableVector, this.f19827y, aSN1EncodableVector);
    }

    public ECGOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.f19822a = (ASN1Integer) objects.nextElement();
        this.f19823b = (ASN1Integer) objects.nextElement();
        this.f19824p = (ASN1Integer) objects.nextElement();
        this.f19825q = (ASN1Integer) objects.nextElement();
        this.f19826x = (ASN1Integer) objects.nextElement();
        this.f19827y = (ASN1Integer) objects.nextElement();
    }

    public static ECGOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
