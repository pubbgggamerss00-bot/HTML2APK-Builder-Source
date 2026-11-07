package x5;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {554}, m = "usePrepared")
/* loaded from: classes.dex */
public final class m<R> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public i f32157a;

    /* renamed from: b, reason: collision with root package name */
    public String f32158b;

    /* renamed from: c, reason: collision with root package name */
    public eh.l f32159c;

    /* renamed from: d, reason: collision with root package name */
    public e f32160d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f32161e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f32162f;

    /* renamed from: g, reason: collision with root package name */
    public int f32163g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(i iVar, vg.c cVar) {
        super(cVar);
        this.f32162f = iVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32161e = obj;
        this.f32163g |= PKIFailureInfo.systemUnavail;
        return this.f32162f.a(null, null, this);
    }
}
