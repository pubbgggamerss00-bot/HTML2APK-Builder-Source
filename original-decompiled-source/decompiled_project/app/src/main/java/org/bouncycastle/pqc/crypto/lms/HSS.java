package org.bouncycastle.pqc.crypto.lms;

import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;

/* loaded from: classes3.dex */
class HSS {

    public static class PlaceholderLMSPrivateKey extends LMSPrivateKeyParameters {
        public PlaceholderLMSPrivateKey(LMSigParameters lMSigParameters, LMOtsParameters lMOtsParameters, int i10, byte[] bArr, int i11, byte[] bArr2) {
            super(lMSigParameters, lMOtsParameters, i10, bArr, i11, bArr2);
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMOtsPrivateKey getNextOtsPrivateKey() {
            throw new RuntimeException("placeholder only");
        }

        @Override // org.bouncycastle.pqc.crypto.lms.LMSPrivateKeyParameters
        public LMSPublicKeyParameters getPublicKey() {
            throw new RuntimeException("placeholder only");
        }
    }

    public static HSSPrivateKeyParameters generateHSSKeyPair(HSSKeyGenerationParameters hSSKeyGenerationParameters) {
        byte[] bArr;
        int depth = hSSKeyGenerationParameters.getDepth();
        LMSPrivateKeyParameters[] lMSPrivateKeyParametersArr = new LMSPrivateKeyParameters[depth];
        LMSSignature[] lMSSignatureArr = new LMSSignature[hSSKeyGenerationParameters.getDepth() - 1];
        int i10 = 0;
        byte[] bArr2 = new byte[hSSKeyGenerationParameters.getLmsParameters()[0].getLMSigParam().getM()];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr2);
        byte[] bArr3 = new byte[16];
        hSSKeyGenerationParameters.getRandom().nextBytes(bArr3);
        byte[] bArr4 = new byte[0];
        long h10 = 1;
        while (i10 < depth) {
            if (i10 == 0) {
                lMSPrivateKeyParametersArr[i10] = new LMSPrivateKeyParameters(hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i10].getLMOTSParam(), 0, bArr3, 1 << hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam().getH(), bArr2);
                bArr = bArr4;
            } else {
                bArr = bArr4;
                lMSPrivateKeyParametersArr[i10] = new PlaceholderLMSPrivateKey(hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam(), hSSKeyGenerationParameters.getLmsParameters()[i10].getLMOTSParam(), -1, bArr, 1 << hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam().getH(), bArr4);
            }
            h10 *= 1 << hSSKeyGenerationParameters.getLmsParameters()[i10].getLMSigParam().getH();
            i10++;
            bArr4 = bArr;
        }
        if (h10 == 0) {
            h10 = Long.MAX_VALUE;
        }
        return new HSSPrivateKeyParameters(hSSKeyGenerationParameters.getDepth(), Arrays.asList(lMSPrivateKeyParametersArr), Arrays.asList(lMSSignatureArr), 0L, h10);
    }

    public static HSSSignature generateSignature(int i10, LMSContext lMSContext) {
        return new HSSSignature(i10 - 1, lMSContext.getSignedPubKeys(), LMS.generateSign(lMSContext));
    }

    public static void incrementIndex(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            rangeTestKeys(hSSPrivateKeyParameters);
            hSSPrivateKeyParameters.incIndex();
            hSSPrivateKeyParameters.getKeys().get(hSSPrivateKeyParameters.getL() - 1).incIndex();
        }
    }

    public static void rangeTestKeys(HSSPrivateKeyParameters hSSPrivateKeyParameters) {
        synchronized (hSSPrivateKeyParameters) {
            try {
                if (hSSPrivateKeyParameters.getIndex() >= hSSPrivateKeyParameters.getIndexLimit()) {
                    StringBuilder sb = new StringBuilder("hss private key");
                    sb.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                    sb.append(" is exhausted");
                    throw new ExhaustedPrivateKeyException(sb.toString());
                }
                int l10 = hSSPrivateKeyParameters.getL();
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                int i10 = l10;
                while (true) {
                    int i11 = i10 - 1;
                    if (keys.get(i11).getIndex() != (1 << keys.get(i11).getSigParameters().getH())) {
                        while (i10 < l10) {
                            hSSPrivateKeyParameters.replaceConsumedKey(i10);
                            i10++;
                        }
                    } else {
                        if (i11 == 0) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("hss private key");
                            sb2.append(hSSPrivateKeyParameters.isShard() ? " shard" : "");
                            sb2.append(" is exhausted the maximum limit for this HSS private key");
                            throw new ExhaustedPrivateKeyException(sb2.toString());
                        }
                        i10 = i11;
                    }
                }
            } finally {
            }
        }
    }

    public static boolean verifySignature(HSSPublicKeyParameters hSSPublicKeyParameters, HSSSignature hSSSignature, byte[] bArr) {
        int i10 = hSSSignature.getlMinus1();
        int i11 = i10 + 1;
        if (i11 != hSSPublicKeyParameters.getL()) {
            return false;
        }
        LMSSignature[] lMSSignatureArr = new LMSSignature[i11];
        LMSPublicKeyParameters[] lMSPublicKeyParametersArr = new LMSPublicKeyParameters[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            lMSSignatureArr[i12] = hSSSignature.getSignedPubKey()[i12].getSignature();
            lMSPublicKeyParametersArr[i12] = hSSSignature.getSignedPubKey()[i12].getPublicKey();
        }
        lMSSignatureArr[i10] = hSSSignature.getSignature();
        LMSPublicKeyParameters lMSPublicKey = hSSPublicKeyParameters.getLMSPublicKey();
        for (int i13 = 0; i13 < i10; i13++) {
            if (!LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i13], lMSPublicKeyParametersArr[i13].toByteArray())) {
                return false;
            }
            try {
                lMSPublicKey = lMSPublicKeyParametersArr[i13];
            } catch (Exception e10) {
                throw new IllegalStateException(e10.getMessage(), e10);
            }
        }
        return LMS.verifySignature(lMSPublicKey, lMSSignatureArr[i10], bArr);
    }

    public static HSSSignature generateSignature(HSSPrivateKeyParameters hSSPrivateKeyParameters, byte[] bArr) {
        LMSPrivateKeyParameters lMSPrivateKeyParameters;
        LMSSignedPubKey[] lMSSignedPubKeyArr;
        int l10 = hSSPrivateKeyParameters.getL();
        synchronized (hSSPrivateKeyParameters) {
            try {
                rangeTestKeys(hSSPrivateKeyParameters);
                List<LMSPrivateKeyParameters> keys = hSSPrivateKeyParameters.getKeys();
                List<LMSSignature> sig = hSSPrivateKeyParameters.getSig();
                int i10 = l10 - 1;
                lMSPrivateKeyParameters = hSSPrivateKeyParameters.getKeys().get(i10);
                lMSSignedPubKeyArr = new LMSSignedPubKey[i10];
                int i11 = 0;
                while (i11 < i10) {
                    int i12 = i11 + 1;
                    lMSSignedPubKeyArr[i11] = new LMSSignedPubKey(sig.get(i11), keys.get(i12).getPublicKey());
                    i11 = i12;
                }
                hSSPrivateKeyParameters.incIndex();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        LMSContext lMSContextWithSignedPublicKeys = lMSPrivateKeyParameters.generateLMSContext().withSignedPublicKeys(lMSSignedPubKeyArr);
        lMSContextWithSignedPublicKeys.update(bArr, 0, bArr.length);
        return generateSignature(l10, lMSContextWithSignedPublicKeys);
    }
}
