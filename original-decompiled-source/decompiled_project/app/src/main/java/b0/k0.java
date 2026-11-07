package b0;

import com.yalantis.ucrop.view.CropImageView;
import d0.w0;
import x0.v1;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f3372a;

    /* renamed from: b, reason: collision with root package name */
    public final v1 f3373b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3374c;

    /* renamed from: d, reason: collision with root package name */
    public Object f3375d;

    /* renamed from: e, reason: collision with root package name */
    public final w0 f3376e;

    public k0(int i10, int i11) {
        this.f3372a = new v1(i10);
        this.f3373b = new v1(i11);
        this.f3376e = new w0(i10, 30, 100);
    }

    public final void a(int i10, int i11) {
        if (i10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            y.c.a("Index should be non-negative (" + i10 + ')');
        }
        this.f3372a.f(i10);
        this.f3376e.c(i10);
        this.f3373b.f(i11);
    }
}
