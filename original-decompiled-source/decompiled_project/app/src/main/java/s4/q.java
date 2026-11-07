package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {237, 243, 246}, m = "handleUpdate")
/* loaded from: classes.dex */
public final class q extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24368a;

    /* renamed from: b, reason: collision with root package name */
    public m f24369b;

    /* renamed from: c, reason: collision with root package name */
    public ph.v f24370c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24372e;

    /* renamed from: f, reason: collision with root package name */
    public int f24373f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(m mVar, vg.c cVar) {
        super(cVar);
        this.f24372e = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24371d = obj;
        this.f24373f |= PKIFailureInfo.systemUnavail;
        return m.c(this.f24372e, null, this);
    }
}
