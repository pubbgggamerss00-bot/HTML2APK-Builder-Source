package s4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {214, 118}, m = "writeScope")
/* loaded from: classes.dex */
public final class p0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public q0 f24361a;

    /* renamed from: b, reason: collision with root package name */
    public Object f24362b;

    /* renamed from: c, reason: collision with root package name */
    public Object f24363c;

    /* renamed from: d, reason: collision with root package name */
    public s0 f24364d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f24365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q0<Object> f24366f;

    /* renamed from: g, reason: collision with root package name */
    public int f24367g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(q0 q0Var, vg.c cVar) {
        super(cVar);
        this.f24366f = q0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f24365e = obj;
        this.f24367g |= PKIFailureInfo.systemUnavail;
        return this.f24366f.b(null, this);
    }
}
