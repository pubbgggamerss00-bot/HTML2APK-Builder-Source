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
public class GOST3410ParamSetParameters extends ASN1Object {

    /* renamed from: a, reason: collision with root package name */
    ASN1Integer f19828a;
    int keySize;

    /* renamed from: p, reason: collision with root package name */
    ASN1Integer f19829p;

    /* renamed from: q, reason: collision with root package name */
    ASN1Integer f19830q;

    public GOST3410ParamSetParameters(int i10, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.keySize = i10;
        this.f19829p = new ASN1Integer(bigInteger);
        this.f19830q = new ASN1Integer(bigInteger2);
        this.f19828a = new ASN1Integer(bigInteger3);
    }

    public static GOST3410ParamSetParameters getInstance(Object obj) {
        if (obj == null || (obj instanceof GOST3410ParamSetParameters)) {
            return (GOST3410ParamSetParameters) obj;
        }
        if (obj instanceof ASN1Sequence) {
            return new GOST3410ParamSetParameters((ASN1Sequence) obj);
        }
        throw new IllegalArgumentException(i0.a(obj, "Invalid GOST3410Parameter: "));
    }

    public BigInteger getA() {
        return this.f19828a.getPositiveValue();
    }

    public int getKeySize() {
        return this.keySize;
    }

    public int getLKeySize() {
        return this.keySize;
    }

    public BigInteger getP() {
        return this.f19829p.getPositiveValue();
    }

    public BigInteger getQ() {
        return this.f19830q.getPositiveValue();
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector(4);
        aSN1EncodableVector.add(new ASN1Integer(this.keySize));
        aSN1EncodableVector.add(this.f19829p);
        aSN1EncodableVector.add(this.f19830q);
        return c.c(aSN1EncodableVector, this.f19828a, aSN1EncodableVector);
    }

    public GOST3410ParamSetParameters(ASN1Sequence aSN1Sequence) {
        Enumeration objects = aSN1Sequence.getObjects();
        this.keySize = ((ASN1Integer) objects.nextElement()).intValueExact();
        this.f19829p = (ASN1Integer) objects.nextElement();
        this.f19830q = (ASN1Integer) objects.nextElement();
        this.f19828a = (ASN1Integer) objects.nextElement();
    }

    public static GOST3410ParamSetParameters getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z10) {
        return getInstance(ASN1Sequence.getInstance(aSN1TaggedObject, z10));
    }
}
