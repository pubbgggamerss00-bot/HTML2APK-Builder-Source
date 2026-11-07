package t1;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import c2.n0;
import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.cmc.BodyPartID;
import q1.b1;
import q1.w0;
import q1.x0;
import q1.z1;

/* loaded from: classes.dex */
public final class z implements e {

    /* renamed from: y, reason: collision with root package name */
    public static final a f27720y = new a();

    /* renamed from: b, reason: collision with root package name */
    public final u1.a f27721b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f27722c;

    /* renamed from: d, reason: collision with root package name */
    public final h0 f27723d;

    /* renamed from: e, reason: collision with root package name */
    public final Resources f27724e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f27725f;

    /* renamed from: g, reason: collision with root package name */
    public int f27726g;

    /* renamed from: h, reason: collision with root package name */
    public int f27727h;

    /* renamed from: i, reason: collision with root package name */
    public long f27728i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27729j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27730k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f27731l;

    /* renamed from: m, reason: collision with root package name */
    public final int f27732m;

    /* renamed from: n, reason: collision with root package name */
    public int f27733n;

    /* renamed from: o, reason: collision with root package name */
    public float f27734o;

    /* renamed from: p, reason: collision with root package name */
    public float f27735p;

    /* renamed from: q, reason: collision with root package name */
    public float f27736q;

    /* renamed from: r, reason: collision with root package name */
    public float f27737r;

    /* renamed from: s, reason: collision with root package name */
    public float f27738s;

    /* renamed from: t, reason: collision with root package name */
    public float f27739t;

    /* renamed from: u, reason: collision with root package name */
    public long f27740u;

    /* renamed from: v, reason: collision with root package name */
    public long f27741v;

    /* renamed from: w, reason: collision with root package name */
    public float f27742w;

    /* renamed from: x, reason: collision with root package name */
    public z1 f27743x;

    public static final class a extends Canvas {
        @Override // android.graphics.Canvas
        public final boolean isHardwareAccelerated() {
            return true;
        }
    }

    public z(u1.a aVar) {
        x0 x0Var = new x0();
        s1.a aVar2 = new s1.a();
        this.f27721b = aVar;
        this.f27722c = x0Var;
        h0 h0Var = new h0(aVar, x0Var, aVar2);
        this.f27723d = h0Var;
        this.f27724e = aVar.getResources();
        this.f27725f = new Rect();
        aVar.addView(h0Var);
        h0Var.setClipBounds(null);
        this.f27728i = 0L;
        View.generateViewId();
        this.f27732m = 3;
        this.f27733n = 0;
        this.f27734o = 1.0f;
        this.f27735p = 1.0f;
        this.f27736q = 1.0f;
        long j10 = b1.f21648b;
        this.f27740u = j10;
        this.f27741v = j10;
    }

    @Override // t1.e
    public final void A(long j10) {
        this.f27740u = j10;
        this.f27723d.setOutlineAmbientShadowColor(n0.j(j10));
    }

    @Override // t1.e
    public final long B() {
        return this.f27741v;
    }

    @Override // t1.e
    public final void C(boolean z10) {
        boolean z11 = false;
        this.f27731l = z10 && !this.f27730k;
        this.f27729j = true;
        if (z10 && this.f27730k) {
            z11 = true;
        }
        this.f27723d.setClipToOutline(z11);
    }

    @Override // t1.e
    public final void D(long j10) {
        this.f27741v = j10;
        this.f27723d.setOutlineSpotShadowColor(n0.j(j10));
    }

    @Override // t1.e
    public final float E() {
        return this.f27723d.getCameraDistance() / this.f27724e.getDisplayMetrics().densityDpi;
    }

    @Override // t1.e
    public final float F() {
        return this.f27737r;
    }

    @Override // t1.e
    public final float G() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // t1.e
    public final void H(int i10) {
        this.f27733n = i10;
        h0 h0Var = this.f27723d;
        boolean z10 = true;
        if (i10 == 1 || this.f27732m != 3) {
            h0Var.setLayerType(2, null);
            h0Var.setCanUseCompositingLayer$ui_graphics_release(true);
            return;
        }
        if (i10 == 1) {
            h0Var.setLayerType(2, null);
        } else if (i10 == 2) {
            h0Var.setLayerType(0, null);
            z10 = false;
        } else {
            h0Var.setLayerType(0, null);
        }
        h0Var.setCanUseCompositingLayer$ui_graphics_release(z10);
    }

    @Override // t1.e
    public final Matrix I() {
        return this.f27723d.getMatrix();
    }

    @Override // t1.e
    public final float J() {
        return this.f27739t;
    }

    @Override // t1.e
    public final float K() {
        return this.f27736q;
    }

    @Override // t1.e
    public final int L() {
        return this.f27732m;
    }

    @Override // t1.e
    public final float a() {
        return this.f27735p;
    }

    @Override // t1.e
    public final void b(float f10) {
        this.f27742w = f10;
        this.f27723d.setRotation(f10);
    }

    @Override // t1.e
    public final void c(float f10) {
        this.f27738s = f10;
        this.f27723d.setTranslationY(f10);
    }

    @Override // t1.e
    public final void d(float f10) {
        this.f27736q = f10;
        this.f27723d.setScaleY(f10);
    }

    @Override // t1.e
    public final void e() {
        this.f27723d.setRotationX(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // t1.e
    public final void f(float f10) {
        this.f27734o = f10;
        this.f27723d.setAlpha(f10);
    }

    @Override // t1.e
    public final void g() {
        this.f27723d.setRotationY(CropImageView.DEFAULT_ASPECT_RATIO);
    }

    @Override // t1.e
    public final void h(float f10) {
        this.f27735p = f10;
        this.f27723d.setScaleX(f10);
    }

    @Override // t1.e
    public final float i() {
        return this.f27734o;
    }

    @Override // t1.e
    public final void j(float f10) {
        this.f27737r = f10;
        this.f27723d.setTranslationX(f10);
    }

    @Override // t1.e
    public final void k(float f10) {
        this.f27723d.setCameraDistance(f10 * this.f27724e.getDisplayMetrics().densityDpi);
    }

    @Override // t1.e
    public final void l(z1 z1Var) {
        this.f27743x = z1Var;
        if (Build.VERSION.SDK_INT >= 31) {
            this.f27723d.setRenderEffect(z1Var != null ? z1Var.a() : null);
        }
    }

    @Override // t1.e
    public final void m() {
        this.f27721b.removeViewInLayout(this.f27723d);
    }

    @Override // t1.e
    public final void n(float f10) {
        this.f27739t = f10;
        this.f27723d.setElevation(f10);
    }

    @Override // t1.e
    public final z1 o() {
        return this.f27743x;
    }

    @Override // t1.e
    public final void p(Outline outline, long j10) {
        h0 h0Var = this.f27723d;
        h0Var.f27692e = outline;
        h0Var.invalidateOutline();
        if ((this.f27731l || h0Var.getClipToOutline()) && outline != null) {
            h0Var.setClipToOutline(true);
            if (this.f27731l) {
                this.f27731l = false;
                this.f27729j = true;
            }
        }
        this.f27730k = outline != null;
    }

    @Override // t1.e
    public final int q() {
        return this.f27733n;
    }

    @Override // t1.e
    public final void r(int i10, int i11, long j10) {
        boolean zB = f3.p.b(this.f27728i, j10);
        h0 h0Var = this.f27723d;
        if (zB) {
            int i12 = this.f27726g;
            if (i12 != i10) {
                h0Var.offsetLeftAndRight(i10 - i12);
            }
            int i13 = this.f27727h;
            if (i13 != i11) {
                h0Var.offsetTopAndBottom(i11 - i13);
            }
        } else {
            if (this.f27731l || h0Var.getClipToOutline()) {
                this.f27729j = true;
            }
            h0Var.layout(i10, i11, ((int) (j10 >> 32)) + i10, ((int) (BodyPartID.bodyIdMax & j10)) + i11);
            this.f27728i = j10;
        }
        this.f27726g = i10;
        this.f27727h = i11;
    }

    @Override // t1.e
    public final float s() {
        return CropImageView.DEFAULT_ASPECT_RATIO;
    }

    @Override // t1.e
    public final void u(f3.d dVar, f3.r rVar, d dVar2, b bVar) {
        h0 h0Var = this.f27723d;
        ViewParent parent = h0Var.getParent();
        u1.a aVar = this.f27721b;
        if (parent == null) {
            aVar.addView(h0Var);
        }
        h0Var.f27694g = dVar;
        h0Var.f27695h = rVar;
        h0Var.f27696j = bVar;
        h0Var.f27697k = dVar2;
        if (h0Var.isAttachedToWindow()) {
            h0Var.setVisibility(4);
            h0Var.setVisibility(0);
            try {
                x0 x0Var = this.f27722c;
                a aVar2 = f27720y;
                q1.b0 b0Var = x0Var.f21746a;
                Canvas canvas = b0Var.f21645a;
                b0Var.f21645a = aVar2;
                aVar.a(b0Var, h0Var, h0Var.getDrawingTime());
                x0Var.f21746a.f21645a = canvas;
            } catch (Throwable unused) {
            }
        }
    }

    @Override // t1.e
    public final void v(w0 w0Var) {
        Rect rect;
        boolean z10 = this.f27729j;
        h0 h0Var = this.f27723d;
        if (z10) {
            if ((this.f27731l || h0Var.getClipToOutline()) && !this.f27730k) {
                rect = this.f27725f;
                rect.left = 0;
                rect.top = 0;
                rect.right = h0Var.getWidth();
                rect.bottom = h0Var.getHeight();
            } else {
                rect = null;
            }
            h0Var.setClipBounds(rect);
        }
        if (q1.c0.a(w0Var).isHardwareAccelerated()) {
            this.f27721b.a(w0Var, h0Var, h0Var.getDrawingTime());
        }
    }

    @Override // t1.e
    public final float w() {
        return this.f27742w;
    }

    @Override // t1.e
    public final void x(long j10) {
        long j11 = 9223372034707292159L & j10;
        h0 h0Var = this.f27723d;
        if (j11 == 9205357640488583168L) {
            h0Var.resetPivot();
        } else {
            h0Var.setPivotX(Float.intBitsToFloat((int) (j10 >> 32)));
            h0Var.setPivotY(Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)));
        }
    }

    @Override // t1.e
    public final long y() {
        return this.f27740u;
    }

    @Override // t1.e
    public final float z() {
        return this.f27738s;
    }
}
