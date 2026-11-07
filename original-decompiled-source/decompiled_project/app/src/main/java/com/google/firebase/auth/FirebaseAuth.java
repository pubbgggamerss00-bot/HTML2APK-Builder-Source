package com.google.firebase.auth;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import ce.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.internal.p002firebaseauthapi.zzach;
import com.google.android.gms.internal.p002firebaseauthapi.zzaei;
import com.google.android.gms.internal.p002firebaseauthapi.zzahn;
import com.google.android.gms.internal.p002firebaseauthapi.zzait;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import qd.b1;
import qd.e0;
import qd.p;
import qd.q;
import qd.u;
import qd.x;
import rd.a0;
import rd.b0;
import rd.d0;
import rd.g;
import rd.i;
import rd.n0;
import rd.q0;
import rd.r0;
import rd.t;
import rd.u0;
import rd.v0;
import rd.w;
import rd.w0;

/* loaded from: classes2.dex */
public class FirebaseAuth implements rd.b {

    /* renamed from: a, reason: collision with root package name */
    public final id.e f6827a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6828b;

    /* renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f6829c;

    /* renamed from: d, reason: collision with root package name */
    public final CopyOnWriteArrayList f6830d;

    /* renamed from: e, reason: collision with root package name */
    public final zzach f6831e;

    /* renamed from: f, reason: collision with root package name */
    public p f6832f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f6833g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f6834h;

    /* renamed from: i, reason: collision with root package name */
    public final String f6835i;

    /* renamed from: j, reason: collision with root package name */
    public n0 f6836j;

    /* renamed from: k, reason: collision with root package name */
    public final RecaptchaAction f6837k;

    /* renamed from: l, reason: collision with root package name */
    public final RecaptchaAction f6838l;

    /* renamed from: m, reason: collision with root package name */
    public final RecaptchaAction f6839m;

    /* renamed from: n, reason: collision with root package name */
    public final r0 f6840n;

    /* renamed from: o, reason: collision with root package name */
    public final v0 f6841o;

    /* renamed from: p, reason: collision with root package name */
    public final fe.b<nd.b> f6842p;

    /* renamed from: q, reason: collision with root package name */
    public final fe.b<h> f6843q;

    /* renamed from: r, reason: collision with root package name */
    public q0 f6844r;

    /* renamed from: s, reason: collision with root package name */
    public final Executor f6845s;

    /* renamed from: t, reason: collision with root package name */
    public final Executor f6846t;

    public interface a {
        void a(FirebaseAuth firebaseAuth);
    }

    public interface b {
        void a();
    }

    public class c implements t, w0 {
        public c() {
        }

        @Override // rd.w0
        public final void a(zzahn zzahnVar, p pVar) throws JSONException {
            com.google.android.gms.common.internal.p.f(zzahnVar);
            com.google.android.gms.common.internal.p.f(pVar);
            pVar.n(zzahnVar);
            FirebaseAuth.f(FirebaseAuth.this, pVar, zzahnVar, true, true);
        }

        @Override // rd.t
        public final void zza(Status status) {
            int i10 = status.f5910a;
            if (i10 == 17011 || i10 == 17021 || i10 == 17005 || i10 == 17091) {
                FirebaseAuth.this.c();
            }
        }
    }

    public class d implements w0 {
        public d() {
        }

        @Override // rd.w0
        public final void a(zzahn zzahnVar, p pVar) throws JSONException {
            com.google.android.gms.common.internal.p.f(zzahnVar);
            com.google.android.gms.common.internal.p.f(pVar);
            pVar.n(zzahnVar);
            FirebaseAuth.f(FirebaseAuth.this, pVar, zzahnVar, true, false);
        }
    }

    public FirebaseAuth() {
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d0  */
    /* JADX WARN: Type inference failed for: r5v0, types: [com.google.firebase.auth.FirebaseAuth$c, rd.u0] */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.firebase.auth.FirebaseAuth$c, rd.u0] */
    /* JADX WARN: Type inference failed for: r5v3, types: [com.google.firebase.auth.FirebaseAuth$c, rd.u0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FirebaseAuth(id.e eVar, fe.b bVar, fe.b bVar2, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, Executor executor3) throws JSONException {
        g gVarB;
        qd.b bVar3;
        zzahn zzahnVarZzb;
        zzach zzachVar = new zzach(eVar, executor, scheduledExecutorService);
        eVar.a();
        Context context = eVar.f14480a;
        String strF = eVar.f();
        r0 r0Var = new r0();
        com.google.android.gms.common.internal.p.f(context);
        com.google.android.gms.common.internal.p.d(strF);
        r0Var.f23423b = strF;
        Context applicationContext = context.getApplicationContext();
        r0Var.f23422a = applicationContext;
        char c10 = 0;
        r0Var.f23424c = applicationContext.getSharedPreferences("com.google.firebase.auth.api.Store." + strF, 0);
        r0Var.f23425d = new sa.a("StorageHelpers", new String[0]);
        v0 v0Var = v0.f23431b;
        w wVar = w.f23433a;
        this.f6828b = new CopyOnWriteArrayList();
        this.f6829c = new CopyOnWriteArrayList();
        this.f6830d = new CopyOnWriteArrayList();
        this.f6833g = new Object();
        this.f6834h = new Object();
        this.f6837k = RecaptchaAction.custom("getOobCode");
        this.f6838l = RecaptchaAction.custom("signInWithPassword");
        this.f6839m = RecaptchaAction.custom("signUpPassword");
        RecaptchaAction.custom("sendVerificationCode");
        RecaptchaAction.custom("mfaSmsEnrollment");
        RecaptchaAction.custom("mfaSmsSignIn");
        this.f6827a = eVar;
        this.f6831e = zzachVar;
        this.f6840n = r0Var;
        com.google.android.gms.common.internal.p.f(v0Var);
        this.f6841o = v0Var;
        com.google.android.gms.common.internal.p.f(wVar);
        this.f6842p = bVar;
        this.f6843q = bVar2;
        this.f6845s = executor;
        this.f6846t = executor3;
        String strA = r0Var.a("com.google.firebase.auth.FIREBASE_USER");
        if (TextUtils.isEmpty(strA)) {
            gVarB = null;
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strA);
                if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                    gVarB = r0Var.b(jSONObject);
                }
            } catch (Exception unused) {
                sa.a aVar = r0Var.f23425d;
                Log.i(aVar.f24792a, aVar.d("Failed to restore user data from persistent storage.", new Object[0]));
            }
        }
        this.f6832f = gVarB;
        if (gVarB != null) {
            r0 r0Var2 = this.f6840n;
            r0Var2.getClass();
            String strA2 = r0Var2.a("com.google.firebase.auth.GET_TOKEN_RESPONSE." + gVarB.f23366b.f23349a);
            if (strA2 != null) {
                try {
                    zzahnVarZzb = zzahn.zzb(strA2);
                } catch (zzaag unused2) {
                    sa.a aVar2 = r0Var2.f23425d;
                    Log.i(aVar2.f24792a, aVar2.d("Failed to restore token data from persistent storage.", new Object[0]));
                }
                if (zzahnVarZzb != null) {
                    f(this, this.f6832f, zzahnVarZzb, false, false);
                }
            } else {
                zzahnVarZzb = null;
                if (zzahnVarZzb != null) {
                }
            }
        }
        this.f6841o.f23432a.getClass();
        id.e eVar2 = this.f6827a;
        eVar2.a();
        SharedPreferences sharedPreferences = eVar2.f14480a.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0);
        String string = sharedPreferences.getString("firebaseAppName", "");
        id.e eVar3 = this.f6827a;
        eVar3.a();
        if (eVar3.f14481b.equals(string)) {
            if (!sharedPreferences.contains("verifyAssertionRequest")) {
                if (!sharedPreferences.contains("recaptchaToken")) {
                    if (sharedPreferences.contains("statusCode")) {
                        Status status = new Status(sharedPreferences.getInt("statusCode", 17062), sharedPreferences.getString("statusMessage", ""), null, null);
                        sharedPreferences.getLong("timestamp", 0L);
                        d0.b(sharedPreferences);
                        Tasks.forException(zzaei.zza(status));
                        return;
                    }
                    return;
                }
                String string2 = sharedPreferences.getString("recaptchaToken", "");
                String string3 = sharedPreferences.getString("operation", "");
                sharedPreferences.getLong("timestamp", 0L);
                string3.getClass();
                if (string3.equals("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA")) {
                    Tasks.forResult(string2);
                }
                d0.b(sharedPreferences);
                return;
            }
            String string4 = sharedPreferences.getString("verifyAssertionRequest", "");
            zzait zzaitVar = (zzait) qa.d.a(string4 == null ? null : Base64.decode(string4, 10), zzait.CREATOR);
            String string5 = sharedPreferences.getString("operation", "");
            String string6 = sharedPreferences.getString("tenantId", null);
            String string7 = sharedPreferences.getString("firebaseUserUid", "");
            sharedPreferences.getLong("timestamp", 0L);
            if (string6 != null) {
                com.google.android.gms.common.internal.p.d(string6);
                synchronized (this.f6834h) {
                    this.f6835i = string6;
                }
                zzaitVar.zzb(string6);
            }
            string5.getClass();
            switch (string5.hashCode()) {
                case -98509410:
                    if (!string5.equals("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE")) {
                        c10 = 65535;
                        break;
                    }
                    break;
                case 175006864:
                    if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_LINK")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 1450464913:
                    if (string5.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    if (!this.f6832f.j().equals(string7)) {
                        break;
                    } else {
                        p pVar = this.f6832f;
                        qd.w0 w0VarF = qd.w0.f(zzaitVar);
                        com.google.android.gms.common.internal.p.f(pVar);
                        qd.c cVarE = w0VarF.e();
                        if (!(cVarE instanceof qd.d)) {
                            if (!(cVarE instanceof x)) {
                                this.f6831e.zzc(this.f6827a, pVar, cVarE, pVar.i(), new c());
                                break;
                            } else {
                                this.f6831e.zzb(this.f6827a, pVar, (x) cVarE, this.f6835i, (u0) new c());
                                break;
                            }
                        } else {
                            qd.d dVar = (qd.d) cVarE;
                            if (!"password".equals(!TextUtils.isEmpty(dVar.f22666b) ? "password" : "emailLink")) {
                                String str = dVar.f22667c;
                                com.google.android.gms.common.internal.p.d(str);
                                int i10 = qd.b.f22656c;
                                com.google.android.gms.common.internal.p.d(str);
                                try {
                                    bVar3 = new qd.b(str);
                                } catch (IllegalArgumentException unused3) {
                                    bVar3 = null;
                                }
                                if (bVar3 != null && !TextUtils.equals(this.f6835i, bVar3.f22658b)) {
                                    Tasks.forException(zzaei.zza(new Status(17072, null, null, null)));
                                    break;
                                } else {
                                    new com.google.firebase.auth.a(this, true, pVar, dVar).a(this, this.f6835i, this.f6837k);
                                    break;
                                }
                            } else {
                                String str2 = dVar.f22665a;
                                String str3 = dVar.f22666b;
                                com.google.android.gms.common.internal.p.d(str3);
                                String strI = pVar.i();
                                new com.google.firebase.auth.b(this, str2, true, pVar, str3, strI).a(this, strI, this.f6838l);
                                break;
                            }
                        }
                    }
                    break;
                case 1:
                    if (this.f6832f.j().equals(string7)) {
                        p pVar2 = this.f6832f;
                        qd.w0 w0VarF2 = qd.w0.f(zzaitVar);
                        com.google.android.gms.common.internal.p.f(pVar2);
                        this.f6831e.zza(this.f6827a, pVar2, w0VarF2.e(), (String) null, (u0) new c());
                    }
                    break;
                case 2:
                    b(qd.w0.f(zzaitVar));
                    break;
            }
            d0.b(sharedPreferences);
        }
    }

    public static void e(FirebaseAuth firebaseAuth, p pVar) {
        if (pVar != null) {
            Log.d("FirebaseAuth", "Notifying auth state listeners about user ( " + pVar.j() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying auth state listeners about a sign-out event.");
        }
        firebaseAuth.f6846t.execute(new e(firebaseAuth));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void f(FirebaseAuth firebaseAuth, p pVar, zzahn zzahnVar, boolean z10, boolean z11) throws JSONException {
        boolean z12;
        boolean z13;
        p pVar2;
        zzahn zzahnVar2;
        ArrayList arrayList;
        boolean z14;
        boolean z15;
        ArrayList arrayList2;
        com.google.android.gms.common.internal.p.f(pVar);
        com.google.android.gms.common.internal.p.f(zzahnVar);
        boolean z16 = firebaseAuth.f6832f != null && pVar.j().equals(firebaseAuth.f6832f.j());
        if (z16 || !z11) {
            p pVar3 = firebaseAuth.f6832f;
            if (pVar3 == null) {
                z13 = true;
                z12 = true;
            } else {
                z12 = (z16 && pVar3.q().zzc().equals(zzahnVar.zzc())) ? false : true;
                z13 = !z16;
            }
            String string = null;
            if (firebaseAuth.f6832f != null) {
                String strJ = pVar.j();
                p pVar4 = firebaseAuth.f6832f;
                if (strJ.equals(pVar4 == null ? null : pVar4.j())) {
                    firebaseAuth.f6832f.m(pVar.h());
                    if (!pVar.k()) {
                        firebaseAuth.f6832f.o();
                    }
                    b0 b0Var = pVar.f().f23382a.f23376m;
                    if (b0Var != null) {
                        arrayList2 = new ArrayList();
                        Iterator<qd.b0> it = b0Var.f23344a.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(it.next());
                        }
                        Iterator<e0> it2 = b0Var.f23345b.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(it2.next());
                        }
                    } else {
                        arrayList2 = new ArrayList();
                    }
                    List<qd.n0> listS = pVar.s();
                    firebaseAuth.f6832f.r(arrayList2);
                    firebaseAuth.f6832f.p(listS);
                    pVar2 = pVar;
                } else {
                    pVar2 = pVar;
                    firebaseAuth.f6832f = pVar2;
                }
            }
            if (z10) {
                r0 r0Var = firebaseAuth.f6840n;
                p pVar5 = firebaseAuth.f6832f;
                r0Var.getClass();
                com.google.android.gms.common.internal.p.f(pVar5);
                sa.a aVar = r0Var.f23425d;
                JSONObject jSONObject = new JSONObject();
                if (g.class.isAssignableFrom(pVar5.getClass())) {
                    g gVar = (g) pVar5;
                    try {
                        jSONObject.put("cachedTokenState", gVar.f23365a.zzf());
                        id.e eVarE = id.e.e(gVar.f23367c);
                        eVarE.a();
                        jSONObject.put("applicationName", eVarE.f14481b);
                        jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                        if (gVar.f23369e != null) {
                            JSONArray jSONArray = new JSONArray();
                            ArrayList arrayList3 = gVar.f23369e;
                            int size = arrayList3.size();
                            if (arrayList3.size() > 30) {
                                aVar.f("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(arrayList3.size()));
                                size = 30;
                            }
                            int i10 = 0;
                            boolean z17 = false;
                            while (true) {
                                if (i10 >= size) {
                                    z14 = true;
                                    break;
                                }
                                z14 = true;
                                rd.d dVar = (rd.d) arrayList3.get(i10);
                                if (dVar.f23350b.equals("firebase")) {
                                    z17 = true;
                                }
                                if (i10 == size - 1 && !z17) {
                                    break;
                                }
                                jSONArray.put(dVar.e());
                                i10++;
                            }
                            if (!z17) {
                                for (int i11 = size - 1; i11 < arrayList3.size() && i11 >= 0; i11++) {
                                    rd.d dVar2 = (rd.d) arrayList3.get(i11);
                                    if (dVar2.f23350b.equals("firebase")) {
                                        jSONArray.put(dVar2.e());
                                        z15 = z14;
                                        break;
                                    } else {
                                        if (i11 == arrayList3.size() - 1) {
                                            jSONArray.put(dVar2.e());
                                        }
                                    }
                                }
                                z15 = z17;
                                if (!z15) {
                                    aVar.f("Malformed user object! No Firebase Auth provider id found. Provider user info list size: %d, trimmed size: %d", Integer.valueOf(arrayList3.size()), Integer.valueOf(size));
                                    if (arrayList3.size() < 5) {
                                        StringBuilder sb = new StringBuilder("Provider user info list:\n");
                                        int size2 = arrayList3.size();
                                        int i12 = 0;
                                        while (i12 < size2) {
                                            Object obj = arrayList3.get(i12);
                                            i12++;
                                            sb.append("Provider - " + ((rd.d) obj).f23350b + "\n");
                                        }
                                        aVar.f(sb.toString(), new Object[0]);
                                    }
                                }
                            }
                            jSONObject.put("userInfos", jSONArray);
                        }
                        jSONObject.put("anonymous", gVar.k());
                        jSONObject.put("version", "2");
                        i iVar = gVar.f23373j;
                        if (iVar != null) {
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("lastSignInTimestamp", iVar.f23379a);
                                jSONObject2.put("creationTimestamp", iVar.f23380b);
                            } catch (JSONException unused) {
                            }
                            jSONObject.put("userMetadata", jSONObject2);
                        }
                        b0 b0Var2 = gVar.f23376m;
                        if (b0Var2 != null) {
                            arrayList = new ArrayList();
                            Iterator<qd.b0> it3 = b0Var2.f23344a.iterator();
                            while (it3.hasNext()) {
                                arrayList.add(it3.next());
                            }
                            Iterator<e0> it4 = b0Var2.f23345b.iterator();
                            while (it4.hasNext()) {
                                arrayList.add(it4.next());
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        if (!arrayList.isEmpty()) {
                            JSONArray jSONArray2 = new JSONArray();
                            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                jSONArray2.put(((u) arrayList.get(i13)).e());
                            }
                            jSONObject.put("userMultiFactorInfo", jSONArray2);
                        }
                        List<qd.n0> list = gVar.f23377n;
                        if (list != null && !list.isEmpty()) {
                            JSONArray jSONArray3 = new JSONArray();
                            for (int i14 = 0; i14 < list.size(); i14++) {
                                qd.n0 n0Var = list.get(i14);
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("credentialId", n0Var.f22688a);
                                jSONObject3.put("name", n0Var.f22689b);
                                jSONObject3.put("displayName", n0Var.f22690c);
                                jSONArray3.put(jSONObject3);
                            }
                            jSONObject.put("passkeyInfo", jSONArray3);
                        }
                        string = jSONObject.toString();
                    } catch (Exception e10) {
                        Log.wtf(aVar.f24792a, aVar.d("Failed to turn object into JSON", new Object[0]), e10);
                        throw new zzaag(e10);
                    }
                }
                if (!TextUtils.isEmpty(string)) {
                    r0Var.c("com.google.firebase.auth.FIREBASE_USER", string);
                }
            }
            if (z12) {
                p pVar6 = firebaseAuth.f6832f;
                zzahnVar2 = zzahnVar;
                if (pVar6 != null) {
                    pVar6.n(zzahnVar2);
                }
                g(firebaseAuth, firebaseAuth.f6832f);
            } else {
                zzahnVar2 = zzahnVar;
            }
            if (z13) {
                e(firebaseAuth, firebaseAuth.f6832f);
            }
            if (z10) {
                r0 r0Var2 = firebaseAuth.f6840n;
                r0Var2.getClass();
                r0Var2.c(m3.a.a("com.google.firebase.auth.GET_TOKEN_RESPONSE.", pVar2.j()), zzahnVar2.zzf());
            }
            p pVar7 = firebaseAuth.f6832f;
            if (pVar7 != null) {
                if (firebaseAuth.f6844r == null) {
                    id.e eVar = firebaseAuth.f6827a;
                    com.google.android.gms.common.internal.p.f(eVar);
                    firebaseAuth.f6844r = new q0(eVar);
                }
                q0 q0Var = firebaseAuth.f6844r;
                zzahn zzahnVarQ = pVar7.q();
                q0Var.getClass();
                if (zzahnVarQ == null) {
                    return;
                }
                long jZza = zzahnVarQ.zza();
                if (jZza <= 0) {
                    jZza = 3600;
                }
                long jZzb = (jZza * 1000) + zzahnVarQ.zzb();
                rd.p pVar8 = q0Var.f23420a;
                pVar8.f23414a = jZzb;
                pVar8.f23415b = -1L;
            }
        }
    }

    public static void g(FirebaseAuth firebaseAuth, p pVar) {
        if (pVar != null) {
            Log.d("FirebaseAuth", "Notifying id token listeners about user ( " + pVar.j() + " ).");
        } else {
            Log.d("FirebaseAuth", "Notifying id token listeners about a sign-out event.");
        }
        String strZzd = pVar != null ? pVar.zzd() : null;
        le.b bVar = new le.b();
        bVar.f17031a = strZzd;
        firebaseAuth.f6846t.execute(new f(firebaseAuth, bVar));
    }

    public static FirebaseAuth getInstance() {
        return (FirebaseAuth) id.e.d().b(FirebaseAuth.class);
    }

    @Override // rd.b
    public final Task a() {
        return d(this.f6832f, false);
    }

    public final Task<Object> b(qd.c cVar) {
        qd.b bVar;
        qd.c cVarE = cVar.e();
        boolean z10 = cVarE instanceof qd.d;
        String str = this.f6835i;
        if (!z10) {
            boolean z11 = cVarE instanceof x;
            id.e eVar = this.f6827a;
            zzach zzachVar = this.f6831e;
            return z11 ? zzachVar.zza(eVar, (x) cVarE, str, (w0) new d()) : zzachVar.zza(eVar, cVarE, str, new d());
        }
        qd.d dVar = (qd.d) cVarE;
        String str2 = dVar.f22667c;
        if (TextUtils.isEmpty(str2)) {
            String str3 = dVar.f22665a;
            String str4 = dVar.f22666b;
            com.google.android.gms.common.internal.p.f(str4);
            String str5 = this.f6835i;
            return new com.google.firebase.auth.b(this, str3, false, null, str4, str5).a(this, str5, this.f6838l);
        }
        com.google.android.gms.common.internal.p.d(str2);
        int i10 = qd.b.f22656c;
        com.google.android.gms.common.internal.p.d(str2);
        try {
            bVar = new qd.b(str2);
        } catch (IllegalArgumentException unused) {
            bVar = null;
        }
        return (bVar == null || TextUtils.equals(str, bVar.f22658b)) ? new com.google.firebase.auth.a(this, false, null, dVar).a(this, str, this.f6837k) : Tasks.forException(zzaei.zza(new Status(17072, null, null, null)));
    }

    public final void c() {
        r0 r0Var = this.f6840n;
        com.google.android.gms.common.internal.p.f(r0Var);
        SharedPreferences sharedPreferences = r0Var.f23424c;
        p pVar = this.f6832f;
        if (pVar != null) {
            sharedPreferences.edit().remove(m3.a.a("com.google.firebase.auth.GET_TOKEN_RESPONSE.", pVar.j())).apply();
            this.f6832f = null;
        }
        sharedPreferences.edit().remove("com.google.firebase.auth.FIREBASE_USER").apply();
        g(this, null);
        e(this, null);
        q0 q0Var = this.f6844r;
        if (q0Var != null) {
            rd.p pVar2 = q0Var.f23420a;
            pVar2.f23416c.removeCallbacks(pVar2.f23417d);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [qd.b1, rd.u0] */
    public final Task<q> d(p pVar, boolean z10) {
        if (pVar == null) {
            return Tasks.forException(zzaei.zza(new Status(17495, null, null, null)));
        }
        zzahn zzahnVarQ = pVar.q();
        if (zzahnVarQ.zzg() && !z10) {
            return Tasks.forResult(a0.a(zzahnVarQ.zzc()));
        }
        return this.f6831e.zza(this.f6827a, pVar, zzahnVarQ.zzd(), (u0) new b1(this));
    }

    public static FirebaseAuth getInstance(id.e eVar) {
        return (FirebaseAuth) eVar.b(FirebaseAuth.class);
    }
}
