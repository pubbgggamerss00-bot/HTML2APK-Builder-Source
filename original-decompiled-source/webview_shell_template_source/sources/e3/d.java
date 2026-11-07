package e3;

import android.app.ActivityManager;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import d3.d;
import e3.i;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import w.b;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class d implements Handler.Callback {
    public static final Status G = new Status(4, "Sign-out occurred while this API call was in progress.", null, null);
    public static final Status H = new Status(4, "The user must be signed in to make this API call.", null, null);
    public static final Object I = new Object();
    public static d J;
    public final o3.f E;
    public volatile boolean F;

    /* renamed from: u, reason: collision with root package name */
    public com.google.android.gms.common.internal.o f12867u;

    /* renamed from: v, reason: collision with root package name */
    public g3.c f12868v;

    /* renamed from: w, reason: collision with root package name */
    public final Context f12869w;

    /* renamed from: x, reason: collision with root package name */
    public final c3.g f12870x;

    /* renamed from: y, reason: collision with root package name */
    public final com.google.android.gms.common.internal.y f12871y;
    public long s = 10000;

    /* renamed from: t, reason: collision with root package name */
    public boolean f12866t = false;

    /* renamed from: z, reason: collision with root package name */
    public final AtomicInteger f12872z = new AtomicInteger(1);
    public final AtomicInteger A = new AtomicInteger(0);
    public final ConcurrentHashMap B = new ConcurrentHashMap(5, 0.75f, 1);
    public final w.b C = new w.b(0);
    public final w.b D = new w.b(0);

    public d(Context context, Looper looper, c3.g gVar) {
        this.F = true;
        this.f12869w = context;
        o3.f fVar = new o3.f(looper, this);
        this.E = fVar;
        this.f12870x = gVar;
        this.f12871y = new com.google.android.gms.common.internal.y(gVar);
        PackageManager packageManager = context.getPackageManager();
        if (i3.d.f13368e == null) {
            i3.d.f13368e = Boolean.valueOf(i3.g.a() && packageManager.hasSystemFeature("android.hardware.type.automotive"));
        }
        if (i3.d.f13368e.booleanValue()) {
            this.F = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    public static Status c(a<?> aVar, c3.b bVar) {
        String str = aVar.f12851b.f12711b;
        String strValueOf = String.valueOf(bVar);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + strValueOf.length());
        sb.append("API: ");
        sb.append(str);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(strValueOf);
        return new Status(17, sb.toString(), bVar.f2167u, bVar);
    }

    public static d e(Context context) {
        d dVar;
        HandlerThread handlerThread;
        synchronized (I) {
            if (J == null) {
                synchronized (com.google.android.gms.common.internal.g.f2446a) {
                    try {
                        handlerThread = com.google.android.gms.common.internal.g.f2448c;
                        if (handlerThread == null) {
                            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                            com.google.android.gms.common.internal.g.f2448c = handlerThread2;
                            handlerThread2.start();
                            handlerThread = com.google.android.gms.common.internal.g.f2448c;
                        }
                    } finally {
                    }
                }
                J = new d(context.getApplicationContext(), handlerThread.getLooper(), c3.g.f2182d);
            }
            dVar = J;
        }
        return dVar;
    }

    public final boolean a() {
        if (this.f12866t) {
            return false;
        }
        com.google.android.gms.common.internal.n nVar = com.google.android.gms.common.internal.m.a().f2468a;
        if (nVar != null && !nVar.f2470t) {
            return false;
        }
        int i6 = this.f12871y.f2504a.get(203400000, -1);
        return i6 == -1 || i6 == 0;
    }

    public final boolean b(c3.b bVar, int i6) throws Resources.NotFoundException {
        c3.g gVar = this.f12870x;
        gVar.getClass();
        Context context = this.f12869w;
        if (!j3.b.b(context)) {
            int i7 = bVar.f2166t;
            PendingIntent activity = bVar.f2167u;
            if (!((i7 == 0 || activity == null) ? false : true)) {
                activity = null;
                Intent intentB = gVar.b(context, null, i7);
                if (intentB != null) {
                    activity = PendingIntent.getActivity(context, 0, intentB, 201326592);
                }
            }
            if (activity != null) {
                int i8 = GoogleApiActivity.f2393t;
                Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
                intent.putExtra("pending_intent", activity);
                intent.putExtra("failing_client_id", i6);
                intent.putExtra("notify_manager", true);
                gVar.g(context, i7, PendingIntent.getActivity(context, 0, intent, o3.e.f14016a | 134217728));
                return true;
            }
        }
        return false;
    }

    public final r<?> d(d3.d<?> dVar) {
        Object obj = dVar.f12717e;
        ConcurrentHashMap concurrentHashMap = this.B;
        r<?> rVar = (r) concurrentHashMap.get(obj);
        if (rVar == null) {
            rVar = new r<>(this, dVar);
            concurrentHashMap.put(obj, rVar);
        }
        if (rVar.f12894t.requiresSignIn()) {
            this.D.add(obj);
        }
        rVar.k();
        return rVar;
    }

    public final void f(c3.b bVar, int i6) {
        if (b(bVar, i6)) {
            return;
        }
        o3.f fVar = this.E;
        fVar.sendMessage(fVar.obtainMessage(5, i6, 0, bVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03aa  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        r rVar;
        boolean z6;
        c3.d[] dVarArrG;
        int i6 = message.what;
        switch (i6) {
            case 1:
                this.s = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.E.removeMessages(12);
                for (a aVar : this.B.keySet()) {
                    o3.f fVar = this.E;
                    fVar.sendMessageDelayed(fVar.obtainMessage(12, aVar), this.s);
                }
                return true;
            case 2:
                ((h0) message.obj).getClass();
                throw null;
            case 3:
                for (r rVar2 : this.B.values()) {
                    com.google.android.gms.common.internal.l.c(rVar2.E.E);
                    rVar2.C = null;
                    rVar2.k();
                }
                return true;
            case 4:
            case 8:
            case 13:
                z zVar = (z) message.obj;
                r<?> rVarD = (r) this.B.get(zVar.f12920c.f12717e);
                if (rVarD == null) {
                    rVarD = d(zVar.f12920c);
                }
                if (!rVarD.f12894t.requiresSignIn() || this.A.get() == zVar.f12919b) {
                    rVarD.l(zVar.f12918a);
                    return true;
                }
                zVar.f12918a.a(G);
                rVarD.o();
                return true;
            case 5:
                int i7 = message.arg1;
                c3.b bVar = (c3.b) message.obj;
                Iterator it = this.B.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        rVar = (r) it.next();
                        if (rVar.f12899y == i7) {
                        }
                    } else {
                        rVar = null;
                    }
                }
                if (rVar == null) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Could not find API instance ");
                    sb.append(i7);
                    sb.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb.toString(), new Exception());
                    return true;
                }
                if (bVar.f2166t != 13) {
                    rVar.b(c(rVar.f12895u, bVar));
                    return true;
                }
                c3.g gVar = this.f12870x;
                int i8 = bVar.f2166t;
                gVar.getClass();
                AtomicBoolean atomicBoolean = c3.k.f2186a;
                String strM = c3.b.m(i8);
                String str = bVar.f2168v;
                StringBuilder sb2 = new StringBuilder(String.valueOf(strM).length() + 69 + String.valueOf(str).length());
                sb2.append("Error resolution was canceled by the user, original error message: ");
                sb2.append(strM);
                sb2.append(": ");
                sb2.append(str);
                rVar.b(new Status(17, sb2.toString(), null, null));
                return true;
            case 6:
                if (this.f12869w.getApplicationContext() instanceof Application) {
                    Application application = (Application) this.f12869w.getApplicationContext();
                    b bVar2 = b.f12854w;
                    synchronized (bVar2) {
                        try {
                            if (!bVar2.f12857v) {
                                application.registerActivityLifecycleCallbacks(bVar2);
                                application.registerComponentCallbacks(bVar2);
                                bVar2.f12857v = true;
                            }
                        } finally {
                        }
                    }
                    o oVar = new o(this);
                    synchronized (bVar2) {
                        bVar2.f12856u.add(oVar);
                    }
                    AtomicBoolean atomicBoolean2 = bVar2.s;
                    AtomicBoolean atomicBoolean3 = bVar2.f12855t;
                    if (atomicBoolean3.get()) {
                        z6 = atomicBoolean2.get();
                        if (!z6) {
                            this.s = 300000L;
                        }
                    } else {
                        Boolean boolValueOf = i3.h.f13371a;
                        if (boolValueOf == null) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                boolValueOf = Boolean.valueOf(Process.isIsolated());
                            } else {
                                try {
                                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                                    Object[] objArr = new Object[0];
                                    if (objInvoke == null) {
                                        throw new p3.n(p3.m.a("expected a non-null reference", objArr));
                                    }
                                    boolValueOf = (Boolean) objInvoke;
                                } catch (ReflectiveOperationException unused) {
                                    boolValueOf = Boolean.FALSE;
                                }
                            }
                            i3.h.f13371a = boolValueOf;
                        }
                        if (boolValueOf.booleanValue()) {
                            z6 = true;
                            if (!z6) {
                            }
                        } else {
                            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
                            ActivityManager.getMyMemoryState(runningAppProcessInfo);
                            if (!atomicBoolean3.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                                atomicBoolean2.set(true);
                            }
                            z6 = atomicBoolean2.get();
                            if (!z6) {
                            }
                        }
                    }
                }
                return true;
            case 7:
                d((d3.d) message.obj);
                return true;
            case 9:
                if (this.B.containsKey(message.obj)) {
                    r rVar3 = (r) this.B.get(message.obj);
                    com.google.android.gms.common.internal.l.c(rVar3.E.E);
                    if (rVar3.A) {
                        rVar3.k();
                        return true;
                    }
                }
                return true;
            case 10:
                w.b bVar3 = this.D;
                bVar3.getClass();
                b.a aVar2 = new b.a();
                while (aVar2.hasNext()) {
                    r rVar4 = (r) this.B.remove((a) aVar2.next());
                    if (rVar4 != null) {
                        rVar4.o();
                    }
                }
                this.D.clear();
                return true;
            case 11:
                if (this.B.containsKey(message.obj)) {
                    r rVar5 = (r) this.B.get(message.obj);
                    d dVar = rVar5.E;
                    com.google.android.gms.common.internal.l.c(dVar.E);
                    boolean z7 = rVar5.A;
                    if (z7) {
                        Object obj = rVar5.f12895u;
                        o3.f fVar2 = rVar5.E.E;
                        if (z7) {
                            fVar2.removeMessages(11, obj);
                            fVar2.removeMessages(9, obj);
                            rVar5.A = false;
                        }
                        rVar5.b(dVar.f12870x.c(dVar.f12869w, c3.h.f2183a) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.", null, null) : new Status(22, "API failed to connect while resuming due to an unknown error.", null, null));
                        rVar5.f12894t.disconnect("Timing out connection while resuming.");
                        return true;
                    }
                }
                return true;
            case 12:
                if (this.B.containsKey(message.obj)) {
                    ((r) this.B.get(message.obj)).j(true);
                    return true;
                }
                return true;
            case 14:
                ((l) message.obj).getClass();
                if (!this.B.containsKey(null)) {
                    throw null;
                }
                ((r) this.B.get(null)).j(false);
                throw null;
            case 15:
                s sVar = (s) message.obj;
                if (this.B.containsKey(sVar.f12901a)) {
                    r rVar6 = (r) this.B.get(sVar.f12901a);
                    if (rVar6.B.contains(sVar) && !rVar6.A) {
                        if (rVar6.f12894t.isConnected()) {
                            rVar6.d();
                            return true;
                        }
                        rVar6.k();
                        return true;
                    }
                }
                return true;
            case 16:
                s sVar2 = (s) message.obj;
                if (this.B.containsKey(sVar2.f12901a)) {
                    r<?> rVar7 = (r) this.B.get(sVar2.f12901a);
                    ArrayList arrayList = rVar7.B;
                    d dVar2 = rVar7.E;
                    LinkedList<g0> linkedList = rVar7.s;
                    if (arrayList.remove(sVar2)) {
                        dVar2.E.removeMessages(15, sVar2);
                        dVar2.E.removeMessages(16, sVar2);
                        c3.d dVar3 = sVar2.f12902b;
                        ArrayList arrayList2 = new ArrayList(linkedList.size());
                        for (g0 g0Var : linkedList) {
                            if ((g0Var instanceof w) && (dVarArrG = ((w) g0Var).g(rVar7)) != null) {
                                int length = dVarArrG.length;
                                int i9 = 0;
                                while (true) {
                                    if (i9 >= length) {
                                        break;
                                    }
                                    if (!com.google.android.gms.common.internal.k.a(dVarArrG[i9], dVar3)) {
                                        i9++;
                                    } else if (i9 >= 0) {
                                        arrayList2.add(g0Var);
                                    }
                                }
                            }
                        }
                        int size = arrayList2.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            g0 g0Var2 = (g0) arrayList2.get(i10);
                            linkedList.remove(g0Var2);
                            g0Var2.b(new d3.k(dVar3));
                        }
                    }
                }
                return true;
            case 17:
                com.google.android.gms.common.internal.o oVar2 = this.f12867u;
                if (oVar2 != null) {
                    if (oVar2.s > 0 || a()) {
                        if (this.f12868v == null) {
                            this.f12868v = new g3.c(this.f12869w, g3.c.f13264i, com.google.android.gms.common.internal.p.f2478b, d.a.f12720b);
                        }
                        g3.c cVar = this.f12868v;
                        cVar.getClass();
                        i.a aVar3 = new i.a();
                        aVar3.f12883b = true;
                        aVar3.f12885d = 0;
                        c3.d[] dVarArr = {o3.d.f14014a};
                        aVar3.f12884c = dVarArr;
                        aVar3.f12883b = false;
                        aVar3.f12882a = new com.google.android.gms.ads.nonagon.signalgeneration.d(oVar2);
                        cVar.c(2, new c0(aVar3, dVarArr, false, 0));
                    }
                    this.f12867u = null;
                    return true;
                }
                return true;
            case 18:
                y yVar = (y) message.obj;
                if (yVar.f12916c == 0) {
                    com.google.android.gms.common.internal.o oVar3 = new com.google.android.gms.common.internal.o(yVar.f12915b, Arrays.asList(yVar.f12914a));
                    if (this.f12868v == null) {
                        this.f12868v = new g3.c(this.f12869w, g3.c.f13264i, com.google.android.gms.common.internal.p.f2478b, d.a.f12720b);
                    }
                    g3.c cVar2 = this.f12868v;
                    cVar2.getClass();
                    i.a aVar4 = new i.a();
                    aVar4.f12883b = true;
                    aVar4.f12885d = 0;
                    c3.d[] dVarArr2 = {o3.d.f14014a};
                    aVar4.f12884c = dVarArr2;
                    aVar4.f12883b = false;
                    aVar4.f12882a = new com.google.android.gms.ads.nonagon.signalgeneration.d(oVar3);
                    cVar2.c(2, new c0(aVar4, dVarArr2, false, 0));
                    return true;
                }
                com.google.android.gms.common.internal.o oVar4 = this.f12867u;
                if (oVar4 != null) {
                    List<com.google.android.gms.common.internal.j> list = oVar4.f2476t;
                    if (oVar4.s != yVar.f12915b || (list != null && list.size() >= yVar.f12917d)) {
                        this.E.removeMessages(17);
                        com.google.android.gms.common.internal.o oVar5 = this.f12867u;
                        if (oVar5 != null) {
                            if (oVar5.s > 0 || a()) {
                                if (this.f12868v == null) {
                                    this.f12868v = new g3.c(this.f12869w, g3.c.f13264i, com.google.android.gms.common.internal.p.f2478b, d.a.f12720b);
                                }
                                g3.c cVar3 = this.f12868v;
                                cVar3.getClass();
                                i.a aVar5 = new i.a();
                                aVar5.f12883b = true;
                                aVar5.f12885d = 0;
                                c3.d[] dVarArr3 = {o3.d.f14014a};
                                aVar5.f12884c = dVarArr3;
                                aVar5.f12883b = false;
                                aVar5.f12882a = new com.google.android.gms.ads.nonagon.signalgeneration.d(oVar5);
                                cVar3.c(2, new c0(aVar5, dVarArr3, false, 0));
                            }
                            this.f12867u = null;
                        }
                    } else {
                        com.google.android.gms.common.internal.o oVar6 = this.f12867u;
                        com.google.android.gms.common.internal.j jVar = yVar.f12914a;
                        if (oVar6.f2476t == null) {
                            oVar6.f2476t = new ArrayList();
                        }
                        oVar6.f2476t.add(jVar);
                    }
                }
                if (this.f12867u == null) {
                    ArrayList arrayList3 = new ArrayList();
                    arrayList3.add(yVar.f12914a);
                    this.f12867u = new com.google.android.gms.common.internal.o(yVar.f12915b, arrayList3);
                    o3.f fVar3 = this.E;
                    fVar3.sendMessageDelayed(fVar3.obtainMessage(17), yVar.f12916c);
                    return true;
                }
                return true;
            case 19:
                this.f12866t = false;
                return true;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i6);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
    }
}
