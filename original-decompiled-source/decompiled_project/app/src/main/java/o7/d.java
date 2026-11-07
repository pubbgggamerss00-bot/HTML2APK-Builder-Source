package o7;

import eh.p;
import kotlin.jvm.internal.g0;
import o7.a;
import pg.f0;
import pg.q;
import ph.i0;
import w7.m;

@vg.e(c = "coil3.intercept.EngineInterceptor$execute$executeResult$1", f = "EngineInterceptor.kt", l = {131}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class d extends vg.i implements p<i0, tg.e<? super a.C0215a>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f19008a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f19009b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0<l7.j> f19010c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g0<g7.f> f19011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w7.f f19012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f19013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0<m> f19014g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g7.h f19015h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(a aVar, g0<l7.j> g0Var, g0<g7.f> g0Var2, w7.f fVar, Object obj, g0<m> g0Var3, g7.h hVar, tg.e<? super d> eVar) {
        super(2, eVar);
        this.f19009b = aVar;
        this.f19010c = g0Var;
        this.f19011d = g0Var2;
        this.f19012e = fVar;
        this.f19013f = obj;
        this.f19014g = g0Var3;
        this.f19015h = hVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new d(this.f19009b, this.f19010c, this.f19011d, this.f19012e, this.f19013f, this.f19014g, this.f19015h, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super a.C0215a> eVar) {
        return ((d) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f19008a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
            return obj;
        }
        q.b(obj);
        l7.p pVar = (l7.p) this.f19010c.f16327a;
        g7.f fVar = this.f19011d.f16327a;
        m mVar = this.f19014g.f16327a;
        this.f19008a = 1;
        Object objB = a.b(this.f19009b, pVar, fVar, this.f19012e, this.f19013f, mVar, this.f19015h, this);
        return objB == aVar ? aVar : objB;
    }
}
