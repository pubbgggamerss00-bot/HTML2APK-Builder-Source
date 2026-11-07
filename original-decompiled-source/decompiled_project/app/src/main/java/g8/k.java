package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {99}, m = "fetchAccount")
/* loaded from: classes.dex */
public final class k extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11582a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11583b;

    /* renamed from: c, reason: collision with root package name */
    public int f11584c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, vg.c cVar) {
        super(cVar);
        this.f11583b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11582a = obj;
        this.f11584c |= PKIFailureInfo.systemUnavail;
        return p.a(this.f11583b, null, this);
    }
}
