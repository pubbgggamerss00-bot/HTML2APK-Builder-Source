package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {544}, m = "incrementCollector")
/* loaded from: classes.dex */
public final class r extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m f24380a;

    /* renamed from: b, reason: collision with root package name */
    public yh.c f24381b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24382c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24383d;

    /* renamed from: e, reason: collision with root package name */
    public int f24384e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(m mVar, vg.c cVar) {
        super(cVar);
        this.f24383d = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24382c = obj;
        this.f24384e |= PKIFailureInfo.systemUnavail;
        return m.d(this.f24383d, this);
    }
}
