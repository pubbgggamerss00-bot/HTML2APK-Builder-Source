package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {147, 159, 161}, m = "signIn-0E7RQCE")
/* loaded from: classes.dex */
public final class q extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f11614a;

    /* renamed from: b, reason: collision with root package name */
    public p f11615b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11616c;

    /* renamed from: d, reason: collision with root package name */
    public p f11617d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f11618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p f11619f;

    /* renamed from: g, reason: collision with root package name */
    public int f11620g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p pVar, vg.c cVar) {
        super(cVar);
        this.f11619f = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11618e = obj;
        this.f11620g |= PKIFailureInfo.systemUnavail;
        Object objM = this.f11619f.m(null, null, this);
        return objM == ug.a.f29706a ? objM : new pg.p(objM);
    }
}
