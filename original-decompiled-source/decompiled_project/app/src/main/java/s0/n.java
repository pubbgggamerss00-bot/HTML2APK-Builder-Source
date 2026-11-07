package s0;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;
import c2.n0;
import pg.f0;
import q1.b1;
import x.o;

/* loaded from: classes.dex */
public final class n extends View {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f24127f = {R.attr.state_pressed, R.attr.state_enabled};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f24128g = new int[0];

    /* renamed from: a, reason: collision with root package name */
    public v f24129a;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f24130b;

    /* renamed from: c, reason: collision with root package name */
    public Long f24131c;

    /* renamed from: d, reason: collision with root package name */
    public m f24132d;

    /* renamed from: e, reason: collision with root package name */
    public eh.a<f0> f24133e;

    private final void setRippleState(boolean z10) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f24132d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l10 = this.f24131c;
        long jLongValue = jCurrentAnimationTimeMillis - (l10 != null ? l10.longValue() : 0L);
        if (z10 || jLongValue >= 5) {
            int[] iArr = z10 ? f24127f : f24128g;
            v vVar = this.f24129a;
            if (vVar != null) {
                vVar.setState(iArr);
            }
        } else {
            m mVar = new m(this);
            this.f24132d = mVar;
            postDelayed(mVar, 50L);
        }
        this.f24131c = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(n nVar) {
        v vVar = nVar.f24129a;
        if (vVar != null) {
            vVar.setState(f24128g);
        }
        nVar.f24132d = null;
    }

    public final void b(o.b bVar, boolean z10, long j10, int i10, long j11, float f10, eh.a<f0> aVar) {
        if (this.f24129a == null || !Boolean.valueOf(z10).equals(this.f24130b)) {
            v vVar = new v(z10);
            setBackground(vVar);
            this.f24129a = vVar;
            this.f24130b = Boolean.valueOf(z10);
        }
        v vVar2 = this.f24129a;
        kotlin.jvm.internal.r.b(vVar2);
        this.f24133e = aVar;
        e(j10, i10, j11, f10);
        if (z10) {
            vVar2.setHotspot(p1.c.d(bVar.f31599a), p1.c.e(bVar.f31599a));
        } else {
            vVar2.setHotspot(vVar2.getBounds().centerX(), vVar2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f24133e = null;
        m mVar = this.f24132d;
        if (mVar != null) {
            removeCallbacks(mVar);
            m mVar2 = this.f24132d;
            kotlin.jvm.internal.r.b(mVar2);
            mVar2.run();
        } else {
            v vVar = this.f24129a;
            if (vVar != null) {
                vVar.setState(f24128g);
            }
        }
        v vVar2 = this.f24129a;
        if (vVar2 == null) {
            return;
        }
        vVar2.setVisible(false, false);
        unscheduleDrawable(vVar2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (isAttachedToWindow()) {
            super.draw(canvas);
        } else {
            c();
        }
    }

    public final void e(long j10, int i10, long j11, float f10) {
        v vVar = this.f24129a;
        if (vVar == null) {
            return;
        }
        Integer num = vVar.f24170c;
        if (num == null || num.intValue() != i10) {
            vVar.f24170c = Integer.valueOf(i10);
            vVar.setRadius(i10);
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        long jC = b1.c(f10, j11);
        b1 b1Var = vVar.f24169b;
        if (!(b1Var == null ? false : b1.d(b1Var.f21656a, jC))) {
            vVar.f24169b = new b1(jC);
            vVar.setColor(ColorStateList.valueOf(n0.j(jC)));
        }
        Rect rect = new Rect(0, 0, gh.a.b(p1.h.d(j10)), gh.a.b(p1.h.b(j10)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        vVar.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        eh.a<f0> aVar = this.f24133e;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
