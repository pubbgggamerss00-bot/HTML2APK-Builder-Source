package y6;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import eh.p;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.r;
import kotlin.jvm.internal.s;
import mh.t;
import pg.f0;
import pg.q;
import ph.i0;
import ph.l2;
import ph.t0;
import rh.u;
import t6.s;
import y6.b;

@vg.e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1", f = "WorkConstraintsTracker.kt", l = {178}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class e extends vg.i implements p<u<? super y6.b>, tg.e<? super f0>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f33966a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f33967b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t6.e f33968c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f33969d;

    public static final class a extends s implements eh.a<f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f33970a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(eh.a<f0> aVar) {
            super(0);
            this.f33970a = (s) aVar;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [eh.a, kotlin.jvm.internal.s] */
        @Override // eh.a
        public final f0 invoke() {
            this.f33970a.invoke();
            return f0.f21461a;
        }
    }

    public static final class b extends s implements eh.l<y6.b, f0> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l2 f33971a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ u<y6.b> f33972b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l2 l2Var, u uVar) {
            super(1);
            this.f33971a = l2Var;
            this.f33972b = uVar;
        }

        @Override // eh.l
        public final f0 invoke(y6.b bVar) {
            y6.b it = bVar;
            r.e(it, "it");
            this.f33971a.cancel((CancellationException) null);
            this.f33972b.g(it);
            return f0.f21461a;
        }
    }

    @vg.e(c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", f = "WorkConstraintsTracker.kt", l = {149}, m = "invokeSuspend")
    public static final class c extends vg.i implements p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f33973a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f33974b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ u<y6.b> f33975c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(f fVar, u<? super y6.b> uVar, tg.e<? super c> eVar) {
            super(2, eVar);
            this.f33974b = fVar;
            this.f33975c = uVar;
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return new c(this.f33974b, this.f33975c, eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((c) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f33973a;
            if (i10 == 0) {
                q.b(obj);
                this.f33973a = 1;
                if (t0.b(1000L, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                q.b(obj);
            }
            t6.s.d().a(n.f34000a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
            this.f33975c.g(new b.C0345b(7));
            return f0.f21461a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t6.e eVar, f fVar, tg.e<? super e> eVar2) {
        super(2, eVar2);
        this.f33968c = eVar;
        this.f33969d = fVar;
    }

    @Override // vg.a
    public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
        e eVar2 = new e(this.f33968c, this.f33969d, eVar);
        eVar2.f33967b = obj;
        return eVar2;
    }

    @Override // eh.p
    public final Object invoke(u<? super y6.b> uVar, tg.e<? super f0> eVar) {
        return ((e) create(uVar, eVar)).invokeSuspend(f0.f21461a);
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        eh.a cVar;
        ug.a aVar = ug.a.f29706a;
        int i10 = this.f33966a;
        if (i10 == 0) {
            q.b(obj);
            u uVar = (u) this.f33967b;
            NetworkRequest networkRequestA = this.f33968c.a();
            if (networkRequestA == null) {
                uVar.E().f23624d.n(false, null);
                return f0.f21461a;
            }
            b bVar = new b(ph.h.c(uVar, null, null, new c(this.f33969d, uVar, null), 3), uVar);
            if (Build.VERSION.SDK_INT >= 30) {
                k kVar = k.f33984a;
                ConnectivityManager connectivityManager = this.f33969d.f33976a;
                kVar.getClass();
                synchronized (k.f33985b) {
                    try {
                        LinkedHashMap linkedHashMap = k.f33986c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(networkRequestA, bVar);
                        if (zIsEmpty) {
                            t6.s.d().a(n.f34000a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(kVar);
                        }
                        f0 f0Var = f0.f21461a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                cVar = new j(networkRequestA, connectivityManager, kVar);
            } else {
                int i11 = d.f33964b;
                ConnectivityManager connectivityManager2 = this.f33969d.f33976a;
                d dVar = new d(bVar);
                b0 b0Var = new b0();
                try {
                    t6.s.d().a(n.f34000a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, dVar);
                    b0Var.f16318a = true;
                } catch (RuntimeException e10) {
                    if (!t.i(e10.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e10;
                    }
                    t6.s sVarD = t6.s.d();
                    String str = n.f34000a;
                    if (((s.a) sVarD).f28051c <= 3) {
                        Log.d(str, "NetworkRequestConstraintController couldn't register callback", e10);
                    }
                    bVar.invoke(new b.C0345b(7));
                }
                cVar = new y6.c(b0Var, connectivityManager2, dVar);
            }
            a aVar2 = new a(cVar);
            this.f33966a = 1;
            if (rh.s.a(uVar, aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.b(obj);
        }
        return f0.f21461a;
    }
}
