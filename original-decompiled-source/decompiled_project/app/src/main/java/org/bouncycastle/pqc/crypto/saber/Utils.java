package org.bouncycastle.pqc.crypto.saber;

import org.bouncycastle.asn1.eac.CertificateBody;
import org.jf.dexlib2.analysis.RegisterType;

/* loaded from: classes3.dex */
class Utils {
    private final int SABER_EP;
    private final int SABER_ET;
    private final int SABER_KEYBYTES;
    private final int SABER_L;
    private final int SABER_N;
    private final int SABER_POLYBYTES;
    private final boolean usingEffectiveMasking;

    public Utils(SABEREngine sABEREngine) {
        this.SABER_N = sABEREngine.getSABER_N();
        this.SABER_L = sABEREngine.getSABER_L();
        this.SABER_ET = sABEREngine.getSABER_ET();
        this.SABER_POLYBYTES = sABEREngine.getSABER_POLYBYTES();
        this.SABER_EP = sABEREngine.getSABER_EP();
        this.SABER_KEYBYTES = sABEREngine.getSABER_KEYBYTES();
        this.usingEffectiveMasking = sABEREngine.usingEffectiveMasking;
    }

    private void BS2POLq(byte[] bArr, int i10, short[] sArr) {
        short s10 = 0;
        if (this.usingEffectiveMasking) {
            while (s10 < this.SABER_N / 2) {
                short s11 = (short) (s10 * 2);
                int i11 = ((short) (s10 * 3)) + i10;
                int i12 = bArr[i11] & 255;
                byte b10 = bArr[i11 + 1];
                sArr[s11] = (short) (i12 | ((b10 & RegisterType.DOUBLE_HI) << 8));
                sArr[s11 + 1] = (short) (((bArr[i11 + 2] & 255) << 4) | ((b10 >> 4) & 15));
                s10 = (short) (s10 + 1);
            }
            return;
        }
        while (s10 < this.SABER_N / 8) {
            short s12 = (short) (s10 * 8);
            int i13 = ((short) (s10 * 13)) + i10;
            int i14 = bArr[i13] & 255;
            byte b11 = bArr[i13 + 1];
            sArr[s12] = (short) (i14 | ((b11 & 31) << 8));
            int i15 = ((b11 >> 5) & 7) | ((bArr[i13 + 2] & 255) << 3);
            byte b12 = bArr[i13 + 3];
            sArr[s12 + 1] = (short) (i15 | ((b12 & 3) << 11));
            int i16 = (b12 >> 2) & 63;
            byte b13 = bArr[i13 + 4];
            sArr[s12 + 2] = (short) (i16 | ((b13 & Byte.MAX_VALUE) << 6));
            int i17 = ((b13 >> 7) & 1) | ((bArr[i13 + 5] & 255) << 1);
            byte b14 = bArr[i13 + 6];
            sArr[s12 + 3] = (short) (i17 | ((b14 & RegisterType.DOUBLE_HI) << 9));
            int i18 = ((b14 >> 4) & 15) | ((bArr[i13 + 7] & 255) << 4);
            byte b15 = bArr[i13 + 8];
            sArr[s12 + 4] = (short) (i18 | ((b15 & 1) << 12));
            int i19 = (b15 >> 1) & CertificateBody.profileType;
            byte b16 = bArr[i13 + 9];
            sArr[s12 + 5] = (short) (i19 | ((b16 & 63) << 7));
            int i20 = ((b16 >> 6) & 3) | ((bArr[i13 + 10] & 255) << 2);
            byte b17 = bArr[i13 + 11];
            sArr[s12 + 6] = (short) (i20 | ((b17 & 7) << 10));
            sArr[s12 + 7] = (short) (((bArr[i13 + 12] & 255) << 5) | ((b17 >> 3) & 31));
            s10 = (short) (s10 + 1);
        }
    }

    private void POLp2BS(byte[] bArr, int i10, short[] sArr) {
        for (short s10 = 0; s10 < this.SABER_N / 4; s10 = (short) (s10 + 1)) {
            short s11 = (short) (s10 * 4);
            int i11 = ((short) (s10 * 5)) + i10;
            short s12 = sArr[s11];
            bArr[i11] = (byte) (s12 & 255);
            short s13 = sArr[s11 + 1];
            bArr[i11 + 1] = (byte) (((s12 >> 8) & 3) | ((s13 & 63) << 2));
            int i12 = (s13 >> 6) & 15;
            short s14 = sArr[s11 + 2];
            bArr[i11 + 2] = (byte) (i12 | ((s14 & 15) << 4));
            short s15 = sArr[s11 + 3];
            bArr[i11 + 3] = (byte) (((s14 >> 4) & 63) | ((s15 & 3) << 6));
            bArr[i11 + 4] = (byte) ((s15 >> 2) & 255);
        }
    }

    private void POLq2BS(byte[] bArr, int i10, short[] sArr) {
        short s10 = 0;
        if (this.usingEffectiveMasking) {
            while (s10 < this.SABER_N / 2) {
                short s11 = (short) (s10 * 2);
                int i11 = ((short) (s10 * 3)) + i10;
                short s12 = sArr[s11];
                bArr[i11] = (byte) (s12 & 255);
                short s13 = sArr[s11 + 1];
                bArr[i11 + 1] = (byte) (((s12 >> 8) & 15) | ((s13 & 15) << 4));
                bArr[i11 + 2] = (byte) ((s13 >> 4) & 255);
                s10 = (short) (s10 + 1);
            }
            return;
        }
        while (s10 < this.SABER_N / 8) {
            short s14 = (short) (s10 * 8);
            int i12 = ((short) (s10 * 13)) + i10;
            short s15 = sArr[s14];
            bArr[i12] = (byte) (s15 & 255);
            short s16 = sArr[s14 + 1];
            bArr[i12 + 1] = (byte) (((s15 >> 8) & 31) | ((s16 & 7) << 5));
            bArr[i12 + 2] = (byte) ((s16 >> 3) & 255);
            int i13 = (s16 >> 11) & 3;
            short s17 = sArr[s14 + 2];
            bArr[i12 + 3] = (byte) (i13 | ((s17 & 63) << 2));
            int i14 = (s17 >> 6) & CertificateBody.profileType;
            short s18 = sArr[s14 + 3];
            bArr[i12 + 4] = (byte) (i14 | ((s18 & 1) << 7));
            bArr[i12 + 5] = (byte) ((s18 >> 1) & 255);
            int i15 = (s18 >> 9) & 15;
            short s19 = sArr[s14 + 4];
            bArr[i12 + 6] = (byte) (i15 | ((s19 & 15) << 4));
            bArr[i12 + 7] = (byte) ((s19 >> 4) & 255);
            int i16 = (s19 >> 12) & 1;
            short s20 = sArr[s14 + 5];
            bArr[i12 + 8] = (byte) (i16 | ((s20 & 127) << 1));
            int i17 = (s20 >> 7) & 63;
            short s21 = sArr[s14 + 6];
            bArr[i12 + 9] = (byte) (i17 | ((s21 & 3) << 6));
            bArr[i12 + 10] = (byte) ((s21 >> 2) & 255);
            short s22 = sArr[s14 + 7];
            bArr[i12 + 11] = (byte) (((s21 >> 10) & 7) | ((s22 & 31) << 3));
            bArr[i12 + 12] = (byte) ((s22 >> 5) & 255);
            s10 = (short) (s10 + 1);
        }
    }

    public void BS2POLT(byte[] bArr, int i10, short[] sArr) {
        int i11 = this.SABER_ET;
        short s10 = 0;
        if (i11 == 3) {
            while (s10 < this.SABER_N / 8) {
                short s11 = (short) (s10 * 8);
                int i12 = ((short) (s10 * 3)) + i10;
                byte b10 = bArr[i12];
                sArr[s11] = (short) (b10 & 7);
                sArr[s11 + 1] = (short) ((b10 >> 3) & 7);
                byte b11 = bArr[i12 + 1];
                sArr[s11 + 2] = (short) (((b10 >> 6) & 3) | ((b11 & 1) << 2));
                sArr[s11 + 3] = (short) ((b11 >> 1) & 7);
                sArr[s11 + 4] = (short) ((b11 >> 4) & 7);
                byte b12 = bArr[i12 + 2];
                sArr[s11 + 5] = (short) (((b11 >> 7) & 1) | ((b12 & 3) << 1));
                sArr[s11 + 6] = (short) ((b12 >> 2) & 7);
                sArr[s11 + 7] = (short) ((b12 >> 5) & 7);
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i11 == 4) {
            while (s10 < this.SABER_N / 2) {
                short s12 = (short) (s10 * 2);
                byte b13 = bArr[i10 + s10];
                sArr[s12] = (short) (b13 & RegisterType.DOUBLE_HI);
                sArr[s12 + 1] = (short) ((b13 >> 4) & 15);
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i11 == 6) {
            while (s10 < this.SABER_N / 4) {
                short s13 = (short) (s10 * 4);
                int i13 = ((short) (s10 * 3)) + i10;
                byte b14 = bArr[i13];
                sArr[s13] = (short) (b14 & 63);
                byte b15 = bArr[i13 + 1];
                sArr[s13 + 1] = (short) (((b14 >> 6) & 3) | ((b15 & RegisterType.DOUBLE_HI) << 2));
                byte b16 = bArr[i13 + 2];
                sArr[s13 + 2] = (short) (((b15 & 255) >> 4) | ((b16 & 3) << 4));
                sArr[s13 + 3] = (short) ((b16 & 255) >> 2);
                s10 = (short) (s10 + 1);
            }
        }
    }

    public void BS2POLVECp(byte[] bArr, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            BS2POLp(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b10, sArr[b10]);
        }
    }

    public void BS2POLVECq(byte[] bArr, int i10, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            BS2POLq(bArr, (this.SABER_POLYBYTES * b10) + i10, sArr[b10]);
        }
    }

    public void BS2POLmsg(byte[] bArr, short[] sArr) {
        for (byte b10 = 0; b10 < this.SABER_KEYBYTES; b10 = (byte) (b10 + 1)) {
            for (byte b11 = 0; b11 < 8; b11 = (byte) (b11 + 1)) {
                sArr[(b10 * 8) + b11] = (short) ((bArr[b10] >> b11) & 1);
            }
        }
    }

    public void BS2POLp(byte[] bArr, int i10, short[] sArr) {
        for (short s10 = 0; s10 < this.SABER_N / 4; s10 = (short) (s10 + 1)) {
            short s11 = (short) (s10 * 4);
            int i11 = ((short) (s10 * 5)) + i10;
            int i12 = bArr[i11] & 255;
            byte b10 = bArr[i11 + 1];
            sArr[s11] = (short) (i12 | ((b10 & 3) << 8));
            byte b11 = bArr[i11 + 2];
            sArr[s11 + 1] = (short) (((b10 >> 2) & 63) | ((b11 & RegisterType.DOUBLE_HI) << 6));
            int i13 = (b11 >> 4) & 15;
            byte b12 = bArr[i11 + 3];
            sArr[s11 + 2] = (short) (i13 | ((b12 & 63) << 4));
            sArr[s11 + 3] = (short) (((bArr[i11 + 4] & 255) << 2) | ((b12 >> 6) & 3));
        }
    }

    public void POLT2BS(byte[] bArr, int i10, short[] sArr) {
        int i11 = this.SABER_ET;
        short s10 = 0;
        if (i11 == 3) {
            while (s10 < this.SABER_N / 8) {
                short s11 = (short) (s10 * 8);
                int i12 = ((short) (s10 * 3)) + i10;
                int i13 = (sArr[s11] & 7) | ((sArr[s11 + 1] & 7) << 3);
                short s12 = sArr[s11 + 2];
                bArr[i12] = (byte) (i13 | ((s12 & 3) << 6));
                int i14 = ((s12 >> 2) & 1) | ((sArr[s11 + 3] & 7) << 1) | ((sArr[s11 + 4] & 7) << 4);
                short s13 = sArr[s11 + 5];
                bArr[i12 + 1] = (byte) (i14 | ((s13 & 1) << 7));
                bArr[i12 + 2] = (byte) (((sArr[s11 + 7] & 7) << 5) | ((s13 >> 1) & 3) | ((sArr[s11 + 6] & 7) << 2));
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i11 == 4) {
            while (s10 < this.SABER_N / 2) {
                short s14 = (short) (s10 * 2);
                bArr[i10 + s10] = (byte) (((sArr[s14 + 1] & 15) << 4) | (sArr[s14] & 15));
                s10 = (short) (s10 + 1);
            }
            return;
        }
        if (i11 == 6) {
            while (s10 < this.SABER_N / 4) {
                short s15 = (short) (s10 * 4);
                int i15 = ((short) (s10 * 3)) + i10;
                int i16 = sArr[s15] & 63;
                short s16 = sArr[s15 + 1];
                bArr[i15] = (byte) (i16 | ((s16 & 3) << 6));
                short s17 = sArr[s15 + 2];
                bArr[i15 + 1] = (byte) (((s16 >> 2) & 15) | ((s17 & 15) << 4));
                bArr[i15 + 2] = (byte) (((sArr[s15 + 3] & 63) << 2) | ((s17 >> 4) & 3));
                s10 = (short) (s10 + 1);
            }
        }
    }

    public void POLVECp2BS(byte[] bArr, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            POLp2BS(bArr, ((this.SABER_EP * this.SABER_N) / 8) * b10, sArr[b10]);
        }
    }

    public void POLVECq2BS(byte[] bArr, short[][] sArr) {
        for (byte b10 = 0; b10 < this.SABER_L; b10 = (byte) (b10 + 1)) {
            POLq2BS(bArr, this.SABER_POLYBYTES * b10, sArr[b10]);
        }
    }

    public void POLmsg2BS(byte[] bArr, short[] sArr) {
        for (byte b10 = 0; b10 < this.SABER_KEYBYTES; b10 = (byte) (b10 + 1)) {
            for (byte b11 = 0; b11 < 8; b11 = (byte) (b11 + 1)) {
                bArr[b10] = (byte) (bArr[b10] | ((sArr[(b10 * 8) + b11] & 1) << b11));
            }
        }
    }
}
