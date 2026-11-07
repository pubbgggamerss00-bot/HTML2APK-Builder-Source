package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class a7 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f25462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(s.b<Float, s.o> bVar) {
        super(1);
        this.f25462a = bVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        q1.l1 l1Var2 = l1Var;
        float fFloatValue = this.f25462a.d().floatValue();
        float fD = p7.d(l1Var2, fFloatValue);
        float fE = p7.e(l1Var2, fFloatValue);
        l1Var2.d(fE == CropImageView.DEFAULT_ASPECT_RATIO ? 1.0f : fD / fE);
        l1Var2.c1(p7.f26684c);
        return pg.f0.f21461a;
    }
}
