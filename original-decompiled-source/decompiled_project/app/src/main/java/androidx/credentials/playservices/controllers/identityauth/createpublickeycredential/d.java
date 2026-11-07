package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import f9.fg;
import org.json.JSONException;
import p5.x;
import pg.f0;
import s8.b2;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1509a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1510b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1511c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f1509a = i10;
        this.f1510b = obj;
        this.f1511c = obj2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f1509a) {
            case 0:
                return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$0((CredentialProviderCreatePublicKeyCredentialController) this.f1510b, (JSONException) this.f1511c);
            default:
                fg fgVar = (fg) this.f1510b;
                x xVar = (x) this.f1511c;
                fgVar.l();
                b2.e(xVar);
                return f0.f21461a;
        }
    }
}
