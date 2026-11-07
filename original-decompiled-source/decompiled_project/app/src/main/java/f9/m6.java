package f9;

import androidx.credentials.playservices.controllers.CredentialProviderController;

/* loaded from: classes.dex */
public final /* synthetic */ class m6 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10025a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f10026b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f10027c;

    public /* synthetic */ m6(int i10, Object obj, Object obj2) {
        this.f10025a = i10;
        this.f10026b = obj;
        this.f10027c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f10025a) {
            case 0:
                fg fgVar = (fg) this.f10026b;
                p5.x xVar = (p5.x) this.f10027c;
                fgVar.l();
                s8.b2.e(xVar);
                return pg.f0.f21461a;
            default:
                return CredentialProviderController.Companion.maybeReportErrorResultCodeGet$lambda$0((eh.l) this.f10026b, (kotlin.jvm.internal.g0) this.f10027c);
        }
    }
}
