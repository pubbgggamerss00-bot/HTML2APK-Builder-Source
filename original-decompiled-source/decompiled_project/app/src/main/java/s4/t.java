package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {264, 266}, m = "readAndInitOrPropagateAndThrowFailure")
/* loaded from: classes.dex */
public final class t extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m f24393a;

    /* renamed from: b, reason: collision with root package name */
    public int f24394b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24395c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24396d;

    /* renamed from: e, reason: collision with root package name */
    public int f24397e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m mVar, vg.c cVar) {
        super(cVar);
        this.f24396d = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24395c = obj;
        this.f24397e |= PKIFailureInfo.systemUnavail;
        return this.f24396d.h(this);
    }
}
