package t;

import com.yalantis.ucrop.view.CropImageView;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.s implements eh.l<s1.c, pg.f0> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q1.u1 f25352a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1.u0 f25353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(q1.u1 u1Var, q1.u0 u0Var) {
        super(1);
        this.f25352a = u1Var;
        this.f25353b = u0Var;
    }

    @Override // eh.l
    public final pg.f0 invoke(s1.c cVar) {
        s1.c cVar2 = cVar;
        cVar2.z1();
        s1.e.W(cVar2, this.f25352a, this.f25353b, CropImageView.DEFAULT_ASPECT_RATIO, null, 60);
        return pg.f0.f21461a;
    }
}
