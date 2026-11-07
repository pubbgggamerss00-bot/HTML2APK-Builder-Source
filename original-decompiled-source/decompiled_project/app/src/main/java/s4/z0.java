package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.RunOnce", f = "DataStoreImpl.kt", l = {544, 497}, m = "runIfNeeded")
/* loaded from: classes.dex */
public final class z0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public a1 f24437a;

    /* renamed from: b, reason: collision with root package name */
    public yh.a f24438b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24439c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a1 f24440d;

    /* renamed from: e, reason: collision with root package name */
    public int f24441e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(a1 a1Var, vg.c cVar) {
        super(cVar);
        this.f24440d = a1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24439c = obj;
        this.f24441e |= PKIFailureInfo.systemUnavail;
        return this.f24440d.b(this);
    }
}
