package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

import f9.fg;
import pg.f0;
import sh.z0;

/* loaded from: classes.dex */
public final /* synthetic */ class m implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1612b;

    public /* synthetic */ m(Object obj, int i10) {
        this.f1611a = i10;
        this.f1612b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f1611a) {
            case 0:
                return CreateDigitalCredentialController.handleResponse$lambda$1((CreateDigitalCredentialController) this.f1612b, (e4.g) obj);
            default:
                fg fgVar = (fg) this.f1612b;
                Boolean bool = (Boolean) obj;
                bool.getClass();
                z0 z0Var = fgVar.J0;
                z0Var.getClass();
                z0Var.j(null, bool);
                return f0.f21461a;
        }
    }
}
