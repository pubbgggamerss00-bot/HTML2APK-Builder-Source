package ce;

import android.content.Context;
import android.util.Base64OutputStream;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class f implements h, i {

    /* renamed from: a, reason: collision with root package name */
    public final e f5410a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f5411b;

    /* renamed from: c, reason: collision with root package name */
    public final fe.b<ne.h> f5412c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<g> f5413d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f5414e;

    public f() {
        throw null;
    }

    public f(Context context, String str, Set<g> set, fe.b<ne.h> bVar, Executor executor) {
        this.f5410a = new e(context, str);
        this.f5413d = set;
        this.f5414e = executor;
        this.f5412c = bVar;
        this.f5411b = context;
    }

    @Override // ce.h
    public final Task<String> a() {
        if (!u3.j.a(this.f5411b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.f5414e, new Callable() { // from class: ce.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                f fVar = this.f5405a;
                synchronized (fVar) {
                    try {
                        j jVar = (j) fVar.f5410a.get();
                        ArrayList arrayListC = jVar.c();
                        jVar.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i10 = 0; i10 < arrayListC.size(); i10++) {
                            k kVar = (k) arrayListC.get(i10);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", kVar.b());
                            jSONObject.put("dates", new JSONArray((Collection) kVar.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } finally {
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return string;
            }
        });
    }

    @Override // ce.i
    public final synchronized int b() {
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        j jVar = (j) this.f5410a.get();
        synchronized (jVar) {
            zG = jVar.g(jCurrentTimeMillis);
        }
        if (!zG) {
            return 1;
        }
        synchronized (jVar) {
            String strD = jVar.d(System.currentTimeMillis());
            jVar.f5415a.edit().putString("last-used-date", strD).commit();
            jVar.f(strD);
        }
        return 3;
    }

    public final void c() {
        if (this.f5413d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!u3.j.a(this.f5411b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.f5414e, new Callable() { // from class: ce.c
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    f fVar = this.f5406a;
                    synchronized (fVar) {
                        ((j) fVar.f5410a.get()).h(fVar.f5412c.get().a(), System.currentTimeMillis());
                    }
                    return null;
                }
            });
        }
    }
}
