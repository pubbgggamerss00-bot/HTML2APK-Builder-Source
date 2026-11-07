package com.google.firebase.iid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.Pair;
import androidx.datastore.preferences.protobuf.z;
import ce.i;
import com.google.android.gms.common.api.internal.y;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.a;
import de.d;
import de.k;
import de.n;
import ee.a;
import ge.h;
import id.e;
import id.l;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

@Deprecated
/* loaded from: classes2.dex */
public class FirebaseInstanceId {

    /* renamed from: j, reason: collision with root package name */
    public static a f6877j;

    /* renamed from: l, reason: collision with root package name */
    public static ScheduledThreadPoolExecutor f6879l;

    /* renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f6880a;

    /* renamed from: b, reason: collision with root package name */
    public final e f6881b;

    /* renamed from: c, reason: collision with root package name */
    public final n f6882c;

    /* renamed from: d, reason: collision with root package name */
    public final k f6883d;

    /* renamed from: e, reason: collision with root package name */
    public final y f6884e;

    /* renamed from: f, reason: collision with root package name */
    public final h f6885f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6886g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f6887h;

    /* renamed from: i, reason: collision with root package name */
    public static final long f6876i = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f6878k = Pattern.compile("\\AA[\\w-]{38}\\z");

    public FirebaseInstanceId() {
        throw null;
    }

    public FirebaseInstanceId(e eVar, fe.b<ne.h> bVar, fe.b<i> bVar2, h hVar) {
        eVar.a();
        n nVar = new n(eVar.f14480a);
        ThreadPoolExecutor threadPoolExecutorA = de.b.a();
        ThreadPoolExecutor threadPoolExecutorA2 = de.b.a();
        this.f6886g = false;
        this.f6887h = new ArrayList();
        if (n.b(eVar) == null) {
            throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
        }
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f6877j == null) {
                    eVar.a();
                    f6877j = new a(eVar.f14480a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f6881b = eVar;
        this.f6882c = nVar;
        this.f6883d = new k(eVar, nVar, bVar, bVar2, hVar);
        this.f6880a = threadPoolExecutorA2;
        this.f6884e = new y(threadPoolExecutorA);
        this.f6885f = hVar;
    }

    public static <T> T a(Task<T> task) throws InterruptedException {
        p.g(task, "Task must not be null");
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        task.addOnCompleteListener(d.f7872a, new OnCompleteListener(countDownLatch) { // from class: de.e

            /* renamed from: a, reason: collision with root package name */
            public final CountDownLatch f7873a;

            {
                this.f7873a = countDownLatch;
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                com.google.firebase.iid.a aVar = FirebaseInstanceId.f6877j;
                this.f7873a.countDown();
            }
        });
        countDownLatch.await(30000L, TimeUnit.MILLISECONDS);
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        if (task.isComplete()) {
            throw new IllegalStateException(task.getException());
        }
        throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
    }

    public static void c(e eVar) {
        eVar.a();
        l lVar = eVar.f14482c;
        p.e(lVar.f14498g, "Please set your project ID. A valid Firebase project ID is required to communicate with Firebase server APIs: It identifies your project with Google.");
        eVar.a();
        String str = lVar.f14493b;
        p.e(str, "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.");
        eVar.a();
        String str2 = lVar.f14492a;
        p.e(str2, "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.");
        eVar.a();
        p.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        eVar.a();
        p.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", f6878k.matcher(str2).matches());
    }

    public static void d(long j10, Runnable runnable) {
        synchronized (FirebaseInstanceId.class) {
            try {
                if (f6879l == null) {
                    f6879l = new ScheduledThreadPoolExecutor(1, new xa.b("FirebaseInstanceId"));
                }
                f6879l.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static FirebaseInstanceId getInstance(e eVar) {
        c(eVar);
        FirebaseInstanceId firebaseInstanceId = (FirebaseInstanceId) eVar.b(FirebaseInstanceId.class);
        p.g(firebaseInstanceId, "Firebase Instance ID component is not present");
        return firebaseInstanceId;
    }

    public final String b() throws IOException {
        final String str = "*";
        final String strB = n.b(this.f6881b);
        c(this.f6881b);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IOException("MAIN_THREAD");
        }
        try {
            return ((de.l) Tasks.await(Tasks.forResult(null).continueWithTask(this.f6880a, new Continuation(this, strB, str) { // from class: de.c

                /* renamed from: a, reason: collision with root package name */
                public final FirebaseInstanceId f7869a;

                /* renamed from: b, reason: collision with root package name */
                public final String f7870b;

                /* renamed from: c, reason: collision with root package name */
                public final String f7871c;

                {
                    this.f7869a = this;
                    this.f7870b = strB;
                    this.f7871c = str;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v4, types: [de.f] */
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task) {
                    final FirebaseInstanceId firebaseInstanceId = this.f7869a;
                    final String str2 = this.f7870b;
                    final String str3 = this.f7871c;
                    firebaseInstanceId.getClass();
                    try {
                        FirebaseInstanceId.f6877j.d(firebaseInstanceId.f6881b.f());
                        final String str4 = (String) FirebaseInstanceId.a(firebaseInstanceId.f6885f.getId());
                        final a.C0074a c0074aE = firebaseInstanceId.e(str2, str3);
                        if (!firebaseInstanceId.h(c0074aE)) {
                            return Tasks.forResult(new m(c0074aE.f6893a));
                        }
                        final y yVar = firebaseInstanceId.f6884e;
                        ?? r02 = new Object(firebaseInstanceId, str4, str2, str3, c0074aE) { // from class: de.f

                            /* renamed from: a, reason: collision with root package name */
                            public final FirebaseInstanceId f7874a;

                            /* renamed from: b, reason: collision with root package name */
                            public final String f7875b;

                            /* renamed from: c, reason: collision with root package name */
                            public final String f7876c;

                            /* renamed from: d, reason: collision with root package name */
                            public final String f7877d;

                            /* renamed from: e, reason: collision with root package name */
                            public final a.C0074a f7878e;

                            {
                                this.f7874a = firebaseInstanceId;
                                this.f7875b = str4;
                                this.f7876c = str2;
                                this.f7877d = str3;
                                this.f7878e = c0074aE;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:39:0x00f0 A[ADDED_TO_REGION] */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Task a() {
                                int i10;
                                String str5;
                                String strEncodeToString;
                                ce.i iVar;
                                ne.h hVar;
                                int iB;
                                PackageInfo packageInfoC;
                                final FirebaseInstanceId firebaseInstanceId2 = this.f7874a;
                                final String str6 = this.f7875b;
                                final String str7 = this.f7876c;
                                final String str8 = this.f7877d;
                                final a.C0074a c0074a = this.f7878e;
                                final k kVar = firebaseInstanceId2.f6883d;
                                kVar.getClass();
                                Bundle bundle = new Bundle();
                                bundle.putString("scope", str8);
                                bundle.putString("sender", str7);
                                bundle.putString("subtype", str7);
                                bundle.putString("appid", str6);
                                id.e eVar = kVar.f7886a;
                                eVar.a();
                                bundle.putString("gmp_app_id", eVar.f14482c.f14493b);
                                n nVar = kVar.f7887b;
                                synchronized (nVar) {
                                    try {
                                        if (nVar.f7896d == 0 && (packageInfoC = nVar.c("com.google.android.gms")) != null) {
                                            nVar.f7896d = packageInfoC.versionCode;
                                        }
                                        i10 = nVar.f7896d;
                                    } finally {
                                    }
                                }
                                bundle.putString("gmsv", Integer.toString(i10));
                                bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
                                bundle.putString("app_ver", kVar.f7887b.a());
                                n nVar2 = kVar.f7887b;
                                synchronized (nVar2) {
                                    try {
                                        if (nVar2.f7895c == null) {
                                            nVar2.d();
                                        }
                                        str5 = nVar2.f7895c;
                                    } finally {
                                    }
                                }
                                bundle.putString("app_ver_name", str5);
                                id.e eVar2 = kVar.f7886a;
                                eVar2.a();
                                try {
                                    strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA1).digest(eVar2.f14481b.getBytes()), 11);
                                } catch (NoSuchAlgorithmException unused) {
                                    strEncodeToString = "[HASH-ERROR]";
                                }
                                bundle.putString("firebase-app-name-hash", strEncodeToString);
                                try {
                                    String strA = ((ge.m) Tasks.await(kVar.f7891f.a())).a();
                                    if (TextUtils.isEmpty(strA)) {
                                        Log.w("FirebaseInstanceId", "FIS auth token is empty");
                                    } else {
                                        bundle.putString("Goog-Firebase-Installations-Auth", strA);
                                    }
                                } catch (InterruptedException e10) {
                                    e = e10;
                                    Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
                                    bundle.putString("cliv", "fiid-21.1.0");
                                    iVar = kVar.f7890e.get();
                                    hVar = kVar.f7889d.get();
                                    if (iVar != null) {
                                        bundle.putString("Firebase-Client-Log-Type", Integer.toString(z.a(iB)));
                                        bundle.putString("Firebase-Client", hVar.a());
                                    }
                                    return kVar.f7888c.a(bundle).continueWith(a.f7867a, new Continuation(kVar) { // from class: de.j

                                        /* renamed from: a, reason: collision with root package name */
                                        public final k f7885a;

                                        {
                                            this.f7885a = kVar;
                                        }

                                        @Override // com.google.android.gms.tasks.Continuation
                                        public final Object then(Task task2) throws IOException {
                                            this.f7885a.getClass();
                                            Bundle bundle2 = (Bundle) task2.getResult(IOException.class);
                                            if (bundle2 == null) {
                                                throw new IOException("SERVICE_NOT_AVAILABLE");
                                            }
                                            String string = bundle2.getString("registration_id");
                                            if (string != null) {
                                                return string;
                                            }
                                            String string2 = bundle2.getString("unregistered");
                                            if (string2 != null) {
                                                return string2;
                                            }
                                            String string3 = bundle2.getString("error");
                                            if ("RST".equals(string3)) {
                                                throw new IOException("INSTANCE_ID_RESET");
                                            }
                                            if (string3 != null) {
                                                throw new IOException(string3);
                                            }
                                            String strValueOf = String.valueOf(bundle2);
                                            Log.w("FirebaseInstanceId", b.o.a(new StringBuilder(strValueOf.length() + 21), "Unexpected response: ", strValueOf), new Throwable());
                                            throw new IOException("SERVICE_NOT_AVAILABLE");
                                        }
                                    }).onSuccessTask(firebaseInstanceId2.f6880a, new SuccessContinuation(firebaseInstanceId2, str7, str8, str6) { // from class: de.g

                                        /* renamed from: a, reason: collision with root package name */
                                        public final FirebaseInstanceId f7879a;

                                        /* renamed from: b, reason: collision with root package name */
                                        public final String f7880b;

                                        /* renamed from: c, reason: collision with root package name */
                                        public final String f7881c;

                                        {
                                            this.f7879a = firebaseInstanceId2;
                                            this.f7880b = str7;
                                            this.f7881c = str8;
                                        }

                                        @Override // com.google.android.gms.tasks.SuccessContinuation
                                        public final Task then(Object obj) {
                                            FirebaseInstanceId firebaseInstanceId3 = this.f7879a;
                                            String str9 = this.f7880b;
                                            String str10 = this.f7881c;
                                            String str11 = (String) obj;
                                            com.google.firebase.iid.a aVar = FirebaseInstanceId.f6877j;
                                            id.e eVar3 = firebaseInstanceId3.f6881b;
                                            eVar3.a();
                                            String strF = "[DEFAULT]".equals(eVar3.f14481b) ? "" : eVar3.f();
                                            String strA2 = firebaseInstanceId3.f6882c.a();
                                            synchronized (aVar) {
                                                String strA3 = a.C0074a.a(str11, strA2, System.currentTimeMillis());
                                                if (strA3 != null) {
                                                    SharedPreferences.Editor editorEdit = aVar.f6889a.edit();
                                                    editorEdit.putString(com.google.firebase.iid.a.b(strF, str9, str10), strA3);
                                                    editorEdit.commit();
                                                }
                                            }
                                            return Tasks.forResult(new m(str11));
                                        }
                                    }).addOnSuccessListener(h.f7882a, new OnSuccessListener(firebaseInstanceId2, c0074a) { // from class: de.i

                                        /* renamed from: a, reason: collision with root package name */
                                        public final FirebaseInstanceId f7883a;

                                        /* renamed from: b, reason: collision with root package name */
                                        public final a.C0074a f7884b;

                                        {
                                            this.f7883a = firebaseInstanceId2;
                                            this.f7884b = c0074a;
                                        }

                                        @Override // com.google.android.gms.tasks.OnSuccessListener
                                        public final void onSuccess(Object obj) {
                                            FirebaseInstanceId firebaseInstanceId3 = this.f7883a;
                                            firebaseInstanceId3.getClass();
                                            String strA2 = ((l) obj).a();
                                            a.C0074a c0074a2 = this.f7884b;
                                            if (c0074a2 == null || !strA2.equals(c0074a2.f6893a)) {
                                                ArrayList arrayList = firebaseInstanceId3.f6887h;
                                                int size = arrayList.size();
                                                int i11 = 0;
                                                while (i11 < size) {
                                                    Object obj2 = arrayList.get(i11);
                                                    i11++;
                                                    ((a.InterfaceC0090a) obj2).a();
                                                }
                                            }
                                        }
                                    });
                                } catch (ExecutionException e11) {
                                    e = e11;
                                    Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
                                    bundle.putString("cliv", "fiid-21.1.0");
                                    iVar = kVar.f7890e.get();
                                    hVar = kVar.f7889d.get();
                                    if (iVar != null) {
                                    }
                                    return kVar.f7888c.a(bundle).continueWith(a.f7867a, new Continuation(kVar) { // from class: de.j

                                        /* renamed from: a, reason: collision with root package name */
                                        public final k f7885a;

                                        {
                                            this.f7885a = kVar;
                                        }

                                        @Override // com.google.android.gms.tasks.Continuation
                                        public final Object then(Task task2) throws IOException {
                                            this.f7885a.getClass();
                                            Bundle bundle2 = (Bundle) task2.getResult(IOException.class);
                                            if (bundle2 == null) {
                                                throw new IOException("SERVICE_NOT_AVAILABLE");
                                            }
                                            String string = bundle2.getString("registration_id");
                                            if (string != null) {
                                                return string;
                                            }
                                            String string2 = bundle2.getString("unregistered");
                                            if (string2 != null) {
                                                return string2;
                                            }
                                            String string3 = bundle2.getString("error");
                                            if ("RST".equals(string3)) {
                                                throw new IOException("INSTANCE_ID_RESET");
                                            }
                                            if (string3 != null) {
                                                throw new IOException(string3);
                                            }
                                            String strValueOf = String.valueOf(bundle2);
                                            Log.w("FirebaseInstanceId", b.o.a(new StringBuilder(strValueOf.length() + 21), "Unexpected response: ", strValueOf), new Throwable());
                                            throw new IOException("SERVICE_NOT_AVAILABLE");
                                        }
                                    }).onSuccessTask(firebaseInstanceId2.f6880a, new SuccessContinuation(firebaseInstanceId2, str7, str8, str6) { // from class: de.g

                                        /* renamed from: a, reason: collision with root package name */
                                        public final FirebaseInstanceId f7879a;

                                        /* renamed from: b, reason: collision with root package name */
                                        public final String f7880b;

                                        /* renamed from: c, reason: collision with root package name */
                                        public final String f7881c;

                                        {
                                            this.f7879a = firebaseInstanceId2;
                                            this.f7880b = str7;
                                            this.f7881c = str8;
                                        }

                                        @Override // com.google.android.gms.tasks.SuccessContinuation
                                        public final Task then(Object obj) {
                                            FirebaseInstanceId firebaseInstanceId3 = this.f7879a;
                                            String str9 = this.f7880b;
                                            String str10 = this.f7881c;
                                            String str11 = (String) obj;
                                            com.google.firebase.iid.a aVar = FirebaseInstanceId.f6877j;
                                            id.e eVar3 = firebaseInstanceId3.f6881b;
                                            eVar3.a();
                                            String strF = "[DEFAULT]".equals(eVar3.f14481b) ? "" : eVar3.f();
                                            String strA2 = firebaseInstanceId3.f6882c.a();
                                            synchronized (aVar) {
                                                String strA3 = a.C0074a.a(str11, strA2, System.currentTimeMillis());
                                                if (strA3 != null) {
                                                    SharedPreferences.Editor editorEdit = aVar.f6889a.edit();
                                                    editorEdit.putString(com.google.firebase.iid.a.b(strF, str9, str10), strA3);
                                                    editorEdit.commit();
                                                }
                                            }
                                            return Tasks.forResult(new m(str11));
                                        }
                                    }).addOnSuccessListener(h.f7882a, new OnSuccessListener(firebaseInstanceId2, c0074a) { // from class: de.i

                                        /* renamed from: a, reason: collision with root package name */
                                        public final FirebaseInstanceId f7883a;

                                        /* renamed from: b, reason: collision with root package name */
                                        public final a.C0074a f7884b;

                                        {
                                            this.f7883a = firebaseInstanceId2;
                                            this.f7884b = c0074a;
                                        }

                                        @Override // com.google.android.gms.tasks.OnSuccessListener
                                        public final void onSuccess(Object obj) {
                                            FirebaseInstanceId firebaseInstanceId3 = this.f7883a;
                                            firebaseInstanceId3.getClass();
                                            String strA2 = ((l) obj).a();
                                            a.C0074a c0074a2 = this.f7884b;
                                            if (c0074a2 == null || !strA2.equals(c0074a2.f6893a)) {
                                                ArrayList arrayList = firebaseInstanceId3.f6887h;
                                                int size = arrayList.size();
                                                int i11 = 0;
                                                while (i11 < size) {
                                                    Object obj2 = arrayList.get(i11);
                                                    i11++;
                                                    ((a.InterfaceC0090a) obj2).a();
                                                }
                                            }
                                        }
                                    });
                                }
                                bundle.putString("cliv", "fiid-21.1.0");
                                iVar = kVar.f7890e.get();
                                hVar = kVar.f7889d.get();
                                if (iVar != null && hVar != null && (iB = iVar.b()) != 1) {
                                    bundle.putString("Firebase-Client-Log-Type", Integer.toString(z.a(iB)));
                                    bundle.putString("Firebase-Client", hVar.a());
                                }
                                return kVar.f7888c.a(bundle).continueWith(a.f7867a, new Continuation(kVar) { // from class: de.j

                                    /* renamed from: a, reason: collision with root package name */
                                    public final k f7885a;

                                    {
                                        this.f7885a = kVar;
                                    }

                                    @Override // com.google.android.gms.tasks.Continuation
                                    public final Object then(Task task2) throws IOException {
                                        this.f7885a.getClass();
                                        Bundle bundle2 = (Bundle) task2.getResult(IOException.class);
                                        if (bundle2 == null) {
                                            throw new IOException("SERVICE_NOT_AVAILABLE");
                                        }
                                        String string = bundle2.getString("registration_id");
                                        if (string != null) {
                                            return string;
                                        }
                                        String string2 = bundle2.getString("unregistered");
                                        if (string2 != null) {
                                            return string2;
                                        }
                                        String string3 = bundle2.getString("error");
                                        if ("RST".equals(string3)) {
                                            throw new IOException("INSTANCE_ID_RESET");
                                        }
                                        if (string3 != null) {
                                            throw new IOException(string3);
                                        }
                                        String strValueOf = String.valueOf(bundle2);
                                        Log.w("FirebaseInstanceId", b.o.a(new StringBuilder(strValueOf.length() + 21), "Unexpected response: ", strValueOf), new Throwable());
                                        throw new IOException("SERVICE_NOT_AVAILABLE");
                                    }
                                }).onSuccessTask(firebaseInstanceId2.f6880a, new SuccessContinuation(firebaseInstanceId2, str7, str8, str6) { // from class: de.g

                                    /* renamed from: a, reason: collision with root package name */
                                    public final FirebaseInstanceId f7879a;

                                    /* renamed from: b, reason: collision with root package name */
                                    public final String f7880b;

                                    /* renamed from: c, reason: collision with root package name */
                                    public final String f7881c;

                                    {
                                        this.f7879a = firebaseInstanceId2;
                                        this.f7880b = str7;
                                        this.f7881c = str8;
                                    }

                                    @Override // com.google.android.gms.tasks.SuccessContinuation
                                    public final Task then(Object obj) {
                                        FirebaseInstanceId firebaseInstanceId3 = this.f7879a;
                                        String str9 = this.f7880b;
                                        String str10 = this.f7881c;
                                        String str11 = (String) obj;
                                        com.google.firebase.iid.a aVar = FirebaseInstanceId.f6877j;
                                        id.e eVar3 = firebaseInstanceId3.f6881b;
                                        eVar3.a();
                                        String strF = "[DEFAULT]".equals(eVar3.f14481b) ? "" : eVar3.f();
                                        String strA2 = firebaseInstanceId3.f6882c.a();
                                        synchronized (aVar) {
                                            String strA3 = a.C0074a.a(str11, strA2, System.currentTimeMillis());
                                            if (strA3 != null) {
                                                SharedPreferences.Editor editorEdit = aVar.f6889a.edit();
                                                editorEdit.putString(com.google.firebase.iid.a.b(strF, str9, str10), strA3);
                                                editorEdit.commit();
                                            }
                                        }
                                        return Tasks.forResult(new m(str11));
                                    }
                                }).addOnSuccessListener(h.f7882a, new OnSuccessListener(firebaseInstanceId2, c0074a) { // from class: de.i

                                    /* renamed from: a, reason: collision with root package name */
                                    public final FirebaseInstanceId f7883a;

                                    /* renamed from: b, reason: collision with root package name */
                                    public final a.C0074a f7884b;

                                    {
                                        this.f7883a = firebaseInstanceId2;
                                        this.f7884b = c0074a;
                                    }

                                    @Override // com.google.android.gms.tasks.OnSuccessListener
                                    public final void onSuccess(Object obj) {
                                        FirebaseInstanceId firebaseInstanceId3 = this.f7883a;
                                        firebaseInstanceId3.getClass();
                                        String strA2 = ((l) obj).a();
                                        a.C0074a c0074a2 = this.f7884b;
                                        if (c0074a2 == null || !strA2.equals(c0074a2.f6893a)) {
                                            ArrayList arrayList = firebaseInstanceId3.f6887h;
                                            int size = arrayList.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj2 = arrayList.get(i11);
                                                i11++;
                                                ((a.InterfaceC0090a) obj2).a();
                                            }
                                        }
                                    }
                                });
                            }
                        };
                        synchronized (yVar) {
                            final Pair pair = new Pair(str2, str3);
                            Task task2 = (Task) ((p.a) yVar.f6070b).get(pair);
                            if (task2 != null) {
                                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                    String strValueOf = String.valueOf(pair);
                                    StringBuilder sb = new StringBuilder(strValueOf.length() + 29);
                                    sb.append("Joining ongoing request for: ");
                                    sb.append(strValueOf);
                                    Log.d("FirebaseInstanceId", sb.toString());
                                }
                                return task2;
                            }
                            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                                String strValueOf2 = String.valueOf(pair);
                                StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 24);
                                sb2.append("Making new request for: ");
                                sb2.append(strValueOf2);
                                Log.d("FirebaseInstanceId", sb2.toString());
                            }
                            Task taskContinueWithTask = r02.a().continueWithTask((ThreadPoolExecutor) yVar.f6069a, new Continuation(yVar, pair) { // from class: de.q

                                /* renamed from: a, reason: collision with root package name */
                                public final y f7900a;

                                /* renamed from: b, reason: collision with root package name */
                                public final Pair f7901b;

                                {
                                    this.f7900a = yVar;
                                    this.f7901b = pair;
                                }

                                @Override // com.google.android.gms.tasks.Continuation
                                public final Object then(Task task3) {
                                    y yVar2 = this.f7900a;
                                    Pair pair2 = this.f7901b;
                                    synchronized (yVar2) {
                                        ((p.a) yVar2.f6070b).remove(pair2);
                                    }
                                    return task3;
                                }
                            });
                            ((p.a) yVar.f6070b).put(pair, taskContinueWithTask);
                            return taskContinueWithTask;
                        }
                    } catch (InterruptedException e10) {
                        throw new IllegalStateException(e10);
                    }
                }
            }), 30000L, TimeUnit.MILLISECONDS)).a();
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e10);
            }
            if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                synchronized (this) {
                    f6877j.c();
                }
            }
            throw ((IOException) cause);
        }
    }

    public final a.C0074a e(String str, String str2) {
        a.C0074a c0074aB;
        a aVar = f6877j;
        e eVar = this.f6881b;
        eVar.a();
        String strF = "[DEFAULT]".equals(eVar.f14481b) ? "" : eVar.f();
        synchronized (aVar) {
            c0074aB = a.C0074a.b(aVar.f6889a.getString(a.b(strF, str, str2), null));
        }
        return c0074aB;
    }

    public final boolean f() {
        int i10;
        n nVar = this.f6882c;
        synchronized (nVar) {
            i10 = nVar.f7897e;
            if (i10 == 0) {
                PackageManager packageManager = nVar.f7893a.getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
                    i10 = 0;
                } else {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers == null || listQueryBroadcastReceivers.size() <= 0) {
                        Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
                    }
                    nVar.f7897e = 2;
                    i10 = 2;
                }
            }
        }
        return i10 != 0;
    }

    public final synchronized void g(long j10) {
        d(j10, new b(this, Math.min(Math.max(30L, j10 + j10), f6876i)));
        this.f6886g = true;
    }

    public final boolean h(a.C0074a c0074a) {
        if (c0074a != null) {
            return System.currentTimeMillis() > c0074a.f6895c + a.C0074a.f6891d || !this.f6882c.a().equals(c0074a.f6894b);
        }
        return true;
    }
}
