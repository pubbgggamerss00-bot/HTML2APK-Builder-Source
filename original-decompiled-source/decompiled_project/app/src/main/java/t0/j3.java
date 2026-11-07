package t0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class j3 extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f26132a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(g2.g1 g1Var) {
        super(1);
        this.f26132a = g1Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        aVar.d(this.f26132a, 0, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        return pg.f0.f21461a;
    }
}
