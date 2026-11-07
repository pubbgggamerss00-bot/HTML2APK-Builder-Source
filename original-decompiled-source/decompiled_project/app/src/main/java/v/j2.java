package v;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class j2 extends kotlin.jvm.internal.s implements eh.l<Long, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k2 f29954a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.l<Float, pg.f0> f29955b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j2(k2 k2Var, eh.l<? super Float, pg.f0> lVar) {
        super(1);
        this.f29954a = k2Var;
        this.f29955b = lVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(Long l10) {
        l10.longValue();
        k2 k2Var = this.f29954a;
        float f10 = k2Var.f29979e;
        k2Var.f29979e = CropImageView.DEFAULT_ASPECT_RATIO;
        this.f29955b.invoke(Float.valueOf(f10));
        return pg.f0.f21461a;
    }
}
