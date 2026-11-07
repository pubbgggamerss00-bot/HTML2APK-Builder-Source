package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import s4.l;

@vg.e(c = "androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1", f = "DataStoreImpl.kt", l = {544, 447, 449}, m = "updateData")
/* loaded from: classes.dex */
public final class k extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24276a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24277b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24278c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f24279d;

    /* renamed from: e, reason: collision with root package name */
    public m f24280e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f24281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l.a f24282g;

    /* renamed from: h, reason: collision with root package name */
    public int f24283h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l.a aVar, vg.c cVar) {
        super(cVar);
        this.f24282g = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24281f = obj;
        this.f24283h |= PKIFailureInfo.systemUnavail;
        return this.f24282g.a(null, this);
    }
}
