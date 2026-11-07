package u0;

import com.yalantis.ucrop.view.CropImageView;
import g2.g1;

/* loaded from: classes.dex */
public final class h extends kotlin.jvm.internal.s implements eh.l<g1.a, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g2.g1 f29012a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f29013b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g2.g1 g1Var, int i10) {
        super(1);
        this.f29012a = g1Var;
        this.f29013b = i10;
    }

    @Override // eh.l
    public final pg.f0 invoke(g1.a aVar) {
        aVar.d(this.f29012a, -this.f29013b, 0, CropImageView.DEFAULT_ASPECT_RATIO);
        return pg.f0.f21461a;
    }
}
