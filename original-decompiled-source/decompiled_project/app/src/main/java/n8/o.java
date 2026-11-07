package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.KeystoreRepository", f = "KeystoreRepository.kt", l = {55}, m = "persistKeystore-gIAlu-s")
/* loaded from: classes.dex */
public final class o extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f18554b;

    /* renamed from: c, reason: collision with root package name */
    public int f18555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l lVar, vg.c cVar) {
        super(cVar);
        this.f18554b = lVar;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f18553a = obj;
        this.f18555c |= PKIFailureInfo.systemUnavail;
        Object objG = this.f18554b.g(null, this);
        return objG == ug.a.f29706a ? objG : new pg.p(objG);
    }
}
