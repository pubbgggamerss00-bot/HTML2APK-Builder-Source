package ge;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import ie.a;
import ie.c;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import je.b;
import je.d;
import je.f;
import org.json.JSONException;
import org.json.JSONObject;
import sd.q;
import td.u;

/* loaded from: classes2.dex */
public final class g implements h {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f12021m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final id.e f12022a;

    /* renamed from: b, reason: collision with root package name */
    public final je.c f12023b;

    /* renamed from: c, reason: collision with root package name */
    public final ie.c f12024c;

    /* renamed from: d, reason: collision with root package name */
    public final p f12025d;

    /* renamed from: e, reason: collision with root package name */
    public final q<ie.b> f12026e;

    /* renamed from: f, reason: collision with root package name */
    public final n f12027f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f12028g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f12029h;

    /* renamed from: i, reason: collision with root package name */
    public final u f12030i;

    /* renamed from: j, reason: collision with root package name */
    public String f12031j;

    /* renamed from: k, reason: collision with root package name */
    public final HashSet f12032k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f12033l;

    static {
        new AtomicInteger(1);
    }

    public g(final id.e eVar, fe.b bVar, ExecutorService executorService, u uVar) {
        eVar.a();
        je.c cVar = new je.c(eVar.f14480a, bVar);
        ie.c cVar2 = new ie.c(eVar);
        if (f1.m.f8810a == null) {
            f1.m.f8810a = new f1.m();
        }
        f1.m mVar = f1.m.f8810a;
        if (p.f12041d == null) {
            p.f12041d = new p(mVar);
        }
        p pVar = p.f12041d;
        q<ie.b> qVar = new q<>(new fe.b() { // from class: ge.c
            @Override // fe.b
            public final Object get() {
                return new ie.b(eVar);
            }
        });
        n nVar = new n();
        this.f12028g = new Object();
        this.f12032k = new HashSet();
        this.f12033l = new ArrayList();
        this.f12022a = eVar;
        this.f12023b = cVar;
        this.f12024c = cVar2;
        this.f12025d = pVar;
        this.f12026e = qVar;
        this.f12027f = nVar;
        this.f12029h = executorService;
        this.f12030i = uVar;
    }

    @Override // ge.h
    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        k kVar = new k(this.f12025d, taskCompletionSource);
        synchronized (this.f12028g) {
            this.f12033l.add(kVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f12029h.execute(new Runnable() { // from class: ge.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f12019a.b();
            }
        });
        return task;
    }

    /* JADX WARN: Finally extract failed */
    public final void b() {
        ie.a aVarC;
        synchronized (f12021m) {
            try {
                id.e eVar = this.f12022a;
                eVar.a();
                b bVarA = b.a(eVar.f14480a);
                try {
                    aVarC = this.f12024c.c();
                    c.a aVar = aVarC.f14500c;
                    if (aVar == c.a.f14519b || aVar == c.a.f14518a) {
                        String strE = e(aVarC);
                        ie.c cVar = this.f12024c;
                        a.C0136a c0136aH = aVarC.h();
                        c0136aH.f14506a = strE;
                        c0136aH.f14507b = c.a.f14520c;
                        aVarC = c0136aH.a();
                        cVar.b(aVarC);
                    }
                    if (bVarA != null) {
                        bVarA.b();
                    }
                } catch (Throwable th2) {
                    if (bVarA != null) {
                        bVarA.b();
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        h(aVarC);
        this.f12030i.execute(new Runnable() { // from class: ge.f
            /* JADX WARN: Finally extract failed */
            @Override // java.lang.Runnable
            public final void run() {
                ie.a aVarC2;
                ie.a aVarF;
                g gVar = this.f12020a;
                Object obj = g.f12021m;
                synchronized (obj) {
                    try {
                        id.e eVar2 = gVar.f12022a;
                        eVar2.a();
                        b bVarA2 = b.a(eVar2.f14480a);
                        try {
                            aVarC2 = gVar.f12024c.c();
                            if (bVarA2 != null) {
                                bVarA2.b();
                            }
                        } catch (Throwable th4) {
                            if (bVarA2 != null) {
                                bVarA2.b();
                            }
                            throw th4;
                        }
                    } finally {
                    }
                }
                try {
                    if (aVarC2.f() == c.a.f14522e) {
                        aVarF = gVar.f(aVarC2);
                    } else {
                        if (aVarC2.f() == c.a.f14520c) {
                            aVarF = gVar.f(aVarC2);
                        } else if (!gVar.f12025d.a(aVarC2)) {
                            return;
                        } else {
                            aVarF = gVar.c(aVarC2);
                        }
                    }
                    synchronized (obj) {
                        try {
                            id.e eVar3 = gVar.f12022a;
                            eVar3.a();
                            b bVarA3 = b.a(eVar3.f14480a);
                            try {
                                gVar.f12024c.b(aVarF);
                                if (bVarA3 != null) {
                                    bVarA3.b();
                                }
                            } catch (Throwable th5) {
                                if (bVarA3 != null) {
                                    bVarA3.b();
                                }
                                throw th5;
                            }
                        } finally {
                        }
                    }
                    synchronized (gVar) {
                        if (gVar.f12032k.size() != 0 && !TextUtils.equals(aVarC2.f14499b, aVarF.f14499b)) {
                            Iterator it = gVar.f12032k.iterator();
                            while (it.hasNext()) {
                                ((he.a) it.next()).a();
                            }
                        }
                    }
                    if (aVarF.f() == c.a.f14521d) {
                        String str = aVarF.f14499b;
                        synchronized (gVar) {
                            gVar.f12031j = str;
                        }
                    }
                    if (aVarF.f() == c.a.f14522e) {
                        gVar.g(new i());
                        return;
                    }
                    c.a aVar2 = aVarF.f14500c;
                    if (aVar2 == c.a.f14519b || aVar2 == c.a.f14518a) {
                        gVar.g(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                    } else {
                        gVar.h(aVarF);
                    }
                } catch (i e10) {
                    gVar.g(e10);
                }
            }
        });
    }

    public final ie.a c(ie.a aVar) throws i {
        int responseCode;
        je.b bVarF;
        je.c cVar = this.f12023b;
        id.e eVar = this.f12022a;
        eVar.a();
        String str = eVar.f14482c.f14492a;
        String str2 = aVar.f14499b;
        id.e eVar2 = this.f12022a;
        eVar2.a();
        String str3 = eVar2.f14482c.f14498g;
        String str4 = aVar.f14502e;
        je.e eVar3 = cVar.f15695c;
        if (!eVar3.a()) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = je.c.a("projects/" + str3 + "/installations/" + str2 + "/authTokens:generate");
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.addRequestProperty("Authorization", "FIS_v2 " + str4);
                    httpURLConnectionC.setDoOutput(true);
                    je.c.h(httpURLConnectionC);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar3.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                bVarF = je.c.f(httpURLConnectionC);
            } else {
                je.c.b(httpURLConnectionC, null, str, str3);
                if (responseCode == 401 || responseCode == 404) {
                    b.a aVarA = je.f.a();
                    aVarA.f15690c = f.b.f15706c;
                    bVarF = aVarA.a();
                } else {
                    if (responseCode == 429) {
                        throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        b.a aVarA2 = je.f.a();
                        aVarA2.f15690c = f.b.f15705b;
                        bVarF = aVarA2.a();
                    }
                }
            }
            int iOrdinal = bVarF.f15687c.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    a.C0136a c0136aH = aVar.h();
                    c0136aH.f14512g = "BAD CONFIG";
                    c0136aH.f14507b = c.a.f14522e;
                    return c0136aH.a();
                }
                if (iOrdinal != 2) {
                    throw new i("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f12031j = null;
                }
                a.C0136a c0136aH2 = aVar.h();
                c0136aH2.f14507b = c.a.f14519b;
                return c0136aH2.a();
            }
            String str5 = bVarF.f15685a;
            long j10 = bVarF.f15686b;
            p pVar = this.f12025d;
            pVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            pVar.f12042a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            a.C0136a c0136aH3 = aVar.h();
            c0136aH3.f14508c = str5;
            c0136aH3.f14510e = Long.valueOf(j10);
            c0136aH3.f14511f = Long.valueOf(seconds);
            return c0136aH3.a();
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void d() {
        id.e eVar = this.f12022a;
        eVar.a();
        com.google.android.gms.common.internal.p.e(eVar.f14482c.f14493b, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        com.google.android.gms.common.internal.p.e(eVar.f14482c.f14498g, "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        com.google.android.gms.common.internal.p.e(eVar.f14482c.f14492a, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        eVar.a();
        String str = eVar.f14482c.f14493b;
        Pattern pattern = p.f12040c;
        com.google.android.gms.common.internal.p.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        eVar.a();
        com.google.android.gms.common.internal.p.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", p.f12040c.matcher(eVar.f14482c.f14492a).matches());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String e(ie.a aVar) {
        String string;
        id.e eVar = this.f12022a;
        eVar.a();
        if (!eVar.f14481b.equals("CHIME_ANDROID_SDK")) {
            id.e eVar2 = this.f12022a;
            eVar2.a();
            if ("[DEFAULT]".equals(eVar2.f14481b)) {
                if (aVar.f14500c == c.a.f14518a) {
                    ie.b bVar = this.f12026e.get();
                    synchronized (bVar.f14514a) {
                        try {
                            synchronized (bVar.f14514a) {
                                string = bVar.f14514a.getString("|S|id", null);
                            }
                            if (string == null) {
                                string = bVar.a();
                            }
                        } finally {
                        }
                    }
                    if (!TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f12027f.getClass();
                    return n.a();
                }
            }
        }
        this.f12027f.getClass();
        return n.a();
    }

    public final ie.a f(ie.a aVar) throws i {
        int responseCode;
        je.a aVarE;
        String str = aVar.f14499b;
        String string = null;
        if (str != null && str.length() == 11) {
            ie.b bVar = this.f12026e.get();
            synchronized (bVar.f14514a) {
                try {
                    String[] strArr = ie.b.f14513c;
                    int i10 = 0;
                    while (true) {
                        if (i10 < 4) {
                            String str2 = strArr[i10];
                            String string2 = bVar.f14514a.getString("|T|" + bVar.f14515b + "|" + str2, null);
                            if (string2 == null || string2.isEmpty()) {
                                i10++;
                            } else if (string2.startsWith("{")) {
                                try {
                                    string = new JSONObject(string2).getString("token");
                                } catch (JSONException unused) {
                                }
                            } else {
                                string = string2;
                            }
                        }
                    }
                } finally {
                }
            }
        }
        je.c cVar = this.f12023b;
        id.e eVar = this.f12022a;
        eVar.a();
        String str3 = eVar.f14482c.f14492a;
        String str4 = aVar.f14499b;
        id.e eVar2 = this.f12022a;
        eVar2.a();
        String str5 = eVar2.f14482c.f14498g;
        id.e eVar3 = this.f12022a;
        eVar3.a();
        String str6 = eVar3.f14482c.f14493b;
        je.e eVar4 = cVar.f15695c;
        if (!eVar4.a()) {
            throw new i("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL urlA = je.c.a("projects/" + str5 + "/installations");
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection httpURLConnectionC = cVar.c(urlA, str3);
            try {
                try {
                    httpURLConnectionC.setRequestMethod("POST");
                    httpURLConnectionC.setDoOutput(true);
                    if (string != null) {
                        httpURLConnectionC.addRequestProperty("x-goog-fis-android-iid-migration-auth", string);
                    }
                    je.c.g(httpURLConnectionC, str4, str6);
                    responseCode = httpURLConnectionC.getResponseCode();
                    eVar4.b(responseCode);
                } finally {
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                }
            } catch (IOException | AssertionError unused2) {
            }
            if (responseCode >= 200 && responseCode < 300) {
                aVarE = je.c.e(httpURLConnectionC);
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            } else {
                je.c.b(httpURLConnectionC, str6, str3, str5);
                if (responseCode == 429) {
                    throw new i("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                }
                if (responseCode < 500 || responseCode >= 600) {
                    Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                    je.a aVar2 = new je.a(null, null, null, null, d.a.f15697b);
                    httpURLConnectionC.disconnect();
                    TrafficStats.clearThreadStatsTag();
                    aVarE = aVar2;
                }
                httpURLConnectionC.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
            int iOrdinal = aVarE.f15684e.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    throw new i("Firebase Installations Service is unavailable. Please try again later.");
                }
                a.C0136a c0136aH = aVar.h();
                c0136aH.f14512g = "BAD CONFIG";
                c0136aH.f14507b = c.a.f14522e;
                return c0136aH.a();
            }
            String str7 = aVarE.f15681b;
            String str8 = aVarE.f15682c;
            p pVar = this.f12025d;
            pVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            pVar.f12042a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            String strC = aVarE.f15683d.c();
            long jD = aVarE.f15683d.d();
            a.C0136a c0136aH2 = aVar.h();
            c0136aH2.f14506a = str7;
            c0136aH2.f14507b = c.a.f14521d;
            c0136aH2.f14508c = strC;
            c0136aH2.f14509d = str8;
            c0136aH2.f14510e = Long.valueOf(jD);
            c0136aH2.f14511f = Long.valueOf(seconds);
            return c0136aH2.a();
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void g(Exception exc) {
        synchronized (this.f12028g) {
            try {
                Iterator it = this.f12033l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).b(exc)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ge.h
    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f12031j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        l lVar = new l(taskCompletionSource);
        synchronized (this.f12028g) {
            this.f12033l.add(lVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f12029h.execute(new Runnable() { // from class: ge.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f12018a.b();
            }
        });
        return task;
    }

    public final void h(ie.a aVar) {
        synchronized (this.f12028g) {
            try {
                Iterator it = this.f12033l.iterator();
                while (it.hasNext()) {
                    if (((o) it.next()).a(aVar)) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
