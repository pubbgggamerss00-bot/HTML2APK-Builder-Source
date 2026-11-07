package sh;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ph.s1;

/* loaded from: classes2.dex */
public final class z0<T> extends th.b<b1> implements j0<T>, f, th.r<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f25132f = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;

    /* renamed from: e, reason: collision with root package name */
    public int f25133e;

    @vg.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    public static final class a extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public z0 f25134a;

        /* renamed from: b, reason: collision with root package name */
        public g f25135b;

        /* renamed from: c, reason: collision with root package name */
        public b1 f25136c;

        /* renamed from: d, reason: collision with root package name */
        public s1 f25137d;

        /* renamed from: e, reason: collision with root package name */
        public Object f25138e;

        /* renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f25139f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ z0<T> f25140g;

        /* renamed from: h, reason: collision with root package name */
        public int f25141h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(z0<T> z0Var, tg.e<? super a> eVar) {
            super(eVar);
            this.f25140g = z0Var;
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f25139f = obj;
            this.f25141h |= PKIFailureInfo.systemUnavail;
            this.f25140g.b(null, this);
            return ug.a.f29706a;
        }
    }

    public z0(Object obj) {
        this._state$volatile = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [uh.v] */
    @Override // sh.j0
    public final boolean a(T t3, T t10) {
        ?? r02 = th.u.f28848a;
        if (t3 == null) {
            t3 = r02;
        }
        if (t10 == null) {
            t10 = r02;
        }
        return j(t3, t10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (((sh.c1) r14).b(r0) == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
    
        if (r10 == false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:44:0x00a7, B:46:0x00ad], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:46:0x00ad, B:44:0x00a7], limit reached: 75 */
    /* JADX WARN: Path cross not found for [B:46:0x00ad, B:54:0x00c8], limit reached: 75 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0099 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0091, B:38:0x0099, B:41:0x00a0, B:42:0x00a4, B:44:0x00a7, B:54:0x00c8, B:57:0x00d8, B:58:0x00f2, B:64:0x0104, B:67:0x010d, B:61:0x00f9, B:63:0x00ff, B:46:0x00ad, B:50:0x00b4, B:21:0x004d, B:24:0x0058, B:35:0x0082), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0091, B:38:0x0099, B:41:0x00a0, B:42:0x00a4, B:44:0x00a7, B:54:0x00c8, B:57:0x00d8, B:58:0x00f2, B:64:0x0104, B:67:0x010d, B:61:0x00f9, B:63:0x00ff, B:46:0x00ad, B:50:0x00b4, B:21:0x004d, B:24:0x0058, B:35:0x0082), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d8 A[Catch: all -> 0x0038, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:36:0x0091, B:38:0x0099, B:41:0x00a0, B:42:0x00a4, B:44:0x00a7, B:54:0x00c8, B:57:0x00d8, B:58:0x00f2, B:64:0x0104, B:67:0x010d, B:61:0x00f9, B:63:0x00ff, B:46:0x00ad, B:50:0x00b4, B:21:0x004d, B:24:0x0058, B:35:0x0082), top: B:72:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00d7 -> B:36:0x0091). Please report as a decompilation issue!!! */
    @Override // sh.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(g<? super T> gVar, tg.e<?> eVar) {
        a aVar;
        z0<T> z0Var;
        b1 b1VarE;
        g gVar2;
        s1 s1Var;
        Object obj;
        Object andSet;
        T t3;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f25141h;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f25141h = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        }
        Object obj2 = aVar.f25139f;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f25141h;
        try {
            if (i11 == 0) {
                pg.q.b(obj2);
                b1VarE = e();
                try {
                    if (gVar instanceof c1) {
                        aVar.f25134a = this;
                        aVar.f25135b = gVar;
                        aVar.f25136c = b1VarE;
                        aVar.f25141h = 1;
                    }
                    z0Var = this;
                } catch (Throwable th2) {
                    th = th2;
                    z0Var = this;
                    z0Var.h(b1VarE);
                    throw th;
                }
            } else if (i11 == 1) {
                b1VarE = aVar.f25136c;
                gVar = aVar.f25135b;
                z0Var = aVar.f25134a;
                pg.q.b(obj2);
            } else if (i11 == 2) {
                Object obj3 = aVar.f25138e;
                s1Var = aVar.f25137d;
                b1VarE = aVar.f25136c;
                gVar2 = aVar.f25135b;
                z0Var = aVar.f25134a;
                pg.q.b(obj2);
                obj = obj3;
                AtomicReference<Object> atomicReference = b1VarE.f24947a;
                uh.v vVar = a1.f24929a;
                andSet = atomicReference.getAndSet(vVar);
                kotlin.jvm.internal.r.b(andSet);
                if (andSet == a1.f24930b) {
                }
                Object obj4 = f25132f.get(z0Var);
                if (s1Var != null) {
                }
                if (obj != null) {
                }
                if (obj4 != th.u.f28848a) {
                }
                aVar.f25134a = z0Var;
                aVar.f25135b = gVar2;
                aVar.f25136c = b1VarE;
                aVar.f25137d = s1Var;
                aVar.f25138e = obj4;
                aVar.f25141h = 2;
                if (gVar2.c(t3, aVar) != aVar2) {
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f25138e;
                s1Var = aVar.f25137d;
                b1VarE = aVar.f25136c;
                gVar2 = aVar.f25135b;
                z0Var = aVar.f25134a;
                pg.q.b(obj2);
                Object obj42 = f25132f.get(z0Var);
                if (s1Var != null && !s1Var.isActive()) {
                    throw s1Var.getCancellationException();
                }
                if (obj != null) {
                    boolean zEquals = obj.equals(obj42);
                    obj = obj;
                }
                t3 = obj42 != th.u.f28848a ? null : obj42;
                aVar.f25134a = z0Var;
                aVar.f25135b = gVar2;
                aVar.f25136c = b1VarE;
                aVar.f25137d = s1Var;
                aVar.f25138e = obj42;
                aVar.f25141h = 2;
                if (gVar2.c(t3, aVar) != aVar2) {
                    return aVar2;
                }
                obj = obj42;
                AtomicReference<Object> atomicReference2 = b1VarE.f24947a;
                uh.v vVar2 = a1.f24929a;
                andSet = atomicReference2.getAndSet(vVar2);
                kotlin.jvm.internal.r.b(andSet);
                if (andSet == a1.f24930b) {
                    aVar.f25134a = z0Var;
                    aVar.f25135b = gVar2;
                    aVar.f25136c = b1VarE;
                    aVar.f25137d = s1Var;
                    aVar.f25138e = obj;
                    aVar.f25141h = 3;
                    ph.m mVar = new ph.m(1, ah.p.c(aVar));
                    mVar.p();
                    AtomicReference<Object> atomicReference3 = b1VarE.f24947a;
                    while (true) {
                        if (atomicReference3.compareAndSet(vVar2, mVar)) {
                            break;
                        }
                        if (atomicReference3.get() != vVar2) {
                            mVar.resumeWith(pg.f0.f21461a);
                            break;
                        }
                    }
                    Object objO = mVar.o();
                    if (objO != ug.a.f29706a) {
                        if (pg.f0.f21461a != aVar2) {
                        }
                        return aVar2;
                    }
                    if (objO != aVar2) {
                    }
                    return aVar2;
                }
                Object obj422 = f25132f.get(z0Var);
                if (s1Var != null) {
                    throw s1Var.getCancellationException();
                }
                if (obj != null) {
                }
                if (obj422 != th.u.f28848a) {
                }
                aVar.f25134a = z0Var;
                aVar.f25135b = gVar2;
                aVar.f25136c = b1VarE;
                aVar.f25137d = s1Var;
                aVar.f25138e = obj422;
                aVar.f25141h = 2;
                if (gVar2.c(t3, aVar) != aVar2) {
                }
            }
            gVar2 = gVar;
            s1Var = (s1) aVar.getContext().get(s1.a.f21589a);
            obj = null;
            Object obj4222 = f25132f.get(z0Var);
            if (s1Var != null) {
            }
            if (obj != null) {
            }
            if (obj4222 != th.u.f28848a) {
            }
            aVar.f25134a = z0Var;
            aVar.f25135b = gVar2;
            aVar.f25136c = b1VarE;
            aVar.f25137d = s1Var;
            aVar.f25138e = obj4222;
            aVar.f25141h = 2;
            if (gVar2.c(t3, aVar) != aVar2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // sh.g
    public final Object c(T t3, tg.e<? super pg.f0> eVar) {
        setValue(t3);
        return pg.f0.f21461a;
    }

    @Override // th.r
    public final f<T> d(tg.h hVar, int i10, rh.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != rh.a.f23577b) ? q0.d(this, hVar, i10, aVar) : this;
    }

    @Override // th.b
    public final th.d f() {
        return new b1();
    }

    @Override // th.b
    public final th.d[] g() {
        return new b1[2];
    }

    @Override // sh.j0, sh.y0
    public final T getValue() {
        T t3 = (T) f25132f.get(this);
        if (t3 == th.u.f28848a) {
            return null;
        }
        return t3;
    }

    public final boolean j(Object obj, Object obj2) {
        int i10;
        Object obj3;
        uh.v vVar;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f25132f;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !kotlin.jvm.internal.r.a(obj4, obj)) {
                return false;
            }
            if (kotlin.jvm.internal.r.a(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i11 = this.f25133e;
            if ((i11 & 1) != 0) {
                this.f25133e = i11 + 2;
                return true;
            }
            int i12 = i11 + 1;
            this.f25133e = i12;
            Object obj5 = this.f28772a;
            pg.f0 f0Var = pg.f0.f21461a;
            while (true) {
                b1[] b1VarArr = (b1[]) obj5;
                if (b1VarArr != null) {
                    for (b1 b1Var : b1VarArr) {
                        if (b1Var != null) {
                            AtomicReference<Object> atomicReference = b1Var.f24947a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (vVar = a1.f24930b)) {
                                    uh.v vVar2 = a1.f24929a;
                                    if (obj6 != vVar2) {
                                        while (!atomicReference.compareAndSet(obj6, vVar2)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        ((ph.m) obj6).resumeWith(pg.f0.f21461a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, vVar)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i10 = this.f25133e;
                    if (i10 == i12) {
                        this.f25133e = i12 + 1;
                        return true;
                    }
                    obj3 = this.f28772a;
                    pg.f0 f0Var2 = pg.f0.f21461a;
                }
                obj5 = obj3;
                i12 = i10;
            }
        }
    }

    @Override // sh.j0
    public final void setValue(T t3) {
        if (t3 == null) {
            t3 = (T) th.u.f28848a;
        }
        j(null, t3);
    }
}
