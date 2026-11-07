package n8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.data.repository.SettingsRepository", f = "SettingsRepository.kt", l = {266, 268}, m = "consumeThirdLaunchProPrompt")
/* loaded from: classes.dex */
public final class t extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f18589a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m1 f18591c;

    /* renamed from: d, reason: collision with root package name */
    public int f18592d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(m1 m1Var, vg.c cVar) {
        super(cVar);
        this.f18591c = m1Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f18590b = obj;
        this.f18592d |= PKIFailureInfo.systemUnavail;
        return this.f18591c.a(this);
    }
}
