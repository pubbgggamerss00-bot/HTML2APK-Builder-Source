package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {348}, m = "writeData$datastore_core_release")
/* loaded from: classes.dex */
public final class g0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.e0 f24237a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24238b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24239c;

    /* renamed from: d, reason: collision with root package name */
    public int f24240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(m mVar, vg.c cVar) {
        super(cVar);
        this.f24239c = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24238b = obj;
        this.f24240d |= PKIFailureInfo.systemUnavail;
        return this.f24239c.j(null, false, this);
    }
}
