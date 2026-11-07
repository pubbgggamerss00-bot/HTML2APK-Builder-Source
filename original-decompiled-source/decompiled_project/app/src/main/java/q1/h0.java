package q1;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import q1.i0;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f21694a;

    /* renamed from: b, reason: collision with root package name */
    public int f21695b = 3;

    /* renamed from: c, reason: collision with root package name */
    public Shader f21696c;

    /* renamed from: d, reason: collision with root package name */
    public c1 f21697d;

    public h0(Paint paint) {
        this.f21694a = paint;
    }

    public final Paint a() {
        return this.f21694a;
    }

    public final float b() {
        return this.f21694a.getAlpha() / 255.0f;
    }

    public final long c() {
        return c2.n0.b(this.f21694a.getColor());
    }

    public final Shader d() {
        return this.f21696c;
    }

    public final int e() {
        Paint.Cap strokeCap = this.f21694a.getStrokeCap();
        int i10 = strokeCap == null ? -1 : i0.a.f21709a[strokeCap.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 2;
        }
        return 1;
    }

    public final int f() {
        Paint.Join strokeJoin = this.f21694a.getStrokeJoin();
        int i10 = strokeJoin == null ? -1 : i0.a.f21710b[strokeJoin.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 != 2) {
            return i10 != 3 ? 0 : 1;
        }
        return 2;
    }

    public final void g(float f10) {
        this.f21694a.setAlpha((int) Math.rint(f10 * 255.0f));
    }

    public final void h(int i10) {
        if (this.f21695b == i10) {
            return;
        }
        this.f21695b = i10;
        int i11 = Build.VERSION.SDK_INT;
        Paint paint = this.f21694a;
        if (i11 >= 29) {
            paint.setBlendMode(a0.a(i10));
        } else {
            paint.setXfermode(new PorterDuffXfermode(a0.b(i10)));
        }
    }

    public final void i(long j10) {
        this.f21694a.setColor(c2.n0.j(j10));
    }

    public final void j(c1 c1Var) {
        this.f21697d = c1Var;
        this.f21694a.setColorFilter(c1Var != null ? c1Var.f21658a : null);
    }

    public final void k(int i10) {
        this.f21694a.setFilterBitmap(!(i10 == 0));
    }

    public final void l(Shader shader) {
        this.f21696c = shader;
        this.f21694a.setShader(shader);
    }

    public final void m(int i10) {
        this.f21694a.setStrokeCap(i10 == 2 ? Paint.Cap.SQUARE : i10 == 1 ? Paint.Cap.ROUND : i10 == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public final void n(int i10) {
        this.f21694a.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 2 ? Paint.Join.BEVEL : i10 == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public final void o(float f10) {
        this.f21694a.setStrokeMiter(f10);
    }

    public final void p(float f10) {
        this.f21694a.setStrokeWidth(f10);
    }

    public final void q(int i10) {
        this.f21694a.setStyle(i10 == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }
}
