package org.bouncycastle.pqc.crypto.lms;

import androidx.datastore.preferences.protobuf.z0;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.b;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes3.dex */
public class HSSPrivateKeyParameters extends LMSKeyParameters implements LMSContextBasedSigner {
    private long index;
    private final long indexLimit;
    private final boolean isShard;
    private List<LMSPrivateKeyParameters> keys;

    /* renamed from: l, reason: collision with root package name */
    private final int f20379l;
    private HSSPublicKeyParameters publicKey;
    private List<LMSSignature> sig;

    public HSSPrivateKeyParameters(int i10, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j10, long j11) throws IllegalArgumentException {
        super(true);
        this.index = 0L;
        this.f20379l = i10;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j10;
        this.indexLimit = j11;
        this.isShard = false;
        resetKeyToIndex();
    }

    public static HSSPrivateKeyParameters getInstance(Object obj) throws Throwable {
        Throwable th2;
        if (obj instanceof HSSPrivateKeyParameters) {
            return (HSSPrivateKeyParameters) obj;
        }
        if (obj instanceof DataInputStream) {
            DataInputStream dataInputStream = (DataInputStream) obj;
            if (dataInputStream.readInt() != 0) {
                throw new IllegalStateException("unknown version for hss private key");
            }
            int i10 = dataInputStream.readInt();
            long j10 = dataInputStream.readLong();
            long j11 = dataInputStream.readLong();
            boolean z10 = dataInputStream.readBoolean();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(LMSPrivateKeyParameters.getInstance(obj));
            }
            for (int i12 = 0; i12 < i10 - 1; i12++) {
                arrayList2.add(LMSSignature.getInstance(obj));
            }
            return new HSSPrivateKeyParameters(i10, arrayList, arrayList2, j10, j11, z10);
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
                HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(dataInputStream3);
                dataInputStream3.close();
                return hSSPrivateKeyParameters;
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

    private static HSSPrivateKeyParameters makeCopy(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        try {
            return getInstance(hSSPrivateKeyParameters.getEncoded());
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage(), e10);
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return makeCopy(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HSSPrivateKeyParameters hSSPrivateKeyParameters = (HSSPrivateKeyParameters) obj;
        if (this.f20379l == hSSPrivateKeyParameters.f20379l && this.isShard == hSSPrivateKeyParameters.isShard && this.indexLimit == hSSPrivateKeyParameters.indexLimit && this.index == hSSPrivateKeyParameters.index && this.keys.equals(hSSPrivateKeyParameters.keys)) {
            return this.sig.equals(hSSPrivateKeyParameters.sig);
        }
        return false;
    }

    public HSSPrivateKeyParameters extractKeyShard(int i10) {
        HSSPrivateKeyParameters hSSPrivateKeyParametersMakeCopy;
        synchronized (this) {
            try {
                long j10 = i10;
                if (getUsagesRemaining() < j10) {
                    throw new IllegalArgumentException("usageCount exceeds usages remaining in current leaf");
                }
                long j11 = this.index;
                this.index = j10 + j11;
                hSSPrivateKeyParametersMakeCopy = makeCopy(new HSSPrivateKeyParameters(this.f20379l, new ArrayList(getKeys()), new ArrayList(getSig()), j11, j11 + j10, true));
                resetKeyToIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return hSSPrivateKeyParametersMakeCopy;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public LMSContext generateLMSContext() {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l10 = getL();
        synchronized (this) {
            try {
                HSS.rangeTestKeys(this);
                List<LMSPrivateKeyParameters> keys = getKeys();
                List<LMSSignature> sig = getSig();
                int i10 = l10 - 1;
                lMSPrivateKeyParameters = getKeys().get(i10);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i10];
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    lMSSignedPubKeyArr[i11] = new LMSSignedPubKey(sig.get(i11), keys.get(i12).getPublicKey());
                    i11 = i12;
                }
                incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public byte[] generateSignature(LMSContext lMSContext) {
        try {
            return HSS.generateSignature(getL(), lMSContext).getEncoded();
        } catch (IOException e10) {
            throw new IllegalStateException(b.a(e10, new StringBuilder("unable to encode signature: ")), e10);
        }
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSKeyParameters, org.bouncycastle.util.Encodable
    public synchronized byte[] getEncoded() throws IOException {
        Composer composerBool;
        try {
            composerBool = Composer.compose().u32str(0).u32str(this.f20379l).u64str(this.index).u64str(this.indexLimit).bool(this.isShard);
            Iterator<LMSPrivateKeyParameters> it = this.keys.iterator();
            while (it.hasNext()) {
                composerBool.bytes(it.next());
            }
            Iterator<LMSSignature> it2 = this.sig.iterator();
            while (it2.hasNext()) {
                composerBool.bytes(it2.next());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return composerBool.build();
    }

    public synchronized long getIndex() {
        return this.index;
    }

    public long getIndexLimit() {
        return this.indexLimit;
    }

    public synchronized List<LMSPrivateKeyParameters> getKeys() {
        return this.keys;
    }

    public int getL() {
        return this.f20379l;
    }

    public synchronized LMSParameters[] getLMSParameters() {
        LMSParameters[] lMSParametersArr;
        int size = this.keys.size();
        lMSParametersArr = new LMSParameters[size];
        for (int i10 = 0; i10 < size; i10++) {
            LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i10);
            lMSParametersArr[i10] = new LMSParameters(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters());
        }
        return lMSParametersArr;
    }

    public synchronized HSSPublicKeyParameters getPublicKey() {
        return new HSSPublicKeyParameters(this.f20379l, getRootKey().getPublicKey());
    }

    public LMSPrivateKeyParameters getRootKey() {
        return this.keys.get(0);
    }

    public synchronized List<LMSSignature> getSig() {
        return this.sig;
    }

    @Override // org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner
    public long getUsagesRemaining() {
        return this.indexLimit - this.index;
    }

    public int hashCode() {
        int iHashCode = (this.sig.hashCode() + ((this.keys.hashCode() + (((this.f20379l * 31) + (this.isShard ? 1 : 0)) * 31)) * 31)) * 31;
        long j10 = this.indexLimit;
        int i10 = (iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.index;
        return i10 + ((int) (j11 ^ (j11 >>> 32)));
    }

    public synchronized void incIndex() {
        this.index++;
    }

    public boolean isShard() {
        return this.isShard;
    }

    public void replaceConsumedKey(int i10) {
        int i11 = i10 - 1;
        LMOtsPrivateKey currentOTSKey = this.keys.get(i11).getCurrentOTSKey();
        int n10 = currentOTSKey.getParameter().getN();
        SeedDerive derivationFunction = currentOTSKey.getDerivationFunction();
        derivationFunction.setJ(-2);
        byte[] bArr = new byte[n10];
        derivationFunction.deriveSeed(bArr, true);
        byte[] bArr2 = new byte[n10];
        derivationFunction.deriveSeed(bArr2, false);
        byte[] bArr3 = new byte[16];
        System.arraycopy(bArr2, 0, bArr3, 0, 16);
        ArrayList arrayList = new ArrayList(this.keys);
        LMSPrivateKeyParameters lMSPrivateKeyParameters = this.keys.get(i10);
        arrayList.set(i10, LMS.generateKeys(lMSPrivateKeyParameters.getSigParameters(), lMSPrivateKeyParameters.getOtsParameters(), 0, bArr3, bArr));
        ArrayList arrayList2 = new ArrayList(this.sig);
        arrayList2.set(i11, LMS.generateSign((LMSPrivateKeyParameters) arrayList.get(i11), ((LMSPrivateKeyParameters) arrayList.get(i10)).getPublicKey().toByteArray()));
        this.keys = Collections.unmodifiableList(arrayList);
        this.sig = Collections.unmodifiableList(arrayList2);
    }

    public void resetKeyToIndex() throws IllegalArgumentException {
        boolean z10;
        List<LMSPrivateKeyParameters> keys = getKeys();
        int size = keys.size();
        long[] jArr = new long[size];
        long index = getIndex();
        for (int size2 = keys.size() - 1; size2 >= 0; size2--) {
            LMSigParameters sigParameters = keys.get(size2).getSigParameters();
            jArr[size2] = ((1 << sigParameters.getH()) - 1) & index;
            index >>>= sigParameters.getH();
        }
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = (LMSPrivateKeyParameters[]) keys.toArray(new LMSPrivateKeyParameters[keys.size()]);
        List<LMSSignature> list = this.sig;
        LMSSignature[] lMSSignatureArr = (LMSSignature[]) list.toArray(new LMSSignature[list.size()]);
        LMSPrivateKeyParameters rootKey = getRootKey();
        if (lMSPrivateKeyParametersArr[0].getIndex() - 1 != jArr[0]) {
            lMSPrivateKeyParametersArr[0] = LMS.generateKeys(rootKey.getSigParameters(), rootKey.getOtsParameters(), (int) jArr[0], rootKey.getI(), rootKey.getMasterSecret());
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = 1;
        while (i10 < size) {
            int i11 = i10 - 1;
            LMSPrivateKeyParameters lMSPrivateKeyParameters = lMSPrivateKeyParametersArr[i11];
            int n10 = lMSPrivateKeyParameters.getOtsParameters().getN();
            byte[] bArr = new byte[16];
            byte[] bArr2 = new byte[n10];
            SeedDerive seedDerive = new SeedDerive(lMSPrivateKeyParameters.getI(), lMSPrivateKeyParameters.getMasterSecret(), DigestUtil.getDigest(lMSPrivateKeyParameters.getOtsParameters()));
            seedDerive.setQ((int) jArr[i11]);
            seedDerive.setJ(-2);
            seedDerive.deriveSeed(bArr2, true);
            byte[] bArr3 = new byte[n10];
            seedDerive.deriveSeed(bArr3, false);
            System.arraycopy(bArr3, 0, bArr, 0, 16);
            boolean z11 = i10 >= size + (-1) ? jArr[i10] == ((long) lMSPrivateKeyParametersArr[i10].getIndex()) : jArr[i10] == ((long) (lMSPrivateKeyParametersArr[i10].getIndex() - 1));
            if (!Arrays.areEqual(bArr, lMSPrivateKeyParametersArr[i10].getI()) || !Arrays.areEqual(bArr2, lMSPrivateKeyParametersArr[i10].getMasterSecret())) {
                LMSPrivateKeyParameters lMSPrivateKeyParametersGenerateKeys = LMS.generateKeys(keys.get(i10).getSigParameters(), keys.get(i10).getOtsParameters(), (int) jArr[i10], bArr, bArr2);
                lMSPrivateKeyParametersArr[i10] = lMSPrivateKeyParametersGenerateKeys;
                lMSSignatureArr[i11] = LMS.generateSign(lMSPrivateKeyParametersArr[i11], lMSPrivateKeyParametersGenerateKeys.getPublicKey().toByteArray());
            } else if (z11) {
                i10++;
            } else {
                lMSPrivateKeyParametersArr[i10] = LMS.generateKeys(keys.get(i10).getSigParameters(), keys.get(i10).getOtsParameters(), (int) jArr[i10], bArr, bArr2);
            }
            z10 = true;
            i10++;
        }
        if (z10) {
            updateHierarchy(lMSPrivateKeyParametersArr, lMSSignatureArr);
        }
    }

    public void updateHierarchy(LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr, LMSSignature[] lMSSignatureArr) {
        synchronized (this) {
            this.keys = Collections.unmodifiableList(java.util.Arrays.asList(lMSPrivateKeyParametersArr));
            this.sig = Collections.unmodifiableList(java.util.Arrays.asList(lMSSignatureArr));
        }
    }

    private HSSPrivateKeyParameters(int i10, List<LMSPrivateKeyParameters> list, List<LMSSignature> list2, long j10, long j11, boolean z10) {
        super(true);
        this.index = 0L;
        this.f20379l = i10;
        this.keys = Collections.unmodifiableList(list);
        this.sig = Collections.unmodifiableList(list2);
        this.index = j10;
        this.indexLimit = j11;
        this.isShard = z10;
    }

    public static HSSPrivateKeyParameters getInstance(byte[] bArr, byte[] bArr2) throws Throwable {
        HSSPrivateKeyParameters hSSPrivateKeyParameters = getInstance(bArr);
        hSSPrivateKeyParameters.publicKey = HSSPublicKeyParameters.getInstance(bArr2);
        return hSSPrivateKeyParameters;
    }
}
