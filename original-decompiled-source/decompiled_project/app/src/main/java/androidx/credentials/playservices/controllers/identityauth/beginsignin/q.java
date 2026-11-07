package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import l9.v;

/* loaded from: classes.dex */
public final /* synthetic */ class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1477a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1478b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f1477a = i10;
        this.f1478b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1477a) {
            case 0:
                CredentialProviderBeginSignInController.invokePlayServices$lambda$0$0$0((CredentialProviderBeginSignInController) this.f1478b);
                break;
            default:
                v vVar = (v) this.f1478b;
                if (vVar.f16902e != null) {
                    vVar.b();
                    vVar.f16899b.invoke();
                    break;
                }
                break;
        }
    }
}
