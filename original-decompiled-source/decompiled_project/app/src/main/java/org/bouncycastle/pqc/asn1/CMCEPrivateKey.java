package org.bouncycastle.pqc.asn1;

import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cms.a;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class CMCEPrivateKey extends ASN1Object {
    private byte[] C;
    private CMCEPublicKey PublicKey;
    private byte[] alpha;
    private byte[] delta;

    /* renamed from: g, reason: collision with root package name */
    private byte[] f20282g;

    /* renamed from: s, reason: collision with root package name */
    private byte[] f20283s;
    private int version;

    public CMCEPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this(i10, bArr, bArr2, bArr3, bArr4, bArr5, null);
    }

    public static CMCEPrivateKey getInstance(Object obj) {
        if (obj instanceof CMCEPrivateKey) {
            return (CMCEPrivateKey) obj;
        }
        if (obj != null) {
            return new CMCEPrivateKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getAlpha() {
        return Arrays.clone(this.alpha);
    }

    public byte[] getC() {
        return Arrays.clone(this.C);
    }

    public byte[] getDelta() {
        return Arrays.clone(this.delta);
    }

    public byte[] getG() {
        return Arrays.clone(this.f20282g);
    }

    public CMCEPublicKey getPublicKey() {
        return this.PublicKey;
    }

    public byte[] getS() {
        return Arrays.clone(this.f20283s);
    }

    public int getVersion() {
        return this.version;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(this.version));
        aSN1EncodableVector.add(new DEROctetString(this.delta));
        aSN1EncodableVector.add(new DEROctetString(this.C));
        aSN1EncodableVector.add(new DEROctetString(this.f20282g));
        aSN1EncodableVector.add(new DEROctetString(this.alpha));
        aSN1EncodableVector.add(new DEROctetString(this.f20283s));
        CMCEPublicKey cMCEPublicKey = this.PublicKey;
        if (cMCEPublicKey != null) {
            aSN1EncodableVector.add(new CMCEPublicKey(cMCEPublicKey.getT()));
        }
        return new DERSequence(aSN1EncodableVector);
    }

    public CMCEPrivateKey(int i10, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, CMCEPublicKey cMCEPublicKey) {
        this.version = i10;
        if (i10 != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.delta = Arrays.clone(bArr);
        this.C = Arrays.clone(bArr2);
        this.f20282g = Arrays.clone(bArr3);
        this.alpha = Arrays.clone(bArr4);
        this.f20283s = Arrays.clone(bArr5);
        this.PublicKey = cMCEPublicKey;
    }

    private CMCEPrivateKey(ASN1Sequence aSN1Sequence) {
        int iA = a.a(aSN1Sequence, 0);
        this.version = iA;
        if (iA != 0) {
            throw new IllegalArgumentException("unrecognized version");
        }
        this.delta = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 1);
        this.C = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 2);
        this.f20282g = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 3);
        this.alpha = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 4);
        this.f20283s = org.bouncycastle.asn1.cmc.a.a(aSN1Sequence, 5);
        if (aSN1Sequence.size() == 7) {
            this.PublicKey = CMCEPublicKey.getInstance(aSN1Sequence.getObjectAt(6));
        }
    }
}
