package t6;

import java.util.concurrent.CancellationException;
import k3.d;

@vg.e(c = "androidx.work.ListenableFutureKt$launchFuture$1$2", f = "ListenableFuture.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class q extends vg.i implements eh.p<ph.i0, tg.e<? super pg.f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f28045a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f28046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vg.i f28047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d.a<Object> f28048d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public q(eh.p<? super ph.i0, ? super tg.e<Object>, ? extends Object> pVar, d.a<Object> aVar, tg.e<? super q> eVar) {
        super(2, eVar);
        this.f28047c = (vg.i) pVar;
        this.f28048d = aVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        q qVar = new q(this.f28047c, this.f28048d, eVar);
        qVar.f28046b = obj;
        return qVar;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<? super pg.f0> eVar) {
        return ((q) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [eh.p, vg.i] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f28045a;
        d.a<Object> aVar2 = this.f28048d;
        try {
            if (i10 == 0) {
                pg.q.b(obj);
                ph.i0 i0Var = (ph.i0) this.f28046b;
                ?? r12 = this.f28047c;
                this.f28045a = 1;
                obj = r12.invoke(i0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            aVar2.a(obj);
        } catch (CancellationException unused) {
            aVar2.f15969d = true;
            d.C0161d<Object> c0161d = aVar2.f15967b;
            if (c0161d != null && c0161d.f15971b.cancel(true)) {
                aVar2.f15966a = null;
                aVar2.f15967b = null;
                aVar2.f15968c = null;
            }
        } catch (Throwable th2) {
            aVar2.b(th2);
        }
        return pg.f0.f21461a;
    }
}
