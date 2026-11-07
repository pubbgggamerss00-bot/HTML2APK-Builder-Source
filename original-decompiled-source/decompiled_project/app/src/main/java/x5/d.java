package x5;

import android.database.SQLException;
import androidx.room.a;
import androidx.room.t0;
import eh.p;
import h9.u0;
import h9.v0;
import h9.x0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import nh.b;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import pg.q;
import ph.i0;
import ph.r2;
import ph.u2;
import tg.h;
import uh.c0;
import x5.a;

/* loaded from: classes.dex */
public final class d implements x5.b {

    /* renamed from: a, reason: collision with root package name */
    public final h f32083a;

    /* renamed from: b, reason: collision with root package name */
    public final h f32084b;

    /* renamed from: c, reason: collision with root package name */
    public final ThreadLocal<i> f32085c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f32086d;

    /* renamed from: e, reason: collision with root package name */
    public final long f32087e;

    @vg.e(c = "androidx.room.coroutines.ConnectionPoolImpl", f = "ConnectionPoolImpl.kt", l = {114, 118, 541, 147}, m = "useConnection")
    public static final class a<R> extends vg.c {

        /* renamed from: a, reason: collision with root package name */
        public Object f32088a;

        /* renamed from: b, reason: collision with root package name */
        public Object f32089b;

        /* renamed from: c, reason: collision with root package name */
        public h f32090c;

        /* renamed from: d, reason: collision with root package name */
        public g0 f32091d;

        /* renamed from: e, reason: collision with root package name */
        public tg.h f32092e;

        /* renamed from: f, reason: collision with root package name */
        public g0 f32093f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f32094g;

        /* renamed from: h, reason: collision with root package name */
        public /* synthetic */ Object f32095h;

        /* renamed from: k, reason: collision with root package name */
        public int f32097k;

        public a(tg.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            this.f32095h = obj;
            this.f32097k |= PKIFailureInfo.systemUnavail;
            return d.this.o0(false, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @vg.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$2", f = "ConnectionPoolImpl.kt", l = {115}, m = "invokeSuspend")
    public static final class b<R> extends vg.i implements p<i0, tg.e<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32098a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<t0, tg.e<? super R>, Object> f32099b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i f32100c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar, i iVar, tg.e<? super b> eVar) {
            super(2, eVar);
            this.f32099b = pVar;
            this.f32100c = iVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new b(this.f32099b, this.f32100c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, Object obj) {
            return ((b) create(i0Var, (tg.e) obj)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32098a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                return obj;
            }
            q.b(obj);
            this.f32098a = 1;
            Object objInvoke = this.f32099b.invoke(this.f32100c, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    @vg.e(c = "androidx.room.coroutines.ConnectionPoolImpl$useConnection$4", f = "ConnectionPoolImpl.kt", l = {147}, m = "invokeSuspend")
    public static final class c<R> extends vg.i implements p<i0, tg.e<? super R>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f32101a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p<t0, tg.e<? super R>, Object> f32102b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g0<i> f32103c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar, g0<i> g0Var, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f32102b = pVar;
            this.f32103c = g0Var;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f32102b, this.f32103c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, Object obj) {
            return ((c) create(i0Var, (tg.e) obj)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f32101a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
                return obj;
            }
            q.b(obj);
            i iVar = this.f32103c.f16327a;
            this.f32101a = 1;
            Object objInvoke = this.f32102b.invoke(iVar, this);
            return objInvoke == aVar ? aVar : objInvoke;
        }
    }

    public d(a.C0039a c0039a) {
        this.f32085c = new ThreadLocal<>();
        this.f32086d = new AtomicBoolean(false);
        b.a aVar = nh.b.f18809b;
        this.f32087e = nh.d.f(30, nh.e.f18816d);
        h hVar = new h(1, new x0(c0039a, 2));
        this.f32083a = hVar;
        this.f32084b = hVar;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f32086d.compareAndSet(false, true)) {
            this.f32083a.b();
            this.f32084b.b();
        }
    }

    public final void h(boolean z10) {
        String str = z10 ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append("\n\nWriter pool:\n");
        this.f32084b.c(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.f32083a.c(sb);
        h6.a.c(5, sb.toString());
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3 A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #7 {all -> 0x01eb, blocks: (B:101:0x01cd, B:103:0x01d3, B:105:0x01dc, B:106:0x01e1), top: B:146:0x01cd }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f5 A[Catch: all -> 0x018a, TryCatch #5 {all -> 0x018a, blocks: (B:82:0x0165, B:84:0x016b, B:89:0x0186, B:93:0x0190, B:97:0x019a, B:108:0x01ec, B:109:0x01f3, B:110:0x01f4, B:111:0x01f5, B:112:0x01fa), top: B:143:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b A[Catch: all -> 0x018a, TryCatch #5 {all -> 0x018a, blocks: (B:82:0x0165, B:84:0x016b, B:89:0x0186, B:93:0x0190, B:97:0x019a, B:108:0x01ec, B:109:0x01f3, B:110:0x01f4, B:111:0x01f5, B:112:0x01fa), top: B:143:0x0165 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0196  */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, java.lang.Object, x5.i] */
    /* JADX WARN: Type inference failed for: r10v5 */
    @Override // x5.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <R> Object o0(boolean z10, p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar, tg.e<? super R> eVar) throws Throwable {
        a aVar;
        Throwable th2;
        h hVar;
        g0 g0Var;
        g0 g0Var2;
        h hVar2;
        tg.h context;
        boolean z11;
        g0 g0Var3;
        d dVar;
        p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar2;
        g0 g0Var4;
        Throwable th3;
        boolean z12;
        e eVar2;
        ?? iVar;
        i iVar2;
        p<? super t0, ? super tg.e<? super R>, ? extends Object> pVar3 = pVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i10 = aVar.f32097k;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f32097k = i10 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        }
        Object objE = aVar.f32095h;
        ug.a aVar2 = ug.a.f29706a;
        int i11 = aVar.f32097k;
        try {
            if (i11 == 0) {
                q.b(objE);
                if (this.f32086d.get()) {
                    h6.a.c(21, "Connection pool is closed");
                    throw null;
                }
                ThreadLocal<i> threadLocal = this.f32085c;
                i iVar3 = threadLocal.get();
                a.C0323a c0323a = x5.a.f32077b;
                if (iVar3 == null) {
                    x5.a aVar3 = (x5.a) aVar.getContext().get(c0323a);
                    iVar3 = aVar3 != null ? aVar3.f32078a : null;
                }
                if (iVar3 == null) {
                    h hVar3 = z10 ? this.f32083a : this.f32084b;
                    g0 g0Var5 = new g0();
                    try {
                        tg.h context2 = aVar.getContext();
                        g0Var2 = new g0();
                        try {
                            long j10 = this.f32087e;
                            x5.c cVar = new x5.c(g0Var2, hVar3, null);
                            aVar.f32088a = this;
                            aVar.f32089b = pVar3;
                            aVar.f32090c = hVar3;
                            aVar.f32091d = g0Var5;
                            aVar.f32092e = context2;
                            aVar.f32093f = g0Var2;
                            aVar.f32094g = z10;
                            aVar.f32097k = 3;
                            b.a aVar4 = nh.b.f18809b;
                            long jD = 0;
                            boolean z13 = j10 > 0;
                            if (z13) {
                                jD = nh.b.d(nh.b.g(j10, nh.d.g(999999L, nh.e.f18814b)));
                            } else if (z13) {
                                throw new pg.l();
                            }
                            if (u2.b(jD, cVar, aVar) != aVar2) {
                                pVar2 = pVar3;
                                g0Var4 = g0Var2;
                                hVar2 = hVar3;
                                context = context2;
                                z11 = z10;
                                g0Var3 = g0Var5;
                                dVar = this;
                                th3 = null;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            hVar2 = hVar3;
                            context = context2;
                            z11 = z10;
                            g0Var3 = g0Var5;
                            dVar = this;
                            g0 g0Var6 = g0Var2;
                            pVar2 = pVar3;
                            g0Var4 = g0Var6;
                            th3 = th;
                            z12 = z11;
                            g0Var = g0Var3;
                            eVar2 = (e) g0Var4.f16327a;
                            if (eVar2 != null) {
                            }
                            g0Var.f16327a = iVar;
                            if (th3 instanceof r2) {
                            }
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        hVar = hVar3;
                        g0Var = g0Var5;
                        throw th2;
                    }
                } else {
                    if (!z10 && iVar3.f32131b) {
                        h6.a.c(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (aVar.getContext().get(c0323a) == null) {
                        x5.a aVar5 = new x5.a(iVar3);
                        r.e(threadLocal, "<this>");
                        tg.h hVarC = h.a.C0291a.c(aVar5, new c0(iVar3, threadLocal));
                        b bVar = new b(pVar3, iVar3, null);
                        aVar.f32097k = 1;
                        Object objE2 = ph.h.e(hVarC, bVar, aVar);
                        if (objE2 != aVar2) {
                            return objE2;
                        }
                    } else {
                        aVar.f32097k = 2;
                        Object objInvoke = pVar3.invoke(iVar3, aVar);
                        if (objInvoke != aVar2) {
                            return objInvoke;
                        }
                    }
                }
                return aVar2;
            }
            if (i11 == 1) {
                q.b(objE);
                return objE;
            }
            if (i11 == 2) {
                q.b(objE);
                return objE;
            }
            if (i11 == 3) {
                z11 = aVar.f32094g;
                g0Var4 = aVar.f32093f;
                context = aVar.f32092e;
                g0Var3 = aVar.f32091d;
                hVar2 = aVar.f32090c;
                pVar2 = (p) aVar.f32089b;
                dVar = (d) aVar.f32088a;
                try {
                    q.b(objE);
                    th3 = null;
                } catch (Throwable th6) {
                    th = th6;
                    g0Var2 = g0Var4;
                    pVar3 = pVar2;
                    g0 g0Var62 = g0Var2;
                    pVar2 = pVar3;
                    g0Var4 = g0Var62;
                    th3 = th;
                    z12 = z11;
                    g0Var = g0Var3;
                    eVar2 = (e) g0Var4.f16327a;
                    if (eVar2 != null) {
                    }
                    g0Var.f16327a = iVar;
                    if (th3 instanceof r2) {
                    }
                }
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g0Var = (g0) aVar.f32089b;
                hVar = (h) aVar.f32088a;
                try {
                    q.b(objE);
                    try {
                        iVar2 = (i) g0Var.f16327a;
                        if (iVar2 != null) {
                            if (iVar2.f32133d.compareAndSet(false, true)) {
                                try {
                                    h6.a.a("ROLLBACK TRANSACTION", iVar2.f32130a);
                                } catch (SQLException unused) {
                                }
                            }
                            e eVar3 = iVar2.f32130a;
                            eVar3.f32106c = null;
                            eVar3.f32107d = null;
                            hVar.d(eVar3);
                        }
                    } catch (Throwable unused2) {
                    }
                    return objE;
                } catch (Throwable th7) {
                    th2 = th7;
                    try {
                        throw th2;
                    } finally {
                    }
                }
            }
            eVar2 = (e) g0Var4.f16327a;
            if (eVar2 != null) {
                r.e(context, "context");
                eVar2.f32106c = context;
                eVar2.f32107d = new Throwable();
                iVar = new i(eVar2, dVar.f32083a != dVar.f32084b && z12);
            } else {
                iVar = 0;
            }
            g0Var.f16327a = iVar;
            if (th3 instanceof r2) {
                dVar.h(z12);
                throw null;
            }
            if (th3 != null) {
                throw th3;
            }
            if (iVar == 0) {
                throw new IllegalArgumentException("Required value was null.");
            }
            dVar.getClass();
            x5.a aVar6 = new x5.a(iVar);
            ThreadLocal<i> threadLocal2 = dVar.f32085c;
            r.e(threadLocal2, "<this>");
            tg.h hVarC2 = h.a.C0291a.c(aVar6, new c0(iVar, threadLocal2));
            c cVar2 = new c(pVar2, g0Var, null);
            aVar.f32088a = hVar2;
            aVar.f32089b = g0Var;
            aVar.f32090c = null;
            aVar.f32091d = null;
            aVar.f32092e = null;
            aVar.f32093f = null;
            aVar.f32097k = 4;
            objE = ph.h.e(hVarC2, cVar2, aVar);
            if (objE != aVar2) {
                hVar = hVar2;
                iVar2 = (i) g0Var.f16327a;
                if (iVar2 != null) {
                }
                return objE;
            }
            return aVar2;
        } catch (Throwable th8) {
            th2 = th8;
            hVar = hVar2;
            throw th2;
        }
        z12 = z11;
        g0Var = g0Var3;
    }

    public d(a.C0039a c0039a, String fileName, int i10) {
        r.e(fileName, "fileName");
        this.f32085c = new ThreadLocal<>();
        this.f32086d = new AtomicBoolean(false);
        b.a aVar = nh.b.f18809b;
        this.f32087e = nh.d.f(30, nh.e.f18816d);
        if (i10 > 0) {
            this.f32083a = new h(i10, new u0(fileName, 1, c0039a));
            this.f32084b = new h(1, new v0(fileName, 1, c0039a));
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}
