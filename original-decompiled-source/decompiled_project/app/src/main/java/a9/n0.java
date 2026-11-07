package a9;

import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import f9.fg;
import x0.r3;

/* loaded from: classes.dex */
public final /* synthetic */ class n0 implements eh.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f267a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f268b;

    public /* synthetic */ n0(Object obj, int i10) {
        this.f267a = i10;
        this.f268b = obj;
    }

    @Override // eh.l
    public final Object invoke(Object obj) {
        switch (this.f267a) {
            case 0:
                r3 r3Var = (r3) this.f268b;
                q1.l1 graphicsLayer = (q1.l1) obj;
                kotlin.jvm.internal.r.e(graphicsLayer, "$this$graphicsLayer");
                float fFloatValue = r3Var != null ? ((Number) r3Var.getValue()).floatValue() : 1.0f;
                graphicsLayer.h(fFloatValue);
                graphicsLayer.d(fFloatValue);
                return pg.f0.f21461a;
            case 1:
                return CreatePublicKeyCredentialController.handleResponse$lambda$1((CreatePublicKeyCredentialController) this.f268b, (e4.g) obj);
            default:
                fg fgVar = (fg) this.f268b;
                String it = (String) obj;
                kotlin.jvm.internal.r.e(it, "it");
                sh.z0 z0Var = fgVar.f9581o0;
                z0Var.getClass();
                z0Var.j(null, it);
                return pg.f0.f21461a;
        }
    }
}
