package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {194}, m = "appCheckToken")
/* loaded from: classes.dex */
public final class g extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11566a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11567b;

    /* renamed from: c, reason: collision with root package name */
    public int f11568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p pVar, vg.c cVar) {
        super(cVar);
        this.f11567b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11566a = obj;
        this.f11568c |= PKIFailureInfo.systemUnavail;
        return this.f11567b.b(this);
    }
}
