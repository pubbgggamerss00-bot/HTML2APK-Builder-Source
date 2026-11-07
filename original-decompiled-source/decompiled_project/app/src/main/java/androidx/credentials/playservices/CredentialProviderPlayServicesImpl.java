package androidx.credentials.playservices;

import android.content.Context;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.createrestorecredential.CredentialProviderCreateRestoreCredentialController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import androidx.credentials.playservices.controllers.identityauth.beginsignin.CredentialProviderBeginSignInController;
import androidx.credentials.playservices.controllers.identityauth.createpassword.CredentialProviderCreatePasswordController;
import androidx.credentials.playservices.controllers.identityauth.createpublickeycredential.CredentialProviderCreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.CreateDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpasswordcredential.CreatePasswordCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.createpublickeycredential.CreatePublicKeyCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getcredential.GetCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.getdigitalcredential.CredentialProviderGetDigitalCredentialController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.a1;
import d4.c1;
import d4.e1;
import d4.h1;
import d4.i1;
import d4.x0;
import d4.y0;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderPlayServicesImpl implements d4.w {
    public static final Companion Companion = new Companion(null);
    public static final int MIN_GMS_APK_VERSION = 230815045;
    public static final int MIN_GMS_APK_VERSION_DIGITAL_CRED = 243100000;
    public static final int MIN_GMS_APK_VERSION_RESTORE_CRED = 242200000;
    public static final int MIN_GMS_APK_VERSION_SIGNAL_API = 254625000;
    public static final int PRE_U_MIN_GMS_APK_VERSION = 252400000;
    private static final String TAG = "PlayServicesImpl";
    private final Context context;
    private pa.d googleApiAvailability;

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.j jVar) {
            this();
        }

        public final boolean cancellationReviewer$credentials_play_services_auth(CancellationSignal cancellationSignal) {
            if (cancellationSignal == null) {
                Log.i(CredentialProviderPlayServicesImpl.TAG, "No cancellationSignal found");
                return false;
            }
            if (!cancellationSignal.isCanceled()) {
                return false;
            }
            Log.i(CredentialProviderPlayServicesImpl.TAG, "the flow has been canceled");
            return true;
        }

        public final void cancellationReviewerWithCallback$credentials_play_services_auth(CancellationSignal cancellationSignal, eh.a<f0> callback) {
            kotlin.jvm.internal.r.e(callback, "callback");
            if (cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            callback.invoke();
        }

        public final boolean isDigitalCredentialRequest$credentials_play_services_auth(x0 request) {
            kotlin.jvm.internal.r.e(request, "request");
            Iterator<d4.v> it = request.f7366a.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof a1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetRestoreCredentialRequest$credentials_play_services_auth(x0 request) {
            kotlin.jvm.internal.r.e(request, "request");
            Iterator<d4.v> it = request.f7366a.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof c1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isGetSignInIntentRequest$credentials_play_services_auth(x0 request) {
            kotlin.jvm.internal.r.e(request, "request");
            Iterator<d4.v> it = request.f7366a.iterator();
            while (it.hasNext()) {
                if (it.next() instanceof lb.b) {
                    return true;
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public CredentialProviderPlayServicesImpl(Context context) {
        kotlin.jvm.internal.r.e(context, "context");
        this.context = context;
        pa.d dVar = pa.d.f21387d;
        kotlin.jvm.internal.r.d(dVar, "getInstance(...)");
        this.googleApiAvailability = dVar;
    }

    public static /* synthetic */ void getGoogleApiAvailability$annotations() {
    }

    private final int isGooglePlayServicesAvailable(Context context, int i10) {
        return this.googleApiAvailability.c(context, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onClearCredential$lambda$0(Executor executor, final d4.t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.u
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$0$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$0$0(d4.t tVar) {
        tVar.a(new e4.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onClearCredential$lambda$1(CancellationSignal cancellationSignal, Executor executor, d4.t tVar, Boolean bool) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new p(0, executor, tVar));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onClearCredential$lambda$1$0(Executor executor, final d4.t tVar) {
        Log.i(TAG, "Cleared restore credential successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.y
            @Override // java.lang.Runnable
            public final void run() {
                tVar.onResult(null);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, e4.c] */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, e4.c] */
    public static final void onClearCredential$lambda$3(CancellationSignal cancellationSignal, final Executor executor, final d4.t tVar, Exception e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        Log.w(TAG, "Clearing restore credential failed", e10);
        final g0 g0Var = new g0();
        g0Var.f16327a = new e4.c("Clear restore credential failed for unknown reason.");
        if ((e10 instanceof com.google.android.gms.common.api.b) && ((com.google.android.gms.common.api.b) e10).getStatusCode() == 40201) {
            g0Var.f16327a = new e4.c("The restore credential internal service had a failure.");
        }
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.w
            @Override // eh.a
            public final Object invoke() {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0(executor, tVar, g0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onClearCredential$lambda$3$0(Executor executor, final d4.t tVar, final g0 g0Var) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.v
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$3$0$0(tVar, g0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$3$0$0(d4.t tVar, g0 g0Var) {
        tVar.a(g0Var.f16327a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onClearCredential$lambda$4(CancellationSignal cancellationSignal, Executor executor, d4.t tVar, fb.e eVar) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new m(0, executor, tVar));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onClearCredential$lambda$4$0(Executor executor, d4.t tVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new k(tVar, 0));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onClearCredential$lambda$6(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, d4.a aVar, CancellationSignal cancellationSignal, Executor executor, d4.t tVar, Exception it) {
        kotlin.jvm.internal.r.e(it, "it");
        Log.e(TAG, "GMS Clear credential flow failed, calling fallback");
        credentialProviderPlayServicesImpl.runFallbackClearCredFlow(aVar, cancellationSignal, executor, tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onCreateCredential$lambda$0(Executor executor, final d4.t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.x
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreateCredential$lambda$0$0(d4.t tVar) {
        tVar.a(new e4.j("createCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onGetCredential$lambda$0(Executor executor, final d4.t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.i
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$0$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$0$0(d4.t tVar) {
        tVar.a(new e4.q("this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 onGetCredential$lambda$1(Executor executor, final d4.t tVar) {
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.h
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.onGetCredential$lambda$1$0(tVar);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onGetCredential$lambda$1$0(d4.t tVar) {
        tVar.a(new e4.q("getCredentialAsync no provider dependencies found - please ensure the desired provider dependencies are added"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSignalCredentialState$lambda$0(d4.t tVar) {
        tVar.a(new g4.g("androidx.credentials.SignalCredentialStateException.TYPE_PROVIDER_CONFIGURATION", "this device requires a Google Play Services update for the given feature to be supported"));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.credentials.playservices.q] */
    private final void runFallbackClearCredFlow(d4.a aVar, final CancellationSignal cancellationSignal, final Executor executor, final d4.t<Void, e4.a> tVar) {
        Task<Void> taskSignOut = ga.g.b(this.context).signOut();
        final ?? r02 = new eh.l() { // from class: androidx.credentials.playservices.q
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$0(cancellationSignal, executor, tVar, (Void) obj);
            }
        };
        taskSignOut.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.r
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.s
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2(this.f1742a, cancellationSignal, executor, tVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 runFallbackClearCredFlow$lambda$0(CancellationSignal cancellationSignal, Executor executor, d4.t tVar, Void r52) {
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new o(0, executor, tVar));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 runFallbackClearCredFlow$lambda$0$0(Executor executor, final d4.t tVar) {
        Log.i(TAG, "During clear credential, signed out successfully!");
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.z
            @Override // java.lang.Runnable
            public final void run() {
                tVar.onResult(null);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2(CredentialProviderPlayServicesImpl credentialProviderPlayServicesImpl, CancellationSignal cancellationSignal, Executor executor, d4.t tVar, Exception e10) {
        kotlin.jvm.internal.r.e(e10, "e");
        Companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new g(e10, executor, tVar, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 runFallbackClearCredFlow$lambda$2$0$0(final Exception exc, Executor executor, final d4.t tVar) {
        Log.w(TAG, "During clear credential sign out failed with " + exc);
        executor.execute(new Runnable() { // from class: androidx.credentials.playservices.j
            @Override // java.lang.Runnable
            public final void run() {
                CredentialProviderPlayServicesImpl.runFallbackClearCredFlow$lambda$2$0$0$0(tVar, exc);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runFallbackClearCredFlow$lambda$2$0$0$0(d4.t tVar, Exception exc) {
        tVar.a(new e4.c(exc.getMessage()));
    }

    public final pa.d getGoogleApiAvailability() {
        return this.googleApiAvailability;
    }

    @Override // d4.w
    public boolean isAvailableOnDevice() {
        return isAvailableOnDevice(MIN_GMS_APK_VERSION);
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.credentials.playservices.b0] */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.credentials.playservices.d] */
    @Override // d4.w
    public void onClearCredential(final d4.a request, final CancellationSignal cancellationSignal, final Executor executor, final d4.t<Void, e4.a> callback) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(callback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (request.f7350a.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            if (!isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.a0
                    @Override // eh.a
                    public final Object invoke() {
                        return CredentialProviderPlayServicesImpl.onClearCredential$lambda$0(executor, callback);
                    }
                });
                return;
            }
            na.h hVarB = b8.n.b(this.context);
            ma.a aVar = new ma.a(request.f7351b);
            u.a aVarA = com.google.android.gms.common.api.internal.u.a();
            aVarA.f6058c = new pa.c[]{zzab.zzi};
            na.e eVar = new na.e();
            eVar.f18648a = aVar;
            aVarA.f6056a = eVar;
            aVarA.f6059d = 1694;
            Task<TResult> taskDoRead = hVarB.doRead(aVarA.a());
            kotlin.jvm.internal.r.d(taskDoRead, "doRead(...)");
            final ?? r02 = new eh.l() { // from class: androidx.credentials.playservices.b0
                @Override // eh.l
                public final Object invoke(Object obj) {
                    return CredentialProviderPlayServicesImpl.onClearCredential$lambda$1(cancellationSignal, executor, callback, (Boolean) obj);
                }
            };
            kotlin.jvm.internal.r.b(taskDoRead.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.b
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    invoke(obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.c
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    CredentialProviderPlayServicesImpl.onClearCredential$lambda$3(cancellationSignal, executor, callback, exc);
                }
            }));
            return;
        }
        if (!isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            runFallbackClearCredFlow(request, cancellationSignal, executor, callback);
            return;
        }
        Context context = this.context;
        kotlin.jvm.internal.r.e(context, "context");
        gb.e eVar2 = new gb.e(context, gb.e.f11907a, a.d.f5917i, g.a.f5924c);
        fb.c cVar = new fb.c();
        u.a aVarA2 = com.google.android.gms.common.api.internal.u.a();
        aVarA2.f6058c = new pa.c[]{zze.zze};
        aVarA2.f6056a = new gb.i(cVar);
        aVarA2.f6059d = 32708;
        Task<TResult> taskDoWrite = eVar2.doWrite(aVarA2.a());
        kotlin.jvm.internal.r.d(taskDoWrite, "doWrite(...)");
        final ?? r12 = new eh.l() { // from class: androidx.credentials.playservices.d
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderPlayServicesImpl.onClearCredential$lambda$4(cancellationSignal, executor, callback, (fb.e) obj);
            }
        };
        kotlin.jvm.internal.r.b(taskDoWrite.addOnSuccessListener(new OnSuccessListener() { // from class: androidx.credentials.playservices.e
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: androidx.credentials.playservices.f
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                CredentialProviderPlayServicesImpl.onClearCredential$lambda$6(this.f1710a, request, cancellationSignal, executor, callback, exc);
            }
        }));
    }

    public void onCreateCredential(Context context, d4.b request, CancellationSignal cancellationSignal, final Executor executor, final d4.t<d4.c, e4.g> callback) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(callback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (request instanceof d4.g) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePasswordCredentialController.Companion.getInstance(context).invokePlayServices((d4.g) request, callback, executor, cancellationSignal);
                return;
            } else {
                CredentialProviderCreatePasswordController.Companion.getInstance(context).invokePlayServices((d4.g) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (request instanceof d4.i) {
            if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
                CreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((d4.i) request, callback, executor, cancellationSignal);
                return;
            } else {
                CredentialProviderCreatePublicKeyCredentialController.Companion.getInstance(context).invokePlayServices((d4.i) request, callback, executor, cancellationSignal);
                return;
            }
        }
        if (!(request instanceof d4.k)) {
            if (!(request instanceof d4.e)) {
                throw new UnsupportedOperationException("Create Credential request is unsupported, not password or publickeycredential");
            }
            new CreateDigitalCredentialController(context).invokePlayServices((d4.e) request, callback, executor, cancellationSignal);
        } else if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
            new CredentialProviderCreateRestoreCredentialController(context).invokePlayServices((d4.k) request, callback, executor, cancellationSignal);
        } else {
            companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new eh.a() { // from class: androidx.credentials.playservices.t
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderPlayServicesImpl.onCreateCredential$lambda$0(executor, callback);
                }
            });
        }
    }

    public void onGetCredential(Context context, e1 pendingGetCredentialHandle, CancellationSignal cancellationSignal, Executor executor, d4.t callback) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(pendingGetCredentialHandle, "pendingGetCredentialHandle");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(callback, "callback");
    }

    public void onPrepareCredential(x0 request, CancellationSignal cancellationSignal, Executor executor, d4.t callback) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(callback, "callback");
    }

    public void onSignalCredentialState(h1 request, Executor executor, final d4.t<i1, g4.f> callback) {
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(callback, "callback");
        if (isAvailableOnDevice(MIN_GMS_APK_VERSION_SIGNAL_API)) {
            CredentialProviderController.invokePlayServices$default(SignalCredentialStateController.Companion.getInstance(this.context), request, callback, executor, null, 8, null);
        } else {
            executor.execute(new Runnable() { // from class: androidx.credentials.playservices.n
                @Override // java.lang.Runnable
                public final void run() {
                    CredentialProviderPlayServicesImpl.onSignalCredentialState$lambda$0(callback);
                }
            });
        }
    }

    public final void setGoogleApiAvailability(pa.d dVar) {
        kotlin.jvm.internal.r.e(dVar, "<set-?>");
        this.googleApiAvailability = dVar;
    }

    public final boolean isAvailableOnDevice(int i10) {
        int iIsGooglePlayServicesAvailable = isGooglePlayServicesAvailable(this.context, i10);
        boolean z10 = iIsGooglePlayServicesAvailable == 0;
        if (!z10) {
            Log.w(TAG, "Connection with Google Play Services was not successful. Connection result is: " + new pa.a(iIsGooglePlayServicesAvailable));
        }
        return z10;
    }

    @Override // d4.w
    public void onGetCredential(Context context, x0 request, CancellationSignal cancellationSignal, Executor executor, d4.t<y0, e4.o> callback) {
        kotlin.jvm.internal.r.e(context, "context");
        kotlin.jvm.internal.r.e(request, "request");
        kotlin.jvm.internal.r.e(executor, "executor");
        kotlin.jvm.internal.r.e(callback, "callback");
        Companion companion = Companion;
        if (companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        if (companion.isDigitalCredentialRequest$credentials_play_services_auth(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_DIGITAL_CRED)) {
                new CredentialProviderGetDigitalCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new a(0, executor, callback));
                return;
            }
        }
        if (companion.isGetRestoreCredentialRequest$credentials_play_services_auth(request)) {
            if (isAvailableOnDevice(MIN_GMS_APK_VERSION_RESTORE_CRED)) {
                new CredentialProviderGetRestoreCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
                return;
            } else {
                companion.cancellationReviewerWithCallback$credentials_play_services_auth(cancellationSignal, new l(0, executor, callback));
                return;
            }
        }
        if (isAvailableOnDevice(PRE_U_MIN_GMS_APK_VERSION)) {
            new GetCredentialController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else if (companion.isGetSignInIntentRequest$credentials_play_services_auth(request)) {
            new CredentialProviderGetSignInIntentController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        } else {
            new CredentialProviderBeginSignInController(context).invokePlayServices(request, callback, executor, cancellationSignal);
        }
    }
}
