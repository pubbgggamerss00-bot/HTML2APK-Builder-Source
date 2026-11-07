package j1;

import eh.p;
import java.util.concurrent.atomic.AtomicReference;
import pg.f0;
import pg.q;
import ph.i0;
import ph.s1;
import ph.v1;

@vg.e(c = "androidx.compose.ui.SessionMutex$withSessionCancellingPrevious$2", f = "SessionMutex.kt", l = {61, 63}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class k extends vg.i implements p<i0, tg.e<Object>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f14627a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f14628b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.l<i0, Object> f14629c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicReference<j<Object>> f14630d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p<Object, tg.e<Object>, Object> f14631e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(eh.l<? super i0, Object> lVar, AtomicReference<j<Object>> atomicReference, p<Object, ? super tg.e<Object>, ? extends Object> pVar, tg.e<? super k> eVar) {
        super(2, eVar);
        this.f14629c = lVar;
        this.f14630d = atomicReference;
        this.f14631e = pVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        k kVar = new k(this.f14629c, this.f14630d, this.f14631e, eVar);
        kVar.f14628b = obj;
        return kVar;
    }

    @Override // eh.p
    public final Object invoke(i0 i0Var, tg.e<Object> eVar) {
        return ((k) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        j<Object> jVar;
        j<Object> jVar2;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f14627a;
        AtomicReference<j<Object>> atomicReference = this.f14630d;
        try {
            if (i10 == 0) {
                q.b(obj);
                i0 i0Var = (i0) this.f14628b;
                jVar = new j<>(v1.f(i0Var.getCoroutineContext()), this.f14629c.invoke(i0Var));
                j<Object> andSet = atomicReference.getAndSet(jVar);
                if (andSet != null) {
                    s1 s1Var = andSet.f14625a;
                    this.f14628b = jVar;
                    this.f14627a = 1;
                    if (v1.c(s1Var, this) != aVar) {
                    }
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar2 = (j) this.f14628b;
                    try {
                        q.b(obj);
                        while (!atomicReference.compareAndSet(jVar2, null) && atomicReference.get() == jVar2) {
                        }
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        while (!atomicReference.compareAndSet(jVar2, null)) {
                        }
                        throw th;
                    }
                }
                jVar = (j) this.f14628b;
                q.b(obj);
            }
            p<Object, tg.e<Object>, Object> pVar = this.f14631e;
            Object obj2 = jVar.f14626b;
            this.f14628b = jVar;
            this.f14627a = 2;
            obj = pVar.invoke(obj2, this);
            if (obj != aVar) {
                jVar2 = jVar;
                while (!atomicReference.compareAndSet(jVar2, null)) {
                }
                return obj;
            }
            return aVar;
        } catch (Throwable th3) {
            th = th3;
            jVar2 = jVar;
            while (!atomicReference.compareAndSet(jVar2, null) && atomicReference.get() == jVar2) {
            }
            throw th;
        }
    }
}
