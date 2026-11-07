package androidx.credentials.playservices.controllers.blockstore.createrestorecredential;

import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import b8.n;
import c9.y0;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.k;
import d4.l;
import d4.t;
import e4.g;
import eh.a;
import java.util.concurrent.Executor;
import k4.i;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import ma.c;
import ma.e;
import na.f;
import na.h;
import org.json.JSONObject;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderCreateRestoreCredentialController extends CredentialProviderController<k, c, e, d4.c, g> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderCreateRestoreCredentialController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CredentialProviderCreateRestoreCredentialController credentialProviderCreateRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final t tVar, e eVar) {
        try {
            r.b(eVar);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new y0(executor, tVar, credentialProviderCreateRestoreCredentialController.convertResponseToCredentialManager(eVar), 1));
        } catch (Exception e10) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: k4.h
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1(executor, tVar, e10);
                }
            });
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(Executor executor, final t tVar, final d4.c cVar) {
        executor.execute(new Runnable() { // from class: k4.c
            @Override // java.lang.Runnable
            public final void run() {
                tVar.onResult(cVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$1(Executor executor, final t tVar, final Exception exc) {
        executor.execute(new Runnable() { // from class: k4.b
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0$1$0(tVar, exc);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(t tVar, Exception exc) {
        tVar.a(new e4.k(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, e4.k] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, e4.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, e4.g] */
    /* JADX WARN: Type inference failed for: r2v8, types: [T, e4.k] */
    /* JADX WARN: Type inference failed for: r8v5, types: [T, e4.g] */
    public static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final Executor executor, final t tVar, Exception e10) {
        r.e(e10, "e");
        final g0 g0Var = new g0();
        g0Var.f16327a = new e4.k(i.a(e10, new StringBuilder("Create restore credential failed for unknown reason, failure: ")));
        if (e10 instanceof b) {
            b bVar = (b) e10;
            switch (bVar.getStatusCode()) {
                case 40201:
                    g0Var.f16327a = new e4.k(i.a(e10, new StringBuilder("The restore credential internal service had a failure, failure: ")));
                    break;
                case 40202:
                    String errorMessage = "The request did not match the fido spec, failure: " + e10.getMessage();
                    r.e(errorMessage, "errorMessage");
                    g0Var.f16327a = new h4.a(errorMessage, "androidx.credentials.TYPE_CREATE_RESTORE_CREDENTIAL_DOM_EXCEPTION/androidx.credentials.TYPE_DATA_ERROR");
                    break;
                case 40203:
                    g0Var.f16327a = new h4.b("E2ee is not available on the device. Check whether the backup and screen lock are enabled.", "androidx.credentials.TYPE_E2EE_UNAVAILABLE_EXCEPTION");
                    break;
                default:
                    g0Var.f16327a = new e4.k("The restore credential service failed with unsupported status code, failure: " + e10.getMessage() + ", status code: " + bVar.getStatusCode());
                    break;
            }
        }
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: k4.a
            @Override // eh.a
            public final Object invoke() {
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0(executor, tVar, g0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(Executor executor, final t tVar, final g0 g0Var) {
        executor.execute(new Runnable() { // from class: k4.d
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2$0$0(tVar, g0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(t tVar, g0 g0Var) {
        tVar.a(g0Var.f16327a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d4.c convertResponseToCredentialManager(e response) throws e4.k {
        r.e(response, "response");
        Bundle data = response.f18024a;
        r.e(data, "data");
        String string = data.getString("androidx.credentials.BUNDLE_KEY_CREATE_RESTORE_CREDENTIAL_RESPONSE");
        if (string == null) {
            throw new e4.k("The response bundle did not contain the response data. This should not happen.");
        }
        l lVar = new l(data, "androidx.credentials.TYPE_RESTORE_CREDENTIAL");
        if (string.length() != 0) {
            try {
                new JSONObject(string);
                return lVar;
            } catch (Exception unused) {
            }
        }
        throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public c convertRequestToPlayServices(k request) {
        r.e(request, "request");
        new c(null);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [k4.e] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(k request, final t<d4.c, g> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        c request2 = convertRequestToPlayServices(request);
        h hVarB = n.b(this.context);
        r.e(request2, "request");
        u.a aVarA = u.a();
        aVarA.f6058c = new pa.c[]{zzab.zzj};
        f fVar = new f();
        fVar.f18649a = request2;
        aVarA.f6056a = fVar;
        aVarA.f6059d = 1693;
        Task<TResult> taskDoRead = hVarB.doRead(aVarA.a());
        r.d(taskDoRead, "doRead(...)");
        final ?? r02 = new eh.l() { // from class: k4.e
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$0(this.f15988a, cancellationSignal, executor, callback, (ma.e) obj);
            }
        };
        taskDoRead.addOnSuccessListener(new OnSuccessListener() { // from class: k4.f
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: k4.g
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderCreateRestoreCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, callback, exc);
            }
        });
    }
}
