package androidx.credentials.playservices.controllers;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.ResponseUtils;
import d4.m;
import d4.t;
import d4.y0;
import e4.o;
import eh.a;
import eh.l;
import i4.b;
import j4.g;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import pg.f0;

/* loaded from: classes.dex */
public final class ResponseUtils {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "GetCredentialController";

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 handleGetCredentialResponse$lambda$0(CancellationSignal cancellationSignal, a f10) {
            r.e(f10, "f");
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, f10);
            return f0.f21461a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 handleGetCredentialResponse$lambda$1(Executor executor, final t tVar, final o e10) {
            r.e(e10, "e");
            executor.execute(new Runnable() { // from class: j4.e
                @Override // java.lang.Runnable
                public final void run() {
                    tVar.a(e10);
                }
            });
            return f0.f21461a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 handleGetCredentialResponse$lambda$2(Executor executor, final t tVar) {
            executor.execute(new Runnable() { // from class: j4.f
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$2$0(tVar);
                }
            });
            return f0.f21461a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$2$0(t tVar) {
            tVar.a(new e4.r("No provider data returned."));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 handleGetCredentialResponse$lambda$3(Executor executor, final t tVar, final y0 y0Var) {
            executor.execute(new Runnable() { // from class: j4.d
                @Override // java.lang.Runnable
                public final void run() {
                    tVar.onResult(y0Var);
                }
            });
            return f0.f21461a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f0 handleGetCredentialResponse$lambda$4(Executor executor, final t tVar, final o oVar) {
            executor.execute(new Runnable() { // from class: j4.l
                @Override // java.lang.Runnable
                public final void run() {
                    ResponseUtils.Companion.handleGetCredentialResponse$lambda$4$0(tVar, oVar);
                }
            });
            return f0.f21461a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void handleGetCredentialResponse$lambda$4$0(t tVar, o oVar) {
            if (oVar == null) {
                oVar = new e4.r("No provider data returned");
            }
            tVar.a(oVar);
        }

        public final void handleGetCredentialResponse(int i10, int i11, Intent intent, final Executor executor, final t<y0, o> callback, CancellationSignal cancellationSignal) throws b {
            String string;
            Bundle bundle;
            final y0 y0Var;
            r.e(executor, "executor");
            r.e(callback, "callback");
            CredentialProviderBaseController.Companion companion = CredentialProviderBaseController.Companion;
            if (i10 != companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth()) {
                Log.w(ResponseUtils.TAG, "Returned request code " + companion.getCONTROLLER_REQUEST_CODE$credentials_play_services_auth() + " which  does not match what was given " + i10);
                return;
            }
            CredentialProviderController.Companion companion2 = CredentialProviderController.Companion;
            if (companion2.maybeReportErrorResultCodeGet$credentials_play_services_auth(i11, new g(), new l() { // from class: j4.h
                @Override // eh.l
                public final Object invoke(Object obj) {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$1(executor, callback, (o) obj);
                }
            }, cancellationSignal)) {
                return;
            }
            if (intent == null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: j4.i
                    @Override // eh.a
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$2(executor, callback);
                    }
                });
                return;
            }
            int i12 = Build.VERSION.SDK_INT;
            final o oVarB = null;
            if (i12 >= 34) {
                y0Var = n4.a.d(intent);
            } else {
                Bundle bundleExtra = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_RESPONSE");
                y0Var = (bundleExtra == null || (string = bundleExtra.getString("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_TYPE")) == null || (bundle = bundleExtra.getBundle("androidx.credentials.provider.extra.EXTRA_CREDENTIAL_DATA")) == null) ? null : new y0(m.a.a(bundle, string));
            }
            if (y0Var != null) {
                companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: j4.j
                    @Override // eh.a
                    public final Object invoke() {
                        return ResponseUtils.Companion.handleGetCredentialResponse$lambda$3(executor, callback, y0Var);
                    }
                });
                return;
            }
            if (i12 >= 34) {
                oVarB = n4.a.c(intent);
            } else {
                int i13 = o.f8386b;
                Bundle bundleExtra2 = intent.getBundleExtra("android.service.credentials.extra.GET_CREDENTIAL_EXCEPTION");
                if (bundleExtra2 != null) {
                    String string2 = bundleExtra2.getString("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_TYPE");
                    if (string2 == null) {
                        throw new IllegalArgumentException("Bundle was missing exception type.");
                    }
                    oVarB = i4.a.b(bundleExtra2.getCharSequence("androidx.credentials.provider.extra.CREATE_CREDENTIAL_EXCEPTION_MESSAGE"), string2);
                }
            }
            companion2.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: j4.k
                @Override // eh.a
                public final Object invoke() {
                    return ResponseUtils.Companion.handleGetCredentialResponse$lambda$4(executor, callback, oVarB);
                }
            });
        }

        private Companion() {
        }
    }

    public static final void handleGetCredentialResponse(int i10, int i11, Intent intent, Executor executor, t<y0, o> tVar, CancellationSignal cancellationSignal) throws b {
        Companion.handleGetCredentialResponse(i10, i11, intent, executor, tVar, cancellationSignal);
    }
}
