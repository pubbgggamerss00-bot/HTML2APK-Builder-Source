package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {212}, m = "cancelGeneration")
/* loaded from: classes.dex */
public final class h extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f11569a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f11570b;

    /* renamed from: c, reason: collision with root package name */
    public int f11571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p pVar, vg.c cVar) {
        super(cVar);
        this.f11570b = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11569a = obj;
        this.f11571c |= PKIFailureInfo.systemUnavail;
        return this.f11570b.c(null, null, this);
    }
}
