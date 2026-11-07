package t0;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class z6 extends kotlin.jvm.internal.s implements eh.l<q1.l1, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hb f27524a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s.b<Float, s.o> f27525b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(hb hbVar, s.b<Float, s.o> bVar) {
        super(1);
        this.f27524a = hbVar;
        this.f27525b = bVar;
    }

    @Override // eh.l
    public final pg.f0 invoke(q1.l1 l1Var) {
        q1.l1 l1Var2 = l1Var;
        float floatValue = this.f27524a.f26015b.f28950j.getFloatValue();
        float fB = p1.h.b(l1Var2.i());
        if (!Float.isNaN(floatValue) && !Float.isNaN(fB) && fB != CropImageView.DEFAULT_ASPECT_RATIO) {
            float fFloatValue = this.f27525b.d().floatValue();
            l1Var2.h(p7.d(l1Var2, fFloatValue));
            l1Var2.d(p7.e(l1Var2, fFloatValue));
            l1Var2.c1(b3.e.a(0.5f, (floatValue + fB) / fB));
        }
        return pg.f0.f21461a;
    }
}
