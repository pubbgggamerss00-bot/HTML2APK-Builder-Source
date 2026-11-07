package androidx.credentials.playservices.controllers.identityauth.createpassword;

import android.content.Context;
import android.content.Intent;
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
import com.google.android.gms.common.internal.p;
import com.google.android.gms.internal.p000authapi.zbag;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.t;
import ga.m;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePasswordController extends CredentialProviderController<d4.g, ga.i, f0, d4.c, e4.g> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePassword";
    private t<d4.c, e4.g> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePasswordController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final CredentialProviderCreatePasswordController getInstance(Context context) {
            r.e(context, "context");
            return new CredentialProviderCreatePasswordController(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1] */
    public CredentialProviderCreatePasswordController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                r.e(resultData, "resultData");
                CredentialProviderCreatePasswordController credentialProviderCreatePasswordController = this.this$0;
                CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    r.h("executor");
                    throw null;
                }
                t tVar = this.this$0.callback;
                if (tVar == null) {
                    r.h("callback");
                    throw null;
                }
                if (credentialProviderCreatePasswordController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePasswordController$resultReceiver$1$onReceiveResult$1, executor, tVar, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10);
            }
        };
    }

    private final e4.g fromGmsException(Throwable th2) {
        String str = ((th2 instanceof com.google.android.gms.common.api.b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((com.google.android.gms.common.api.b) th2).getStatusCode()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.Companion.createCredentialExceptionTypeToException$credentials_play_services_auth(str, "During save password, found password failure response from one tap " + th2.getMessage());
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static final CredentialProviderCreatePasswordController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, e4.g e10) {
        r.e(e10, "e");
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new c(0, credentialProviderCreatePasswordController, e10));
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, e4.g gVar) {
        t<d4.c, e4.g> tVar = credentialProviderCreatePasswordController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, d4.c cVar) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new a(0, credentialProviderCreatePasswordController, cVar));
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, d4.c cVar) {
        t<d4.c, e4.g> tVar = credentialProviderCreatePasswordController.callback;
        if (tVar != null) {
            tVar.onResult(cVar);
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, ga.j jVar) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(credentialProviderCreatePasswordController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePasswordController.generateHiddenActivityIntent(credentialProviderCreatePasswordController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, jVar.f11893a);
        try {
            credentialProviderCreatePasswordController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.d
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0(this.f1490a);
                }
            });
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.h
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePasswordController.invokePlayServices$lambda$0$0$0(this.f1495a);
                }
            });
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController) {
        t<d4.c, e4.g> tVar = credentialProviderCreatePasswordController.callback;
        if (tVar != null) {
            tVar.a(new e4.k(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, CancellationSignal cancellationSignal, Exception e10) {
        r.e(e10, "e");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new b(0, credentialProviderCreatePasswordController, credentialProviderCreatePasswordController.fromGmsException(e10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(final CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, final e4.g gVar) {
        Executor executor = credentialProviderCreatePasswordController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.l
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePasswordController.invokePlayServices$lambda$2$0$0(this.f1501a, gVar);
                }
            });
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderCreatePasswordController credentialProviderCreatePasswordController, e4.g gVar) {
        t<d4.c, e4.g> tVar = credentialProviderCreatePasswordController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            r.h("callback");
            throw null;
        }
    }

    public final void handleResponse$credentials_play_services_auth(int i10, int i11) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i10 == companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, new e(), new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.f
                @Override // eh.l
                public final Object invoke(Object obj) {
                    return CredentialProviderCreatePasswordController.handleResponse$lambda$1(this.f1491a, (e4.g) obj);
                }
            }, this.cancellationSignal)) {
                return;
            }
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new g(0, this, convertResponseToCredentialManager(f0.f21461a)));
            return;
        }
        Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + i10);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public ga.i convertRequestToPlayServices(d4.g request) {
        r.e(request, "request");
        return new ga.i(new m(null, null), null, 0);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d4.c convertResponseToCredentialManager(f0 response) {
        r.e(response, "response");
        return new d4.h();
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [androidx.credentials.playservices.controllers.identityauth.createpassword.i] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(d4.g request, t<d4.c, e4.g> callback, Executor executor, final CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        ga.i iVarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        p.f(context);
        Task<ga.j> taskSavePassword = new zbag(context, new ga.t()).savePassword(iVarConvertRequestToPlayServices);
        final ?? r32 = new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.i
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderCreatePasswordController.invokePlayServices$lambda$0(cancellationSignal, this, (ga.j) obj);
            }
        };
        taskSavePassword.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.j
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpassword.k
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderCreatePasswordController.invokePlayServices$lambda$2(this, cancellationSignal, exc);
            }
        });
    }
}
