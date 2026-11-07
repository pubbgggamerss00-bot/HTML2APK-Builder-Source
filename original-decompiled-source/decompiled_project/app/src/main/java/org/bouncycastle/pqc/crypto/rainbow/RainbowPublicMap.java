package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
class RainbowPublicMap {
    private RainbowParameters params;
    private final int num_gf_elements = 256;

    /* renamed from: cf, reason: collision with root package name */
    private ComputeInField f20421cf = new ComputeInField();

    public RainbowPublicMap(RainbowParameters rainbowParameters) {
        this.params = rainbowParameters;
    }

    private short[] add_and_reduce(short[][] sArr) {
        int m10 = this.params.getM();
        short[] sArrAddVect = new short[m10];
        for (int i10 = 0; i10 < 8; i10++) {
            int iPow = (int) Math.pow(2.0d, i10);
            short[] sArrAddVect2 = new short[m10];
            for (int i11 = iPow; i11 < 256; i11 += iPow * 2) {
                for (int i12 = 0; i12 < iPow; i12++) {
                    sArrAddVect2 = this.f20421cf.addVect(sArrAddVect2, sArr[i11 + i12]);
                }
            }
            ComputeInField computeInField = this.f20421cf;
            sArrAddVect = computeInField.addVect(sArrAddVect, computeInField.multVect((short) iPow, sArrAddVect2));
        }
        return sArrAddVect;
    }

    private short[][] compute_accumulator(short[] sArr, short[] sArr2, short[][][] sArr3, int i10) {
        short[][] sArr4 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, i10);
        int length = sArr2.length;
        short[][] sArr5 = sArr3[0];
        if (length != sArr5.length || sArr.length != sArr5[0].length || sArr3.length != i10) {
            throw new RuntimeException("Accumulator calculation not possible!");
        }
        for (int i11 = 0; i11 < sArr2.length; i11++) {
            short[] sArrMultVect = this.f20421cf.multVect(sArr2[i11], sArr);
            for (int i12 = 0; i12 < sArr.length; i12++) {
                for (int i13 = 0; i13 < sArr3.length; i13++) {
                    short s10 = sArrMultVect[i12];
                    if (s10 != 0) {
                        short[] sArr6 = sArr4[s10];
                        sArr6[i13] = GF2Field.addElem(sArr6[i13], sArr3[i13][i11][i12]);
                    }
                }
            }
        }
        return sArr4;
    }

    public short[] publicMap(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        return add_and_reduce(compute_accumulator(sArr, sArr, rainbowPublicKeyParameters.pk, this.params.getM()));
    }

    public short[] publicMap_cyclic(RainbowPublicKeyParameters rainbowPublicKeyParameters, short[] sArr) {
        int v12 = this.params.getV1();
        int o12 = this.params.getO1();
        int o22 = this.params.getO2();
        short[][] sArr2 = (short[][]) Array.newInstance((Class<?>) Short.TYPE, 256, o12 + o22);
        short[] sArrCopyOfRange = Arrays.copyOfRange(sArr, 0, v12);
        int i10 = v12 + o12;
        short[] sArrCopyOfRange2 = Arrays.copyOfRange(sArr, v12, i10);
        short[] sArrCopyOfRange3 = Arrays.copyOfRange(sArr, i10, sArr.length);
        RainbowDRBG rainbowDRBG = new RainbowDRBG(rainbowPublicKeyParameters.pk_seed, rainbowPublicKeyParameters.getParameters().getHash_algo());
        short[][] sArrAddMatrix = this.f20421cf.addMatrix(this.f20421cf.addMatrix(this.f20421cf.addMatrix(this.f20421cf.addMatrix(this.f20421cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o12, v12, v12, true), o12), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o12, v12, o12, false), o12)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, rainbowPublicKeyParameters.l1_Q3, o12)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q5, o12)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, rainbowPublicKeyParameters.l1_Q6, o12)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l1_Q9, o12));
        short[][] sArrAddMatrix2 = this.f20421cf.addMatrix(this.f20421cf.addMatrix(this.f20421cf.addMatrix(this.f20421cf.addMatrix(this.f20421cf.addMatrix(compute_accumulator(sArrCopyOfRange, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o22, v12, v12, true), o22), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o22, v12, o12, false), o22)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange, RainbowUtil.generate_random(rainbowDRBG, o22, v12, o22, false), o22)), compute_accumulator(sArrCopyOfRange2, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o22, o12, o12, true), o22)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange2, RainbowUtil.generate_random(rainbowDRBG, o22, o12, o22, false), o22)), compute_accumulator(sArrCopyOfRange3, sArrCopyOfRange3, rainbowPublicKeyParameters.l2_Q9, o22));
        for (int i11 = 0; i11 < 256; i11++) {
            sArr2[i11] = Arrays.concatenate(sArrAddMatrix[i11], sArrAddMatrix2[i11]);
        }
        return add_and_reduce(sArr2);
    }
}
