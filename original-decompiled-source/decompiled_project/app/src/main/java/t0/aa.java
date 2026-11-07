package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class aa extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f25478a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f25479b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(g2.g1 g1Var, int i10) {
        super(1);
        this.f25478a = g1Var;
        this.f25479b = i10;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        aVar.d(this.f25478a, 0, -this.f25479b, CropImageView.DEFAULT_ASPECT_RATIO);
        return pg.f0.f21461a;
    }
}
