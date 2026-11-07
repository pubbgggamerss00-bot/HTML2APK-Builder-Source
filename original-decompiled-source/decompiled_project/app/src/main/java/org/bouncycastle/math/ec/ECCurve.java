package org.bouncycastle.math.ec;

import j2.y;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Random;
import java.util.Set;
import m.b;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.Primes;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.math.ec.endo.ECEndomorphism;
import org.bouncycastle.math.ec.endo.GLVEndomorphism;
import org.bouncycastle.math.field.FiniteField;
import org.bouncycastle.math.field.FiniteFields;
import org.bouncycastle.math.raw.Nat;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* loaded from: classes3.dex */
public abstract class ECCurve {
    public static final int COORD_AFFINE = 0;
    public static final int COORD_HOMOGENEOUS = 1;
    public static final int COORD_JACOBIAN = 2;
    public static final int COORD_JACOBIAN_CHUDNOVSKY = 3;
    public static final int COORD_JACOBIAN_MODIFIED = 4;
    public static final int COORD_LAMBDA_AFFINE = 5;
    public static final int COORD_LAMBDA_PROJECTIVE = 6;
    public static final int COORD_SKEWED = 7;

    /* renamed from: a, reason: collision with root package name */
    protected ECFieldElement f20173a;

    /* renamed from: b, reason: collision with root package name */
    protected ECFieldElement f20174b;
    protected BigInteger cofactor;
    protected FiniteField field;
    protected BigInteger order;
    protected int coord = 0;
    protected ECEndomorphism endomorphism = null;
    protected ECMultiplier multiplier = null;

    public static abstract class AbstractF2m extends ECCurve {
        private BigInteger[] si;

        public AbstractF2m(int i10, int i11, int i12, int i13) {
            super(buildField(i10, i11, i12, i13));
            this.si = null;
            if (Properties.isOverrideSet("org.bouncycastle.ec.disable")) {
                throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable\"");
            }
            if (Properties.isOverrideSet("org.bouncycastle.ec.disable_f2m")) {
                throw new UnsupportedOperationException("F2M disabled by \"org.bouncycastle.ec.disable_f2m\"");
            }
        }

        private static FiniteField buildField(int i10, int i11, int i12, int i13) {
            if (i10 <= Properties.asInteger("org.bouncycastle.ec.max_f2m_field_size", 1142)) {
                return FiniteFields.getBinaryExtensionField((i12 | i13) == 0 ? new int[]{0, i11, i10} : new int[]{0, i11, i12, i13, i10});
            }
            throw new IllegalArgumentException(y.a(i10, "field size out of range: "));
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, int i10) {
            BigInteger bigIntegerCreateRandomBigInteger;
            do {
                bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(i10, secureRandom);
            } while (bigIntegerCreateRandomBigInteger.signum() <= 0);
            return bigIntegerCreateRandomBigInteger;
        }

        public static BigInteger inverse(int i10, int[] iArr, BigInteger bigInteger) {
            return new LongArray(bigInteger).modInverse(i10, iArr).toBigInteger();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(bigInteger2);
            int coordinateSystem = getCoordinateSystem();
            if (coordinateSystem == 5 || coordinateSystem == 6) {
                if (!eCFieldElementFromBigInteger.isZero()) {
                    eCFieldElementFromBigInteger2 = eCFieldElementFromBigInteger2.divide(eCFieldElementFromBigInteger).add(eCFieldElementFromBigInteger);
                } else if (!eCFieldElementFromBigInteger2.square().equals(getB())) {
                    throw new IllegalArgumentException();
                }
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementFromBigInteger2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i10, BigInteger bigInteger) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            if (eCFieldElementFromBigInteger.isZero()) {
                eCFieldElementAdd = getB().sqrt();
            } else {
                ECFieldElement eCFieldElementSolveQuadraticEquation = solveQuadraticEquation(eCFieldElementFromBigInteger.square().invert().multiply(getB()).add(getA()).add(eCFieldElementFromBigInteger));
                if (eCFieldElementSolveQuadraticEquation != null) {
                    if (eCFieldElementSolveQuadraticEquation.testBitZero() != (i10 == 1)) {
                        eCFieldElementSolveQuadraticEquation = eCFieldElementSolveQuadraticEquation.addOne();
                    }
                    int coordinateSystem = getCoordinateSystem();
                    eCFieldElementAdd = (coordinateSystem == 5 || coordinateSystem == 6) ? eCFieldElementSolveQuadraticEquation.add(eCFieldElementFromBigInteger) : eCFieldElementSolveQuadraticEquation.multiply(eCFieldElementFromBigInteger);
                } else {
                    eCFieldElementAdd = null;
                }
            }
            if (eCFieldElementAdd != null) {
                return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementAdd);
            }
            throw new IllegalArgumentException("Invalid point compression");
        }

        public synchronized BigInteger[] getSi() {
            try {
                if (this.si == null) {
                    this.si = Tnaf.getSi(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.si;
        }

        public boolean isKoblitz() {
            if (this.order == null || this.cofactor == null || !this.f20174b.isOne()) {
                return false;
            }
            return this.f20173a.isZero() || this.f20173a.isOne();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.bitLength() <= getFieldSize();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            return fromBigInteger(BigIntegers.createRandomBigInteger(getFieldSize(), secureRandom));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            int fieldSize = getFieldSize();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, fieldSize)));
        }

        public ECFieldElement solveQuadraticEquation(ECFieldElement eCFieldElement) {
            ECFieldElement eCFieldElementAdd;
            ECFieldElement.AbstractF2m abstractF2m = (ECFieldElement.AbstractF2m) eCFieldElement;
            boolean zHasFastTrace = abstractF2m.hasFastTrace();
            if (zHasFastTrace && abstractF2m.trace() != 0) {
                return null;
            }
            int fieldSize = getFieldSize();
            if ((fieldSize & 1) != 0) {
                ECFieldElement eCFieldElementHalfTrace = abstractF2m.halfTrace();
                if (zHasFastTrace || eCFieldElementHalfTrace.square().add(eCFieldElementHalfTrace).add(eCFieldElement).isZero()) {
                    return eCFieldElementHalfTrace;
                }
                return null;
            }
            if (eCFieldElement.isZero()) {
                return eCFieldElement;
            }
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(ECConstants.ZERO);
            Random random = new Random();
            do {
                ECFieldElement eCFieldElementFromBigInteger2 = fromBigInteger(new BigInteger(fieldSize, random));
                ECFieldElement eCFieldElementAdd2 = eCFieldElement;
                eCFieldElementAdd = eCFieldElementFromBigInteger;
                for (int i10 = 1; i10 < fieldSize; i10++) {
                    ECFieldElement eCFieldElementSquare = eCFieldElementAdd2.square();
                    eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElementSquare.multiply(eCFieldElementFromBigInteger2));
                    eCFieldElementAdd2 = eCFieldElementSquare.add(eCFieldElement);
                }
                if (!eCFieldElementAdd2.isZero()) {
                    return null;
                }
            } while (eCFieldElementAdd.square().add(eCFieldElementAdd).isZero());
            return eCFieldElementAdd;
        }
    }

    public static abstract class AbstractFp extends ECCurve {
        public AbstractFp(BigInteger bigInteger) {
            super(FiniteFields.getPrimeField(bigInteger));
        }

        private static BigInteger implRandomFieldElement(SecureRandom secureRandom, BigInteger bigInteger) {
            BigInteger bigIntegerCreateRandomBigInteger;
            do {
                bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
            } while (bigIntegerCreateRandomBigInteger.compareTo(bigInteger) >= 0);
            return bigIntegerCreateRandomBigInteger;
        }

        private static BigInteger implRandomFieldElementMult(SecureRandom secureRandom, BigInteger bigInteger) {
            while (true) {
                BigInteger bigIntegerCreateRandomBigInteger = BigIntegers.createRandomBigInteger(bigInteger.bitLength(), secureRandom);
                if (bigIntegerCreateRandomBigInteger.signum() > 0 && bigIntegerCreateRandomBigInteger.compareTo(bigInteger) < 0) {
                    return bigIntegerCreateRandomBigInteger;
                }
            }
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint decompressPoint(int i10, BigInteger bigInteger) {
            ECFieldElement eCFieldElementFromBigInteger = fromBigInteger(bigInteger);
            ECFieldElement eCFieldElementSqrt = eCFieldElementFromBigInteger.square().add(this.f20173a).multiply(eCFieldElementFromBigInteger).add(this.f20174b).sqrt();
            if (eCFieldElementSqrt == null) {
                throw new IllegalArgumentException("Invalid point compression");
            }
            if (eCFieldElementSqrt.testBitZero() != (i10 == 1)) {
                eCFieldElementSqrt = eCFieldElementSqrt.negate();
            }
            return createRawPoint(eCFieldElementFromBigInteger, eCFieldElementSqrt);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean isValidFieldElement(BigInteger bigInteger) {
            return bigInteger != null && bigInteger.signum() >= 0 && bigInteger.compareTo(getField().getCharacteristic()) < 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElement(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElement(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElement(secureRandom, characteristic)));
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement randomFieldElementMult(SecureRandom secureRandom) {
            BigInteger characteristic = getField().getCharacteristic();
            return fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)).multiply(fromBigInteger(implRandomFieldElementMult(secureRandom, characteristic)));
        }
    }

    public class Config {
        protected int coord;
        protected ECEndomorphism endomorphism;
        protected ECMultiplier multiplier;

        public Config(int i10, ECEndomorphism eCEndomorphism, ECMultiplier eCMultiplier) {
            this.coord = i10;
            this.endomorphism = eCEndomorphism;
            this.multiplier = eCMultiplier;
        }

        public ECCurve create() {
            if (!ECCurve.this.supportsCoordinateSystem(this.coord)) {
                throw new IllegalStateException("unsupported coordinate system");
            }
            ECCurve eCCurveCloneCurve = ECCurve.this.cloneCurve();
            if (eCCurveCloneCurve == ECCurve.this) {
                throw new IllegalStateException("implementation returned current curve");
            }
            synchronized (eCCurveCloneCurve) {
                eCCurveCloneCurve.coord = this.coord;
                eCCurveCloneCurve.endomorphism = this.endomorphism;
                eCCurveCloneCurve.multiplier = this.multiplier;
            }
            return eCCurveCloneCurve;
        }

        public Config setCoordinateSystem(int i10) {
            this.coord = i10;
            return this;
        }

        public Config setEndomorphism(ECEndomorphism eCEndomorphism) {
            this.endomorphism = eCEndomorphism;
            return this;
        }

        public Config setMultiplier(ECMultiplier eCMultiplier) {
            this.multiplier = eCMultiplier;
            return this;
        }
    }

    public static class F2m extends AbstractF2m {
        private static final int F2M_DEFAULT_COORDS = 6;
        private ECPoint.F2m infinity;

        /* renamed from: k1, reason: collision with root package name */
        private int f20175k1;

        /* renamed from: k2, reason: collision with root package name */
        private int f20176k2;

        /* renamed from: k3, reason: collision with root package name */
        private int f20177k3;

        /* renamed from: m, reason: collision with root package name */
        private int f20178m;

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, i12, i13, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new F2m(this.f20178m, this.f20175k1, this.f20176k2, this.f20177k3, this.f20173a, this.f20174b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
            final int i12 = (this.f20178m + 63) >>> 6;
            final int[] iArr = isTrinomial() ? new int[]{this.f20175k1} : new int[]{this.f20175k1, this.f20176k2, this.f20177k3};
            final long[] jArr = new long[i11 * i12 * 2];
            int i13 = 0;
            for (int i14 = 0; i14 < i11; i14++) {
                ECPoint eCPoint = eCPointArr[i10 + i14];
                ((ECFieldElement.F2m) eCPoint.getRawXCoord()).f20182x.copyTo(jArr, i13);
                int i15 = i13 + i12;
                ((ECFieldElement.F2m) eCPoint.getRawYCoord()).f20182x.copyTo(jArr, i15);
                i13 = i15 + i12;
            }
            return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.F2m.1
                private ECPoint createPoint(long[] jArr2, long[] jArr3) {
                    return F2m.this.createRawPoint(new ECFieldElement.F2m(F2m.this.f20178m, iArr, new LongArray(jArr2)), new ECFieldElement.F2m(F2m.this.f20178m, iArr, new LongArray(jArr3)));
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public int getSize() {
                    return i11;
                }

                @Override // org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookup(int i16) {
                    int i17;
                    long[] jArrCreate64 = Nat.create64(i12);
                    long[] jArrCreate642 = Nat.create64(i12);
                    int i18 = 0;
                    for (int i19 = 0; i19 < i11; i19++) {
                        long j10 = ((i19 ^ i16) - 1) >> 31;
                        int i20 = 0;
                        while (true) {
                            i17 = i12;
                            if (i20 < i17) {
                                long j11 = jArrCreate64[i20];
                                long[] jArr2 = jArr;
                                jArrCreate64[i20] = j11 ^ (jArr2[i18 + i20] & j10);
                                jArrCreate642[i20] = jArrCreate642[i20] ^ (jArr2[(i17 + i18) + i20] & j10);
                                i20++;
                            }
                        }
                        i18 += i17 * 2;
                    }
                    return createPoint(jArrCreate64, jArrCreate642);
                }

                @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
                public ECPoint lookupVar(int i16) {
                    long[] jArrCreate64 = Nat.create64(i12);
                    long[] jArrCreate642 = Nat.create64(i12);
                    int i17 = i16 * i12 * 2;
                    int i18 = 0;
                    while (true) {
                        int i19 = i12;
                        if (i18 >= i19) {
                            return createPoint(jArrCreate64, jArrCreate642);
                        }
                        long[] jArr2 = jArr;
                        jArrCreate64[i18] = jArr2[i17 + i18];
                        jArrCreate642[i18] = jArr2[i19 + i17 + i18];
                        i18++;
                    }
                }
            };
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECMultiplier createDefaultMultiplier() {
            return isKoblitz() ? new WTauNafMultiplier() : super.createDefaultMultiplier();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger != null && bigInteger.signum() >= 0) {
                int iBitLength = bigInteger.bitLength();
                int i10 = this.f20178m;
                if (iBitLength <= i10) {
                    int i11 = this.f20176k2;
                    int i12 = this.f20177k3;
                    return new ECFieldElement.F2m(i10, (i11 | i12) == 0 ? new int[]{this.f20175k1} : new int[]{this.f20175k1, i11, i12}, new LongArray(bigInteger));
                }
            }
            throw new IllegalArgumentException("x value invalid in F2m field element");
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f20178m;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public int getK1() {
            return this.f20175k1;
        }

        public int getK2() {
            return this.f20176k2;
        }

        public int getK3() {
            return this.f20177k3;
        }

        public int getM() {
            return this.f20178m;
        }

        public boolean isTrinomial() {
            return this.f20176k2 == 0 && this.f20177k3 == 0;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 6;
        }

        public F2m(int i10, int i11, int i12, int i13, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(i10, i11, i12, i13);
            this.f20178m = i10;
            this.f20175k1 = i11;
            this.f20176k2 = i12;
            this.f20177k3 = i13;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f20173a = fromBigInteger(bigInteger);
            this.f20174b = fromBigInteger(bigInteger2);
            this.coord = 6;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.F2m(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public F2m(int i10, int i11, int i12, int i13, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger, BigInteger bigInteger2) {
            super(i10, i11, i12, i13);
            this.f20178m = i10;
            this.f20175k1 = i11;
            this.f20176k2 = i12;
            this.f20177k3 = i13;
            this.order = bigInteger;
            this.cofactor = bigInteger2;
            this.infinity = new ECPoint.F2m(this, null, null);
            this.f20173a = eCFieldElement;
            this.f20174b = eCFieldElement2;
            this.coord = 6;
        }

        public F2m(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, (BigInteger) null, (BigInteger) null);
        }

        public F2m(int i10, int i11, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
            this(i10, i11, 0, 0, bigInteger, bigInteger2, bigInteger3, bigInteger4);
        }
    }

    public static class Fp extends AbstractFp {
        private static final int FP_DEFAULT_COORDS = 4;
        private static final Set<BigInteger> knownQs = Collections.synchronizedSet(new HashSet());
        private static final BigIntegers.Cache validatedQs = new BigIntegers.Cache();
        ECPoint.Fp infinity;

        /* renamed from: q, reason: collision with root package name */
        BigInteger f20179q;

        /* renamed from: r, reason: collision with root package name */
        BigInteger f20180r;

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            this(bigInteger, bigInteger2, bigInteger3, null, null);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECCurve cloneCurve() {
            return new Fp(this.f20179q, this.f20180r, this.f20173a, this.f20174b, this.order, this.cofactor);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECFieldElement fromBigInteger(BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(this.f20179q) >= 0) {
                throw new IllegalArgumentException("x value invalid for Fp field element");
            }
            return new ECFieldElement.Fp(this.f20179q, this.f20180r, bigInteger);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public int getFieldSize() {
            return this.f20179q.bitLength();
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint getInfinity() {
            return this.infinity;
        }

        public BigInteger getQ() {
            return this.f20179q;
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint importPoint(ECPoint eCPoint) {
            int coordinateSystem;
            return (this == eCPoint.getCurve() || getCoordinateSystem() != 2 || eCPoint.isInfinity() || !((coordinateSystem = eCPoint.getCurve().getCoordinateSystem()) == 2 || coordinateSystem == 3 || coordinateSystem == 4)) ? super.importPoint(eCPoint) : new ECPoint.Fp(this, fromBigInteger(eCPoint.f20186x.toBigInteger()), fromBigInteger(eCPoint.f20187y.toBigInteger()), new ECFieldElement[]{fromBigInteger(eCPoint.zs[0].toBigInteger())});
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public boolean supportsCoordinateSystem(int i10) {
            return i10 == 0 || i10 == 1 || i10 == 2 || i10 == 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5) {
            this(bigInteger, bigInteger2, bigInteger3, bigInteger4, bigInteger5, false);
        }

        @Override // org.bouncycastle.math.ec.ECCurve
        public ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr) {
            return new ECPoint.Fp(this, eCFieldElement, eCFieldElement2, eCFieldElementArr);
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, BigInteger bigInteger5, boolean z10) {
            super(bigInteger);
            if (z10) {
                this.f20179q = bigInteger;
                knownQs.add(bigInteger);
            } else {
                if (!knownQs.contains(bigInteger)) {
                    BigIntegers.Cache cache = validatedQs;
                    if (!cache.contains(bigInteger)) {
                        int iAsInteger = Properties.asInteger("org.bouncycastle.ec.fp_max_size", 1042);
                        int iAsInteger2 = Properties.asInteger("org.bouncycastle.ec.fp_certainty", 100);
                        int iBitLength = bigInteger.bitLength();
                        if (iAsInteger < iBitLength) {
                            throw new IllegalArgumentException("Fp q value out of range");
                        }
                        if (Primes.hasAnySmallFactors(bigInteger) || !Primes.isMRProbablePrime(bigInteger, CryptoServicesRegistrar.getSecureRandom(), ECCurve.getNumberOfIterations(iBitLength, iAsInteger2))) {
                            throw new IllegalArgumentException("Fp q value not prime");
                        }
                        cache.add(bigInteger);
                    }
                }
                this.f20179q = bigInteger;
            }
            this.f20180r = ECFieldElement.Fp.calculateResidue(bigInteger);
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f20173a = fromBigInteger(bigInteger2);
            this.f20174b = fromBigInteger(bigInteger3);
            this.order = bigInteger4;
            this.cofactor = bigInteger5;
            this.coord = 4;
        }

        public Fp(BigInteger bigInteger, BigInteger bigInteger2, ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, BigInteger bigInteger3, BigInteger bigInteger4) {
            super(bigInteger);
            this.f20179q = bigInteger;
            this.f20180r = bigInteger2;
            this.infinity = new ECPoint.Fp(this, null, null);
            this.f20173a = eCFieldElement;
            this.f20174b = eCFieldElement2;
            this.order = bigInteger3;
            this.cofactor = bigInteger4;
            this.coord = 4;
        }
    }

    public ECCurve(FiniteField finiteField) {
        this.field = finiteField;
    }

    public static int[] getAllCoordinateSystems() {
        return new int[]{0, 1, 2, 3, 4, 5, 6, 7};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getNumberOfIterations(int i10, int i11) {
        if (i10 >= 1536) {
            if (i11 <= 100) {
                return 3;
            }
            if (i11 <= 128) {
                return 4;
            }
            return b.a(i11, CertificateBody.profileType, 2, 4);
        }
        if (i10 >= 1024) {
            if (i11 <= 100) {
                return 4;
            }
            if (i11 <= 112) {
                return 5;
            }
            return b.a(i11, 111, 2, 5);
        }
        if (i10 < 512) {
            if (i11 <= 80) {
                return 40;
            }
            return b.a(i11, 79, 2, 40);
        }
        if (i11 <= 80) {
            return 5;
        }
        if (i11 <= 100) {
            return 7;
        }
        return b.a(i11, 99, 2, 7);
    }

    public void checkPoint(ECPoint eCPoint) {
        if (eCPoint == null || this != eCPoint.getCurve()) {
            throw new IllegalArgumentException("'point' must be non-null and on this curve");
        }
    }

    public void checkPoints(ECPoint[] eCPointArr) {
        checkPoints(eCPointArr, 0, eCPointArr.length);
    }

    public abstract ECCurve cloneCurve();

    public synchronized Config configure() {
        return new Config(this.coord, this.endomorphism, this.multiplier);
    }

    public ECLookupTable createCacheSafeLookupTable(ECPoint[] eCPointArr, int i10, final int i11) {
        final int fieldSize = (getFieldSize() + 7) >>> 3;
        final byte[] bArr = new byte[i11 * fieldSize * 2];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            ECPoint eCPoint = eCPointArr[i10 + i13];
            byte[] byteArray = eCPoint.getRawXCoord().toBigInteger().toByteArray();
            byte[] byteArray2 = eCPoint.getRawYCoord().toBigInteger().toByteArray();
            int i14 = 1;
            int i15 = byteArray.length > fieldSize ? 1 : 0;
            int length = byteArray.length - i15;
            if (byteArray2.length <= fieldSize) {
                i14 = 0;
            }
            int length2 = byteArray2.length - i14;
            int i16 = i12 + fieldSize;
            System.arraycopy(byteArray, i15, bArr, i16 - length, length);
            i12 = i16 + fieldSize;
            System.arraycopy(byteArray2, i14, bArr, i12 - length2, length2);
        }
        return new AbstractECLookupTable() { // from class: org.bouncycastle.math.ec.ECCurve.1
            private ECPoint createPoint(byte[] bArr2, byte[] bArr3) {
                ECCurve eCCurve = ECCurve.this;
                return eCCurve.createRawPoint(eCCurve.fromBigInteger(new BigInteger(1, bArr2)), ECCurve.this.fromBigInteger(new BigInteger(1, bArr3)));
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public int getSize() {
                return i11;
            }

            @Override // org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookup(int i17) {
                int i18;
                int i19 = fieldSize;
                byte[] bArr2 = new byte[i19];
                byte[] bArr3 = new byte[i19];
                int i20 = 0;
                for (int i21 = 0; i21 < i11; i21++) {
                    int i22 = ((i21 ^ i17) - 1) >> 31;
                    int i23 = 0;
                    while (true) {
                        i18 = fieldSize;
                        if (i23 < i18) {
                            byte b10 = bArr2[i23];
                            byte[] bArr4 = bArr;
                            bArr2[i23] = (byte) (b10 ^ (bArr4[i20 + i23] & i22));
                            bArr3[i23] = (byte) ((bArr4[(i18 + i20) + i23] & i22) ^ bArr3[i23]);
                            i23++;
                        }
                    }
                    i20 += i18 * 2;
                }
                return createPoint(bArr2, bArr3);
            }

            @Override // org.bouncycastle.math.ec.AbstractECLookupTable, org.bouncycastle.math.ec.ECLookupTable
            public ECPoint lookupVar(int i17) {
                int i18 = fieldSize;
                byte[] bArr2 = new byte[i18];
                byte[] bArr3 = new byte[i18];
                int i19 = i17 * i18 * 2;
                int i20 = 0;
                while (true) {
                    int i21 = fieldSize;
                    if (i20 >= i21) {
                        return createPoint(bArr2, bArr3);
                    }
                    byte[] bArr4 = bArr;
                    bArr2[i20] = bArr4[i19 + i20];
                    bArr3[i20] = bArr4[i21 + i19 + i20];
                    i20++;
                }
            }
        };
    }

    public ECMultiplier createDefaultMultiplier() {
        ECEndomorphism eCEndomorphism = this.endomorphism;
        return eCEndomorphism instanceof GLVEndomorphism ? new GLVMultiplier(this, (GLVEndomorphism) eCEndomorphism) : new WNafL2RMultiplier();
    }

    public ECPoint createPoint(BigInteger bigInteger, BigInteger bigInteger2) {
        return createRawPoint(fromBigInteger(bigInteger), fromBigInteger(bigInteger2));
    }

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2);

    public abstract ECPoint createRawPoint(ECFieldElement eCFieldElement, ECFieldElement eCFieldElement2, ECFieldElement[] eCFieldElementArr);

    public ECPoint decodePoint(byte[] bArr) {
        ECPoint infinity;
        int fieldSize = (getFieldSize() + 7) / 8;
        byte b10 = bArr[0];
        if (b10 != 0) {
            if (b10 == 2 || b10 == 3) {
                if (bArr.length != fieldSize + 1) {
                    throw new IllegalArgumentException("Incorrect length for compressed encoding");
                }
                infinity = decompressPoint(b10 & 1, BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize));
                if (!infinity.implIsValid(true, true)) {
                    throw new IllegalArgumentException("Invalid point");
                }
            } else if (b10 != 4) {
                if (b10 != 6 && b10 != 7) {
                    throw new IllegalArgumentException("Invalid point encoding 0x" + Integer.toString(b10, 16));
                }
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for hybrid encoding");
                }
                BigInteger bigIntegerFromUnsignedByteArray = BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize);
                BigInteger bigIntegerFromUnsignedByteArray2 = BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize);
                if (bigIntegerFromUnsignedByteArray2.testBit(0) != (b10 == 7)) {
                    throw new IllegalArgumentException("Inconsistent Y coordinate in hybrid encoding");
                }
                infinity = validatePoint(bigIntegerFromUnsignedByteArray, bigIntegerFromUnsignedByteArray2);
            } else {
                if (bArr.length != (fieldSize * 2) + 1) {
                    throw new IllegalArgumentException("Incorrect length for uncompressed encoding");
                }
                infinity = validatePoint(BigIntegers.fromUnsignedByteArray(bArr, 1, fieldSize), BigIntegers.fromUnsignedByteArray(bArr, fieldSize + 1, fieldSize));
            }
        } else {
            if (bArr.length != 1) {
                throw new IllegalArgumentException("Incorrect length for infinity encoding");
            }
            infinity = getInfinity();
        }
        if (b10 == 0 || !infinity.isInfinity()) {
            return infinity;
        }
        throw new IllegalArgumentException("Invalid infinity encoding");
    }

    public abstract ECPoint decompressPoint(int i10, BigInteger bigInteger);

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ECCurve) && equals((ECCurve) obj);
        }
        return true;
    }

    public abstract ECFieldElement fromBigInteger(BigInteger bigInteger);

    public ECFieldElement getA() {
        return this.f20173a;
    }

    public ECFieldElement getB() {
        return this.f20174b;
    }

    public BigInteger getCofactor() {
        return this.cofactor;
    }

    public int getCoordinateSystem() {
        return this.coord;
    }

    public ECEndomorphism getEndomorphism() {
        return this.endomorphism;
    }

    public FiniteField getField() {
        return this.field;
    }

    public abstract int getFieldSize();

    public abstract ECPoint getInfinity();

    public ECMultiplier getMultiplier() {
        if (this.multiplier == null) {
            this.multiplier = createDefaultMultiplier();
        }
        return this.multiplier;
    }

    public BigInteger getOrder() {
        return this.order;
    }

    public PreCompInfo getPreCompInfo(ECPoint eCPoint, String str) {
        Hashtable hashtable;
        PreCompInfo preCompInfo;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            hashtable = eCPoint.preCompTable;
        }
        if (hashtable == null) {
            return null;
        }
        synchronized (hashtable) {
            preCompInfo = (PreCompInfo) hashtable.get(str);
        }
        return preCompInfo;
    }

    public int hashCode() {
        return (getField().hashCode() ^ Integers.rotateLeft(getA().toBigInteger().hashCode(), 8)) ^ Integers.rotateLeft(getB().toBigInteger().hashCode(), 16);
    }

    public ECPoint importPoint(ECPoint eCPoint) {
        if (this == eCPoint.getCurve()) {
            return eCPoint;
        }
        if (eCPoint.isInfinity()) {
            return getInfinity();
        }
        ECPoint eCPointNormalize = eCPoint.normalize();
        return createPoint(eCPointNormalize.getXCoord().toBigInteger(), eCPointNormalize.getYCoord().toBigInteger());
    }

    public abstract boolean isValidFieldElement(BigInteger bigInteger);

    public void normalizeAll(ECPoint[] eCPointArr) {
        normalizeAll(eCPointArr, 0, eCPointArr.length, null);
    }

    public PreCompInfo precompute(ECPoint eCPoint, String str, PreCompCallback preCompCallback) {
        Hashtable hashtable;
        PreCompInfo preCompInfoPrecompute;
        checkPoint(eCPoint);
        synchronized (eCPoint) {
            try {
                hashtable = eCPoint.preCompTable;
                if (hashtable == null) {
                    hashtable = new Hashtable(4);
                    eCPoint.preCompTable = hashtable;
                }
            } finally {
            }
        }
        synchronized (hashtable) {
            try {
                PreCompInfo preCompInfo = (PreCompInfo) hashtable.get(str);
                preCompInfoPrecompute = preCompCallback.precompute(preCompInfo);
                if (preCompInfoPrecompute != preCompInfo) {
                    hashtable.put(str, preCompInfoPrecompute);
                }
            } finally {
            }
        }
        return preCompInfoPrecompute;
    }

    public abstract ECFieldElement randomFieldElement(SecureRandom secureRandom);

    public abstract ECFieldElement randomFieldElementMult(SecureRandom secureRandom);

    public boolean supportsCoordinateSystem(int i10) {
        return i10 == 0;
    }

    public ECPoint validatePoint(BigInteger bigInteger, BigInteger bigInteger2) {
        ECPoint eCPointCreatePoint = createPoint(bigInteger, bigInteger2);
        if (eCPointCreatePoint.isValid()) {
            return eCPointCreatePoint;
        }
        throw new IllegalArgumentException("Invalid point coordinates");
    }

    public void checkPoints(ECPoint[] eCPointArr, int i10, int i11) {
        if (eCPointArr == null) {
            throw new IllegalArgumentException("'points' cannot be null");
        }
        if (i10 < 0 || i11 < 0 || i10 > eCPointArr.length - i11) {
            throw new IllegalArgumentException("invalid range specified for 'points'");
        }
        for (int i12 = 0; i12 < i11; i12++) {
            ECPoint eCPoint = eCPointArr[i10 + i12];
            if (eCPoint != null && this != eCPoint.getCurve()) {
                throw new IllegalArgumentException("'points' entries must be null or on this curve");
            }
        }
    }

    public boolean equals(ECCurve eCCurve) {
        if (this != eCCurve) {
            return eCCurve != null && getField().equals(eCCurve.getField()) && getA().toBigInteger().equals(eCCurve.getA().toBigInteger()) && getB().toBigInteger().equals(eCCurve.getB().toBigInteger());
        }
        return true;
    }

    public void normalizeAll(ECPoint[] eCPointArr, int i10, int i11, ECFieldElement eCFieldElement) {
        checkPoints(eCPointArr, i10, i11);
        int coordinateSystem = getCoordinateSystem();
        if (coordinateSystem == 0 || coordinateSystem == 5) {
            if (eCFieldElement != null) {
                throw new IllegalArgumentException("'iso' not valid for affine coordinates");
            }
            return;
        }
        ECFieldElement[] eCFieldElementArr = new ECFieldElement[i11];
        int[] iArr = new int[i11];
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = i10 + i13;
            ECPoint eCPoint = eCPointArr[i14];
            if (eCPoint != null && (eCFieldElement != null || !eCPoint.isNormalized())) {
                eCFieldElementArr[i12] = eCPoint.getZCoord(0);
                iArr[i12] = i14;
                i12++;
            }
        }
        if (i12 == 0) {
            return;
        }
        ECAlgorithms.montgomeryTrick(eCFieldElementArr, 0, i12, eCFieldElement);
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = iArr[i15];
            eCPointArr[i16] = eCPointArr[i16].normalize(eCFieldElementArr[i15]);
        }
    }
}
