package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import android.content.Context;
import com.basitce.htmltoapk.R;
import java.io.IOException;
import kotlin.jvm.internal.g0;
import pg.f0;
import ve.l0;
import ve.x;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements eh.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1555b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1556c;

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.f1554a = i10;
        this.f1556c = obj;
        this.f1555b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.Object, mf.p] */
    @Override // eh.a
    public final Object invoke() throws IOException {
        int i10 = this.f1554a;
        Object obj = this.f1555b;
        Object obj2 = this.f1556c;
        switch (i10) {
            case 0:
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$3((CredentialProviderGetSignInIntentController) obj2, (g0) obj);
            case 1:
                g0 g0Var = (g0) obj;
                hf.b bVar = (hf.b) obj2;
                mf.n nVar = (mf.n) g0Var.f16327a;
                if (nVar != null) {
                    return nVar;
                }
                ?? pVar = new mf.p(bVar, new l0(false, false).c(new x(bf.a.a("com/tom_roush/pdfbox/resources/ttf/LiberationSans-Regular.ttf"))));
                g0Var.f16327a = pVar;
                return pVar;
            default:
                hf.a.a((c.k) obj2, (Context) obj, "image/*", R.string.launch_no_app);
                return f0.f21461a;
        }
    }

    public /* synthetic */ e(g0 g0Var, hf.b bVar) {
        this.f1554a = 1;
        this.f1555b = g0Var;
        this.f1556c = bVar;
    }
}
