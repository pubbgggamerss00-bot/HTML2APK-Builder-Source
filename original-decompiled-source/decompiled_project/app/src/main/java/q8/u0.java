package q8;

import org.bouncycastle.asn1.eac.CertificateBody;

@vg.e(c = "com.basitce.htmltoapk.ui.components.ContainerTransitionState$launch$1", f = "ContainerTransition.kt", l = {CertificateBody.profileType}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class u0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f22399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x8.w2 f22400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w0 f22401c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(x8.w2 w2Var, w0 w0Var, tg.e eVar) {
        super(2, eVar);
        this.f22400b = w2Var;
        this.f22401c = w0Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new u0(this.f22400b, this.f22401c, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((u0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f22399a;
        if (i10 == 0) {
            pg.q.b(obj);
            this.f22399a = 1;
            if (this.f22400b.invoke(this.f22401c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        return pg.f0.f21461a;
    }
}
