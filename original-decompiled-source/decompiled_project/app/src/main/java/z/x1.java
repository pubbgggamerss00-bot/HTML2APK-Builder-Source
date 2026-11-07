package z;

import android.os.Build;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.basitce.htmltoapk.R;
import java.util.WeakHashMap;
import x0.j;
import y3.h;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: v, reason: collision with root package name */
    public static final WeakHashMap<View, x1> f34666v = new WeakHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    public final z.a f34667a = a.a(4, "captionBar");

    /* renamed from: b, reason: collision with root package name */
    public final z.a f34668b;

    /* renamed from: c, reason: collision with root package name */
    public final z.a f34669c;

    /* renamed from: d, reason: collision with root package name */
    public final z.a f34670d;

    /* renamed from: e, reason: collision with root package name */
    public final z.a f34671e;

    /* renamed from: f, reason: collision with root package name */
    public final z.a f34672f;

    /* renamed from: g, reason: collision with root package name */
    public final z.a f34673g;

    /* renamed from: h, reason: collision with root package name */
    public final z.a f34674h;

    /* renamed from: i, reason: collision with root package name */
    public final z.a f34675i;

    /* renamed from: j, reason: collision with root package name */
    public final t1 f34676j;

    /* renamed from: k, reason: collision with root package name */
    public final r1 f34677k;

    /* renamed from: l, reason: collision with root package name */
    public final t1 f34678l;

    /* renamed from: m, reason: collision with root package name */
    public final t1 f34679m;

    /* renamed from: n, reason: collision with root package name */
    public final t1 f34680n;

    /* renamed from: o, reason: collision with root package name */
    public final t1 f34681o;

    /* renamed from: p, reason: collision with root package name */
    public final t1 f34682p;

    /* renamed from: q, reason: collision with root package name */
    public final t1 f34683q;

    /* renamed from: r, reason: collision with root package name */
    public final t1 f34684r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f34685s;

    /* renamed from: t, reason: collision with root package name */
    public int f34686t;

    /* renamed from: u, reason: collision with root package name */
    public final r0 f34687u;

    public static final class a {
        public static final z.a a(int i10, String str) {
            WeakHashMap<View, x1> weakHashMap = x1.f34666v;
            return new z.a(i10, str);
        }

        public static final t1 b(int i10, String str) {
            WeakHashMap<View, x1> weakHashMap = x1.f34666v;
            return new t1(new u0(0, 0, 0, 0), str);
        }

        public static x1 c(x0.j jVar) {
            x1 x1Var;
            View view = (View) jVar.f(AndroidCompositionLocals_androidKt.f1285f);
            WeakHashMap<View, x1> weakHashMap = x1.f34666v;
            synchronized (weakHashMap) {
                try {
                    x1 x1Var2 = weakHashMap.get(view);
                    if (x1Var2 == null) {
                        x1Var2 = new x1(view);
                        weakHashMap.put(view, x1Var2);
                    }
                    x1Var = x1Var2;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            boolean zL = jVar.l(x1Var) | jVar.l(view);
            Object objG = jVar.g();
            if (zL || objG == j.a.f31715a) {
                objG = new w1(x1Var, view);
                jVar.C(objG);
            }
            x0.o0.a(x1Var, (eh.l) objG, jVar);
            return x1Var;
        }
    }

    public x1(View view) {
        z.a aVarA = a.a(128, "displayCutout");
        this.f34668b = aVarA;
        z.a aVarA2 = a.a(8, "ime");
        this.f34669c = aVarA2;
        z.a aVarA3 = a.a(32, "mandatorySystemGestures");
        this.f34670d = aVarA3;
        this.f34671e = a.a(2, "navigationBars");
        this.f34672f = a.a(1, "statusBars");
        z.a aVarA4 = a.a(519, "systemBars");
        this.f34673g = aVarA4;
        z.a aVarA5 = a.a(16, "systemGestures");
        this.f34674h = aVarA5;
        z.a aVarA6 = a.a(64, "tappableElement");
        this.f34675i = aVarA6;
        t1 t1Var = new t1(new u0(0, 0, 0, 0), "waterfall");
        this.f34676j = t1Var;
        this.f34677k = new r1(new r1(aVarA4, aVarA2), aVarA);
        new r1(new r1(new r1(aVarA6, aVarA3), aVarA5), t1Var);
        this.f34678l = a.b(4, "captionBarIgnoringVisibility");
        this.f34679m = a.b(2, "navigationBarsIgnoringVisibility");
        this.f34680n = a.b(1, "statusBarsIgnoringVisibility");
        this.f34681o = a.b(519, "systemBarsIgnoringVisibility");
        this.f34682p = a.b(64, "tappableElementIgnoringVisibility");
        this.f34683q = a.b(8, "imeAnimationTarget");
        this.f34684r = a.b(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f34685s = bool != null ? bool.booleanValue() : true;
        this.f34687u = new r0(this);
    }

    public static void a(x1 x1Var, y3.i1 i1Var) {
        boolean z10 = false;
        x1Var.f34667a.f(i1Var, 0);
        x1Var.f34669c.f(i1Var, 0);
        x1Var.f34668b.f(i1Var, 0);
        x1Var.f34671e.f(i1Var, 0);
        x1Var.f34672f.f(i1Var, 0);
        x1Var.f34673g.f(i1Var, 0);
        x1Var.f34674h.f(i1Var, 0);
        x1Var.f34675i.f(i1Var, 0);
        x1Var.f34670d.f(i1Var, 0);
        x1Var.f34678l.f(f2.a(i1Var.f33825a.j(4)));
        x1Var.f34679m.f(f2.a(i1Var.f33825a.j(2)));
        x1Var.f34680n.f(f2.a(i1Var.f33825a.j(1)));
        x1Var.f34681o.f(f2.a(i1Var.f33825a.j(519)));
        x1Var.f34682p.f(f2.a(i1Var.f33825a.j(64)));
        y3.h hVarH = i1Var.f33825a.h();
        if (hVarH != null) {
            x1Var.f34676j.f(f2.a(Build.VERSION.SDK_INT >= 30 ? r3.f.c(h.a.a(hVarH.f33819a)) : r3.f.f23162e));
        }
        synchronized (h1.n.f12160c) {
            p.m0<h1.i0> m0Var = h1.n.f12167j.f12096h;
            if (m0Var != null) {
                if (m0Var.c()) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            h1.n.a();
        }
    }
}
