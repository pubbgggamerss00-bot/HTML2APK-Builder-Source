package se;

import androidx.datastore.preferences.protobuf.z0;
import i8.n;
import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.eac.EACTags;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f24911a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24912b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public String f24913a;
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f24914a;
    }

    public c() {
        this.f24911a = new byte[512];
        this.f24912b = false;
    }

    public static void b(b bVar, String str, String str2) throws IOException {
        String str3 = bVar.f24914a;
        if (!str3.equals(str)) {
            throw new IOException(b6.a.b("Error : ~", str2, " contains an unexpected operator : ", str3));
        }
    }

    public static int c(byte[] bArr) {
        int i10 = bArr[0] & 255;
        return bArr.length == 2 ? (i10 << 8) + (bArr[1] & 255) : i10;
    }

    public static BufferedInputStream d(String str) throws IOException {
        if (bf.a.f4214a != null) {
            return new BufferedInputStream(bf.a.a("com/tom_roush/fontbox/resources/cmap/" + str));
        }
        InputStream resourceAsStream = c.class.getResourceAsStream("/com/tom_roush/fontbox/resources/cmap/" + str);
        if (resourceAsStream != null) {
            return new BufferedInputStream(resourceAsStream);
        }
        throw new IOException(m3.a.a("Error: Could not find referenced cmap stream ", str));
    }

    public static boolean e(int i10, byte[] bArr, boolean z10) {
        if (i10 <= 0 || (bArr[i10] & 255) != 255) {
            bArr[i10] = (byte) (bArr[i10] + 1);
            return true;
        }
        if (z10) {
            return false;
        }
        bArr[i10] = 0;
        e(i10 - 1, bArr, z10);
        return true;
    }

    public static boolean f(int i10) {
        return i10 == 37 || i10 == 47 || i10 == 60 || i10 == 62 || i10 == 91 || i10 == 93 || i10 == 123 || i10 == 125 || i10 == 40 || i10 == 41;
    }

    public static boolean g(int i10) {
        return i10 == -1 || i10 == 32 || i10 == 13 || i10 == 10;
    }

    public final void a(se.b bVar, byte[] bArr, int i10, byte[] bArr2) {
        for (int i11 = 0; i11 < i10; i11++) {
            bVar.a(new String(bArr2, bArr2.length == 1 ? xe.a.f33561a : xe.a.f33563c), bArr);
            if (!e(bArr2.length - 1, bArr2, this.f24912b)) {
                return;
            }
            e(bArr.length - 1, bArr, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:205:0x03c5, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03c2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03c2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03c2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03c2, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03c2, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:165:0x02fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final se.b h(FilterInputStream filterInputStream) throws IOException {
        PushbackInputStream pushbackInputStream = new PushbackInputStream(filterInputStream);
        se.b bVar = new se.b();
        Object obj = null;
        while (true) {
            Object objI = i(pushbackInputStream);
            if (objI == null) {
                break;
            }
            if (objI instanceof b) {
                String str = ((b) objI).f24914a;
                if (str.equals("endcmap")) {
                    break;
                }
                if (obj != null) {
                    boolean zEquals = str.equals("usecmap");
                    int i10 = 0;
                    ArrayList arrayList = bVar.f24906f;
                    HashMap map = bVar.f24909i;
                    ArrayList arrayList2 = bVar.f24910j;
                    if (zEquals && (obj instanceof a)) {
                        se.b bVarH = h(d(((a) obj).f24913a));
                        ArrayList arrayList3 = bVarH.f24906f;
                        int size = arrayList3.size();
                        while (i10 < size) {
                            Object obj2 = arrayList3.get(i10);
                            i10++;
                            d dVar = (d) obj2;
                            arrayList.add(dVar);
                            bVar.f24905e = Math.max(bVar.f24905e, dVar.f24917c);
                            bVar.f24904d = Math.min(bVar.f24904d, dVar.f24917c);
                        }
                        bVar.f24907g.putAll(bVarH.f24907g);
                        map.putAll(bVarH.f24909i);
                        arrayList2.addAll(bVarH.f24910j);
                    } else if (!(obj instanceof Number)) {
                        continue;
                    } else if (str.equals("begincodespacerange")) {
                        Number number = (Number) obj;
                        while (true) {
                            if (i10 < number.intValue()) {
                                Object objI2 = i(pushbackInputStream);
                                if (objI2 instanceof b) {
                                    b((b) objI2, "endcodespacerange", "codespacerange");
                                    break;
                                }
                                if (!(objI2 instanceof byte[])) {
                                    throw new IOException("start range missing");
                                }
                                try {
                                    d dVar2 = new d((byte[]) objI2, (byte[]) i(pushbackInputStream));
                                    arrayList.add(dVar2);
                                    bVar.f24905e = Math.max(bVar.f24905e, dVar2.f24917c);
                                    bVar.f24904d = Math.min(bVar.f24904d, dVar2.f24917c);
                                    i10++;
                                } catch (IllegalArgumentException e10) {
                                    throw new IOException(e10);
                                }
                            }
                        }
                    } else if (str.equals("beginbfchar")) {
                        Number number2 = (Number) obj;
                        while (true) {
                            if (i10 < number2.intValue()) {
                                Object objI3 = i(pushbackInputStream);
                                if (objI3 instanceof b) {
                                    b((b) objI3, "endbfchar", "bfchar");
                                    break;
                                }
                                if (!(objI3 instanceof byte[])) {
                                    throw new IOException("input code missing");
                                }
                                byte[] bArr = (byte[]) objI3;
                                Object objI4 = i(pushbackInputStream);
                                if (objI4 instanceof byte[]) {
                                    byte[] bArr2 = (byte[]) objI4;
                                    bVar.a(new String(bArr2, bArr2.length == 1 ? xe.a.f33561a : xe.a.f33563c), bArr);
                                } else {
                                    if (!(objI4 instanceof a)) {
                                        throw new IOException(z0.a(objI4, "Error parsing CMap beginbfchar, expected{COSString or COSName} and not "));
                                    }
                                    bVar.a(((a) objI4).f24913a, bArr);
                                }
                                i10++;
                            }
                        }
                    } else if (str.equals("beginbfrange")) {
                        Number number3 = (Number) obj;
                        int i11 = 0;
                        while (true) {
                            if (i11 < number3.intValue()) {
                                Object objI5 = i(pushbackInputStream);
                                if (objI5 instanceof b) {
                                    b((b) objI5, "endbfrange", "bfrange");
                                    break;
                                }
                                if (!(objI5 instanceof byte[])) {
                                    throw new IOException("start code missing");
                                }
                                byte[] bArr3 = (byte[]) objI5;
                                Object objI6 = i(pushbackInputStream);
                                if (objI6 instanceof b) {
                                    b((b) objI6, "endbfrange", "bfrange");
                                    break;
                                }
                                if (!(objI6 instanceof byte[])) {
                                    throw new IOException("end code missing");
                                }
                                byte[] bArr4 = (byte[]) objI6;
                                int i12 = 0;
                                for (byte b10 : bArr3) {
                                    i12 = (i12 << 8) | (b10 & 255);
                                }
                                int i13 = 0;
                                for (byte b11 : bArr4) {
                                    i13 = (i13 << 8) | (b11 & 255);
                                }
                                if (i13 < i12) {
                                    break;
                                }
                                Object objI7 = i(pushbackInputStream);
                                if (objI7 instanceof List) {
                                    List<byte[]> list = (List) objI7;
                                    if (!list.isEmpty() && list.size() >= i13 - i12) {
                                        for (byte[] bArr5 : list) {
                                            bVar.a(new String(bArr5, bArr5.length == 1 ? xe.a.f33561a : xe.a.f33563c), bArr3);
                                            e(bArr3.length - 1, bArr3, false);
                                        }
                                    }
                                } else if (objI7 instanceof byte[]) {
                                    byte[] bArr6 = (byte[]) objI7;
                                    if (bArr6.length > 0) {
                                        if (bArr6.length == 2 && i12 == 0 && i13 == 65535 && bArr6[0] == 0 && bArr6[1] == 0) {
                                            for (int i14 = 0; i14 < 256; i14++) {
                                                byte b12 = (byte) i14;
                                                bArr3[0] = b12;
                                                bArr3[1] = 0;
                                                bArr6[0] = b12;
                                                bArr6[1] = 0;
                                                a(bVar, bArr3, 256, bArr6);
                                            }
                                        } else {
                                            a(bVar, bArr3, (i13 - i12) + 1, bArr6);
                                        }
                                    }
                                }
                                i11++;
                            }
                        }
                    } else if (str.equals("begincidchar")) {
                        Number number4 = (Number) obj;
                        while (true) {
                            if (i10 < number4.intValue()) {
                                Object objI8 = i(pushbackInputStream);
                                if (objI8 instanceof b) {
                                    b((b) objI8, "endcidchar", "cidchar");
                                    break;
                                }
                                if (!(objI8 instanceof byte[])) {
                                    throw new IOException("start code missing");
                                }
                                Integer num = (Integer) i(pushbackInputStream);
                                num.getClass();
                                map.put(Integer.valueOf(c((byte[]) objI8)), num);
                                i10++;
                            }
                        }
                    } else if (str.equals("begincidrange") && (obj instanceof Integer)) {
                        int iIntValue = ((Integer) obj).intValue();
                        int i15 = 0;
                        while (true) {
                            if (i15 < iIntValue) {
                                Object objI9 = i(pushbackInputStream);
                                if (objI9 instanceof b) {
                                    b((b) objI9, "endcidrange", "cidrange");
                                    break;
                                }
                                if (!(objI9 instanceof byte[])) {
                                    throw new IOException("start range missing");
                                }
                                byte[] bArr7 = (byte[]) objI9;
                                int iC = c(bArr7);
                                byte[] bArr8 = (byte[]) i(pushbackInputStream);
                                int iC2 = c(bArr8);
                                Integer num2 = (Integer) i(pushbackInputStream);
                                int iIntValue2 = num2.intValue();
                                int i16 = iIntValue;
                                if (bArr7.length > 2 || bArr8.length > 2) {
                                    int i17 = (iC2 + iIntValue2) - iC;
                                    while (iIntValue2 <= i17) {
                                        map.put(Integer.valueOf(c(bArr7)), Integer.valueOf(iIntValue2));
                                        e(bArr7.length - 1, bArr7, false);
                                        iIntValue2++;
                                    }
                                } else if (iC2 == iC) {
                                    map.put(Integer.valueOf(iC), num2);
                                } else {
                                    char c10 = (char) iC;
                                    char c11 = (char) iC2;
                                    se.a aVar = !arrayList2.isEmpty() ? (se.a) l.b.b(arrayList2, 1) : null;
                                    if (aVar != null) {
                                        char c12 = aVar.f24899b;
                                        if (c10 == c12 + 1 && iIntValue2 == ((aVar.f24900c + c12) - aVar.f24898a) + 1) {
                                            aVar.f24899b = c11;
                                        } else {
                                            arrayList2.add(new se.a(c10, c11, iIntValue2));
                                        }
                                    }
                                }
                                i15++;
                                iIntValue = i16;
                            }
                        }
                    }
                } else {
                    continue;
                }
            } else if (objI instanceof a) {
                String str2 = ((a) objI).f24913a;
                if ("WMode".equals(str2)) {
                    boolean z10 = i(pushbackInputStream) instanceof Integer;
                } else if ("CMapName".equals(str2)) {
                    Object objI10 = i(pushbackInputStream);
                    if (objI10 instanceof a) {
                        bVar.f24901a = ((a) objI10).f24913a;
                    }
                } else if ("CMapVersion".equals(str2)) {
                    Object objI11 = i(pushbackInputStream);
                    if (objI11 instanceof Number) {
                        objI11.toString();
                    } else {
                        boolean z11 = objI11 instanceof String;
                    }
                } else if ("CMapType".equals(str2)) {
                    boolean z12 = i(pushbackInputStream) instanceof Integer;
                } else if ("Registry".equals(str2)) {
                    Object objI12 = i(pushbackInputStream);
                    if (objI12 instanceof String) {
                        bVar.f24902b = (String) objI12;
                    }
                } else if ("Ordering".equals(str2)) {
                    Object objI13 = i(pushbackInputStream);
                    if (objI13 instanceof String) {
                        bVar.f24903c = (String) objI13;
                    }
                } else if ("Supplement".equals(str2)) {
                    boolean z13 = i(pushbackInputStream) instanceof Integer;
                }
            }
            obj = objI;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01d0, code lost:
    
        r2 = r2 + 1;
        r11 = new byte[r2];
        java.lang.System.arraycopy(r8, 0, r11, 0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d6, code lost:
    
        return r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ae A[Catch: NumberFormatException -> 0x00b3, TryCatch #0 {NumberFormatException -> 0x00b3, blocks: (B:49:0x00a8, B:51:0x00ae, B:55:0x00b5), top: B:143:0x00a8 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b5 A[Catch: NumberFormatException -> 0x00b3, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x00b3, blocks: (B:49:0x00a8, B:51:0x00ae, B:55:0x00b5), top: B:143:0x00a8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(PushbackInputStream pushbackInputStream) throws IOException {
        int i10;
        String string;
        int i11 = pushbackInputStream.read();
        while (true) {
            if (i11 != 9 && i11 != 32 && i11 != 13 && i11 != 10) {
                break;
            }
            i11 = pushbackInputStream.read();
        }
        if (i11 == -1) {
            return null;
        }
        if (i11 == 37) {
            StringBuilder sb = new StringBuilder();
            sb.append((char) i11);
            int i12 = pushbackInputStream.read();
            while (i12 != -1 && i12 != 13 && i12 != 10) {
                sb.append((char) i12);
                i12 = pushbackInputStream.read();
            }
            return sb.toString();
        }
        if (i11 == 40) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = pushbackInputStream.read();
            while (i13 != -1 && i13 != 41) {
                sb2.append((char) i13);
                i13 = pushbackInputStream.read();
            }
            return sb2.toString();
        }
        if (i11 == 60) {
            int i14 = pushbackInputStream.read();
            if (i14 == 60) {
                HashMap map = new HashMap();
                Object objI = i(pushbackInputStream);
                while ((objI instanceof a) && !">>".equals(objI)) {
                    map.put(((a) objI).f24913a, i(pushbackInputStream));
                    objI = i(pushbackInputStream);
                }
                return map;
            }
            int i15 = 16;
            int i16 = -1;
            while (true) {
                byte[] bArr = this.f24911a;
                if (i14 == -1 || i14 == 62) {
                    break;
                }
                if (i14 >= 48 && i14 <= 57) {
                    i10 = i14 - 48;
                } else if (i14 >= 65 && i14 <= 70) {
                    i10 = i14 - 55;
                } else if (i14 >= 97 && i14 <= 102) {
                    i10 = i14 - 87;
                } else {
                    if (!g(i14)) {
                        throw new IOException("Error: expected hex character and not " + ((char) i14) + ":" + i14);
                    }
                    i14 = pushbackInputStream.read();
                }
                int i17 = i10 * i15;
                if (i15 == 16) {
                    i16++;
                    if (i16 >= bArr.length) {
                        throw new IOException("cmap token ist larger than buffer size " + bArr.length);
                    }
                    bArr[i16] = 0;
                    i15 = 1;
                } else {
                    i15 = 16;
                }
                bArr[i16] = (byte) (bArr[i16] + i17);
                i14 = pushbackInputStream.read();
            }
        } else {
            if (i11 == 62) {
                if (pushbackInputStream.read() == 62) {
                    return ">>";
                }
                throw new IOException("Error: expected the end of a dictionary.");
            }
            if (i11 == 91) {
                ArrayList arrayList = new ArrayList();
                Object objI2 = i(pushbackInputStream);
                while (objI2 != null && !"]".equals(objI2)) {
                    arrayList.add(objI2);
                    objI2 = i(pushbackInputStream);
                }
                return arrayList;
            }
            if (i11 == 93) {
                return "]";
            }
            switch (i11) {
                case EACTags.PIN_USAGE_POLICY /* 47 */:
                    StringBuilder sb3 = new StringBuilder();
                    int i18 = pushbackInputStream.read();
                    while (!g(i18) && !f(i18)) {
                        sb3.append((char) i18);
                        i18 = pushbackInputStream.read();
                    }
                    if (f(i18)) {
                        pushbackInputStream.unread(i18);
                    }
                    String string2 = sb3.toString();
                    a aVar = new a();
                    aVar.f24913a = string2;
                    return aVar;
                case 48:
                case 49:
                case 50:
                case EACTags.TRANSACTION_DATE /* 51 */:
                case 52:
                case EACTags.SEX /* 53 */:
                case EACTags.CURRENCY_EXPONENT /* 54 */:
                case 55:
                case 56:
                case 57:
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append((char) i11);
                    int i19 = pushbackInputStream.read();
                    try {
                        while (!g(i19)) {
                            char c10 = (char) i19;
                            if (!Character.isDigit(c10) && i19 != 46) {
                                pushbackInputStream.unread(i19);
                                string = sb4.toString();
                                return string.indexOf(46) < 0 ? Double.valueOf(string) : Integer.valueOf(string);
                            }
                            sb4.append(c10);
                            i19 = pushbackInputStream.read();
                        }
                        if (string.indexOf(46) < 0) {
                        }
                    } catch (NumberFormatException e10) {
                        throw new IOException(n.d("Invalid number '", string, "'"), e10);
                    }
                    pushbackInputStream.unread(i19);
                    string = sb4.toString();
                    break;
                default:
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append((char) i11);
                    int i20 = pushbackInputStream.read();
                    while (!g(i20) && !f(i20) && !Character.isDigit(i20)) {
                        sb5.append((char) i20);
                        i20 = pushbackInputStream.read();
                    }
                    if (f(i20) || Character.isDigit(i20)) {
                        pushbackInputStream.unread(i20);
                    }
                    String string3 = sb5.toString();
                    b bVar = new b();
                    bVar.f24914a = string3;
                    return bVar;
            }
        }
    }

    public c(int i10) {
        this.f24911a = new byte[512];
        this.f24912b = true;
    }
}
