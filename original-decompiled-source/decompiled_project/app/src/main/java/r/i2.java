package r;

import r.h2;

@vg.e(c = "androidx.compose.animation.SizeAnimationModifierNode$animateTo$data$1$1", f = "AnimationModifier.kt", l = {230}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i2 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f22854a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2.a f22855b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f22856c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h2 f22857d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(h2.a aVar, long j10, h2 h2Var, tg.e<? super i2> eVar) {
        super(2, eVar);
        this.f22855b = aVar;
        this.f22856c = j10;
        this.f22857d = h2Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i2(this.f22855b, this.f22856c, this.f22857d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i2) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f22854a;
        if (i10 == 0) {
            pg.q.b(obj);
            s.b<f3.p, s.p> bVar = this.f22855b.f22840a;
            f3.p pVar = new f3.p(this.f22856c);
            s.l<f3.p> lVar = this.f22857d.f22834q;
            this.f22854a = 1;
            obj = s.b.c(bVar, pVar, lVar, null, this, 12);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
        }
        s.i iVar = ((s.j) obj).f23784b;
        s.i iVar2 = s.i.f23769a;
        return pg.f0.f21461a;
    }
}
