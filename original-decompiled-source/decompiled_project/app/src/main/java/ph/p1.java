package ph;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

@vg.e(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class p1 extends vg.i implements eh.p<i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f21575a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ eh.a<Object> f21576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(eh.a<Object> aVar, tg.e<? super p1> eVar) {
        super(2, eVar);
        this.f21576b = aVar;
    }

    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        p1 p1Var = new p1(this.f21576b, eVar);
        p1Var.f21575a = obj;
        return p1Var;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<Object> eVar) {
        return ((p1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        return r0.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r1.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        throw r5;
     */
    @Override // vg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        ug.a aVar = ug.a.f29706a;
        pg.q.b(obj);
        tg.h coroutineContext = ((i0) this.f21575a).getCoroutineContext();
        eh.a<Object> aVar2 = this.f21576b;
        try {
            q2 q2Var = new q2();
            q2Var.f21583f = v1.g(v1.f(coroutineContext), q2Var);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = q2.f21581g;
            while (true) {
                int i10 = atomicIntegerFieldUpdater.get(q2Var);
                if (i10 != 0) {
                    if (i10 != 2 && i10 != 3) {
                        q2.m(i10);
                        throw null;
                    }
                } else if (!atomicIntegerFieldUpdater.compareAndSet(q2Var, i10, 0)) {
                }
            }
        } catch (InterruptedException e10) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e10);
        }
    }
}
