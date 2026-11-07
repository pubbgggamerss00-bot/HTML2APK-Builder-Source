package org.bouncycastle.pqc.legacy.crypto.gmss;

import b.o;
import com.android.apksig.internal.apk.a;
import java.lang.reflect.Array;
import k1.q;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.legacy.crypto.gmss.util.GMSSRandom;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes3.dex */
public class GMSSRootSig {
    private long big8;
    private int checksum;
    private int counter;
    private GMSSRandom gmssRandom;
    private byte[] hash;
    private int height;

    /* renamed from: ii, reason: collision with root package name */
    private int f20459ii;

    /* renamed from: k, reason: collision with root package name */
    private int f20460k;
    private int keysize;
    private int mdsize;
    private Digest messDigestOTS;
    private int messagesize;
    private byte[] privateKeyOTS;

    /* renamed from: r, reason: collision with root package name */
    private int f20461r;
    private byte[] seed;
    private byte[] sign;
    private int steps;
    private int test;
    private long test8;

    /* renamed from: w, reason: collision with root package name */
    private int f20462w;

    public GMSSRootSig(Digest digest, int i10, int i11) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.mdsize = this.messDigestOTS.getDigestSize();
        this.f20462w = i10;
        this.height = i11;
        this.f20460k = (1 << i10) - 1;
        this.messagesize = (int) Math.ceil((r3 << 3) / i10);
    }

    private void oneStep() {
        long j10;
        int i10 = this.f20462w;
        if (8 % i10 == 0) {
            int i11 = this.test;
            if (i11 == 0) {
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
                int i12 = this.f20459ii;
                if (i12 < this.mdsize) {
                    byte[] bArr = this.hash;
                    byte b10 = bArr[i12];
                    this.test = this.f20460k & b10;
                    bArr[i12] = (byte) (b10 >>> this.f20462w);
                } else {
                    int i13 = this.checksum;
                    this.test = this.f20460k & i13;
                    this.checksum = i13 >>> this.f20462w;
                }
            } else if (i11 > 0) {
                Digest digest = this.messDigestOTS;
                byte[] bArr2 = this.privateKeyOTS;
                digest.update(bArr2, 0, bArr2.length);
                byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr3;
                this.messDigestOTS.doFinal(bArr3, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr4 = this.privateKeyOTS;
                byte[] bArr5 = this.sign;
                int i14 = this.counter;
                int i15 = this.mdsize;
                System.arraycopy(bArr4, 0, bArr5, i14 * i15, i15);
                int i16 = this.counter + 1;
                this.counter = i16;
                if (i16 % (8 / this.f20462w) == 0) {
                    this.f20459ii++;
                    return;
                }
                return;
            }
            return;
        }
        if (i10 < 8) {
            int i17 = this.test;
            if (i17 == 0) {
                int i18 = this.counter;
                if (i18 % 8 == 0) {
                    int i19 = this.f20459ii;
                    int i20 = this.mdsize;
                    if (i19 < i20) {
                        this.big8 = 0L;
                        if (i18 < ((i20 / i10) << 3)) {
                            for (int i21 = 0; i21 < this.f20462w; i21++) {
                                long j11 = this.big8;
                                byte[] bArr6 = this.hash;
                                int i22 = this.f20459ii;
                                this.big8 = j11 ^ ((bArr6[i22] & 255) << (i21 << 3));
                                this.f20459ii = i22 + 1;
                            }
                        } else {
                            for (int i23 = 0; i23 < this.mdsize % this.f20462w; i23++) {
                                long j12 = this.big8;
                                byte[] bArr7 = this.hash;
                                int i24 = this.f20459ii;
                                this.big8 = j12 ^ ((bArr7[i24] & 255) << (i23 << 3));
                                this.f20459ii = i24 + 1;
                            }
                        }
                    }
                }
                if (this.counter == this.messagesize) {
                    this.big8 = this.checksum;
                }
                this.test = (int) (this.big8 & this.f20460k);
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (i17 > 0) {
                Digest digest2 = this.messDigestOTS;
                byte[] bArr8 = this.privateKeyOTS;
                digest2.update(bArr8, 0, bArr8.length);
                byte[] bArr9 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr9;
                this.messDigestOTS.doFinal(bArr9, 0);
                this.test--;
            }
            if (this.test == 0) {
                byte[] bArr10 = this.privateKeyOTS;
                byte[] bArr11 = this.sign;
                int i25 = this.counter;
                int i26 = this.mdsize;
                System.arraycopy(bArr10, 0, bArr11, i25 * i26, i26);
                this.big8 >>>= this.f20462w;
                this.counter++;
                return;
            }
            return;
        }
        if (i10 < 57) {
            long j13 = this.test8;
            if (j13 == 0) {
                this.big8 = 0L;
                this.f20459ii = 0;
                int i27 = this.f20461r;
                int i28 = i27 % 8;
                int i29 = i27 >>> 3;
                int i30 = this.mdsize;
                if (i29 < i30) {
                    if (i27 <= (i30 << 3) - i10) {
                        int i31 = i27 + i10;
                        this.f20461r = i31;
                        i30 = (i31 + 7) >>> 3;
                    } else {
                        this.f20461r = i27 + i10;
                    }
                    while (true) {
                        j10 = this.big8;
                        if (i29 >= i30) {
                            break;
                        }
                        int i32 = this.hash[i29] & 255;
                        int i33 = this.f20459ii;
                        this.big8 = j10 ^ (i32 << (i33 << 3));
                        this.f20459ii = i33 + 1;
                        i29++;
                    }
                    long j14 = j10 >>> i28;
                    this.big8 = j14;
                    this.test8 = j14 & this.f20460k;
                } else {
                    int i34 = this.checksum;
                    this.test8 = this.f20460k & i34;
                    this.checksum = i34 >>> i10;
                }
                this.privateKeyOTS = this.gmssRandom.nextSeed(this.seed);
            } else if (j13 > 0) {
                Digest digest3 = this.messDigestOTS;
                byte[] bArr12 = this.privateKeyOTS;
                digest3.update(bArr12, 0, bArr12.length);
                byte[] bArr13 = new byte[this.messDigestOTS.getDigestSize()];
                this.privateKeyOTS = bArr13;
                this.messDigestOTS.doFinal(bArr13, 0);
                this.test8--;
            }
            if (this.test8 == 0) {
                byte[] bArr14 = this.privateKeyOTS;
                byte[] bArr15 = this.sign;
                int i35 = this.counter;
                int i36 = this.mdsize;
                System.arraycopy(bArr14, 0, bArr15, i35 * i36, i36);
                this.counter++;
            }
        }
    }

    public int getLog(int i10) {
        int i11 = 1;
        int i12 = 2;
        while (i12 < i10) {
            i12 <<= 1;
            i11++;
        }
        return i11;
    }

    public byte[] getSig() {
        return this.sign;
    }

    public byte[][] getStatByte() {
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, 5, this.mdsize);
        bArr[0] = this.privateKeyOTS;
        bArr[1] = this.seed;
        bArr[2] = this.hash;
        bArr[3] = this.sign;
        bArr[4] = getStatLong();
        return bArr;
    }

    public int[] getStatInt() {
        return new int[]{this.counter, this.test, this.f20459ii, this.f20461r, this.steps, this.keysize, this.height, this.f20462w, this.checksum};
    }

    public byte[] getStatLong() {
        long j10 = this.test8;
        long j11 = this.big8;
        return new byte[]{(byte) (j10 & 255), (byte) ((j10 >> 8) & 255), (byte) ((j10 >> 16) & 255), (byte) ((j10 >> 24) & 255), (byte) ((j10 >> 32) & 255), (byte) ((j10 >> 40) & 255), (byte) ((j10 >> 48) & 255), (byte) ((j10 >> 56) & 255), (byte) (j11 & 255), (byte) ((j11 >> 8) & 255), (byte) ((j11 >> 16) & 255), (byte) ((j11 >> 24) & 255), (byte) ((j11 >> 32) & 255), (byte) ((j11 >> 40) & 255), (byte) ((j11 >> 48) & 255), (byte) ((j11 >> 56) & 255)};
    }

    public void initSign(byte[] bArr, byte[] bArr2) {
        int i10;
        int i11;
        this.hash = new byte[this.mdsize];
        this.messDigestOTS.update(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.messDigestOTS.getDigestSize()];
        this.hash = bArr3;
        this.messDigestOTS.doFinal(bArr3, 0);
        int i12 = this.mdsize;
        byte[] bArr4 = new byte[i12];
        System.arraycopy(this.hash, 0, bArr4, 0, i12);
        int log = getLog((this.messagesize << this.f20462w) + 1);
        int i13 = this.f20462w;
        int i14 = 8;
        if (8 % i13 == 0) {
            int i15 = 8 / i13;
            i10 = 0;
            for (int i16 = 0; i16 < this.mdsize; i16++) {
                for (int i17 = 0; i17 < i15; i17++) {
                    byte b10 = bArr4[i16];
                    i10 += this.f20460k & b10;
                    bArr4[i16] = (byte) (b10 >>> this.f20462w);
                }
            }
            int i18 = (this.messagesize << this.f20462w) - i10;
            this.checksum = i18;
            int i19 = 0;
            while (i19 < log) {
                i10 += this.f20460k & i18;
                int i20 = this.f20462w;
                i18 >>>= i20;
                i19 += i20;
            }
        } else if (i13 < 8) {
            int i21 = this.mdsize / i13;
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < i21; i24++) {
                long j10 = 0;
                for (int i25 = 0; i25 < this.f20462w; i25++) {
                    j10 ^= (bArr4[i22] & 255) << (i25 << 3);
                    i22++;
                }
                int i26 = 0;
                while (i26 < i14) {
                    i23 += (int) (this.f20460k & j10);
                    j10 >>>= this.f20462w;
                    i26++;
                    i14 = i14;
                    i21 = i21;
                }
            }
            int i27 = this.mdsize % this.f20462w;
            long j11 = 0;
            for (int i28 = 0; i28 < i27; i28++) {
                j11 ^= (bArr4[i22] & 255) << (i28 << 3);
                i22++;
            }
            int i29 = i27 << 3;
            int i30 = 0;
            while (i30 < i29) {
                i23 += (int) (this.f20460k & j11);
                int i31 = this.f20462w;
                j11 >>>= i31;
                i30 += i31;
            }
            int i32 = (this.messagesize << this.f20462w) - i23;
            this.checksum = i32;
            int i33 = 0;
            i10 = i23;
            while (i33 < log) {
                i10 += this.f20460k & i32;
                int i34 = this.f20462w;
                i32 >>>= i34;
                i33 += i34;
            }
        } else if (i13 < 57) {
            int i35 = 0;
            int i36 = 0;
            while (true) {
                i11 = this.mdsize;
                int i37 = this.f20462w;
                if (i35 > (i11 << 3) - i37) {
                    break;
                }
                int i38 = i35 % 8;
                i35 += i37;
                int i39 = 0;
                long j12 = 0;
                for (int i40 = i35 >>> 3; i40 < ((i35 + 7) >>> 3); i40++) {
                    j12 ^= (bArr4[i40] & 255) << (i39 << 3);
                    i39++;
                }
                i36 = (int) (i36 + ((j12 >>> i38) & this.f20460k));
            }
            int i41 = i35 >>> 3;
            if (i41 < i11) {
                int i42 = i35 % 8;
                int i43 = 0;
                long j13 = 0;
                while (i41 < this.mdsize) {
                    j13 ^= (bArr4[i41] & 255) << (i43 << 3);
                    i43++;
                    i41++;
                }
                i36 = (int) (i36 + ((j13 >>> i42) & this.f20460k));
            }
            int i44 = (this.messagesize << this.f20462w) - i36;
            this.checksum = i44;
            int i45 = 0;
            i10 = i36;
            while (i45 < log) {
                i10 += this.f20460k & i44;
                int i46 = this.f20462w;
                i44 >>>= i46;
                i45 += i46;
            }
        } else {
            i10 = 0;
        }
        this.keysize = this.messagesize + ((int) Math.ceil(log / this.f20462w));
        this.steps = (int) Math.ceil((r2 + i10) / (1 << this.height));
        int i47 = this.keysize;
        int i48 = this.mdsize;
        this.sign = new byte[i47 * i48];
        this.counter = 0;
        this.test = 0;
        this.f20459ii = 0;
        this.test8 = 0L;
        this.f20461r = 0;
        this.privateKeyOTS = new byte[i48];
        byte[] bArr5 = new byte[i48];
        this.seed = bArr5;
        System.arraycopy(bArr, 0, bArr5, 0, i48);
    }

    public String toString() {
        String strA = a.a(this.big8, "  ", new StringBuilder(""));
        int[] statInt = getStatInt();
        byte[][] statByte = getStatByte();
        for (int i10 = 0; i10 < 9; i10++) {
            strA = x0.a.a(q.a(strA), statInt[i10], " ");
        }
        for (int i11 = 0; i11 < 5; i11++) {
            strA = o.a(q.a(strA), new String(Hex.encode(statByte[i11])), " ");
        }
        return strA;
    }

    public boolean updateSign() {
        for (int i10 = 0; i10 < this.steps; i10++) {
            if (this.counter < this.keysize) {
                oneStep();
            }
            if (this.counter == this.keysize) {
                return true;
            }
        }
        return false;
    }

    public GMSSRootSig(Digest digest, byte[][] bArr, int[] iArr) {
        this.messDigestOTS = digest;
        this.gmssRandom = new GMSSRandom(digest);
        this.counter = iArr[0];
        this.test = iArr[1];
        this.f20459ii = iArr[2];
        this.f20461r = iArr[3];
        this.steps = iArr[4];
        this.keysize = iArr[5];
        this.height = iArr[6];
        this.f20462w = iArr[7];
        this.checksum = iArr[8];
        this.mdsize = this.messDigestOTS.getDigestSize();
        int i10 = this.f20462w;
        this.f20460k = (1 << i10) - 1;
        this.messagesize = (int) Math.ceil((r8 << 3) / i10);
        this.privateKeyOTS = bArr[0];
        this.seed = bArr[1];
        this.hash = bArr[2];
        this.sign = bArr[3];
        byte[] bArr2 = bArr[4];
        this.test8 = ((bArr2[2] & 255) << 16) | (bArr2[0] & 255) | ((bArr2[1] & 255) << 8) | ((bArr2[3] & 255) << 24) | ((bArr2[4] & 255) << 32) | ((bArr2[5] & 255) << 40) | ((bArr2[6] & 255) << 48) | ((bArr2[7] & 255) << 56);
        this.big8 = ((bArr2[15] & 255) << 56) | (bArr2[8] & 255) | ((bArr2[9] & 255) << 8) | ((bArr2[10] & 255) << 16) | ((bArr2[11] & 255) << 24) | ((bArr2[12] & 255) << 32) | ((bArr2[13] & 255) << 40) | ((bArr2[14] & 255) << 48);
    }
}
