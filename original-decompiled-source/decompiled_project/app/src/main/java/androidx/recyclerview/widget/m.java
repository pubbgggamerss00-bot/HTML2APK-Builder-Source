package androidx.recyclerview.widget;

import android.os.Trace;
import androidx.recyclerview.widget.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadLocal<m> f2618e = new ThreadLocal<>();

    /* renamed from: f, reason: collision with root package name */
    public static final a f2619f = new a();

    /* renamed from: b, reason: collision with root package name */
    public long f2621b;

    /* renamed from: c, reason: collision with root package name */
    public long f2622c;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<v> f2620a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList<c> f2623d = new ArrayList<>();

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            v vVar = cVar3.f2631d;
            if ((vVar == null) == (cVar4.f2631d == null)) {
                boolean z10 = cVar3.f2628a;
                if (z10 == cVar4.f2628a) {
                    int i10 = cVar4.f2629b - cVar3.f2629b;
                    if (i10 != 0) {
                        return i10;
                    }
                    int i11 = cVar3.f2630c - cVar4.f2630c;
                    if (i11 != 0) {
                        return i11;
                    }
                    return 0;
                }
                if (z10) {
                    return -1;
                }
            } else if (vVar != null) {
                return -1;
            }
            return 1;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f2624a;

        /* renamed from: b, reason: collision with root package name */
        public int f2625b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f2626c;

        /* renamed from: d, reason: collision with root package name */
        public int f2627d;

        public final void a(int i10, int i11) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i12 = this.f2627d;
            int i13 = i12 * 2;
            int[] iArr = this.f2626c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f2626c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i13 >= iArr.length) {
                int[] iArr3 = new int[i12 * 4];
                this.f2626c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f2626c;
            iArr4[i13] = i10;
            iArr4[i13 + 1] = i11;
            this.f2627d++;
        }

        public final void b(v vVar, boolean z10) {
            this.f2627d = 0;
            int[] iArr = this.f2626c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            v.l lVar = vVar.f2682n;
            if (vVar.f2680m == null || lVar == null || !lVar.f2748i) {
                return;
            }
            if (z10) {
                if (!vVar.f2665e.f()) {
                    lVar.i(vVar.f2680m.a(), this);
                }
            } else if (!vVar.L()) {
                lVar.h(this.f2624a, this.f2625b, vVar.f2675j0, this);
            }
            int i10 = this.f2627d;
            if (i10 > lVar.f2749j) {
                lVar.f2749j = i10;
                lVar.f2750k = z10;
                vVar.f2661c.n();
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2628a;

        /* renamed from: b, reason: collision with root package name */
        public int f2629b;

        /* renamed from: c, reason: collision with root package name */
        public int f2630c;

        /* renamed from: d, reason: collision with root package name */
        public v f2631d;

        /* renamed from: e, reason: collision with root package name */
        public int f2632e;
    }

    public static v.a0 c(v vVar, int i10, long j10) {
        int iH = vVar.f2667f.h();
        for (int i11 = 0; i11 < iH; i11++) {
            v.a0 a0VarJ = v.J(vVar.f2667f.g(i11));
            if (a0VarJ.f2710c == i10 && !a0VarJ.e()) {
                return null;
            }
        }
        v.r rVar = vVar.f2661c;
        try {
            vVar.Q();
            v.a0 a0VarL = rVar.l(i10, j10);
            if (a0VarL != null) {
                if (!a0VarL.d() || a0VarL.e()) {
                    rVar.a(a0VarL, false);
                } else {
                    rVar.i(a0VarL.f2708a);
                }
            }
            vVar.R(false);
            return a0VarL;
        } catch (Throwable th2) {
            vVar.R(false);
            throw th2;
        }
    }

    public final void a(v vVar, int i10, int i11) {
        if (vVar.f2696v) {
            if (v.C0 && !this.f2620a.contains(vVar)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f2621b == 0) {
                this.f2621b = vVar.getNanoTime();
                vVar.post(this);
            }
        }
        b bVar = vVar.f2673i0;
        bVar.f2624a = i10;
        bVar.f2625b = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j10) {
        c cVar;
        v vVar;
        v vVar2;
        c cVar2;
        ArrayList<v> arrayList = this.f2620a;
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            v vVar3 = arrayList.get(i11);
            int windowVisibility = vVar3.getWindowVisibility();
            b bVar = vVar3.f2673i0;
            if (windowVisibility == 0) {
                bVar.b(vVar3, false);
                i10 += bVar.f2627d;
            }
        }
        ArrayList<c> arrayList2 = this.f2623d;
        arrayList2.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            v vVar4 = arrayList.get(i13);
            if (vVar4.getWindowVisibility() == 0) {
                b bVar2 = vVar4.f2673i0;
                int iAbs = Math.abs(bVar2.f2625b) + Math.abs(bVar2.f2624a);
                for (int i14 = 0; i14 < bVar2.f2627d * 2; i14 += 2) {
                    if (i12 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i12);
                    }
                    int[] iArr = bVar2.f2626c;
                    int i15 = iArr[i14 + 1];
                    cVar2.f2628a = i15 <= iAbs;
                    cVar2.f2629b = iAbs;
                    cVar2.f2630c = i15;
                    cVar2.f2631d = vVar4;
                    cVar2.f2632e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(arrayList2, f2619f);
        for (int i16 = 0; i16 < arrayList2.size() && (vVar = (cVar = arrayList2.get(i16)).f2631d) != null; i16++) {
            v.a0 a0VarC = c(vVar, cVar.f2632e, cVar.f2628a ? Long.MAX_VALUE : j10);
            if (a0VarC != null && a0VarC.f2709b != null && a0VarC.d() && !a0VarC.e() && (vVar2 = a0VarC.f2709b.get()) != null) {
                if (vVar2.E && vVar2.f2667f.h() != 0) {
                    v.r rVar = vVar2.f2661c;
                    v.i iVar = vVar2.O;
                    if (iVar != null) {
                        iVar.e();
                    }
                    v.l lVar = vVar2.f2682n;
                    if (lVar != null) {
                        lVar.i0(rVar);
                        vVar2.f2682n.j0(rVar);
                    }
                    rVar.f2772a.clear();
                    rVar.g();
                }
                b bVar3 = vVar2.f2673i0;
                bVar3.b(vVar2, true);
                if (bVar3.f2627d != 0) {
                    try {
                        int i17 = u3.i.f29248a;
                        Trace.beginSection("RV Nested Prefetch");
                        v.w wVar = vVar2.f2675j0;
                        v.d dVar = vVar2.f2680m;
                        wVar.f2800d = 1;
                        wVar.f2801e = dVar.a();
                        wVar.f2803g = false;
                        wVar.f2804h = false;
                        wVar.f2805i = false;
                        for (int i18 = 0; i18 < bVar3.f2627d * 2; i18 += 2) {
                            c(vVar2, bVar3.f2626c[i18], j10);
                        }
                        Trace.endSection();
                    } catch (Throwable th2) {
                        int i19 = u3.i.f29248a;
                        Trace.endSection();
                        throw th2;
                    }
                }
            }
            cVar.f2628a = false;
            cVar.f2629b = 0;
            cVar.f2630c = 0;
            cVar.f2631d = null;
            cVar.f2632e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<v> arrayList = this.f2620a;
        try {
            int i10 = u3.i.f29248a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    v vVar = arrayList.get(i11);
                    if (vVar.getWindowVisibility() == 0) {
                        jMax = Math.max(vVar.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f2622c);
                }
            }
            this.f2621b = 0L;
            Trace.endSection();
        } catch (Throwable th2) {
            this.f2621b = 0L;
            int i12 = u3.i.f29248a;
            Trace.endSection();
            throw th2;
        }
    }
}
