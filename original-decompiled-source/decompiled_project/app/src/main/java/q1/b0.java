package q1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import java.lang.reflect.InvocationTargetException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class b0 implements w0 {

    /* renamed from: a, reason: collision with root package name */
    public Canvas f21645a = c0.f21657a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f21646b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f21647c;

    @Override // q1.w0
    public final void a(float f10, float f11) {
        this.f21645a.scale(f10, f11);
    }

    @Override // q1.w0
    public final void b(float f10) {
        this.f21645a.rotate(f10);
    }

    @Override // q1.w0
    public final void c(n1 n1Var, h0 h0Var) {
        this.f21645a.drawBitmap(f0.a(n1Var), Float.intBitsToFloat((int) 0), Float.intBitsToFloat((int) 0), h0Var.a());
    }

    @Override // q1.w0
    public final void d() {
        this.f21645a.save();
    }

    @Override // q1.w0
    public final void e(float f10, float f11, float f12, float f13, float f14, float f15, h0 h0Var) {
        this.f21645a.drawArc(f10, f11, f12, f13, f14, f15, false, h0Var.a());
    }

    @Override // q1.w0
    public final void f() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y0.a(this.f21645a, false);
    }

    @Override // q1.w0
    public final void g(float[] fArr) {
        if (g2.w.d(fArr)) {
            return;
        }
        Matrix matrix = new Matrix();
        g0.b(matrix, fArr);
        this.f21645a.concat(matrix);
    }

    @Override // q1.w0
    public final void i(u1 u1Var) {
        Canvas canvas = this.f21645a;
        if (!(u1Var instanceof j0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.clipPath(((j0) u1Var).f21712a, Region.Op.INTERSECT);
    }

    @Override // q1.w0
    public final void j(p1.e eVar, h0 h0Var) {
        this.f21645a.saveLayer(eVar.f21131a, eVar.f21132b, eVar.f21133c, eVar.f21134d, h0Var.a(), 31);
    }

    @Override // q1.w0
    public final void k(u1 u1Var, h0 h0Var) {
        Canvas canvas = this.f21645a;
        if (!(u1Var instanceof j0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((j0) u1Var).f21712a, h0Var.a());
    }

    @Override // q1.w0
    public final void l(long j10, long j11, h0 h0Var) {
        this.f21645a.drawLine(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & BodyPartID.bodyIdMax)), h0Var.a());
    }

    @Override // q1.w0
    public final void m(float f10, float f11, float f12, float f13, int i10) {
        this.f21645a.clipRect(f10, f11, f12, f13, i10 == 0 ? Region.Op.DIFFERENCE : Region.Op.INTERSECT);
    }

    @Override // q1.w0
    public final void n(float f10, float f11) {
        this.f21645a.translate(f10, f11);
    }

    @Override // q1.w0
    public final void o() {
        this.f21645a.restore();
    }

    @Override // q1.w0
    public final void p(float f10, float f11, float f12, float f13, float f14, float f15, h0 h0Var) {
        this.f21645a.drawRoundRect(f10, f11, f12, f13, f14, f15, h0Var.a());
    }

    @Override // q1.w0
    public final void q(float f10, long j10, h0 h0Var) {
        this.f21645a.drawCircle(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & BodyPartID.bodyIdMax)), f10, h0Var.a());
    }

    @Override // q1.w0
    public final void r(n1 n1Var, long j10, long j11, long j12, long j13, h0 h0Var) {
        if (this.f21646b == null) {
            this.f21646b = new Rect();
            this.f21647c = new Rect();
        }
        Canvas canvas = this.f21645a;
        Bitmap bitmapA = f0.a(n1Var);
        Rect rect = this.f21646b;
        kotlin.jvm.internal.r.b(rect);
        int i10 = (int) (j10 >> 32);
        rect.left = i10;
        int i11 = (int) (j10 & BodyPartID.bodyIdMax);
        rect.top = i11;
        rect.right = i10 + ((int) (j11 >> 32));
        rect.bottom = i11 + ((int) (j11 & BodyPartID.bodyIdMax));
        pg.f0 f0Var = pg.f0.f21461a;
        Rect rect2 = this.f21647c;
        kotlin.jvm.internal.r.b(rect2);
        int i12 = (int) (j12 >> 32);
        rect2.left = i12;
        int i13 = (int) (j12 & BodyPartID.bodyIdMax);
        rect2.top = i13;
        rect2.right = i12 + ((int) (j13 >> 32));
        rect2.bottom = i13 + ((int) (j13 & BodyPartID.bodyIdMax));
        canvas.drawBitmap(bitmapA, rect, rect2, h0Var.a());
    }

    @Override // q1.w0
    public final void s() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        y0.a(this.f21645a, true);
    }

    @Override // q1.w0
    public final void t(float f10, float f11, float f12, float f13, h0 h0Var) {
        this.f21645a.drawRect(f10, f11, f12, f13, h0Var.a());
    }
}
