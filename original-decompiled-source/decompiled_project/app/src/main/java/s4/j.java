package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s4.m;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore", f = "DataStoreImpl.kt", l = {430, 434}, m = "doRun")
/* loaded from: classes.dex */
public final class j extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public m.a f24267a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f24268b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m<Object>.a f24269c;

    /* renamed from: d, reason: collision with root package name */
    public int f24270d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m.a aVar, vg.c cVar) {
        super(cVar);
        this.f24269c = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24268b = obj;
        this.f24270d |= PKIFailureInfo.systemUnavail;
        return this.f24269c.a(this);
    }
}
