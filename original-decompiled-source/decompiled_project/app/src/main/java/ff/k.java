package ff;

import android.util.Log;
import cf.l;
import cf.p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11230a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public b f11231b = null;

    /* renamed from: c, reason: collision with root package name */
    public b f11232c = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f11233a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f11234b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a[] f11235c;

        static {
            a aVar = new a("TABLE", 0);
            f11233a = aVar;
            a aVar2 = new a("STREAM", 1);
            f11234b = aVar2;
            f11235c = new a[]{aVar, aVar2};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f11235c.clone();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public cf.d f11236a = null;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f11238c = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public a f11237b = a.f11233a;
    }

    public final void a(long j10, a aVar) {
        this.f11231b = new b();
        this.f11230a.put(Long.valueOf(j10), this.f11231b);
        this.f11231b.f11237b = aVar;
    }

    public final void b(long j10) {
        if (this.f11232c != null) {
            Log.w("PdfBox-Android", "Method must be called only ones with last startxref value.");
            return;
        }
        b bVar = new b();
        this.f11232c = bVar;
        bVar.f11236a = new cf.d();
        Long lValueOf = Long.valueOf(j10);
        HashMap map = this.f11230a;
        b bVar2 = (b) map.get(lValueOf);
        ArrayList arrayList = new ArrayList();
        if (bVar2 == null) {
            Log.w("PdfBox-Android", "Did not found XRef object at specified startxref position " + j10);
            arrayList.addAll(map.keySet());
            Collections.sort(arrayList);
        } else {
            this.f11232c.f11237b = bVar2.f11237b;
            arrayList.add(Long.valueOf(j10));
            while (true) {
                cf.d dVar = bVar2.f11236a;
                if (dVar == null) {
                    break;
                }
                long jI0 = dVar.I0(l.Q1);
                if (jI0 == -1) {
                    break;
                }
                bVar2 = (b) map.get(Long.valueOf(jI0));
                if (bVar2 == null) {
                    Log.w("PdfBox-Android", "Did not found XRef object pointed to by 'Prev' key at position " + jI0);
                    break;
                } else {
                    arrayList.add(Long.valueOf(jI0));
                    if (arrayList.size() >= map.size()) {
                        break;
                    }
                }
            }
            Collections.reverse(arrayList);
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b bVar3 = (b) map.get((Long) obj);
            cf.d dVar2 = bVar3.f11236a;
            if (dVar2 != null) {
                this.f11232c.f11236a.g0(dVar2);
            }
            this.f11232c.f11238c.putAll(bVar3.f11238c);
        }
    }

    public final void c(p pVar, long j10) {
        b bVar = this.f11231b;
        if (bVar != null) {
            if (bVar.f11238c.containsKey(pVar)) {
                return;
            }
            this.f11231b.f11238c.put(pVar, Long.valueOf(j10));
        } else {
            Log.w("PdfBox-Android", "Cannot add XRef entry for '" + pVar.f5553a + "' because XRef start was not signalled.");
        }
    }
}
