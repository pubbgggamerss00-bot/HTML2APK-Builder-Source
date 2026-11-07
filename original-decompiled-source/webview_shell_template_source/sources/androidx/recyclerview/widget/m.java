package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class m implements Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final ThreadLocal<m> f1682w = new ThreadLocal<>();

    /* renamed from: x, reason: collision with root package name */
    public static final a f1683x = new a();

    /* renamed from: t, reason: collision with root package name */
    public long f1684t;

    /* renamed from: u, reason: collision with root package name */
    public long f1685u;
    public final ArrayList<RecyclerView> s = new ArrayList<>();

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList<c> f1686v = new ArrayList<>();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            c cVar3 = cVar;
            c cVar4 = cVar2;
            RecyclerView recyclerView = cVar3.f1694d;
            if ((recyclerView == null) == (cVar4.f1694d == null)) {
                boolean z6 = cVar3.f1691a;
                if (z6 == cVar4.f1691a) {
                    int i6 = cVar4.f1692b - cVar3.f1692b;
                    if (i6 != 0) {
                        return i6;
                    }
                    int i7 = cVar3.f1693c - cVar4.f1693c;
                    if (i7 != 0) {
                        return i7;
                    }
                    return 0;
                }
                if (z6) {
                    return -1;
                }
            } else if (recyclerView != null) {
                return -1;
            }
            return 1;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    @SuppressLint({"VisibleForTests"})
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1687a;

        /* renamed from: b, reason: collision with root package name */
        public int f1688b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f1689c;

        /* renamed from: d, reason: collision with root package name */
        public int f1690d;

        public final void a(int i6, int i7) {
            if (i6 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i7 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i8 = this.f1690d;
            int i9 = i8 * 2;
            int[] iArr = this.f1689c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f1689c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i9 >= iArr.length) {
                int[] iArr3 = new int[i8 * 4];
                this.f1689c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f1689c;
            iArr4[i9] = i6;
            iArr4[i9 + 1] = i7;
            this.f1690d++;
        }

        public final void b(RecyclerView recyclerView, boolean z6) {
            this.f1690d = 0;
            int[] iArr = this.f1689c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.F;
            if (recyclerView.E == null || mVar == null || !mVar.f1479i) {
                return;
            }
            if (z6) {
                if (!recyclerView.f1426w.g()) {
                    mVar.i(recyclerView.E.a(), this);
                }
            } else if (!recyclerView.O()) {
                mVar.h(this.f1687a, this.f1688b, recyclerView.f1433z0, this);
            }
            int i6 = this.f1690d;
            if (i6 > mVar.f1480j) {
                mVar.f1480j = i6;
                mVar.f1481k = z6;
                recyclerView.f1422u.n();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1691a;

        /* renamed from: b, reason: collision with root package name */
        public int f1692b;

        /* renamed from: c, reason: collision with root package name */
        public int f1693c;

        /* renamed from: d, reason: collision with root package name */
        public RecyclerView f1694d;

        /* renamed from: e, reason: collision with root package name */
        public int f1695e;
    }

    public static RecyclerView.b0 c(RecyclerView recyclerView, int i6, long j6) {
        int iH = recyclerView.f1428x.h();
        for (int i7 = 0; i7 < iH; i7++) {
            RecyclerView.b0 b0VarM = RecyclerView.M(recyclerView.f1428x.g(i7));
            if (b0VarM.f1443c == i6 && !b0VarM.f()) {
                return null;
            }
        }
        RecyclerView.s sVar = recyclerView.f1422u;
        try {
            recyclerView.T();
            RecyclerView.b0 b0VarL = sVar.l(i6, j6);
            if (b0VarL != null) {
                if (!b0VarL.e() || b0VarL.f()) {
                    sVar.a(b0VarL, false);
                } else {
                    sVar.i(b0VarL.f1441a);
                }
            }
            recyclerView.U(false);
            return b0VarL;
        } catch (Throwable th) {
            recyclerView.U(false);
            throw th;
        }
    }

    public final void a(RecyclerView recyclerView, int i6, int i7) {
        if (recyclerView.L) {
            if (RecyclerView.S0 && !this.s.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f1684t == 0) {
                this.f1684t = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        b bVar = recyclerView.f1431y0;
        bVar.f1687a = i6;
        bVar.f1688b = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(long j6) {
        c cVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        c cVar2;
        ArrayList<RecyclerView> arrayList = this.s;
        int size = arrayList.size();
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            RecyclerView recyclerView3 = arrayList.get(i7);
            int windowVisibility = recyclerView3.getWindowVisibility();
            b bVar = recyclerView3.f1431y0;
            if (windowVisibility == 0) {
                bVar.b(recyclerView3, false);
                i6 += bVar.f1690d;
            }
        }
        ArrayList<c> arrayList2 = this.f1686v;
        arrayList2.ensureCapacity(i6);
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView4 = arrayList.get(i9);
            if (recyclerView4.getWindowVisibility() == 0) {
                b bVar2 = recyclerView4.f1431y0;
                int iAbs = Math.abs(bVar2.f1688b) + Math.abs(bVar2.f1687a);
                for (int i10 = 0; i10 < bVar2.f1690d * 2; i10 += 2) {
                    if (i8 >= arrayList2.size()) {
                        cVar2 = new c();
                        arrayList2.add(cVar2);
                    } else {
                        cVar2 = arrayList2.get(i8);
                    }
                    int[] iArr = bVar2.f1689c;
                    int i11 = iArr[i10 + 1];
                    cVar2.f1691a = i11 <= iAbs;
                    cVar2.f1692b = iAbs;
                    cVar2.f1693c = i11;
                    cVar2.f1694d = recyclerView4;
                    cVar2.f1695e = iArr[i10];
                    i8++;
                }
            }
        }
        Collections.sort(arrayList2, f1683x);
        for (int i12 = 0; i12 < arrayList2.size() && (recyclerView = (cVar = arrayList2.get(i12)).f1694d) != null; i12++) {
            RecyclerView.b0 b0VarC = c(recyclerView, cVar.f1695e, cVar.f1691a ? Long.MAX_VALUE : j6);
            if (b0VarC != null && b0VarC.f1442b != null && b0VarC.e() && !b0VarC.f() && (recyclerView2 = b0VarC.f1442b.get()) != null) {
                if (recyclerView2.V && recyclerView2.f1428x.h() != 0) {
                    RecyclerView.s sVar = recyclerView2.f1422u;
                    RecyclerView.j jVar = recyclerView2.f1409h0;
                    if (jVar != null) {
                        jVar.e();
                    }
                    RecyclerView.m mVar = recyclerView2.F;
                    if (mVar != null) {
                        mVar.i0(sVar);
                        recyclerView2.F.j0(sVar);
                    }
                    sVar.f1503a.clear();
                    sVar.g();
                }
                b bVar3 = recyclerView2.f1431y0;
                bVar3.b(recyclerView2, true);
                if (bVar3.f1690d != 0) {
                    try {
                        int i13 = q0.j.f14103a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.f1433z0;
                        RecyclerView.e eVar = recyclerView2.E;
                        xVar.f1529d = 1;
                        xVar.f1530e = eVar.a();
                        xVar.f1532g = false;
                        xVar.h = false;
                        xVar.f1533i = false;
                        for (int i14 = 0; i14 < bVar3.f1690d * 2; i14 += 2) {
                            c(recyclerView2, bVar3.f1689c[i14], j6);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i15 = q0.j.f14103a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            cVar.f1691a = false;
            cVar.f1692b = 0;
            cVar.f1693c = 0;
            cVar.f1694d = null;
            cVar.f1695e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList<RecyclerView> arrayList = this.s;
        try {
            int i6 = q0.j.f14103a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = arrayList.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f1685u);
                }
            }
            this.f1684t = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f1684t = 0L;
            int i8 = q0.j.f14103a;
            Trace.endSection();
            throw th;
        }
    }
}
