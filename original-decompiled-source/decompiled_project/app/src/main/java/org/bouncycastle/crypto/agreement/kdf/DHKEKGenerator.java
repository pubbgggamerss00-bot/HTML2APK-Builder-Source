package org.bouncycastle.crypto.agreement.kdf;

import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERTaggedObject;
import org.bouncycastle.asn1.b;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.DerivationParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Pack;

/* loaded from: classes2.dex */
public class DHKEKGenerator implements DerivationFunction {
    private ASN1ObjectIdentifier algorithm;
    private final Digest digest;
    private int keySize;
    private byte[] partyAInfo;

    /* renamed from: z, reason: collision with root package name */
    private byte[] f19888z;

    public DHKEKGenerator(Digest digest) {
        this.digest = digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public int generateBytes(byte[] bArr, int i10, int i11) throws DataLengthException, IllegalArgumentException {
        boolean z10;
        int i12 = i11;
        int i13 = i10;
        if (bArr.length - i12 < i13) {
            throw new OutputLengthException("output buffer too small");
        }
        long j10 = i12;
        int digestSize = this.digest.getDigestSize();
        if (j10 > 8589934591L) {
            throw new IllegalArgumentException("Output length too large");
        }
        long j11 = digestSize;
        int i14 = (int) (((j10 + j11) - 1) / j11);
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        int i15 = 0;
        int i16 = 0;
        int i17 = 1;
        while (i16 < i14) {
            Digest digest = this.digest;
            byte[] bArr3 = this.f19888z;
            digest.update(bArr3, i15, bArr3.length);
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
            aSN1EncodableVector2.add(this.algorithm);
            aSN1EncodableVector2.add(new DEROctetString(Pack.intToBigEndian(i17)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
            if (this.partyAInfo != null) {
                z10 = true;
                aSN1EncodableVector.add(new DERTaggedObject(true, i15, (ASN1Encodable) new DEROctetString(this.partyAInfo)));
            } else {
                z10 = true;
            }
            aSN1EncodableVector.add(new DERTaggedObject(z10, 2, new DEROctetString(Pack.intToBigEndian(this.keySize))));
            try {
                byte[] encoded = new DERSequence(aSN1EncodableVector).getEncoded(ASN1Encoding.DER);
                this.digest.update(encoded, 0, encoded.length);
                this.digest.doFinal(bArr2, 0);
                if (i12 > digestSize) {
                    System.arraycopy(bArr2, 0, bArr, i13, digestSize);
                    i13 += digestSize;
                    i12 -= digestSize;
                } else {
                    System.arraycopy(bArr2, 0, bArr, i13, i12);
                }
                i17++;
                i16++;
                i15 = 0;
            } catch (IOException e10) {
                throw new IllegalArgumentException(b.a(e10, new StringBuilder("unable to encode parameter info: ")));
            }
        }
        this.digest.reset();
        return (int) j10;
    }

    public Digest getDigest() {
        return this.digest;
    }

    @Override // org.bouncycastle.crypto.DerivationFunction
    public void init(DerivationParameters derivationParameters) {
        DHKDFParameters dHKDFParameters = (DHKDFParameters) derivationParameters;
        this.algorithm = dHKDFParameters.getAlgorithm();
        this.keySize = dHKDFParameters.getKeySize();
        this.f19888z = dHKDFParameters.getZ();
        this.partyAInfo = dHKDFParameters.getExtraInfo();
    }
}
