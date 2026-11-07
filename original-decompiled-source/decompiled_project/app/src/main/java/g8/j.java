package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {170}, m = "ensureUser")
/* loaded from: classes.dex */
public final class j extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public p f11577a;

    /* renamed from: b, reason: collision with root package name */
    public String f11578b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11579c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f11580d;

    /* renamed from: e, reason: collision with root package name */
    public int f11581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p pVar, vg.c cVar) {
        super(cVar);
        this.f11580d = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11579c = obj;
        this.f11581e |= PKIFailureInfo.systemUnavail;
        return this.f11580d.f(this);
    }
}
