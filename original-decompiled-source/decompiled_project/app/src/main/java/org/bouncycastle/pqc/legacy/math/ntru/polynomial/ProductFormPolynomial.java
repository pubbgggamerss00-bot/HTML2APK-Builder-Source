package org.bouncycastle.pqc.legacy.math.ntru.polynomial;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import org.bouncycastle.util.Arrays;

/* loaded from: classes3.dex */
public class ProductFormPolynomial implements Polynomial {

    /* renamed from: f1, reason: collision with root package name */
    private SparseTernaryPolynomial f20543f1;

    /* renamed from: f2, reason: collision with root package name */
    private SparseTernaryPolynomial f20544f2;

    /* renamed from: f3, reason: collision with root package name */
    private SparseTernaryPolynomial f20545f3;

    public ProductFormPolynomial(SparseTernaryPolynomial sparseTernaryPolynomial, SparseTernaryPolynomial sparseTernaryPolynomial2, SparseTernaryPolynomial sparseTernaryPolynomial3) {
        this.f20543f1 = sparseTernaryPolynomial;
        this.f20544f2 = sparseTernaryPolynomial2;
        this.f20545f3 = sparseTernaryPolynomial3;
    }

    public static ProductFormPolynomial fromBinary(InputStream inputStream, int i10, int i11, int i12, int i13, int i14) throws IOException {
        return new ProductFormPolynomial(SparseTernaryPolynomial.fromBinary(inputStream, i10, i11, i11), SparseTernaryPolynomial.fromBinary(inputStream, i10, i12, i12), SparseTernaryPolynomial.fromBinary(inputStream, i10, i13, i14));
    }

    public static ProductFormPolynomial generateRandom(int i10, int i11, int i12, int i13, int i14, SecureRandom secureRandom) {
        return new ProductFormPolynomial(SparseTernaryPolynomial.generateRandom(i10, i11, i11, secureRandom), SparseTernaryPolynomial.generateRandom(i10, i12, i12, secureRandom), SparseTernaryPolynomial.generateRandom(i10, i13, i14, secureRandom));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProductFormPolynomial productFormPolynomial = (ProductFormPolynomial) obj;
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f20543f1;
        if (sparseTernaryPolynomial == null) {
            if (productFormPolynomial.f20543f1 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial.equals(productFormPolynomial.f20543f1)) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f20544f2;
        if (sparseTernaryPolynomial2 == null) {
            if (productFormPolynomial.f20544f2 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial2.equals(productFormPolynomial.f20544f2)) {
            return false;
        }
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f20545f3;
        SparseTernaryPolynomial sparseTernaryPolynomial4 = productFormPolynomial.f20545f3;
        if (sparseTernaryPolynomial3 == null) {
            if (sparseTernaryPolynomial4 != null) {
                return false;
            }
        } else if (!sparseTernaryPolynomial3.equals(sparseTernaryPolynomial4)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        SparseTernaryPolynomial sparseTernaryPolynomial = this.f20543f1;
        int iHashCode = ((sparseTernaryPolynomial == null ? 0 : sparseTernaryPolynomial.hashCode()) + 31) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial2 = this.f20544f2;
        int iHashCode2 = (iHashCode + (sparseTernaryPolynomial2 == null ? 0 : sparseTernaryPolynomial2.hashCode())) * 31;
        SparseTernaryPolynomial sparseTernaryPolynomial3 = this.f20545f3;
        return iHashCode2 + (sparseTernaryPolynomial3 != null ? sparseTernaryPolynomial3.hashCode() : 0);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public BigIntPolynomial mult(BigIntPolynomial bigIntPolynomial) {
        BigIntPolynomial bigIntPolynomialMult = this.f20544f2.mult(this.f20543f1.mult(bigIntPolynomial));
        bigIntPolynomialMult.add(this.f20545f3.mult(bigIntPolynomial));
        return bigIntPolynomialMult;
    }

    public byte[] toBinary() {
        byte[] binary = this.f20543f1.toBinary();
        byte[] binary2 = this.f20544f2.toBinary();
        byte[] binary3 = this.f20545f3.toBinary();
        byte[] bArrCopyOf = Arrays.copyOf(binary, binary.length + binary2.length + binary3.length);
        System.arraycopy(binary2, 0, bArrCopyOf, binary.length, binary2.length);
        System.arraycopy(binary3, 0, bArrCopyOf, binary.length + binary2.length, binary3.length);
        return bArrCopyOf;
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial toIntegerPolynomial() {
        IntegerPolynomial integerPolynomialMult = this.f20543f1.mult(this.f20544f2.toIntegerPolynomial());
        integerPolynomialMult.add(this.f20545f3.toIntegerPolynomial());
        return integerPolynomialMult;
    }

    public static ProductFormPolynomial fromBinary(byte[] bArr, int i10, int i11, int i12, int i13, int i14) throws IOException {
        return fromBinary(new ByteArrayInputStream(bArr), i10, i11, i12, i13, i14);
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial) {
        IntegerPolynomial integerPolynomialMult = this.f20544f2.mult(this.f20543f1.mult(integerPolynomial));
        integerPolynomialMult.add(this.f20545f3.mult(integerPolynomial));
        return integerPolynomialMult;
    }

    @Override // org.bouncycastle.pqc.legacy.math.ntru.polynomial.Polynomial
    public IntegerPolynomial mult(IntegerPolynomial integerPolynomial, int i10) {
        IntegerPolynomial integerPolynomialMult = mult(integerPolynomial);
        integerPolynomialMult.mod(i10);
        return integerPolynomialMult;
    }
}
