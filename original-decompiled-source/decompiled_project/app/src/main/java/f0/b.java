package f0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", f = "BringIntoViewRequester.kt", l = {100}, m = "bringIntoView")
/* loaded from: classes.dex */
public final class b extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public p1.e f8746a;

    /* renamed from: b, reason: collision with root package name */
    public Object[] f8747b;

    /* renamed from: c, reason: collision with root package name */
    public int f8748c;

    /* renamed from: d, reason: collision with root package name */
    public int f8749d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f8750e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d f8751f;

    /* renamed from: g, reason: collision with root package name */
    public int f8752g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, vg.c cVar) {
        super(cVar);
        this.f8751f = dVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f8750e = obj;
        this.f8752g |= PKIFailureInfo.systemUnavail;
        return this.f8751f.a(null, this);
    }
}
