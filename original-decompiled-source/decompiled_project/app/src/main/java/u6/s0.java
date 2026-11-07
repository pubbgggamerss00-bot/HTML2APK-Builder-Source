package u6;

import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class s0 implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final r f29331a;

    /* renamed from: b, reason: collision with root package name */
    public final e7.b f29332b;

    public s0(r processor, e7.b workTaskExecutor) {
        kotlin.jvm.internal.r.e(processor, "processor");
        kotlin.jvm.internal.r.e(workTaskExecutor, "workTaskExecutor");
        this.f29331a = processor;
        this.f29332b = workTaskExecutor;
    }

    @Override // u6.q0
    public final void a(x workSpecId, int i10) {
        kotlin.jvm.internal.r.e(workSpecId, "workSpecId");
        this.f29332b.d(new d7.t(this.f29331a, workSpecId, false, i10));
    }

    public final void c(final x workSpecId, final WorkerParameters.a aVar) {
        kotlin.jvm.internal.r.e(workSpecId, "workSpecId");
        this.f29332b.d(new Runnable() { // from class: u6.r0
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                this.f29327a.f29331a.f(workSpecId, aVar);
            }
        });
    }
}
