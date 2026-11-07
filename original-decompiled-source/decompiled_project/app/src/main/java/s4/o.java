package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "decrementCollector")
/* loaded from: classes.dex */
public final class o extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m f24346a;

    /* renamed from: b, reason: collision with root package name */
    public yh.c f24347b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24348c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24349d;

    /* renamed from: e, reason: collision with root package name */
    public int f24350e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(m mVar, vg.c cVar) {
        super(cVar);
        this.f24349d = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24348c = obj;
        this.f24350e |= PKIFailureInfo.systemUnavail;
        return m.b(this.f24349d, this);
    }
}
