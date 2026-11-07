package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {287, 296, 304}, m = "readDataAndUpdateCache")
/* loaded from: classes.dex */
public final class u extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m f24399a;

    /* renamed from: b, reason: collision with root package name */
    public i1 f24400b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f24401c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f24402d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24403e;

    /* renamed from: f, reason: collision with root package name */
    public int f24404f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(m<Object> mVar, tg.e<? super u> eVar) {
        super(eVar);
        this.f24403e = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24402d = obj;
        this.f24404f |= PKIFailureInfo.systemUnavail;
        return m.e(this.f24403e, false, this);
    }
}
