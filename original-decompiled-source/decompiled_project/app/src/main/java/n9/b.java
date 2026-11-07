package n9;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import e9.w0;
import jh.j;
import kotlin.jvm.internal.r;
import p1.h;
import pg.l;
import pg.s;
import q1.c0;
import q1.c1;
import s1.e;
import x0.u2;
import x0.x1;

/* loaded from: classes.dex */
public final class b extends v1.c implements u2 {

    /* renamed from: f, reason: collision with root package name */
    public final Drawable f18640f;

    /* renamed from: g, reason: collision with root package name */
    public final x1 f18641g;

    /* renamed from: h, reason: collision with root package name */
    public final x1 f18642h;

    /* renamed from: j, reason: collision with root package name */
    public final s f18643j;

    public static final class a extends kotlin.jvm.internal.s implements eh.a<n9.a> {
        public a() {
            super(0);
        }

        @Override // eh.a
        public final n9.a invoke() {
            return new n9.a(b.this);
        }
    }

    public b(Drawable drawable) {
        r.e(drawable, "drawable");
        this.f18640f = drawable;
        this.f18641g = bg.b.h(0);
        Object obj = c.f18645a;
        this.f18642h = bg.b.h(new h((drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) ? 9205357640488583168L : d0.h.a(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight())));
        this.f18643j = w0.b(new a());
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    @Override // v1.c
    public final boolean a(float f10) {
        this.f18640f.setAlpha(j.m(gh.a.b(f10 * 255), 0, 255));
        return true;
    }

    @Override // x0.u2
    public final void b() {
        c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.u2
    public final void c() {
        Drawable drawable = this.f18640f;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.u2
    public final void d() {
        Drawable.Callback callback = (Drawable.Callback) this.f18643j.getValue();
        Drawable drawable = this.f18640f;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // v1.c
    public final boolean e(c1 c1Var) {
        this.f18640f.setColorFilter(c1Var != null ? c1Var.f21658a : null);
        return true;
    }

    @Override // v1.c
    public final void f(f3.r layoutDirection) {
        int i10;
        r.e(layoutDirection, "layoutDirection");
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new l();
            }
        } else {
            i10 = 0;
        }
        this.f18640f.setLayoutDirection(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.c
    public final long h() {
        return ((h) this.f18642h.getValue()).f21143a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v1.c
    public final void i(e eVar) {
        r.e(eVar, "<this>");
        q1.w0 w0VarA = eVar.Q0().a();
        ((Number) this.f18641g.getValue()).intValue();
        int iB = gh.a.b(h.d(eVar.i()));
        int iB2 = gh.a.b(h.b(eVar.i()));
        Drawable drawable = this.f18640f;
        drawable.setBounds(0, 0, iB, iB2);
        try {
            w0VarA.d();
            drawable.draw(c0.a(w0VarA));
        } finally {
            w0VarA.o();
        }
    }
}
