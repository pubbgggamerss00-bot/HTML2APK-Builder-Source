package y3;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import j2.g4;
import j2.h4;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import y3.q0;

/* loaded from: classes.dex */
public final class i1 {

    /* renamed from: b, reason: collision with root package name */
    public static final i1 f33824b;

    /* renamed from: a, reason: collision with root package name */
    public final q f33825a;

    public static class c extends b {
        public c() {
        }

        @Override // y3.i1.h
        public void d(int i10, r3.f fVar) {
            this.f33832e.setInsets(s.a(i10), fVar.d());
        }

        public c(i1 i1Var) {
            super(i1Var);
        }
    }

    public static class d extends c {
        public d() {
        }

        public d(i1 i1Var) {
            super(i1Var);
        }
    }

    public static class e extends d {
        public e() {
        }

        @Override // y3.i1.c, y3.i1.h
        public void d(int i10, r3.f fVar) {
            this.f33832e.setInsets(t.a(i10), fVar.d());
        }

        public e(i1 i1Var) {
            super(i1Var);
        }
    }

    public static class f extends e {
        public f() {
        }

        @Override // y3.i1.h
        public void c(i1 i1Var) {
        }

        @Override // y3.i1.e, y3.i1.c, y3.i1.h
        public void d(int i10, r3.f fVar) {
            super.d(i10, fVar);
        }

        public f(i1 i1Var) {
            super(i1Var);
            i1Var.f33825a.s();
        }
    }

    public static class g extends f {
        public g() {
        }

        public g(i1 i1Var) {
            super(i1Var);
        }
    }

    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public final i1 f33833a;

        /* renamed from: b, reason: collision with root package name */
        public r3.f[] f33834b;

        /* renamed from: c, reason: collision with root package name */
        public final Rect[][] f33835c;

        /* renamed from: d, reason: collision with root package name */
        public final Rect[][] f33836d;

        public h() {
            this(new i1((i1) null));
        }

        public final void a() {
            r3.f[] fVarArr = this.f33834b;
            if (fVarArr != null) {
                r3.f fVarI = fVarArr[0];
                r3.f fVarI2 = fVarArr[1];
                i1 i1Var = this.f33833a;
                if (fVarI2 == null) {
                    fVarI2 = i1Var.f33825a.i(2);
                }
                if (fVarI == null) {
                    fVarI = i1Var.f33825a.i(1);
                }
                h(r3.f.a(fVarI, fVarI2));
                r3.f fVar = this.f33834b[r.a(16)];
                if (fVar != null) {
                    g(fVar);
                }
                r3.f fVar2 = this.f33834b[r.a(32)];
                if (fVar2 != null) {
                    e(fVar2);
                }
                r3.f fVar3 = this.f33834b[r.a(64)];
                if (fVar3 != null) {
                    i(fVar3);
                }
            }
        }

        public i1 b() {
            throw null;
        }

        public void c(i1 i1Var) {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                List<Rect> listF = i1Var.f33825a.f(i10);
                int iA = r.a(i10);
                this.f33835c[iA] = (Rect[]) listF.toArray(new Rect[listF.size()]);
                if (i10 != 8) {
                    List<Rect> listG = i1Var.f33825a.g(i10);
                    this.f33836d[iA] = (Rect[]) listG.toArray(new Rect[listG.size()]);
                }
            }
        }

        public void d(int i10, r3.f fVar) {
            if (this.f33834b == null) {
                this.f33834b = new r3.f[10];
            }
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f33834b[r.a(i11)] = fVar;
                }
            }
        }

        public void e(r3.f fVar) {
        }

        public void f(r3.f fVar) {
            throw null;
        }

        public void g(r3.f fVar) {
        }

        public void h(r3.f fVar) {
            throw null;
        }

        public void i(r3.f fVar) {
        }

        public h(i1 i1Var) {
            this.f33835c = new Rect[10][];
            this.f33836d = new Rect[10][];
            this.f33833a = i1Var;
            c(i1Var);
        }
    }

    public static class k extends j {
        public k(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // y3.i1.q
        public i1 a() {
            return i1.c(this.f33842c.consumeDisplayCutout(), null);
        }

        @Override // y3.i1.i, y3.i1.q
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Objects.equals(this.f33842c, kVar.f33842c) && Objects.equals(this.f33846g, kVar.f33846g) && i.M(this.f33847h, kVar.f33847h);
        }

        @Override // y3.i1.q
        public y3.h h() {
            DisplayCutout displayCutout = this.f33842c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new y3.h(displayCutout);
        }

        @Override // y3.i1.q
        public int hashCode() {
            return this.f33842c.hashCode();
        }

        public k(i1 i1Var, k kVar) {
            super(i1Var, kVar);
        }
    }

    public static class m extends l {

        /* renamed from: w, reason: collision with root package name */
        public static final i1 f33857w = i1.c(WindowInsets.CONSUMED, null);

        public m(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // y3.i1.i, y3.i1.q
        public final void d(View view) {
        }

        @Override // y3.i1.i, y3.i1.q
        public r3.f i(int i10) {
            return r3.f.c(this.f33842c.getInsets(s.a(i10)));
        }

        @Override // y3.i1.i, y3.i1.q
        public r3.f j(int i10) {
            return r3.f.c(this.f33842c.getInsetsIgnoringVisibility(s.a(i10)));
        }

        @Override // y3.i1.i, y3.i1.q
        public boolean u(int i10) {
            return this.f33842c.isVisible(s.a(i10));
        }

        public m(i1 i1Var, m mVar) {
            super(i1Var, mVar);
        }
    }

    public static class n extends m {
        public n(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        public n(i1 i1Var, n nVar) {
            super(i1Var, nVar);
        }
    }

    public static class o extends n {

        /* renamed from: x, reason: collision with root package name */
        public static final i1 f33858x = i1.c(WindowInsets.CONSUMED, null);

        public o(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // y3.i1.m, y3.i1.i, y3.i1.q
        public r3.f i(int i10) {
            return r3.f.c(this.f33842c.getInsets(t.a(i10)));
        }

        @Override // y3.i1.m, y3.i1.i, y3.i1.q
        public r3.f j(int i10) {
            return r3.f.c(this.f33842c.getInsetsIgnoringVisibility(t.a(i10)));
        }

        @Override // y3.i1.i, y3.i1.q
        public void p(View view) {
        }

        @Override // y3.i1.m, y3.i1.i, y3.i1.q
        public boolean u(int i10) {
            return this.f33842c.isVisible(t.a(i10));
        }

        public o(i1 i1Var, o oVar) {
            super(i1Var, oVar);
        }
    }

    public static class p extends o {
        public p(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
        }

        @Override // y3.i1.i, y3.i1.q
        public List<Rect> f(int i10) {
            return this.f33842c.getBoundingRects(t.a(i10));
        }

        @Override // y3.i1.i, y3.i1.q
        public List<Rect> g(int i10) {
            return this.f33842c.getBoundingRectsIgnoringVisibility(t.a(i10));
        }

        @Override // y3.i1.i, y3.i1.q
        public void q() {
        }

        public p(i1 i1Var, p pVar) {
            super(i1Var, pVar);
        }
    }

    public static class q {

        /* renamed from: b, reason: collision with root package name */
        public static final i1 f33859b;

        /* renamed from: a, reason: collision with root package name */
        public final i1 f33860a;

        static {
            int i10 = Build.VERSION.SDK_INT;
            f33859b = (i10 >= 36 ? new g() : i10 >= 35 ? new f() : i10 >= 34 ? new e() : i10 >= 31 ? new d() : i10 >= 30 ? new c() : i10 >= 29 ? new b() : new a()).b().f33825a.a().f33825a.b().f33825a.c();
        }

        public q(i1 i1Var) {
            this.f33860a = i1Var;
        }

        public void A(int i10) {
        }

        public void B(Rect[][] rectArr) {
        }

        public void C(Rect[][] rectArr) {
        }

        public i1 a() {
            return this.f33860a;
        }

        public i1 b() {
            return this.f33860a;
        }

        public i1 c() {
            return this.f33860a;
        }

        public void d(View view) {
        }

        public void e(i1 i1Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return t() == qVar.t() && s() == qVar.s() && Objects.equals(n(), qVar.n()) && Objects.equals(l(), qVar.l()) && Objects.equals(h(), qVar.h());
        }

        public List<Rect> f(int i10) {
            return Collections.EMPTY_LIST;
        }

        public List<Rect> g(int i10) {
            return Collections.EMPTY_LIST;
        }

        public y3.h h() {
            return null;
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(t()), Boolean.valueOf(s()), n(), l(), h());
        }

        public r3.f i(int i10) {
            return r3.f.f23162e;
        }

        public r3.f j(int i10) {
            if ((i10 & 8) == 0) {
                return r3.f.f23162e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public r3.f k() {
            return n();
        }

        public r3.f l() {
            return r3.f.f23162e;
        }

        public r3.f m() {
            return n();
        }

        public r3.f n() {
            return r3.f.f23162e;
        }

        public r3.f o() {
            return n();
        }

        public void p(View view) {
        }

        public void q() {
        }

        public i1 r(int i10, int i11, int i12, int i13) {
            return f33859b;
        }

        public boolean s() {
            return false;
        }

        public boolean t() {
            return false;
        }

        public boolean u(int i10) {
            return true;
        }

        public void v(y3.i iVar) {
        }

        public void w(r3.f[] fVarArr) {
        }

        public void x(r3.f fVar) {
        }

        public void y(i1 i1Var) {
        }

        public void z(r3.f fVar) {
        }
    }

    public static final class r {
        public static int a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            if (i10 == 512) {
                return 9;
            }
            throw new IllegalArgumentException(j2.y.a(i10, "type needs to be >= FIRST and <= LAST, type="));
        }
    }

    public static final class s {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    public static final class t {
        public static int a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 512; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    } else if (i12 == 512) {
                        iStatusBars = WindowInsets.Type.systemOverlays();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            f33824b = o.f33858x;
        } else if (i10 >= 30) {
            f33824b = m.f33857w;
        } else {
            f33824b = q.f33859b;
        }
    }

    public i1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f33825a = new p(this, windowInsets);
            return;
        }
        if (i10 >= 34) {
            this.f33825a = new o(this, windowInsets);
            return;
        }
        if (i10 >= 31) {
            this.f33825a = new n(this, windowInsets);
            return;
        }
        if (i10 >= 30) {
            this.f33825a = new m(this, windowInsets);
        } else if (i10 >= 29) {
            this.f33825a = new l(this, windowInsets);
        } else {
            this.f33825a = new k(this, windowInsets);
        }
    }

    public static r3.f a(r3.f fVar, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, fVar.f23163a - i10);
        int iMax2 = Math.max(0, fVar.f23164b - i11);
        int iMax3 = Math.max(0, fVar.f23165c - i12);
        int iMax4 = Math.max(0, fVar.f23166d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? fVar : r3.f.b(iMax, iMax2, iMax3, iMax4);
    }

    public static i1 c(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        i1 i1Var = new i1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            Field field = q0.f33885a;
            i1 i1VarA = q0.d.a(view);
            q qVar = i1Var.f33825a;
            qVar.y(i1VarA);
            View rootView = view.getRootView();
            qVar.d(rootView);
            qVar.p(rootView);
            qVar.q();
            qVar.A(view.getWindowSystemUiVisibility());
        }
        return i1Var;
    }

    public final WindowInsets b() {
        q qVar = this.f33825a;
        if (qVar instanceof i) {
            return ((i) qVar).f33842c;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i1) {
            return Objects.equals(this.f33825a, ((i1) obj).f33825a);
        }
        return false;
    }

    public final int hashCode() {
        q qVar = this.f33825a;
        if (qVar == null) {
            return 0;
        }
        return qVar.hashCode();
    }

    public static class a extends h {

        /* renamed from: g, reason: collision with root package name */
        public static Field f33826g = null;

        /* renamed from: h, reason: collision with root package name */
        public static boolean f33827h = false;

        /* renamed from: i, reason: collision with root package name */
        public static Constructor<WindowInsets> f33828i = null;

        /* renamed from: j, reason: collision with root package name */
        public static boolean f33829j = false;

        /* renamed from: e, reason: collision with root package name */
        public WindowInsets f33830e;

        /* renamed from: f, reason: collision with root package name */
        public r3.f f33831f;

        public a() {
            this.f33830e = j();
        }

        private static WindowInsets j() {
            if (!f33827h) {
                try {
                    f33826g = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f33827h = true;
            }
            Field field = f33826g;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f33829j) {
                try {
                    f33828i = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f33829j = true;
            }
            Constructor<WindowInsets> constructor = f33828i;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // y3.i1.h
        public i1 b() {
            a();
            i1 i1VarC = i1.c(this.f33830e, null);
            r3.f[] fVarArr = this.f33834b;
            q qVar = i1VarC.f33825a;
            qVar.w(fVarArr);
            qVar.z(this.f33831f);
            qVar.v(null);
            qVar.B(this.f33835c);
            qVar.C(this.f33836d);
            return i1VarC;
        }

        @Override // y3.i1.h
        public void f(r3.f fVar) {
            this.f33831f = fVar;
        }

        @Override // y3.i1.h
        public void h(r3.f fVar) {
            WindowInsets windowInsets = this.f33830e;
            if (windowInsets != null) {
                this.f33830e = windowInsets.replaceSystemWindowInsets(fVar.f23163a, fVar.f23164b, fVar.f23165c, fVar.f23166d);
            }
        }

        public a(i1 i1Var) {
            super(i1Var);
            this.f33830e = i1Var.b();
        }
    }

    public static class b extends h {

        /* renamed from: e, reason: collision with root package name */
        public final WindowInsets.Builder f33832e;

        public b() {
            this.f33832e = g4.a();
        }

        @Override // y3.i1.h
        public i1 b() {
            a();
            i1 i1VarC = i1.c(this.f33832e.build(), null);
            r3.f[] fVarArr = this.f33834b;
            q qVar = i1VarC.f33825a;
            qVar.w(fVarArr);
            qVar.v(null);
            qVar.B(this.f33835c);
            qVar.C(this.f33836d);
            return i1VarC;
        }

        @Override // y3.i1.h
        public void e(r3.f fVar) {
            this.f33832e.setMandatorySystemGestureInsets(fVar.d());
        }

        @Override // y3.i1.h
        public void f(r3.f fVar) {
            this.f33832e.setStableInsets(fVar.d());
        }

        @Override // y3.i1.h
        public void g(r3.f fVar) {
            this.f33832e.setSystemGestureInsets(fVar.d());
        }

        @Override // y3.i1.h
        public void h(r3.f fVar) {
            this.f33832e.setSystemWindowInsets(fVar.d());
        }

        @Override // y3.i1.h
        public void i(r3.f fVar) {
            this.f33832e.setTappableElementInsets(fVar.d());
        }

        public b(i1 i1Var) {
            WindowInsets.Builder builderA;
            super(i1Var);
            WindowInsets windowInsetsB = i1Var.b();
            if (windowInsetsB != null) {
                builderA = h4.a(windowInsetsB);
            } else {
                builderA = g4.a();
            }
            this.f33832e = builderA;
        }
    }

    public static class j extends i {

        /* renamed from: s, reason: collision with root package name */
        public r3.f f33853s;

        public j(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
            this.f33853s = null;
        }

        @Override // y3.i1.q
        public i1 b() {
            return i1.c(this.f33842c.consumeStableInsets(), null);
        }

        @Override // y3.i1.q
        public i1 c() {
            return i1.c(this.f33842c.consumeSystemWindowInsets(), null);
        }

        @Override // y3.i1.q
        public final r3.f l() {
            if (this.f33853s == null) {
                WindowInsets windowInsets = this.f33842c;
                this.f33853s = r3.f.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f33853s;
        }

        @Override // y3.i1.q
        public boolean s() {
            return this.f33842c.isConsumed();
        }

        @Override // y3.i1.q
        public void z(r3.f fVar) {
            this.f33853s = fVar;
        }

        public j(i1 i1Var, j jVar) {
            super(i1Var, jVar);
            this.f33853s = null;
            this.f33853s = jVar.f33853s;
        }
    }

    public static class l extends k {

        /* renamed from: t, reason: collision with root package name */
        public r3.f f33854t;

        /* renamed from: u, reason: collision with root package name */
        public r3.f f33855u;

        /* renamed from: v, reason: collision with root package name */
        public r3.f f33856v;

        public l(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var, windowInsets);
            this.f33854t = null;
            this.f33855u = null;
            this.f33856v = null;
        }

        @Override // y3.i1.q
        public r3.f k() {
            if (this.f33855u == null) {
                this.f33855u = r3.f.c(this.f33842c.getMandatorySystemGestureInsets());
            }
            return this.f33855u;
        }

        @Override // y3.i1.q
        public r3.f m() {
            if (this.f33854t == null) {
                this.f33854t = r3.f.c(this.f33842c.getSystemGestureInsets());
            }
            return this.f33854t;
        }

        @Override // y3.i1.q
        public r3.f o() {
            if (this.f33856v == null) {
                this.f33856v = r3.f.c(this.f33842c.getTappableElementInsets());
            }
            return this.f33856v;
        }

        @Override // y3.i1.i, y3.i1.q
        public i1 r(int i10, int i11, int i12, int i13) {
            return i1.c(this.f33842c.inset(i10, i11, i12, i13), null);
        }

        @Override // y3.i1.j, y3.i1.q
        public void z(r3.f fVar) {
        }

        public l(i1 i1Var, l lVar) {
            super(i1Var, lVar);
            this.f33854t = null;
            this.f33855u = null;
            this.f33856v = null;
        }
    }

    public static class i extends q {

        /* renamed from: n, reason: collision with root package name */
        public static boolean f33837n = false;

        /* renamed from: o, reason: collision with root package name */
        public static Method f33838o;

        /* renamed from: p, reason: collision with root package name */
        public static Class<?> f33839p;

        /* renamed from: q, reason: collision with root package name */
        public static Field f33840q;

        /* renamed from: r, reason: collision with root package name */
        public static Field f33841r;

        /* renamed from: c, reason: collision with root package name */
        public final WindowInsets f33842c;

        /* renamed from: d, reason: collision with root package name */
        public r3.f[] f33843d;

        /* renamed from: e, reason: collision with root package name */
        public r3.f f33844e;

        /* renamed from: f, reason: collision with root package name */
        public i1 f33845f;

        /* renamed from: g, reason: collision with root package name */
        public r3.f f33846g;

        /* renamed from: h, reason: collision with root package name */
        public int f33847h;

        /* renamed from: i, reason: collision with root package name */
        public y3.i f33848i;

        /* renamed from: j, reason: collision with root package name */
        public int f33849j;

        /* renamed from: k, reason: collision with root package name */
        public int f33850k;

        /* renamed from: l, reason: collision with root package name */
        public Rect[][] f33851l;

        /* renamed from: m, reason: collision with root package name */
        public Rect[][] f33852m;

        public i(i1 i1Var, WindowInsets windowInsets) {
            super(i1Var);
            this.f33844e = null;
            this.f33851l = new Rect[10][];
            this.f33852m = new Rect[10][];
            this.f33842c = windowInsets;
        }

        private y3.i D(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.f33860a.f33825a.t()) {
                return y3.i.a(true, point.x, point.y, 0, 0, 0, 0);
            }
            b0 b0VarA = y3.g.a(display, 0);
            b0 b0VarA2 = y3.g.a(display, 1);
            b0 b0VarA3 = y3.g.a(display, 2);
            b0 b0VarA4 = y3.g.a(display, 3);
            return y3.i.a(false, point.x, point.y, b0VarA != null ? b0VarA.f33790b : 0, b0VarA2 != null ? b0VarA2.f33790b : 0, b0VarA3 != null ? b0VarA3.f33790b : 0, b0VarA4 != null ? b0VarA4.f33790b : 0);
        }

        private static List<Rect> E(Rect[][] rectArr, int i10) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && (rectArr2 = rectArr[r.a(i11)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] F(r3.f fVar) {
            ArrayList arrayList = new ArrayList();
            int i10 = fVar.f23163a;
            int i11 = fVar.f23166d;
            int i12 = fVar.f23165c;
            int i13 = fVar.f23164b;
            if (i10 != 0) {
                arrayList.add(new Rect(0, 0, fVar.f23163a, this.f33849j));
            }
            if (i13 != 0) {
                arrayList.add(new Rect(0, 0, this.f33850k, i13));
            }
            if (i12 != 0) {
                int i14 = this.f33850k;
                arrayList.add(new Rect(i14 - i12, 0, i14, this.f33849j));
            }
            if (i11 != 0) {
                int i15 = this.f33849j;
                arrayList.add(new Rect(0, i15 - i11, this.f33850k, i15));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        private r3.f G(int i10, boolean z10) {
            r3.f fVarA = r3.f.f23162e;
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    fVarA = r3.f.a(fVarA, H(i11, z10));
                }
            }
            return fVarA;
        }

        private r3.f I() {
            i1 i1Var = this.f33845f;
            return i1Var != null ? i1Var.f33825a.l() : r3.f.f23162e;
        }

        private r3.f J(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f33837n) {
                L();
            }
            Method method = f33838o;
            if (method != null && f33839p != null && f33840q != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f33840q.get(f33841r.get(objInvoke));
                    if (rect != null) {
                        return r3.f.b(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e10) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                }
            }
            return null;
        }

        private static void L() throws ClassNotFoundException, SecurityException {
            try {
                f33838o = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f33839p = cls;
                f33840q = cls.getDeclaredField("mVisibleInsets");
                f33841r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f33840q.setAccessible(true);
                f33841r.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f33837n = true;
        }

        public static boolean M(int i10, int i11) {
            return (i10 & 6) == (i11 & 6);
        }

        @Override // y3.i1.q
        public void A(int i10) {
            this.f33847h = i10;
        }

        @Override // y3.i1.q
        public void B(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.f33851l = (Rect[][]) rectArr.clone();
        }

        @Override // y3.i1.q
        public void C(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.f33852m = (Rect[][]) rectArr.clone();
        }

        public r3.f H(int i10, boolean z10) {
            r3.f fVarL;
            int i11;
            r3.f fVar = r3.f.f23162e;
            if (i10 == 1) {
                return z10 ? r3.f.b(0, Math.max(I().f23164b, n().f23164b), 0, 0) : (this.f33847h & 4) != 0 ? fVar : r3.f.b(0, n().f23164b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    r3.f fVarI = I();
                    r3.f fVarL2 = l();
                    return r3.f.b(Math.max(fVarI.f23163a, fVarL2.f23163a), 0, Math.max(fVarI.f23165c, fVarL2.f23165c), Math.max(fVarI.f23166d, fVarL2.f23166d));
                }
                if ((this.f33847h & 2) != 0) {
                    return fVar;
                }
                r3.f fVarN = n();
                i1 i1Var = this.f33845f;
                fVarL = i1Var != null ? i1Var.f33825a.l() : null;
                int iMin = fVarN.f23166d;
                if (fVarL != null) {
                    iMin = Math.min(iMin, fVarL.f23166d);
                }
                return r3.f.b(fVarN.f23163a, 0, fVarN.f23165c, iMin);
            }
            if (i10 == 8) {
                r3.f[] fVarArr = this.f33843d;
                fVarL = fVarArr != null ? fVarArr[r.a(8)] : null;
                if (fVarL != null) {
                    return fVarL;
                }
                r3.f fVarN2 = n();
                r3.f fVarI2 = I();
                int i12 = fVarN2.f23166d;
                if (i12 > fVarI2.f23166d) {
                    return r3.f.b(0, 0, 0, i12);
                }
                r3.f fVar2 = this.f33846g;
                return (fVar2 == null || fVar2.equals(fVar) || (i11 = this.f33846g.f23166d) <= fVarI2.f23166d) ? fVar : r3.f.b(0, 0, 0, i11);
            }
            if (i10 == 16) {
                return m();
            }
            if (i10 == 32) {
                return k();
            }
            if (i10 == 64) {
                return o();
            }
            if (i10 != 128) {
                return fVar;
            }
            i1 i1Var2 = this.f33845f;
            y3.h hVarH = i1Var2 != null ? i1Var2.f33825a.h() : h();
            if (hVarH == null) {
                return fVar;
            }
            DisplayCutout displayCutout = hVarH.f33819a;
            return r3.f.b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
        }

        public boolean K(int i10) {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 4) {
                    return false;
                }
                if (i10 != 8 && i10 != 128) {
                    return true;
                }
            }
            return !H(i10, false).equals(r3.f.f23162e);
        }

        @Override // y3.i1.q
        public void d(View view) throws IllegalAccessException, ClassNotFoundException, SecurityException, IllegalArgumentException, InvocationTargetException {
            this.f33850k = view.getWidth();
            this.f33849j = view.getHeight();
            r3.f fVarJ = J(view);
            if (fVarJ == null) {
                fVarJ = r3.f.f23162e;
            }
            x(fVarJ);
        }

        @Override // y3.i1.q
        public void e(i1 i1Var) {
            i1Var.f33825a.y(this.f33845f);
            r3.f fVar = this.f33846g;
            q qVar = i1Var.f33825a;
            qVar.x(fVar);
            qVar.A(this.f33847h);
            qVar.v(this.f33848i);
            qVar.B(this.f33851l);
            qVar.C(this.f33852m);
        }

        @Override // y3.i1.q
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f33846g, iVar.f33846g) && M(this.f33847h, iVar.f33847h);
        }

        @Override // y3.i1.q
        public List<Rect> f(int i10) {
            return E(this.f33851l, i10);
        }

        @Override // y3.i1.q
        public List<Rect> g(int i10) {
            return E(this.f33852m, i10);
        }

        @Override // y3.i1.q
        public r3.f i(int i10) {
            return G(i10, false);
        }

        @Override // y3.i1.q
        public r3.f j(int i10) {
            return G(i10, true);
        }

        @Override // y3.i1.q
        public final r3.f n() {
            if (this.f33844e == null) {
                WindowInsets windowInsets = this.f33842c;
                this.f33844e = r3.f.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f33844e;
        }

        @Override // y3.i1.q
        public void p(View view) {
            this.f33848i = D(view);
        }

        @Override // y3.i1.q
        public void q() {
            for (int i10 = 1; i10 <= 512; i10 <<= 1) {
                int iA = r.a(i10);
                this.f33851l[iA] = F(i(i10));
                if (i10 != 8) {
                    this.f33852m[iA] = F(j(i10));
                }
            }
        }

        @Override // y3.i1.q
        public i1 r(int i10, int i11, int i12, int i13) {
            i1 i1VarC = i1.c(this.f33842c, null);
            int i14 = Build.VERSION.SDK_INT;
            h gVar = i14 >= 36 ? new g(i1VarC) : i14 >= 35 ? new f(i1VarC) : i14 >= 34 ? new e(i1VarC) : i14 >= 31 ? new d(i1VarC) : i14 >= 30 ? new c(i1VarC) : i14 >= 29 ? new b(i1VarC) : new a(i1VarC);
            gVar.h(i1.a(n(), i10, i11, i12, i13));
            gVar.f(i1.a(l(), i10, i11, i12, i13));
            return gVar.b();
        }

        @Override // y3.i1.q
        public boolean t() {
            return this.f33842c.isRound();
        }

        @Override // y3.i1.q
        public boolean u(int i10) {
            for (int i11 = 1; i11 <= 512; i11 <<= 1) {
                if ((i10 & i11) != 0 && !K(i11)) {
                    return false;
                }
            }
            return true;
        }

        @Override // y3.i1.q
        public void v(y3.i iVar) {
            this.f33848i = iVar;
        }

        @Override // y3.i1.q
        public void w(r3.f[] fVarArr) {
            this.f33843d = fVarArr;
        }

        @Override // y3.i1.q
        public void x(r3.f fVar) {
            this.f33846g = fVar;
        }

        @Override // y3.i1.q
        public void y(i1 i1Var) {
            this.f33845f = i1Var;
        }

        public i(i1 i1Var, i iVar) {
            this(i1Var, new WindowInsets(iVar.f33842c));
        }
    }

    public i1(i1 i1Var) {
        if (i1Var != null) {
            q qVar = i1Var.f33825a;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 35 && (qVar instanceof p)) {
                this.f33825a = new p(this, (p) qVar);
            } else if (i10 >= 34 && (qVar instanceof o)) {
                this.f33825a = new o(this, (o) qVar);
            } else if (i10 >= 31 && (qVar instanceof n)) {
                this.f33825a = new n(this, (n) qVar);
            } else if (i10 >= 30 && (qVar instanceof m)) {
                this.f33825a = new m(this, (m) qVar);
            } else if (i10 >= 29 && (qVar instanceof l)) {
                this.f33825a = new l(this, (l) qVar);
            } else if (qVar instanceof k) {
                this.f33825a = new k(this, (k) qVar);
            } else if (qVar instanceof j) {
                this.f33825a = new j(this, (j) qVar);
            } else if (qVar instanceof i) {
                this.f33825a = new i(this, (i) qVar);
            } else {
                this.f33825a = new q(this);
            }
            qVar.e(this);
            return;
        }
        this.f33825a = new q(this);
    }
}
