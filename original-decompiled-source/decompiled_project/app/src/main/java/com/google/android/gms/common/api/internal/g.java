package com.google.android.gms.common.api.internal;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.internal.base.zac;
import com.google.android.gms.internal.base.zaf;
import com.google.android.gms.internal.base.zap;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;
import p.b;

/* loaded from: classes2.dex */
public final class g implements Handler.Callback {

    /* renamed from: p, reason: collision with root package name */
    public static final Status f5964p = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);

    /* renamed from: q, reason: collision with root package name */
    public static final Status f5965q = new Status(4, "The user must be signed in to make this API call.", null, null);

    /* renamed from: r, reason: collision with root package name */
    public static final Object f5966r = new Object();

    /* renamed from: s, reason: collision with root package name */
    public static g f5967s;

    /* renamed from: c, reason: collision with root package name */
    public com.google.android.gms.common.internal.t f5970c;

    /* renamed from: d, reason: collision with root package name */
    public ra.d f5971d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f5972e;

    /* renamed from: f, reason: collision with root package name */
    public final pa.d f5973f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.common.internal.e0 f5974g;

    /* renamed from: n, reason: collision with root package name */
    @NotOnlyInitialized
    public final zau f5981n;

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f5982o;

    /* renamed from: a, reason: collision with root package name */
    public long f5968a = 10000;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5969b = false;

    /* renamed from: h, reason: collision with root package name */
    public final AtomicInteger f5975h = new AtomicInteger(1);

    /* renamed from: i, reason: collision with root package name */
    public final AtomicInteger f5976i = new AtomicInteger(0);

    /* renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f5977j = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: k, reason: collision with root package name */
    public a0 f5978k = null;

    /* renamed from: l, reason: collision with root package name */
    public final p.b f5979l = new p.b(0);

    /* renamed from: m, reason: collision with root package name */
    public final p.b f5980m = new p.b(0);

    public g(Context context, Looper looper, pa.d dVar) {
        this.f5982o = true;
        this.f5972e = context;
        zau zauVar = new zau(looper, this);
        this.f5981n = zauVar;
        this.f5973f = dVar;
        this.f5974g = new com.google.android.gms.common.internal.e0(dVar);
        PackageManager packageManager = context.getPackageManager();
        if (wa.b.f31482d == null) {
            wa.b.f31482d = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (wa.b.f31482d.booleanValue()) {
            this.f5982o = false;
        }
        zauVar.sendMessage(zauVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (f5966r) {
            try {
                g gVar = f5967s;
                if (gVar != null) {
                    gVar.f5976i.incrementAndGet();
                    zau zauVar = gVar.f5981n;
                    zauVar.sendMessageAtFrontOfQueue(zauVar.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status e(b bVar, pa.a aVar) {
        return new Status(17, b6.a.b("API: ", bVar.f5939b.f5916c, " is not available on this device. Connection failed with: ", String.valueOf(aVar)), aVar.f21378c, aVar);
    }

    @ResultIgnorabilityUnspecified
    public static g h(Context context) {
        g gVar;
        HandlerThread handlerThread;
        synchronized (f5966r) {
            if (f5967s == null) {
                synchronized (com.google.android.gms.common.internal.h.f6143a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.h.f6145c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.h.f6145c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.h.f6145c;
                        }
                    } finally {
                    }
                }
                f5967s = new g(context.getApplicationContext(), handlerThread.getLooper(), pa.d.f21387d);
            }
            gVar = f5967s;
        }
        return gVar;
    }

    public final void b(a0 a0Var) {
        synchronized (f5966r) {
            try {
                if (this.f5978k != a0Var) {
                    this.f5978k = a0Var;
                    this.f5979l.clear();
                }
                this.f5979l.addAll(a0Var.f5928e);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean c() {
        if (this.f5969b) {
            return false;
        }
        com.google.android.gms.common.internal.r rVar = com.google.android.gms.common.internal.q.a().f6185a;
        if (rVar != null && !rVar.f6188b) {
            return false;
        }
        int i10 = this.f5974g.f6116a.get(203400000, -1);
        return i10 == -1 || i10 == 0;
    }

    @ResultIgnorabilityUnspecified
    public final boolean d(pa.a aVar, int i10) {
        boolean zBooleanValue;
        PendingIntent activity;
        Boolean bool;
        pa.d dVar = this.f5973f;
        Context context = this.f5972e;
        dVar.getClass();
        synchronized (ya.b.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = ya.b.f34354a;
            if (context2 == null || (bool = ya.b.f34355b) == null || context2 != applicationContext) {
                ya.b.f34355b = null;
                boolean zIsInstantApp = applicationContext.getPackageManager().isInstantApp();
                ya.b.f34355b = Boolean.valueOf(zIsInstantApp);
                ya.b.f34354a = applicationContext;
                zBooleanValue = zIsInstantApp;
            } else {
                zBooleanValue = bool.booleanValue();
            }
        }
        if (!zBooleanValue) {
            int i11 = aVar.f21377b;
            if ((i11 == 0 || aVar.f21378c == null) ? false : true) {
                activity = aVar.f21378c;
            } else {
                Intent intentA = dVar.a(context, null, i11);
                activity = intentA != null ? PendingIntent.getActivity(context, 0, intentA, 201326592) : null;
            }
            if (activity != null) {
                int i12 = aVar.f21377b;
                int i13 = GoogleApiActivity.f5901b;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i10);
                intent.putExtra("notify_manager", true);
                dVar.g(context, i12, PendingIntent.getActivity(context, 0, intent, zap.zaa | 134217728));
                return true;
            }
        }
        return false;
    }

    @ResultIgnorabilityUnspecified
    public final j0 f(com.google.android.gms.common.api.g gVar) {
        b apiKey = gVar.getApiKey();
        ConcurrentHashMap concurrentHashMap = this.f5977j;
        j0 j0Var = (j0) concurrentHashMap.get(apiKey);
        if (j0Var == null) {
            j0Var = new j0(this, gVar);
            concurrentHashMap.put(apiKey, j0Var);
        }
        if (j0Var.f5993b.requiresSignIn()) {
            this.f5980m.add(apiKey);
        }
        j0Var.m();
        return j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(TaskCompletionSource taskCompletionSource, int i10, com.google.android.gms.common.api.g gVar) {
        s0 s0Var;
        g gVar2;
        if (i10 != 0) {
            b apiKey = gVar.getApiKey();
            if (c()) {
                com.google.android.gms.common.internal.r rVar = com.google.android.gms.common.internal.q.a().f6185a;
                boolean z10 = true;
                if (rVar != null) {
                    if (rVar.f6188b) {
                        boolean z11 = rVar.f6189c;
                        j0 j0Var = (j0) this.f5977j.get(apiKey);
                        if (j0Var != null) {
                            Object obj = j0Var.f5993b;
                            if (obj instanceof com.google.android.gms.common.internal.b) {
                                com.google.android.gms.common.internal.b bVar = (com.google.android.gms.common.internal.b) obj;
                                if (!bVar.hasConnectionInfo() || bVar.isConnecting()) {
                                    z10 = z11;
                                } else {
                                    com.google.android.gms.common.internal.e eVarA = s0.a(j0Var, bVar, i10);
                                    if (eVarA != null) {
                                        j0Var.f6003n++;
                                        z10 = eVarA.f6112c;
                                    }
                                }
                            }
                        }
                    }
                    s0Var = null;
                    gVar2 = this;
                }
                gVar2 = this;
                s0Var = new s0(gVar2, i10, apiKey, z10 ? System.currentTimeMillis() : 0L, z10 ? SystemClock.elapsedRealtime() : 0L);
            } else {
                s0Var = null;
                gVar2 = this;
            }
            if (s0Var != null) {
                Task task = taskCompletionSource.getTask();
                final zau zauVar = gVar2.f5981n;
                zauVar.getClass();
                task.addOnCompleteListener(new Executor() { // from class: com.google.android.gms.common.api.internal.d0
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        zauVar.post(runnable);
                    }
                }, s0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0333  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        j0 j0Var;
        boolean z10;
        pa.c[] cVarArrG;
        int i10 = message.what;
        com.google.android.gms.common.internal.u uVar = com.google.android.gms.common.internal.u.f6200a;
        Context context = this.f5972e;
        zau zauVar = this.f5981n;
        ConcurrentHashMap concurrentHashMap = this.f5977j;
        switch (i10) {
            case 1:
                this.f5968a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                zauVar.removeMessages(12);
                Iterator it = concurrentHashMap.keySet().iterator();
                while (it.hasNext()) {
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(12, (b) it.next()), this.f5968a);
                }
                return true;
            case 2:
                ((l1) message.obj).getClass();
                throw null;
            case 3:
                for (j0 j0Var2 : concurrentHashMap.values()) {
                    com.google.android.gms.common.internal.p.c(j0Var2.f6004o.f5981n);
                    j0Var2.f6002m = null;
                    j0Var2.m();
                }
                return true;
            case 4:
            case 8:
            case 13:
                u0 u0Var = (u0) message.obj;
                com.google.android.gms.common.api.g gVar = u0Var.f6062c;
                k1 k1Var = u0Var.f6060a;
                j0 j0VarF = (j0) concurrentHashMap.get(gVar.getApiKey());
                if (j0VarF == null) {
                    j0VarF = f(u0Var.f6062c);
                }
                if (!j0VarF.f5993b.requiresSignIn() || this.f5976i.get() == u0Var.f6061b) {
                    j0VarF.n(k1Var);
                    return true;
                }
                k1Var.a(f5964p);
                j0VarF.q();
                return true;
            case 5:
                int i11 = message.arg1;
                pa.a aVar = (pa.a) message.obj;
                Iterator it2 = concurrentHashMap.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        j0Var = (j0) it2.next();
                        if (j0Var.f5998i == i11) {
                        }
                    } else {
                        j0Var = null;
                    }
                }
                if (j0Var == null) {
                    Log.wtf("GoogleApiManager", ad.b.b(i11, "Could not find API instance ", " while trying to fail enqueued calls."), new Exception());
                    return true;
                }
                if (aVar.f21377b != 13) {
                    j0Var.d(e(j0Var.f5994c, aVar));
                    return true;
                }
                int i12 = aVar.f21377b;
                this.f5973f.getClass();
                AtomicBoolean atomicBoolean = pa.i.f21393a;
                j0Var.d(new Status(17, b6.a.b("Error resolution was canceled by the user, original error message: ", pa.a.d(i12), ": ", aVar.f21379d), null, null));
                return true;
            case 6:
                if (context.getApplicationContext() instanceof Application) {
                    c.b((Application) context.getApplicationContext());
                    c cVar = c.f5945e;
                    cVar.a(new e0(this));
                    AtomicBoolean atomicBoolean2 = cVar.f5946a;
                    AtomicBoolean atomicBoolean3 = cVar.f5947b;
                    if (atomicBoolean3.get()) {
                        z10 = atomicBoolean2.get();
                        if (!z10) {
                            this.f5968a = 300000L;
                            return true;
                        }
                    } else {
                        Boolean boolValueOf = wa.e.f31486b;
                        if (boolValueOf == null) {
                            boolValueOf = Boolean.valueOf(Process.isIsolated());
                            wa.e.f31486b = boolValueOf;
                        }
                        if (boolValueOf.booleanValue()) {
                            z10 = true;
                            if (!z10) {
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                            z10 = atomicBoolean2.get();
                            if (!z10) {
                            }
                        }
                    }
                }
                return true;
            case 7:
                f((com.google.android.gms.common.api.g) message.obj);
                return true;
            case 9:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j0 j0Var3 = (j0) concurrentHashMap.get(message.obj);
                    com.google.android.gms.common.internal.p.c(j0Var3.f6004o.f5981n);
                    if (j0Var3.f6000k) {
                        j0Var3.m();
                        return true;
                    }
                }
                return true;
            case 10:
                p.b bVar = this.f5980m;
                bVar.getClass();
                b.a aVar2 = new b.a();
                while (aVar2.hasNext()) {
                    j0 j0Var4 = (j0) concurrentHashMap.remove((b) aVar2.next());
                    if (j0Var4 != null) {
                        j0Var4.q();
                    }
                }
                bVar.clear();
                return true;
            case 11:
                if (concurrentHashMap.containsKey(message.obj)) {
                    j0 j0Var5 = (j0) concurrentHashMap.get(message.obj);
                    g gVar2 = j0Var5.f6004o;
                    com.google.android.gms.common.internal.p.c(gVar2.f5981n);
                    boolean z11 = j0Var5.f6000k;
                    if (z11) {
                        b bVar2 = j0Var5.f5994c;
                        zau zauVar2 = j0Var5.f6004o.f5981n;
                        if (z11) {
                            zauVar2.removeMessages(11, bVar2);
                            zauVar2.removeMessages(9, bVar2);
                            j0Var5.f6000k = false;
                        }
                        j0Var5.d(gVar2.f5973f.c(gVar2.f5972e, pa.e.f21388a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        j0Var5.f5993b.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (concurrentHashMap.containsKey(message.obj)) {
                    ((j0) concurrentHashMap.get(message.obj)).l(true);
                    return true;
                }
                return true;
            case 14:
                b0 b0Var = (b0) message.obj;
                b bVar3 = b0Var.f5942a;
                TaskCompletionSource taskCompletionSource = b0Var.f5943b;
                if (concurrentHashMap.containsKey(bVar3)) {
                    taskCompletionSource.setResult(Boolean.valueOf(((j0) concurrentHashMap.get(bVar3)).l(false)));
                    return true;
                }
                taskCompletionSource.setResult(Boolean.FALSE);
                return true;
            case 15:
                k0 k0Var = (k0) message.obj;
                if (concurrentHashMap.containsKey(k0Var.f6006a)) {
                    j0 j0Var6 = (j0) concurrentHashMap.get(k0Var.f6006a);
                    if (j0Var6.f6001l.contains(k0Var) && !j0Var6.f6000k) {
                        if (j0Var6.f5993b.isConnected()) {
                            j0Var6.f();
                            return true;
                        }
                        j0Var6.m();
                        return true;
                    }
                }
                return true;
            case 16:
                k0 k0Var2 = (k0) message.obj;
                if (concurrentHashMap.containsKey(k0Var2.f6006a)) {
                    j0 j0Var7 = (j0) concurrentHashMap.get(k0Var2.f6006a);
                    ArrayList arrayList = j0Var7.f6001l;
                    zau zauVar3 = j0Var7.f6004o.f5981n;
                    LinkedList<k1> linkedList = j0Var7.f5992a;
                    if (arrayList.remove(k0Var2)) {
                        zauVar3.removeMessages(15, k0Var2);
                        zauVar3.removeMessages(16, k0Var2);
                        pa.c cVar2 = k0Var2.f6007b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (k1 k1Var2 : linkedList) {
                            if ((k1Var2 instanceof q0) && (cVarArrG = ((q0) k1Var2).g(j0Var7)) != null) {
                                int length = cVarArrG.length;
                                int i13 = 0;
                                while (true) {
                                    if (i13 >= length) {
                                        break;
                                    }
                                    if (!com.google.android.gms.common.internal.o.a(cVarArrG[i13], cVar2)) {
                                        i13++;
                                    } else if (i13 >= 0) {
                                        arrayList2.add(k1Var2);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            k1 k1Var3 = (k1) arrayList2.get(i14);
                            linkedList.remove(k1Var3);
                            k1Var3.b(new com.google.android.gms.common.api.p(cVar2));
                        }
                    }
                }
                return true;
            case 17:
                final com.google.android.gms.common.internal.t tVar = this.f5970c;
                if (tVar != null) {
                    if (tVar.f6195a > 0 || c()) {
                        if (this.f5971d == null) {
                            this.f5971d = new ra.d(context, ra.d.f23324a, uVar, g.a.f5924c);
                        }
                        ra.d dVar = this.f5971d;
                        dVar.getClass();
                        u.a aVarA = u.a();
                        aVarA.f6058c = new pa.c[]{zaf.zaa};
                        aVarA.f6057b = false;
                        aVarA.f6056a = new q() { // from class: ra.b
                            /* JADX WARN: Multi-variable type inference failed */
                            @Override // com.google.android.gms.common.api.internal.q
                            public final void accept(Object obj, Object obj2) throws RemoteException {
                                com.google.android.gms.common.api.a aVar3 = d.f23324a;
                                a aVar4 = (a) ((e) obj).getService();
                                Parcel parcelZaa = aVar4.zaa();
                                zac.zac(parcelZaa, tVar);
                                aVar4.zad(1, parcelZaa);
                                ((TaskCompletionSource) obj2).setResult(null);
                            }
                        };
                        dVar.doBestEffortWrite(aVarA.a());
                    }
                    this.f5970c = null;
                    return true;
                }
                return true;
            case 18:
                t0 t0Var = (t0) message.obj;
                long j10 = t0Var.f6048c;
                com.google.android.gms.common.internal.n nVar = t0Var.f6046a;
                int i15 = t0Var.f6047b;
                if (j10 == 0) {
                    final com.google.android.gms.common.internal.t tVar2 = new com.google.android.gms.common.internal.t(i15, Arrays.asList(nVar));
                    if (this.f5971d == null) {
                        this.f5971d = new ra.d(context, ra.d.f23324a, uVar, g.a.f5924c);
                    }
                    ra.d dVar2 = this.f5971d;
                    dVar2.getClass();
                    u.a aVarA2 = u.a();
                    aVarA2.f6058c = new pa.c[]{zaf.zaa};
                    aVarA2.f6057b = false;
                    aVarA2.f6056a = new q() { // from class: ra.b
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.google.android.gms.common.api.internal.q
                        public final void accept(Object obj, Object obj2) throws RemoteException {
                            com.google.android.gms.common.api.a aVar3 = d.f23324a;
                            a aVar4 = (a) ((e) obj).getService();
                            Parcel parcelZaa = aVar4.zaa();
                            zac.zac(parcelZaa, tVar2);
                            aVar4.zad(1, parcelZaa);
                            ((TaskCompletionSource) obj2).setResult(null);
                        }
                    };
                    dVar2.doBestEffortWrite(aVarA2.a());
                    return true;
                }
                com.google.android.gms.common.internal.t tVar3 = this.f5970c;
                if (tVar3 != null) {
                    List list = tVar3.f6196b;
                    if (tVar3.f6195a != i15 || (list != null && list.size() >= t0Var.f6049d)) {
                        zauVar.removeMessages(17);
                        final com.google.android.gms.common.internal.t tVar4 = this.f5970c;
                        if (tVar4 != null) {
                            if (tVar4.f6195a > 0 || c()) {
                                if (this.f5971d == null) {
                                    this.f5971d = new ra.d(context, ra.d.f23324a, uVar, g.a.f5924c);
                                }
                                ra.d dVar3 = this.f5971d;
                                dVar3.getClass();
                                u.a aVarA3 = u.a();
                                aVarA3.f6058c = new pa.c[]{zaf.zaa};
                                aVarA3.f6057b = false;
                                aVarA3.f6056a = new q() { // from class: ra.b
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // com.google.android.gms.common.api.internal.q
                                    public final void accept(Object obj, Object obj2) throws RemoteException {
                                        com.google.android.gms.common.api.a aVar3 = d.f23324a;
                                        a aVar4 = (a) ((e) obj).getService();
                                        Parcel parcelZaa = aVar4.zaa();
                                        zac.zac(parcelZaa, tVar4);
                                        aVar4.zad(1, parcelZaa);
                                        ((TaskCompletionSource) obj2).setResult(null);
                                    }
                                };
                                dVar3.doBestEffortWrite(aVarA3.a());
                            }
                            this.f5970c = null;
                        }
                    } else {
                        com.google.android.gms.common.internal.t tVar5 = this.f5970c;
                        if (tVar5.f6196b == null) {
                            tVar5.f6196b = new ArrayList();
                        }
                        tVar5.f6196b.add(nVar);
                    }
                }
                if (this.f5970c == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(nVar);
                    this.f5970c = new com.google.android.gms.common.internal.t(i15, arrayList3);
                    zauVar.sendMessageDelayed(zauVar.obtainMessage(17), t0Var.f6048c);
                    return true;
                }
                return true;
            case 19:
                this.f5969b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final void i(pa.a aVar, int i10) {
        if (d(aVar, i10)) {
            return;
        }
        zau zauVar = this.f5981n;
        zauVar.sendMessage(zauVar.obtainMessage(5, i10, 0, aVar));
    }
}
