package androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identitycredentials.IdentityCredentialApiHiddenActivity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.a1;
import d4.m;
import d4.t;
import d4.v;
import d4.x0;
import d4.y0;
import e4.m;
import e4.o;
import e4.p;
import eh.l;
import fb.a0;
import fb.e0;
import fb.s;
import fb.y;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderGetDigitalCredentialController extends CredentialProviderController<x0, GetCredentialRequest, a0, y0, o> {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "DigitalCredentialClient";
    public t<y0, o> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final CredentialProviderGetDigitalCredentialController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1] */
    public CredentialProviderGetDigitalCredentialController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) throws i4.b {
                r.e(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new CredentialProviderGetDigitalCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                ResponseUtils.Companion.handleGetCredentialResponse(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) u3.c.a(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal);
            }
        };
    }

    private final o fromGmsException(Throwable th2) throws i4.b {
        if (th2 instanceof y) {
            i4.a.b(th2.getMessage(), null);
            throw null;
        }
        if (!(th2 instanceof com.google.android.gms.common.api.b)) {
            return new e4.r("Get digital credential failed, failure: " + th2);
        }
        int statusCode = ((com.google.android.gms.common.api.b) th2).getStatusCode();
        if (statusCode == 16) {
            return new m(th2.getMessage());
        }
        if (CredentialProviderBaseController.Companion.getRetryables().contains(Integer.valueOf(statusCode))) {
            return new p(th2.getMessage());
        }
        return new e4.r("Get digital credential failed, failure: " + th2);
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
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, e0 e0Var) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(credentialProviderGetDigitalCredentialController.context, (Class<?>) IdentityCredentialApiHiddenActivity.class);
        intent.setFlags(65536);
        intent.putExtra(CredentialProviderBaseController.RESULT_RECEIVER_TAG, credentialProviderGetDigitalCredentialController.toIpcFriendlyResultReceiver(credentialProviderGetDigitalCredentialController.resultReceiver));
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, e0Var.f11145a);
        intent.putExtra(CredentialProviderBaseController.EXTRA_ERROR_NAME, CredentialProviderBaseController.GET_UNKNOWN);
        credentialProviderGetDigitalCredentialController.context.startActivity(intent);
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(CredentialProviderGetDigitalCredentialController credentialProviderGetDigitalCredentialController, CancellationSignal cancellationSignal, final Executor executor, final t tVar, Exception e10) throws i4.b {
        r.e(e10, "e");
        final o oVarFromGmsException = credentialProviderGetDigitalCredentialController.fromGmsException(e10);
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.d
            @Override // eh.a
            public final Object invoke() {
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2$0(executor, tVar, oVarFromGmsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(Executor executor, final t tVar, final o oVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.e
            @Override // java.lang.Runnable
            public final void run() {
                tVar.a(oVar);
            }
        });
        return f0.f21461a;
    }

    public final t<y0, o> getCallback() {
        t<y0, o> tVar = this.callback;
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

    public final void setCallback(t<y0, o> tVar) {
        r.e(tVar, "<set-?>");
        this.callback = tVar;
    }

    public final void setExecutor(Executor executor) {
        r.e(executor, "<set-?>");
        this.executor = executor;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public GetCredentialRequest convertRequestToPlayServices(x0 request) {
        r.e(request, "request");
        ArrayList arrayList = new ArrayList();
        for (v vVar : request.f7366a) {
            if (vVar instanceof a1) {
                arrayList.add(new s("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", vVar.f7362a, vVar.f7363b, null, "", ""));
            }
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        return new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public y0 convertResponseToCredentialManager(a0 response) {
        r.e(response, "response");
        return new y0(m.a.a(response.f11143a.f11163b, "androidx.credentials.TYPE_DIGITAL_CREDENTIAL"));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.a] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(x0 request, final t<y0, o> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        this.cancellationSignal = cancellationSignal;
        setCallback(callback);
        setExecutor(executor);
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        GetCredentialRequest getCredentialRequestConvertRequestToPlayServices = convertRequestToPlayServices(request);
        Context context = this.context;
        r.e(context, "context");
        Task<e0> taskB = new gb.e(context, gb.e.f11907a, a.d.f5917i, g.a.f5924c).b(getCredentialRequestConvertRequestToPlayServices);
        final ?? r02 = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.a
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, (e0) obj);
            }
        };
        taskB.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.c
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) throws i4.b {
                CredentialProviderGetDigitalCredentialController.invokePlayServices$lambda$2(this.f1697a, cancellationSignal, executor, callback, exc);
            }
        });
    }
}
