package t;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ph.s1;
import t.d1;
import tg.h;

@vg.e(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {210, 165}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e1 extends vg.i implements eh.p<ph.i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public yh.a f25201a;

    /* renamed from: b, reason: collision with root package name */
    public Object f25202b;

    /* renamed from: c, reason: collision with root package name */
    public Object f25203c;

    /* renamed from: d, reason: collision with root package name */
    public d1 f25204d;

    /* renamed from: e, reason: collision with root package name */
    public int f25205e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f25206f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ b1 f25207g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d1 f25208h;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vg.i f25209j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f25210k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e1(b1 b1Var, d1 d1Var, eh.p<Object, ? super tg.e<Object>, ? extends Object> pVar, Object obj, tg.e<? super e1> eVar) {
        super(2, eVar);
        this.f25207g = b1Var;
        this.f25208h = d1Var;
        this.f25209j = (vg.i) pVar;
        this.f25210k = obj;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [eh.p, vg.i] */
    @Override // vg.a
    public final tg.e<pg.f0> create(Object obj, tg.e<?> eVar) {
        e1 e1Var = new e1(this.f25207g, this.f25208h, this.f25209j, this.f25210k, eVar);
        e1Var.f25206f = obj;
        return e1Var;
    }

    @Override // eh.p
    public final Object invoke(ph.i0 i0Var, tg.e<Object> eVar) {
        return ((e1) create(i0Var, eVar)).invokeSuspend(pg.f0.f21461a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, yh.a] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eh.p] */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        d1 d1Var;
        Object obj2;
        d1.a aVar;
        yh.a aVar2;
        ?? r52;
        d1 d1Var2;
        Throwable th2;
        d1.a aVar3;
        AtomicReference<d1.a> atomicReference;
        AtomicReference<d1.a> atomicReference2;
        ug.a aVar4 = ug.a.f29706a;
        ?? r12 = this.f25205e;
        try {
            try {
                if (r12 == 0) {
                    pg.q.b(obj);
                    h.a aVar5 = ((ph.i0) this.f25206f).getCoroutineContext().get(s1.a.f21589a);
                    kotlin.jvm.internal.r.b(aVar5);
                    d1.a aVar6 = new d1.a(this.f25207g, (ph.s1) aVar5);
                    d1Var = this.f25208h;
                    AtomicReference<d1.a> atomicReference3 = d1Var.f25189a;
                    while (true) {
                        d1.a aVar7 = atomicReference3.get();
                        if (aVar7 != null && aVar6.f25191a.compareTo(aVar7.f25191a) < 0) {
                            throw new CancellationException("Current mutation had a higher priority");
                        }
                        while (!atomicReference3.compareAndSet(aVar7, aVar6)) {
                            if (atomicReference3.get() != aVar7) {
                                break;
                            }
                        }
                        if (aVar7 != null) {
                            aVar7.f25192b.cancel((CancellationException) new c1("Mutation interrupted"));
                        }
                        yh.c cVar = d1Var.f25190b;
                        this.f25206f = aVar6;
                        this.f25201a = cVar;
                        vg.i iVar = this.f25209j;
                        this.f25202b = iVar;
                        Object obj3 = this.f25210k;
                        this.f25203c = obj3;
                        this.f25204d = d1Var;
                        this.f25205e = 1;
                        if (cVar.h(this) != aVar4) {
                            obj2 = obj3;
                            aVar = aVar6;
                            aVar2 = cVar;
                            r52 = iVar;
                        }
                    }
                    return aVar4;
                }
                if (r12 != 1) {
                    if (r12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d1Var2 = (d1) this.f25202b;
                    aVar2 = this.f25201a;
                    aVar3 = (d1.a) this.f25206f;
                    try {
                        pg.q.b(obj);
                        atomicReference2 = d1Var2.f25189a;
                        while (!atomicReference2.compareAndSet(aVar3, null) && atomicReference2.get() == aVar3) {
                        }
                        aVar2.l(null);
                        return obj;
                    } catch (Throwable th3) {
                        th2 = th3;
                        atomicReference = d1Var2.f25189a;
                        while (!atomicReference.compareAndSet(aVar3, null)) {
                        }
                        throw th2;
                    }
                }
                d1 d1Var3 = this.f25204d;
                obj2 = this.f25203c;
                eh.p pVar = (eh.p) this.f25202b;
                yh.a aVar8 = this.f25201a;
                aVar = (d1.a) this.f25206f;
                pg.q.b(obj);
                d1Var = d1Var3;
                aVar2 = aVar8;
                r52 = pVar;
                this.f25206f = aVar;
                this.f25201a = aVar2;
                this.f25202b = d1Var;
                this.f25203c = null;
                this.f25204d = null;
                this.f25205e = 2;
                Object objInvoke = r52.invoke(obj2, this);
                if (objInvoke != aVar4) {
                    d1Var2 = d1Var;
                    obj = objInvoke;
                    aVar3 = aVar;
                    atomicReference2 = d1Var2.f25189a;
                    while (!atomicReference2.compareAndSet(aVar3, null)) {
                    }
                    aVar2.l(null);
                    return obj;
                }
                return aVar4;
            } catch (Throwable th4) {
                d1Var2 = d1Var;
                th2 = th4;
                aVar3 = aVar;
                atomicReference = d1Var2.f25189a;
                while (!atomicReference.compareAndSet(aVar3, null) && atomicReference.get() == aVar3) {
                }
                throw th2;
            }
        } catch (Throwable th5) {
            r12.l(null);
            throw th5;
        }
    }
}
