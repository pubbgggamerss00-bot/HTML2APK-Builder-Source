package org.bouncycastle.pqc.asn1;

import i8.e;
import j2.y;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ParSet extends ASN1Object {

    /* renamed from: h, reason: collision with root package name */
    private int[] f20299h;

    /* renamed from: k, reason: collision with root package name */
    private int[] f20300k;

    /* renamed from: t, reason: collision with root package name */
    private int f20301t;

    /* renamed from: w, reason: collision with root package name */
    private int[] f20302w;

    public ParSet(int i10, int[] iArr, int[] iArr2, int[] iArr3) {
        this.f20301t = i10;
        this.f20299h = iArr;
        this.f20302w = iArr2;
        this.f20300k = iArr3;
    }

    private static int checkBigIntegerInIntRangeAndPositive(ASN1Encodable aSN1Encodable) {
        int iIntValueExact = ((ASN1Integer) aSN1Encodable).intValueExact();
        if (iIntValueExact > 0) {
            return iIntValueExact;
        }
        throw new IllegalArgumentException(y.a(iIntValueExact, "BigInteger not in Range: "));
    }

    public static ParSet getInstance(Object obj) {
        if (obj instanceof ParSet) {
            return (ParSet) obj;
        }
        if (obj != null) {
            return new ParSet(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public int[] getH() {
        return Arrays.clone(this.f20299h);
    }

    public int[] getK() {
        return Arrays.clone(this.f20300k);
    }

    public int getT() {
        return this.f20301t;
    }

    public int[] getW() {
        return Arrays.clone(this.f20302w);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
        for (int i10 = 0; i10 < this.f20299h.length; i10++) {
            aSN1EncodableVector.add(new ASN1Integer(this.f20299h[i10]));
            aSN1EncodableVector2.add(new ASN1Integer(this.f20302w[i10]));
            aSN1EncodableVector3.add(new ASN1Integer(this.f20300k[i10]));
        }
        ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
        aSN1EncodableVector4.add(new ASN1Integer(this.f20301t));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector2));
        aSN1EncodableVector4.add(new DERSequence(aSN1EncodableVector3));
        return new DERSequence(aSN1EncodableVector4);
    }

    private ParSet(ASN1Sequence aSN1Sequence) {
        if (aSN1Sequence.size() != 4) {
            throw new IllegalArgumentException(e.b(aSN1Sequence, new StringBuilder("sie of seqOfParams = ")));
        }
        this.f20301t = checkBigIntegerInIntRangeAndPositive(aSN1Sequence.getObjectAt(0));
        ASN1Sequence aSN1Sequence2 = (ASN1Sequence) aSN1Sequence.getObjectAt(1);
        ASN1Sequence aSN1Sequence3 = (ASN1Sequence) aSN1Sequence.getObjectAt(2);
        ASN1Sequence aSN1Sequence4 = (ASN1Sequence) aSN1Sequence.getObjectAt(3);
        if (aSN1Sequence2.size() != this.f20301t || aSN1Sequence3.size() != this.f20301t || aSN1Sequence4.size() != this.f20301t) {
            throw new IllegalArgumentException("invalid size of sequences");
        }
        this.f20299h = new int[aSN1Sequence2.size()];
        this.f20302w = new int[aSN1Sequence3.size()];
        this.f20300k = new int[aSN1Sequence4.size()];
        for (int i10 = 0; i10 < this.f20301t; i10++) {
            this.f20299h[i10] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence2.getObjectAt(i10));
            this.f20302w[i10] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence3.getObjectAt(i10));
            this.f20300k[i10] = checkBigIntegerInIntRangeAndPositive(aSN1Sequence4.getObjectAt(i10));
        }
    }
}
