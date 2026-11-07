package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {50}, m = "tryLock")
/* loaded from: classes.dex */
public final class g1<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public yh.c f24241a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f24242b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24243c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f24244d;

    /* renamed from: e, reason: collision with root package name */
    public int f24245e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(h1 h1Var, vg.c cVar) {
        super(cVar);
        this.f24244d = h1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24243c = obj;
        this.f24245e |= PKIFailureInfo.systemUnavail;
        return this.f24244d.a(null, this);
    }
}
