package androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential;

import a9.a1;
import a9.n0;
import a9.o0;
import android.app.PendingIntent;
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
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.c;
import d4.t;
import java.util.concurrent.Executor;
import pg.f0;

/* loaded from: classes.dex */
public final class CreatePublicKeyCredentialController extends CredentialProviderController<d4.i, fb.m, fb.o, d4.c, e4.g> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private t<d4.c, e4.g> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final CreatePublicKeyCredentialController getInstance(Context context) {
            kotlin.jvm.internal.r.e(context, "context");
            return new CreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1] */
    public CreatePublicKeyCredentialController(Context context) {
        super(context);
        kotlin.jvm.internal.r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                kotlin.jvm.internal.r.e(resultData, "resultData");
                CreatePublicKeyCredentialController createPublicKeyCredentialController = this.this$0;
                CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    kotlin.jvm.internal.r.h("executor");
                    throw null;
                }
                t tVar = this.this$0.callback;
                if (tVar == null) {
                    kotlin.jvm.internal.r.h("callback");
                    throw null;
                }
                if (createPublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, createPublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, tVar, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) u3.c.a(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class));
            }
        };
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        kotlin.jvm.internal.r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final e4.g e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.i
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePublicKeyCredentialController.handleResponse$lambda$1$0(this.f1658a, e10);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, e4.g gVar) {
        t<d4.c, e4.g> tVar = createPublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$2(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.b
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePublicKeyCredentialController.handleResponse$lambda$2$0(this.f1641a);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        t<d4.c, e4.g> tVar = createPublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new e4.k("No provider data returned."));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$3(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final d4.c cVar) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.o
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePublicKeyCredentialController.handleResponse$lambda$3$0(this.f1673a, cVar);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, d4.c cVar) {
        t<d4.c, e4.g> tVar = createPublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.onResult(cVar);
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$4(final CreatePublicKeyCredentialController createPublicKeyCredentialController, final e4.g gVar) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.p
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePublicKeyCredentialController.handleResponse$lambda$4$0(this.f1675a, gVar);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, e4.g gVar) {
        t<d4.c, e4.g> tVar = createPublicKeyCredentialController.callback;
        if (tVar == null) {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
        if (gVar == null) {
            gVar = new e4.k("No provider data returned");
        }
        tVar.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CreatePublicKeyCredentialController createPublicKeyCredentialController, Executor executor, t tVar, fb.k kVar) {
        PendingIntent pendingIntent = kVar.f11149a;
        fb.o oVar = kVar.f11150b;
        if (pendingIntent == null && oVar == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new l(0, executor, tVar));
            return f0.f21461a;
        }
        if (pendingIntent != null) {
            Intent intent = new Intent(createPublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
            createPublicKeyCredentialController.generateHiddenActivityIntent(createPublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
            intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, pendingIntent);
            try {
                createPublicKeyCredentialController.context.startActivity(intent);
            } catch (Exception unused) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a1(createPublicKeyCredentialController, 1));
            }
        }
        if (oVar != null) {
            d4.c cVarConvertResponseToCredentialManager = createPublicKeyCredentialController.convertResponseToCredentialManager(oVar);
            if (cVarConvertResponseToCredentialManager instanceof d4.j) {
                CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new m(executor, tVar, (d4.j) cVarConvertResponseToCredentialManager, 0));
                return f0.f21461a;
            }
        }
        if (pendingIntent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new n(0, executor, tVar));
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(Executor executor, final t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.a
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$0$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(t tVar) {
        tVar.a(new e4.k(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$1(final CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        Executor executor = createPublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.r
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePublicKeyCredentialController.invokePlayServices$lambda$0$1$0(this.f1679a);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(CreatePublicKeyCredentialController createPublicKeyCredentialController) {
        t<d4.c, e4.g> tVar = createPublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new e4.k(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$2(Executor executor, final t tVar, final d4.c cVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.q
            @Override // java.lang.Runnable
            public final void run() {
                tVar.onResult(cVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$3(Executor executor, final t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.k
            @Override // java.lang.Runnable
            public final void run() {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$0$3$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$3$0(t tVar) {
        tVar.a(new e4.k(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(d4.i iVar, CreatePublicKeyCredentialController createPublicKeyCredentialController, t tVar, Executor executor, CancellationSignal cancellationSignal, Exception e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        iVar.getClass();
        Log.w(TAG, "Pre-u credman PK create flow failed " + e10 + "; retrying with gis flow");
        CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(createPublicKeyCredentialController.context).invokePlayServices(iVar, (t<d4.c, e4.g>) tVar, executor, cancellationSignal);
    }

    private static final f0 invokePlayServices$lambda$2$0(CreatePublicKeyCredentialController createPublicKeyCredentialController, Exception exc, Executor executor, final t tVar) {
        kotlin.jvm.internal.r.b(exc);
        final e4.g gVarFromGmsException = createPublicKeyCredentialController.fromGmsException(exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.j
            @Override // java.lang.Runnable
            public final void run() {
                tVar.a(gVarFromGmsException);
            }
        });
        return f0.f21461a;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d4.c convertResponseToCredentialManager(fb.o response) {
        kotlin.jvm.internal.r.e(response, "response");
        return c.a.a(response.f11158b, response.f11157a);
    }

    public final e4.g fromGmsException(Throwable e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        if (!(e10 instanceof com.google.android.gms.common.api.b)) {
            if (e10 instanceof com.google.android.gms.common.api.p) {
                return new e4.l("API is unsupported");
            }
            return new e4.k("Conditional create failed, failure: " + e10);
        }
        int statusCode = ((com.google.android.gms.common.api.b) e10).getStatusCode();
        if (statusCode == 16) {
            return new e4.e(e10.getMessage());
        }
        if (statusCode == 17) {
            return new e4.l("API is not supported: " + e10.getMessage());
        }
        if (statusCode == 8) {
            return new e4.i(e10.getMessage());
        }
        if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(statusCode))) {
            return new e4.h(e10.getMessage());
        }
        return new e4.k("Conditional create failed, failure: " + e10.getMessage());
    }

    public final void handleResponse$credentials_play_services_auth(int i10, int i11, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i10 != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, new f(), new n0(this, 1), this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new o0(this, 1));
            return;
        }
        d4.c cVarB = n4.b.b(intent, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL");
        if (cVarB != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new g(0, this, cVarB));
        } else {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new h(0, this, n4.b.a(intent)));
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public fb.m convertRequestToPlayServices(d4.i request) {
        kotlin.jvm.internal.r.e(request, "request");
        new fb.m(null, null, null, null, null, null);
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(final d4.i request, final t<d4.c, e4.g> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(callback, "callback");
        kotlin.jvm.internal.r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        fb.m mVarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        kotlin.jvm.internal.r.e(context, "context");
        Task<fb.k> taskA = new gb.e(context, gb.e.f11907a, a.d.f5917i, g.a.f5924c).a(mVarConvertRequestToPlayServices);
        final ?? r12 = new eh.l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.c
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CreatePublicKeyCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, executor, callback, (fb.k) obj);
            }
        };
        taskA.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CreatePublicKeyCredentialController.invokePlayServices$lambda$2(request, this, callback, executor, cancellationSignal, exc);
            }
        });
    }
}
