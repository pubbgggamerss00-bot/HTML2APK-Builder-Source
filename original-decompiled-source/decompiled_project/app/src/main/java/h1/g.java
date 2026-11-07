package h1;

import androidx.room.y0;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import id.j;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Callable;
import ld.m;
import ld.n;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements SuccessContinuation {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f12120a;

    public /* synthetic */ g(Object obj) {
        this.f12120a = obj;
    }

    public void a() {
        eh.p pVar = (eh.p) this.f12120a;
        synchronized (n.f12160c) {
            n.f12165h = qg.x.N((List) n.f12165h, pVar);
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        final pd.h hVar = (pd.h) this.f12120a;
        final pd.a aVar = new pd.a(((IntegrityTokenResponse) obj).token());
        return Tasks.call(hVar.f21431e, new Callable() { // from class: pd.e
            @Override // java.util.concurrent.Callable
            public final Object call() throws JSONException, j, UnsupportedEncodingException {
                h hVar2 = hVar;
                m mVar = hVar2.f21429c;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playIntegrityToken", aVar.f21421a);
                byte[] bytes = jSONObject.toString().getBytes("UTF-8");
                n nVar = hVar2.f21432f;
                mVar.getClass();
                if (nVar.f17015b > System.currentTimeMillis()) {
                    throw new j("Too many attempts.");
                }
                String str = mVar.f17012d;
                String str2 = mVar.f17011c;
                String str3 = mVar.f17010b;
                StringBuilder sbA = y0.a("https://firebaseappcheck.googleapis.com/v1/projects/", str, "/apps/", str2, ":exchangePlayIntegrityToken?key=");
                sbA.append(str3);
                JSONObject jSONObject2 = new JSONObject(mVar.b(new URL(sbA.toString()), bytes, nVar, true));
                String strA = wa.f.a(jSONObject2.optString("token"));
                String strA2 = wa.f.a(jSONObject2.optString("ttl"));
                if (strA == null || strA2 == null) {
                    throw new j("Unexpected server response.");
                }
                ld.a aVar2 = new ld.a();
                aVar2.f16975a = strA;
                aVar2.f16976b = strA2;
                return aVar2;
            }
        });
    }
}
