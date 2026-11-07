package z8;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.onboarding.OnboardingViewModel", f = "OnboardingViewModel.kt", l = {25, 28}, m = "completeOnboarding")
/* loaded from: classes.dex */
public final class d0 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public e0 f34794a;

    /* renamed from: b, reason: collision with root package name */
    public String f34795b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34796c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f34797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e0 f34798e;

    /* renamed from: f, reason: collision with root package name */
    public int f34799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(e0 e0Var, vg.c cVar) {
        super(cVar);
        this.f34798e = e0Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f34797d = obj;
        this.f34799f |= PKIFailureInfo.systemUnavail;
        return this.f34798e.f(null, false, this);
    }
}
