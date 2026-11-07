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
public class CMCEPublicKey extends ASN1Object {
    private byte[] T;

    public CMCEPublicKey(ASN1Sequence aSN1Sequence) {
        this.T = a.a(aSN1Sequence, 0);
    }

    public static CMCEPublicKey getInstance(Object obj) {
        if (obj instanceof CMCEPublicKey) {
            return (CMCEPublicKey) obj;
        }
        if (obj != null) {
            return new CMCEPublicKey(ASN1Sequence.getInstance(obj));
        }
        return null;
    }

    public byte[] getT() {
        return Arrays.clone(this.T);
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        return s0.b(aSN1EncodableVector, new DEROctetString(this.T), aSN1EncodableVector);
    }

    public CMCEPublicKey(byte[] bArr) {
        this.T = bArr;
    }
}
