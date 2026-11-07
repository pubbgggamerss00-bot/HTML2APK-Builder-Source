package androidx.credentials.playservices.controllers.identityauth.getsigninintent;

import android.app.PendingIntent;
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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.v;
import d4.x0;
import d4.y0;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderGetSignInIntentController extends CredentialProviderController<x0, ga.f, ga.l, y0, e4.o> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetSignInIntent";
    public d4.t<y0, e4.o> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetSignInIntentController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final CredentialProviderGetSignInIntentController getInstance(Context context) {
            kotlin.jvm.internal.r.e(context, "context");
            return new CredentialProviderGetSignInIntentController(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1] */
    public CredentialProviderGetSignInIntentController(Context context) {
        super(context);
        kotlin.jvm.internal.r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                kotlin.jvm.internal.r.e(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderGetSignInIntentController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final e4.o fromGmsException(Throwable th2) {
        String str = ((th2 instanceof com.google.android.gms.common.api.b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((com.google.android.gms.common.api.b) th2).getStatusCode()))) ? CredentialProviderBaseController.GET_INTERRUPTED : CredentialProviderBaseController.GET_NO_CREDENTIALS;
        return CredentialProviderBaseController.Companion.getCredentialExceptionTypeToException$credentials_play_services_auth(str, "During get sign-in intent, failure response from one tap: " + th2.getMessage());
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderGetSignInIntentController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        kotlin.jvm.internal.r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final e4.o e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.k
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$1$0(this.f1568a, e10);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, e4.o oVar) {
        credentialProviderGetSignInIntentController.getCallback().a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$2(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final y0 y0Var) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.s
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$2$0(this.f1584a, y0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, y0 y0Var) {
        credentialProviderGetSignInIntentController.getCallback().onResult(y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$3(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final g0 g0Var) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.l
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$3$0(this.f1570a, g0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void handleResponse$lambda$3$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, g0 g0Var) {
        credentialProviderGetSignInIntentController.getCallback().a(g0Var.f16327a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$4(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final e4.o oVar) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.n
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$4$0(this.f1575a, oVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, e4.o oVar) {
        credentialProviderGetSignInIntentController.getCallback().a(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$5(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final e4.r rVar) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.handleResponse$lambda$5$0(this.f1566a, rVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, e4.r rVar) {
        credentialProviderGetSignInIntentController.getCallback().a(rVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final e4.s sVar) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.t
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0$0(this.f1586a, sVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, e4.s sVar) {
        credentialProviderGetSignInIntentController.getCallback().a(sVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$1(CancellationSignal cancellationSignal, CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, PendingIntent result) {
        kotlin.jvm.internal.r.e(result, "result");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(credentialProviderGetSignInIntentController.context, (Class<?>) HiddenActivity.class);
        credentialProviderGetSignInIntentController.generateHiddenActivityIntent(credentialProviderGetSignInIntentController.resultReceiver, intent, CredentialProviderBaseController.SIGN_IN_INTENT_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, result);
        try {
            credentialProviderGetSignInIntentController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new i(credentialProviderGetSignInIntentController, 0));
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$1$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.a
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1$0$0(this.f1549a);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController) {
        credentialProviderGetSignInIntentController.getCallback().a(new e4.r(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, CancellationSignal cancellationSignal, Exception e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new m(0, credentialProviderGetSignInIntentController, credentialProviderGetSignInIntentController.fromGmsException(e10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$3$0(final CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, final e4.o oVar) {
        credentialProviderGetSignInIntentController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3$0$0(this.f1562a, oVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$3$0$0(CredentialProviderGetSignInIntentController credentialProviderGetSignInIntentController, e4.o oVar) {
        credentialProviderGetSignInIntentController.getCallback().a(oVar);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public y0 convertResponseToCredentialManager(ga.l response) throws e4.r {
        lb.d dVarCreateGoogleIdCredential;
        kotlin.jvm.internal.r.e(response, "response");
        if (response.f11900g != null) {
            dVarCreateGoogleIdCredential = createGoogleIdCredential(response);
        } else {
            Log.w(TAG, "Credential returned but no google Id found");
            dVarCreateGoogleIdCredential = null;
        }
        if (dVarCreateGoogleIdCredential != null) {
            return new y0(dVarCreateGoogleIdCredential);
        }
        throw new e4.r("When attempting to convert get response, null credential found");
    }

    public final lb.d createGoogleIdCredential(ga.l response) throws e4.r {
        kotlin.jvm.internal.r.e(response, "response");
        String str = response.f11894a;
        kotlin.jvm.internal.r.d(str, "getId(...)");
        try {
            String str2 = response.f11900g;
            kotlin.jvm.internal.r.b(str2);
            String str3 = response.f11895b;
            String str4 = str3 != null ? str3 : null;
            String str5 = response.f11896c;
            String str6 = str5 != null ? str5 : null;
            String str7 = response.f11897d;
            String str8 = str7 != null ? str7 : null;
            String str9 = response.f11901h;
            String str10 = str9 != null ? str9 : null;
            Uri uri = response.f11898e;
            return new lb.d(str, str2, str4, str8, str6, uri != null ? uri : null, str10);
        } catch (Exception unused) {
            throw new e4.r("When attempting to convert get response, null Google ID Token found");
        }
    }

    public final d4.t<y0, e4.o> getCallback() {
        d4.t<y0, e4.o> tVar = this.callback;
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
        if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(i11, new b(), new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.c
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderGetSignInIntentController.handleResponse$lambda$1(this.f1550a, (e4.o) obj);
            }
        }, this.cancellationSignal)) {
            return;
        }
        try {
            ga.l signInCredentialFromIntent = ga.g.b(this.context).getSignInCredentialFromIntent(intent);
            kotlin.jvm.internal.r.d(signInCredentialFromIntent, "getSignInCredentialFromIntent(...)");
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d(0, this, convertResponseToCredentialManager(signInCredentialFromIntent)));
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
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.f
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.handleResponse$lambda$4(this.f1557a, e11);
                }
            });
        } catch (Throwable th2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new g(0, this, new e4.r(th2.getMessage())));
        }
    }

    public final void setCallback(d4.t<y0, e4.o> tVar) {
        kotlin.jvm.internal.r.e(tVar, "<set-?>");
        this.callback = tVar;
    }

    public final void setExecutor(Executor executor) {
        kotlin.jvm.internal.r.e(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public ga.f convertRequestToPlayServices(x0 request) throws e4.s {
        kotlin.jvm.internal.r.e(request, "request");
        List<v> list = request.f7366a;
        if (list.size() != 1) {
            throw new e4.s("GetSignInWithGoogleOption cannot be combined with other options.");
        }
        v vVar = list.get(0);
        kotlin.jvm.internal.r.c(vVar, "null cannot be cast to non-null type com.google.android.libraries.identity.googleid.GetSignInWithGoogleOption");
        String str = ((lb.b) vVar).f16930d;
        com.google.android.gms.common.internal.p.f(str);
        return new ga.f(str, null, null, null, false, 0);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [androidx.credentials.playservices.controllers.identityauth.getsigninintent.p] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(x0 request, d4.t<y0, e4.o> callback, Executor executor, final CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(callback, "callback");
        kotlin.jvm.internal.r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        try {
            Task<PendingIntent> signInIntent = ga.g.b(this.context).getSignInIntent(convertRequestToPlayServices(request));
            final ?? r32 = new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.p
                @Override // eh.l
                public final Object invoke(Object obj) {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$1(cancellationSignal, this, (PendingIntent) obj);
                }
            };
            signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.q
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.r
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderGetSignInIntentController.invokePlayServices$lambda$3(this, cancellationSignal, exc);
                }
            });
        } catch (e4.s e10) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.getsigninintent.o
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderGetSignInIntentController.invokePlayServices$lambda$0(this.f1577a, e10);
                }
            });
        }
    }
}
