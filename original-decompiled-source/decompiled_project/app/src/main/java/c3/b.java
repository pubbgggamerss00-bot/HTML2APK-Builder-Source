package c3;

import a3.c;
import android.os.LocaleList;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LocaleSpan;
import android.text.style.RelativeSizeSpan;
import c2.n0;
import f3.d;
import f3.t;
import f3.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import qg.p;

/* loaded from: classes.dex */
public final class b {
    public static final float a(float f10, d dVar) {
        if (t.a(0L, t.f8833c)) {
            return f10;
        }
        long jB = t.b(0L);
        if (v.a(jB, 4294967296L)) {
            return dVar.r1(0L);
        }
        if (v.a(jB, 8589934592L)) {
            return t.c(0L) * f10;
        }
        return Float.NaN;
    }

    public static final float b(long j10, float f10, d dVar) {
        float fC;
        long jB = t.b(j10);
        if (v.a(jB, 4294967296L)) {
            if (dVar.G0() <= 1.05d) {
                return dVar.r1(j10);
            }
            fC = t.c(j10) / t.c(dVar.t(f10));
        } else {
            if (!v.a(jB, 8589934592L)) {
                return Float.NaN;
            }
            fC = t.c(j10);
        }
        return fC * f10;
    }

    public static final void c(Spannable spannable, long j10, int i10, int i11) {
        if (j10 != 16) {
            spannable.setSpan(new ForegroundColorSpan(n0.j(j10)), i10, i11, 33);
        }
    }

    public static final void d(Spannable spannable, long j10, d dVar, int i10, int i11) {
        long jB = t.b(j10);
        if (v.a(jB, 4294967296L)) {
            spannable.setSpan(new AbsoluteSizeSpan(gh.a.b(dVar.r1(j10)), false), i10, i11, 33);
        } else if (v.a(jB, 8589934592L)) {
            spannable.setSpan(new RelativeSizeSpan(t.c(j10)), i10, i11, 33);
        }
    }

    public static final void e(Spannable spannable, c cVar, int i10, int i11) {
        if (cVar != null) {
            ArrayList arrayList = new ArrayList(p.h(cVar, 10));
            Iterator<a3.b> it = cVar.f25a.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().f23a);
            }
            Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
            spannable.setSpan(new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length))), i10, i11, 33);
        }
    }
}
