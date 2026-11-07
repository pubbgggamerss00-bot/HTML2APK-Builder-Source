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
public class SPHINCSPLUSPublicKey extends ASN1Object {
    private byte[] pkroot;
    private byte[] pkseed;

    public SPHINCSPLUSPublicKey(ASN1Sequence aSN1Sequence) {
        this.pkseed = a.a(aSN1Sequence, 0);
        this.pkroot = a.a(aSN1Sequence, 1);
    }

    public static SPHINCSPLUSPublicKey getInstance(Object obj) {
        if (obj instanceof SPHINCSPLUSPublicKey) {
            return (SPHINCSPLUSPublicKey) obj;
        }
        if (obj != null) {
            return new SPHINCSPLUSPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getPkroot() {
        return Arrays.clone(this.pkroot);
    }

    public byte[] getPkseed() {
        return Arrays.clone(this.pkseed);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new DEROctetString(this.pkseed));
        return s0.b(aSN1EncodableVector, new DEROctetString(this.pkroot), aSN1EncodableVector);
    }

    public SPHINCSPLUSPublicKey(byte[] bArr, byte[] bArr2) {
        this.pkseed = bArr;
        this.pkroot = bArr2;
    }
}
