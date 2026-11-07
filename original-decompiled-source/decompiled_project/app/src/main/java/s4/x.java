package s4;

import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.DataStoreImpl", f = "DataStoreImpl.kt", l = {365, 366, 368, 369, 380, 384}, m = "readDataOrHandleCorruption")
/* loaded from: classes.dex */
public final class x extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24417a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24418b;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f24419c;

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.g0 f24420d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f24421e;

    /* renamed from: f, reason: collision with root package name */
    public int f24422f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f24423g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ m<Object> f24424h;

    /* renamed from: j, reason: collision with root package name */
    public int f24425j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m mVar, vg.c cVar) {
        super(cVar);
        this.f24424h = mVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24423g = obj;
        this.f24425j |= PKIFailureInfo.systemUnavail;
        return m.f(this.f24424h, false, this);
    }
}
