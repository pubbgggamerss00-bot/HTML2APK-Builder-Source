package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class j7 extends kotlin.jvm.internal.s implements eh.l<s1.e, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f26139a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Float> f26140b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(long j10, x0.r3<Float> r3Var) {
        super(1);
        this.f26139a = j10;
        this.f26140b = r3Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.e eVar) {
        s1.e.X0(eVar, this.f26139a, 0L, 0L, jh.j.l(this.f26140b.getValue().floatValue(), CropImageView.DEFAULT_ASPECT_RATIO, 1.0f), null, 118);
        return pg.f0.f21461a;
    }
}
