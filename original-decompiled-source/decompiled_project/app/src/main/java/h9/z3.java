package h9;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@vg.e(c = "com.basitce.htmltoapk.ui.screens.settings.SettingsViewModel", f = "SettingsViewModel.kt", l = {49}, m = "setLanguage")
/* loaded from: classes.dex */
public final class z3 extends vg.c {

    /* renamed from: a, reason: collision with root package name */
    public b4 f12920a;

    /* renamed from: b, reason: collision with root package name */
    public String f12921b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f12922c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4 f12923d;

    /* renamed from: e, reason: collision with root package name */
    public int f12924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(b4 b4Var, vg.c cVar) {
        super(cVar);
        this.f12923d = b4Var;
    }

    @Override // vg.a
    public final Object invokeSuspend(Object obj) {
        this.f12922c = obj;
        this.f12924e |= PKIFailureInfo.systemUnavail;
        return this.f12923d.f(null, this);
    }
}
