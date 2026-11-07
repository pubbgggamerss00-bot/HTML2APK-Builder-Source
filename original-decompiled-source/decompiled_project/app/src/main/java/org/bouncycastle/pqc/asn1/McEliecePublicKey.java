package org.bouncycastle.pqc.asn1;

import com.google.crypto.tink.shaded.protobuf.s0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* loaded from: classes3.dex */
public class McEliecePublicKey extends ASN1Object {

    /* renamed from: g, reason: collision with root package name */
    private final GF2Matrix f20296g;

    /* renamed from: n, reason: collision with root package name */
    private final int f20297n;

    /* renamed from: t, reason: collision with root package name */
    private final int f20298t;

    public McEliecePublicKey(int i10, int i11, GF2Matrix gF2Matrix) {
        this.f20297n = i10;
        this.f20298t = i11;
        this.f20296g = new GF2Matrix(gF2Matrix);
    }

    public static McEliecePublicKey getInstance(Object obj) {
        if (obj instanceof McEliecePublicKey) {
            return (McEliecePublicKey) obj;
        }
        if (obj != null) {
            return new McEliecePublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public GF2Matrix getG() {
        return new GF2Matrix(this.f20296g);
    }

    public int getN() {
        return this.f20297n;
    }

    public int getT() {
        return this.f20298t;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.f20297n));
        aSN1EncodableVector.add(new ASN1Integer(this.f20298t));
        return s0.b(aSN1EncodableVector, new DEROctetString(this.f20296g.getEncoded()), aSN1EncodableVector);
    }

    private McEliecePublicKey(ASN1Sequence aSN1Sequence) {
        this.f20297n = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).intValueExact();
        this.f20298t = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).intValueExact();
        this.f20296g = new GF2Matrix(((ASN1OctetString) aSN1Sequence.getObjectAt(2)).getOctets());
    }
}
