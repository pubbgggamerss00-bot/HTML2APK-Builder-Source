package org.bouncycastle.pqc.asn1;

import com.google.crypto.tink.shaded.protobuf.s0;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.a;

/* loaded from: classes3.dex */
public class SABERPrivateKey extends ASN1Object {
    private SABERPublicKey PublicKey;
    private byte[] hpk;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f20305s;
    private int version;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f20306z;

    public SABERPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.version = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20306z = bArr;
        this.f20305s = bArr2;
        this.hpk = bArr3;
    }

    public static SABERPrivateKey getInstance(Object obj) {
        if (obj instanceof SABERPrivateKey) {
            return (SABERPrivateKey) obj;
        }
        if (obj != null) {
            return new SABERPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getHpk() {
        return this.hpk;
    }

    public SABERPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return this.f20305s;
    }

    public int getVersion() {
        return this.version;
    }

    public byte[] getZ() {
        return this.f20306z;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.f20306z));
        aSN1EncodableVector.add(new DEROctetString(this.f20305s));
        return s0.b(aSN1EncodableVector, new DEROctetString(this.hpk), aSN1EncodableVector);
    }

    public SABERPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, SABERPublicKey sABERPublicKey) {
        this.version = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20306z = bArr;
        this.f20305s = bArr2;
        this.hpk = bArr3;
        this.PublicKey = sABERPublicKey;
    }

    private SABERPrivateKey(ASN1Sequence aSN1Sequence) {
        int iA = a.a(aSN1Sequence, 0);
        this.version = iA;
        if (iA != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.f20306z = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 1);
        this.f20305s = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 2);
        this.PublicKey = SABERPublicKey.getInstance(aSN1Sequence.getObjectAt(3));
        this.hpk = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 4);
    }
}
