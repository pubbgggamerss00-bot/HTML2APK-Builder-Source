package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository", f = "SettingsRepository.kt", l = {135}, m = "isProWatermarkResetDone")
/* loaded from: classes.dex */
public final class x extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f18617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f18618b;

    /* renamed from: c, reason: collision with root package name */
    public int f18619c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(m1 m1Var, vg.c cVar) {
        super(cVar);
        this.f18618b = m1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18617a = obj;
        this.f18619c |= PKIFailureInfo.systemUnavail;
        return this.f18618b.b(this);
    }
}
