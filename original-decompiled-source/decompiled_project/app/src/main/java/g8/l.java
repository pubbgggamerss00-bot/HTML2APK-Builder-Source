package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {189}, m = "idToken")
/* loaded from: classes.dex */
public final class l extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11586b;

    /* renamed from: c, reason: collision with root package name */
    public int f11587c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p pVar, vg.c cVar) {
        super(cVar);
        this.f11586b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11585a = obj;
        this.f11587c |= PKIFailureInfo.systemUnavail;
        return this.f11586b.g(this);
    }
}
