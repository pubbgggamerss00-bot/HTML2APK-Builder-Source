package d4;

import android.content.Context;
import android.credentials.ClearCredentialStateException;
import android.credentials.Credential;
import android.credentials.CredentialManager;
import android.credentials.GetCredentialException;
import android.credentials.GetCredentialRequest;
import android.credentials.GetCredentialResponse;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.OutcomeReceiver;
import android.util.Log;
import d4.m;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final CredentialManager f7358a;

    public static final class a implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p f7359a;

        public a(p pVar) {
            this.f7359a = pVar;
        }

        public final void onError(Throwable th2) {
            ClearCredentialStateException error = r0.a(th2);
            kotlin.jvm.internal.r.e(error, "error");
            Log.i("CredManProvService", "ClearCredentialStateException error returned from framework");
            this.f7359a.a(new e4.c(null));
        }

        public final void onResult(Object obj) {
            Log.i("CredManProvService", "Clear result returned from framework: ");
            this.f7359a.onResult((Void) obj);
        }
    }

    public static final class b implements OutcomeReceiver {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f7360a;

        public b(r rVar, s0 s0Var) {
            this.f7360a = rVar;
        }

        public final void onError(Throwable th2) throws i4.b {
            GetCredentialException error = t0.a(th2);
            kotlin.jvm.internal.r.e(error, "error");
            Log.i("CredManProvService", "GetCredentialResponse error returned from framework");
            String type = error.getType();
            kotlin.jvm.internal.r.d(type, "getType(...)");
            this.f7360a.a(i4.a.b(error.getMessage(), type));
        }

        public final void onResult(Object obj) {
            GetCredentialResponse response = u0.a(obj);
            kotlin.jvm.internal.r.e(response, "response");
            Log.i("CredManProvService", "GetCredentialResponse returned from framework");
            Credential credential = response.getCredential();
            kotlin.jvm.internal.r.d(credential, "getCredential(...)");
            String type = credential.getType();
            kotlin.jvm.internal.r.d(type, "getType(...)");
            Bundle data = credential.getData();
            kotlin.jvm.internal.r.d(data, "getData(...)");
            this.f7360a.onResult(new y0(m.a.a(data, type)));
        }
    }

    public s0(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        this.f7358a = h0.a(context.getSystemService("credential"));
    }

    @Override // d4.w
    public final boolean isAvailableOnDevice() {
        return Build.VERSION.SDK_INT >= 34 && this.f7358a != null;
    }

    @Override // d4.w
    public final void onClearCredential(d4.a aVar, CancellationSignal cancellationSignal, Executor executor, t<Void, e4.a> tVar) {
        Log.i("CredManProvService", "In CredentialProviderFrameworkImpl onClearCredential");
        p pVar = (p) tVar;
        CredentialManager credentialManager = this.f7358a;
        if (credentialManager == null) {
            pVar.a(new e4.d("Your device doesn't support credential manager", "androidx.credentials.TYPE_CLEAR_CREDENTIAL_UNSUPPORTED_EXCEPTION"));
            pg.f0 f0Var = pg.f0.f21461a;
        } else {
            a aVar2 = new a(pVar);
            kotlin.jvm.internal.r.b(credentialManager);
            a0.a();
            credentialManager.clearCredentialState(z.a(new Bundle()), cancellationSignal, (n) executor, aVar2);
        }
    }

    @Override // d4.w
    public final void onGetCredential(Context context, x0 x0Var, CancellationSignal cancellationSignal, Executor executor, t<y0, e4.o> tVar) {
        kotlin.jvm.internal.r.e(context, "context");
        r rVar = (r) tVar;
        CredentialManager credentialManager = this.f7358a;
        if (credentialManager == null) {
            rVar.a(new e4.s("Your device doesn't support credential manager"));
            pg.f0 f0Var = pg.f0.f21461a;
            return;
        }
        b bVar = new b(rVar, this);
        kotlin.jvm.internal.r.b(credentialManager);
        d0.a();
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        GetCredentialRequest.Builder builderA = b0.a(bundle);
        for (v vVar : x0Var.f7366a) {
            e0.a();
            vVar.getClass();
            builderA.addCredentialOption(c0.a(vVar.f7362a, vVar.f7363b).setIsSystemProviderRequired(true).setAllowedProviders(vVar.f7364c).build());
        }
        GetCredentialRequest getCredentialRequestBuild = builderA.build();
        kotlin.jvm.internal.r.d(getCredentialRequestBuild, "build(...)");
        credentialManager.getCredential(context, getCredentialRequestBuild, cancellationSignal, (n) executor, (OutcomeReceiver<GetCredentialResponse, GetCredentialException>) bVar);
    }
}
