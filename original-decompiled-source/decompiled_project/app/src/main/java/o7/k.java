package o7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {31}, m = "proceed")
/* loaded from: classes.dex */
public final class k extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public l f19048a;

    /* renamed from: b, reason: collision with root package name */
    public j f19049b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f19050c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f19051d;

    /* renamed from: e, reason: collision with root package name */
    public int f19052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, vg.c cVar) {
        super(cVar);
        this.f19051d = lVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f19050c = obj;
        this.f19052e |= PKIFailureInfo.systemUnavail;
        return this.f19051d.b(this);
    }
}
