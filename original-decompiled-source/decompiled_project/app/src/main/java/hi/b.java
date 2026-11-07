package hi;

import qg.c;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13032a = -1234567890;

    public static final boolean a(int i10, byte[] a10, int i11, byte[] b10, int i12) {
        kotlin.jvm.internal.r.e(a10, "a");
        kotlin.jvm.internal.r.e(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void b(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            StringBuilder sbA = h1.y.a("size=", " offset=", j10);
            sbA.append(j11);
            sbA.append(" byteCount=");
            sbA.append(j12);
            throw new ArrayIndexOutOfBoundsException(sbA.toString());
        }
    }

    public static final int c(j jVar, int i10) {
        return i10 == f13032a ? jVar.d() : i10;
    }

    public static final String d(int i10) {
        if (i10 == 0) {
            return com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0;
        }
        char[] cArr = ii.b.f14536a;
        int i11 = 0;
        char[] cArr2 = {cArr[(i10 >> 28) & 15], cArr[(i10 >> 24) & 15], cArr[(i10 >> 20) & 15], cArr[(i10 >> 16) & 15], cArr[(i10 >> 12) & 15], cArr[(i10 >> 8) & 15], cArr[(i10 >> 4) & 15], cArr[i10 & 15]};
        while (i11 < 8 && cArr2[i11] == '0') {
            i11++;
        }
        c.a.a(i11, 8, 8);
        return new String(cArr2, i11, 8 - i11);
    }
}
