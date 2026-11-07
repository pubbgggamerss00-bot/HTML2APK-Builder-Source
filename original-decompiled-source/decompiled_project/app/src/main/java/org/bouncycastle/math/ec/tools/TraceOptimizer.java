package org.bouncycastle.math.ec.tools;

import java.io.PrintStream;
import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import org.bouncycastle.asn1.x9.ECNamedCurveTable;
import org.bouncycastle.asn1.x9.X9ECParametersHolder;
import org.bouncycastle.crypto.ec.CustomNamedCurves;
import org.bouncycastle.math.ec.ECAlgorithms;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECFieldElement;
import org.bouncycastle.util.Integers;

/* loaded from: classes3.dex */
public class TraceOptimizer {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final SecureRandom R = new SecureRandom();

    private static int calculateTrace(ECFieldElement eCFieldElement) {
        int fieldSize = eCFieldElement.getFieldSize();
        int iNumberOfLeadingZeros = 31 - Integers.numberOfLeadingZeros(fieldSize);
        ECFieldElement eCFieldElementAdd = eCFieldElement;
        int i10 = 1;
        while (iNumberOfLeadingZeros > 0) {
            eCFieldElementAdd = eCFieldElementAdd.squarePow(i10).add(eCFieldElementAdd);
            iNumberOfLeadingZeros--;
            i10 = fieldSize >>> iNumberOfLeadingZeros;
            if ((i10 & 1) != 0) {
                eCFieldElementAdd = eCFieldElementAdd.square().add(eCFieldElement);
            }
        }
        if (eCFieldElementAdd.isZero()) {
            return 0;
        }
        if (eCFieldElementAdd.isOne()) {
            return 1;
        }
        throw new IllegalStateException("Internal error in trace calculation");
    }

    private static List enumToList(Enumeration enumeration) {
        ArrayList arrayList = new ArrayList();
        while (enumeration.hasMoreElements()) {
            arrayList.add(enumeration.nextElement());
        }
        return arrayList;
    }

    public static void implPrintNonZeroTraceBits(ECCurve eCCurve) {
        PrintStream printStream;
        StringBuilder sb;
        int fieldSize = eCCurve.getFieldSize();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < fieldSize; i10++) {
            if ((i10 & 1) != 0 || i10 == 0) {
                if (calculateTrace(eCCurve.fromBigInteger(ONE.shiftLeft(i10))) != 0) {
                    arrayList.add(Integers.valueOf(i10));
                    printStream = System.out;
                    sb = new StringBuilder(" ");
                    sb.append(i10);
                    printStream.print(sb.toString());
                }
            } else if (arrayList.contains(Integers.valueOf(i10 >>> 1))) {
                arrayList.add(Integers.valueOf(i10));
                printStream = System.out;
                sb = new StringBuilder(" ");
                sb.append(i10);
                printStream.print(sb.toString());
            }
        }
        System.out.println();
        for (int i11 = 0; i11 < 1000; i11++) {
            BigInteger bigInteger = new BigInteger(fieldSize, R);
            int iCalculateTrace = calculateTrace(eCCurve.fromBigInteger(bigInteger));
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                if (bigInteger.testBit(((Integer) arrayList.get(i13)).intValue())) {
                    i12 ^= 1;
                }
            }
            if (iCalculateTrace != i12) {
                throw new IllegalStateException("Optimized-trace sanity check failed");
            }
        }
    }

    public static void main(String[] strArr) {
        TreeSet treeSet = new TreeSet(enumToList(ECNamedCurveTable.getNames()));
        treeSet.addAll(enumToList(CustomNamedCurves.getNames()));
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            X9ECParametersHolder byNameLazy = CustomNamedCurves.getByNameLazy(str);
            if (byNameLazy == null) {
                byNameLazy = ECNamedCurveTable.getByNameLazy(str);
            }
            if (byNameLazy != null) {
                ECCurve curve = byNameLazy.getCurve();
                if (ECAlgorithms.isF2mCurve(curve)) {
                    System.out.print(str + ":");
                    implPrintNonZeroTraceBits(curve);
                }
            }
        }
    }

    public static void printNonZeroTraceBits(ECCurve eCCurve) {
        if (!ECAlgorithms.isF2mCurve(eCCurve)) {
            throw new IllegalArgumentException("Trace only defined over characteristic-2 fields");
        }
        implPrintNonZeroTraceBits(eCCurve);
    }
}
