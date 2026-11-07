package androidx.credentials.playservices.controllers;

import ad.b;
import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import d4.t;
import e4.e;
import e4.g;
import e4.k;
import e4.m;
import e4.o;
import eh.a;
import eh.l;
import eh.p;
import f9.m6;
import j4.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public abstract class CredentialProviderController<T1, T2, R2, R1, E1> extends CredentialProviderBaseController {
    public static final Companion Companion = new Companion(null);
    public static final String ERROR_MESSAGE_START_ACTIVITY_FAILED = "Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.";
    private final Context context;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 maybeReportErrorResultCodeCreate$lambda$0(l lVar, g0 g0Var) {
            lVar.invoke(g0Var.f16327a);
            return f0.f21461a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 maybeReportErrorResultCodeGet$lambda$0(l lVar, g0 g0Var) {
            lVar.invoke(g0Var.f16327a);
            return f0.f21461a;
        }

        public final void cancelOrCallbackExceptionOrResult$credentials_play_services_auth(CancellationSignal cancellationSignal, a<f0> onResultOrException) {
            r.e(onResultOrException, "onResultOrException");
            if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
                return;
            }
            onResultOrException.invoke();
        }

        public final String generateErrorStringCanceled$credentials_play_services_auth() {
            return "activity is cancelled by the user.";
        }

        public final String generateErrorStringUnknown$credentials_play_services_auth(int i10) {
            return b.b(i10, "activity with result code: ", " indicating not RESULT_OK");
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, e4.k] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, e4.e] */
        public final boolean maybeReportErrorResultCodeCreate(int i10, p<? super CancellationSignal, ? super a<f0>, f0> cancelOnError, l<? super g, f0> onError, CancellationSignal cancellationSignal) {
            r.e(cancelOnError, "cancelOnError");
            r.e(onError, "onError");
            if (i10 == -1) {
                return false;
            }
            g0 g0Var = new g0();
            g0Var.f16327a = new k(generateErrorStringUnknown$credentials_play_services_auth(i10));
            if (i10 == 0) {
                g0Var.f16327a = new e(generateErrorStringCanceled$credentials_play_services_auth());
            }
            cancelOnError.invoke(cancellationSignal, new c(0, onError, g0Var));
            return true;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [T, e4.r] */
        /* JADX WARN: Type inference failed for: r4v4, types: [T, e4.m] */
        public final boolean maybeReportErrorResultCodeGet$credentials_play_services_auth(int i10, p<? super CancellationSignal, ? super a<f0>, f0> cancelOnError, l<? super o, f0> onError, CancellationSignal cancellationSignal) {
            r.e(cancelOnError, "cancelOnError");
            r.e(onError, "onError");
            if (i10 == -1) {
                return false;
            }
            g0 g0Var = new g0();
            g0Var.f16327a = new e4.r(generateErrorStringUnknown$credentials_play_services_auth(i10));
            if (i10 == 0) {
                g0Var.f16327a = new m(generateErrorStringCanceled$credentials_play_services_auth());
            }
            cancelOnError.invoke(cancellationSignal, new m6(1, onError, g0Var));
            return true;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
    }

    public static /* synthetic */ void invokePlayServices$default(CredentialProviderController credentialProviderController, Object obj, t tVar, Executor executor, CancellationSignal cancellationSignal, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokePlayServices");
        }
        if ((i10 & 8) != 0) {
            cancellationSignal = null;
        }
        credentialProviderController.invokePlayServices(obj, tVar, executor, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 maybeReportErrorFromResultReceiver$lambda$0(Executor executor, final t tVar, final Object obj) {
        executor.execute(new Runnable() { // from class: j4.a
            @Override // java.lang.Runnable
            public final void run() {
                tVar.a(obj);
            }
        });
        return f0.f21461a;
    }

    public static final boolean maybeReportErrorResultCodeCreate(int i10, p<? super CancellationSignal, ? super a<f0>, f0> pVar, l<? super g, f0> lVar, CancellationSignal cancellationSignal) {
        return Companion.maybeReportErrorResultCodeCreate(i10, pVar, lVar, cancellationSignal);
    }

    public abstract T2 convertRequestToPlayServices(T1 t12);

    public abstract R1 convertResponseToCredentialManager(R2 r22);

    public abstract void invokePlayServices(T1 t12, t<R1, E1> tVar, Executor executor, CancellationSignal cancellationSignal);

    public final boolean maybeReportErrorFromResultReceiver(Bundle resultData, p<? super String, ? super String, ? extends E1> conversionFn, final Executor executor, final t<R1, E1> callback, CancellationSignal cancellationSignal) {
        r.e(resultData, "resultData");
        r.e(conversionFn, "conversionFn");
        r.e(executor, "executor");
        r.e(callback, "callback");
        if (!resultData.getBoolean(CredentialProviderBaseController.FAILURE_RESPONSE_TAG)) {
            return false;
        }
        final E1 e1Invoke = conversionFn.invoke(resultData.getString(CredentialProviderBaseController.EXCEPTION_TYPE_TAG), resultData.getString(CredentialProviderBaseController.EXCEPTION_MESSAGE_TAG));
        Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: j4.b
            @Override // eh.a
            public final Object invoke() {
                return CredentialProviderController.maybeReportErrorFromResultReceiver$lambda$0(executor, callback, e1Invoke);
            }
        });
        return true;
    }
}
