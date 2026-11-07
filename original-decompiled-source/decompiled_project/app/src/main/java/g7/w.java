package g7;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "coil3.RealImageLoader", f = "RealImageLoader.kt", l = {117, 129, 133}, m = "execute")
/* loaded from: classes.dex */
public final class w extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public t f11545a;

    /* renamed from: b, reason: collision with root package name */
    public w7.n f11546b;

    /* renamed from: c, reason: collision with root package name */
    public w7.f f11547c;

    /* renamed from: d, reason: collision with root package name */
    public h f11548d;

    /* renamed from: e, reason: collision with root package name */
    public l f11549e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11550f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ t f11551g;

    /* renamed from: h, reason: collision with root package name */
    public int f11552h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t tVar, vg.c cVar) {
        super(cVar);
        this.f11551g = tVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11550f = obj;
        this.f11552h |= PKIFailureInfo.systemUnavail;
        int i10 = t.f11524f;
        return this.f11551g.b(null, 0, this);
    }
}
