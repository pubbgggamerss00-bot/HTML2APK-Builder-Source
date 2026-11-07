package org.bouncycastle.pqc.legacy.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.GF2Field;
import org.bouncycastle.pqc.legacy.crypto.rainbow.util.RainbowUtil;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class Layer {
    private short[][][] coeff_alpha;
    private short[][][] coeff_beta;
    private short[] coeff_eta;
    private short[][] coeff_gamma;
    private int oi;
    private int vi;
    private int viNext;

    public Layer(byte b10, byte b11, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i10 = b10 & 255;
        this.vi = i10;
        int i11 = b11 & 255;
        this.viNext = i11;
        this.oi = i11 - i10;
        this.coeff_alpha = sArr;
        this.coeff_beta = sArr2;
        this.coeff_gamma = sArr3;
        this.coeff_eta = sArr4;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Layer)) {
            Layer layer = (Layer) obj;
            if (this.vi == layer.getVi() && this.viNext == layer.getViNext() && this.oi == layer.getOi() && RainbowUtil.equals(this.coeff_alpha, layer.getCoeffAlpha()) && RainbowUtil.equals(this.coeff_beta, layer.getCoeffBeta()) && RainbowUtil.equals(this.coeff_gamma, layer.getCoeffGamma()) && RainbowUtil.equals(this.coeff_eta, layer.getCoeffEta())) {
                return true;
            }
        }
        return false;
    }

    public short[][][] getCoeffAlpha() {
        return this.coeff_alpha;
    }

    public short[][][] getCoeffBeta() {
        return this.coeff_beta;
    }

    public short[] getCoeffEta() {
        return this.coeff_eta;
    }

    public short[][] getCoeffGamma() {
        return this.coeff_gamma;
    }

    public int getOi() {
        return this.oi;
    }

    public int getVi() {
        return this.vi;
    }

    public int getViNext() {
        return this.viNext;
    }

    public int hashCode() {
        return Arrays.hashCode(this.coeff_eta) + ((Arrays.hashCode(this.coeff_gamma) + ((Arrays.hashCode(this.coeff_beta) + ((Arrays.hashCode(this.coeff_alpha) + (((((this.vi * 37) + this.viNext) * 37) + this.oi) * 37)) * 37)) * 37)) * 37);
    }

    public short[][] plugInVinegars(short[] sArr) {
        int i10 = this.oi;
        int i11 = 0;
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, i10, i10 + 1);
        short[] sArr3 = new short[this.oi];
        for (int i12 = 0; i12 < this.oi; i12++) {
            for (int i13 = 0; i13 < this.vi; i13++) {
                for (int i14 = 0; i14 < this.vi; i14++) {
                    sArr3[i12] = GF2Field.addElem(sArr3[i12], GF2Field.multElem(GF2Field.multElem(this.coeff_beta[i12][i13][i14], sArr[i13]), sArr[i14]));
                }
            }
        }
        for (int i15 = 0; i15 < this.oi; i15++) {
            for (int i16 = 0; i16 < this.oi; i16++) {
                for (int i17 = 0; i17 < this.vi; i17++) {
                    short sMultElem = GF2Field.multElem(this.coeff_alpha[i15][i16][i17], sArr[i17]);
                    short[] sArr4 = sArr2[i15];
                    sArr4[i16] = GF2Field.addElem(sArr4[i16], sMultElem);
                }
            }
        }
        for (int i18 = 0; i18 < this.oi; i18++) {
            for (int i19 = 0; i19 < this.vi; i19++) {
                sArr3[i18] = GF2Field.addElem(sArr3[i18], GF2Field.multElem(this.coeff_gamma[i18][i19], sArr[i19]));
            }
        }
        for (int i20 = 0; i20 < this.oi; i20++) {
            for (int i21 = this.vi; i21 < this.viNext; i21++) {
                short[] sArr5 = sArr2[i20];
                int i22 = this.vi;
                sArr5[i21 - i22] = GF2Field.addElem(this.coeff_gamma[i20][i21], sArr5[i21 - i22]);
            }
        }
        for (int i23 = 0; i23 < this.oi; i23++) {
            sArr3[i23] = GF2Field.addElem(sArr3[i23], this.coeff_eta[i23]);
        }
        while (true) {
            int i24 = this.oi;
            if (i11 >= i24) {
                return sArr2;
            }
            sArr2[i11][i24] = sArr3[i11];
            i11++;
        }
    }

    public Layer(int i10, int i11, SecureRandom secureRandom) {
        this.vi = i10;
        this.viNext = i11;
        int i12 = i11 - i10;
        this.oi = i12;
        int[] iArr = {i12, i12, i10};
        Class cls = Short.TYPE;
        this.coeff_alpha = (short[][][]) Array.newInstance((Class<?>) cls, iArr);
        int i13 = this.oi;
        int i14 = this.vi;
        this.coeff_beta = (short[][][]) Array.newInstance((Class<?>) cls, i13, i14, i14);
        this.coeff_gamma = (short[][]) Array.newInstance((Class<?>) cls, this.oi, this.viNext);
        int i15 = this.oi;
        this.coeff_eta = new short[i15];
        for (int i16 = 0; i16 < i15; i16++) {
            for (int i17 = 0; i17 < this.oi; i17++) {
                for (int i18 = 0; i18 < this.vi; i18++) {
                    this.coeff_alpha[i16][i17][i18] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i19 = 0; i19 < i15; i19++) {
            for (int i20 = 0; i20 < this.vi; i20++) {
                for (int i21 = 0; i21 < this.vi; i21++) {
                    this.coeff_beta[i19][i20][i21] = (short) (secureRandom.nextInt() & 255);
                }
            }
        }
        for (int i22 = 0; i22 < i15; i22++) {
            for (int i23 = 0; i23 < this.viNext; i23++) {
                this.coeff_gamma[i22][i23] = (short) (secureRandom.nextInt() & 255);
            }
        }
        for (int i24 = 0; i24 < i15; i24++) {
            this.coeff_eta[i24] = (short) (secureRandom.nextInt() & 255);
        }
    }
}
