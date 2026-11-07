package org.bouncycastle.crypto.prng;

import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Pack;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes2.dex */
public class VMPCRandomGenerator implements RandomGenerator {

    /* renamed from: n, reason: collision with root package name */
    private byte f20102n = 0;
    private byte[] P = {-69, 44, 98, Byte.MAX_VALUE, -75, -86, -44, RegisterType.LONG_HI, -127, -2, -78, -126, -53, -96, -95, 8, 24, 113, 86, -24, 73, 2, RegisterType.UNINIT_REF, -60, -34, 53, -91, -20, Byte.MIN_VALUE, RegisterType.REFERENCE, -72, 105, -38, 47, 117, -52, -94, 9, 54, 3, 97, 45, -3, -32, -35, 5, 67, -112, -83, -56, -31, -81, 87, -101, 76, -40, 81, -82, 80, -123, 60, 10, -28, -13, -100, 38, 35, 83, -55, -125, -105, 70, -79, -103, 100, 49, 119, -43, 29, -42, 120, -67, 94, -80, -118, 34, 56, -8, 104, 43, 42, -59, -45, -9, PSSSigner.TRAILER_IMPLICIT, 111, -33, 4, -27, -107, 62, 37, -122, -90, RegisterType.FLOAT, -113, -15, 36, RegisterType.DOUBLE_LO, -41, 64, -77, -49, 126, 6, 21, -102, 77, 28, -93, -37, 50, -110, 88, RegisterType.UNINIT_THIS, 39, -12, 89, -48, 78, 106, 23, 91, -84, -1, 7, -64, 101, 121, -4, -57, -51, 118, 66, 93, -25, 58, 52, 122, 48, 40, RegisterType.DOUBLE_HI, 115, 1, -7, -47, -46, 25, -23, -111, -71, 90, -19, 65, 109, -76, -61, -98, -65, 99, -6, 31, 51, 96, 71, -119, -16, -106, 26, 95, -109, 61, 55, 75, -39, -88, -63, 27, -10, 57, -117, -73, 12, 32, -50, -120, 110, -74, 116, -114, -115, 22, 41, -14, -121, -11, -21, 112, -29, -5, 85, -97, -58, 68, 74, 69, 125, -30, 107, 92, 108, 102, -87, -116, -18, -124, RegisterType.CONFLICTED, -89, 30, -99, -36, 103, 72, -70, 46, -26, -92, -85, 124, -108, 0, 33, -17, -22, -66, -54, 114, 79, 82, -104, 63, -62, 20, 123, 59, 84};

    /* renamed from: s, reason: collision with root package name */
    private byte f20103s = -66;

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(long j10) {
        addSeedMaterial(Pack.longToBigEndian(j10));
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr) {
        nextBytes(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void addSeedMaterial(byte[] bArr) {
        for (byte b10 : bArr) {
            byte[] bArr2 = this.P;
            byte b11 = this.f20103s;
            byte b12 = this.f20102n;
            byte b13 = bArr2[(b11 + bArr2[b12 & 255] + b10) & 255];
            this.f20103s = b13;
            byte b14 = bArr2[b12 & 255];
            bArr2[b12 & 255] = bArr2[b13 & 255];
            bArr2[b13 & 255] = b14;
            this.f20102n = (byte) ((b12 + 1) & 255);
        }
    }

    @Override // org.bouncycastle.crypto.prng.RandomGenerator
    public void nextBytes(byte[] bArr, int i10, int i11) {
        synchronized (this.P) {
            int i12 = i11 + i10;
            while (i10 != i12) {
                try {
                    byte[] bArr2 = this.P;
                    byte b10 = this.f20103s;
                    byte b11 = this.f20102n;
                    byte b12 = bArr2[(b10 + bArr2[b11 & 255]) & 255];
                    this.f20103s = b12;
                    bArr[i10] = bArr2[(bArr2[bArr2[b12 & 255] & 255] + 1) & 255];
                    byte b13 = bArr2[b11 & 255];
                    bArr2[b11 & 255] = bArr2[b12 & 255];
                    bArr2[b12 & 255] = b13;
                    this.f20102n = (byte) ((b11 + 1) & 255);
                    i10++;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
