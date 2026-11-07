package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "androidx.datastore.core.SingleProcessCoordinator", f = "SingleProcessCoordinator.kt", l = {EACTags.ADDRESS, 41}, m = "lock")
/* loaded from: classes.dex */
public final class f1<T> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f24228a;

    /* renamed from: b, reason: collision with root package name */
    public yh.c f24229b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f24230c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h1 f24231d;

    /* renamed from: e, reason: collision with root package name */
    public int f24232e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(h1 h1Var, vg.c cVar) {
        super(cVar);
        this.f24231d = h1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24230c = obj;
        this.f24232e |= PKIFailureInfo.systemUnavail;
        return this.f24231d.b(null, this);
    }
}
