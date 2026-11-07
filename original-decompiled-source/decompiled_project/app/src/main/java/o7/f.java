package o7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.EACTags;

@vg.e(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {EACTags.DEPRECATED}, m = "intercept")
/* loaded from: classes.dex */
public final class f extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public l f19027a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f19028b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f19029c;

    /* renamed from: d, reason: collision with root package name */
    public int f19030d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(a aVar, vg.c cVar) {
        super(cVar);
        this.f19029c = aVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f19028b = obj;
        this.f19030d |= PKIFailureInfo.systemUnavail;
        return this.f19029c.a(null, this);
    }
}
