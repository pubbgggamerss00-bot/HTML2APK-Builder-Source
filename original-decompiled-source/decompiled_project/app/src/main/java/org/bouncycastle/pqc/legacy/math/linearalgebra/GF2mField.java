package org.bouncycastle.pqc.legacy.math.linearalgebra;

import b.o;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;
import java.security.SecureRandom;
import m3.a;
import org.bouncycastle.crypto.CryptoServicesRegistrar;

/* loaded from: classes3.dex */
public class GF2mField {
    private int degree;
    private int polynomial;

    public GF2mField(int i10) {
        this.degree = 0;
        if (i10 >= 32) {
            throw new IllegalArgumentException(" Error: the degree of field is too large ");
        }
        if (i10 < 1) {
            throw new IllegalArgumentException(" Error: the degree of field is non-positive ");
        }
        this.degree = i10;
        this.polynomial = PolynomialRingGF2.getIrreduciblePolynomial(i10);
    }

    private static String polyToString(int i10) {
        if (i10 == 0) {
            return d.L0;
        }
        String str = ((byte) (i10 & 1)) == 1 ? "1" : "";
        int i11 = i10 >>> 1;
        int i12 = 1;
        while (i11 != 0) {
            if (((byte) (i11 & 1)) == 1) {
                str = str + "+x^" + i12;
            }
            i11 >>>= 1;
            i12++;
        }
        return str;
    }

    public int add(int i10, int i11) {
        return i10 ^ i11;
    }

    public String elementToStr(int i10) {
        String strA = "";
        for (int i11 = 0; i11 < this.degree; i11++) {
            strA = a.a((((byte) i10) & 1) == 0 ? d.L0 : "1", strA);
            i10 >>>= 1;
        }
        return strA;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof GF2mField)) {
            GF2mField gF2mField = (GF2mField) obj;
            if (this.degree == gF2mField.degree && this.polynomial == gF2mField.polynomial) {
                return true;
            }
        }
        return false;
    }

    public int exp(int i10, int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i10 == 0) {
            return 0;
        }
        if (i10 == 1) {
            return 1;
        }
        if (i11 < 0) {
            i10 = inverse(i10);
            i11 = -i11;
        }
        int iMult = 1;
        while (i11 != 0) {
            if ((i11 & 1) == 1) {
                iMult = mult(iMult, i10);
            }
            i10 = mult(i10, i10);
            i11 >>>= 1;
        }
        return iMult;
    }

    public int getDegree() {
        return this.degree;
    }

    public byte[] getEncoded() {
        return LittleEndianConversions.I2OSP(this.polynomial);
    }

    public int getPolynomial() {
        return this.polynomial;
    }

    public int getRandomElement(SecureRandom secureRandom) {
        return RandUtils.nextInt(secureRandom, 1 << this.degree);
    }

    public int getRandomNonZeroElement() {
        return getRandomNonZeroElement(CryptoServicesRegistrar.getSecureRandom());
    }

    public int hashCode() {
        return this.polynomial;
    }

    public int inverse(int i10) {
        return exp(i10, (1 << this.degree) - 2);
    }

    public boolean isElementOfThisField(int i10) {
        int i11 = this.degree;
        return i11 == 31 ? i10 >= 0 : i10 >= 0 && i10 < (1 << i11);
    }

    public int mult(int i10, int i11) {
        return PolynomialRingGF2.modMultiply(i10, i11, this.polynomial);
    }

    public int sqRoot(int i10) {
        for (int i11 = 1; i11 < this.degree; i11++) {
            i10 = mult(i10, i10);
        }
        return i10;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Finite Field GF(2^");
        sb.append(this.degree);
        sb.append(") = GF(2)[X]/<");
        return o.a(sb, polyToString(this.polynomial), "> ");
    }

    public GF2mField(int i10, int i11) {
        this.degree = 0;
        if (i10 != PolynomialRingGF2.degree(i11)) {
            throw new IllegalArgumentException(" Error: the degree is not correct");
        }
        if (!PolynomialRingGF2.isIrreducible(i11)) {
            throw new IllegalArgumentException(" Error: given polynomial is reducible");
        }
        this.degree = i10;
        this.polynomial = i11;
    }

    public int getRandomNonZeroElement(SecureRandom secureRandom) {
        int iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
        int i10 = 0;
        while (iNextInt == 0 && i10 < 1048576) {
            iNextInt = RandUtils.nextInt(secureRandom, 1 << this.degree);
            i10++;
        }
        if (i10 == 1048576) {
            return 1;
        }
        return iNextInt;
    }

    public GF2mField(GF2mField gF2mField) {
        this.degree = 0;
        this.degree = gF2mField.degree;
        this.polynomial = gF2mField.polynomial;
    }

    public GF2mField(byte[] bArr) {
        this.degree = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int iOS2IP = LittleEndianConversions.OS2IP(bArr);
        this.polynomial = iOS2IP;
        if (!PolynomialRingGF2.isIrreducible(iOS2IP)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.degree = PolynomialRingGF2.degree(this.polynomial);
    }
}
