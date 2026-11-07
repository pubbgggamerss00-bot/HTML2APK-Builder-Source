package v;

@vg.e(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", l = {834}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class r1 extends vg.i implements eh.p<b1, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f30056a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f30057b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s1 f30058c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh.p<s0, tg.e<? super pg.f0>, Object> f30059d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r1(s1 s1Var, eh.p<? super s0, ? super tg.e<? super pg.f0>, ? extends Object> pVar, tg.e<? super r1> eVar) {
        super(2, eVar);
        this.f30058c = s1Var;
        this.f30059d = pVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        r1 r1Var = new r1(this.f30058c, this.f30059d, eVar);
        r1Var.f30057b = obj;
        return r1Var;
    }

    @Override // eh.p
    public final Object invoke(b1 b1Var, tg.e<? super pg.f0> eVar) {
        return ((r1) create(b1Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f30056a;
        if (i10 == 0) {
            pg.q.b(obj);
            b1 b1Var = (b1) this.f30057b;
            s1 s1Var = this.f30058c;
            s1Var.f30076j = b1Var;
            p1 p1Var = s1Var.f30077k;
            this.f30056a = 1;
            if (this.f30059d.invoke(p1Var, this) == aVar) {
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
