package g8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.account.AccountRepository", f = "AccountRepository.kt", l = {183, 184}, m = "deleteAccount-IoAF18A")
/* loaded from: classes.dex */
public final class i extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public p f11572a;

    /* renamed from: b, reason: collision with root package name */
    public p f11573b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f11574c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f11575d;

    /* renamed from: e, reason: collision with root package name */
    public int f11576e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p pVar, vg.c cVar) {
        super(cVar);
        this.f11575d = pVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f11574c = obj;
        this.f11576e |= PKIFailureInfo.systemUnavail;
        Object objE = this.f11575d.e(this);
        return objE == ug.a.f29706a ? objE : new pg.p(objE);
    }
}
