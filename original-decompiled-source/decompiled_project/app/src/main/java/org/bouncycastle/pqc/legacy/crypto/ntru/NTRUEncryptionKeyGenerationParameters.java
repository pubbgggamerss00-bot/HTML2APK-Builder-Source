package org.bouncycastle.pqc.legacy.crypto.ntru;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.SecureRandom;
import java.util.Arrays;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.digests.SHA512Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;

/* loaded from: classes3.dex */
public class NTRUEncryptionKeyGenerationParameters extends KeyGenerationParameters implements Cloneable {
    public int N;
    public int bufferLenBits;
    int bufferLenTrits;

    /* renamed from: c, reason: collision with root package name */
    public int f20501c;

    /* renamed from: db, reason: collision with root package name */
    public int f20502db;

    /* renamed from: df, reason: collision with root package name */
    public int f20503df;
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
    public int f20504q;
    public boolean sparse;
    public static final NTRUEncryptionKeyGenerationParameters EES1087EP2 = new NTRUEncryptionKeyGenerationParameters(1087, 2048, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, CdexHeaderItem.DEBUG_INFO_OFFSETS_TABLE_OFFSET, 256, 13, 25, 14, true, new byte[]{0, 6, 3}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1171EP1 = new NTRUEncryptionKeyGenerationParameters(1171, 2048, 106, 106, 256, 13, 20, 15, true, new byte[]{0, 6, 4}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters EES1499EP1 = new NTRUEncryptionKeyGenerationParameters(1499, 2048, 79, 79, 256, 13, 17, 19, true, new byte[]{0, 6, 5}, true, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439 = new NTRUEncryptionKeyGenerationParameters(439, 2048, 146, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, false, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_439_FAST = new NTRUEncryptionKeyGenerationParameters(439, 2048, 9, 8, 5, 130, 128, 9, 32, 9, true, new byte[]{0, 7, 101}, true, true, new SHA256Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743 = new NTRUEncryptionKeyGenerationParameters(743, 2048, 248, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, false, new SHA512Digest());
    public static final NTRUEncryptionKeyGenerationParameters APR2011_743_FAST = new NTRUEncryptionKeyGenerationParameters(743, 2048, 11, 11, 15, 220, 256, 10, 27, 14, true, new byte[]{0, 7, 105}, false, true, new SHA512Digest());

    public NTRUEncryptionKeyGenerationParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, byte[] bArr, boolean z11, boolean z12, Digest digest) {
        this(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, z10, bArr, z11, z12, digest, null);
    }

    private void init() {
        this.dr = this.f20503df;
        this.dr1 = this.df1;
        this.dr2 = this.df2;
        this.dr3 = this.df3;
        int i10 = this.N;
        this.dg = i10 / 3;
        this.llen = 1;
        int i11 = this.f20502db;
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
        NTRUEncryptionKeyGenerationParameters nTRUEncryptionKeyGenerationParameters = (NTRUEncryptionKeyGenerationParameters) obj;
        if (this.N != nTRUEncryptionKeyGenerationParameters.N || this.bufferLenBits != nTRUEncryptionKeyGenerationParameters.bufferLenBits || this.bufferLenTrits != nTRUEncryptionKeyGenerationParameters.bufferLenTrits || this.f20501c != nTRUEncryptionKeyGenerationParameters.f20501c || this.f20502db != nTRUEncryptionKeyGenerationParameters.f20502db || this.f20503df != nTRUEncryptionKeyGenerationParameters.f20503df || this.df1 != nTRUEncryptionKeyGenerationParameters.df1 || this.df2 != nTRUEncryptionKeyGenerationParameters.df2 || this.df3 != nTRUEncryptionKeyGenerationParameters.df3 || this.dg != nTRUEncryptionKeyGenerationParameters.dg || this.dm0 != nTRUEncryptionKeyGenerationParameters.dm0 || this.dr != nTRUEncryptionKeyGenerationParameters.dr || this.dr1 != nTRUEncryptionKeyGenerationParameters.dr1 || this.dr2 != nTRUEncryptionKeyGenerationParameters.dr2 || this.dr3 != nTRUEncryptionKeyGenerationParameters.dr3 || this.fastFp != nTRUEncryptionKeyGenerationParameters.fastFp) {
            return false;
        }
        Digest digest = this.hashAlg;
        if (digest == null) {
            if (nTRUEncryptionKeyGenerationParameters.hashAlg != null) {
                return false;
            }
        } else if (!digest.getAlgorithmName().equals(nTRUEncryptionKeyGenerationParameters.hashAlg.getAlgorithmName())) {
            return false;
        }
        return this.hashSeed == nTRUEncryptionKeyGenerationParameters.hashSeed && this.llen == nTRUEncryptionKeyGenerationParameters.llen && this.maxMsgLenBytes == nTRUEncryptionKeyGenerationParameters.maxMsgLenBytes && this.minCallsMask == nTRUEncryptionKeyGenerationParameters.minCallsMask && this.minCallsR == nTRUEncryptionKeyGenerationParameters.minCallsR && Arrays.equals(this.oid, nTRUEncryptionKeyGenerationParameters.oid) && this.pkLen == nTRUEncryptionKeyGenerationParameters.pkLen && this.polyType == nTRUEncryptionKeyGenerationParameters.polyType && this.f20504q == nTRUEncryptionKeyGenerationParameters.f20504q && this.sparse == nTRUEncryptionKeyGenerationParameters.sparse;
    }

    public NTRUEncryptionParameters getEncryptionParameters() {
        return this.polyType == 0 ? new NTRUEncryptionParameters(this.N, this.f20504q, this.f20503df, this.dm0, this.f20502db, this.f20501c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg)) : new NTRUEncryptionParameters(this.N, this.f20504q, this.df1, this.df2, this.df3, this.dm0, this.f20502db, this.f20501c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg));
    }

    public int getMaxMessageLength() {
        return this.maxMsgLenBytes;
    }

    public int hashCode() {
        int i10 = (((((((((((((((((((((((((((((((this.N + 31) * 31) + this.bufferLenBits) * 31) + this.bufferLenTrits) * 31) + this.f20501c) * 31) + this.f20502db) * 31) + this.f20503df) * 31) + this.df1) * 31) + this.df2) * 31) + this.df3) * 31) + this.dg) * 31) + this.dm0) * 31) + this.dr) * 31) + this.dr1) * 31) + this.dr2) * 31) + this.dr3) * 31) + (this.fastFp ? 1231 : 1237)) * 31;
        Digest digest = this.hashAlg;
        return ((((((((Arrays.hashCode(this.oid) + ((((((((((((i10 + (digest == null ? 0 : digest.getAlgorithmName().hashCode())) * 31) + (this.hashSeed ? 1231 : 1237)) * 31) + this.llen) * 31) + this.maxMsgLenBytes) * 31) + this.minCallsMask) * 31) + this.minCallsR) * 31)) * 31) + this.pkLen) * 31) + this.polyType) * 31) + this.f20504q) * 31) + (this.sparse ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb;
        int i10;
        StringBuilder sb2 = new StringBuilder("EncryptionParameters(N=" + this.N + " q=" + this.f20504q);
        if (this.polyType == 0) {
            sb = new StringBuilder(" polyType=SIMPLE df=");
            i10 = this.f20503df;
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
        sb2.append(" dm0=" + this.dm0 + " db=" + this.f20502db + " c=" + this.f20501c + " minCallsR=" + this.minCallsR + " minCallsMask=" + this.minCallsMask + " hashSeed=" + this.hashSeed + " hashAlg=" + this.hashAlg + " oid=" + Arrays.toString(this.oid) + " sparse=" + this.sparse + ")");
        return sb2.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        dataOutputStream.writeInt(this.N);
        dataOutputStream.writeInt(this.f20504q);
        dataOutputStream.writeInt(this.f20503df);
        dataOutputStream.writeInt(this.df1);
        dataOutputStream.writeInt(this.df2);
        dataOutputStream.writeInt(this.df3);
        dataOutputStream.writeInt(this.f20502db);
        dataOutputStream.writeInt(this.dm0);
        dataOutputStream.writeInt(this.f20501c);
        dataOutputStream.writeInt(this.minCallsR);
        dataOutputStream.writeInt(this.minCallsMask);
        dataOutputStream.writeBoolean(this.hashSeed);
        dataOutputStream.write(this.oid);
        dataOutputStream.writeBoolean(this.sparse);
        dataOutputStream.writeBoolean(this.fastFp);
        dataOutputStream.write(this.polyType);
        dataOutputStream.writeUTF(this.hashAlg.getAlgorithmName());
    }

    public NTRUEncryptionKeyGenerationParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, boolean z10, byte[] bArr, boolean z11, boolean z12, Digest digest, SecureRandom secureRandom) {
        super(secureRandom != null ? secureRandom : CryptoServicesRegistrar.getSecureRandom(), i16);
        this.N = i10;
        this.f20504q = i11;
        this.df1 = i12;
        this.df2 = i13;
        this.df3 = i14;
        this.f20502db = i16;
        this.dm0 = i15;
        this.f20501c = i17;
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

    public NTRUEncryptionKeyGenerationParameters clone() {
        return this.polyType == 0 ? new NTRUEncryptionKeyGenerationParameters(this.N, this.f20504q, this.f20503df, this.dm0, this.f20502db, this.f20501c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg)) : new NTRUEncryptionKeyGenerationParameters(this.N, this.f20504q, this.df1, this.df2, this.df3, this.dm0, this.f20502db, this.f20501c, this.minCallsR, this.minCallsMask, this.hashSeed, this.oid, this.sparse, this.fastFp, DigestFactory.cloneDigest(this.hashAlg));
    }

    public NTRUEncryptionKeyGenerationParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr, boolean z11, boolean z12, Digest digest) {
        this(i10, i11, i12, i13, i14, i15, i16, i17, z10, bArr, z11, z12, digest, null);
    }

    public NTRUEncryptionKeyGenerationParameters(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr, boolean z11, boolean z12, Digest digest, SecureRandom secureRandom) {
        super(secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom, i14);
        this.N = i10;
        this.f20504q = i11;
        this.f20503df = i12;
        this.f20502db = i14;
        this.dm0 = i13;
        this.f20501c = i15;
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

    public NTRUEncryptionKeyGenerationParameters(InputStream inputStream) throws IOException {
        Digest sHA256Digest;
        super(CryptoServicesRegistrar.getSecureRandom(), -1);
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.N = dataInputStream.readInt();
        this.f20504q = dataInputStream.readInt();
        this.f20503df = dataInputStream.readInt();
        this.df1 = dataInputStream.readInt();
        this.df2 = dataInputStream.readInt();
        this.df3 = dataInputStream.readInt();
        this.f20502db = dataInputStream.readInt();
        this.dm0 = dataInputStream.readInt();
        this.f20501c = dataInputStream.readInt();
        this.minCallsR = dataInputStream.readInt();
        this.minCallsMask = dataInputStream.readInt();
        this.hashSeed = dataInputStream.readBoolean();
        byte[] bArr = new byte[3];
        this.oid = bArr;
        dataInputStream.readFully(bArr);
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
