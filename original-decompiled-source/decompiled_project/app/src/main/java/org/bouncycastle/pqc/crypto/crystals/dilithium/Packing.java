package org.bouncycastle.pqc.crypto.crystals.dilithium;

import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class Packing {
    public static byte[] packPublicKey(PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr = new byte[dilithiumEngine.getCryptoPublicKeyBytes() - 32];
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumK(); i10++) {
            System.arraycopy(polyVecK.getVectorIndex(i10).polyt1Pack(), 0, bArr, i10 * DilithiumEngine.DilithiumPolyT1PackedBytes, DilithiumEngine.DilithiumPolyT1PackedBytes);
        }
        return bArr;
    }

    public static byte[][] packSecretKey(byte[] bArr, byte[] bArr2, byte[] bArr3, PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, DilithiumEngine dilithiumEngine) {
        byte[][] bArr4 = new byte[6][];
        bArr4[0] = bArr;
        bArr4[1] = bArr3;
        bArr4[2] = bArr2;
        bArr4[3] = new byte[dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumL(); i10++) {
            polyVecL.getVectorIndex(i10).polyEtaPack(bArr4[3], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i10);
        }
        bArr4[4] = new byte[dilithiumEngine.getDilithiumK() * dilithiumEngine.getDilithiumPolyEtaPackedBytes()];
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumK(); i11++) {
            polyVecK2.getVectorIndex(i11).polyEtaPack(bArr4[4], dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i11);
        }
        bArr4[5] = new byte[dilithiumEngine.getDilithiumK() * DilithiumEngine.DilithiumPolyT0PackedBytes];
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumK(); i12++) {
            polyVecK.getVectorIndex(i12).polyt0Pack(bArr4[5], i12 * DilithiumEngine.DilithiumPolyT0PackedBytes);
        }
        return bArr4;
    }

    public static byte[] packSignature(byte[] bArr, PolyVecL polyVecL, PolyVecK polyVecK, DilithiumEngine dilithiumEngine) {
        byte[] bArr2 = new byte[dilithiumEngine.getCryptoBytes()];
        System.arraycopy(bArr, 0, bArr2, 0, dilithiumEngine.getDilithiumCTilde());
        int dilithiumCTilde = dilithiumEngine.getDilithiumCTilde();
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumL(); i10++) {
            System.arraycopy(polyVecL.getVectorIndex(i10).zPack(), 0, bArr2, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i10) + dilithiumCTilde, dilithiumEngine.getDilithiumPolyZPackedBytes());
        }
        int dilithiumL = (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes()) + dilithiumCTilde;
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumOmega() + dilithiumEngine.getDilithiumK(); i11++) {
            bArr2[dilithiumL + i11] = 0;
        }
        int i12 = 0;
        for (int i13 = 0; i13 < dilithiumEngine.getDilithiumK(); i13++) {
            for (int i14 = 0; i14 < 256; i14++) {
                if (polyVecK.getVectorIndex(i13).getCoeffIndex(i14) != 0) {
                    bArr2[i12 + dilithiumL] = (byte) i14;
                    i12++;
                }
            }
            bArr2[dilithiumEngine.getDilithiumOmega() + dilithiumL + i13] = (byte) i12;
        }
        return bArr2;
    }

    public static PolyVecK unpackPublicKey(PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int i10 = 0;
        while (i10 < dilithiumEngine.getDilithiumK()) {
            Poly vectorIndex = polyVecK.getVectorIndex(i10);
            int i11 = i10 * DilithiumEngine.DilithiumPolyT1PackedBytes;
            i10++;
            vectorIndex.polyt1Unpack(Arrays.copyOfRange(bArr, i11, (i10 * DilithiumEngine.DilithiumPolyT1PackedBytes) + 32));
        }
        return polyVecK;
    }

    public static void unpackSecretKey(PolyVecK polyVecK, PolyVecL polyVecL, PolyVecK polyVecK2, byte[] bArr, byte[] bArr2, byte[] bArr3, DilithiumEngine dilithiumEngine) {
        for (int i10 = 0; i10 < dilithiumEngine.getDilithiumL(); i10++) {
            polyVecL.getVectorIndex(i10).polyEtaUnpack(bArr2, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i10);
        }
        for (int i11 = 0; i11 < dilithiumEngine.getDilithiumK(); i11++) {
            polyVecK2.getVectorIndex(i11).polyEtaUnpack(bArr3, dilithiumEngine.getDilithiumPolyEtaPackedBytes() * i11);
        }
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumK(); i12++) {
            polyVecK.getVectorIndex(i12).polyt0Unpack(bArr, i12 * DilithiumEngine.DilithiumPolyT0PackedBytes);
        }
    }

    public static boolean unpackSignature(PolyVecL polyVecL, PolyVecK polyVecK, byte[] bArr, DilithiumEngine dilithiumEngine) {
        int dilithiumCTilde = dilithiumEngine.getDilithiumCTilde();
        int i10 = 0;
        while (i10 < dilithiumEngine.getDilithiumL()) {
            Poly vectorIndex = polyVecL.getVectorIndex(i10);
            int dilithiumPolyZPackedBytes = (dilithiumEngine.getDilithiumPolyZPackedBytes() * i10) + dilithiumCTilde;
            i10++;
            vectorIndex.zUnpack(Arrays.copyOfRange(bArr, dilithiumPolyZPackedBytes, (dilithiumEngine.getDilithiumPolyZPackedBytes() * i10) + dilithiumCTilde));
        }
        int dilithiumL = (dilithiumEngine.getDilithiumL() * dilithiumEngine.getDilithiumPolyZPackedBytes()) + dilithiumCTilde;
        int i11 = 0;
        for (int i12 = 0; i12 < dilithiumEngine.getDilithiumK(); i12++) {
            for (int i13 = 0; i13 < 256; i13++) {
                polyVecK.getVectorIndex(i12).setCoeffIndex(i13, 0);
            }
            if ((bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i12] & 255) < i11 || (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i12] & 255) > dilithiumEngine.getDilithiumOmega()) {
                return false;
            }
            for (int i14 = i11; i14 < (bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i12] & 255); i14++) {
                if (i14 > i11) {
                    int i15 = dilithiumL + i14;
                    if ((bArr[i15] & 255) <= (bArr[i15 - 1] & 255)) {
                        return false;
                    }
                }
                polyVecK.getVectorIndex(i12).setCoeffIndex(bArr[dilithiumL + i14] & 255, 1);
            }
            i11 = bArr[dilithiumEngine.getDilithiumOmega() + dilithiumL + i12];
        }
        while (i11 < dilithiumEngine.getDilithiumOmega()) {
            if ((bArr[dilithiumL + i11] & 255) != 0) {
                return false;
            }
            i11++;
        }
        return true;
    }
}
