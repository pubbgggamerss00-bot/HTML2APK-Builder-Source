package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class ub extends kotlin.jvm.internal.s implements eh.q<hc, x0.j, Integer, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f27162a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ jb f27163b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(jb jbVar, boolean z10) {
        super(3);
        this.f27162a = z10;
        this.f27163b = jbVar;
    }

    @Override // eh.q
    public final pg.f0 b(hc hcVar, x0.j jVar, Integer num) {
        int iIntValue = num.intValue();
        rb.f26896a.b(hcVar, null, this.f27162a, this.f27163b, null, null, CropImageView.DEFAULT_ASPECT_RATIO, CropImageView.DEFAULT_ASPECT_RATIO, jVar, (iIntValue & 14) | 100663296);
        return pg.f0.f21461a;
    }
}
