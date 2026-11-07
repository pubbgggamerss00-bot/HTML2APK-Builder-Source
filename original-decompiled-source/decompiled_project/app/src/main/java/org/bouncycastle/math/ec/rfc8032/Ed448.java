package org.bouncycastle.math.ec.rfc8032;

import java.security.SecureRandom;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.Xof;
import org.bouncycastle.crypto.digests.SHAKEDigest;
import org.bouncycastle.math.ec.rfc7748.X448;
import org.bouncycastle.math.ec.rfc7748.X448Field;
import org.bouncycastle.math.raw.Nat;

/* loaded from: classes3.dex */
public abstract class Ed448 {
    private static final int COORD_INTS = 14;
    private static final int C_d = 39081;
    private static final int POINT_BYTES = 57;
    private static final int PRECOMP_BLOCKS = 5;
    private static final int PRECOMP_MASK = 15;
    private static final int PRECOMP_POINTS = 16;
    private static final int PRECOMP_RANGE = 450;
    private static final int PRECOMP_SPACING = 18;
    private static final int PRECOMP_TEETH = 5;
    public static final int PREHASH_SIZE = 64;
    public static final int PUBLIC_KEY_SIZE = 57;
    private static final int SCALAR_BYTES = 57;
    private static final int SCALAR_INTS = 14;
    public static final int SECRET_KEY_SIZE = 57;
    public static final int SIGNATURE_SIZE = 114;
    private static final int WNAF_WIDTH_225 = 5;
    private static final int WNAF_WIDTH_BASE = 7;
    private static final byte[] DOM4_PREFIX = {83, 105, 103, 69, 100, 52, 52, 56};
    private static final int[] P = {-1, -1, -1, -1, -1, -1, -1, -2, -1, -1, -1, -1, -1, -1};
    private static final int[] B_x = {118276190, 40534716, 9670182, 135141552, 85017403, 259173222, 68333082, 171784774, 174973732, 15824510, 73756743, 57518561, 94773951, 248652241, 107736333, 82941708};
    private static final int[] B_y = {36764180, 8885695, 130592152, 20104429, 163904957, 30304195, 121295871, 5901357, 125344798, 171541512, 175338348, 209069246, 3626697, 38307682, 24032956, 110359655};
    private static final int[] B225_x = {110141154, 30892124, 160820362, 264558960, 217232225, 47722141, 19029845, 8326902, 183409749, 170134547, 90340180, 222600478, 61097333, 7431335, 198491505, 102372861};
    private static final int[] B225_y = {221945828, 50763449, 132637478, 109250759, 216053960, 61612587, 50649998, 138339097, 98949899, 248139835, 186410297, 126520782, 47339196, 78164062, 198835543, 169622712};
    private static final Object PRECOMP_LOCK = new Object();
    private static PointAffine[] PRECOMP_BASE_WNAF = null;
    private static PointAffine[] PRECOMP_BASE225_WNAF = null;
    private static int[] PRECOMP_BASE_COMB = null;

    public static final class Algorithm {
        public static final int Ed448 = 0;
        public static final int Ed448ph = 1;
    }

    public static class F extends X448Field {
        private F() {
        }
    }

    public static class PointAffine {

        /* renamed from: x, reason: collision with root package name */
        int[] f20243x;

        /* renamed from: y, reason: collision with root package name */
        int[] f20244y;

        private PointAffine() {
            this.f20243x = X448Field.create();
            this.f20244y = X448Field.create();
        }
    }

    public static class PointProjective {

        /* renamed from: x, reason: collision with root package name */
        int[] f20245x;

        /* renamed from: y, reason: collision with root package name */
        int[] f20246y;

        /* renamed from: z, reason: collision with root package name */
        int[] f20247z;

        private PointProjective() {
            this.f20245x = X448Field.create();
            this.f20246y = X448Field.create();
            this.f20247z = X448Field.create();
        }
    }

    public static class PointTemp {

        /* renamed from: r0, reason: collision with root package name */
        int[] f20248r0;

        /* renamed from: r1, reason: collision with root package name */
        int[] f20249r1;

        /* renamed from: r2, reason: collision with root package name */
        int[] f20250r2;

        /* renamed from: r3, reason: collision with root package name */
        int[] f20251r3;

        /* renamed from: r4, reason: collision with root package name */
        int[] f20252r4;

        /* renamed from: r5, reason: collision with root package name */
        int[] f20253r5;

        /* renamed from: r6, reason: collision with root package name */
        int[] f20254r6;

        /* renamed from: r7, reason: collision with root package name */
        int[] f20255r7;

        private PointTemp() {
            this.f20248r0 = X448Field.create();
            this.f20249r1 = X448Field.create();
            this.f20250r2 = X448Field.create();
            this.f20251r3 = X448Field.create();
            this.f20252r4 = X448Field.create();
            this.f20253r5 = X448Field.create();
            this.f20254r6 = X448Field.create();
            this.f20255r7 = X448Field.create();
        }
    }

    public static final class PublicPoint {
        final int[] data;

        public PublicPoint(int[] iArr) {
            this.data = iArr;
        }
    }

    private static byte[] calculateS(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        int[] iArr = new int[28];
        Scalar448.decode(bArr, iArr);
        int[] iArr2 = new int[14];
        Scalar448.decode(bArr2, iArr2);
        int[] iArr3 = new int[14];
        Scalar448.decode(bArr3, iArr3);
        Nat.mulAddTo(14, iArr2, iArr3, iArr);
        byte[] bArr4 = new byte[114];
        Codec.encode32(iArr, 0, 28, bArr4, 0);
        return Scalar448.reduce912(bArr4);
    }

    private static boolean checkContextVar(byte[] bArr) {
        return bArr != null && bArr.length < 256;
    }

    private static int checkPoint(PointAffine pointAffine) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        X448Field.sqr(pointAffine.f20243x, iArrCreate2);
        X448Field.sqr(pointAffine.f20244y, iArrCreate3);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate, C_d, iArrCreate);
        X448Field.subOne(iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate3);
        return X448Field.isZero(iArrCreate) & (~X448Field.isZero(iArrCreate3));
    }

    private static boolean checkPointFullVar(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        int iDecode32 = Codec.decode32(bArr, 52);
        int i10 = P[13] ^ iDecode32;
        for (int i11 = 12; i11 > 0; i11--) {
            int iDecode322 = Codec.decode32(bArr, i11 * 4);
            if (i10 == 0 && iDecode322 + PKIFailureInfo.systemUnavail > P[i11] + PKIFailureInfo.systemUnavail) {
                return false;
            }
            iDecode32 |= iDecode322;
            i10 |= P[i11] ^ iDecode322;
        }
        int iDecode323 = Codec.decode32(bArr, 0);
        if (iDecode32 != 0 || iDecode323 + PKIFailureInfo.systemUnavail > -2147483647) {
            return i10 != 0 || iDecode323 + PKIFailureInfo.systemUnavail < P[0] - (-2147483647);
        }
        return false;
    }

    private static boolean checkPointOrderVar(PointAffine pointAffine) {
        PointProjective pointProjective = new PointProjective();
        scalarMultOrderVar(pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static boolean checkPointVar(byte[] bArr) {
        if ((bArr[56] & Byte.MAX_VALUE) != 0) {
            return false;
        }
        if (Codec.decode32(bArr, 52) != P[13]) {
            return true;
        }
        Codec.decode32(bArr, 0, new int[14], 0, 14);
        return !Nat.gte(14, r3, r2);
    }

    private static byte[] copy(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return bArr2;
    }

    public static Xof createPrehash() {
        return createXof();
    }

    private static Xof createXof() {
        return new SHAKEDigest(256);
    }

    private static boolean decodePointVar(byte[] bArr, boolean z10, PointAffine pointAffine) {
        int i10 = (bArr[56] & 128) >>> 7;
        X448Field.decode(bArr, pointAffine.f20244y);
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        X448Field.sqr(pointAffine.f20244y, iArrCreate);
        X448Field.mul(iArrCreate, C_d, iArrCreate2);
        X448Field.negate(iArrCreate, iArrCreate);
        X448Field.addOne(iArrCreate);
        X448Field.addOne(iArrCreate2);
        if (!X448Field.sqrtRatioVar(iArrCreate, iArrCreate2, pointAffine.f20243x)) {
            return false;
        }
        X448Field.normalize(pointAffine.f20243x);
        if (i10 == 1 && X448Field.isZeroVar(pointAffine.f20243x)) {
            return false;
        }
        int[] iArr = pointAffine.f20243x;
        if (z10 ^ (i10 != (iArr[0] & 1))) {
            X448Field.negate(iArr, iArr);
            X448Field.normalize(pointAffine.f20243x);
        }
        return true;
    }

    private static void dom4(Xof xof, byte b10, byte[] bArr) {
        byte[] bArr2 = DOM4_PREFIX;
        int length = bArr2.length;
        int i10 = length + 2;
        int length2 = bArr.length + i10;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr2, 0, bArr3, 0, length);
        bArr3[length] = b10;
        bArr3[length + 1] = (byte) bArr.length;
        System.arraycopy(bArr, 0, bArr3, i10, bArr.length);
        xof.update(bArr3, 0, length2);
    }

    private static void encodePoint(PointAffine pointAffine, byte[] bArr, int i10) {
        X448Field.encode(pointAffine.f20244y, bArr, i10);
        bArr[i10 + 56] = (byte) ((pointAffine.f20243x[0] & 1) << 7);
    }

    public static void encodePublicPoint(PublicPoint publicPoint, byte[] bArr, int i10) {
        X448Field.encode(publicPoint.data, 16, bArr, i10);
        bArr[i10 + 56] = (byte) ((publicPoint.data[0] & 1) << 7);
    }

    private static int encodeResult(PointProjective pointProjective, byte[] bArr, int i10) {
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointProjective, pointAffine);
        int iCheckPoint = checkPoint(pointAffine);
        encodePoint(pointAffine, bArr, i10);
        return iCheckPoint;
    }

    private static PublicPoint exportPoint(PointAffine pointAffine) {
        int[] iArr = new int[32];
        X448Field.copy(pointAffine.f20243x, 0, iArr, 0);
        X448Field.copy(pointAffine.f20244y, 0, iArr, 16);
        return new PublicPoint(iArr);
    }

    public static void generatePrivateKey(SecureRandom secureRandom, byte[] bArr) {
        if (bArr.length != 57) {
            throw new IllegalArgumentException("k");
        }
        secureRandom.nextBytes(bArr);
    }

    public static PublicPoint generatePublicKey(byte[] bArr, int i10) {
        Xof xofCreateXof = createXof();
        byte[] bArr2 = new byte[114];
        xofCreateXof.update(bArr, i10, 57);
        xofCreateXof.doFinal(bArr2, 0, 114);
        byte[] bArr3 = new byte[57];
        pruneScalar(bArr2, 0, bArr3);
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr3, pointProjective);
        PointAffine pointAffine = new PointAffine();
        normalizeToAffine(pointProjective, pointAffine);
        if (checkPoint(pointAffine) != 0) {
            return exportPoint(pointAffine);
        }
        throw new IllegalStateException();
    }

    private static int getWindow4(int[] iArr, int i10) {
        return (iArr[i10 >>> 3] >>> ((i10 & 7) << 2)) & 15;
    }

    private static void implSign(Xof xof, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10, byte[] bArr4, byte b10, byte[] bArr5, int i11, int i12, byte[] bArr6, int i13) {
        dom4(xof, b10, bArr4);
        xof.update(bArr, 57, 57);
        xof.update(bArr5, i11, i12);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] bArrReduce912 = Scalar448.reduce912(bArr);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArrReduce912, bArr7, 0);
        dom4(xof, b10, bArr4);
        xof.update(bArr7, 0, 57);
        xof.update(bArr3, i10, 57);
        xof.update(bArr5, i11, i12);
        xof.doFinal(bArr, 0, bArr.length);
        byte[] bArrCalculateS = calculateS(bArrReduce912, Scalar448.reduce912(bArr), bArr2);
        System.arraycopy(bArr7, 0, bArr6, i13, 57);
        System.arraycopy(bArrCalculateS, 0, bArr6, i13 + 57, 57);
    }

    private static boolean implVerify(byte[] bArr, int i10, PublicPoint publicPoint, byte[] bArr2, byte b10, byte[] bArr3, int i11, int i12) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i10, 57);
        byte[] bArrCopy2 = copy(bArr, i10 + 57, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!Scalar448.checkVar(bArrCopy2, iArr)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        X448Field.negate(publicPoint.data, pointAffine2.f20243x);
        X448Field.copy(publicPoint.data, 16, pointAffine2.f20244y, 0);
        byte[] bArr4 = new byte[57];
        encodePublicPoint(publicPoint, bArr4, 0);
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b10, bArr2);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArr4, 0, 57);
        xofCreateXof.update(bArr3, i11, i12);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        Scalar448.decode(Scalar448.reduce912(bArr5), iArr2);
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        if (!Scalar448.reduceBasisVar(iArr2, iArr3, iArr4)) {
            throw new IllegalStateException();
        }
        Scalar448.multiply225Var(iArr, iArr4, iArr);
        PointProjective pointProjective = new PointProjective();
        scalarMultStraus225Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static void invertZs(PointProjective[] pointProjectiveArr) {
        int length = pointProjectiveArr.length;
        int[] iArrCreateTable = X448Field.createTable(length);
        int[] iArrCreate = X448Field.create();
        X448Field.copy(pointProjectiveArr[0].f20247z, 0, iArrCreate, 0);
        X448Field.copy(iArrCreate, 0, iArrCreateTable, 0);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (i11 >= length) {
                break;
            }
            X448Field.mul(iArrCreate, pointProjectiveArr[i11].f20247z, iArrCreate);
            X448Field.copy(iArrCreate, 0, iArrCreateTable, i11 * 16);
            i10 = i11;
        }
        X448Field.invVar(iArrCreate, iArrCreate);
        int[] iArrCreate2 = X448Field.create();
        while (i10 > 0) {
            int i12 = i10 - 1;
            X448Field.copy(iArrCreateTable, i12 * 16, iArrCreate2, 0);
            X448Field.mul(iArrCreate2, iArrCreate, iArrCreate2);
            X448Field.mul(iArrCreate, pointProjectiveArr[i10].f20247z, iArrCreate);
            X448Field.copy(iArrCreate2, 0, pointProjectiveArr[i10].f20247z, 0);
            i10 = i12;
        }
        X448Field.copy(iArrCreate, 0, pointProjectiveArr[0].f20247z, 0);
    }

    private static void normalizeToAffine(PointProjective pointProjective, PointAffine pointAffine) {
        X448Field.inv(pointProjective.f20247z, pointAffine.f20244y);
        X448Field.mul(pointAffine.f20244y, pointProjective.f20245x, pointAffine.f20243x);
        int[] iArr = pointAffine.f20244y;
        X448Field.mul(iArr, pointProjective.f20246y, iArr);
        X448Field.normalize(pointAffine.f20243x);
        X448Field.normalize(pointAffine.f20244y);
    }

    private static boolean normalizeToNeutralElementVar(PointProjective pointProjective) {
        X448Field.normalize(pointProjective.f20245x);
        X448Field.normalize(pointProjective.f20246y);
        X448Field.normalize(pointProjective.f20247z);
        return X448Field.isZeroVar(pointProjective.f20245x) && !X448Field.isZeroVar(pointProjective.f20246y) && X448Field.areEqualVar(pointProjective.f20246y, pointProjective.f20247z);
    }

    private static void pointAdd(PointAffine pointAffine, PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr = pointTemp.f20249r1;
        int[] iArr2 = pointTemp.f20250r2;
        int[] iArr3 = pointTemp.f20251r3;
        int[] iArr4 = pointTemp.f20252r4;
        int[] iArr5 = pointTemp.f20253r5;
        int[] iArr6 = pointTemp.f20254r6;
        int[] iArr7 = pointTemp.f20255r7;
        X448Field.sqr(pointProjective.f20247z, iArr);
        X448Field.mul(pointAffine.f20243x, pointProjective.f20245x, iArr2);
        X448Field.mul(pointAffine.f20244y, pointProjective.f20246y, iArr3);
        X448Field.mul(iArr2, iArr3, iArr4);
        X448Field.mul(iArr4, C_d, iArr4);
        X448Field.add(iArr, iArr4, iArr5);
        X448Field.sub(iArr, iArr4, iArr6);
        X448Field.add(pointAffine.f20244y, pointAffine.f20243x, iArr7);
        X448Field.add(pointProjective.f20246y, pointProjective.f20245x, iArr4);
        X448Field.mul(iArr7, iArr4, iArr7);
        X448Field.add(iArr3, iArr2, iArr);
        X448Field.sub(iArr3, iArr2, iArr4);
        X448Field.carry(iArr);
        X448Field.sub(iArr7, iArr, iArr7);
        X448Field.mul(iArr7, pointProjective.f20247z, iArr7);
        X448Field.mul(iArr4, pointProjective.f20247z, iArr4);
        X448Field.mul(iArr5, iArr7, pointProjective.f20245x);
        X448Field.mul(iArr4, iArr6, pointProjective.f20246y);
        X448Field.mul(iArr5, iArr6, pointProjective.f20247z);
    }

    private static void pointAddVar(boolean z10, PointAffine pointAffine, PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = pointTemp.f20249r1;
        int[] iArr6 = pointTemp.f20250r2;
        int[] iArr7 = pointTemp.f20251r3;
        int[] iArr8 = pointTemp.f20252r4;
        int[] iArr9 = pointTemp.f20253r5;
        int[] iArr10 = pointTemp.f20254r6;
        int[] iArr11 = pointTemp.f20255r7;
        if (z10) {
            X448Field.sub(pointAffine.f20244y, pointAffine.f20243x, iArr11);
            iArr2 = iArr5;
            iArr = iArr8;
            iArr4 = iArr9;
            iArr3 = iArr10;
        } else {
            X448Field.add(pointAffine.f20244y, pointAffine.f20243x, iArr11);
            iArr = iArr5;
            iArr2 = iArr8;
            iArr3 = iArr9;
            iArr4 = iArr10;
        }
        X448Field.sqr(pointProjective.f20247z, iArr5);
        X448Field.mul(pointAffine.f20243x, pointProjective.f20245x, iArr6);
        X448Field.mul(pointAffine.f20244y, pointProjective.f20246y, iArr7);
        X448Field.mul(iArr6, iArr7, iArr8);
        X448Field.mul(iArr8, C_d, iArr8);
        X448Field.add(iArr5, iArr8, iArr3);
        X448Field.sub(iArr5, iArr8, iArr4);
        X448Field.add(pointProjective.f20246y, pointProjective.f20245x, iArr8);
        X448Field.mul(iArr11, iArr8, iArr11);
        X448Field.add(iArr7, iArr6, iArr);
        X448Field.sub(iArr7, iArr6, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArr11, iArr5, iArr11);
        X448Field.mul(iArr11, pointProjective.f20247z, iArr11);
        X448Field.mul(iArr8, pointProjective.f20247z, iArr8);
        X448Field.mul(iArr9, iArr11, pointProjective.f20245x);
        X448Field.mul(iArr8, iArr10, pointProjective.f20246y);
        X448Field.mul(iArr9, iArr10, pointProjective.f20247z);
    }

    private static void pointCopy(PointAffine pointAffine, PointProjective pointProjective) {
        X448Field.copy(pointAffine.f20243x, 0, pointProjective.f20245x, 0);
        X448Field.copy(pointAffine.f20244y, 0, pointProjective.f20246y, 0);
        X448Field.one(pointProjective.f20247z);
    }

    private static void pointDouble(PointProjective pointProjective, PointTemp pointTemp) {
        int[] iArr = pointTemp.f20249r1;
        int[] iArr2 = pointTemp.f20250r2;
        int[] iArr3 = pointTemp.f20251r3;
        int[] iArr4 = pointTemp.f20252r4;
        int[] iArr5 = pointTemp.f20255r7;
        int[] iArr6 = pointTemp.f20248r0;
        X448Field.add(pointProjective.f20245x, pointProjective.f20246y, iArr);
        X448Field.sqr(iArr, iArr);
        X448Field.sqr(pointProjective.f20245x, iArr2);
        X448Field.sqr(pointProjective.f20246y, iArr3);
        X448Field.add(iArr2, iArr3, iArr4);
        X448Field.carry(iArr4);
        X448Field.sqr(pointProjective.f20247z, iArr5);
        X448Field.add(iArr5, iArr5, iArr5);
        X448Field.carry(iArr5);
        X448Field.sub(iArr4, iArr5, iArr6);
        X448Field.sub(iArr, iArr4, iArr);
        X448Field.sub(iArr2, iArr3, iArr2);
        X448Field.mul(iArr, iArr6, pointProjective.f20245x);
        X448Field.mul(iArr4, iArr2, pointProjective.f20246y);
        X448Field.mul(iArr4, iArr6, pointProjective.f20247z);
    }

    private static void pointLookup(int i10, int i11, PointAffine pointAffine) {
        int i12 = i10 * 512;
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = ((i13 ^ i11) - 1) >> 31;
            X448Field.cmov(i14, PRECOMP_BASE_COMB, i12, pointAffine.f20243x, 0);
            X448Field.cmov(i14, PRECOMP_BASE_COMB, i12 + 16, pointAffine.f20244y, 0);
            i12 += 32;
        }
    }

    private static void pointLookup15(int[] iArr, PointProjective pointProjective) {
        X448Field.copy(iArr, 336, pointProjective.f20245x, 0);
        X448Field.copy(iArr, 352, pointProjective.f20246y, 0);
        X448Field.copy(iArr, 368, pointProjective.f20247z, 0);
    }

    private static void pointPrecompute(PointAffine pointAffine, PointProjective[] pointProjectiveArr, int i10, int i11, PointTemp pointTemp) {
        PointProjective pointProjective = new PointProjective();
        pointCopy(pointAffine, pointProjective);
        pointDouble(pointProjective, pointTemp);
        PointProjective pointProjective2 = new PointProjective();
        pointProjectiveArr[i10] = pointProjective2;
        pointCopy(pointAffine, pointProjective2);
        for (int i12 = 1; i12 < i11; i12++) {
            int i13 = i10 + i12;
            PointProjective pointProjective3 = new PointProjective();
            pointProjectiveArr[i13] = pointProjective3;
            pointCopy(pointProjectiveArr[i13 - 1], pointProjective3);
            pointAdd(pointProjective, pointProjectiveArr[i13], pointTemp);
        }
    }

    private static void pointSetNeutral(PointProjective pointProjective) {
        X448Field.zero(pointProjective.f20245x);
        X448Field.one(pointProjective.f20246y);
        X448Field.one(pointProjective.f20247z);
    }

    public static void precompute() {
        int i10;
        synchronized (PRECOMP_LOCK) {
            try {
                if (PRECOMP_BASE_COMB == null) {
                    PointProjective[] pointProjectiveArr = new PointProjective[144];
                    PointTemp pointTemp = new PointTemp();
                    PointAffine pointAffine = new PointAffine();
                    X448Field.copy(B_x, 0, pointAffine.f20243x, 0);
                    X448Field.copy(B_y, 0, pointAffine.f20244y, 0);
                    pointPrecompute(pointAffine, pointProjectiveArr, 0, 32, pointTemp);
                    PointAffine pointAffine2 = new PointAffine();
                    X448Field.copy(B225_x, 0, pointAffine2.f20243x, 0);
                    X448Field.copy(B225_y, 0, pointAffine2.f20244y, 0);
                    pointPrecompute(pointAffine2, pointProjectiveArr, 32, 32, pointTemp);
                    PointProjective pointProjective = new PointProjective();
                    pointCopy(pointAffine, pointProjective);
                    int i11 = 5;
                    PointProjective[] pointProjectiveArr2 = new PointProjective[5];
                    for (int i12 = 0; i12 < 5; i12++) {
                        pointProjectiveArr2[i12] = new PointProjective();
                    }
                    int i13 = 0;
                    int i14 = 64;
                    while (i13 < i11) {
                        int i15 = i14 + 1;
                        PointProjective pointProjective2 = new PointProjective();
                        pointProjectiveArr[i14] = pointProjective2;
                        int i16 = 0;
                        while (true) {
                            i10 = 1;
                            if (i16 >= i11) {
                                break;
                            }
                            if (i16 == 0) {
                                pointCopy(pointProjective, pointProjective2);
                            } else {
                                pointAdd(pointProjective, pointProjective2, pointTemp);
                            }
                            pointDouble(pointProjective, pointTemp);
                            pointCopy(pointProjective, pointProjectiveArr2[i16]);
                            if (i13 + i16 != 8) {
                                while (i10 < 18) {
                                    pointDouble(pointProjective, pointTemp);
                                    i10++;
                                }
                            }
                            i16++;
                            i11 = 5;
                        }
                        int[] iArr = pointProjective2.f20245x;
                        X448Field.negate(iArr, iArr);
                        int i17 = 0;
                        i14 = i15;
                        while (i17 < 4) {
                            int i18 = i10 << i17;
                            int i19 = 0;
                            while (i19 < i18) {
                                PointProjective pointProjective3 = new PointProjective();
                                pointProjectiveArr[i14] = pointProjective3;
                                pointCopy(pointProjectiveArr[i14 - i18], pointProjective3);
                                pointAdd(pointProjectiveArr2[i17], pointProjectiveArr[i14], pointTemp);
                                i19++;
                                i14++;
                            }
                            i17++;
                            i10 = 1;
                        }
                        i13++;
                        i11 = 5;
                    }
                    invertZs(pointProjectiveArr);
                    PRECOMP_BASE_WNAF = new PointAffine[32];
                    for (int i20 = 0; i20 < 32; i20++) {
                        PointProjective pointProjective4 = pointProjectiveArr[i20];
                        PointAffine[] pointAffineArr = PRECOMP_BASE_WNAF;
                        PointAffine pointAffine3 = new PointAffine();
                        pointAffineArr[i20] = pointAffine3;
                        X448Field.mul(pointProjective4.f20245x, pointProjective4.f20247z, pointAffine3.f20243x);
                        X448Field.normalize(pointAffine3.f20243x);
                        X448Field.mul(pointProjective4.f20246y, pointProjective4.f20247z, pointAffine3.f20244y);
                        X448Field.normalize(pointAffine3.f20244y);
                    }
                    PRECOMP_BASE225_WNAF = new PointAffine[32];
                    for (int i21 = 0; i21 < 32; i21++) {
                        PointProjective pointProjective5 = pointProjectiveArr[32 + i21];
                        PointAffine[] pointAffineArr2 = PRECOMP_BASE225_WNAF;
                        PointAffine pointAffine4 = new PointAffine();
                        pointAffineArr2[i21] = pointAffine4;
                        X448Field.mul(pointProjective5.f20245x, pointProjective5.f20247z, pointAffine4.f20243x);
                        X448Field.normalize(pointAffine4.f20243x);
                        X448Field.mul(pointProjective5.f20246y, pointProjective5.f20247z, pointAffine4.f20244y);
                        X448Field.normalize(pointAffine4.f20244y);
                    }
                    PRECOMP_BASE_COMB = X448Field.createTable(160);
                    int i22 = 0;
                    for (int i23 = 64; i23 < 144; i23++) {
                        PointProjective pointProjective6 = pointProjectiveArr[i23];
                        int[] iArr2 = pointProjective6.f20245x;
                        X448Field.mul(iArr2, pointProjective6.f20247z, iArr2);
                        X448Field.normalize(pointProjective6.f20245x);
                        int[] iArr3 = pointProjective6.f20246y;
                        X448Field.mul(iArr3, pointProjective6.f20247z, iArr3);
                        X448Field.normalize(pointProjective6.f20246y);
                        X448Field.copy(pointProjective6.f20245x, 0, PRECOMP_BASE_COMB, i22);
                        X448Field.copy(pointProjective6.f20246y, 0, PRECOMP_BASE_COMB, i22 + 16);
                        i22 += 32;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void pruneScalar(byte[] bArr, int i10, byte[] bArr2) {
        System.arraycopy(bArr, i10, bArr2, 0, 56);
        bArr2[0] = (byte) (bArr2[0] & 252);
        bArr2[55] = (byte) (bArr2[55] | 128);
        bArr2[56] = 0;
    }

    private static void scalarMult(byte[] bArr, PointProjective pointProjective, PointProjective pointProjective2) {
        int[] iArr = new int[15];
        Scalar448.decode(bArr, iArr);
        Scalar448.toSignedDigits(449, iArr, iArr);
        PointProjective pointProjective3 = new PointProjective();
        PointTemp pointTemp = new PointTemp();
        int[] iArrPointPrecompute = pointPrecompute(pointProjective, 8, pointTemp);
        pointLookup15(iArrPointPrecompute, pointProjective2);
        pointAdd(pointProjective, pointProjective2, pointTemp);
        int i10 = 111;
        while (true) {
            pointLookup(iArr, i10, iArrPointPrecompute, pointProjective3);
            pointAdd(pointProjective3, pointProjective2, pointTemp);
            i10--;
            if (i10 < 0) {
                return;
            }
            for (int i11 = 0; i11 < 4; i11++) {
                pointDouble(pointProjective2, pointTemp);
            }
        }
    }

    private static void scalarMultBase(byte[] bArr, PointProjective pointProjective) {
        precompute();
        int[] iArr = new int[15];
        Scalar448.decode(bArr, iArr);
        Scalar448.toSignedDigits(PRECOMP_RANGE, iArr, iArr);
        PointAffine pointAffine = new PointAffine();
        PointTemp pointTemp = new PointTemp();
        pointSetNeutral(pointProjective);
        int i10 = 17;
        while (true) {
            int i11 = i10;
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = 0;
                for (int i14 = 0; i14 < 5; i14++) {
                    i13 = (i13 & (~(1 << i14))) ^ ((iArr[i11 >>> 5] >>> (i11 & 31)) << i14);
                    i11 += 18;
                }
                int i15 = (i13 >>> 4) & 1;
                pointLookup(i12, ((-i15) ^ i13) & 15, pointAffine);
                X448Field.cnegate(i15, pointAffine.f20243x);
                pointAdd(pointAffine, pointProjective, pointTemp);
            }
            i10--;
            if (i10 < 0) {
                return;
            } else {
                pointDouble(pointProjective, pointTemp);
            }
        }
    }

    private static void scalarMultBaseEncoded(byte[] bArr, byte[] bArr2, int i10) {
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr, pointProjective);
        if (encodeResult(pointProjective, bArr2, i10) == 0) {
            throw new IllegalStateException();
        }
    }

    public static void scalarMultBaseXY(X448.Friend friend, byte[] bArr, int i10, int[] iArr, int[] iArr2) {
        if (friend == null) {
            throw new NullPointerException("This method is only for use by X448");
        }
        byte[] bArr2 = new byte[57];
        pruneScalar(bArr, i10, bArr2);
        PointProjective pointProjective = new PointProjective();
        scalarMultBase(bArr2, pointProjective);
        if (checkPoint(pointProjective) == 0) {
            throw new IllegalStateException();
        }
        X448Field.copy(pointProjective.f20245x, 0, iArr, 0);
        X448Field.copy(pointProjective.f20246y, 0, iArr2, 0);
    }

    private static void scalarMultOrderVar(PointAffine pointAffine, PointProjective pointProjective) {
        byte[] bArr = new byte[447];
        Scalar448.getOrderWnafVar(5, bArr);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        PointTemp pointTemp = new PointTemp();
        pointPrecompute(pointAffine, pointProjectiveArr, 0, 8, pointTemp);
        pointSetNeutral(pointProjective);
        int i10 = 446;
        while (true) {
            byte b10 = bArr[i10];
            if (b10 != 0) {
                pointAddVar(b10 < 0, pointProjectiveArr[(b10 >> 1) ^ (b10 >> 31)], pointProjective, pointTemp);
            }
            i10--;
            if (i10 < 0) {
                return;
            } else {
                pointDouble(pointProjective, pointTemp);
            }
        }
    }

    private static void scalarMultStraus225Var(int[] iArr, int[] iArr2, PointAffine pointAffine, int[] iArr3, PointAffine pointAffine2, PointProjective pointProjective) {
        int i10;
        precompute();
        byte[] bArr = new byte[PRECOMP_RANGE];
        int i11 = 225;
        byte[] bArr2 = new byte[225];
        byte[] bArr3 = new byte[225];
        Wnaf.getSignedVar(iArr, 7, bArr);
        Wnaf.getSignedVar(iArr2, 5, bArr2);
        Wnaf.getSignedVar(iArr3, 5, bArr3);
        PointProjective[] pointProjectiveArr = new PointProjective[8];
        PointProjective[] pointProjectiveArr2 = new PointProjective[8];
        PointTemp pointTemp = new PointTemp();
        pointPrecompute(pointAffine, pointProjectiveArr, 0, 8, pointTemp);
        pointPrecompute(pointAffine2, pointProjectiveArr2, 0, 8, pointTemp);
        pointSetNeutral(pointProjective);
        while (true) {
            i10 = i11 - 1;
            if (i10 < 0 || (bArr[i10] | bArr[i11 + BERTags.FLAGS] | bArr2[i10] | bArr3[i10]) != 0) {
                break;
            } else {
                i11 = i10;
            }
        }
        while (i10 >= 0) {
            byte b10 = bArr[i10];
            if (b10 != 0) {
                pointAddVar(b10 < 0, PRECOMP_BASE_WNAF[(b10 >> 1) ^ (b10 >> 31)], pointProjective, pointTemp);
            }
            byte b11 = bArr[i10 + 225];
            if (b11 != 0) {
                pointAddVar(b11 < 0, PRECOMP_BASE225_WNAF[(b11 >> 1) ^ (b11 >> 31)], pointProjective, pointTemp);
            }
            byte b12 = bArr2[i10];
            if (b12 != 0) {
                pointAddVar(b12 < 0, pointProjectiveArr[(b12 >> 1) ^ (b12 >> 31)], pointProjective, pointTemp);
            }
            byte b13 = bArr3[i10];
            if (b13 != 0) {
                pointAddVar(b13 < 0, pointProjectiveArr2[(b13 >> 1) ^ (b13 >> 31)], pointProjective, pointTemp);
            }
            pointDouble(pointProjective, pointTemp);
            i10--;
        }
        pointDouble(pointProjective, pointTemp);
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Xof xof, byte[] bArr4, int i12) {
        byte[] bArr5 = new byte[64];
        if (64 != xof.doFinal(bArr5, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr5, 0, 64, bArr4, i12);
    }

    public static boolean validatePublicKeyFull(byte[] bArr, int i10) {
        byte[] bArrCopy = copy(bArr, i10, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return checkPointOrderVar(pointAffine);
        }
        return false;
    }

    public static PublicPoint validatePublicKeyFullExport(byte[] bArr, int i10) {
        byte[] bArrCopy = copy(bArr, i10, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine) && checkPointOrderVar(pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean validatePublicKeyPartial(byte[] bArr, int i10) {
        byte[] bArrCopy = copy(bArr, i10, 57);
        if (checkPointFullVar(bArrCopy)) {
            return decodePointVar(bArrCopy, false, new PointAffine());
        }
        return false;
    }

    public static PublicPoint validatePublicKeyPartialExport(byte[] bArr, int i10) {
        byte[] bArrCopy = copy(bArr, i10, 57);
        if (!checkPointFullVar(bArrCopy)) {
            return null;
        }
        PointAffine pointAffine = new PointAffine();
        if (decodePointVar(bArrCopy, false, pointAffine)) {
            return exportPoint(pointAffine);
        }
        return null;
    }

    public static boolean verify(byte[] bArr, int i10, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i11, int i12) {
        return implVerify(bArr, i10, publicPoint, bArr2, (byte) 0, bArr3, i11, i12);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, PublicPoint publicPoint, byte[] bArr2, Xof xof) {
        byte[] bArr3 = new byte[64];
        if (64 == xof.doFinal(bArr3, 0, 64)) {
            return implVerify(bArr, i10, publicPoint, bArr2, (byte) 1, bArr3, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    private static int checkPoint(PointProjective pointProjective) {
        int[] iArrCreate = X448Field.create();
        int[] iArrCreate2 = X448Field.create();
        int[] iArrCreate3 = X448Field.create();
        int[] iArrCreate4 = X448Field.create();
        X448Field.sqr(pointProjective.f20245x, iArrCreate2);
        X448Field.sqr(pointProjective.f20246y, iArrCreate3);
        X448Field.sqr(pointProjective.f20247z, iArrCreate4);
        X448Field.mul(iArrCreate2, iArrCreate3, iArrCreate);
        X448Field.add(iArrCreate2, iArrCreate3, iArrCreate2);
        X448Field.mul(iArrCreate2, iArrCreate4, iArrCreate2);
        X448Field.sqr(iArrCreate4, iArrCreate4);
        X448Field.mul(iArrCreate, C_d, iArrCreate);
        X448Field.sub(iArrCreate, iArrCreate4, iArrCreate);
        X448Field.add(iArrCreate, iArrCreate2, iArrCreate);
        X448Field.normalize(iArrCreate);
        X448Field.normalize(iArrCreate3);
        X448Field.normalize(iArrCreate4);
        return X448Field.isZero(iArrCreate) & (~X448Field.isZero(iArrCreate3)) & (~X448Field.isZero(iArrCreate4));
    }

    public static void generatePublicKey(byte[] bArr, int i10, byte[] bArr2, int i11) {
        Xof xofCreateXof = createXof();
        byte[] bArr3 = new byte[114];
        xofCreateXof.update(bArr, i10, 57);
        xofCreateXof.doFinal(bArr3, 0, 114);
        byte[] bArr4 = new byte[57];
        pruneScalar(bArr3, 0, bArr4);
        scalarMultBaseEncoded(bArr4, bArr2, i11);
    }

    private static void implSign(byte[] bArr, int i10, byte[] bArr2, byte b10, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        if (!checkContextVar(bArr2)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        xofCreateXof.update(bArr, i10, 57);
        xofCreateXof.doFinal(bArr5, 0, 114);
        byte[] bArr6 = new byte[57];
        pruneScalar(bArr5, 0, bArr6);
        byte[] bArr7 = new byte[57];
        scalarMultBaseEncoded(bArr6, bArr7, 0);
        implSign(xofCreateXof, bArr5, bArr6, bArr7, 0, bArr2, b10, bArr3, i11, i12, bArr4, i13);
    }

    private static boolean implVerify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        byte[] bArrCopy = copy(bArr, i10, 57);
        byte[] bArrCopy2 = copy(bArr, i10 + 57, 57);
        byte[] bArrCopy3 = copy(bArr2, i11, 57);
        if (!checkPointVar(bArrCopy)) {
            return false;
        }
        int[] iArr = new int[14];
        if (!Scalar448.checkVar(bArrCopy2, iArr) || !checkPointFullVar(bArrCopy3)) {
            return false;
        }
        PointAffine pointAffine = new PointAffine();
        if (!decodePointVar(bArrCopy, true, pointAffine)) {
            return false;
        }
        PointAffine pointAffine2 = new PointAffine();
        if (!decodePointVar(bArrCopy3, true, pointAffine2)) {
            return false;
        }
        Xof xofCreateXof = createXof();
        byte[] bArr5 = new byte[114];
        dom4(xofCreateXof, b10, bArr3);
        xofCreateXof.update(bArrCopy, 0, 57);
        xofCreateXof.update(bArrCopy3, 0, 57);
        xofCreateXof.update(bArr4, i12, i13);
        xofCreateXof.doFinal(bArr5, 0, 114);
        int[] iArr2 = new int[14];
        Scalar448.decode(Scalar448.reduce912(bArr5), iArr2);
        int[] iArr3 = new int[8];
        int[] iArr4 = new int[8];
        if (!Scalar448.reduceBasisVar(iArr2, iArr3, iArr4)) {
            throw new IllegalStateException();
        }
        Scalar448.multiply225Var(iArr, iArr4, iArr);
        PointProjective pointProjective = new PointProjective();
        scalarMultStraus225Var(iArr, iArr3, pointAffine2, iArr4, pointAffine, pointProjective);
        return normalizeToNeutralElementVar(pointProjective);
    }

    private static void pointAdd(PointProjective pointProjective, PointProjective pointProjective2, PointTemp pointTemp) {
        int[] iArr = pointTemp.f20248r0;
        int[] iArr2 = pointTemp.f20249r1;
        int[] iArr3 = pointTemp.f20250r2;
        int[] iArr4 = pointTemp.f20251r3;
        int[] iArr5 = pointTemp.f20252r4;
        int[] iArr6 = pointTemp.f20253r5;
        int[] iArr7 = pointTemp.f20254r6;
        int[] iArr8 = pointTemp.f20255r7;
        X448Field.mul(pointProjective.f20247z, pointProjective2.f20247z, iArr);
        X448Field.sqr(iArr, iArr2);
        X448Field.mul(pointProjective.f20245x, pointProjective2.f20245x, iArr3);
        X448Field.mul(pointProjective.f20246y, pointProjective2.f20246y, iArr4);
        X448Field.mul(iArr3, iArr4, iArr5);
        X448Field.mul(iArr5, C_d, iArr5);
        X448Field.add(iArr2, iArr5, iArr6);
        X448Field.sub(iArr2, iArr5, iArr7);
        X448Field.add(pointProjective.f20246y, pointProjective.f20245x, iArr8);
        X448Field.add(pointProjective2.f20246y, pointProjective2.f20245x, iArr5);
        X448Field.mul(iArr8, iArr5, iArr8);
        X448Field.add(iArr4, iArr3, iArr2);
        X448Field.sub(iArr4, iArr3, iArr5);
        X448Field.carry(iArr2);
        X448Field.sub(iArr8, iArr2, iArr8);
        X448Field.mul(iArr8, iArr, iArr8);
        X448Field.mul(iArr5, iArr, iArr5);
        X448Field.mul(iArr6, iArr8, pointProjective2.f20245x);
        X448Field.mul(iArr5, iArr7, pointProjective2.f20246y);
        X448Field.mul(iArr6, iArr7, pointProjective2.f20247z);
    }

    private static void pointAddVar(boolean z10, PointProjective pointProjective, PointProjective pointProjective2, PointTemp pointTemp) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        int[] iArr5 = pointTemp.f20248r0;
        int[] iArr6 = pointTemp.f20249r1;
        int[] iArr7 = pointTemp.f20250r2;
        int[] iArr8 = pointTemp.f20251r3;
        int[] iArr9 = pointTemp.f20252r4;
        int[] iArr10 = pointTemp.f20253r5;
        int[] iArr11 = pointTemp.f20254r6;
        int[] iArr12 = pointTemp.f20255r7;
        if (z10) {
            X448Field.sub(pointProjective.f20246y, pointProjective.f20245x, iArr12);
            iArr2 = iArr6;
            iArr = iArr9;
            iArr4 = iArr10;
            iArr3 = iArr11;
        } else {
            X448Field.add(pointProjective.f20246y, pointProjective.f20245x, iArr12);
            iArr = iArr6;
            iArr2 = iArr9;
            iArr3 = iArr10;
            iArr4 = iArr11;
        }
        X448Field.mul(pointProjective.f20247z, pointProjective2.f20247z, iArr5);
        X448Field.sqr(iArr5, iArr6);
        X448Field.mul(pointProjective.f20245x, pointProjective2.f20245x, iArr7);
        X448Field.mul(pointProjective.f20246y, pointProjective2.f20246y, iArr8);
        X448Field.mul(iArr7, iArr8, iArr9);
        X448Field.mul(iArr9, C_d, iArr9);
        X448Field.add(iArr6, iArr9, iArr3);
        X448Field.sub(iArr6, iArr9, iArr4);
        X448Field.add(pointProjective2.f20246y, pointProjective2.f20245x, iArr9);
        X448Field.mul(iArr12, iArr9, iArr12);
        X448Field.add(iArr8, iArr7, iArr);
        X448Field.sub(iArr8, iArr7, iArr2);
        X448Field.carry(iArr);
        X448Field.sub(iArr12, iArr6, iArr12);
        X448Field.mul(iArr12, iArr5, iArr12);
        X448Field.mul(iArr9, iArr5, iArr9);
        X448Field.mul(iArr10, iArr12, pointProjective2.f20245x);
        X448Field.mul(iArr9, iArr11, pointProjective2.f20246y);
        X448Field.mul(iArr10, iArr11, pointProjective2.f20247z);
    }

    private static void pointCopy(PointProjective pointProjective, PointProjective pointProjective2) {
        X448Field.copy(pointProjective.f20245x, 0, pointProjective2.f20245x, 0);
        X448Field.copy(pointProjective.f20246y, 0, pointProjective2.f20246y, 0);
        X448Field.copy(pointProjective.f20247z, 0, pointProjective2.f20247z, 0);
    }

    private static void pointLookup(int[] iArr, int i10, int[] iArr2, PointProjective pointProjective) {
        int window4 = getWindow4(iArr, i10);
        int i11 = (window4 >>> 3) ^ 1;
        int i12 = (window4 ^ (-i11)) & 7;
        int i13 = 0;
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = ((i14 ^ i12) - 1) >> 31;
            X448Field.cmov(i15, iArr2, i13, pointProjective.f20245x, 0);
            X448Field.cmov(i15, iArr2, i13 + 16, pointProjective.f20246y, 0);
            X448Field.cmov(i15, iArr2, i13 + 32, pointProjective.f20247z, 0);
            i13 += 48;
        }
        X448Field.cnegate(i11, pointProjective.f20245x);
    }

    private static int[] pointPrecompute(PointProjective pointProjective, int i10, PointTemp pointTemp) {
        PointProjective pointProjective2 = new PointProjective();
        pointCopy(pointProjective, pointProjective2);
        PointProjective pointProjective3 = new PointProjective();
        pointCopy(pointProjective, pointProjective3);
        pointDouble(pointProjective3, pointTemp);
        int[] iArrCreateTable = X448Field.createTable(i10 * 3);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            X448Field.copy(pointProjective2.f20245x, 0, iArrCreateTable, i11);
            X448Field.copy(pointProjective2.f20246y, 0, iArrCreateTable, i11 + 16);
            X448Field.copy(pointProjective2.f20247z, 0, iArrCreateTable, i11 + 32);
            i11 += 48;
            i12++;
            if (i12 == i10) {
                return iArrCreateTable;
            }
            pointAdd(pointProjective3, pointProjective2, pointTemp);
        }
    }

    public static void sign(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, int i12, byte[] bArr4, int i13) {
        implSign(bArr, i10, bArr2, (byte) 0, bArr3, i11, i12, bArr4, i13);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, byte[] bArr5, int i13) {
        implSign(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64, bArr5, i13);
    }

    public static boolean verify(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12, int i13) {
        return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 0, bArr4, i12, i13);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, PublicPoint publicPoint, byte[] bArr2, byte[] bArr3, int i11) {
        return implVerify(bArr, i10, publicPoint, bArr2, (byte) 1, bArr3, i11, 64);
    }

    private static void implSign(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte b10, byte[] bArr4, int i12, int i13, byte[] bArr5, int i14) {
        if (!checkContextVar(bArr3)) {
            throw new IllegalArgumentException("ctx");
        }
        Xof xofCreateXof = createXof();
        byte[] bArr6 = new byte[114];
        xofCreateXof.update(bArr, i10, 57);
        xofCreateXof.doFinal(bArr6, 0, 114);
        byte[] bArr7 = new byte[57];
        pruneScalar(bArr6, 0, bArr7);
        implSign(xofCreateXof, bArr6, bArr7, bArr2, i11, bArr3, b10, bArr4, i12, i13, bArr5, i14);
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, Xof xof, byte[] bArr3, int i11) {
        byte[] bArr4 = new byte[64];
        if (64 != xof.doFinal(bArr4, 0, 64)) {
            throw new IllegalArgumentException("ph");
        }
        implSign(bArr, i10, bArr2, (byte) 1, bArr4, 0, 64, bArr3, i11);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, Xof xof) {
        byte[] bArr4 = new byte[64];
        if (64 == xof.doFinal(bArr4, 0, 64)) {
            return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, 0, 64);
        }
        throw new IllegalArgumentException("ph");
    }

    public static void signPrehash(byte[] bArr, int i10, byte[] bArr2, byte[] bArr3, int i11, byte[] bArr4, int i12) {
        implSign(bArr, i10, bArr2, (byte) 1, bArr3, i11, 64, bArr4, i12);
    }

    public static boolean verifyPrehash(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, byte[] bArr4, int i12) {
        return implVerify(bArr, i10, bArr2, i11, bArr3, (byte) 1, bArr4, i12, 64);
    }
}
