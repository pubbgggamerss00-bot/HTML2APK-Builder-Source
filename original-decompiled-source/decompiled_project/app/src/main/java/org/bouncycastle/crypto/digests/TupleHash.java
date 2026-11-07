package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.util.Strings;

/* loaded from: classes2.dex */
public class TupleHash implements Xof, Digest {
    private static final byte[] N_TUPLE_HASH = Strings.toByteArray("TupleHash");
    private final int bitLength;
    private final CSHAKEDigest cshake;
    private boolean firstOutput;
    private final int outputLength;

    public TupleHash(int i10, byte[] bArr) {
        this(i10, bArr, i10 * 2);
    }

    private void wrapUp(int i10) {
        byte[] bArrRightEncode = XofUtils.rightEncode(i10 * 8);
        this.cshake.update(bArrRightEncode, 0, bArrRightEncode.length);
        this.firstOutput = false;
    }

    @Override // org.bouncycastle.crypto.Digest
    public int doFinal(byte[] bArr, int i10) throws IllegalStateException, DataLengthException {
        if (this.firstOutput) {
            wrapUp(getDigestSize());
        }
        int iDoFinal = this.cshake.doFinal(bArr, i10, getDigestSize());
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doOutput(byte[] bArr, int i10, int i11) {
        if (this.firstOutput) {
            wrapUp(0);
        }
        return this.cshake.doOutput(bArr, i10, i11);
    }

    @Override // org.bouncycastle.crypto.Digest
    public String getAlgorithmName() {
        return "TupleHash" + this.cshake.getAlgorithmName().substring(6);
    }

    @Override // org.bouncycastle.crypto.ExtendedDigest
    public int getByteLength() {
        return this.cshake.getByteLength();
    }

    @Override // org.bouncycastle.crypto.Digest
    public int getDigestSize() {
        return this.outputLength;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void reset() {
        this.cshake.reset();
        this.firstOutput = true;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte b10) throws IllegalStateException {
        byte[] bArrEncode = XofUtils.encode(b10);
        this.cshake.update(bArrEncode, 0, bArrEncode.length);
    }

    public TupleHash(int i10, byte[] bArr, int i11) {
        this.cshake = new CSHAKEDigest(i10, N_TUPLE_HASH, bArr);
        this.bitLength = i10;
        this.outputLength = (i11 + 7) / 8;
        reset();
    }

    @Override // org.bouncycastle.crypto.Xof
    public int doFinal(byte[] bArr, int i10, int i11) {
        if (this.firstOutput) {
            wrapUp(getDigestSize());
        }
        int iDoFinal = this.cshake.doFinal(bArr, i10, i11);
        reset();
        return iDoFinal;
    }

    @Override // org.bouncycastle.crypto.Digest
    public void update(byte[] bArr, int i10, int i11) throws IllegalStateException, DataLengthException {
        byte[] bArrEncode = XofUtils.encode(bArr, i10, i11);
        this.cshake.update(bArrEncode, 0, bArrEncode.length);
    }

    public TupleHash(TupleHash tupleHash) {
        CSHAKEDigest cSHAKEDigest = new CSHAKEDigest(tupleHash.cshake);
        this.cshake = cSHAKEDigest;
        int i10 = cSHAKEDigest.fixedOutputLength;
        this.bitLength = i10;
        this.outputLength = (i10 * 2) / 8;
        this.firstOutput = tupleHash.firstOutput;
    }
}
