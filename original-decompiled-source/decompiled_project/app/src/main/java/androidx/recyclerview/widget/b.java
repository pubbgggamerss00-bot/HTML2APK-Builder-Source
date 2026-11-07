package androidx.recyclerview.widget;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.v;
import java.lang.reflect.Field;
import java.util.ArrayList;
import y3.q0;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final w f2512a;

    /* renamed from: e, reason: collision with root package name */
    public View f2516e;

    /* renamed from: d, reason: collision with root package name */
    public int f2515d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final a f2513b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f2514c = new ArrayList();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public long f2517a = 0;

        /* renamed from: b, reason: collision with root package name */
        public a f2518b;

        public final void a(int i10) {
            if (i10 < 64) {
                this.f2517a &= ~(1 << i10);
                return;
            }
            a aVar = this.f2518b;
            if (aVar != null) {
                aVar.a(i10 - 64);
            }
        }

        public final int b(int i10) {
            a aVar = this.f2518b;
            if (aVar == null) {
                return i10 >= 64 ? Long.bitCount(this.f2517a) : Long.bitCount(this.f2517a & ((1 << i10) - 1));
            }
            if (i10 < 64) {
                return Long.bitCount(this.f2517a & ((1 << i10) - 1));
            }
            return Long.bitCount(this.f2517a) + aVar.b(i10 - 64);
        }

        public final void c() {
            if (this.f2518b == null) {
                this.f2518b = new a();
            }
        }

        public final boolean d(int i10) {
            if (i10 < 64) {
                return (this.f2517a & (1 << i10)) != 0;
            }
            c();
            return this.f2518b.d(i10 - 64);
        }

        public final void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f2518b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f2517a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f2517a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (z11 || this.f2518b != null) {
                c();
                this.f2518b.e(0, z11);
            }
        }

        public final boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f2518b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f2517a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f2517a = j12;
            long j13 = j10 - 1;
            this.f2517a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f2518b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f2518b.f(0);
            }
            return z10;
        }

        public final void g() {
            this.f2517a = 0L;
            a aVar = this.f2518b;
            if (aVar != null) {
                aVar.g();
            }
        }

        public final void h(int i10) {
            if (i10 < 64) {
                this.f2517a |= 1 << i10;
            } else {
                c();
                this.f2518b.h(i10 - 64);
            }
        }

        public final String toString() {
            if (this.f2518b == null) {
                return Long.toBinaryString(this.f2517a);
            }
            return this.f2518b.toString() + "xx" + Long.toBinaryString(this.f2517a);
        }
    }

    public b(w wVar) {
        this.f2512a = wVar;
    }

    public final void a(View view, int i10, boolean z10) {
        v vVar = this.f2512a.f2818a;
        int childCount = i10 < 0 ? vVar.getChildCount() : f(i10);
        this.f2513b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        vVar.addView(view, childCount);
        v.a0 a0VarJ = v.J(view);
        v.d dVar = vVar.f2680m;
        if (dVar == null || a0VarJ == null) {
            return;
        }
        dVar.d(a0VarJ);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        v vVar = this.f2512a.f2818a;
        int childCount = i10 < 0 ? vVar.getChildCount() : f(i10);
        this.f2513b.e(childCount, z10);
        if (z10) {
            i(view);
        }
        v.a0 a0VarJ = v.J(view);
        if (a0VarJ != null) {
            if (!a0VarJ.i() && !a0VarJ.n()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(a0VarJ);
                throw new IllegalArgumentException(v5.a.a(vVar, sb));
            }
            if (v.D0) {
                Log.d("RecyclerView", "reAttach " + a0VarJ);
            }
            a0VarJ.f2716i &= -257;
        } else if (v.C0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(childCount);
            throw new IllegalArgumentException(v5.a.a(vVar, sb2));
        }
        vVar.attachViewToParent(view, childCount, layoutParams);
    }

    public final void c(int i10) {
        int iF = f(i10);
        this.f2513b.f(iF);
        v vVar = this.f2512a.f2818a;
        View childAt = vVar.getChildAt(iF);
        if (childAt != null) {
            v.a0 a0VarJ = v.J(childAt);
            if (a0VarJ != null) {
                if (a0VarJ.i() && !a0VarJ.n()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(a0VarJ);
                    throw new IllegalArgumentException(v5.a.a(vVar, sb));
                }
                if (v.D0) {
                    Log.d("RecyclerView", "tmpDetach " + a0VarJ);
                }
                a0VarJ.a(256);
            }
        } else if (v.C0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(iF);
            throw new IllegalArgumentException(v5.a.a(vVar, sb2));
        }
        vVar.detachViewFromParent(iF);
    }

    public final View d(int i10) {
        return this.f2512a.f2818a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f2512a.f2818a.getChildCount() - this.f2514c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int childCount = this.f2512a.f2818a.getChildCount();
        int i11 = i10;
        while (i11 < childCount) {
            a aVar = this.f2513b;
            int iB = i10 - (i11 - aVar.b(i11));
            if (iB == 0) {
                while (aVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += iB;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f2512a.f2818a.getChildAt(i10);
    }

    public final int h() {
        return this.f2512a.f2818a.getChildCount();
    }

    public final void i(View view) {
        this.f2514c.add(view);
        v.a0 a0VarJ = v.J(view);
        if (a0VarJ != null) {
            View view2 = a0VarJ.f2708a;
            v vVar = this.f2512a.f2818a;
            int i10 = a0VarJ.f2723p;
            if (i10 != -1) {
                a0VarJ.f2722o = i10;
            } else {
                Field field = q0.f33885a;
                a0VarJ.f2722o = view2.getImportantForAccessibility();
            }
            if (vVar.M()) {
                a0VarJ.f2723p = 4;
                vVar.f2699w0.add(a0VarJ);
            } else {
                Field field2 = q0.f33885a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    public final void j(View view) {
        v.a0 a0VarJ;
        if (!this.f2514c.remove(view) || (a0VarJ = v.J(view)) == null) {
            return;
        }
        v vVar = this.f2512a.f2818a;
        int i10 = a0VarJ.f2722o;
        if (vVar.M()) {
            a0VarJ.f2723p = i10;
            vVar.f2699w0.add(a0VarJ);
        } else {
            View view2 = a0VarJ.f2708a;
            Field field = q0.f33885a;
            view2.setImportantForAccessibility(i10);
        }
        a0VarJ.f2722o = 0;
    }

    public final String toString() {
        return this.f2513b.toString() + ", hidden list:" + this.f2514c.size();
    }
}
