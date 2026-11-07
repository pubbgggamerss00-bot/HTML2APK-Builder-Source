package org.bouncycastle.pqc.legacy.math.ntru.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import org.bouncycastle.pqc.legacy.math.ntru.euclid.IntEuclidean;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.DenseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.SparseTernaryPolynomial;
import org.bouncycastle.pqc.legacy.math.ntru.polynomial.TernaryPolynomial;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class Util {
    private static volatile boolean IS_64_BITNESS_KNOWN;
    private static volatile boolean IS_64_BIT_JVM;

    public static TernaryPolynomial generateRandomTernary(int i10, int i11, int i12, boolean z10, SecureRandom secureRandom) {
        return z10 ? SparseTernaryPolynomial.generateRandom(i10, i11, i12, secureRandom) : DenseTernaryPolynomial.generateRandom(i10, i11, i12, secureRandom);
    }

    public static int invert(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 < 0) {
            i12 += i11;
        }
        return IntEuclidean.calculate(i12, i11).f20541x;
    }

    public static boolean is64BitJVM() {
        if (!IS_64_BITNESS_KNOWN) {
            String property = System.getProperty("os.arch");
            IS_64_BIT_JVM = "amd64".equals(property) || "x86_64".equals(property) || "ppc64".equals(property) || "64".equals(System.getProperty("sun.arch.data.model"));
            IS_64_BITNESS_KNOWN = true;
        }
        return IS_64_BIT_JVM;
    }

    public static int pow(int i10, int i11, int i12) {
        int i13 = 1;
        for (int i14 = 0; i14 < i11; i14++) {
            i13 = (i13 * i10) % i12;
        }
        return i13;
    }

    public static byte[] readFullLength(InputStream inputStream, int i10) throws IOException {
        byte[] bArr = new byte[i10];
        if (inputStream.read(bArr) == i10) {
            return bArr;
        }
        throw new IOException("Not enough bytes to read.");
    }

    public static int[] generateRandomTernary(int i10, int i11, int i12, SecureRandom secureRandom) {
        Integer numValueOf = Integers.valueOf(1);
        Integer numValueOf2 = Integers.valueOf(-1);
        Integer numValueOf3 = Integers.valueOf(0);
        ArrayList arrayList = new ArrayList();
        for (int i13 = 0; i13 < i11; i13++) {
            arrayList.add(numValueOf);
        }
        for (int i14 = 0; i14 < i12; i14++) {
            arrayList.add(numValueOf2);
        }
        while (arrayList.size() < i10) {
            arrayList.add(numValueOf3);
        }
        Collections.shuffle(arrayList, secureRandom);
        int[] iArr = new int[i10];
        for (int i15 = 0; i15 < i10; i15++) {
            iArr[i15] = ((Integer) arrayList.get(i15)).intValue();
        }
        return iArr;
    }

    public static long pow(long j10, int i10, long j11) {
        long j12 = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            j12 = (j12 * j10) % j11;
        }
        return j12;
    }
}
