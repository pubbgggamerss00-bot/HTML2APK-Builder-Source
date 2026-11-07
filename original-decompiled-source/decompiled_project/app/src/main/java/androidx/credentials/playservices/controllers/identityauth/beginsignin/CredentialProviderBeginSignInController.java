package androidx.credentials.playservices.controllers.identityauth.beginsignin;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.d1;
import d4.f1;
import d4.t;
import d4.x0;
import d4.y0;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderBeginSignInController extends CredentialProviderController<x0, ga.b, ga.l, y0, e4.o> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "BeginSignIn";
    public t<y0, e4.o> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderBeginSignInController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final CredentialProviderBeginSignInController getInstance(Context context) {
            kotlin.jvm.internal.r.e(context, "context");
            return new CredentialProviderBeginSignInController(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1] */
    public CredentialProviderBeginSignInController(Context context) {
        super(context);
        kotlin.jvm.internal.r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                kotlin.jvm.internal.r.e(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderBeginSignInController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final lb.d createGoogleIdCredential(ga.l lVar) {
        String str = lVar.f11894a;
        kotlin.jvm.internal.r.d(str, "getId(...)");
        String str2 = lVar.f11900g;
        kotlin.jvm.internal.r.b(str2);
        String str3 = lVar.f11895b;
        if (str3 == null) {
            str3 = null;
        }
        String str4 = lVar.f11896c;
        String str5 = str4 != null ? str4 : null;
        String str6 = lVar.f11897d;
        if (str6 == null) {
            str6 = null;
        }
        String str7 = lVar.f11901h;
        String str8 = str7 != null ? str7 : null;
        Uri uri = lVar.f11898e;
        return new lb.d(str, str2, str3, str6, str5, uri != null ? uri : null, str8);
    }

    private final e4.o fromGmsException(Throwable th2) {
        String str = ((th2 instanceof com.google.android.gms.common.api.b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((com.google.android.gms.common.api.b) th2).getStatusCode()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        return CredentialProviderBaseController.Companion.getCredentialExceptionTypeToException$credentials_play_services_auth(str, "During begin sign in, failure response from one tap: " + th2.getMessage());
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderBeginSignInController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        kotlin.jvm.internal.r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final e4.o e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$1$0(this.f1471a, e10);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, e4.o oVar) {
        credentialProviderBeginSignInController.getCallback().a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$2(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final y0 y0Var) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.l
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$2$0(this.f1467a, y0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, y0 y0Var) {
        credentialProviderBeginSignInController.getCallback().onResult(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$3(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final g0 g0Var) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.p
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$3$0(this.f1475a, g0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleResponse$lambda$3$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, g0 g0Var) {
        credentialProviderBeginSignInController.getCallback().a(g0Var.f16327a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$4(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final e4.o oVar) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.o
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$4$0(this.f1473a, oVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, e4.o oVar) {
        credentialProviderBeginSignInController.getCallback().a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$5(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final e4.r rVar) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.i
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.handleResponse$lambda$5$0(this.f1462a, rVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, e4.r rVar) {
        credentialProviderBeginSignInController.getCallback().a(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CredentialProviderBeginSignInController credentialProviderBeginSignInController, ga.c cVar) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(credentialProviderBeginSignInController.context, (Class<?>) HiddenActivity.class);
        credentialProviderBeginSignInController.generateHiddenActivityIntent(credentialProviderBeginSignInController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, cVar.f11881a);
        try {
            credentialProviderBeginSignInController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new r(credentialProviderBeginSignInController, 0));
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getExecutor().execute(new q(credentialProviderBeginSignInController, 0));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController) {
        credentialProviderBeginSignInController.getCallback().a(new e4.r(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, CancellationSignal cancellationSignal, Exception e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        final e4.o oVarFromGmsException = credentialProviderBeginSignInController.fromGmsException(e10);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.m
            @Override // eh.a
            public final Object invoke() {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0(this.f1469a, oVarFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(final CredentialProviderBeginSignInController credentialProviderBeginSignInController, final e4.o oVar) {
        credentialProviderBeginSignInController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2$0$0(this.f1460a, oVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderBeginSignInController credentialProviderBeginSignInController, e4.o oVar) {
        credentialProviderBeginSignInController.getCallback().a(oVar);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public y0 convertResponseToCredentialManager(ga.l response) throws e4.r {
        d4.m f1Var;
        kotlin.jvm.internal.r.e(response, "response");
        String str = response.f11899f;
        if (str != null) {
            String str2 = response.f11894a;
            kotlin.jvm.internal.r.d(str2, "getId(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str2);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str);
            f1Var = new d1(bundle, str);
        } else if (response.f11900g != null) {
            f1Var = createGoogleIdCredential(response);
        } else if (response.f11902j != null) {
            String authenticationResponseJson = PublicKeyCredentialControllerUtility.Companion.toAssertPasskeyResponse(response);
            kotlin.jvm.internal.r.e(authenticationResponseJson, "authenticationResponseJson");
            Bundle bundle2 = new Bundle();
            bundle2.putString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON", authenticationResponseJson);
            f1Var = new f1(bundle2, authenticationResponseJson);
        } else {
            Log.w(TAG, "Credential returned but no google Id or password or passkey found");
            f1Var = null;
        }
        if (f1Var != null) {
            return new y0(f1Var);
        }
        throw new e4.r("When attempting to convert get response, null credential found");
    }

    public final t<y0, e4.o> getCallback() {
        t<y0, e4.o> tVar = this.callback;
        if (tVar != null) {
            return tVar;
        }
        kotlin.jvm.internal.r.h("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r6v10, types: [T, e4.m] */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, e4.r] */
    /* JADX WARN: Type inference failed for: r6v8, types: [T, e4.p] */
    public final void handleResponse$credentials_play_services_auth(int i10, int i11, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i10 != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i10);
            return;
        }
        CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
        if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(i11, new b(), new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.c
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.handleResponse$lambda$1(this.f1450a, (e4.o) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            ga.l signInCredentialFromIntent = ga.g.b(this.context).getSignInCredentialFromIntent(intent);
            kotlin.jvm.internal.r.d(signInCredentialFromIntent, "getSignInCredentialFromIntent(...)");
            final y0 y0VarConvertResponseToCredentialManager = convertResponseToCredentialManager(signInCredentialFromIntent);
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.d
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$2(this.f1451a, y0VarConvertResponseToCredentialManager);
                }
            });
        } catch (com.google.android.gms.common.api.b e10) {
            g0 g0Var = new g0();
            g0Var.f16327a = new e4.r(e10.getMessage());
            if (e10.getStatusCode() == 16) {
                g0Var.f16327a = new e4.m(e10.getMessage());
            } else if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(e10.getStatusCode()))) {
                g0Var.f16327a = new e4.p(e10.getMessage());
            }
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new e(0, this, g0Var));
        } catch (e4.o e11) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.f
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$4(this.f1456a, e11);
                }
            });
        } catch (Throwable th2) {
            final e4.r rVar = new e4.r(th2.getMessage());
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.g
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderBeginSignInController.handleResponse$lambda$5(this.f1458a, rVar);
                }
            });
        }
    }

    public final void setCallback(t<y0, e4.o> tVar) {
        kotlin.jvm.internal.r.e(tVar, "<set-?>");
        this.callback = tVar;
    }

    public final void setExecutor(Executor executor) {
        kotlin.jvm.internal.r.e(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public ga.b convertRequestToPlayServices(x0 request) {
        kotlin.jvm.internal.r.e(request, "request");
        return BeginSignInControllerUtility.Companion.constructBeginSignInRequest$credentials_play_services_auth(request, this.context);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [androidx.credentials.playservices.controllers.identityauth.beginsignin.a] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(x0 request, t<y0, e4.o> callback, Executor executor, final CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(callback, "callback");
        kotlin.jvm.internal.r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        Task<ga.c> taskBeginSignIn = ga.g.b(this.context).beginSignIn(convertRequestToPlayServices(request));
        final ?? r32 = new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.a
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderBeginSignInController.invokePlayServices$lambda$0(cancellationSignal, this, (ga.c) obj);
            }
        };
        taskBeginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.beginsignin.k
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderBeginSignInController.invokePlayServices$lambda$2(this, cancellationSignal, exc);
            }
        });
    }
}
