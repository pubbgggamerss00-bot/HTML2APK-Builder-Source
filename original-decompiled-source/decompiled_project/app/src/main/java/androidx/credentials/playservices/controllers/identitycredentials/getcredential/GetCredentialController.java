package androidx.credentials.playservices.controllers.identitycredentials.getcredential;

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
import androidx.credentials.playservices.controllers.ResponseUtils;
import androidx.credentials.playservices.controllers.identityauth.HiddenActivity;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.m;
import d4.t;
import d4.v;
import d4.x0;
import d4.y0;
import e4.o;
import eh.l;
import fb.a0;
import fb.e0;
import fb.q;
import fb.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import pg.f0;
import qg.p;

/* loaded from: classes.dex */
public final class GetCredentialController extends CredentialProviderController<x0, GetCredentialRequest, a0, y0, o> {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetCredentialController";
    public t<y0, o> callback;
    private CancellationSignal cancellationSignal;
    private final Context context;
    public Executor executor;
    private final GetCredentialController$resultReceiver$1 resultReceiver;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1] */
    public GetCredentialController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
        final Handler handler = new Handler(Looper.getMainLooper());
        this.resultReceiver = new ResultReceiver(handler) { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController$resultReceiver$1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i10, Bundle resultData) throws i4.b {
                r.e(resultData, "resultData");
                if (this.this$0.maybeReportErrorFromResultReceiver(resultData, new GetCredentialController$resultReceiver$1$onReceiveResult$1(CredentialProviderBaseController.Companion), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal)) {
                    return;
                }
                ResponseUtils.Companion.handleGetCredentialResponse(resultData.getInt(CredentialProviderBaseController.ACTIVITY_REQUEST_CODE_TAG), i10, (Intent) u3.c.a(resultData, CredentialProviderBaseController.RESULT_DATA_TAG, Intent.class), this.this$0.getExecutor(), this.this$0.getCallback(), this.this$0.cancellationSignal);
            }
        };
    }

    private final s convertCredentialOptionToPlayServices(v vVar) {
        vVar.getClass();
        return new s("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", vVar.f7362a, vVar.f7363b, "", "", "");
    }

    public static /* synthetic */ void getCallback$annotations() {
    }

    private static /* synthetic */ void getCancellationSignal$annotations() {
    }

    public static /* synthetic */ void getExecutor$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CancellationSignal cancellationSignal, GetCredentialController getCredentialController, Executor executor, t tVar, e0 e0Var) {
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return f0.f21461a;
        }
        Intent intent = new Intent(getCredentialController.context, (Class<?>) HiddenActivity.class);
        getCredentialController.generateHiddenActivityIntent(getCredentialController.resultReceiver, intent, CredentialProviderBaseController.BEGIN_SIGN_IN_TAG);
        intent.putExtra(CredentialProviderBaseController.EXTRA_FLOW_PENDING_INTENT, e0Var.f11145a);
        try {
            getCredentialController.context.startActivity(intent);
        } catch (Exception unused) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new b(0, executor, tVar));
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(Executor executor, final t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.a
            @Override // java.lang.Runnable
            public final void run() {
                GetCredentialController.invokePlayServices$lambda$0$0$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0$0(t tVar) {
        tVar.a(new e4.r(CredentialProviderController.ERROR_MESSAGE_START_ACTIVITY_FAILED));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2(x0 x0Var, GetCredentialController getCredentialController, t tVar, Executor executor, CancellationSignal cancellationSignal, Exception e10) {
        r.e(e10, "e");
        if (CredentialProviderPlayServicesImpl.Companion.isGetSignInIntentRequest$credentials_play_services_auth(x0Var)) {
            Log.w(TAG, "Pre-u credman get flow failed for get sign in intent; retrying with gis flow");
            new CredentialProviderGetSignInIntentController(getCredentialController.context).invokePlayServices(x0Var, (t<y0, o>) tVar, executor, cancellationSignal);
        } else {
            Log.w(TAG, "Pre-u credman get flow failed; retrying with gis flow");
            new CredentialProviderBeginSignInController(getCredentialController.context).invokePlayServices(x0Var, (t<y0, o>) tVar, executor, cancellationSignal);
        }
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public y0 convertResponseToCredentialManager(a0 response) {
        r.e(response, "response");
        q qVar = response.f11143a;
        return new y0(m.a.a(qVar.f11163b, qVar.f11162a));
    }

    public final t<y0, o> getCallback() {
        t<y0, o> tVar = this.callback;
        if (tVar != null) {
            return tVar;
        }
        r.h("callback");
        throw null;
    }

    public final Context getContext() {
        return this.context;
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
        Bundle bundle = new Bundle();
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", false);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
        bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", null);
        List<v> list = request.f7366a;
        ArrayList arrayList = new ArrayList(p.h(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(convertCredentialOptionToPlayServices((v) it.next()));
        }
        return new GetCredentialRequest(arrayList, bundle, null, new ResultReceiver(null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.credentials.playservices.controllers.identitycredentials.getcredential.c] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(final x0 request, final t<y0, o> callback, final Executor executor, final CancellationSignal cancellationSignal) {
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
        final ?? r12 = new l() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.c
            @Override // eh.l
            public final Object invoke(Object obj) {
                return GetCredentialController.invokePlayServices$lambda$0(cancellationSignal, this, executor, callback, (e0) obj);
            }
        };
        taskB.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.d
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.controllers.identitycredentials.getcredential.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                GetCredentialController.invokePlayServices$lambda$2(request, this, callback, executor, cancellationSignal, exc);
            }
        });
    }
}
