package org.bouncycastle.pqc.crypto.lms;

import androidx.datastore.preferences.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.b;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class LMSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private static CacheKey T1;
    private static CacheKey[] internedKeys;
    private final byte[] I;
    private final byte[] masterSecret;
    private final int maxCacheR;
    private final int maxQ;
    private final LMOtsParameters otsParameters;
    private final LMSigParameters parameters;
    private LMSPublicKeyParameters publicKey;

    /* renamed from: q, reason: collision with root package name */
    private int f20387q;
    private final Map<CacheKey, byte[]> tCache;
    private final Digest tDigest;

    public static class CacheKey {
        private final int index;

        public CacheKey(int i10) {
            this.index = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof CacheKey) && ((CacheKey) obj).index == this.index;
        }

        public int hashCode() {
            return this.index;
        }
    }

    static {
        CacheKey cacheKey = new CacheKey(1);
        T1 = cacheKey;
        CacheKey[] cacheKeyArr = new CacheKey[129];
        internedKeys = cacheKeyArr;
        cacheKeyArr[1] = cacheKey;
        int i10 = 2;
        while (true) {
            CacheKey[] cacheKeyArr2 = internedKeys;
            if (i10 >= cacheKeyArr2.length) {
                return;
            }
            cacheKeyArr2[i10] = new CacheKey(i10);
            i10++;
        }
    }

    private LMSPrivateKeyParameters(LMSPrivateKeyParameters lMSPrivateKeyParameters, int i10, int i11) {
        super(true);
        LMSigParameters lMSigParameters = lMSPrivateKeyParameters.parameters;
        this.parameters = lMSigParameters;
        this.otsParameters = lMSPrivateKeyParameters.otsParameters;
        this.f20387q = i10;
        this.I = lMSPrivateKeyParameters.I;
        this.maxQ = i11;
        this.masterSecret = lMSPrivateKeyParameters.masterSecret;
        this.maxCacheR = 1 << lMSigParameters.getH();
        this.tCache = lMSPrivateKeyParameters.tCache;
        this.tDigest = DigestUtil.getDigest(lMSigParameters);
        this.publicKey = lMSPrivateKeyParameters.publicKey;
    }

    private byte[] calcT(int i10) {
        int h10 = 1 << getSigParameters().getH();
        if (i10 >= h10) {
            LmsUtils.byteArray(getI(), this.tDigest);
            LmsUtils.u32str(i10, this.tDigest);
            LmsUtils.u16str((short) -32126, this.tDigest);
            LmsUtils.byteArray(LM_OTS.lms_ots_generatePublicKey(getOtsParameters(), getI(), i10 - h10, getMasterSecret()), this.tDigest);
            byte[] bArr = new byte[this.tDigest.getDigestSize()];
            this.tDigest.doFinal(bArr, 0);
            return bArr;
        }
        int i11 = i10 * 2;
        byte[] bArrFindT = findT(i11);
        byte[] bArrFindT2 = findT(i11 + 1);
        LmsUtils.byteArray(getI(), this.tDigest);
        LmsUtils.u32str(i10, this.tDigest);
        LmsUtils.u16str((short) -31869, this.tDigest);
        LmsUtils.byteArray(bArrFindT, this.tDigest);
        LmsUtils.byteArray(bArrFindT2, this.tDigest);
        byte[] bArr2 = new byte[this.tDigest.getDigestSize()];
        this.tDigest.doFinal(bArr2, 0);
        return bArr2;
    }

    public static LMSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th2;
        if (obj instanceof LMSPrivateKeyParameters) {
            return (LMSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("expected version 0 lms private key");
            }
            LMSigParameters parametersForType = LMSigParameters.getParametersForType(dataInputStream.readInt());
            LMOtsParameters parametersForType2 = LMOtsParameters.getParametersForType(dataInputStream.readInt());
            byte[] bArr = new byte[16];
            dataInputStream.readFully(bArr);
            int i10 = dataInputStream.readInt();
            int i11 = dataInputStream.readInt();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IllegalStateException("secret length less than zero");
            }
            if (i12 <= dataInputStream.available()) {
                byte[] bArr2 = new byte[i12];
                dataInputStream.readFully(bArr2);
                return new LMSPrivateKeyParameters(parametersForType, parametersForType2, i10, bArr, i11, bArr2);
            }
            throw new IOException("secret length exceeded " + dataInputStream.available());
        }
        if (!(obj instanceof byte[])) {
            if (obj instanceof InputStream) {
                return getInstance(Streams.readAll((InputStream) obj));
            }
            throw new IllegalArgumentException(z0.a(obj, "cannot parse "));
        }
        DataInputStream dataInputStream2 = null;
        try {
            DataInputStream dataInputStream3 = new DataInputStream(new ByteArrayInputStream((byte[]) obj));
            try {
                LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return lMSPrivateKeyParameters;
            } catch (Throwable th3) {
                th2 = th3;
                dataInputStream2 = dataInputStream3;
                if (dataInputStream2 == null) {
                    throw th2;
                }
                dataInputStream2.close();
                throw th2;
            }
        } catch (Throwable th4) {
            th2 = th4;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LMSPrivateKeyParameters lMSPrivateKeyParameters = (LMSPrivateKeyParameters) obj;
        if (this.f20387q != lMSPrivateKeyParameters.f20387q || this.maxQ != lMSPrivateKeyParameters.maxQ || !Arrays.areEqual(this.I, lMSPrivateKeyParameters.I)) {
            return false;
        }
        LMSigParameters lMSigParameters = this.parameters;
        if (lMSigParameters == null ? lMSPrivateKeyParameters.parameters != null : !lMSigParameters.equals(lMSPrivateKeyParameters.parameters)) {
            return false;
        }
        LMOtsParameters lMOtsParameters = this.otsParameters;
        if (lMOtsParameters == null ? lMSPrivateKeyParameters.otsParameters == null : lMOtsParameters.equals(lMSPrivateKeyParameters.otsParameters)) {
            return Arrays.areEqual(this.masterSecret, lMSPrivateKeyParameters.masterSecret);
        }
        return false;
    }

    public LMSPrivateKeyParameters extractKeyShard(int i10) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        synchronized (this) {
            try {
                int i11 = this.f20387q;
                if (i11 + i10 >= this.maxQ) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining");
                }
                lMSPrivateKeyParameters = new LMSPrivateKeyParameters(this, i11, i11 + i10);
                this.f20387q += i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters;
    }

    public byte[] findT(int i10) {
        if (i10 >= this.maxCacheR) {
            return calcT(i10);
        }
        CacheKey[] cacheKeyArr = internedKeys;
        return findT(i10 < cacheKeyArr.length ? cacheKeyArr[i10] : new CacheKey(i10));
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        int h10 = getSigParameters().getH();
        int index = getIndex();
        LMOtsPrivateKey nextOtsPrivateKey = getNextOtsPrivateKey();
        int i10 = (1 << h10) + index;
        byte[][] bArr = new byte[h10][];
        for (int i11 = 0; i11 < h10; i11++) {
            bArr[i11] = findT((i10 / (1 << i11)) ^ 1);
        }
        return nextOtsPrivateKey.getSignatureContext(getSigParameters(), bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return LMS.generateSign(lMSContext).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(b.a(e10, new StringBuilder("unable to encode signature: ")), e10);
        }
    }

    public LMOtsPrivateKey getCurrentOTSKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i10 = this.f20387q;
                if (i10 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private keys expired");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.I, i10, this.masterSecret);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMOtsPrivateKey;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public byte[] getEncoded() throws IOException {
        return Composer.compose().u32str(0).u32str(this.parameters.getType()).u32str(this.otsParameters.getType()).bytes(this.I).u32str(this.f20387q).u32str(this.maxQ).u32str(this.masterSecret.length).bytes(this.masterSecret).build();
    }

    public byte[] getI() {
        return Arrays.clone(this.I);
    }

    public synchronized int getIndex() {
        return this.f20387q;
    }

    public byte[] getMasterSecret() {
        return Arrays.clone(this.masterSecret);
    }

    public LMOtsPrivateKey getNextOtsPrivateKey() {
        LMOtsPrivateKey lMOtsPrivateKey;
        synchronized (this) {
            try {
                int i10 = this.f20387q;
                if (i10 >= this.maxQ) {
                    throw new ExhaustedPrivateKeyException("ots private key exhausted");
                }
                lMOtsPrivateKey = new LMOtsPrivateKey(this.otsParameters, this.I, i10, this.masterSecret);
                incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMOtsPrivateKey;
    }

    public LMOtsParameters getOtsParameters() {
        return this.otsParameters;
    }

    public LMSPublicKeyParameters getPublicKey() {
        LMSPublicKeyParameters lMSPublicKeyParameters;
        synchronized (this) {
            try {
                if (this.publicKey == null) {
                    this.publicKey = new LMSPublicKeyParameters(this.parameters, this.otsParameters, findT(T1), this.I);
                }
                lMSPublicKeyParameters = this.publicKey;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPublicKeyParameters;
    }

    public LMSigParameters getSigParameters() {
        return this.parameters;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.maxQ - getIndex();
    }

    public int hashCode() {
        int iHashCode = (Arrays.hashCode(this.I) + (this.f20387q * 31)) * 31;
        LMSigParameters lMSigParameters = this.parameters;
        int iHashCode2 = (iHashCode + (lMSigParameters != null ? lMSigParameters.hashCode() : 0)) * 31;
        LMOtsParameters lMOtsParameters = this.otsParameters;
        return Arrays.hashCode(this.masterSecret) + ((((iHashCode2 + (lMOtsParameters != null ? lMOtsParameters.hashCode() : 0)) * 31) + this.maxQ) * 31);
    }

    public synchronized void incIndex() {
        this.f20387q++;
    }

    public LMSPrivateKeyParameters(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i10, byte[] bArr, int i11, byte[] bArr2) {
        super(true);
        this.parameters = lMSigParameters;
        this.otsParameters = lMOtsParameters;
        this.f20387q = i10;
        this.I = Arrays.clone(bArr);
        this.maxQ = i11;
        this.masterSecret = Arrays.clone(bArr2);
        this.maxCacheR = 1 << (lMSigParameters.getH() + 1);
        this.tCache = new WeakHashMap();
        this.tDigest = DigestUtil.getDigest(lMSigParameters);
    }

    private byte[] findT(CacheKey cacheKey) {
        byte[] bArrCalcT;
        synchronized (this.tCache) {
            try {
                bArrCalcT = this.tCache.get(cacheKey);
                if (bArrCalcT == null) {
                    bArrCalcT = calcT(cacheKey.index);
                    this.tCache.put(cacheKey, bArrCalcT);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrCalcT;
    }

    public static LMSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        LMSPrivateKeyParameters lMSPrivateKeyParameters = getInstance(bArr);
        lMSPrivateKeyParameters.publicKey = LMSPublicKeyParameters.getInstance(bArr2);
        return lMSPrivateKeyParameters;
    }
}
