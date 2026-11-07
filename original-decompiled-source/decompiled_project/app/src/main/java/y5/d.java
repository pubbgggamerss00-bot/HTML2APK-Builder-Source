package y5;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "androidx.room.driver.SupportSQLitePooledConnection", f = "SupportSQLiteConnectionPool.android.kt", l = {83}, m = "transaction")
/* loaded from: classes.dex */
public final class d<R> extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public c f33943a;

    /* renamed from: b, reason: collision with root package name */
    public i6.b f33944b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f33945c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f33946d;

    /* renamed from: e, reason: collision with root package name */
    public int f33947e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, vg.c cVar2) {
        super(cVar2);
        this.f33946d = cVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f33945c = obj;
        this.f33947e |= PKIFailureInfo.systemUnavail;
        return this.f33946d.e(null, null, this);
    }
}
