package pd;

import androidx.room.y0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import id.j;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import ld.m;
import ld.n;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class h implements kd.a {

    /* renamed from: a, reason: collision with root package name */
    public final String f21427a;

    /* renamed from: b, reason: collision with root package name */
    public final IntegrityManager f21428b;

    /* renamed from: c, reason: collision with root package name */
    public final m f21429c;

    /* renamed from: d, reason: collision with root package name */
    public final Executor f21430d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f21431e;

    /* renamed from: f, reason: collision with root package name */
    public final n f21432f;

    public h(id.e eVar, Executor executor, Executor executor2) {
        eVar.a();
        String str = eVar.f14482c.f14496e;
        eVar.a();
        IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(eVar.f14480a);
        m mVar = new m(eVar);
        n nVar = new n();
        nVar.f17014a = 0L;
        nVar.f17015b = -1L;
        this.f21427a = str;
        this.f21428b = integrityManagerCreate;
        this.f21429c = mVar;
        this.f21430d = executor;
        this.f21431e = executor2;
        this.f21432f = nVar;
    }

    @Override // kd.a
    public final Task<kd.b> a() {
        final b bVar = new b();
        Task taskCall = Tasks.call(this.f21431e, new Callable(bVar) { // from class: pd.f
            @Override // java.util.concurrent.Callable
            public final Object call() throws j, UnsupportedEncodingException {
                h hVar = this.f21425a;
                m mVar = hVar.f21429c;
                byte[] bytes = new JSONObject().toString().getBytes("UTF-8");
                n nVar = hVar.f21432f;
                mVar.getClass();
                if (nVar.f17015b > System.currentTimeMillis()) {
                    throw new j("Too many attempts.");
                }
                String str = mVar.f17012d;
                String str2 = mVar.f17011c;
                String str3 = mVar.f17010b;
                StringBuilder sbA = y0.a("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":generatePlayIntegrityChallenge?key=");
                sbA.append(str3);
                JSONObject jSONObject = new JSONObject(mVar.b(new URL(sbA.toString()), bytes, nVar, false));
                String strA = wa.f.a(jSONObject.optString("challenge"));
                String strA2 = wa.f.a(jSONObject.optString("ttl"));
                if (strA == null || strA2 == null) {
                    throw new j("Unexpected server response.");
                }
                c cVar = new c();
                cVar.f21422a = strA;
                return cVar;
            }
        });
        SuccessContinuation successContinuation = new SuccessContinuation() { // from class: pd.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                h hVar = this.f21426a;
                return hVar.f21428b.requestIntegrityToken(IntegrityTokenRequest.builder().setCloudProjectNumber(Long.parseLong(hVar.f21427a)).setNonce(((c) obj).f21422a).build());
            }
        };
        Executor executor = this.f21430d;
        return taskCall.onSuccessTask(executor, successContinuation).onSuccessTask(executor, new h1.g(this)).onSuccessTask(executor, new d());
    }
}
