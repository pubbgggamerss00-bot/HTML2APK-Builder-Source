package androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate;

import android.content.Context;
import android.os.CancellationSignal;
import android.os.RemoteException;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.identitycredentials.signalcredentialstate.SignalCredentialStateController;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.identity_credentials.zze;
import com.google.android.gms.internal.identity_credentials.zzh;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d4.h1;
import d4.i1;
import d4.t;
import eh.l;
import fb.o0;
import fb.q0;
import g4.e;
import g4.f;
import g4.h;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.r;
import mh.g;
import mh.i;
import mh.m;
import mh.s;
import mh.x;
import pa.c;
import pg.f0;

/* loaded from: classes.dex */
public final class SignalCredentialStateController extends CredentialProviderController<h1, o0, q0, i1, f> {
    public static final Companion Companion = new Companion(null);
    public static final long MAX_RETRY_TIME = 600000;
    public static final String RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER = "called too frequently";
    public static final String SIGNAL_REQUEST_JSON_KEY = "androidx.credentials.signal_request_json_key";
    private final Context context;

    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        public final SignalCredentialStateController getInstance(Context context) {
            r.e(context, "context");
            return new SignalCredentialStateController(context);
        }

        public final long parseRefillMinutesRegex(String str) {
            g gVarE;
            Integer numG;
            if (str == null) {
                return SignalCredentialStateController.MAX_RETRY_TIME;
            }
            Pattern patternCompile = Pattern.compile("^SignalCredentialState has been called too frequently\\. Please retry later after (\\d+) minutes\\.$");
            r.d(patternCompile, "compile(...)");
            Matcher matcher = patternCompile.matcher(str);
            r.d(matcher, "matcher(...)");
            i iVarA = m.a(matcher, 0, str);
            return (iVarA == null || (gVarE = iVarA.f18268c.e(1)) == null || (numG = s.g(gVarE.f18264a)) == null) ? SignalCredentialStateController.MAX_RETRY_TIME : numG.intValue();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignalCredentialStateController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
    }

    public static final SignalCredentialStateController getInstance(Context context) {
        return Companion.getInstance(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(Executor executor, SignalCredentialStateController signalCredentialStateController, final t tVar, q0 q0Var) {
        if (q0Var == null) {
            executor.execute(new Runnable() { // from class: m4.e
                @Override // java.lang.Runnable
                public final void run() {
                    SignalCredentialStateController.invokePlayServices$lambda$0$0(tVar);
                }
            });
            return f0.f21461a;
        }
        final i1 i1VarConvertResponseToCredentialManager = signalCredentialStateController.convertResponseToCredentialManager(q0Var);
        executor.execute(new Runnable() { // from class: m4.f
            @Override // java.lang.Runnable
            public final void run() {
                tVar.onResult(i1VarConvertResponseToCredentialManager);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$0(t tVar) {
        int i10 = f.f11470a;
        tVar.a(new h("androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN", "No SignalCredentialStateResponse received"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, g4.f] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, g4.f] */
    public static final void invokePlayServices$lambda$2(Executor executor, final t tVar, Exception e10) {
        String message;
        r.e(e10, "e");
        final g0 g0Var = new g0();
        int i10 = f.f11470a;
        g0Var.f16327a = new h("androidx.credentials.SignalCredentialStateException.TYPE_UNKNOWN", e10.getMessage());
        if ((e10 instanceof b) && ((b) e10).getStatusCode() == 16 && (message = e10.getMessage()) != null && x.r(message, RATE_LIMIT_EXCEPTION_MESSAGE_MATCHER, false)) {
            Companion.parseRefillMinutesRegex(e10.getMessage());
            g0Var.f16327a = new e("androidx.credentials.SignalCredentialStateException.RATE_LIMIT_EXCEEDED", e10.getMessage());
        }
        executor.execute(new Runnable() { // from class: m4.a
            @Override // java.lang.Runnable
            public final void run() {
                SignalCredentialStateController.invokePlayServices$lambda$2$0(tVar, g0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0(t tVar, g0 g0Var) {
        tVar.a(g0Var.f16327a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public o0 convertRequestToPlayServices(h1 request) {
        r.e(request, "request");
        new o0(null, null, null);
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public i1 convertResponseToCredentialManager(q0 response) {
        r.e(response, "response");
        return new i1();
    }

    /* JADX WARN: Type inference failed for: r9v4, types: [m4.b] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(h1 request, final t<i1, f> callback, final Executor executor, CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        final o0 request2 = convertRequestToPlayServices(request);
        Context context = this.context;
        r.e(context, "context");
        gb.e eVar = new gb.e(context, gb.e.f11907a, a.d.f5917i, g.a.f5924c);
        r.e(request2, "request");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zze.zzj};
        aVarA.f6056a = new q() { // from class: gb.j
            @Override // com.google.android.gms.common.api.internal.q
            public final void accept(Object obj, Object obj2) throws RemoteException {
                d dVar = (d) obj;
                g gVar = new g((TaskCompletionSource) obj2);
                ((b) dVar.getService()).w(gVar, request2, zzh.zza(dVar.getContext()));
            }
        };
        aVarA.f6059d = 32709;
        Task<TResult> taskDoWrite = eVar.doWrite(aVarA.a());
        r.d(taskDoWrite, "doWrite(...)");
        final ?? r92 = new l() { // from class: m4.b
            @Override // eh.l
            public final Object invoke(Object obj) {
                return SignalCredentialStateController.invokePlayServices$lambda$0(executor, this, callback, (q0) obj);
            }
        };
        taskDoWrite.addOnSuccessListener(new OnSuccessListener() { // from class: m4.c
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: m4.d
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                SignalCredentialStateController.invokePlayServices$lambda$2(executor, callback, exc);
            }
        });
    }
}
