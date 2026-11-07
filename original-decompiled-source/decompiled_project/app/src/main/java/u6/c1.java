package u6;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.work.impl.WorkerWrapper", f = "WorkerWrapper.kt", l = {299}, m = "runWorker")
/* loaded from: classes.dex */
public final class c1 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public z0 f29269a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f29270b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f29271c;

    /* renamed from: d, reason: collision with root package name */
    public int f29272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(z0 z0Var, vg.c cVar) {
        super(cVar);
        this.f29271c = z0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f29270b = obj;
        this.f29272d |= PKIFailureInfo.systemUnavail;
        return z0.a(this.f29271c, this);
    }
}
