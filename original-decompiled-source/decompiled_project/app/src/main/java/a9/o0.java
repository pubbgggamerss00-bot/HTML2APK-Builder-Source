package a9;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import java.util.ArrayList;
import s8.e2;

/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f272b;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f271a = i10;
        this.f272b = obj;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f271a) {
            case 0:
                ((p5.x) this.f272b).b(new j0(0), e2.j.f24640c.f24627a);
                return pg.f0.f21461a;
            case 1:
                return CreatePublicKeyCredentialController.handleResponse$lambda$2((CreatePublicKeyCredentialController) this.f272b);
            case 2:
                ((c9.s1) this.f272b).n(1);
                return pg.f0.f21461a;
            default:
                return ((kh.j) ((ArrayList) this.f272b).get(0)).h();
        }
    }
}
