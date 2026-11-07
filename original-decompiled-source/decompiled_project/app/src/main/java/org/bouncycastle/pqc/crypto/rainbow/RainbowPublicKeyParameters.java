package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class RainbowPublicKeyParameters extends RainbowKeyParameters {
    short[][][] l1_Q3;
    short[][][] l1_Q5;
    short[][][] l1_Q6;
    short[][][] l1_Q9;
    short[][][] l2_Q9;
    short[][][] pk;
    byte[] pk_seed;

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr) {
        super(false, rainbowParameters);
        int m10 = rainbowParameters.getM();
        int n10 = rainbowParameters.getN();
        Version version = getParameters().getVersion();
        Version version2 = Version.CLASSIC;
        Class cls = Short.TYPE;
        if (version != version2) {
            this.pk_seed = Arrays.copyOfRange(bArr, 0, rainbowParameters.getLen_pkseed());
            this.l1_Q3 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getV1(), rainbowParameters.getO2());
            this.l1_Q5 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO1());
            this.l1_Q6 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO1(), rainbowParameters.getO2());
            this.l1_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO1(), rainbowParameters.getO2(), rainbowParameters.getO2());
            this.l2_Q9 = (short[][][]) Array.newInstance((Class<?>) cls, rainbowParameters.getO2(), rainbowParameters.getO2(), rainbowParameters.getO2());
            int len_pkseed = rainbowParameters.getLen_pkseed();
            int iLoadEncoded = len_pkseed + RainbowUtil.loadEncoded(this.l1_Q3, bArr, len_pkseed, false);
            int iLoadEncoded2 = iLoadEncoded + RainbowUtil.loadEncoded(this.l1_Q5, bArr, iLoadEncoded, true);
            int iLoadEncoded3 = iLoadEncoded2 + RainbowUtil.loadEncoded(this.l1_Q6, bArr, iLoadEncoded2, false);
            int iLoadEncoded4 = iLoadEncoded3 + RainbowUtil.loadEncoded(this.l1_Q9, bArr, iLoadEncoded3, true);
            if (iLoadEncoded4 + RainbowUtil.loadEncoded(this.l2_Q9, bArr, iLoadEncoded4, true) != bArr.length) {
                throw new IllegalArgumentException("unparsed data in key encoding");
            }
            return;
        }
        this.pk = (short[][][]) Array.newInstance((Class<?>) cls, m10, n10, n10);
        int i10 = 0;
        for (int i11 = 0; i11 < n10; i11++) {
            for (int i12 = 0; i12 < n10; i12++) {
                for (int i13 = 0; i13 < m10; i13++) {
                    short[][][] sArr = this.pk;
                    if (i11 > i12) {
                        sArr[i13][i11][i12] = 0;
                    } else {
                        sArr[i13][i11][i12] = (short) (bArr[i10] & 255);
                        i10++;
                    }
                }
            }
        }
    }

    public byte[] getEncoded() {
        return getParameters().getVersion() != Version.CLASSIC ? Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(Arrays.concatenate(this.pk_seed, RainbowUtil.getEncoded(this.l1_Q3, false)), RainbowUtil.getEncoded(this.l1_Q5, true)), RainbowUtil.getEncoded(this.l1_Q6, false)), RainbowUtil.getEncoded(this.l1_Q9, true)), RainbowUtil.getEncoded(this.l2_Q9, true)) : RainbowUtil.getEncoded(this.pk, true);
    }

    public short[][][] getPk() {
        return RainbowUtil.cloneArray(this.pk);
    }

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, byte[] bArr, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5) {
        super(false, rainbowParameters);
        this.pk_seed = (byte[]) bArr.clone();
        this.l1_Q3 = RainbowUtil.cloneArray(sArr);
        this.l1_Q5 = RainbowUtil.cloneArray(sArr2);
        this.l1_Q6 = RainbowUtil.cloneArray(sArr3);
        this.l1_Q9 = RainbowUtil.cloneArray(sArr4);
        this.l2_Q9 = RainbowUtil.cloneArray(sArr5);
    }

    public RainbowPublicKeyParameters(RainbowParameters rainbowParameters, short[][][] sArr, short[][][] sArr2, short[][][] sArr3, short[][][] sArr4, short[][][] sArr5, short[][][] sArr6, short[][][] sArr7, short[][][] sArr8, short[][][] sArr9, short[][][] sArr10, short[][][] sArr11, short[][][] sArr12) {
        super(false, rainbowParameters);
        int v12 = rainbowParameters.getV1();
        int o12 = rainbowParameters.getO1();
        int o22 = rainbowParameters.getO2();
        this.pk = (short[][][]) Array.newInstance((Class<?>) Short.TYPE, rainbowParameters.getM(), rainbowParameters.getN(), rainbowParameters.getN());
        for (int i10 = 0; i10 < o12; i10++) {
            for (int i11 = 0; i11 < v12; i11++) {
                System.arraycopy(sArr[i10][i11], 0, this.pk[i10][i11], 0, v12);
                System.arraycopy(sArr2[i10][i11], 0, this.pk[i10][i11], v12, o12);
                System.arraycopy(sArr3[i10][i11], 0, this.pk[i10][i11], v12 + o12, o22);
            }
            for (int i12 = 0; i12 < o12; i12++) {
                int i13 = i12 + v12;
                System.arraycopy(sArr4[i10][i12], 0, this.pk[i10][i13], v12, o12);
                System.arraycopy(sArr5[i10][i12], 0, this.pk[i10][i13], v12 + o12, o22);
            }
            for (int i14 = 0; i14 < o22; i14++) {
                System.arraycopy(sArr6[i10][i14], 0, this.pk[i10][i14 + v12 + o12], v12 + o12, o22);
            }
        }
        for (int i15 = 0; i15 < o22; i15++) {
            for (int i16 = 0; i16 < v12; i16++) {
                int i17 = i15 + o12;
                System.arraycopy(sArr7[i15][i16], 0, this.pk[i17][i16], 0, v12);
                System.arraycopy(sArr8[i15][i16], 0, this.pk[i17][i16], v12, o12);
                System.arraycopy(sArr9[i15][i16], 0, this.pk[i17][i16], v12 + o12, o22);
            }
            for (int i18 = 0; i18 < o12; i18++) {
                int i19 = i15 + o12;
                int i20 = i18 + v12;
                System.arraycopy(sArr10[i15][i18], 0, this.pk[i19][i20], v12, o12);
                System.arraycopy(sArr11[i15][i18], 0, this.pk[i19][i20], v12 + o12, o22);
            }
            for (int i21 = 0; i21 < o22; i21++) {
                System.arraycopy(sArr12[i15][i21], 0, this.pk[i15 + o12][i21 + v12 + o12], v12 + o12, o22);
            }
        }
    }
}
