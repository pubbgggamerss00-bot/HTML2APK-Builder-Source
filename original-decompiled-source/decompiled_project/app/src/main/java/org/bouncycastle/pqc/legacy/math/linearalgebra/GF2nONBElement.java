package org.bouncycastle.pqc.legacy.math.linearalgebra;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.math.BigInteger;
import java.security.SecureRandom;
import k1.q;
import k3.a;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class GF2nONBElement extends GF2nElement {
    private static final int MAXLONG = 64;
    private int mBit;
    private int mLength;
    private long[] mPol;
    private static final long[] mBitmask = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216, 33554432, 67108864, 134217728, 268435456, 536870912, 1073741824, 2147483648L, 4294967296L, 8589934592L, 17179869184L, 34359738368L, 68719476736L, 137438953472L, 274877906944L, 549755813888L, 1099511627776L, 2199023255552L, 4398046511104L, 8796093022208L, 17592186044416L, 35184372088832L, 70368744177664L, 140737488355328L, 281474976710656L, 562949953421312L, 1125899906842624L, 2251799813685248L, 4503599627370496L, 9007199254740992L, 18014398509481984L, 36028797018963968L, 72057594037927936L, 144115188075855872L, 288230376151711744L, 576460752303423488L, 1152921504606846976L, 2305843009213693952L, 4611686018427387904L, Long.MIN_VALUE};
    private static final long[] mMaxmask = {1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647L, BodyPartID.bodyIdMax, 8589934591L, 17179869183L, 34359738367L, 68719476735L, 137438953471L, 274877906943L, 549755813887L, 1099511627775L, 2199023255551L, 4398046511103L, 8796093022207L, 17592186044415L, 35184372088831L, 70368744177663L, 140737488355327L, 281474976710655L, 562949953421311L, 1125899906842623L, 2251799813685247L, 4503599627370495L, 9007199254740991L, 18014398509481983L, 36028797018963967L, 72057594037927935L, 144115188075855871L, 288230376151711743L, 576460752303423487L, 1152921504606846975L, 2305843009213693951L, 4611686018427387903L, Long.MAX_VALUE, -1};
    private static final int[] mIBY64 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

    public GF2nONBElement(GF2nONBElement gF2nONBElement) {
        GF2nField gF2nField = gF2nONBElement.mField;
        this.mField = gF2nField;
        this.mDegree = gF2nField.getDegree();
        this.mLength = ((GF2nONBField) this.mField).getONBLength();
        this.mBit = ((GF2nONBField) this.mField).getONBBit();
        this.mPol = new long[this.mLength];
        assign(gF2nONBElement.getElement());
    }

    public static GF2nONBElement ONE(GF2nONBField gF2nONBField) {
        int oNBLength = gF2nONBField.getONBLength();
        long[] jArr = new long[oNBLength];
        int i10 = 0;
        while (true) {
            int i11 = oNBLength - 1;
            if (i10 >= i11) {
                jArr[i11] = mMaxmask[gF2nONBField.getONBBit() - 1];
                return new GF2nONBElement(gF2nONBField, jArr);
            }
            jArr[i10] = -1;
            i10++;
        }
    }

    public static GF2nONBElement ZERO(GF2nONBField gF2nONBField) {
        return new GF2nONBElement(gF2nONBField, new long[gF2nONBField.getONBLength()]);
    }

    private void assign(BigInteger bigInteger) {
        assign(bigInteger.toByteArray());
    }

    private long[] getElement() {
        long[] jArr = this.mPol;
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    private long[] getElementReverseOrder() {
        long[] jArr = new long[this.mPol.length];
        int i10 = 0;
        while (true) {
            if (i10 >= this.mDegree) {
                return jArr;
            }
            if (testBit((r2 - i10) - 1)) {
                int i11 = i10 >>> 6;
                jArr[i11] = jArr[i11] | mBitmask[i10 & 63];
            }
            i10++;
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement add(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.addToThis(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void addToThis(GFElement gFElement) throws RuntimeException {
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException();
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        for (int i10 = 0; i10 < this.mLength; i10++) {
            long[] jArr = this.mPol;
            jArr[i10] = jArr[i10] ^ gF2nONBElement.mPol[i10];
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void assignOne() {
        int i10 = 0;
        while (true) {
            int i11 = this.mLength;
            if (i10 >= i11 - 1) {
                this.mPol[i11 - 1] = mMaxmask[this.mBit - 1];
                return;
            } else {
                this.mPol[i10] = -1;
                i10++;
            }
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void assignZero() {
        this.mPol = new long[this.mLength];
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement, org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public Object clone() {
        return new GF2nONBElement(this);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof GF2nONBElement)) {
            return false;
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) obj;
        for (int i10 = 0; i10 < this.mLength; i10++) {
            if (this.mPol[i10] != gF2nONBElement.mPol[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public int hashCode() {
        return Arrays.hashCode(this.mPol);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement increase() throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.increaseThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void increaseThis() throws RuntimeException {
        addToThis(ONE((GF2nONBField) this.mField));
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement invert() throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.invertThis();
        return gF2nONBElement;
    }

    public void invertThis() throws RuntimeException {
        if (isZero()) {
            throw new ArithmeticException();
        }
        int i10 = 31;
        boolean z10 = false;
        while (!z10 && i10 >= 0) {
            if (((this.mDegree - 1) & mBitmask[i10]) != 0) {
                z10 = true;
            }
            i10--;
        }
        ZERO((GF2nONBField) this.mField);
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        int i11 = 1;
        while (i10 >= 0) {
            GF2nElement gF2nElement = (GF2nElement) gF2nONBElement.clone();
            for (int i12 = 1; i12 <= i11; i12++) {
                gF2nElement.squareThis();
            }
            gF2nONBElement.multiplyThisBy(gF2nElement);
            i11 <<= 1;
            if (((this.mDegree - 1) & mBitmask[i10]) != 0) {
                gF2nONBElement.squareThis();
                gF2nONBElement.multiplyThisBy(this);
                i11++;
            }
            i10--;
        }
        gF2nONBElement.squareThis();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isOne() {
        int i10;
        boolean z10 = true;
        int i11 = 0;
        while (true) {
            i10 = this.mLength;
            if (i11 >= i10 - 1 || !z10) {
                break;
            }
            z10 = z10 && this.mPol[i11] == -1;
            i11++;
        }
        if (!z10) {
            return z10;
        }
        if (z10) {
            long j10 = this.mPol[i10 - 1];
            long[] jArr = mMaxmask;
            int i12 = this.mBit;
            if ((j10 & jArr[i12 - 1]) == jArr[i12 - 1]) {
                return true;
            }
        }
        return false;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public boolean isZero() {
        boolean z10 = true;
        for (int i10 = 0; i10 < this.mLength && z10; i10++) {
            z10 = z10 && this.mPol[i10] == 0;
        }
        return z10;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public GFElement multiply(GFElement gFElement) throws RuntimeException {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.multiplyThisBy(gFElement);
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public void multiplyThisBy(GFElement gFElement) throws RuntimeException {
        char c10;
        if (!(gFElement instanceof GF2nONBElement)) {
            throw new RuntimeException("The elements have different representation: not yet implemented");
        }
        GF2nONBElement gF2nONBElement = (GF2nONBElement) gFElement;
        if (!this.mField.equals(gF2nONBElement.mField)) {
            throw new RuntimeException();
        }
        if (equals(gFElement)) {
            squareThis();
            return;
        }
        long[] jArr = this.mPol;
        long[] jArr2 = gF2nONBElement.mPol;
        int i10 = this.mLength;
        long[] jArr3 = new long[i10];
        int[][] iArr = ((GF2nONBField) this.mField).mMult;
        int i11 = i10 - 1;
        char c11 = 1;
        int i12 = this.mBit - 1;
        long[] jArr4 = mBitmask;
        long j10 = jArr4[63];
        long j11 = jArr4[i12];
        int i13 = 0;
        while (i13 < this.mDegree) {
            int i14 = 0;
            boolean z10 = false;
            while (i14 < this.mDegree) {
                int[] iArr2 = mIBY64;
                int i15 = iArr2[i14];
                int[] iArr3 = iArr[i14];
                int i16 = iArr3[0];
                int i17 = iArr2[i16];
                int i18 = i16 & 63;
                long j12 = jArr[i15];
                long[] jArr5 = mBitmask;
                if ((j12 & jArr5[i14 & 63]) != 0) {
                    if ((jArr2[i17] & jArr5[i18]) != 0) {
                        z10 = !z10;
                    }
                    int i19 = iArr3[c11];
                    if (i19 != -1 && (jArr2[iArr2[i19]] & jArr5[i19 & 63]) != 0) {
                        z10 = !z10;
                    }
                }
                i14++;
                c11 = 1;
            }
            int i20 = mIBY64[i13];
            int i21 = i13 & 63;
            if (z10) {
                jArr3[i20] = jArr3[i20] ^ mBitmask[i21];
            }
            if (this.mLength > 1) {
                boolean z11 = (jArr[i11] & 1) == 1;
                int i22 = i10 - 2;
                int i23 = i22;
                while (i23 >= 0) {
                    long j13 = jArr[i23];
                    boolean z12 = (j13 & 1) != 0;
                    long j14 = j13 >>> 1;
                    jArr[i23] = j14;
                    if (z11) {
                        jArr[i23] = j14 ^ j10;
                    }
                    i23--;
                    z11 = z12;
                }
                long j15 = jArr[i11] >>> 1;
                jArr[i11] = j15;
                if (z11) {
                    jArr[i11] = j15 ^ j11;
                }
                boolean z13 = (jArr2[i11] & 1) == 1;
                while (i22 >= 0) {
                    long j16 = jArr2[i22];
                    boolean z14 = (j16 & 1) != 0;
                    long j17 = j16 >>> 1;
                    jArr2[i22] = j17;
                    if (z13) {
                        jArr2[i22] = j17 ^ j10;
                    }
                    i22--;
                    z13 = z14;
                }
                long j18 = jArr2[i11] >>> 1;
                jArr2[i11] = j18;
                if (z13) {
                    jArr2[i11] = j18 ^ j11;
                }
                c10 = 1;
            } else {
                long j19 = jArr[0];
                boolean z15 = (j19 & 1) == 1;
                long j20 = j19 >>> 1;
                jArr[0] = j20;
                if (z15) {
                    jArr[0] = j20 ^ j11;
                }
                long j21 = jArr2[0];
                boolean z16 = (j21 & 1) == 1;
                c10 = 1;
                long j22 = j21 >>> 1;
                jArr2[0] = j22;
                if (z16) {
                    jArr2[0] = j22 ^ j11;
                }
            }
            i13++;
            c11 = c10;
        }
        assign(jArr3);
    }

    public void reverseOrder() {
        this.mPol = getElementReverseOrder();
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement solveQuadraticEquation() throws RuntimeException {
        int i10;
        if (trace() == 1) {
            throw new RuntimeException();
        }
        long j10 = mBitmask[63];
        long[] jArr = new long[this.mLength];
        int i11 = 0;
        long j11 = 0;
        while (true) {
            i10 = this.mLength;
            if (i11 >= i10 - 1) {
                break;
            }
            for (int i12 = 1; i12 < 64; i12++) {
                long[] jArr2 = mBitmask;
                long j12 = jArr2[i12];
                long j13 = this.mPol[i11];
                if (((j12 & j13) == 0 || (j11 & jArr2[i12 - 1]) == 0) && ((j13 & j12) != 0 || (jArr2[i12 - 1] & j11) != 0)) {
                    j11 ^= j12;
                }
            }
            jArr[i11] = j11;
            long j14 = j11 & j10;
            j11 = ((j14 == 0 || (this.mPol[i11 + 1] & 1) != 1) && !(j14 == 0 && (this.mPol[i11 + 1] & 1) == 0)) ? 1L : 0L;
            i11++;
        }
        int i13 = 63 & this.mDegree;
        long j15 = this.mPol[i10 - 1];
        for (int i14 = 1; i14 < i13; i14++) {
            long[] jArr3 = mBitmask;
            long j16 = jArr3[i14];
            if (((j16 & j15) == 0 || (jArr3[i14 - 1] & j11) == 0) && ((j16 & j15) != 0 || (jArr3[i14 - 1] & j11) != 0)) {
                j11 ^= j16;
            }
        }
        jArr[this.mLength - 1] = j11;
        return new GF2nONBElement((GF2nONBField) this.mField, jArr);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement square() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public GF2nElement squareRoot() {
        GF2nONBElement gF2nONBElement = new GF2nONBElement(this);
        gF2nONBElement.squareRootThis();
        return gF2nONBElement;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareRootThis() {
        long[] element = getElement();
        int i10 = this.mLength - 1;
        int i11 = this.mBit - 1;
        long j10 = mBitmask[63];
        boolean z10 = (element[0] & 1) != 0;
        int i12 = i10;
        while (i12 >= 0) {
            long j11 = element[i12];
            boolean z11 = (j11 & 1) != 0;
            long j12 = j11 >>> 1;
            element[i12] = j12;
            if (z10) {
                if (i12 == i10) {
                    element[i12] = j12 ^ mBitmask[i11];
                } else {
                    element[i12] = j12 ^ j10;
                }
            }
            i12--;
            z10 = z11;
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public void squareThis() {
        long[] element = getElement();
        int i10 = this.mLength - 1;
        int i11 = this.mBit;
        int i12 = i11 - 1;
        long[] jArr = mBitmask;
        long j10 = jArr[63];
        boolean z10 = (element[i10] & jArr[i12]) != 0;
        int i13 = 0;
        while (i13 < i10) {
            long j11 = element[i13];
            boolean z11 = (j11 & j10) != 0;
            long j12 = j11 << 1;
            element[i13] = j12;
            if (z10) {
                element[i13] = 1 ^ j12;
            }
            i13++;
            z10 = z11;
        }
        long j13 = element[i10];
        long[] jArr2 = mBitmask;
        boolean z12 = (jArr2[i12] & j13) != 0;
        long j14 = j13 << 1;
        element[i10] = j14;
        if (z10) {
            element[i10] = j14 ^ 1;
        }
        if (z12) {
            element[i10] = jArr2[i11] ^ element[i10];
        }
        assign(element);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testBit(int i10) {
        return i10 >= 0 && i10 <= this.mDegree && (this.mPol[i10 >>> 6] & mBitmask[i10 & 63]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public boolean testRightmostBit() {
        return (this.mPol[this.mLength - 1] & mBitmask[this.mBit - 1]) != 0;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public byte[] toByteArray() {
        int i10 = ((this.mDegree - 1) >> 3) + 1;
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (i11 & 7) << 3;
            bArr[(i10 - i11) - 1] = (byte) ((this.mPol[i11 >>> 3] & (255 << i12)) >>> i12);
        }
        return bArr;
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public BigInteger toFlexiBigInt() {
        return new BigInteger(1, toByteArray());
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString() {
        return toString(16);
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GF2nElement
    public int trace() {
        int i10 = this.mLength - 1;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            for (int i13 = 0; i13 < 64; i13++) {
                if ((this.mPol[i12] & mBitmask[i13]) != 0) {
                    i11 ^= 1;
                }
            }
        }
        int i14 = this.mBit;
        for (int i15 = 0; i15 < i14; i15++) {
            if ((this.mPol[i10] & mBitmask[i15]) != 0) {
                i11 ^= 1;
            }
        }
        return i11;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, BigInteger bigInteger) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bigInteger);
    }

    private void assign(byte[] bArr) {
        this.mPol = new long[this.mLength];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            long[] jArr = this.mPol;
            int i11 = i10 >>> 3;
            jArr[i11] = jArr[i11] | ((bArr[(bArr.length - 1) - i10] & 255) << ((i10 & 7) << 3));
        }
    }

    @Override // org.bouncycastle.pqc.legacy.math.linearalgebra.GFElement
    public String toString(int i10) {
        long[] element = getElement();
        int i11 = this.mBit;
        String strA = "";
        if (i10 == 2) {
            while (true) {
                i11--;
                if (i11 < 0) {
                    break;
                }
                strA = (element[element.length + (-1)] & (1 << i11)) == 0 ? a.a(strA, d.L0) : a.a(strA, "1");
            }
            for (int length = element.length - 2; length >= 0; length--) {
                for (int i12 = 63; i12 >= 0; i12--) {
                    strA = (element[length] & mBitmask[i12]) == 0 ? a.a(strA, d.L0) : a.a(strA, "1");
                }
            }
            return strA;
        }
        if (i10 == 16) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            for (int length2 = element.length - 1; length2 >= 0; length2--) {
                StringBuilder sbA = q.a(strA);
                sbA.append(cArr[((int) (element[length2] >>> 60)) & 15]);
                StringBuilder sbA2 = q.a(sbA.toString());
                sbA2.append(cArr[((int) (element[length2] >>> 56)) & 15]);
                StringBuilder sbA3 = q.a(sbA2.toString());
                sbA3.append(cArr[((int) (element[length2] >>> 52)) & 15]);
                StringBuilder sbA4 = q.a(sbA3.toString());
                sbA4.append(cArr[((int) (element[length2] >>> 48)) & 15]);
                StringBuilder sbA5 = q.a(sbA4.toString());
                sbA5.append(cArr[((int) (element[length2] >>> 44)) & 15]);
                StringBuilder sbA6 = q.a(sbA5.toString());
                sbA6.append(cArr[((int) (element[length2] >>> 40)) & 15]);
                StringBuilder sbA7 = q.a(sbA6.toString());
                sbA7.append(cArr[((int) (element[length2] >>> 36)) & 15]);
                StringBuilder sbA8 = q.a(sbA7.toString());
                sbA8.append(cArr[((int) (element[length2] >>> 32)) & 15]);
                StringBuilder sbA9 = q.a(sbA8.toString());
                sbA9.append(cArr[((int) (element[length2] >>> 28)) & 15]);
                StringBuilder sbA10 = q.a(sbA9.toString());
                sbA10.append(cArr[((int) (element[length2] >>> 24)) & 15]);
                StringBuilder sbA11 = q.a(sbA10.toString());
                sbA11.append(cArr[((int) (element[length2] >>> 20)) & 15]);
                StringBuilder sbA12 = q.a(sbA11.toString());
                sbA12.append(cArr[((int) (element[length2] >>> 16)) & 15]);
                StringBuilder sbA13 = q.a(sbA12.toString());
                sbA13.append(cArr[((int) (element[length2] >>> 12)) & 15]);
                StringBuilder sbA14 = q.a(sbA13.toString());
                sbA14.append(cArr[((int) (element[length2] >>> 8)) & 15]);
                StringBuilder sbA15 = q.a(sbA14.toString());
                sbA15.append(cArr[((int) (element[length2] >>> 4)) & 15]);
                StringBuilder sbA16 = q.a(sbA15.toString());
                sbA16.append(cArr[((int) element[length2]) & 15]);
                strA = a.a(sbA16.toString(), " ");
            }
        }
        return strA;
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, SecureRandom secureRandom) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        int i10 = this.mLength;
        long[] jArr = new long[i10];
        this.mPol = jArr;
        if (i10 <= 1) {
            jArr[0] = secureRandom.nextLong();
            long[] jArr2 = this.mPol;
            jArr2[0] = jArr2[0] >>> (64 - this.mBit);
        } else {
            for (int i11 = 0; i11 < this.mLength - 1; i11++) {
                this.mPol[i11] = secureRandom.nextLong();
            }
            this.mPol[this.mLength - 1] = secureRandom.nextLong() >>> (64 - this.mBit);
        }
    }

    private void assign(long[] jArr) {
        System.arraycopy(jArr, 0, this.mPol, 0, this.mLength);
    }

    public GF2nONBElement(GF2nONBField gF2nONBField, byte[] bArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = new long[this.mLength];
        assign(bArr);
    }

    private GF2nONBElement(GF2nONBField gF2nONBField, long[] jArr) {
        this.mField = gF2nONBField;
        this.mDegree = gF2nONBField.getDegree();
        this.mLength = gF2nONBField.getONBLength();
        this.mBit = gF2nONBField.getONBBit();
        this.mPol = jArr;
    }
}
