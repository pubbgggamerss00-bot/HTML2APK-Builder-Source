package ld;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.l1;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ld.p;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class i extends kd.d {

    /* renamed from: a, reason: collision with root package name */
    public final id.e f16988a;

    /* renamed from: b, reason: collision with root package name */
    public final fe.b<ce.h> f16989b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f16990c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f16991d;

    /* renamed from: e, reason: collision with root package name */
    public final p f16992e;

    /* renamed from: f, reason: collision with root package name */
    public final r f16993f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f16994g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f16995h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f16996i;

    /* renamed from: j, reason: collision with root package name */
    public final Task<Void> f16997j;

    /* renamed from: k, reason: collision with root package name */
    public final l1 f16998k;

    /* renamed from: l, reason: collision with root package name */
    public kd.a f16999l;

    /* renamed from: m, reason: collision with root package name */
    public kd.b f17000m;

    /* renamed from: n, reason: collision with root package name */
    public Task<kd.b> f17001n;

    public i(id.e eVar, fe.b<ce.h> bVar, Executor executor, Executor executor2, Executor executor3, ScheduledExecutorService scheduledExecutorService) {
        com.google.android.gms.common.internal.p.f(eVar);
        com.google.android.gms.common.internal.p.f(bVar);
        this.f16988a = eVar;
        this.f16989b = bVar;
        this.f16990c = new ArrayList();
        this.f16991d = new ArrayList();
        eVar.a();
        final Context context = eVar.f14480a;
        String strF = eVar.f();
        p pVar = new p();
        com.google.android.gms.common.internal.p.f(context);
        com.google.android.gms.common.internal.p.d(strF);
        final String str = "com.google.firebase.appcheck.store." + strF;
        pVar.f17019a = new sd.q<>(new fe.b() { // from class: ld.o
            @Override // fe.b
            public final Object get() {
                return context.getSharedPreferences(str, 0);
            }
        });
        this.f16992e = pVar;
        eVar.a();
        this.f16993f = new r(context, this, executor2, scheduledExecutorService);
        this.f16994g = executor;
        this.f16995h = executor2;
        this.f16996i = executor3;
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        executor3.execute(new Runnable() { // from class: ld.e
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v1, types: [sd.q, sd.q<android.content.SharedPreferences>] */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v13 */
            /* JADX WARN: Type inference failed for: r1v2 */
            /* JADX WARN: Type inference failed for: r1v3, types: [sd.q] */
            /* JADX WARN: Type inference failed for: r1v9, types: [kd.b] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0048 -> B:11:0x003a). Please report as a decompilation issue!!! */
            @Override // java.lang.Runnable
            public final void run() throws JSONException {
                int iOrdinal;
                i iVar = this.f16984a;
                p pVar2 = iVar.f16992e;
                String str2 = p.f17018b.f18165a;
                ?? D = pVar2.f17019a;
                String string = ((SharedPreferences) D.get()).getString("com.google.firebase.appcheck.TOKEN_TYPE", null);
                String string2 = ((SharedPreferences) D.get()).getString("com.google.firebase.appcheck.APP_CHECK_TOKEN", null);
                if (string == null || string2 == null) {
                    D = 0;
                } else {
                    try {
                        iOrdinal = p.a.valueOf(string).ordinal();
                    } catch (IllegalArgumentException e10) {
                        StringBuilder sbA = e.e.a("Failed to parse TokenType of stored token  with type [", string, "] with exception: ");
                        sbA.append(e10.getMessage());
                        string = sbA.toString();
                        Log.e(str2, string, null);
                        ((SharedPreferences) D.get()).edit().remove("com.google.firebase.appcheck.APP_CHECK_TOKEN").remove("com.google.firebase.appcheck.TOKEN_TYPE").apply();
                    }
                    if (iOrdinal == 0) {
                        D = b.d(string2);
                    } else if (iOrdinal != 1) {
                        Log.e(str2, "Reached unreachable section in #retrieveAppCheckToken()", null);
                        D = 0;
                    } else {
                        D = b.c(string2);
                    }
                }
                if (D != 0) {
                    iVar.f17000m = D;
                }
                taskCompletionSource.setResult(null);
            }
        });
        this.f16997j = taskCompletionSource.getTask();
        this.f16998k = new l1();
    }

    @Override // nd.b
    public final Task a() {
        return this.f16997j.continueWithTask(this.f16995h, new Continuation() { // from class: ld.f
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                i iVar = this.f16986a;
                if (iVar.e()) {
                    return Tasks.forResult(c.c(iVar.f17000m));
                }
                if (iVar.f16999l == null) {
                    return Tasks.forResult(new c("eyJlcnJvciI6IlVOS05PV05fRVJST1IifQ==", new id.j("No AppCheckProvider installed.")));
                }
                Task<kd.b> task2 = iVar.f17001n;
                if (task2 == null || task2.isComplete() || iVar.f17001n.isCanceled()) {
                    iVar.f17001n = iVar.f16999l.a().onSuccessTask(iVar.f16994g, new h(iVar));
                }
                return iVar.f17001n.continueWithTask(iVar.f16995h, new g());
            }
        });
    }

    @Override // nd.b
    public final void b(ae.c cVar) {
        this.f16990c.add(cVar);
        r rVar = this.f16993f;
        int size = this.f16991d.size() + this.f16990c.size();
        if (rVar.f17026d == 0 && size > 0) {
            rVar.f17026d = size;
            if (rVar.a()) {
                l lVar = rVar.f17023a;
                long j10 = rVar.f17027e;
                rVar.f17024b.getClass();
                lVar.b(j10 - System.currentTimeMillis());
            }
        } else if (rVar.f17026d > 0 && size == 0) {
            rVar.f17023a.a();
        }
        rVar.f17026d = size;
        if (e()) {
            c.c(this.f17000m);
        }
    }

    @Override // kd.d
    public final Task c() {
        return this.f16997j.continueWithTask(this.f16995h, new d(this));
    }

    @Override // kd.d
    public final void d() {
        boolean z10;
        id.e eVar = this.f16988a;
        eVar.a();
        le.a aVar = eVar.f14486g.get();
        synchronized (aVar) {
            z10 = aVar.f17030b;
        }
        this.f16999l = (kd.a) this.f16988a.b(pd.h.class);
        this.f16993f.f17028f = z10;
    }

    public final boolean e() {
        kd.b bVar = this.f17000m;
        if (bVar == null) {
            return false;
        }
        long jA = bVar.a();
        this.f16998k.getClass();
        return jA - System.currentTimeMillis() > 300000;
    }
}
