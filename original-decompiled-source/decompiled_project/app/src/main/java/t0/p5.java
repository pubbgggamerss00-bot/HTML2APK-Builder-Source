package t0;

import com.yalantis.ucrop.view.CropImageView;
import s.y1;

/* loaded from: classes.dex */
public final class p5 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f26675a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.s0<Boolean> f26676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x0.n1<q1.l2> f26677c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Float> f26678d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.r3<Float> f26679e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(boolean z10, s.s0 s0Var, x0.n1 n1Var, y1.d dVar, y1.d dVar2) {
        super(1);
        this.f26675a = z10;
        this.f26676b = s0Var;
        this.f26677c = n1Var;
        this.f26678d = dVar;
        this.f26679e = dVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        q1.l1 l1Var2 = l1Var;
        x0.x1 x1Var = this.f26676b.f23917c;
        float fFloatValue = 0.8f;
        x0.r3<Float> r3Var = this.f26678d;
        float fFloatValue2 = 1.0f;
        boolean z10 = this.f26675a;
        l1Var2.h(!z10 ? r3Var.getValue().floatValue() : ((Boolean) x1Var.getValue()).booleanValue() ? 1.0f : 0.8f);
        if (!z10) {
            fFloatValue = r3Var.getValue().floatValue();
        } else if (((Boolean) x1Var.getValue()).booleanValue()) {
            fFloatValue = 1.0f;
        }
        l1Var2.d(fFloatValue);
        if (!z10) {
            fFloatValue2 = this.f26679e.getValue().floatValue();
        } else if (!((Boolean) x1Var.getValue()).booleanValue()) {
            fFloatValue2 = CropImageView.DEFAULT_ASPECT_RATIO;
        }
        l1Var2.f(fFloatValue2);
        l1Var2.c1(this.f26677c.getValue().f21720a);
        return pg.f0.f21461a;
    }
}
