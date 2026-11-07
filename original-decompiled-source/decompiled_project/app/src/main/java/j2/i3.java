package j2;

import android.graphics.Matrix;

/* loaded from: classes.dex */
public final class i3<T> {

    /* renamed from: a, reason: collision with root package name */
    public final eh.p<T, Matrix, pg.f0> f14760a;

    /* renamed from: b, reason: collision with root package name */
    public Matrix f14761b;

    /* renamed from: e, reason: collision with root package name */
    public boolean f14764e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14765f;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f14762c = q1.r1.a();

    /* renamed from: d, reason: collision with root package name */
    public final float[] f14763d = q1.r1.a();

    /* renamed from: g, reason: collision with root package name */
    public boolean f14766g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f14767h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public i3(eh.p<? super T, ? super Matrix, pg.f0> pVar) {
        this.f14760a = pVar;
    }

    public final float[] a(T t3) {
        boolean z10 = this.f14765f;
        float[] fArr = this.f14763d;
        if (z10) {
            this.f14766g = g3.a(b(t3), fArr);
            this.f14765f = false;
        }
        if (this.f14766g) {
            return fArr;
        }
        return null;
    }

    public final float[] b(T t3) {
        boolean z10 = this.f14764e;
        float[] fArr = this.f14762c;
        if (!z10) {
            return fArr;
        }
        Matrix matrix = this.f14761b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f14761b = matrix;
        }
        this.f14760a.invoke(t3, matrix);
        q1.g0.c(matrix, fArr);
        this.f14764e = false;
        this.f14767h = g2.w.d(fArr);
        return fArr;
    }

    public final void c() {
        this.f14764e = true;
        this.f14765f = true;
    }
}
