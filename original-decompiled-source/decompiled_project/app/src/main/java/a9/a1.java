package a9;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;

/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f128b;

    public /* synthetic */ a1(Object obj, int i10) {
        this.f127a = i10;
        this.f128b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f127a) {
            case 0:
                ((x0.n1) this.f128b).setValue(Boolean.valueOf(!v0.g(r0)));
                return pg.f0.f21461a;
            default:
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1((CreatePublicKeyCredentialController) this.f128b);
        }
    }
}
