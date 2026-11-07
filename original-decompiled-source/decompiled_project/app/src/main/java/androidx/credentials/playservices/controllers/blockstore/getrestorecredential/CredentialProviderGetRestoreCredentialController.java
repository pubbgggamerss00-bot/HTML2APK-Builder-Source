package androidx.credentials.playservices.controllers.blockstore.getrestorecredential;

import android.content.Context;
import android.os.CancellationSignal;
import androidx.credentials.playservices.CredentialProviderPlayServicesImpl;
import androidx.credentials.playservices.controllers.CredentialProviderController;
import androidx.credentials.playservices.controllers.blockstore.getrestorecredential.CredentialProviderGetRestoreCredentialController;
import b8.n;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.auth_blockstore.zzab;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import d4.c1;
import d4.m;
import d4.t;
import d4.v;
import d4.x0;
import d4.y0;
import e4.o;
import eh.a;
import eh.l;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import l4.e;
import ma.g;
import ma.i;
import na.h;
import pa.c;
import pg.f0;

/* loaded from: classes.dex */
public final class CredentialProviderGetRestoreCredentialController extends CredentialProviderController<x0, g, i, y0, o> {
    private final Context context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CredentialProviderGetRestoreCredentialController(Context context) {
        super(context);
        r.e(context, "context");
        this.context = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0(CredentialProviderGetRestoreCredentialController credentialProviderGetRestoreCredentialController, CancellationSignal cancellationSignal, final Executor executor, final t tVar, i iVar) {
        try {
            r.b(iVar);
            final y0 y0VarConvertResponseToCredentialManager = credentialProviderGetRestoreCredentialController.convertResponseToCredentialManager(iVar);
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: l4.f
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$0(executor, tVar, y0VarConvertResponseToCredentialManager);
                }
            });
        } catch (Exception e10) {
            CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: l4.g
                @Override // eh.a
                public final Object invoke() {
                    return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0$1(executor, tVar, e10);
                }
            });
        }
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$0(Executor executor, final t tVar, final y0 y0Var) {
        executor.execute(new Runnable() { // from class: l4.d
            @Override // java.lang.Runnable
            public final void run() {
                tVar.onResult(y0Var);
            }
        });
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$0$1(Executor executor, t tVar, Exception exc) {
        executor.execute(new l4.i(0, tVar, exc));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$0$1$0(t tVar, Exception exc) {
        tVar.a(exc instanceof e4.t ? (o) exc : new e4.r(exc.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, e4.r] */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, e4.r] */
    /* JADX WARN: Type inference failed for: r2v3, types: [T, e4.r] */
    public static final void invokePlayServices$lambda$2(CancellationSignal cancellationSignal, final Executor executor, final t tVar, Exception e10) {
        r.e(e10, "e");
        final g0 g0Var = new g0();
        g0Var.f16327a = new e4.r(k4.i.a(e10, new StringBuilder("Get restore credential failed for unknown reason, failure: ")));
        if (e10 instanceof b) {
            b bVar = (b) e10;
            if (bVar.getStatusCode() == 40201) {
                g0Var.f16327a = new e4.r(k4.i.a(e10, new StringBuilder("The restore credential internal service had a failure, failure: ")));
            } else {
                g0Var.f16327a = new e4.r("The restore credential service failed with unsupported status code, failure: " + e10.getMessage() + ", status code: " + bVar.getStatusCode());
            }
        }
        CredentialProviderController.Companion.cancelOrCallbackExceptionOrResult$credentials_play_services_auth(cancellationSignal, new a() { // from class: l4.h
            @Override // eh.a
            public final Object invoke() {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$2$0(executor, tVar, g0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f0 invokePlayServices$lambda$2$0(Executor executor, t tVar, g0 g0Var) {
        executor.execute(new e(0, tVar, g0Var));
        return f0.f21461a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokePlayServices$lambda$2$0$0(t tVar, g0 g0Var) {
        tVar.a(g0Var.f16327a);
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public g convertRequestToPlayServices(x0 request) {
        r.e(request, "request");
        Iterator<v> it = request.f7366a.iterator();
        while (it.hasNext() && !(it.next() instanceof c1)) {
        }
        r.h("credentialOption");
        throw null;
    }

    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public y0 convertResponseToCredentialManager(i response) {
        r.e(response, "response");
        return new y0(m.a.a(response.f18026a, "androidx.credentials.TYPE_RESTORE_CREDENTIAL"));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [l4.a] */
    @Override // androidx.credentials.playservices.controllers.CredentialProviderController
    public void invokePlayServices(x0 request, final t<y0, o> callback, final Executor executor, final CancellationSignal cancellationSignal) {
        r.e(request, "request");
        r.e(callback, "callback");
        r.e(executor, "executor");
        if (CredentialProviderPlayServicesImpl.Companion.cancellationReviewer$credentials_play_services_auth(cancellationSignal)) {
            return;
        }
        g request2 = convertRequestToPlayServices(request);
        h hVarB = n.b(this.context);
        r.e(request2, "request");
        u.a aVarA = u.a();
        aVarA.f6058c = new c[]{zzab.zzk};
        na.g gVar = new na.g();
        gVar.f18650a = request2;
        aVarA.f6056a = gVar;
        aVarA.f6059d = 1695;
        Task<TResult> taskDoRead = hVarB.doRead(aVarA.a());
        r.d(taskDoRead, "doRead(...)");
        final ?? r02 = new l() { // from class: l4.a
            @Override // eh.l
            public final Object invoke(Object obj) {
                return CredentialProviderGetRestoreCredentialController.invokePlayServices$lambda$0(this.f16700a, cancellationSignal, executor, callback, (ma.i) obj);
            }
        };
        taskDoRead.addOnSuccessListener(new OnSuccessListener() { // from class: l4.b
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                invoke(obj);
            }
        }).addOnFailureListener(new l4.c(cancellationSignal, executor, callback));
    }
}
