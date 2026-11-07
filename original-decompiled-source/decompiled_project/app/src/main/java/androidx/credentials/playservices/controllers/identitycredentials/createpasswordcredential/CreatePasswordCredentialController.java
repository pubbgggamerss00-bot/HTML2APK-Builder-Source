package androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential;

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
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.t;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class CreatePasswordCredentialController extends CredentialProviderController<d4.g, fb.m, f0, d4.c, e4.g> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePassword";
    private t<d4.c, e4.g> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CreatePasswordCredentialController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final CreatePasswordCredentialController getInstance(Context context) {
            r.e(context, "context");
            return new CreatePasswordCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1] */
    public CreatePasswordCredentialController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                r.e(resultData, "resultData");
                CreatePasswordCredentialController createPasswordCredentialController = this.this$0;
                CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1 createPasswordCredentialController$resultReceiver$1$onReceiveResult$1 = new CreatePasswordCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
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
                if (createPasswordCredentialController.maybeReportErrorFromResultReceiver(resultData, createPasswordCredentialController$resultReceiver$1$onReceiveResult$1, executor, tVar, this.this$0.cancellationSignal)) {
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

    public static final CreatePasswordCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(final CreatePasswordCredentialController createPasswordCredentialController, final e4.g e10) {
        r.e(e10, "e");
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.e
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePasswordCredentialController.handleResponse$lambda$1$0(this.f1621a, e10);
                }
            });
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CreatePasswordCredentialController createPasswordCredentialController, e4.g gVar) {
        t<d4.c, e4.g> tVar = createPasswordCredentialController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$2(CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new d(createPasswordCredentialController));
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CreatePasswordCredentialController createPasswordCredentialController) {
        t<d4.c, e4.g> tVar = createPasswordCredentialController.callback;
        if (tVar != null) {
            tVar.a(new e4.k("No provider data returned."));
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$3(final CreatePasswordCredentialController createPasswordCredentialController, final d4.c cVar) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.j
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePasswordCredentialController.handleResponse$lambda$3$0(this.f1633a, cVar);
                }
            });
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CreatePasswordCredentialController createPasswordCredentialController, d4.c cVar) {
        t<d4.c, e4.g> tVar = createPasswordCredentialController.callback;
        if (tVar != null) {
            tVar.onResult(cVar);
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$4(final CreatePasswordCredentialController createPasswordCredentialController, final e4.g gVar) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.k
                @Override // java.lang.Runnable
                public final void run() {
                    CreatePasswordCredentialController.handleResponse$lambda$4$0(this.f1635a, gVar);
                }
            });
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CreatePasswordCredentialController createPasswordCredentialController, e4.g gVar) {
        t<d4.c, e4.g> tVar = createPasswordCredentialController.callback;
        if (tVar == null) {
            r.h("callback");
            throw null;
        }
        if (gVar == null) {
            gVar = new e4.k("No provider data returned");
        }
        tVar.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CreatePasswordCredentialController createPasswordCredentialController, fb.k kVar) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(createPasswordCredentialController.context, (Class<?>) HiddenActivity.class);
        createPasswordCredentialController.generateHiddenActivityIntent(createPasswordCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PASSWORD_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, kVar.f11149a);
        try {
            createPasswordCredentialController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a(createPasswordCredentialController, 0));
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(CreatePasswordCredentialController createPasswordCredentialController) {
        Executor executor = createPasswordCredentialController.executor;
        if (executor != null) {
            executor.execute(new i(createPasswordCredentialController, 0));
            return f0.f21461a;
        }
        r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(CreatePasswordCredentialController createPasswordCredentialController) {
        t<d4.c, e4.g> tVar = createPasswordCredentialController.callback;
        if (tVar != null) {
            tVar.a(new e4.k(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(CreatePasswordCredentialController createPasswordCredentialController, d4.g gVar, t tVar, Executor executor, CancellationSignal cancellationSignal, Exception e10) {
        r.e(e10, "e");
        Log.w(TAG, "Pre-u credman create flow failed " + e10 + "; retrying with gis flow");
        new CredentialProviderCreatePasswordController(createPasswordCredentialController.context).invokePlayServices(gVar, (t<d4.c, e4.g>) tVar, executor, cancellationSignal);
    }

    public final Context getContext() {
        return this.context;
    }

    public final void handleResponse$credentials_play_services_auth(int i10, int i11, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i10 != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, new l(), new m(this, 0), this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.n
                @Override // eh.a
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$2(this.f1639a);
                }
            });
            return;
        }
        final d4.c cVarB = n4.b.b(intent, "android.credentials.TYPE_PASSWORD_CREDENTIAL");
        if (cVarB != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.b
                @Override // eh.a
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$3(this.f1615a, cVarB);
                }
            });
        } else {
            final e4.g gVarA = n4.b.a(intent);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.c
                @Override // eh.a
                public final Object invoke() {
                    return CreatePasswordCredentialController.handleResponse$lambda$4(this.f1617a, gVarA);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public fb.m convertRequestToPlayServices(d4.g request) {
        r.e(request, "request");
        new fb.m(null, null, null, null, null, null);
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d4.c convertResponseToCredentialManager(f0 response) {
        r.e(response, "response");
        return new d4.h();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.f] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(final d4.g request, final t<d4.c, e4.g> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        fb.m mVarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        r.e(context, "context");
        Task<fb.k> taskA = new gb.e(context, gb.e.f11907a, a.d.f5917i, g.a.f5924c).a(mVarConvertRequestToPlayServices);
        final ?? r12 = new eh.l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.f
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CreatePasswordCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, (fb.k) obj);
            }
        };
        taskA.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.g
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.h
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CreatePasswordCredentialController.invokePlayServices$lambda$2(this.f1626a, request, callback, executor, cancellationSignal, exc);
            }
        });
    }
}
