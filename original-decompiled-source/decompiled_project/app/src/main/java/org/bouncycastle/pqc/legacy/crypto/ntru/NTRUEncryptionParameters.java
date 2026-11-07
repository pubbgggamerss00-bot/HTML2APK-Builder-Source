package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.util.DigestFactory;

/* loaded from: classes3.dex */
public class NTRUEncryptionParameters implements Cloneable {
    public int N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* renamed from: c, reason: collision with root package name */
    public int f20505c;

    /* renamed from: db, reason: collision with root package name */
    public int f20506db;

    /* renamed from: df, reason: collision with root package name */
    public int f20507df;
    public int df1;
    public int df2;
    public int df3;
    public int dg;
    public int dm0;
    public int dr;
    public int dr1;
    public int dr2;
    public int dr3;
    public boolean fastFp;
    public Digest hashAlg;
    public boolean hashSeed;
    int llen;
    public int maxMsgLenBytes;
    public int minCallsMask;
    public int minCallsR;
    public byte[] oid;
    public int pkLen;
    public int polyType;

    /* renamed from: q, reason: collision with root package name */
    public int f20508q;
    public boolean sparse;

    public NTRUEncryptionParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, byte[] bArr, boolean z11, boolean z12, Digest digest) {
        this.N = i10;
        this.f20508q = i11;
        this.df1 = i12;
        this.df2 = i13;
        this.df3 = i14;
        this.f20506db = i16;
        this.dm0 = i15;
        this.f20505c = i17;
        this.minCallsR = i18;
        this.minCallsMask = i19;
        this.hashSeed = z10;
        this.oid = bArr;
        this.sparse = z11;
        this.fastFp = z12;
        this.polyType = 1;
        this.hashAlg = digest;
        init();
    }

    private void init() {
        this.dr = this.f20507df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i10 = this.N;
        this.dg = i10 / 3;
        this.llen = 1;
        int i11 = this.f20506db;
        this.maxMsgLenBytes = (((((i10 * 3) / 2) / 8) - 1) - (i11 / 8)) - 1;
        this.bufferLenBits = (((((i10 * 3) / 2) + 7) / 8) * 8) + 1;
        this.bufferLenTrits = i10 - 1;
        this.pkLen = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NTRUEncryptionParameters nTRUEncryptionParameters = (NTRUEncryptionParameters) obj;
        if (this.N != nTRUEncryptionParameters.N || this.bufferLenBits != nTRUEncryptionParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionParameters.bufferLenTrits || this.f20505c != nTRUEncryptionParameters.f20505c || this.f20506db != nTRUEncryptionParameters.f20506db || this.f20507df != nTRUEncryptionParameters.f20507df || this.df1 != nTRUEncryptionParameters.df1 || this.df2 != nTRUEncryptionParameters.df2 || this.df3 != nTRUEncryptionParameters.df3 || this.dg != nTRUEncryptionParameters.dg || this.dm0 != nTRUEncryptionParameters.dm0 || this.dr != nTRUEncryptionParameters.dr || this.dr1 != nTRUEncryptionParameters.dr1 || this.dr2 != nTRUEncryptionParameters.dr2 || this.dr3 != nTRUEncryptionParameters.dr3 || this.fastFp != nTRUEncryptionParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionParameters.hashSeed && this.llen == nTRUEncryptionParameters.llen && this.maxMsgLenBytes == nTRUEncryptionParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionParameters.minCallsMask && this.minCallsR == nTRUEncryptionParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionParameters.oid) && this.pkLen == nTRUEncryptionParameters.pkLen && this.polyType == nTRUEncryptionParameters.polyType && this.f20508q == nTRUEncryptionParameters.f20508q && this.sparse == nTRUEncryptionParameters.sparse;
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i10 = (((((((((((((((((((((((((((((((this.N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f20505c) * 31) + this.f20506db) * 31) + this.f20507df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.dg) * 31) + this.dm0) * 31) + this.dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((Arrays.hashCode(this.oid) + ((((((((((((i10 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f20508q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        StringBuilder sb2 = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.f20508q);
        if (this.polyType == 0) {
            sb = new StringBuilder(" polyType=SIMPLE df=");
            i10 = this.f20507df;
        } else {
            sb = new StringBuilder(" polyType=PRODUCT df1=");
            sb.append(this.df1);
            sb.append(" df2=");
            sb.append(this.df2);
            sb.append(" df3=");
            i10 = this.df3;
        }
        sb.append(i10);
        sb2.append(sb.toString());
        sb2.append(" dm0=" + this.dm0 + " db=" + this.f20506db + " c=" + this.f20505c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f20508q);
        dataOutputStream.writeInt(this.f20507df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f20506db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f20505c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr, boolean z11, boolean z12, Digest digest) {
        this.N = i10;
        this.f20508q = i11;
        this.f20507df = i12;
        this.f20506db = i14;
        this.dm0 = i13;
        this.f20505c = i15;
        this.minCallsR = i16;
        this.minCallsMask = i17;
        this.hashSeed = z10;
        this.oid = bArr;
        this.sparse = z11;
        this.fastFp = z12;
        this.polyType = 0;
        this.hashAlg = digest;
        init();
    }

    public NTRUEncryptionParameters clone() {
        return this.polyType == 0 ? new NTRUEncryptionParameters(this.N, this.f20508q, this.f20507df, this.dm0, this.f20506db, this.f20505c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg)) : new NTRUEncryptionParameters(this.N, this.f20508q, this.df1, this.df2, this.df3, this.dm0, this.f20506db, this.f20505c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg));
    }

    public NTRUEncryptionParameters(InputStream inputStream) throws IOException {
        Digest sHA256Digest;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f20508q = dataInputStream.readInt();
        this.f20507df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f20506db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f20505c = dataInputStream.readInt();
        this.minCallsR = dataInputStream.readInt();
        this.minCallsMask = dataInputStream.readInt();
        this.hashSeed = dataInputStream.readBoolean();
        byte[] bArr = new byte[3];
        this.oid = bArr;
        dataInputStream.read(bArr);
        this.sparse = dataInputStream.readBoolean();
        this.fastFp = dataInputStream.readBoolean();
        this.polyType = dataInputStream.read();
        String utf = dataInputStream.readUTF();
        if (!"SHA-512".equals(utf)) {
            sHA256Digest = "SHA-256".equals(utf) ? new SHA256Digest() : sHA256Digest;
            init();
        }
        sHA256Digest = new SHA512Digest();
        this.hashAlg = sHA256Digest;
        init();
    }
}
