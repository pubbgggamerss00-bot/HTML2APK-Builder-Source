package x5;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {212}, m = "acquire")
/* loaded from: classes.dex */
public final class g extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public h f32118a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f32120c;

    /* renamed from: d, reason: collision with root package name */
    public int f32121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, vg.c cVar) {
        super(cVar);
        this.f32120c = hVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f32119b = obj;
        this.f32121d |= PKIFailureInfo.systemUnavail;
        return this.f32120c.a(this);
    }
}
