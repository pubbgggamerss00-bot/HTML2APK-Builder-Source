package org.bouncycastle.pqc.asn1;

import com.google.crypto.tink.shaded.protobuf.s0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class KyberPrivateKey extends ASN1Object {
    private byte[] hpk;
    private byte[] nonce;
    private KyberPublicKey publicKey;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f20287s;
    private int version;

    public KyberPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(i10, bArr, bArr2, bArr3, null);
    }

    public static KyberPrivateKey getInstance(Object obj) {
        if (obj instanceof KyberPrivateKey) {
            return (KyberPrivateKey) obj;
        }
        if (obj != null) {
            return new KyberPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return Arrays.clone(this.hpk);
    }

    public byte[] getNonce() {
        return Arrays.clone(this.nonce);
    }

    public KyberPublicKey getPublicKey() {
        return this.publicKey;
    }

    public byte[] getS() {
        return Arrays.clone(this.f20287s);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f20287s));
        KyberPublicKey kyberPublicKey = this.publicKey;
        if (kyberPublicKey != null) {
            aSN1EncodableVector.add(new KyberPublicKey(kyberPublicKey.getT(), this.publicKey.getRho()));
        }
        aSN1EncodableVector.add(new DEROctetString(this.hpk));
        return s0.b(aSN1EncodableVector, new DEROctetString(this.nonce), aSN1EncodableVector);
    }

    public KyberPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, KyberPublicKey kyberPublicKey) {
        this.version = i10;
        this.f20287s = bArr;
        this.publicKey = kyberPublicKey;
        this.hpk = bArr2;
        this.nonce = bArr3;
    }

    private KyberPrivateKey(ASN1Sequence aSN1Sequence) {
        int i10 = 0;
        int iA = a.a(aSN1Sequence, 0);
        this.version = iA;
        if (iA != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20287s = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 1);
        if (aSN1Sequence.size() == 5) {
            this.publicKey = KyberPublicKey.getInstance(aSN1Sequence.getObjectAt(2));
        } else {
            i10 = 1;
        }
        this.hpk = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(3 - i10)).getOctets());
        this.nonce = Arrays.clone(ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(4 - i10)).getOctets());
    }
}
