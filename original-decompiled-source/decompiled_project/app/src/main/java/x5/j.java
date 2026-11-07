package x5;

import androidx.room.t0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {543}, m = "beginTransaction")
/* loaded from: classes.dex */
public final class j extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public i f32139a;

    /* renamed from: b, reason: collision with root package name */
    public t0.a f32140b;

    /* renamed from: c, reason: collision with root package name */
    public e f32141c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f32143e;

    /* renamed from: f, reason: collision with root package name */
    public int f32144f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(i iVar, vg.c cVar) {
        super(cVar);
        this.f32143e = iVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32142d = obj;
        this.f32144f |= PKIFailureInfo.systemUnavail;
        return this.f32143e.e(null, this);
    }
}
