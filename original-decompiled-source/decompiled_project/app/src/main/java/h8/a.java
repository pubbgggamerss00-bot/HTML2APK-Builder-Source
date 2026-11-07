package h8;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.room.y0;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import h8.f;
import h8.i;
import h8.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.json.JSONException;
import org.json.JSONObject;
import pg.f0;
import pg.p;
import ph.i0;
import ph.j0;
import ph.l2;
import ph.n2;
import ph.t0;
import r.o2;
import sh.a1;
import sh.l0;
import sh.z0;
import tg.h;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final f f12342a;

    /* renamed from: b, reason: collision with root package name */
    public final m f12343b;

    /* renamed from: c, reason: collision with root package name */
    public final g8.p f12344c;

    /* renamed from: d, reason: collision with root package name */
    public final SharedPreferences f12345d;

    /* renamed from: e, reason: collision with root package name */
    public final SharedPreferences f12346e;

    /* renamed from: f, reason: collision with root package name */
    public final uh.c f12347f;

    /* renamed from: g, reason: collision with root package name */
    public l2 f12348g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f12349h;

    /* renamed from: i, reason: collision with root package name */
    public final l0 f12350i;

    /* renamed from: h8.a$a, reason: collision with other inner class name */
    public static final class C0114a {

        /* renamed from: a, reason: collision with root package name */
        public final String f12351a;

        /* renamed from: b, reason: collision with root package name */
        public final String f12352b;

        /* renamed from: c, reason: collision with root package name */
        public final String f12353c;

        /* renamed from: d, reason: collision with root package name */
        public final String f12354d;

        /* renamed from: e, reason: collision with root package name */
        public final Long f12355e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f12356f;

        /* renamed from: g, reason: collision with root package name */
        public final long f12357g;

        public C0114a(String str, String str2, String str3, String str4, Long l10, boolean z10, long j10) {
            this.f12351a = str;
            this.f12352b = str2;
            this.f12353c = str3;
            this.f12354d = str4;
            this.f12355e = l10;
            this.f12356f = z10;
            this.f12357g = j10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0114a)) {
                return false;
            }
            C0114a c0114a = (C0114a) obj;
            return kotlin.jvm.internal.r.a(this.f12351a, c0114a.f12351a) && kotlin.jvm.internal.r.a(this.f12352b, c0114a.f12352b) && kotlin.jvm.internal.r.a(this.f12353c, c0114a.f12353c) && kotlin.jvm.internal.r.a(this.f12354d, c0114a.f12354d) && kotlin.jvm.internal.r.a(this.f12355e, c0114a.f12355e) && this.f12356f == c0114a.f12356f && this.f12357g == c0114a.f12357g;
        }

        public final int hashCode() {
            int iA = l0.k.a(l0.k.a(l0.k.a(this.f12351a.hashCode() * 31, 31, this.f12352b), 31, this.f12353c), 31, this.f12354d);
            Long l10 = this.f12355e;
            return Long.hashCode(this.f12357g) + o2.a((iA + (l10 == null ? 0 : l10.hashCode())) * 31, 31, this.f12356f);
        }

        public final String toString() {
            StringBuilder sbA = y0.a("Pending(turnId=", this.f12351a, ", sessionId=", this.f12352b, ", mode=");
            androidx.room.z0.a(sbA, this.f12353c, ", prompt=", this.f12354d, ", projectId=");
            sbA.append(this.f12355e);
            sbA.append(", autoMode=");
            sbA.append(this.f12356f);
            sbA.append(", startedAt=");
            return com.android.apksig.internal.apk.a.a(this.f12357g, ")", sbA);
        }
    }

    @vg.e(c = "com.basitce.htmltoapk.ai.AiBackgroundTurns$resume$1$1", f = "AiBackgroundTurns.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends vg.i implements eh.p<i0, tg.e<? super f0>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f12358a;

        public b(tg.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vg.a
        public final tg.e<f0> create(Object obj, tg.e<?> eVar) {
            return a.this.new b(eVar);
        }

        @Override // eh.p
        public final Object invoke(i0 i0Var, tg.e<? super f0> eVar) {
            return ((b) create(i0Var, eVar)).invokeSuspend(f0.f21461a);
        }

        @Override // vg.a
        public final Object invokeSuspend(Object obj) {
            ug.a aVar = ug.a.f29706a;
            int i10 = this.f12358a;
            if (i10 == 0) {
                pg.q.b(obj);
                this.f12358a = 1;
                if (a.a(a.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pg.q.b(obj);
            }
            return f0.f21461a;
        }
    }

    public a(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, f client, m store, g8.p account) {
        kotlin.jvm.internal.r.e(client, "client");
        kotlin.jvm.internal.r.e(store, "store");
        kotlin.jvm.internal.r.e(account, "account");
        this.f12342a = client;
        this.f12343b = store;
        this.f12344c = account;
        this.f12345d = hilt_HtmlToApkApplication.getSharedPreferences("ai_pending_turns", 0);
        this.f12346e = hilt_HtmlToApkApplication.getSharedPreferences("ai_pending_icons", 0);
        n2 n2VarA = ah.l.a();
        wh.c cVar = ph.z0.f21632a;
        this.f12347f = j0.a(h.a.C0291a.c(n2VarA, wh.b.f31563c));
        z0 z0VarA = a1.a(e());
        this.f12349h = z0VarA;
        this.f12350i = gg.a.a(z0VarA);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:112)|65|66|110|67|(1:125)(7:70|108|71|72|80|(0)|83)) */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0145, code lost:
    
        r5 = r2.f12342a;
        r6 = r4.f12352b;
        r11 = r4.f12351a;
        r12 = !r4.f12353c.equals("new");
        r1.f12376a = r2;
        r1.f12377b = r0;
        r1.f12378c = r4;
        r1.f12379d = r9;
        r1.f12382g = 1;
        r5 = r5.d(r6, r11, r12, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0162, code lost:
    
        if (r5 != r3) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0166, code lost:
    
        r11 = r2;
        r2 = r4;
        r4 = r0;
        r0 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0199, code lost:
    
        r2 = r4;
        r4 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01ea  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x01d4 -> B:52:0x0124). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:99:0x01fb -> B:101:0x01fe). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, vg.c cVar) {
        e eVar;
        a aVar2;
        long jCurrentTimeMillis;
        a aVar3;
        Iterator it;
        Throwable th2;
        Object objA;
        a aVar4;
        Iterator it2;
        Throwable thA;
        Iterator it3;
        char c10;
        ArrayList arrayList;
        Object objA2;
        aVar.getClass();
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f12382g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                eVar.f12382g = i10 - PKIFailureInfo.systemUnavail;
                aVar2 = aVar;
            } else {
                aVar2 = aVar;
                eVar = new e(aVar2, cVar);
            }
        }
        Object obj = eVar.f12380e;
        ug.a aVar5 = ug.a.f29706a;
        int i11 = eVar.f12382g;
        if (i11 == 0) {
            pg.q.b(obj);
            jCurrentTimeMillis = System.currentTimeMillis() + 1200000;
            synchronized (aVar2) {
            }
        } else if (i11 == 1) {
            jCurrentTimeMillis = eVar.f12379d;
            C0114a c0114a = eVar.f12378c;
            it2 = eVar.f12377b;
            aVar4 = eVar.f12376a;
            pg.q.b(obj);
            f.a aVar6 = (f.a) obj;
            if (aVar6 instanceof f.a.C0115a) {
                if (aVar4.c(c0114a.f12351a)) {
                    try {
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                    t tVar = ((f.a.C0115a) aVar6).f12385a;
                    eVar.f12376a = aVar4;
                    eVar.f12377b = it2;
                    eVar.f12378c = null;
                    eVar.f12379d = jCurrentTimeMillis;
                    eVar.f12382g = 2;
                    if (aVar4.b(c0114a, tVar, eVar) == aVar5) {
                        return aVar5;
                    }
                    it = it2;
                    aVar3 = aVar4;
                    objA = f0.f21461a;
                    aVar4 = aVar3;
                    it2 = it;
                    thA = pg.p.a(objA);
                    if (thA != null) {
                    }
                    aVar4.f12344c.l();
                }
            } else if (aVar6 instanceof f.a.b) {
                if (aVar4.c(c0114a.f12351a)) {
                    aVar4.f12344c.l();
                }
            } else if (!kotlin.jvm.internal.r.a(aVar6, f.a.c.f12389a)) {
                throw new pg.l();
            }
            it3 = it2;
            aVar2 = aVar4;
            while (it3.hasNext()) {
            }
            c10 = 2;
            if (System.currentTimeMillis() <= jCurrentTimeMillis) {
            }
        } else if (i11 == 2) {
            jCurrentTimeMillis = eVar.f12379d;
            it = eVar.f12377b;
            aVar3 = eVar.f12376a;
            try {
                pg.q.b(obj);
            } catch (Throwable th4) {
                th2 = th4;
                objA = pg.q.a(th2);
                aVar4 = aVar3;
                it2 = it;
                thA = pg.p.a(objA);
                if (thA != null) {
                }
                aVar4.f12344c.l();
                it3 = it2;
                aVar2 = aVar4;
                while (it3.hasNext()) {
                }
                c10 = 2;
                if (System.currentTimeMillis() <= jCurrentTimeMillis) {
                }
            }
            try {
            } catch (Throwable th5) {
                th2 = th5;
                objA = pg.q.a(th2);
                aVar4 = aVar3;
                it2 = it;
                thA = pg.p.a(objA);
                if (thA != null) {
                }
                aVar4.f12344c.l();
                it3 = it2;
                aVar2 = aVar4;
                while (it3.hasNext()) {
                }
                c10 = 2;
                if (System.currentTimeMillis() <= jCurrentTimeMillis) {
                }
            }
            objA = f0.f21461a;
            aVar4 = aVar3;
            it2 = it;
            thA = pg.p.a(objA);
            if (thA != null) {
                Log.w("AiBackgroundTurns", "Applying background turn failed", thA);
            }
            aVar4.f12344c.l();
            it3 = it2;
            aVar2 = aVar4;
            while (it3.hasNext()) {
            }
            c10 = 2;
            if (System.currentTimeMillis() <= jCurrentTimeMillis) {
            }
        } else {
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jCurrentTimeMillis = eVar.f12379d;
            aVar2 = eVar.f12376a;
            pg.q.b(obj);
            char c11 = 3;
            c10 = 2;
            synchronized (aVar2) {
                Map<String, ?> all = aVar2.f12345d.getAll();
                kotlin.jvm.internal.r.d(all, "getAll(...)");
                arrayList = new ArrayList();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    try {
                        kotlin.jvm.internal.r.c(value, "null cannot be cast to non-null type kotlin.String");
                        JSONObject jSONObject = new JSONObject((String) value);
                        kotlin.jvm.internal.r.b(key);
                        String string = jSONObject.getString("sessionId");
                        kotlin.jvm.internal.r.d(string, "getString(...)");
                        String string2 = jSONObject.getString("mode");
                        kotlin.jvm.internal.r.d(string2, "getString(...)");
                        String strOptString = jSONObject.optString("prompt");
                        kotlin.jvm.internal.r.d(strOptString, "optString(...)");
                        objA2 = new C0114a(key, string, string2, strOptString, jSONObject.has("projectId") ? Long.valueOf(jSONObject.getLong("projectId")) : null, jSONObject.optBoolean("autoMode"), jSONObject.optLong("startedAt"));
                    } catch (Throwable th6) {
                        objA2 = pg.q.a(th6);
                    }
                    if (objA2 instanceof p.a) {
                        objA2 = null;
                    }
                    C0114a c0114a2 = (C0114a) objA2;
                    if (c0114a2 != null) {
                        arrayList.add(c0114a2);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return f0.f21461a;
            }
            it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0114a c0114a3 = (C0114a) it3.next();
                if (System.currentTimeMillis() - c0114a3.f12357g <= 3600000) {
                    break;
                }
                aVar2.c(c0114a3.f12351a);
            }
            c10 = 2;
            if (System.currentTimeMillis() <= jCurrentTimeMillis) {
                return f0.f21461a;
            }
            eVar.f12376a = aVar2;
            eVar.f12377b = null;
            eVar.f12378c = null;
            eVar.f12379d = jCurrentTimeMillis;
            c11 = 3;
            eVar.f12382g = 3;
            if (t0.b(5000L, eVar) == aVar5) {
                return aVar5;
            }
            synchronized (aVar2) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(C0114a c0114a, t tVar, vg.c cVar) throws Throwable {
        h8.b bVar;
        a aVar;
        long j10;
        a aVar2;
        j jVar;
        String str;
        t tVar2;
        a aVar3;
        C0114a c0114a2;
        long j11;
        j jVar2;
        if (cVar instanceof h8.b) {
            bVar = (h8.b) cVar;
            int i10 = bVar.f12366g;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f12366g = i10 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new h8.b(this, cVar);
            }
        }
        Object objH = bVar.f12364e;
        ug.a aVar4 = ug.a.f29706a;
        int i11 = bVar.f12366g;
        if (i11 == 0) {
            pg.q.b(objH);
            boolean z10 = tVar instanceof t.b;
            m mVar = this.f12343b;
            if (z10) {
                String str2 = c0114a.f12354d;
                bVar.f12360a = this;
                bVar.f12361b = c0114a;
                bVar.f12362c = tVar;
                bVar.f12366g = 1;
                mVar.getClass();
                wh.c cVar2 = ph.z0.f21632a;
                objH = ph.h.e(wh.b.f31563c, new n((t.b) tVar, str2, mVar, null), bVar);
                if (objH != aVar4) {
                    aVar2 = this;
                    long jLongValue = ((Number) ((pg.n) objH).f21469a).longValue();
                    aVar2.f12343b.f12419d.edit().putString(String.valueOf(jLongValue), c0114a.f12352b).apply();
                    jVar = ((t.b) tVar).f12458b.f12470h;
                    if (jVar != null) {
                    }
                }
            } else if (tVar instanceof t.a) {
                Long l10 = c0114a.f12355e;
                if (l10 == null) {
                    return f0.f21461a;
                }
                long jLongValue2 = l10.longValue();
                bVar.f12360a = this;
                bVar.f12361b = c0114a;
                bVar.f12362c = tVar;
                bVar.f12363d = jLongValue2;
                bVar.f12366g = 2;
                objH = mVar.h(jLongValue2, bVar);
                if (objH != aVar4) {
                    aVar = this;
                    j10 = jLongValue2;
                    str = (String) objH;
                    if (str != null) {
                    }
                }
            } else if (tVar != null) {
                throw new pg.l();
            }
            return aVar4;
        }
        if (i11 == 1) {
            tVar = bVar.f12362c;
            c0114a = bVar.f12361b;
            aVar2 = bVar.f12360a;
            pg.q.b(objH);
            long jLongValue3 = ((Number) ((pg.n) objH).f21469a).longValue();
            aVar2.f12343b.f12419d.edit().putString(String.valueOf(jLongValue3), c0114a.f12352b).apply();
            jVar = ((t.b) tVar).f12458b.f12470h;
            if (jVar != null) {
                aVar2.d(jLongValue3, jVar);
            }
        } else {
            if (i11 == 2) {
                long j12 = bVar.f12363d;
                t tVar3 = bVar.f12362c;
                C0114a c0114a3 = bVar.f12361b;
                a aVar5 = bVar.f12360a;
                pg.q.b(objH);
                j10 = j12;
                tVar = tVar3;
                c0114a = c0114a3;
                aVar = aVar5;
                str = (String) objH;
                if (str != null) {
                    return f0.f21461a;
                }
                t.a aVar6 = (t.a) tVar;
                List<w> list = aVar6.f12455a;
                u uVar = aVar6.f12456b;
                i.a aVarA = i.a(str, list);
                u uVar2 = c0114a.f12356f ? uVar : new u(uVar.f12469g, 959);
                m mVar2 = aVar.f12343b;
                String str3 = aVarA.f12407b > 0 ? aVarA.f12406a : null;
                bVar.f12360a = aVar;
                bVar.f12361b = c0114a;
                bVar.f12362c = tVar;
                bVar.f12363d = j10;
                bVar.f12366g = 3;
                mVar2.getClass();
                wh.c cVar3 = ph.z0.f21632a;
                if (ph.h.e(wh.b.f31563c, new r(mVar2, j10, str3, uVar2, null), bVar) != aVar4) {
                    tVar2 = tVar;
                    aVar3 = aVar;
                    c0114a2 = c0114a;
                    j11 = j10;
                    if (c0114a2.f12356f) {
                        aVar3.d(j11, jVar2);
                    }
                }
                return aVar4;
            }
            if (i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j11 = bVar.f12363d;
            tVar2 = bVar.f12362c;
            c0114a2 = bVar.f12361b;
            aVar3 = bVar.f12360a;
            pg.q.b(objH);
            if (c0114a2.f12356f && (jVar2 = ((t.a) tVar2).f12456b.f12470h) != null) {
                aVar3.d(j11, jVar2);
            }
        }
        return f0.f21461a;
    }

    public final synchronized boolean c(String turnId) {
        kotlin.jvm.internal.r.e(turnId, "turnId");
        if (!this.f12345d.contains(turnId)) {
            return false;
        }
        this.f12345d.edit().remove(turnId).commit();
        return true;
    }

    public final void d(long j10, j jVar) throws JSONException {
        SharedPreferences.Editor editorEdit = this.f12346e.edit();
        String strValueOf = String.valueOf(j10);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("symbol", jVar.f12409a);
        jSONObject.put("background", jVar.f12410b);
        jSONObject.put("foreground", jVar.f12411c);
        f0 f0Var = f0.f21461a;
        editorEdit.putString(strValueOf, jSONObject.toString()).commit();
        ArrayList arrayListE = e();
        z0 z0Var = this.f12349h;
        z0Var.getClass();
        z0Var.j(null, arrayListE);
    }

    public final ArrayList e() {
        Object objA;
        Map<String, ?> all = this.f12346e.getAll();
        kotlin.jvm.internal.r.d(all, "getAll(...)");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            try {
                kotlin.jvm.internal.r.c(value, "null cannot be cast to non-null type kotlin.String");
                JSONObject jSONObject = new JSONObject((String) value);
                kotlin.jvm.internal.r.b(key);
                Long lValueOf = Long.valueOf(Long.parseLong(key));
                String string = jSONObject.getString("symbol");
                kotlin.jvm.internal.r.d(string, "getString(...)");
                String string2 = jSONObject.getString("background");
                kotlin.jvm.internal.r.d(string2, "getString(...)");
                String string3 = jSONObject.getString("foreground");
                kotlin.jvm.internal.r.d(string3, "getString(...)");
                objA = new pg.n(lValueOf, new j(string, string2, string3));
            } catch (Throwable th2) {
                objA = pg.q.a(th2);
            }
            if (objA instanceof p.a) {
                objA = null;
            }
            pg.n nVar = (pg.n) objA;
            if (nVar != null) {
                arrayList.add(nVar);
            }
        }
        return arrayList;
    }

    public final void f() {
        synchronized (this) {
            try {
                l2 l2Var = this.f12348g;
                if ((l2Var == null || !l2Var.isActive()) && !this.f12345d.getAll().isEmpty()) {
                    this.f12348g = ph.h.c(this.f12347f, null, null, new b(null), 3);
                    f0 f0Var = f0.f21461a;
                }
            } finally {
            }
        }
    }
}
