package x5;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {543}, m = "endTransaction")
/* loaded from: classes.dex */
public final class k extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public i f32145a;

    /* renamed from: b, reason: collision with root package name */
    public e f32146b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f32147c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32148d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f32149e;

    /* renamed from: f, reason: collision with root package name */
    public int f32150f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(i iVar, vg.c cVar) {
        super(cVar);
        this.f32149e = iVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32148d = obj;
        this.f32150f |= PKIFailureInfo.systemUnavail;
        return this.f32149e.f(false, this);
    }
}
