package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {177}, m = "signOut")
/* loaded from: classes.dex */
public final class r extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11621a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11622b;

    /* renamed from: c, reason: collision with root package name */
    public int f11623c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p pVar, vg.c cVar) {
        super(cVar);
        this.f11622b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11621a = obj;
        this.f11623c |= PKIFailureInfo.systemUnavail;
        return this.f11622b.n(this);
    }
}
