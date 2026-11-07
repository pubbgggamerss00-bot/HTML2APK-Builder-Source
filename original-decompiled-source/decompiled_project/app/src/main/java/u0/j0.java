package u0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ph.s1;
import tg.h;
import u0.i0;

@vg.e(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {180, 103}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class j0 extends vg.i implements eh.p<ph.i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public yh.a f29034a;

    /* renamed from: b, reason: collision with root package name */
    public Object f29035b;

    /* renamed from: c, reason: collision with root package name */
    public i0 f29036c;

    /* renamed from: d, reason: collision with root package name */
    public int f29037d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f29038e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t.b1 f29039f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i0 f29040g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg.i f29041h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j0(t.b1 b1Var, i0 i0Var, eh.l<? super tg.e<Object>, ? extends Object> lVar, tg.e<? super j0> eVar) {
        super(2, eVar);
        this.f29039f = b1Var;
        this.f29040g = i0Var;
        this.f29041h = (vg.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.l, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        j0 j0Var = new j0(this.f29039f, this.f29040g, this.f29041h, eVar);
        j0Var.f29038e = obj;
        return j0Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<Object> eVar) {
        return ((j0) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, yh.a] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eh.l] */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        i0 i0Var;
        yh.a aVar;
        ?? r32;
        i0.a aVar2;
        yh.a aVar3;
        i0 i0Var2;
        Throwable th2;
        i0.a aVar4;
        AtomicReference<i0.a> atomicReference;
        AtomicReference<i0.a> atomicReference2;
        ug.a aVar5 = ug.a.f29706a;
        ?? r12 = this.f29037d;
        try {
            try {
                if (r12 == 0) {
                    pg.q.b(obj);
                    h.a aVar6 = ((ph.i0) this.f29038e).getCoroutineContext().get(s1.a.f21589a);
                    kotlin.jvm.internal.r.b(aVar6);
                    i0.a aVar7 = new i0.a(this.f29039f, (ph.s1) aVar6);
                    i0Var = this.f29040g;
                    AtomicReference<i0.a> atomicReference3 = i0Var.f29025a;
                    while (true) {
                        i0.a aVar8 = atomicReference3.get();
                        if (aVar8 != null && aVar7.f29027a.compareTo(aVar8.f29027a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar8, aVar7)) {
                            if (atomicReference3.get() != aVar8) {
                                break;
                            }
                        }
                        if (aVar8 != null) {
                            aVar8.f29028b.cancel((CancellationException) null);
                        }
                        aVar = i0Var.f29026b;
                        this.f29038e = aVar7;
                        this.f29034a = aVar;
                        vg.i iVar = this.f29041h;
                        this.f29035b = iVar;
                        this.f29036c = i0Var;
                        this.f29037d = 1;
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
                    i0Var2 = (i0) this.f29035b;
                    aVar3 = this.f29034a;
                    aVar4 = (i0.a) this.f29038e;
                    try {
                        pg.q.b(obj);
                        atomicReference2 = i0Var2.f29025a;
                        while (!atomicReference2.compareAndSet(aVar4, null) && atomicReference2.get() == aVar4) {
                        }
                        aVar3.l(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = i0Var2.f29025a;
                        while (!atomicReference.compareAndSet(aVar4, null)) {
                        }
                        throw th2;
                    }
                }
                i0 i0Var3 = this.f29036c;
                eh.l lVar = (eh.l) this.f29035b;
                aVar = this.f29034a;
                aVar2 = (i0.a) this.f29038e;
                pg.q.b(obj);
                i0Var = i0Var3;
                r32 = lVar;
                this.f29038e = aVar2;
                this.f29034a = aVar3;
                this.f29035b = i0Var;
                this.f29036c = null;
                this.f29037d = 2;
                Object objInvoke = r32.invoke(this);
                if (objInvoke != aVar5) {
                    i0Var2 = i0Var;
                    obj = objInvoke;
                    aVar4 = aVar2;
                    atomicReference2 = i0Var2.f29025a;
                    while (!atomicReference2.compareAndSet(aVar4, null)) {
                    }
                    aVar3.l(null);
                    return obj;
                }
                return aVar5;
            } catch (Throwable th4) {
                i0Var2 = i0Var;
                th2 = th4;
                aVar4 = aVar2;
                atomicReference = i0Var2.f29025a;
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
