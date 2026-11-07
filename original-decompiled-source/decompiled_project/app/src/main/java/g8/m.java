package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {219}, m = "listSessions")
/* loaded from: classes.dex */
public final class m extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11588a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11589b;

    /* renamed from: c, reason: collision with root package name */
    public int f11590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, vg.c cVar) {
        super(cVar);
        this.f11589b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11588a = obj;
        this.f11590c |= PKIFailureInfo.systemUnavail;
        return this.f11589b.h(this);
    }
}
