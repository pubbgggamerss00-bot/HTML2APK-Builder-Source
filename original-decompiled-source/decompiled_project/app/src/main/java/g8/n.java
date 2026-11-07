package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {227}, m = "listTurns")
/* loaded from: classes.dex */
public final class n extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11592b;

    /* renamed from: c, reason: collision with root package name */
    public int f11593c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, vg.c cVar) {
        super(cVar);
        this.f11592b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11591a = obj;
        this.f11593c |= PKIFailureInfo.systemUnavail;
        return this.f11592b.i(null, this);
    }
}
