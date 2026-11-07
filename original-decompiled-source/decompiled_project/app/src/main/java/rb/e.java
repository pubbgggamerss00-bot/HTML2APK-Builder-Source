package rb;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

/* loaded from: classes2.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f23337a;

    public e(int i10) {
        this.f23337a = i10;
    }

    public abstract void a(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract RectF b(float f10, float f11, float f12, float f13);

    public abstract int c();

    public abstract int d();

    public abstract int e();

    public abstract int f();

    public abstract int g();

    public abstract void h(View view, int i10, int i11);

    public abstract void i(RectF rectF, RectF rectF2, RectF rectF3);

    public abstract void j(View view, Rect rect, float f10, float f11);
}
