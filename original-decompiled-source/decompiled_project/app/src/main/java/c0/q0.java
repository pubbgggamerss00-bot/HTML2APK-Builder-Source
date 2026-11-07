package c0;

import com.yalantis.ucrop.view.CropImageView;
import org.bouncycastle.asn1.x509.DisplayText;
import x0.v1;

/* loaded from: classes.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final v1 f4470a;

    /* renamed from: b, reason: collision with root package name */
    public final v1 f4471b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4472c;

    /* renamed from: d, reason: collision with root package name */
    public Object f4473d;

    /* renamed from: e, reason: collision with root package name */
    public final d0.w0 f4474e;

    public q0(int i10, int i11) {
        this.f4470a = new v1(i10);
        this.f4471b = new v1(i11);
        this.f4474e = new d0.w0(i10, 90, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE);
    }

    public final void a(int i10, int i11) {
        if (i10 < CropImageView.DEFAULT_ASPECT_RATIO) {
            y.c.a("Index should be non-negative");
        }
        this.f4470a.f(i10);
        this.f4474e.c(i10);
        this.f4471b.f(i11);
    }
}
