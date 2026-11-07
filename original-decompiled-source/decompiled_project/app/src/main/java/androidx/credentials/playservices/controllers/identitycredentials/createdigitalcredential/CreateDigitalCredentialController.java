package androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential;

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
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.tasks.OnFailureListener;
import d4.c;
import d4.t;
import fb.o;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class CreateDigitalCredentialController extends CredentialProviderController<d4.e, fb.m, o, d4.c, e4.g> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public t<d4.c, e4.g> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CreateDigitalCredentialController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1] */
    public CreateDigitalCredentialController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                r.e(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CreateDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    private static /* synthetic */ void getResultReceiver$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(final CreateDigitalCredentialController createDigitalCredentialController, final e4.g e10) {
        r.e(e10, "e");
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.k
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$1$0(this.f1609a, e10);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CreateDigitalCredentialController createDigitalCredentialController, e4.g gVar) {
        createDigitalCredentialController.getCallback().a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$2(final CreateDigitalCredentialController createDigitalCredentialController) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.a
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$2$0(this.f1588a);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2$0(CreateDigitalCredentialController createDigitalCredentialController) {
        createDigitalCredentialController.getCallback().a(new e4.k("No provider data returned."));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$3(CreateDigitalCredentialController createDigitalCredentialController, e4.g gVar) {
        createDigitalCredentialController.getExecutor().execute(new e(0, createDigitalCredentialController, gVar));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CreateDigitalCredentialController createDigitalCredentialController, e4.g gVar) {
        t<d4.c, e4.g> callback = createDigitalCredentialController.getCallback();
        if (gVar == null) {
            gVar = new e4.k("Unexpected configuration error");
        }
        callback.a(gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$4(final CreateDigitalCredentialController createDigitalCredentialController, final d4.c cVar) {
        createDigitalCredentialController.getExecutor().execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.f
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.handleResponse$lambda$4$0(this.f1599a, cVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CreateDigitalCredentialController createDigitalCredentialController, d4.c cVar) {
        createDigitalCredentialController.getCallback().onResult(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CreateDigitalCredentialController createDigitalCredentialController, fb.k kVar) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(createDigitalCredentialController.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, createDigitalCredentialController.toIpcFriendlyResultReceiver(createDigitalCredentialController.resultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, kVar.f11149a);
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.CREATE_UNKNOWN);
        createDigitalCredentialController.context.startActivity(intent);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, Executor executor, t tVar, Exception e10) {
        r.e(e10, "e");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a9.h(executor, tVar, e10, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(Executor executor, final t tVar, final Exception exc) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.j
            @Override // java.lang.Runnable
            public final void run() {
                CreateDigitalCredentialController.invokePlayServices$lambda$2$0$0(tVar, exc);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(t tVar, Exception exc) {
        tVar.a(new e4.k(exc.getMessage()));
    }

    public final t<d4.c, e4.g> getCallback() {
        t<d4.c, e4.g> tVar = this.callback;
        if (tVar != null) {
            return tVar;
        }
        r.h("callback");
        throw null;
    }

    public final Executor getExecutor() {
        Executor executor = this.executor;
        if (executor != null) {
            return executor;
        }
        r.h("executor");
        throw null;
    }

    public final void handleResponse$credentials_play_services_auth(int i10, int i11, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i10 != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, new l(), new m(this, 0), this.cancellationSignal)) {
            return;
        }
        if (intent == null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new b(this, 0));
            return;
        }
        d4.c cVarB = n4.b.b(intent, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
        if (cVarB != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new d(0, this, cVarB));
        } else {
            final e4.g gVarA = n4.b.a(intent);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.c
                @Override // eh.a
                public final Object invoke() {
                    return CreateDigitalCredentialController.handleResponse$lambda$3(this.f1591a, gVarA);
                }
            });
        }
    }

    public final void setCallback(t<d4.c, e4.g> tVar) {
        r.e(tVar, "<set-?>");
        this.callback = tVar;
    }

    public final void setExecutor(Executor executor) {
        r.e(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public fb.m convertRequestToPlayServices(d4.e request) {
        r.e(request, "request");
        new fb.m(null, null, null, null, null, this.resultReceiver);
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d4.c convertResponseToCredentialManager(o response) {
        r.e(response, "response");
        return c.a.a(response.f11158b, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL");
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(d4.e request, final t<d4.c, e4.g> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        fb.m mVarConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        r.e(context, "context");
        new gb.e(context, gb.e.f11907a, a.d.f5917i, g.a.f5924c).a(mVarConvertRequestToPlayServices).addOnSuccessListener(new h(new eh.l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.g
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CreateDigitalCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, (fb.k) obj);
            }
        })).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.i
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CreateDigitalCredentialController.invokePlayServices$lambda$2(cancellationSignal, executor, callback, exc);
            }
        });
    }
}
