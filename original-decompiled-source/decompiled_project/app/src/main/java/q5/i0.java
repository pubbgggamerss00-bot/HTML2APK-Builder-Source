package q5;

import java.util.List;
import s.z0;
import x0.k1;
import x0.n1;

@vg.e(c = "androidx.navigation.compose.NavHostKt$NavHost$28$1", f = "NavHost.kt", l = {620}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class i0 extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f21979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0<p5.s> f21980b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f21981c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k1 f21982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(z0 z0Var, n1 n1Var, k1 k1Var, tg.e eVar) {
        super(2, eVar);
        this.f21980b = z0Var;
        this.f21981c = n1Var;
        this.f21982d = k1Var;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        return new i0(this.f21980b, this.f21981c, this.f21982d, eVar);
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((i0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f21979a;
        if (i10 == 0) {
            pg.q.b(obj);
            p5.s sVar = (p5.s) ((List) this.f21981c.getValue()).get(((List) r4.getValue()).size() - 2);
            float floatValue = this.f21982d.getFloatValue();
            this.f21979a = 1;
            if (this.f21980b.j0(floatValue, sVar, this) == aVar) {
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
