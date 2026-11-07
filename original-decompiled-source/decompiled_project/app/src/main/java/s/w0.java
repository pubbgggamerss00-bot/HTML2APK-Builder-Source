package s;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import org.jf.dexlib2.dexbacked.raw.CdexHeaderItem;
import ph.s1;
import s.v0;
import tg.h;

@vg.e(c = "androidx.compose.animation.core.MutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {176, CdexHeaderItem.DEBUG_INFO_BASE}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class w0 extends vg.i implements eh.p<ph.i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public yh.a f23965a;

    /* renamed from: b, reason: collision with root package name */
    public Object f23966b;

    /* renamed from: c, reason: collision with root package name */
    public v0 f23967c;

    /* renamed from: d, reason: collision with root package name */
    public int f23968d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f23969e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v0 f23970f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vg.i f23971g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(v0 v0Var, eh.l lVar, tg.e eVar) {
        super(2, eVar);
        t0 t0Var = t0.f23922a;
        this.f23970f = v0Var;
        this.f23971g = (vg.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.l, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        t0 t0Var = t0.f23922a;
        w0 w0Var = new w0(this.f23970f, this.f23971g, eVar);
        w0Var.f23969e = obj;
        return w0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<Object> eVar) {
        return ((w0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, yh.a] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eh.l] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        v0 v0Var;
        yh.a aVar;
        ?? r32;
        v0.a aVar2;
        yh.a aVar3;
        v0 v0Var2;
        Throwable th2;
        v0.a aVar4;
        AtomicReference<v0.a> atomicReference;
        AtomicReference<v0.a> atomicReference2;
        ug.a aVar5 = ug.a.f29706a;
        ?? r12 = this.f23968d;
        try {
            try {
                if (r12 == 0) {
                    pg.q.b(obj);
                    ph.i0 i0Var = (ph.i0) this.f23969e;
                    t0 t0Var = t0.f23922a;
                    h.a aVar6 = i0Var.getCoroutineContext().get(s1.a.f21589a);
                    kotlin.jvm.internal.r.b(aVar6);
                    v0.a aVar7 = new v0.a((ph.s1) aVar6);
                    v0Var = this.f23970f;
                    AtomicReference<v0.a> atomicReference3 = v0Var.f23950a;
                    while (true) {
                        v0.a aVar8 = atomicReference3.get();
                        if (aVar8 != null) {
                            t0 t0Var2 = t0.f23922a;
                            if (t0Var2.compareTo(t0Var2) < 0) {
                                throw new CancellationException("Current mutation had a higher priority");
                            }
                        }
                        while (!atomicReference3.compareAndSet(aVar8, aVar7)) {
                            if (atomicReference3.get() != aVar8) {
                                break;
                            }
                        }
                        if (aVar8 != null) {
                            aVar8.f23952a.cancel((CancellationException) new u0("Mutation interrupted"));
                        }
                        aVar = v0Var.f23951b;
                        this.f23969e = aVar7;
                        this.f23965a = aVar;
                        vg.i iVar = this.f23971g;
                        this.f23966b = iVar;
                        this.f23967c = v0Var;
                        this.f23968d = 1;
                        if (aVar.h(this) != aVar5) {
                            r32 = iVar;
                            aVar2 = aVar7;
                        }
                    }
                    return aVar5;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    v0Var2 = (v0) this.f23966b;
                    aVar3 = this.f23965a;
                    aVar4 = (v0.a) this.f23969e;
                    try {
                        pg.q.b(obj);
                        atomicReference2 = v0Var2.f23950a;
                        while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                        }
                        aVar3.l(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = v0Var2.f23950a;
                        while (!atomicReference.compareAndSet(aVar4, null)) {
                        }
                        throw th2;
                    }
                }
                v0 v0Var3 = this.f23967c;
                eh.l lVar = (eh.l) this.f23966b;
                aVar = this.f23965a;
                aVar2 = (v0.a) this.f23969e;
                pg.q.b(obj);
                v0Var = v0Var3;
                r32 = lVar;
                this.f23969e = aVar2;
                this.f23965a = aVar3;
                this.f23966b = v0Var;
                this.f23967c = null;
                this.f23968d = 2;
                Object objInvoke = r32.invoke(this);
                if (objInvoke != aVar5) {
                    v0Var2 = v0Var;
                    obj = objInvoke;
                    aVar4 = aVar2;
                    atomicReference2 = v0Var2.f23950a;
                    while (!atomicReference2.compareAndSet(aVar4, null)) {
                    }
                    aVar3.l(null);
                    return obj;
                }
                return aVar5;
            } catch (Throwable th4) {
                v0Var2 = v0Var;
                th2 = th4;
                aVar4 = aVar2;
                atomicReference = v0Var2.f23950a;
                while (!atomicReference.compareAndSet(aVar4, null) && atomicReference.get() == aVar4) {
                }
                throw th2;
            }
            aVar3 = aVar;
        } catch (Throwable th5) {
            r12.l(null);
            throw th5;
        }
    }
}
