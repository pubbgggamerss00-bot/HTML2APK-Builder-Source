package y2;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;
import e9.w0;
import i0.g3;
import i0.h3;
import i0.i2;
import i0.u2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import y2.g0;

@pg.d
/* loaded from: classes.dex */
public final class g0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final View f33709a;

    /* renamed from: b, reason: collision with root package name */
    public final p f33710b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f33711c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f33712d;

    /* renamed from: e, reason: collision with root package name */
    public eh.l<? super List<? extends i>, pg.f0> f33713e;

    /* renamed from: f, reason: collision with root package name */
    public eh.l<? super n, pg.f0> f33714f;

    /* renamed from: g, reason: collision with root package name */
    public c0 f33715g;

    /* renamed from: h, reason: collision with root package name */
    public o f33716h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f33717i;

    /* renamed from: j, reason: collision with root package name */
    public final Object f33718j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f33719k;

    /* renamed from: l, reason: collision with root package name */
    public final e f33720l;

    /* renamed from: m, reason: collision with root package name */
    public final z0.b<a> f33721m;

    /* renamed from: n, reason: collision with root package name */
    public f0 f33722n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f33723a;

        /* renamed from: b, reason: collision with root package name */
        public static final a f33724b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f33725c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f33726d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ a[] f33727e;

        static {
            a aVar = new a("StartInput", 0);
            f33723a = aVar;
            a aVar2 = new a("StopInput", 1);
            f33724b = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            f33725c = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            f33726d = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f33727e = aVarArr;
            u2.e(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f33727e.clone();
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.l<List<? extends i>, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f33728a = new b(1);

        @Override // eh.l
        public final /* bridge */ /* synthetic */ pg.f0 invoke(List<? extends i> list) {
            return pg.f0.f21461a;
        }
    }

    public static final class c extends kotlin.jvm.internal.s implements eh.l<n, pg.f0> {

        /* renamed from: a, reason: collision with root package name */
        public static final c f33729a = new c(1);

        @Override // eh.l
        public final /* synthetic */ pg.f0 invoke(n nVar) {
            int i10 = nVar.f33749a;
            return pg.f0.f21461a;
        }
    }

    public g0(View view, AndroidComposeView androidComposeView) {
        p pVar = new p(view);
        l0 l0Var = new l0(Choreographer.getInstance());
        this.f33709a = view;
        this.f33710b = pVar;
        this.f33711c = l0Var;
        this.f33713e = j0.f33736a;
        this.f33714f = k0.f33742a;
        this.f33715g = new c0("", t2.j0.f27837b, 4);
        this.f33716h = o.f33752g;
        this.f33717i = new ArrayList();
        this.f33718j = w0.a(pg.k.f21467b, new h0(this));
        this.f33720l = new e(androidComposeView, pVar);
        this.f33721m = new z0.b<>(new a[16]);
    }

    @Override // y2.x
    public final void a() {
        i(a.f33723a);
    }

    @Override // y2.x
    public final void b() {
        i(a.f33725c);
    }

    @Override // y2.x
    public final void c() {
        this.f33712d = false;
        this.f33713e = b.f33728a;
        this.f33714f = c.f33729a;
        this.f33719k = null;
        i(a.f33724b);
    }

    @Override // y2.x
    public final void d(c0 c0Var, v vVar, t2.h0 h0Var, h3 h3Var, p1.e eVar, p1.e eVar2) {
        e eVar3 = this.f33720l;
        synchronized (eVar3.f33688c) {
            try {
                eVar3.f33695j = c0Var;
                eVar3.f33697l = vVar;
                eVar3.f33696k = h0Var;
                eVar3.f33698m = h3Var;
                eVar3.f33699n = eVar;
                eVar3.f33700o = eVar2;
                if (eVar3.f33690e || eVar3.f33689d) {
                    eVar3.a();
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y2.x
    public final void e(c0 c0Var, o oVar, g3 g3Var, i2.a aVar) {
        this.f33712d = true;
        this.f33715g = c0Var;
        this.f33716h = oVar;
        this.f33713e = g3Var;
        this.f33714f = aVar;
        i(a.f33723a);
    }

    @Override // y2.x
    public final void f() {
        i(a.f33726d);
    }

    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object, pg.j] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, pg.j] */
    @Override // y2.x
    public final void g(c0 c0Var, c0 c0Var2) {
        boolean z10 = (t2.j0.a(this.f33715g.f33683b, c0Var2.f33683b) && kotlin.jvm.internal.r.a(this.f33715g.f33684c, c0Var2.f33684c)) ? false : true;
        this.f33715g = c0Var2;
        int size = this.f33717i.size();
        for (int i10 = 0; i10 < size; i10++) {
            y yVar = (y) ((WeakReference) this.f33717i.get(i10)).get();
            if (yVar != null) {
                yVar.f33777d = c0Var2;
            }
        }
        e eVar = this.f33720l;
        synchronized (eVar.f33688c) {
            eVar.f33695j = null;
            eVar.f33697l = null;
            eVar.f33696k = null;
            eVar.f33698m = y2.c.f33681a;
            eVar.f33699n = null;
            eVar.f33700o = null;
            pg.f0 f0Var = pg.f0.f21461a;
        }
        if (kotlin.jvm.internal.r.a(c0Var, c0Var2)) {
            if (z10) {
                p pVar = this.f33710b;
                int iE = t2.j0.e(c0Var2.f33683b);
                int iD = t2.j0.d(c0Var2.f33683b);
                t2.j0 j0Var = this.f33715g.f33684c;
                int iE2 = j0Var != null ? t2.j0.e(j0Var.f27839a) : -1;
                t2.j0 j0Var2 = this.f33715g.f33684c;
                pVar.a(iE, iD, iE2, j0Var2 != null ? t2.j0.d(j0Var2.f27839a) : -1);
                return;
            }
            return;
        }
        if (c0Var != null && (!kotlin.jvm.internal.r.a(c0Var.f33682a.f27761b, c0Var2.f33682a.f27761b) || (t2.j0.a(c0Var.f33683b, c0Var2.f33683b) && !kotlin.jvm.internal.r.a(c0Var.f33684c, c0Var2.f33684c)))) {
            p pVar2 = this.f33710b;
            ((InputMethodManager) pVar2.f33762b.getValue()).restartInput(pVar2.f33761a);
            return;
        }
        int size2 = this.f33717i.size();
        for (int i11 = 0; i11 < size2; i11++) {
            y yVar2 = (y) ((WeakReference) this.f33717i.get(i11)).get();
            if (yVar2 != null) {
                c0 c0Var3 = this.f33715g;
                p pVar3 = this.f33710b;
                if (yVar2.f33781h) {
                    yVar2.f33777d = c0Var3;
                    if (yVar2.f33779f) {
                        ((InputMethodManager) pVar3.f33762b.getValue()).updateExtractedText(pVar3.f33761a, yVar2.f33778e, q.a(c0Var3));
                    }
                    t2.j0 j0Var3 = c0Var3.f33684c;
                    long j10 = c0Var3.f33683b;
                    int iE3 = j0Var3 != null ? t2.j0.e(j0Var3.f27839a) : -1;
                    t2.j0 j0Var4 = c0Var3.f33684c;
                    pVar3.a(t2.j0.e(j10), t2.j0.d(j10), iE3, j0Var4 != null ? t2.j0.d(j0Var4.f27839a) : -1);
                }
            }
        }
    }

    @Override // y2.x
    @pg.d
    public final void h(p1.e eVar) {
        Rect rect;
        this.f33719k = new Rect(gh.a.b(eVar.f21131a), gh.a.b(eVar.f21132b), gh.a.b(eVar.f21133c), gh.a.b(eVar.f21134d));
        if (!this.f33717i.isEmpty() || (rect = this.f33719k) == null) {
            return;
        }
        this.f33709a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Runnable, y2.f0] */
    public final void i(a aVar) {
        this.f33721m.b(aVar);
        if (this.f33722n == null) {
            ?? r22 = new Runnable() { // from class: y2.f0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, pg.j] */
                /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object, pg.j] */
                /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    g0 g0Var = this.f33706a;
                    p pVar = g0Var.f33710b;
                    g0Var.f33722n = null;
                    z0.b<g0.a> bVar = g0Var.f33721m;
                    View view = g0Var.f33709a;
                    if (!view.isFocused() && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        bVar.g();
                        return;
                    }
                    kotlin.jvm.internal.g0 g0Var2 = new kotlin.jvm.internal.g0();
                    kotlin.jvm.internal.g0 g0Var3 = new kotlin.jvm.internal.g0();
                    g0.a[] aVarArr = bVar.f34700a;
                    int i10 = bVar.f34702c;
                    for (int i11 = 0; i11 < i10; i11++) {
                        g0.a aVar2 = aVarArr[i11];
                        int iOrdinal = aVar2.ordinal();
                        if (iOrdinal == 0) {
                            ?? r92 = Boolean.TRUE;
                            g0Var2.f16327a = r92;
                            g0Var3.f16327a = r92;
                        } else if (iOrdinal == 1) {
                            ?? r93 = Boolean.FALSE;
                            g0Var2.f16327a = r93;
                            g0Var3.f16327a = r93;
                        } else if ((iOrdinal == 2 || iOrdinal == 3) && !kotlin.jvm.internal.r.a(g0Var2.f16327a, Boolean.FALSE)) {
                            g0Var3.f16327a = Boolean.valueOf(aVar2 == g0.a.f33725c);
                        }
                    }
                    bVar.g();
                    if (kotlin.jvm.internal.r.a(g0Var2.f16327a, Boolean.TRUE)) {
                        ((InputMethodManager) pVar.f33762b.getValue()).restartInput(pVar.f33761a);
                    }
                    Boolean bool = (Boolean) g0Var3.f16327a;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            pVar.f33763c.f33816a.b();
                        } else {
                            pVar.f33763c.f33816a.a();
                        }
                    }
                    if (kotlin.jvm.internal.r.a(g0Var2.f16327a, Boolean.FALSE)) {
                        ((InputMethodManager) pVar.f33762b.getValue()).restartInput(pVar.f33761a);
                    }
                }
            };
            this.f33711c.execute(r22);
            this.f33722n = r22;
        }
    }
}
