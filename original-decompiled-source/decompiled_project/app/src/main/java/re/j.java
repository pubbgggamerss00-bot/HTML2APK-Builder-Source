package re;

import android.util.Log;
import androidx.datastore.preferences.protobuf.y0;
import j2.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.jf.dexlib2.dexbacked.raw.HeaderItem;
import p.g0;
import p5.d1;
import re.i;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public String[] f23472a;

    /* renamed from: b, reason: collision with root package name */
    public String f23473b;

    public static abstract class a extends re.c {

        /* renamed from: c, reason: collision with root package name */
        public C0259a[] f23474c;

        /* renamed from: re.j$a$a, reason: collision with other inner class name */
        public static class C0259a {

            /* renamed from: a, reason: collision with root package name */
            public int f23475a;

            /* renamed from: b, reason: collision with root package name */
            public int f23476b;

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                y0.a(C0259a.class, sb, "[code=");
                sb.append(this.f23475a);
                sb.append(", sid=");
                return x0.a.a(sb, this.f23476b, "]");
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f23477a = new HashMap();

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final ArrayList f23478a = new ArrayList();

            /* renamed from: b, reason: collision with root package name */
            public re.i f23479b = null;

            public final Number a(int i10) {
                return (Number) this.f23478a.get(i10);
            }

            public final boolean b() {
                return !this.f23478a.isEmpty();
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder();
                y0.a(a.class, sb, "[operands=");
                sb.append(this.f23478a);
                sb.append(", operator=");
                sb.append(this.f23479b);
                sb.append("]");
                return sb.toString();
            }
        }

        public final List<Number> a(String str, List<Number> list) {
            a aVarD = d(str);
            if (aVarD != null) {
                ArrayList arrayList = aVarD.f23478a;
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
            }
            return list;
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean b(String str) {
            a aVarD = d(str);
            boolean zBooleanValue = false;
            if (aVarD != null) {
                ArrayList arrayList = aVarD.f23478a;
                if (!arrayList.isEmpty()) {
                    Boolean bool = Boolean.FALSE;
                    Number number = (Number) arrayList.get(0);
                    if (number instanceof Integer) {
                        int iIntValue = number.intValue();
                        if (iIntValue != 0) {
                            if (iIntValue == 1) {
                                bool = Boolean.TRUE;
                            }
                        }
                        zBooleanValue = bool.booleanValue();
                    } else {
                        Log.w("PdfBox-Android", "Expected boolean, got " + number + ", returning default " + bool);
                        zBooleanValue = bool.booleanValue();
                    }
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }

        public final List c(String str) {
            a aVarD = d(str);
            if (aVarD == null) {
                return null;
            }
            ArrayList arrayList = aVarD.f23478a;
            if (arrayList.isEmpty()) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int i10 = 1; i10 < arrayList2.size(); i10++) {
                Number number = (Number) arrayList2.get(i10 - 1);
                arrayList2.set(i10, Integer.valueOf(((Number) arrayList2.get(i10)).intValue() + number.intValue()));
            }
            return arrayList2;
        }

        public final a d(String str) {
            return (a) this.f23477a.get(str);
        }

        public final Number e(Number number, String str) {
            a aVarD = d(str);
            return (aVarD == null || aVarD.f23478a.isEmpty()) ? number : aVarD.a(0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(b.class, sb, "[entries=");
            sb.append(this.f23477a);
            sb.append("]");
            return sb.toString();
        }
    }

    public static abstract class c extends d1 {
    }

    public static class d extends c {
        public final String toString() {
            return d.class.getName();
        }
    }

    public static class e extends c {

        /* renamed from: g, reason: collision with root package name */
        public int f23480g;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(e.class, sb, "[format=");
            return x0.a.a(sb, this.f23480g, "]");
        }
    }

    public static class f extends a {

        /* renamed from: d, reason: collision with root package name */
        public int f23481d;

        /* renamed from: e, reason: collision with root package name */
        public int f23482e;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(f.class, sb, "[format=");
            sb.append(this.f23481d);
            sb.append(", nCodes=");
            sb.append(this.f23482e);
            sb.append(", supplement=");
            sb.append(Arrays.toString(this.f23474c));
            sb.append("]");
            return sb.toString();
        }
    }

    public static class g extends c5.p {

        /* renamed from: a, reason: collision with root package name */
        public int[] f23483a;

        @Override // c5.p
        public final int V(int i10) {
            int[] iArr = this.f23483a;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(g.class, sb, "[fds=");
            sb.append(Arrays.toString(this.f23483a));
            sb.append("]");
            return sb.toString();
        }
    }

    public static class h extends c {

        /* renamed from: g, reason: collision with root package name */
        public int f23484g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f23485h;

        @Override // p5.d1
        public final int d(int i10) {
            int i11;
            if (this.f21200a) {
                ArrayList arrayList = this.f23485h;
                int size = arrayList.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList.get(i12);
                    i12++;
                    m mVar = (m) obj;
                    int i13 = mVar.f23498c;
                    if (i10 >= i13 && i10 <= (i11 = mVar.f23499d)) {
                        if (i10 < i13 || i10 > i11) {
                            return 0;
                        }
                        return (i10 - i13) + mVar.f23496a;
                    }
                }
            }
            return super.d(i10);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(h.class, sb, "[format=");
            return x0.a.a(sb, this.f23484g, "]");
        }
    }

    public static class i extends a {

        /* renamed from: d, reason: collision with root package name */
        public int f23486d;

        /* renamed from: e, reason: collision with root package name */
        public int f23487e;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(i.class, sb, "[format=");
            sb.append(this.f23486d);
            sb.append(", nRanges=");
            sb.append(this.f23487e);
            sb.append(", supplement=");
            sb.append(Arrays.toString(this.f23474c));
            sb.append("]");
            return sb.toString();
        }
    }

    /* renamed from: re.j$j, reason: collision with other inner class name */
    public static class C0260j extends c {

        /* renamed from: g, reason: collision with root package name */
        public int f23488g;

        /* renamed from: h, reason: collision with root package name */
        public ArrayList f23489h;

        @Override // p5.d1
        public final int d(int i10) {
            int i11;
            ArrayList arrayList = this.f23489h;
            int size = arrayList.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList.get(i12);
                i12++;
                m mVar = (m) obj;
                int i13 = mVar.f23498c;
                if (i10 >= i13 && i10 <= (i11 = mVar.f23499d)) {
                    if (i10 < i13 || i10 > i11) {
                        return 0;
                    }
                    return (i10 - i13) + mVar.f23496a;
                }
            }
            return super.d(i10);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(C0260j.class, sb, "[format=");
            return x0.a.a(sb, this.f23488g, "]");
        }
    }

    public static final class k extends c5.p {

        /* renamed from: a, reason: collision with root package name */
        public int f23490a;

        /* renamed from: b, reason: collision with root package name */
        public int f23491b;

        /* renamed from: c, reason: collision with root package name */
        public l[] f23492c;

        /* renamed from: d, reason: collision with root package name */
        public int f23493d;

        @Override // c5.p
        public final int V(int i10) {
            int i11 = 0;
            while (true) {
                int i12 = this.f23491b;
                if (i11 >= i12) {
                    return 0;
                }
                l[] lVarArr = this.f23492c;
                l lVar = lVarArr[i11];
                if (lVar.f23494a <= i10) {
                    int i13 = i11 + 1;
                    if (i13 >= i12) {
                        if (this.f23493d > i10) {
                            return lVar.f23495b;
                        }
                        return -1;
                    }
                    if (lVarArr[i13].f23494a > i10) {
                        return lVar.f23495b;
                    }
                }
                i11++;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(k.class, sb, "[format=");
            sb.append(this.f23490a);
            sb.append(" nbRanges=");
            sb.append(this.f23491b);
            sb.append(", range3=");
            sb.append(Arrays.toString(this.f23492c));
            sb.append(" sentinel=");
            return x0.a.a(sb, this.f23493d, "]");
        }
    }

    public static final class l {

        /* renamed from: a, reason: collision with root package name */
        public int f23494a;

        /* renamed from: b, reason: collision with root package name */
        public int f23495b;

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(l.class, sb, "[first=");
            sb.append(this.f23494a);
            sb.append(", fd=");
            return x0.a.a(sb, this.f23495b, "]");
        }
    }

    public static final class m {

        /* renamed from: a, reason: collision with root package name */
        public final int f23496a;

        /* renamed from: b, reason: collision with root package name */
        public final int f23497b;

        /* renamed from: c, reason: collision with root package name */
        public final int f23498c;

        /* renamed from: d, reason: collision with root package name */
        public final int f23499d;

        public m(int i10, int i11, int i12) {
            this.f23496a = i10;
            this.f23497b = i10 + i12;
            this.f23498c = i11;
            this.f23499d = i11 + i12;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            y0.a(m.class, sb, "[start value=");
            sb.append(this.f23496a);
            sb.append(", end value=");
            sb.append(this.f23497b);
            sb.append(", start mapped-value=");
            sb.append(this.f23498c);
            sb.append(", end mapped-value=");
            return x0.a.a(sb, this.f23499d, "]");
        }
    }

    public static b.a b(re.b bVar) throws IOException {
        int iF;
        Double dValueOf;
        b.a aVar = new b.a();
        while (true) {
            iF = bVar.f();
            if (iF >= 0 && iF <= 21) {
                aVar.f23479b = (re.i) re.i.f23467c.get(iF == 12 ? new i.a(iF, bVar.f()) : new i.a(iF));
                return aVar;
            }
            if (iF == 28 || iF == 29) {
                aVar.f23478a.add(e(bVar, iF));
            } else if (iF == 30) {
                StringBuilder sb = new StringBuilder();
                boolean z10 = false;
                boolean z11 = false;
                boolean z12 = false;
                while (!z10) {
                    int iF2 = bVar.f();
                    int[] iArr = {iF2 / 16, iF2 % 16};
                    for (int i10 = 0; i10 < 2; i10++) {
                        int i11 = iArr[i10];
                        switch (i11) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                sb.append(i11);
                                z11 = false;
                            case 10:
                                sb.append(".");
                            case 11:
                                if (z12) {
                                    Log.w("PdfBox-Android", "duplicate 'E' ignored after " + ((Object) sb));
                                } else {
                                    sb.append("E");
                                    z11 = true;
                                    z12 = true;
                                }
                            case 12:
                                if (z12) {
                                    Log.w("PdfBox-Android", "duplicate 'E-' ignored after " + ((Object) sb));
                                } else {
                                    sb.append("E-");
                                    z11 = true;
                                    z12 = true;
                                }
                            case 13:
                            case 14:
                                sb.append("-");
                            case 15:
                                z10 = true;
                            default:
                                throw new IllegalArgumentException(y.a(i11, "illegal nibble "));
                        }
                    }
                }
                if (z11) {
                    sb.append(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
                }
                if (sb.length() == 0) {
                    dValueOf = Double.valueOf(0.0d);
                } else {
                    try {
                        dValueOf = Double.valueOf(sb.toString());
                    } catch (NumberFormatException e10) {
                        throw new IOException(e10);
                    }
                }
                aVar.f23478a.add(dValueOf);
            } else if (iF >= 32 && iF <= 254) {
                aVar.f23478a.add(e(bVar, iF));
            }
        }
        throw new IOException(y.a(iF, "invalid DICT data b0 byte: "));
    }

    public static byte[][] c(re.b bVar) throws IOException {
        int[] iArrD = d(bVar);
        if (iArrD == null) {
            return null;
        }
        int length = iArrD.length - 1;
        byte[][] bArr = new byte[length][];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            bArr[i10] = bVar.d(iArrD[i11] - iArrD[i10]);
            i10 = i11;
        }
        return bArr;
    }

    public static int[] d(re.b bVar) throws IOException {
        int iG = bVar.g();
        if (iG == 0) {
            return null;
        }
        int iH = bVar.h();
        int[] iArr = new int[iG + 1];
        for (int i10 = 0; i10 <= iG; i10++) {
            int iF = 0;
            for (int i11 = 0; i11 < iH; i11++) {
                iF = (iF << 8) | bVar.f();
            }
            if (iF > bVar.f23510a.length) {
                throw new IOException(ad.b.b(iF, "illegal offset value ", " in CFF font"));
            }
            iArr[i10] = iF;
        }
        return iArr;
    }

    public static Integer e(re.b bVar, int i10) throws IOException {
        if (i10 == 28) {
            return Integer.valueOf((short) bVar.g());
        }
        if (i10 == 29) {
            return Integer.valueOf(bVar.e());
        }
        if (i10 >= 32 && i10 <= 246) {
            return Integer.valueOf(i10 - 139);
        }
        if (i10 >= 247 && i10 <= 250) {
            return Integer.valueOf(((i10 - 247) * 256) + bVar.f() + HeaderItem.DATA_START_OFFSET);
        }
        if (i10 < 251 || i10 > 254) {
            throw new IllegalArgumentException();
        }
        return Integer.valueOf((((-(i10 - 251)) * 256) - bVar.f()) - 108);
    }

    public static LinkedHashMap f(b bVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(17);
        linkedHashMap.put("BlueValues", bVar.c("BlueValues"));
        linkedHashMap.put("OtherBlues", bVar.c("OtherBlues"));
        linkedHashMap.put("FamilyBlues", bVar.c("FamilyBlues"));
        linkedHashMap.put("FamilyOtherBlues", bVar.c("FamilyOtherBlues"));
        linkedHashMap.put("BlueScale", bVar.e(Double.valueOf(0.039625d), "BlueScale"));
        linkedHashMap.put("BlueShift", bVar.e(7, "BlueShift"));
        linkedHashMap.put("BlueFuzz", bVar.e(1, "BlueFuzz"));
        linkedHashMap.put("StdHW", bVar.e(null, "StdHW"));
        linkedHashMap.put("StdVW", bVar.e(null, "StdVW"));
        linkedHashMap.put("StemSnapH", bVar.c("StemSnapH"));
        linkedHashMap.put("StemSnapV", bVar.c("StemSnapV"));
        linkedHashMap.put("ForceBold", bVar.b("ForceBold"));
        linkedHashMap.put("LanguageGroup", bVar.e(0, "LanguageGroup"));
        linkedHashMap.put("ExpansionFactor", bVar.e(Double.valueOf(0.06d), "ExpansionFactor"));
        linkedHashMap.put("initialRandomSeed", bVar.e(0, "initialRandomSeed"));
        linkedHashMap.put("defaultWidthX", bVar.e(0, "defaultWidthX"));
        linkedHashMap.put("nominalWidthX", bVar.e(0, "nominalWidthX"));
        return linkedHashMap;
    }

    public static String[] h(re.b bVar) throws IOException {
        int[] iArrD = d(bVar);
        if (iArrD == null) {
            return null;
        }
        int length = iArrD.length - 1;
        String[] strArr = new String[length];
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            int i12 = iArrD[i11] - iArrD[i10];
            if (i12 < 0) {
                StringBuilder sbA = g0.a(i12, i10, "Negative index data length + ", " at ", ": offsets[");
                sbA.append(i11);
                sbA.append("]=");
                sbA.append(iArrD[i11]);
                sbA.append(", offsets[");
                sbA.append(i10);
                sbA.append("]=");
                sbA.append(iArrD[i10]);
                throw new IOException(sbA.toString());
            }
            strArr[i10] = new String(bVar.d(i12), xe.a.f33561a);
            i10 = i11;
        }
        return strArr;
    }

    public final String a(b bVar, String str) throws IOException {
        b.a aVarD = bVar.d(str);
        if (aVarD == null || !aVarD.b()) {
            return null;
        }
        return g(aVarD.a(0).intValue());
    }

    public final String g(int i10) throws IOException {
        int i11;
        if (i10 < 0) {
            throw new IOException("Invalid negative index when reading a string");
        }
        if (i10 <= 390) {
            return re.l.f23501a[i10];
        }
        String[] strArr = this.f23472a;
        return (strArr == null || (i11 = i10 + (-391)) >= strArr.length) ? y.a(i10, "SID") : strArr[i11];
    }

    public final void i(re.b bVar, a aVar) throws IOException {
        aVar.f23474c = new a.C0259a[bVar.f()];
        for (int i10 = 0; i10 < aVar.f23474c.length; i10++) {
            a.C0259a c0259a = new a.C0259a();
            c0259a.f23475a = bVar.f();
            int iG = bVar.g();
            c0259a.f23476b = iG;
            g(iG);
            aVar.f23474c[i10] = c0259a;
            aVar.a(c0259a.f23475a, g(c0259a.f23476b));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(j.class.getSimpleName());
        sb.append("[");
        return b.o.a(sb, this.f23473b, "]");
    }
}
