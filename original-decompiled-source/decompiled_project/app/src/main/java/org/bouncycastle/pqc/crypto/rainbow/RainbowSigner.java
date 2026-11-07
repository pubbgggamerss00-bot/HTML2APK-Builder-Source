package org.bouncycastle.pqc.crypto.rainbow;

import java.lang.reflect.Array;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class RainbowSigner implements MessageSigner {
    private static final int MAXITS = 65536;

    /* renamed from: cf, reason: collision with root package name */
    private ComputeInField f20422cf = new ComputeInField();
    private Digest hashAlgo;
    private RainbowKeyParameters key;
    private SecureRandom random;
    int signableDocumentLength;
    private Version version;

    /* renamed from: org.bouncycastle.pqc.crypto.rainbow.RainbowSigner$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version;

        static {
            int[] iArr = new int[Version.values().length];
            $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version = iArr;
            try {
                iArr[Version.CLASSIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.CIRCUMZENITHAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[Version.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private byte[] genSignature(byte[] bArr) throws RuntimeException {
        short[] sArr;
        int i10;
        int i11;
        int i12;
        int i13;
        byte[] bArr2 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr2, 0);
        int v12 = this.key.getParameters().getV1();
        int o12 = this.key.getParameters().getO1();
        int o22 = this.key.getParameters().getO2();
        int m10 = this.key.getParameters().getM();
        int n10 = this.key.getParameters().getN();
        RainbowPrivateKeyParameters rainbowPrivateKeyParameters = (RainbowPrivateKeyParameters) this.key;
        Digest digest = this.hashAlgo;
        this.random = new RainbowDRBG(RainbowUtil.hash(digest, rainbowPrivateKeyParameters.sk_seed, bArr2, new byte[digest.getDigestSize()]), rainbowPrivateKeyParameters.getParameters().getHash_algo());
        short[] sArr2 = new short[v12];
        short[] sArr3 = new short[o12];
        short[] sArr4 = new short[o22];
        Class cls = Short.TYPE;
        short[][] sArr5 = (short[][]) Array.newInstance((Class<?>) cls, o22, o12);
        int i14 = 0;
        short[][] sArr6 = (short[][]) Array.newInstance((Class<?>) cls, o22, o22);
        byte[] bArr3 = new byte[rainbowPrivateKeyParameters.getParameters().getLen_salt()];
        short[] sArr7 = new short[m10];
        short[] sArr8 = new short[o12];
        short[] sArr9 = new short[o22];
        int i15 = 0;
        short[][] sArrInverse = null;
        while (sArrInverse == null && i15 < 65536) {
            byte[] bArr4 = new byte[v12];
            this.random.nextBytes(bArr4);
            int i16 = 0;
            while (true) {
                i12 = i15;
                if (i16 >= v12) {
                    break;
                }
                sArr2[i16] = (short) (bArr4[i16] & 255);
                i16++;
                i15 = i12;
            }
            short[][] sArr10 = (short[][]) Array.newInstance((Class<?>) cls, o12, o12);
            int i17 = 0;
            while (i17 < v12) {
                int i18 = 0;
                while (true) {
                    i13 = i17;
                    if (i18 < o12) {
                        int i19 = 0;
                        while (i19 < o12) {
                            int i20 = i19;
                            int i21 = i18;
                            short sMultElem = GF2Field.multElem(rainbowPrivateKeyParameters.l1_F2[i18][i13][i20], sArr2[i13]);
                            short[] sArr11 = sArr10[i21];
                            sArr11[i20] = GF2Field.addElem(sArr11[i20], sMultElem);
                            i19 = i20 + 1;
                            i18 = i21;
                        }
                        i18++;
                        i17 = i13;
                    }
                }
                i17 = i13 + 1;
            }
            sArrInverse = this.f20422cf.inverse(sArr10);
            i15 = i12 + 1;
        }
        int i22 = i15;
        int i23 = 0;
        while (i23 < o12) {
            int i24 = i23;
            sArr3[i24] = this.f20422cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l1_F1[i24], sArr2);
            i23 = i24 + 1;
        }
        int i25 = 0;
        while (i25 < v12) {
            int i26 = 0;
            while (true) {
                i11 = i25;
                if (i26 < o22) {
                    int i27 = i26;
                    sArr4[i27] = this.f20422cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F1[i27], sArr2);
                    int i28 = 0;
                    while (i28 < o12) {
                        int i29 = i28;
                        short sMultElem2 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F2[i27][i11][i28], sArr2[i11]);
                        short[] sArr12 = sArr5[i27];
                        sArr12[i29] = GF2Field.addElem(sArr12[i29], sMultElem2);
                        i28 = i29 + 1;
                    }
                    int i30 = 0;
                    while (i30 < o22) {
                        int i31 = i30;
                        short sMultElem3 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F3[i27][i11][i30], sArr2[i11]);
                        short[] sArr13 = sArr6[i27];
                        sArr13[i31] = GF2Field.addElem(sArr13[i31], sMultElem3);
                        i30 = i31 + 1;
                    }
                    i26 = i27 + 1;
                    i25 = i11;
                }
            }
            i25 = i11 + 1;
        }
        byte[] bArr5 = new byte[m10];
        short[] sArr14 = sArr8;
        short[] sArrSolveEquation = null;
        int i32 = i22;
        while (true) {
            sArr = sArr2;
            if (sArrSolveEquation != null || i32 >= 65536) {
                break;
            }
            int[] iArr = new int[2];
            iArr[1] = o22;
            iArr[i14] = o22;
            short[][] sArr15 = (short[][]) Array.newInstance((Class<?>) cls, iArr);
            this.random.nextBytes(bArr3);
            short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr2, bArr3, bArr5));
            byte[] bArr6 = bArr2;
            byte[] bArr7 = bArr5;
            Class cls2 = cls;
            int i33 = i14;
            System.arraycopy(this.f20422cf.addVect(Arrays.copyOf(sArrMakeMessageRepresentative, o12), this.f20422cf.multiplyMatrix(rainbowPrivateKeyParameters.f20418s1, Arrays.copyOfRange(sArrMakeMessageRepresentative, o12, m10))), i33, sArr7, i33, o12);
            System.arraycopy(sArrMakeMessageRepresentative, o12, sArr7, o12, o22);
            short[] sArrMultiplyMatrix = this.f20422cf.multiplyMatrix(sArrInverse, this.f20422cf.addVect(sArr3, Arrays.copyOf(sArr7, o12)));
            short[] sArrMultiplyMatrix2 = this.f20422cf.multiplyMatrix(sArr5, sArrMultiplyMatrix);
            int i34 = 0;
            while (i34 < o22) {
                int i35 = i34;
                sArr9[i35] = this.f20422cf.multiplyMatrix_quad(rainbowPrivateKeyParameters.l2_F5[i35], sArrMultiplyMatrix);
                i34 = i35 + 1;
            }
            short[] sArr16 = sArr9;
            short[] sArrAddVect = this.f20422cf.addVect(this.f20422cf.addVect(this.f20422cf.addVect(sArrMultiplyMatrix2, sArr16), sArr4), Arrays.copyOfRange(sArr7, o12, m10));
            int i36 = 0;
            while (i36 < o12) {
                int i37 = 0;
                while (true) {
                    i10 = i36;
                    if (i37 < o22) {
                        int i38 = 0;
                        while (i38 < o22) {
                            int i39 = i38;
                            int i40 = m10;
                            short sMultElem4 = GF2Field.multElem(rainbowPrivateKeyParameters.l2_F6[i37][i10][i39], sArrMultiplyMatrix[i10]);
                            short[] sArr17 = sArr15[i37];
                            sArr17[i39] = GF2Field.addElem(sArr17[i39], sMultElem4);
                            i38 = i39 + 1;
                            m10 = i40;
                        }
                        i37++;
                        i36 = i10;
                    }
                }
                i36 = i10 + 1;
            }
            i32++;
            sArrSolveEquation = this.f20422cf.solveEquation(this.f20422cf.addMatrix(sArr15, sArr6), sArrAddVect);
            sArr14 = sArrMultiplyMatrix;
            sArr9 = sArr16;
            sArr2 = sArr;
            bArr2 = bArr6;
            bArr5 = bArr7;
            cls = cls2;
            m10 = m10;
            i14 = 0;
        }
        short[] sArr18 = sArrSolveEquation == null ? new short[o22] : sArrSolveEquation;
        short[] sArrAddVect2 = this.f20422cf.addVect(this.f20422cf.addVect(sArr, this.f20422cf.multiplyMatrix(rainbowPrivateKeyParameters.f20419t1, sArr14)), this.f20422cf.multiplyMatrix(rainbowPrivateKeyParameters.f20420t4, sArr18));
        short[] sArrAddVect3 = this.f20422cf.addVect(sArr14, this.f20422cf.multiplyMatrix(rainbowPrivateKeyParameters.t3, sArr18));
        short[] sArrCopyOf = Arrays.copyOf(sArrAddVect2, n10);
        System.arraycopy(sArrAddVect3, 0, sArrCopyOf, v12, o12);
        System.arraycopy(sArr18, 0, sArrCopyOf, o12 + v12, o22);
        if (i32 != 65536) {
            return Arrays.concatenate(RainbowUtil.convertArray(sArrCopyOf), bArr3);
        }
        throw new IllegalStateException("unable to generate signature - LES not solvable");
    }

    private short[] makeMessageRepresentative(byte[] bArr) {
        int i10 = this.signableDocumentLength;
        short[] sArr = new short[i10];
        int i11 = 0;
        int i12 = 0;
        while (i11 < bArr.length) {
            sArr[i11] = (short) (bArr[i12] & 255);
            i12++;
            i11++;
            if (i11 >= i10) {
                break;
            }
        }
        return sArr;
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public byte[] generateSignature(byte[] bArr) {
        return genSignature(bArr);
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public void init(boolean z10, CipherParameters cipherParameters) {
        RainbowKeyParameters rainbowKeyParameters;
        if (z10) {
            if (cipherParameters instanceof ParametersWithRandom) {
                ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
                this.random = parametersWithRandom.getRandom();
                rainbowKeyParameters = (RainbowKeyParameters) parametersWithRandom.getParameters();
            } else {
                rainbowKeyParameters = (RainbowKeyParameters) cipherParameters;
                SecureRandom secureRandom = CryptoServicesRegistrar.getSecureRandom();
                byte[] bArr = new byte[rainbowKeyParameters.getParameters().getLen_skseed()];
                secureRandom.nextBytes(bArr);
                this.random = new RainbowDRBG(bArr, rainbowKeyParameters.getParameters().getHash_algo());
            }
            this.version = rainbowKeyParameters.getParameters().getVersion();
            this.key = rainbowKeyParameters;
        } else {
            RainbowKeyParameters rainbowKeyParameters2 = (RainbowKeyParameters) cipherParameters;
            this.key = rainbowKeyParameters2;
            this.version = rainbowKeyParameters2.getParameters().getVersion();
        }
        this.signableDocumentLength = this.key.getDocLength();
        this.hashAlgo = this.key.getParameters().getHash_algo();
    }

    @Override // org.bouncycastle.pqc.crypto.MessageSigner
    public boolean verifySignature(byte[] bArr, byte[] bArr2) {
        short[] sArrPublicMap;
        byte[] bArr3 = new byte[this.hashAlgo.getDigestSize()];
        this.hashAlgo.update(bArr, 0, bArr.length);
        this.hashAlgo.doFinal(bArr3, 0);
        int m10 = this.key.getParameters().getM();
        int n10 = this.key.getParameters().getN();
        RainbowPublicMap rainbowPublicMap = new RainbowPublicMap(this.key.getParameters());
        short[] sArrMakeMessageRepresentative = makeMessageRepresentative(RainbowUtil.hash(this.hashAlgo, bArr3, Arrays.copyOfRange(bArr2, n10, bArr2.length), new byte[m10]));
        short[] sArrConvertArray = RainbowUtil.convertArray(Arrays.copyOfRange(bArr2, 0, n10));
        int i10 = AnonymousClass1.$SwitchMap$org$bouncycastle$pqc$crypto$rainbow$Version[this.version.ordinal()];
        if (i10 == 1) {
            sArrPublicMap = rainbowPublicMap.publicMap((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: classic, circumzenithal, compressed");
            }
            sArrPublicMap = rainbowPublicMap.publicMap_cyclic((RainbowPublicKeyParameters) this.key, sArrConvertArray);
        }
        return RainbowUtil.equals(sArrMakeMessageRepresentative, sArrPublicMap);
    }
}
