package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final v f1588a;

    /* renamed from: e, reason: collision with root package name */
    public View f1592e;

    /* renamed from: d, reason: collision with root package name */
    public int f1591d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f1589b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f1590c = new ArrayList();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f1593a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f1594b;

        public final void a(int i6) {
            if (i6 < 64) {
                this.f1593a &= ~(1 << i6);
                return;
            }
            a aVar = this.f1594b;
            if (aVar != null) {
                aVar.a(i6 - 64);
            }
        }

        public final int b(int i6) {
            a aVar = this.f1594b;
            if (aVar == null) {
                return i6 >= 64 ? Long.bitCount(this.f1593a) : Long.bitCount(this.f1593a & ((1 << i6) - 1));
            }
            if (i6 < 64) {
                return Long.bitCount(this.f1593a & ((1 << i6) - 1));
            }
            return Long.bitCount(this.f1593a) + aVar.b(i6 - 64);
        }

        public final void c() {
            if (this.f1594b == null) {
                this.f1594b = new a();
            }
        }

        public final boolean d(int i6) {
            if (i6 < 64) {
                return (this.f1593a & (1 << i6)) != 0;
            }
            c();
            return this.f1594b.d(i6 - 64);
        }

        public final void e(int i6, boolean z6) {
            if (i6 >= 64) {
                c();
                this.f1594b.e(i6 - 64, z6);
                return;
            }
            long j6 = this.f1593a;
            boolean z7 = (Long.MIN_VALUE & j6) != 0;
            long j7 = (1 << i6) - 1;
            this.f1593a = ((j6 & (~j7)) << 1) | (j6 & j7);
            if (z6) {
                h(i6);
            } else {
                a(i6);
            }
            if (z7 || this.f1594b != null) {
                c();
                this.f1594b.e(0, z7);
            }
        }

        public final boolean f(int i6) {
            if (i6 >= 64) {
                c();
                return this.f1594b.f(i6 - 64);
            }
            long j6 = 1 << i6;
            long j7 = this.f1593a;
            boolean z6 = (j7 & j6) != 0;
            long j8 = j7 & (~j6);
            this.f1593a = j8;
            long j9 = j6 - 1;
            this.f1593a = (j8 & j9) | Long.rotateRight((~j9) & j8, 1);
            a aVar = this.f1594b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1594b.f(0);
            }
            return z6;
        }

        public final void g() {
            this.f1593a = 0L;
            a aVar = this.f1594b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i6) {
            if (i6 < 64) {
                this.f1593a |= 1 << i6;
            } else {
                c();
                this.f1594b.h(i6 - 64);
            }
        }

        public final String toString() {
            if (this.f1594b == null) {
                return Long.toBinaryString(this.f1593a);
            }
            return this.f1594b.toString() + "xx" + Long.toBinaryString(this.f1593a);
        }
    }

    public b(v vVar) {
        this.f1588a = vVar;
    }

    public final void a(View view, int i6, boolean z6) {
        RecyclerView recyclerView = this.f1588a.f1719a;
        int childCount = i6 < 0 ? recyclerView.getChildCount() : f(i6);
        this.f1589b.e(childCount, z6);
        if (z6) {
            i(view);
        }
        recyclerView.addView(view, childCount);
        RecyclerView.b0 b0VarM = RecyclerView.M(view);
        RecyclerView.e eVar = recyclerView.E;
        if (eVar == null || b0VarM == null) {
            return;
        }
        eVar.e(b0VarM);
    }

    public final void b(View view, int i6, ViewGroup.LayoutParams layoutParams, boolean z6) {
        RecyclerView recyclerView = this.f1588a.f1719a;
        int childCount = i6 < 0 ? recyclerView.getChildCount() : f(i6);
        this.f1589b.e(childCount, z6);
        if (z6) {
            i(view);
        }
        RecyclerView.b0 b0VarM = RecyclerView.M(view);
        if (b0VarM != null) {
            if (!b0VarM.j() && !b0VarM.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(b0VarM);
                throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, sb));
            }
            if (RecyclerView.T0) {
                Log.d("RecyclerView", "reAttach " + b0VarM);
            }
            b0VarM.f1449j &= -257;
        } else if (RecyclerView.S0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i6) {
        int iF = f(i6);
        this.f1589b.f(iF);
        RecyclerView recyclerView = this.f1588a.f1719a;
        View childAt = recyclerView.getChildAt(iF);
        if (childAt != null) {
            RecyclerView.b0 b0VarM = RecyclerView.M(childAt);
            if (b0VarM != null) {
                if (b0VarM.j() && !b0VarM.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(b0VarM);
                    throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, sb));
                }
                if (RecyclerView.T0) {
                    Log.d("RecyclerView", "tmpDetach " + b0VarM);
                }
                b0VarM.a(256);
            }
        } else if (RecyclerView.S0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iF);
            throw new IllegalArgumentException(androidx.activity.m.c(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(iF);
    }

    public final View d(int i6) {
        return this.f1588a.f1719a.getChildAt(f(i6));
    }

    public final int e() {
        return this.f1588a.f1719a.getChildCount() - this.f1590c.size();
    }

    public final int f(int i6) {
        if (i6 < 0) {
            return -1;
        }
        int childCount = this.f1588a.f1719a.getChildCount();
        int i7 = i6;
        while (i7 < childCount) {
            a aVar = this.f1589b;
            int iB = i6 - (i7 - aVar.b(i7));
            if (iB == 0) {
                while (aVar.d(i7)) {
                    i7++;
                }
                return i7;
            }
            i7 += iB;
        }
        return -1;
    }

    public final View g(int i6) {
        return this.f1588a.f1719a.getChildAt(i6);
    }

    public final int h() {
        return this.f1588a.f1719a.getChildCount();
    }

    public final void i(View view) {
        this.f1590c.add(view);
        RecyclerView.b0 b0VarM = RecyclerView.M(view);
        if (b0VarM != null) {
            View view2 = b0VarM.f1441a;
            RecyclerView recyclerView = this.f1588a.f1719a;
            int i6 = b0VarM.f1456q;
            if (i6 != -1) {
                b0VarM.f1455p = i6;
            } else {
                WeakHashMap<View, n0> weakHashMap = f0.f14480a;
                b0VarM.f1455p = view2.getImportantForAccessibility();
            }
            if (recyclerView.P()) {
                b0VarM.f1456q = 4;
                recyclerView.M0.add(b0VarM);
            } else {
                WeakHashMap<View, n0> weakHashMap2 = f0.f14480a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        RecyclerView.b0 b0VarM;
        if (!this.f1590c.remove(view) || (b0VarM = RecyclerView.M(view)) == null) {
            return;
        }
        RecyclerView recyclerView = this.f1588a.f1719a;
        int i6 = b0VarM.f1455p;
        if (recyclerView.P()) {
            b0VarM.f1456q = i6;
            recyclerView.M0.add(b0VarM);
        } else {
            View view2 = b0VarM.f1441a;
            WeakHashMap<View, n0> weakHashMap = f0.f14480a;
            view2.setImportantForAccessibility(i6);
        }
        b0VarM.f1455p = 0;
    }

    public final String toString() {
        return this.f1589b.toString() + ", hidden list:" + this.f1590c.size();
    }
}
