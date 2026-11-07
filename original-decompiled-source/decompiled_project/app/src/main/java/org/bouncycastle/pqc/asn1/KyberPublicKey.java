package org.bouncycastle.pqc.asn1;

import com.google.crypto.tink.shaded.protobuf.s0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cmc.a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class KyberPublicKey extends ASN1Object {
    private byte[] rho;

    /* renamed from: t, reason: collision with root package name */
    private byte[] f20288t;

    public KyberPublicKey(ASN1Sequence aSN1Sequence) {
        this.f20288t = a.a(aSN1Sequence, 0);
        this.rho = a.a(aSN1Sequence, 1);
    }

    public static KyberPublicKey getInstance(Object obj) {
        if (obj instanceof KyberPublicKey) {
            return (KyberPublicKey) obj;
        }
        if (obj != null) {
            return new KyberPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getRho() {
        return Arrays.clone(this.rho);
    }

    public byte[] getT() {
        return Arrays.clone(this.f20288t);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.f20288t));
        return s0.b(aSN1EncodableVector, new DEROctetString(this.rho), aSN1EncodableVector);
    }

    public KyberPublicKey(byte[] bArr, byte[] bArr2) {
        this.f20288t = bArr;
        this.rho = bArr2;
    }
}
