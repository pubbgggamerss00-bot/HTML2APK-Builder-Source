package x5;

import java.io.Serializable;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.coroutines.PooledConnectionImpl", f = "ConnectionPoolImpl.kt", l = {376, 380, 393, 393, 393}, m = "transaction")
/* loaded from: classes.dex */
public final class l<R> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f32151a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f32152b;

    /* renamed from: c, reason: collision with root package name */
    public int f32153c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f32154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i f32155e;

    /* renamed from: f, reason: collision with root package name */
    public int f32156f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(i iVar, vg.c cVar) {
        super(cVar);
        this.f32155e = iVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32154d = obj;
        this.f32156f |= PKIFailureInfo.systemUnavail;
        return this.f32155e.g(null, null, this);
    }
}
