package t6;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k3.d;

/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements d.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Executor f28022a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f28023b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h0(Executor executor, eh.a aVar) {
        this.f28022a = executor;
        this.f28023b = (kotlin.jvm.internal.s) aVar;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [eh.a, kotlin.jvm.internal.s] */
    @Override // k3.d.c
    public final Object a(final d.a aVar) {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Runnable runnable = new Runnable() { // from class: t6.i0
            @Override // java.lang.Runnable
            public final void run() {
                atomicBoolean.set(true);
            }
        };
        k3.h<Void> hVar = aVar.f15968c;
        if (hVar != null) {
            hVar.a(runnable, h.f28020a);
        }
        final ?? r22 = this.f28023b;
        this.f28022a.execute(new Runnable(atomicBoolean, aVar, r22) { // from class: t6.j0

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicBoolean f28032a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d.a f28033b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.s f28034c;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f28034c = (kotlin.jvm.internal.s) r22;
            }

            /* JADX WARN: Type inference failed for: r1v0, types: [eh.a, kotlin.jvm.internal.s] */
            @Override // java.lang.Runnable
            public final void run() {
                d.a aVar2 = this.f28033b;
                ?? r12 = this.f28034c;
                if (this.f28032a.get()) {
                    return;
                }
                try {
                    aVar2.a(r12.invoke());
                } catch (Throwable th2) {
                    aVar2.b(th2);
                }
            }
        });
        return pg.f0.f21461a;
    }
}
