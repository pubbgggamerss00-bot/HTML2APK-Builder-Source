package x5;

import eh.p;
import kotlin.jvm.internal.g0;
import pg.f0;
import pg.q;
import ph.i0;

@vg.e(c = "androidx.room.coroutines.ConnectionPoolImpl$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class c extends vg.i implements p<i0, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public g0 f32079a;

    /* renamed from: b, reason: collision with root package name */
    public int f32080b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g0<e> f32081c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f32082d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g0<e> g0Var, h hVar, tg.e<? super c> eVar) {
        super(2, eVar);
        this.f32081c = g0Var;
        this.f32082d = hVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        return new c(this.f32081c, this.f32082d, eVar);
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
        return ((c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        g0<e> g0Var;
        T t3;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f32080b;
        if (i10 == 0) {
            q.b(obj);
            g0<e> g0Var2 = this.f32081c;
            this.f32079a = g0Var2;
            this.f32080b = 1;
            Object objA = this.f32082d.a(this);
            if (objA == aVar) {
                return aVar;
            }
            g0Var = g0Var2;
            t3 = objA;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g0Var = this.f32079a;
            q.b(obj);
            t3 = obj;
        }
        g0Var.f16327a = t3;
        return f0.f21461a;
    }
}
