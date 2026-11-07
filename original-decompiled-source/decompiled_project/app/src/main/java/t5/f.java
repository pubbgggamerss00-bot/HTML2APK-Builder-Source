package t5;

import b.o;
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
import k1.q;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f27974a = {112, 114, 111, 0};

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f27975b = {112, 114, 109, 0};

    public static byte[] a(b[] bVarArr, byte[] bArr) throws IOException {
        int i10 = 0;
        int length = 0;
        for (b bVar : bVarArr) {
            length += ((((bVar.f27969g * 2) + 7) & (-8)) / 8) + (bVar.f27967e * 2) + b(bArr, bVar.f27963a, bVar.f27964b).getBytes(StandardCharsets.UTF_8).length + 16 + bVar.f27968f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, g.f27978c)) {
            int length2 = bVarArr.length;
            while (i10 < length2) {
                b bVar2 = bVarArr[i10];
                k(byteArrayOutputStream, bVar2, b(bArr, bVar2.f27963a, bVar2.f27964b));
                j(byteArrayOutputStream, bVar2);
                i10++;
            }
        } else {
            for (b bVar3 : bVarArr) {
                k(byteArrayOutputStream, bVar3, b(bArr, bVar3.f27963a, bVar3.f27964b));
            }
            int length3 = bVarArr.length;
            while (i10 < length3) {
                j(byteArrayOutputStream, bVarArr[i10]);
                i10++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + length);
    }

    public static String b(byte[] bArr, String str, String str2) {
        byte[] bArr2 = g.f27980e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = g.f27979d;
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
                return o.a(q.a(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
            }
        }
        return str2;
    }

    public static int[] c(ByteArrayInputStream byteArrayInputStream, int i10) throws IOException {
        int[] iArr = new int[i10];
        int iD = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iD += (int) c.d(2, byteArrayInputStream);
            iArr[i11] = iD;
        }
        return iArr;
    }

    public static b[] d(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, b[] bVarArr) throws IOException {
        byte[] bArr3 = g.f27981f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, g.f27982g)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int iD = (int) c.d(2, fileInputStream);
            byte[] bArrC = c.c(fileInputStream, (int) c.d(4, fileInputStream), (int) c.d(4, fileInputStream));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
            try {
                b[] bVarArrF = f(byteArrayInputStream, bArr2, iD, bVarArr);
                byteArrayInputStream.close();
                return bVarArrF;
            } catch (Throwable th2) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        if (Arrays.equals(g.f27976a, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int iD2 = (int) c.d(1, fileInputStream);
        byte[] bArrC2 = c.c(fileInputStream, (int) c.d(4, fileInputStream), (int) c.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrC2);
        try {
            b[] bVarArrE = e(byteArrayInputStream2, iD2, bVarArr);
            byteArrayInputStream2.close();
            return bVarArrE;
        } catch (Throwable th4) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    public static b[] e(ByteArrayInputStream byteArrayInputStream, int i10, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i10];
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int iD = (int) c.d(2, byteArrayInputStream);
            iArr[i11] = (int) c.d(2, byteArrayInputStream);
            strArr[i11] = new String(c.b(iD, byteArrayInputStream), StandardCharsets.UTF_8);
        }
        for (int i12 = 0; i12 < i10; i12++) {
            b bVar = bVarArr[i12];
            if (!bVar.f27964b.equals(strArr[i12])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i13 = iArr[i12];
            bVar.f27967e = i13;
            bVar.f27970h = c(byteArrayInputStream, i13);
        }
        return bVarArr;
    }

    public static b[] f(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i10, b[] bVarArr) throws IOException {
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        if (i10 != bVarArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i11 = 0; i11 < i10; i11++) {
            c.d(2, byteArrayInputStream);
            String str = new String(c.b((int) c.d(2, byteArrayInputStream), byteArrayInputStream), StandardCharsets.UTF_8);
            long jD = c.d(4, byteArrayInputStream);
            int iD = (int) c.d(2, byteArrayInputStream);
            b bVar = null;
            if (bVarArr.length > 0) {
                int iIndexOf = str.indexOf("!");
                if (iIndexOf < 0) {
                    iIndexOf = str.indexOf(":");
                }
                String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
                int i12 = 0;
                while (true) {
                    if (i12 >= bVarArr.length) {
                        break;
                    }
                    if (bVarArr[i12].f27964b.equals(strSubstring)) {
                        bVar = bVarArr[i12];
                        break;
                    }
                    i12++;
                }
            }
            if (bVar == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            bVar.f27966d = jD;
            int[] iArrC = c(byteArrayInputStream, iD);
            if (Arrays.equals(bArr, g.f27980e)) {
                bVar.f27967e = iD;
                bVar.f27970h = iArrC;
            }
        }
        return bVarArr;
    }

    public static b[] g(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, g.f27977b)) {
            throw new IllegalStateException("Unsupported version");
        }
        int iD = (int) c.d(1, fileInputStream);
        byte[] bArrC = c.c(fileInputStream, (int) c.d(4, fileInputStream), (int) c.d(4, fileInputStream));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrC);
        try {
            b[] bVarArrH = h(byteArrayInputStream, str, iD);
            byteArrayInputStream.close();
            return bVarArrH;
        } catch (Throwable th2) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static b[] h(ByteArrayInputStream byteArrayInputStream, String str, int i10) throws IOException {
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new b[0];
        }
        b[] bVarArr = new b[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            int iD = (int) c.d(2, byteArrayInputStream);
            int iD2 = (int) c.d(2, byteArrayInputStream);
            bVarArr[i12] = new b(str, new String(c.b(iD, byteArrayInputStream), StandardCharsets.UTF_8), c.d(4, byteArrayInputStream), iD2, (int) c.d(4, byteArrayInputStream), (int) c.d(4, byteArrayInputStream), new int[iD2], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i10) {
            b bVar = bVarArr[i13];
            int iAvailable = byteArrayInputStream.available();
            int i14 = bVar.f27968f;
            int i15 = bVar.f27969g;
            TreeMap<Integer, Integer> treeMap = bVar.f27971i;
            int i16 = iAvailable - i14;
            int iD3 = i11;
            while (byteArrayInputStream.available() > i16) {
                iD3 += (int) c.d(2, byteArrayInputStream);
                treeMap.put(Integer.valueOf(iD3), 1);
                int iD4 = (int) c.d(2, byteArrayInputStream);
                while (iD4 > 0) {
                    c.d(2, byteArrayInputStream);
                    int iD5 = (int) c.d(1, byteArrayInputStream);
                    if (iD5 != 6 && iD5 != 7) {
                        while (iD5 > 0) {
                            c.d(1, byteArrayInputStream);
                            int i17 = i11;
                            int i18 = i13;
                            for (int iD6 = (int) c.d(1, byteArrayInputStream); iD6 > 0; iD6--) {
                                c.d(2, byteArrayInputStream);
                            }
                            iD5--;
                            i11 = i17;
                            i13 = i18;
                        }
                    }
                    iD4--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i19 = i11;
            int i20 = i13;
            if (byteArrayInputStream.available() != i16) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            bVar.f27970h = c(byteArrayInputStream, bVar.f27967e);
            BitSet bitSetValueOf = BitSet.valueOf(c.b((((i15 * 2) + 7) & (-8)) / 8, byteArrayInputStream));
            for (int i21 = i19; i21 < i15; i21++) {
                int i22 = bitSetValueOf.get(i21) ? 2 : i19;
                if (bitSetValueOf.get(i21 + i15)) {
                    i22 |= 4;
                }
                if (i22 != 0) {
                    Integer numValueOf = treeMap.get(Integer.valueOf(i21));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i19);
                    }
                    treeMap.put(Integer.valueOf(i21), Integer.valueOf(i22 | numValueOf.intValue()));
                }
            }
            i13 = i20 + 1;
            i11 = i19;
        }
        return bVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, b[] bVarArr) throws IOException {
        long j10;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = g.f27976a;
        int i10 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = g.f27977b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrA = a(bVarArr, bArr3);
                c.e(byteArrayOutputStream, bVarArr.length, 1);
                c.e(byteArrayOutputStream, bArrA.length, 4);
                byte[] bArrA2 = c.a(bArrA);
                c.e(byteArrayOutputStream, bArrA2.length, 4);
                byteArrayOutputStream.write(bArrA2);
                return true;
            }
            byte[] bArr4 = g.f27979d;
            if (Arrays.equals(bArr, bArr4)) {
                c.e(byteArrayOutputStream, bVarArr.length, 1);
                for (b bVar : bVarArr) {
                    int size = bVar.f27971i.size() * 4;
                    String strB = b(bArr4, bVar.f27963a, bVar.f27964b);
                    Charset charset = StandardCharsets.UTF_8;
                    c.f(byteArrayOutputStream, strB.getBytes(charset).length);
                    c.f(byteArrayOutputStream, bVar.f27970h.length);
                    c.e(byteArrayOutputStream, size, 4);
                    c.e(byteArrayOutputStream, bVar.f27965c, 4);
                    byteArrayOutputStream.write(strB.getBytes(charset));
                    Iterator<Integer> it = bVar.f27971i.keySet().iterator();
                    while (it.hasNext()) {
                        c.f(byteArrayOutputStream, it.next().intValue());
                        c.f(byteArrayOutputStream, 0);
                    }
                    for (int i11 : bVar.f27970h) {
                        c.f(byteArrayOutputStream, i11);
                    }
                }
                return true;
            }
            byte[] bArr5 = g.f27978c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrA3 = a(bVarArr, bArr5);
                c.e(byteArrayOutputStream, bVarArr.length, 1);
                c.e(byteArrayOutputStream, bArrA3.length, 4);
                byte[] bArrA4 = c.a(bArrA3);
                c.e(byteArrayOutputStream, bArrA4.length, 4);
                byteArrayOutputStream.write(bArrA4);
                return true;
            }
            byte[] bArr6 = g.f27980e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            c.f(byteArrayOutputStream, bVarArr.length);
            for (b bVar2 : bVarArr) {
                String str = bVar2.f27963a;
                TreeMap<Integer, Integer> treeMap = bVar2.f27971i;
                String strB2 = b(bArr6, str, bVar2.f27964b);
                Charset charset2 = StandardCharsets.UTF_8;
                c.f(byteArrayOutputStream, strB2.getBytes(charset2).length);
                c.f(byteArrayOutputStream, treeMap.size());
                c.f(byteArrayOutputStream, bVar2.f27970h.length);
                c.e(byteArrayOutputStream, bVar2.f27965c, 4);
                byteArrayOutputStream.write(strB2.getBytes(charset2));
                Iterator<Integer> it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    c.f(byteArrayOutputStream, it2.next().intValue());
                }
                for (int i12 : bVar2.f27970h) {
                    c.f(byteArrayOutputStream, i12);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            c.f(byteArrayOutputStream2, bVarArr.length);
            int i13 = 2;
            int i14 = 2;
            for (b bVar3 : bVarArr) {
                c.e(byteArrayOutputStream2, bVar3.f27965c, 4);
                c.e(byteArrayOutputStream2, bVar3.f27966d, 4);
                c.e(byteArrayOutputStream2, bVar3.f27969g, 4);
                String strB3 = b(bArr2, bVar3.f27963a, bVar3.f27964b);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strB3.getBytes(charset3).length;
                c.f(byteArrayOutputStream2, length2);
                i14 = i14 + 14 + length2;
                byteArrayOutputStream2.write(strB3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i14 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i14 + ", does not match actual size " + byteArray.length);
            }
            h hVar = new h(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(hVar);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i15 = 0;
            int i16 = 0;
            while (i15 < bVarArr.length) {
                try {
                    b bVar4 = bVarArr[i15];
                    c.f(byteArrayOutputStream3, i15);
                    c.f(byteArrayOutputStream3, bVar4.f27967e);
                    i16 = i16 + 4 + (bVar4.f27967e * i13);
                    int[] iArr = bVar4.f27970h;
                    int length3 = iArr.length;
                    int i17 = i10;
                    int i18 = i13;
                    int i19 = i17;
                    while (i19 < length3) {
                        int i20 = iArr[i19];
                        c.f(byteArrayOutputStream3, i20 - i17);
                        i19++;
                        i17 = i20;
                    }
                    i15++;
                    i13 = i18;
                    i10 = 0;
                } catch (Throwable th2) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i16 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i16 + ", does not match actual size " + byteArray2.length);
            }
            h hVar2 = new h(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(hVar2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i21 = 0;
            int i22 = 0;
            while (i21 < bVarArr.length) {
                try {
                    b bVar5 = bVarArr[i21];
                    Iterator<Map.Entry<Integer, Integer>> it3 = bVar5.f27971i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= it3.next().getValue().intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        l(byteArrayOutputStream4, iIntValue, bVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m(byteArrayOutputStream4, bVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            c.f(byteArrayOutputStream3, i21);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i23 = i22 + 6;
                            ArrayList arrayList4 = arrayList3;
                            c.e(byteArrayOutputStream3, length4, 4);
                            c.f(byteArrayOutputStream3, iIntValue);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i22 = i23 + length4;
                            i21++;
                            arrayList3 = arrayList4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i22 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i22 + ", does not match actual size " + byteArray5.length);
            }
            h hVar3 = new h(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(hVar3);
            long j11 = 4;
            long size2 = j11 + j11 + 4 + (arrayList2.size() * 16);
            c.e(byteArrayOutputStream, arrayList2.size(), 4);
            int i24 = 0;
            while (i24 < arrayList2.size()) {
                h hVar4 = (h) arrayList2.get(i24);
                int i25 = hVar4.f27983a;
                byte[] bArr7 = hVar4.f27984b;
                if (i25 == 1) {
                    j10 = 0;
                } else if (i25 == 2) {
                    j10 = 1;
                } else if (i25 == 3) {
                    j10 = 2;
                } else if (i25 == 4) {
                    j10 = 3;
                } else {
                    if (i25 != 5) {
                        throw null;
                    }
                    j10 = 4;
                }
                c.e(byteArrayOutputStream, j10, 4);
                c.e(byteArrayOutputStream, size2, 4);
                if (hVar4.f27985c) {
                    long length5 = bArr7.length;
                    byte[] bArrA5 = c.a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrA5);
                    c.e(byteArrayOutputStream, bArrA5.length, 4);
                    c.e(byteArrayOutputStream, length5, 4);
                    length = bArrA5.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    c.e(byteArrayOutputStream, bArr7.length, 4);
                    c.e(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i24++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i26));
            }
            return true;
        } catch (Throwable th4) {
            try {
                byteArrayOutputStream2.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public static void j(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        m(byteArrayOutputStream, bVar);
        int i10 = bVar.f27969g;
        int[] iArr = bVar.f27970h;
        int length = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = iArr[i11];
            c.f(byteArrayOutputStream, i13 - i12);
            i11++;
            i12 = i13;
        }
        byte[] bArr = new byte[(((i10 * 2) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.f27971i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            if ((iIntValue2 & 2) != 0) {
                int i14 = iIntValue / 8;
                bArr[i14] = (byte) (bArr[i14] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i15 = iIntValue + i10;
                int i16 = i15 / 8;
                bArr[i16] = (byte) ((1 << (i15 % 8)) | bArr[i16]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void k(ByteArrayOutputStream byteArrayOutputStream, b bVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        c.f(byteArrayOutputStream, str.getBytes(charset).length);
        c.f(byteArrayOutputStream, bVar.f27967e);
        c.e(byteArrayOutputStream, bVar.f27968f, 4);
        c.e(byteArrayOutputStream, bVar.f27965c, 4);
        c.e(byteArrayOutputStream, bVar.f27969g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void l(ByteArrayOutputStream byteArrayOutputStream, int i10, b bVar) throws IOException {
        int i11 = bVar.f27969g;
        byte[] bArr = new byte[(((Integer.bitCount(i10 & (-2)) * i11) + 7) & (-8)) / 8];
        for (Map.Entry<Integer, Integer> entry : bVar.f27971i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            int i12 = 0;
            for (int i13 = 1; i13 <= 4; i13 <<= 1) {
                if (i13 != 1 && (i13 & i10) != 0) {
                    if ((i13 & iIntValue2) == i13) {
                        int i14 = (i12 * i11) + iIntValue;
                        int i15 = i14 / 8;
                        bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
                    }
                    i12++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void m(ByteArrayOutputStream byteArrayOutputStream, b bVar) throws IOException {
        int i10 = 0;
        for (Map.Entry<Integer, Integer> entry : bVar.f27971i.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            if ((entry.getValue().intValue() & 1) != 0) {
                c.f(byteArrayOutputStream, iIntValue - i10);
                c.f(byteArrayOutputStream, 0);
                i10 = iIntValue;
            }
        }
    }
}
