package androidx.credentials.playservices.controllers.identityauth.createpublickeycredential;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.fido.zzp;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import f4.b0;
import java.util.concurrent.Executor;
import org.json.JSONException;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderCreatePublicKeyCredentialController extends CredentialProviderController<d4.i, db.u, db.t, d4.c, e4.g> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "CreatePublicKey";
    private d4.t<d4.c, e4.g> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    private Executor executor;
    private final CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
            kotlin.jvm.internal.r.e(context, "context");
            return new CredentialProviderCreatePublicKeyCredentialController(context);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1] */
    public CredentialProviderCreatePublicKeyCredentialController(Context context) {
        super(context);
        kotlin.jvm.internal.r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) {
                kotlin.jvm.internal.r.e(resultData, "resultData");
                CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController = this.this$0;
                CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1 = new CredentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion);
                Executor executor = this.this$0.executor;
                if (executor == null) {
                    kotlin.jvm.internal.r.h("executor");
                    throw null;
                }
                d4.t tVar = this.this$0.callback;
                if (tVar == null) {
                    kotlin.jvm.internal.r.h("callback");
                    throw null;
                }
                if (credentialProviderCreatePublicKeyCredentialController.maybeReportErrorFromResultReceiver(resultData, credentialProviderCreatePublicKeyCredentialController$resultReceiver$1$onReceiveResult$1, executor, tVar, this.this$0.cancellationSignal)) {
                    return;
                }
                this.this$0.handleResponse$credentials_play_services_auth(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) resultData.getParcelable(CredentialProviderBaseController.RESULT_DATA_TAG));
            }
        };
    }

    private final g4.a JSONExceptionToPKCError(JSONException jSONException) {
        String message = jSONException.getMessage();
        return (message == null || message.length() <= 0) ? new g4.a(new f4.f(), "Unknown error") : new g4.a(new f4.f(), message);
    }

    private final e4.g fromIntentRequestException(Throwable th2) {
        String str = ((th2 instanceof com.google.android.gms.common.api.b) && CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(((com.google.android.gms.common.api.b) th2).getStatusCode()))) ? CredentialProviderBaseController.CREATE_INTERRUPTED : CredentialProviderBaseController.CREATE_UNKNOWN;
        return CredentialProviderBaseController.Companion.createCredentialExceptionTypeToException$credentials_play_services_auth(str, "During create public key credential, fido registration failure: " + th2.getMessage());
    }

    private static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    private static /* synthetic */ void getExecutor$annotations() {
    }

    public static final CredentialProviderCreatePublicKeyCredentialController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$0(CancellationSignal cancellationSignal, eh.a f10) {
        kotlin.jvm.internal.r.e(f10, "f");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$1(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final e4.g e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.o
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$1$0(this.f1532a, e10);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$1$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, e4.g gVar) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$2(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new g4.a(new b0(), "Upon handling create public key credential response, fido module giving null bytes indicating internal error"));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$3(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final e4.g gVar) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.j
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$3$0(this.f1522a, gVar);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$3$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, e4.g gVar) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$4(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final d4.c cVar) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.q
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$4$0(this.f1536a, cVar);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$4$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, d4.c cVar) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.onResult(cVar);
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$5(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.a
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5$0(this.f1503a, jSONException);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$5$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new g4.a(new f4.f(), jSONException.getMessage()));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 handleResponse$lambda$6(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new r(0, credentialProviderCreatePublicKeyCredentialController, th2));
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void handleResponse$lambda$6$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new g4.a(new b0(), th2.getMessage()));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final JSONException jSONException) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.l
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$0$0(this.f1525a, jSONException);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, JSONException jSONException) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(credentialProviderCreatePublicKeyCredentialController.JSONExceptionToPKCError(jSONException));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$1(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final Throwable th2) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.p
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$1$0(this.f1534a, th2);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$1$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, Throwable th2) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new e4.k(th2.getMessage()));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2(CancellationSignal cancellationSignal, CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, PendingIntent result) {
        kotlin.jvm.internal.r.e(result, "result");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(credentialProviderCreatePublicKeyCredentialController.context, (Class<?>) HiddenActivity.class);
        credentialProviderCreatePublicKeyCredentialController.generateHiddenActivityIntent(credentialProviderCreatePublicKeyCredentialController.resultReceiver, intent, CredentialProviderBaseController.CREATE_PUBLIC_KEY_CREDENTIAL_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, result);
        try {
            credentialProviderCreatePublicKeyCredentialController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new m(credentialProviderCreatePublicKeyCredentialController, 0));
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.k
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$2$0$0(this.f1524a);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(new e4.k(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, CancellationSignal cancellationSignal, Exception e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new n(0, credentialProviderCreatePublicKeyCredentialController, credentialProviderCreatePublicKeyCredentialController.fromIntentRequestException(e10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$4$0(final CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, final e4.g gVar) {
        Executor executor = credentialProviderCreatePublicKeyCredentialController.executor;
        if (executor != null) {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.i
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$4$0$0(this.f1520a, gVar);
                }
            });
            return f0.f21461a;
        }
        kotlin.jvm.internal.r.h("executor");
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$4$0$0(CredentialProviderCreatePublicKeyCredentialController credentialProviderCreatePublicKeyCredentialController, e4.g gVar) {
        d4.t<d4.c, e4.g> tVar = credentialProviderCreatePublicKeyCredentialController.callback;
        if (tVar != null) {
            tVar.a(gVar);
        } else {
            kotlin.jvm.internal.r.h("callback");
            throw null;
        }
    }

    public final void handleResponse$credentials_play_services_auth(int i10, int i11, Intent intent) {
        CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
        if (i10 != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
            Log.w(TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " does not match what was given " + i10);
            return;
        }
        if (CredentialProviderController.maybeReportErrorResultCodeCreate(i11, new s(), new t(this, 0), this.cancellationSignal)) {
            return;
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("FIDO2_CREDENTIAL_EXTRA") : null;
        if (byteArrayExtra == null) {
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(this.cancellationSignal)) {
                return;
            }
            Executor executor = this.executor;
            if (executor != null) {
                executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.u
                    @Override // java.lang.Runnable
                    public final void run() {
                        CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$2(this.f1543a);
                    }
                });
                return;
            } else {
                kotlin.jvm.internal.r.h("executor");
                throw null;
            }
        }
        db.t tVar = (db.t) qa.d.a(byteArrayExtra, db.t.CREATOR);
        kotlin.jvm.internal.r.d(tVar, "deserializeFromBytes(...)");
        e4.g gVarPublicKeyCredentialResponseContainsError = PublicKeyCredentialControllerUtility.Companion.publicKeyCredentialResponseContainsError(tVar);
        if (gVarPublicKeyCredentialResponseContainsError != null) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new v(0, this, gVarPublicKeyCredentialResponseContainsError));
            return;
        }
        try {
            final d4.c cVarConvertResponseToCredentialManager = convertResponseToCredentialManager(tVar);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.w
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$4(this.f1547a, cVarConvertResponseToCredentialManager);
                }
            });
        } catch (JSONException e10) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.b
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$5(this.f1505a, e10);
                }
            });
        } catch (Throwable th2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(this.cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.c
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderCreatePublicKeyCredentialController.handleResponse$lambda$6(this.f1507a, th2);
                }
            });
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public db.u convertRequestToPlayServices(d4.i request) {
        kotlin.jvm.internal.r.e(request, "request");
        return PublicKeyCredentialControllerUtility.Companion.convert(request, this.context);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public d4.c convertResponseToCredentialManager(db.t response) throws e4.k {
        kotlin.jvm.internal.r.e(response, "response");
        try {
            String string = response.d().toString();
            kotlin.jvm.internal.r.d(string, "toJson(...)");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", string);
            return new d4.j(bundle, string);
        } catch (Throwable th2) {
            throw new e4.k("The PublicKeyCredential response json had an unexpected exception when parsing: " + th2.getMessage());
        }
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.f] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(d4.i request, d4.t<d4.c, e4.g> callback, Executor executor, final CancellationSignal cancellationSignal) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(callback, "callback");
        kotlin.jvm.internal.r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        this.callback = callback;
        this.executor = executor;
        int i10 = 0;
        try {
            final db.u uVarConvertRequestToPlayServices = convertRequestToPlayServices(request);
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            Context context = this.context;
            int i11 = bb.a.f4202a;
            final cb.a aVar = new cb.a(context, cb.a.f5354a, a.d.f5917i, new com.google.android.gms.common.api.internal.a());
            u.a aVarA = com.google.android.gms.common.api.internal.u.a();
            aVarA.f6056a = new com.google.android.gms.common.api.internal.q(aVar, uVarConvertRequestToPlayServices) { // from class: cb.b

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ db.u f5355a;

                {
                    this.f5355a = uVarConvertRequestToPlayServices;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.android.gms.common.api.internal.q
                public final void accept(Object obj, Object obj2) throws RemoteException {
                    ((zzs) ((zzp) obj).getService()).zzc(new c((TaskCompletionSource) obj2), this.f5355a);
                }
            };
            aVarA.f6059d = 5407;
            Task<TResult> taskDoRead = aVar.doRead(aVarA.a());
            final ?? r52 = new eh.l() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.f
                @Override // eh.l
                public final Object invoke(Object obj) {
                    return CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$2(cancellationSignal, this, (PendingIntent) obj);
                }
            };
            taskDoRead.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderCreatePublicKeyCredentialController.invokePlayServices$lambda$4(this, cancellationSignal, exc);
                }
            });
        } catch (JSONException e10) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new d(i10, this, e10));
        } catch (Throwable th2) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new e(i10, this, th2));
        }
    }
}
