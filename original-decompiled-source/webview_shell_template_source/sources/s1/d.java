package s1;

import androidx.activity.m;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f14341a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f14342b = {112, 114, 109, 0};

    public static byte[] a(a[] aVarArr, byte[] bArr) throws IOException {
        int i6 = 0;
        int length = 0;
        for (a aVar : aVarArr) {
            length += ((((aVar.f14338g * 2) + 7) & (-8)) / 8) + (aVar.f14336e * 2) + b(bArr, aVar.f14332a, aVar.f14333b).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f14337f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, e.f14345c)) {
            int length2 = aVarArr.length;
            while (i6 < length2) {
                a aVar2 = aVarArr[i6];
                k(byteArrayOutputStream, aVar2, b(bArr, aVar2.f14332a, aVar2.f14333b));
                j(byteArrayOutputStream, aVar2);
                i6++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                k(byteArrayOutputStream, aVar3, b(bArr, aVar3.f14332a, aVar3.f14333b));
            }
            int length3 = aVarArr.length;
            while (i6 < length3) {
                j(byteArrayOutputStream, aVarArr[i6]);
                i6++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = e.f14347e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = e.f14346d;
        String str3 = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                return m.e(sb, (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i6) {
        int[] iArr = new int[i6];
        int iK = 0;
        for (int i7 = 0; i7 < i6; i7++) {
            iK += (int) f5.b.k(byteArrayInputStream, 2);
            iArr[i7] = iK;
        }
        return iArr;
    }

    public static a[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) throws IOException {
        byte[] bArr3 = e.f14348f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, e.f14349g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iK = (int) f5.b.k(fileInputStream, 2);
            byte[] bArrJ = f5.b.j(fileInputStream, (int) f5.b.k(fileInputStream, 4), (int) f5.b.k(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrJ);
            try {
                a[] aVarArrF = f(byteArrayInputStream, bArr2, iK, aVarArr);
                byteArrayInputStream.close();
                return aVarArrF;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(e.f14343a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iK2 = (int) f5.b.k(fileInputStream, 1);
        byte[] bArrJ2 = f5.b.j(fileInputStream, (int) f5.b.k(fileInputStream, 4), (int) f5.b.k(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrJ2);
        try {
            a[] aVarArrE = e(byteArrayInputStream2, iK2, aVarArr);
            byteArrayInputStream2.close();
            return aVarArrE;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static a[] e(ByteArrayInputStream byteArrayInputStream, int i6, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i6 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i6];
        int[] iArr = new int[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            int iK = (int) f5.b.k(byteArrayInputStream, 2);
            iArr[i7] = (int) f5.b.k(byteArrayInputStream, 2);
            strArr[i7] = new String(f5.b.i(byteArrayInputStream, iK), StandardCharsets.UTF_8);
        }
        for (int i8 = 0; i8 < i6; i8++) {
            a aVar = aVarArr[i8];
            if (!aVar.f14333b.equals(strArr[i8])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i9 = iArr[i8];
            aVar.f14336e = i9;
            aVar.h = c(byteArrayInputStream, i9);
        }
        return aVarArr;
    }

    public static a[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i6, a[] aVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i6 != aVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            f5.b.k(byteArrayInputStream, 2);
            String str = new String(f5.b.i(byteArrayInputStream, (int) f5.b.k(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jK = f5.b.k(byteArrayInputStream, 4);
            int iK = (int) f5.b.k(byteArrayInputStream, 2);
            a aVar = null;
            if (aVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i8 = 0;
                while (true) {
                    if (i8 >= aVarArr.length) {
                        break;
                    }
                    if (aVarArr[i8].f14333b.equals(strSubstring)) {
                        aVar = aVarArr[i8];
                        break;
                    }
                    i8++;
                }
            }
            if (aVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            aVar.f14335d = jK;
            int[] iArrC = c(byteArrayInputStream, iK);
            if (Arrays.equals(bArr, e.f14347e)) {
                aVar.f14336e = iK;
                aVar.h = iArrC;
            }
        }
        return aVarArr;
    }

    public static a[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, e.f14344b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iK = (int) f5.b.k(fileInputStream, 1);
        byte[] bArrJ = f5.b.j(fileInputStream, (int) f5.b.k(fileInputStream, 4), (int) f5.b.k(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrJ);
        try {
            a[] aVarArrH = h(byteArrayInputStream, str, iK);
            byteArrayInputStream.close();
            return aVarArrH;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static a[] h(ByteArrayInputStream byteArrayInputStream, String str, int i6) throws IOException {
        int i7 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i6];
        for (int i8 = 0; i8 < i6; i8++) {
            int iK = (int) f5.b.k(byteArrayInputStream, 2);
            int iK2 = (int) f5.b.k(byteArrayInputStream, 2);
            aVarArr[i8] = new a(str, new String(f5.b.i(byteArrayInputStream, iK), StandardCharsets.UTF_8), f5.b.k(byteArrayInputStream, 4), iK2, (int) f5.b.k(byteArrayInputStream, 4), (int) f5.b.k(byteArrayInputStream, 4), new int[iK2], new TreeMap());
        }
        int i9 = 0;
        while (i9 < i6) {
            a aVar = aVarArr[i9];
            int iAvailable = byteArrayInputStream.available();
            int i10 = aVar.f14337f;
            int i11 = aVar.f14338g;
            TreeMap<Integer, Integer> treeMap = aVar.f14339i;
            int i12 = iAvailable - i10;
            int iK3 = i7;
            while (byteArrayInputStream.available() > i12) {
                iK3 += (int) f5.b.k(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iK3), 1);
                int iK4 = (int) f5.b.k(byteArrayInputStream, 2);
                while (iK4 > 0) {
                    f5.b.k(byteArrayInputStream, 2);
                    int iK5 = (int) f5.b.k(byteArrayInputStream, 1);
                    if (iK5 != 6 && iK5 != 7) {
                        while (iK5 > 0) {
                            f5.b.k(byteArrayInputStream, 1);
                            int i13 = i7;
                            int i14 = i9;
                            for (int iK6 = (int) f5.b.k(byteArrayInputStream, 1); iK6 > 0; iK6--) {
                                f5.b.k(byteArrayInputStream, 2);
                            }
                            iK5--;
                            i7 = i13;
                            i9 = i14;
                        }
                    }
                    iK4--;
                    i7 = i7;
                    i9 = i9;
                }
            }
            int i15 = i7;
            int i16 = i9;
            if (byteArrayInputStream.available() != i12) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            aVar.h = c(byteArrayInputStream, aVar.f14336e);
            BitSet bitSetValueOf = BitSet.valueOf(f5.b.i(byteArrayInputStream, (((i11 * 2) + 7) & (-8)) / 8));
            for (int i17 = i15; i17 < i11; i17++) {
                int i18 = bitSetValueOf.get(i17) ? 2 : i15;
                if (bitSetValueOf.get(i17 + i11)) {
                    i18 |= 4;
                }
                if (i18 != 0) {
                    Integer numValueOf = treeMap.get(Integer.valueOf(i17));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i15);
                    }
                    treeMap.put(Integer.valueOf(i17), Integer.valueOf(i18 | numValueOf.intValue()));
                }
            }
            i9 = i16 + 1;
            i7 = i15;
        }
        return aVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) throws IOException {
        long j6;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = e.f14343a;
        int i6 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = e.f14344b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(aVarArr, bArr3);
                f5.b.n(byteArrayOutputStream, aVarArr.length, 1);
                f5.b.n(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrE = f5.b.e(bArrA);
                f5.b.n(byteArrayOutputStream, bArrE.length, 4);
                byteArrayOutputStream.write(bArrE);
                return true;
            }
            byte[] bArr4 = e.f14346d;
            if (Arrays.equals(bArr, bArr4)) {
                f5.b.n(byteArrayOutputStream, aVarArr.length, 1);
                for (a aVar : aVarArr) {
                    int size = aVar.f14339i.size() * 4;
                    String strB = b(bArr4, aVar.f14332a, aVar.f14333b);
                    Charset charset = StandardCharsets.UTF_8;
                    f5.b.o(byteArrayOutputStream, strB.getBytes(charset).length);
                    f5.b.o(byteArrayOutputStream, aVar.h.length);
                    f5.b.n(byteArrayOutputStream, size, 4);
                    f5.b.n(byteArrayOutputStream, aVar.f14334c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = aVar.f14339i.keySet().iterator();
                    while (it.hasNext()) {
                        f5.b.o(byteArrayOutputStream, it.next().intValue());
                        f5.b.o(byteArrayOutputStream, 0);
                    }
                    for (int i7 : aVar.h) {
                        f5.b.o(byteArrayOutputStream, i7);
                    }
                }
                return true;
            }
            byte[] bArr5 = e.f14345c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA2 = a(aVarArr, bArr5);
                f5.b.n(byteArrayOutputStream, aVarArr.length, 1);
                f5.b.n(byteArrayOutputStream, bArrA2.length, 4);
                byte[] bArrE2 = f5.b.e(bArrA2);
                f5.b.n(byteArrayOutputStream, bArrE2.length, 4);
                byteArrayOutputStream.write(bArrE2);
                return true;
            }
            byte[] bArr6 = e.f14347e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            f5.b.o(byteArrayOutputStream, aVarArr.length);
            for (a aVar2 : aVarArr) {
                String str = aVar2.f14332a;
                TreeMap<Integer, Integer> treeMap = aVar2.f14339i;
                String strB2 = b(bArr6, str, aVar2.f14333b);
                Charset charset2 = StandardCharsets.UTF_8;
                f5.b.o(byteArrayOutputStream, strB2.getBytes(charset2).length);
                f5.b.o(byteArrayOutputStream, treeMap.size());
                f5.b.o(byteArrayOutputStream, aVar2.h.length);
                f5.b.n(byteArrayOutputStream, aVar2.f14334c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    f5.b.o(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i8 : aVar2.h) {
                    f5.b.o(byteArrayOutputStream, i8);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            f5.b.o(byteArrayOutputStream2, aVarArr.length);
            int i9 = 2;
            int i10 = 2;
            for (a aVar3 : aVarArr) {
                f5.b.n(byteArrayOutputStream2, aVar3.f14334c, 4);
                f5.b.n(byteArrayOutputStream2, aVar3.f14335d, 4);
                f5.b.n(byteArrayOutputStream2, aVar3.f14338g, 4);
                String strB3 = b(bArr2, aVar3.f14332a, aVar3.f14333b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                f5.b.o(byteArrayOutputStream2, length2);
                i10 = i10 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i10 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i10 + ", does not match actual size " + byteArray.length);
            }
            f fVar = new f(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(fVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i11 = 0;
            int i12 = 0;
            while (i11 < aVarArr.length) {
                try {
                    a aVar4 = aVarArr[i11];
                    f5.b.o(byteArrayOutputStream3, i11);
                    f5.b.o(byteArrayOutputStream3, aVar4.f14336e);
                    i12 = i12 + 4 + (aVar4.f14336e * i9);
                    int[] iArr = aVar4.h;
                    int length3 = iArr.length;
                    int i13 = i6;
                    int i14 = i9;
                    int i15 = i13;
                    while (i15 < length3) {
                        int i16 = iArr[i15];
                        f5.b.o(byteArrayOutputStream3, i16 - i13);
                        i15++;
                        i13 = i16;
                    }
                    i11++;
                    i9 = i14;
                    i6 = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
            }
            f fVar2 = new f(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i17 = 0;
            int i18 = 0;
            while (i17 < aVarArr.length) {
                try {
                    a aVar5 = aVarArr[i17];
                    Iterator<Map.Entry<Integer, Integer>> it3 = aVar5.f14339i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, iIntValue, aVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, aVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            f5.b.o(byteArrayOutputStream3, i17);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i19 = i18 + 6;
                            ArrayList arrayList4 = arrayList3;
                            f5.b.n(byteArrayOutputStream3, length4, 4);
                            f5.b.o(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i18 = i19 + length4;
                            i17++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i18 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
            }
            f fVar3 = new f(4, true, byteArray5);
            byteArrayOutputStream3.close();
            arrayList2.add(fVar3);
            long j7 = 4;
            long size2 = j7 + j7 + 4 + (arrayList2.size() * 16);
            f5.b.n(byteArrayOutputStream, arrayList2.size(), 4);
            int i20 = 0;
            while (i20 < arrayList2.size()) {
                f fVar4 = (f) arrayList2.get(i20);
                int i21 = fVar4.f14350a;
                byte[] bArr7 = fVar4.f14351b;
                if (i21 == 1) {
                    j6 = 0;
                } else if (i21 == 2) {
                    j6 = 1;
                } else if (i21 == 3) {
                    j6 = 2;
                } else if (i21 == 4) {
                    j6 = 3;
                } else {
                    if (i21 != 5) {
                        throw null;
                    }
                    j6 = 4;
                }
                f5.b.n(byteArrayOutputStream, j6, 4);
                f5.b.n(byteArrayOutputStream, size2, 4);
                if (fVar4.f14352c) {
                    long length5 = bArr7.length;
                    byte[] bArrE3 = f5.b.e(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrE3);
                    f5.b.n(byteArrayOutputStream, bArrE3.length, 4);
                    f5.b.n(byteArrayOutputStream, length5, 4);
                    length = bArrE3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    f5.b.n(byteArrayOutputStream, bArr7.length, 4);
                    f5.b.n(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i20++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        m(byteArrayOutputStream, aVar);
        int i6 = aVar.f14338g;
        int[] iArr = aVar.h;
        int length = iArr.length;
        int i7 = 0;
        int i8 = 0;
        while (i7 < length) {
            int i9 = iArr[i7];
            f5.b.o(byteArrayOutputStream, i9 - i8);
            i7++;
            i8 = i9;
        }
        byte[] bArr = new byte[(((i6 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : aVar.f14339i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i10 = iIntValue / 8;
                bArr[i10] = (byte) (bArr[i10] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i11 = iIntValue + i6;
                int i12 = i11 / 8;
                bArr[i12] = (byte) ((1 << (i11 % 8)) | bArr[i12]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        f5.b.o(byteArrayOutputStream, str.getBytes(charset).length);
        f5.b.o(byteArrayOutputStream, aVar.f14336e);
        f5.b.n(byteArrayOutputStream, aVar.f14337f, 4);
        f5.b.n(byteArrayOutputStream, aVar.f14334c, 4);
        f5.b.n(byteArrayOutputStream, aVar.f14338g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i6, a aVar) throws IOException {
        int i7 = aVar.f14338g;
        byte[] bArr = new byte[(((Integer.bitCount(i6 & (-2)) * i7) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : aVar.f14339i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i8 = 0;
            for (int i9 = 1; i9 <= 4; i9 <<= 1) {
                if (i9 != 1 && (i9 & i6) != 0) {
                    if ((i9 & iIntValue2) == i9) {
                        int i10 = (i8 * i7) + iIntValue;
                        int i11 = i10 / 8;
                        bArr[i11] = (byte) ((1 << (i10 % 8)) | bArr[i11]);
                    }
                    i8++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, a aVar) throws IOException {
        int i6 = 0;
        for (Map.Entry<Integer, Integer> entry : aVar.f14339i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                f5.b.o(byteArrayOutputStream, iIntValue - i6);
                f5.b.o(byteArrayOutputStream, 0);
                i6 = iIntValue;
            }
        }
    }
}
