package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.l;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* loaded from: classes2.dex */
public final class j0 implements h.a, h.b {

    /* renamed from: b, reason: collision with root package name */
    @NotOnlyInitialized
    public final a.f f5993b;

    /* renamed from: c, reason: collision with root package name */
    public final b f5994c;

    /* renamed from: d, reason: collision with root package name */
    public final z f5995d;

    /* renamed from: i, reason: collision with root package name */
    public final int f5998i;

    /* renamed from: j, reason: collision with root package name */
    public final a1 f5999j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f6000k;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f6004o;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f5992a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f5996e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f5997f = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f6001l = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public pa.a f6002m = null;

    /* renamed from: n, reason: collision with root package name */
    public int f6003n = 0;

    public j0(g gVar, com.google.android.gms.common.api.g gVar2) {
        this.f6004o = gVar;
        zau zauVar = gVar.f5981n;
        a.f fVarZab = gVar2.zab(zauVar.getLooper(), this);
        this.f5993b = fVarZab;
        this.f5994c = gVar2.getApiKey();
        this.f5995d = new z();
        this.f5998i = gVar2.zaa();
        if (fVarZab.requiresSignIn()) {
            this.f5999j = gVar2.zac(gVar.f5972e, zauVar);
        } else {
            this.f5999j = null;
        }
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void A() {
        Looper looperMyLooper = Looper.myLooper();
        zau zauVar = this.f6004o.f5981n;
        if (looperMyLooper == zauVar.getLooper()) {
            g();
        } else {
            zauVar.post(new f0(this));
        }
    }

    public final void a(pa.a aVar) {
        HashSet hashSet = this.f5996e;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        l1 l1Var = (l1) it.next();
        if (com.google.android.gms.common.internal.o.a(aVar, pa.a.f21375e)) {
            this.f5993b.getEndpointPackageName();
        }
        l1Var.getClass();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void b(pa.a aVar) {
        o(aVar, null);
    }

    @Override // com.google.android.gms.common.api.internal.f
    public final void c(int i10) {
        Looper looperMyLooper = Looper.myLooper();
        zau zauVar = this.f6004o.f5981n;
        if (looperMyLooper == zauVar.getLooper()) {
            h(i10);
        } else {
            zauVar.post(new g0(this, i10));
        }
    }

    public final void d(Status status) {
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        e(status, null, false);
    }

    public final void e(Status status, Exception exc, boolean z10) {
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f5992a.iterator();
        while (it.hasNext()) {
            k1 k1Var = (k1) it.next();
            if (!z10 || k1Var.f6008a == 2) {
                if (status != null) {
                    k1Var.a(status);
                } else {
                    k1Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void f() {
        LinkedList linkedList = this.f5992a;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            k1 k1Var = (k1) arrayList.get(i10);
            if (!this.f5993b.isConnected()) {
                return;
            }
            if (j(k1Var)) {
                linkedList.remove(k1Var);
            }
        }
    }

    public final void g() {
        g gVar = this.f6004o;
        com.google.android.gms.common.internal.p.c(gVar.f5981n);
        this.f6002m = null;
        a(pa.a.f21375e);
        zau zauVar = gVar.f5981n;
        if (this.f6000k) {
            b bVar = this.f5994c;
            zauVar.removeMessages(11, bVar);
            zauVar.removeMessages(9, bVar);
            this.f6000k = false;
        }
        Iterator it = this.f5997f.values().iterator();
        if (it.hasNext()) {
            ((v0) it.next()).getClass();
            throw null;
        }
        f();
        i();
    }

    public final void h(int i10) {
        g gVar = this.f6004o;
        zau zauVar = gVar.f5981n;
        com.google.android.gms.common.internal.p.c(gVar.f5981n);
        this.f6002m = null;
        this.f6000k = true;
        String lastDisconnectMessage = this.f5993b.getLastDisconnectMessage();
        z zVar = this.f5995d;
        zVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i10 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i10 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        zVar.a(new Status(20, sb.toString(), null, null), true);
        b bVar = this.f5994c;
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, bVar), 5000L);
        zauVar.sendMessageDelayed(Message.obtain(zauVar, 11, bVar), 120000L);
        gVar.f5974g.f6116a.clear();
        Iterator it = this.f5997f.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
    }

    public final void i() {
        g gVar = this.f6004o;
        zau zauVar = gVar.f5981n;
        b bVar = this.f5994c;
        zauVar.removeMessages(12, bVar);
        zauVar.sendMessageDelayed(zauVar.obtainMessage(12, bVar), gVar.f5968a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(k1 k1Var) {
        pa.c cVar;
        if (!(k1Var instanceof q0)) {
            z zVar = this.f5995d;
            a.f fVar = this.f5993b;
            k1Var.d(zVar, fVar.requiresSignIn());
            try {
                k1Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                c(1);
                fVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        q0 q0Var = (q0) k1Var;
        pa.c[] cVarArrG = q0Var.g(this);
        if (cVarArrG == null || cVarArrG.length == 0) {
            cVar = null;
        } else {
            pa.c[] availableFeatures = this.f5993b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new pa.c[0];
            }
            p.a aVar = new p.a(availableFeatures.length);
            for (pa.c cVar2 : availableFeatures) {
                aVar.put(cVar2.f21383a, Long.valueOf(cVar2.d()));
            }
            int length = cVarArrG.length;
            for (int i10 = 0; i10 < length; i10++) {
                cVar = cVarArrG[i10];
                Long l10 = (Long) aVar.get(cVar.f21383a);
                if (l10 == null || l10.longValue() < cVar.d()) {
                    break;
                }
            }
            cVar = null;
        }
        if (cVar == null) {
            z zVar2 = this.f5995d;
            a.f fVar2 = this.f5993b;
            k1Var.d(zVar2, fVar2.requiresSignIn());
            try {
                k1Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                c(1);
                fVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.f5993b.getClass().getName() + " could not execute call because it requires feature (" + cVar.f21383a + ", " + cVar.d() + ").");
        if (!this.f6004o.f5982o || !q0Var.f(this)) {
            q0Var.b(new com.google.android.gms.common.api.p(cVar));
            return true;
        }
        k0 k0Var = new k0(this.f5994c, cVar);
        int iIndexOf = this.f6001l.indexOf(k0Var);
        if (iIndexOf >= 0) {
            k0 k0Var2 = (k0) this.f6001l.get(iIndexOf);
            this.f6004o.f5981n.removeMessages(15, k0Var2);
            zau zauVar = this.f6004o.f5981n;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, k0Var2), 5000L);
            return false;
        }
        this.f6001l.add(k0Var);
        zau zauVar2 = this.f6004o.f5981n;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, k0Var), 5000L);
        zau zauVar3 = this.f6004o.f5981n;
        zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, k0Var), 120000L);
        pa.a aVar2 = new pa.a(2, null);
        if (!k(aVar2)) {
            this.f6004o.d(aVar2, this.f5998i);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
    
        if (r5.get() == null) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean k(pa.a aVar) {
        synchronized (g.f5966r) {
            try {
                g gVar = this.f6004o;
                if (gVar.f5978k == null || !gVar.f5979l.contains(this.f5994c)) {
                    return false;
                }
                a0 a0Var = this.f6004o.f5978k;
                int i10 = this.f5998i;
                a0Var.getClass();
                m1 m1Var = new m1(aVar, i10);
                loop0: while (true) {
                    AtomicReference atomicReference = a0Var.f6032b;
                    while (true) {
                        if (atomicReference.compareAndSet(null, m1Var)) {
                            a0Var.f6033c.post(new o1(a0Var, m1Var));
                            break loop0;
                        }
                        if (atomicReference.get() != null) {
                            break;
                        }
                    }
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean l(boolean z10) {
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        a.f fVar = this.f5993b;
        if (!fVar.isConnected() || !this.f5997f.isEmpty()) {
            return false;
        }
        z zVar = this.f5995d;
        if (zVar.f6072a.isEmpty() && zVar.f6073b.isEmpty()) {
            fVar.disconnect("Timing out service connection.");
            return true;
        }
        if (!z10) {
            return false;
        }
        i();
        return false;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.android.gms.common.api.a$f, jb.f] */
    public final void m() {
        g gVar = this.f6004o;
        com.google.android.gms.common.internal.p.c(gVar.f5981n);
        a.f fVar = this.f5993b;
        if (fVar.isConnected() || fVar.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.internal.e0 e0Var = gVar.f5974g;
            Context context = gVar.f5972e;
            SparseIntArray sparseIntArray = e0Var.f6116a;
            com.google.android.gms.common.internal.p.f(context);
            int iC = 0;
            if (fVar.requiresGooglePlayServices()) {
                int minApkVersion = fVar.getMinApkVersion();
                int i10 = e0Var.f6116a.get(minApkVersion, -1);
                if (i10 != -1) {
                    iC = i10;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i11);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                    if (iC == -1) {
                        iC = e0Var.f6117b.c(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iC);
                }
            }
            if (iC != 0) {
                pa.a aVar = new pa.a(iC, null);
                Log.w("GoogleApiManager", "The service for " + fVar.getClass().getName() + " is not available: " + aVar.toString());
                o(aVar, null);
                return;
            }
            m0 m0Var = new m0(gVar, fVar, this.f5994c);
            if (fVar.requiresSignIn()) {
                a1 a1Var = this.f5999j;
                com.google.android.gms.common.internal.p.f(a1Var);
                Handler handler = a1Var.f5932b;
                com.google.android.gms.common.internal.d dVar = a1Var.f5935e;
                jb.f fVar2 = a1Var.f5936f;
                if (fVar2 != null) {
                    fVar2.disconnect();
                }
                dVar.f6097h = Integer.valueOf(System.identityHashCode(a1Var));
                a1Var.f5936f = a1Var.f5933c.buildClient(a1Var.f5931a, handler.getLooper(), dVar, (Object) dVar.f6096g, (h.a) a1Var, (h.b) a1Var);
                a1Var.f5937i = m0Var;
                Set set = a1Var.f5934d;
                if (set == null || set.isEmpty()) {
                    handler.post(new y0(a1Var));
                } else {
                    a1Var.f5936f.a();
                }
            }
            try {
                fVar.connect(m0Var);
            } catch (SecurityException e10) {
                o(new pa.a(10), e10);
            }
        } catch (IllegalStateException e11) {
            o(new pa.a(10), e11);
        }
    }

    public final void n(k1 k1Var) {
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        boolean zIsConnected = this.f5993b.isConnected();
        LinkedList linkedList = this.f5992a;
        if (zIsConnected) {
            if (j(k1Var)) {
                i();
                return;
            } else {
                linkedList.add(k1Var);
                return;
            }
        }
        linkedList.add(k1Var);
        pa.a aVar = this.f6002m;
        if (aVar == null || aVar.f21377b == 0 || aVar.f21378c == null) {
            m();
        } else {
            o(aVar, null);
        }
    }

    public final void o(pa.a aVar, RuntimeException runtimeException) {
        jb.f fVar;
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        a1 a1Var = this.f5999j;
        if (a1Var != null && (fVar = a1Var.f5936f) != null) {
            fVar.disconnect();
        }
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        this.f6002m = null;
        this.f6004o.f5974g.f6116a.clear();
        a(aVar);
        if ((this.f5993b instanceof ra.e) && aVar.f21377b != 24) {
            g gVar = this.f6004o;
            gVar.f5969b = true;
            zau zauVar = gVar.f5981n;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (aVar.f21377b == 4) {
            d(g.f5965q);
            return;
        }
        if (this.f5992a.isEmpty()) {
            this.f6002m = aVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
            e(null, runtimeException, false);
            return;
        }
        if (!this.f6004o.f5982o) {
            d(g.e(this.f5994c, aVar));
            return;
        }
        e(g.e(this.f5994c, aVar), null, true);
        if (this.f5992a.isEmpty() || k(aVar) || this.f6004o.d(aVar, this.f5998i)) {
            return;
        }
        if (aVar.f21377b == 18) {
            this.f6000k = true;
        }
        if (!this.f6000k) {
            d(g.e(this.f5994c, aVar));
            return;
        }
        g gVar2 = this.f6004o;
        b bVar = this.f5994c;
        zau zauVar2 = gVar2.f5981n;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, bVar), 5000L);
    }

    public final void p(pa.a aVar) {
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        a.f fVar = this.f5993b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(aVar));
        o(aVar, null);
    }

    public final void q() {
        com.google.android.gms.common.internal.p.c(this.f6004o.f5981n);
        Status status = g.f5964p;
        d(status);
        z zVar = this.f5995d;
        zVar.getClass();
        zVar.a(status, false);
        for (l.a aVar : (l.a[]) this.f5997f.keySet().toArray(new l.a[0])) {
            n(new j1(aVar, new TaskCompletionSource()));
        }
        a(new pa.a(4));
        a.f fVar = this.f5993b;
        if (fVar.isConnected()) {
            fVar.onUserSignOut(new i0(this));
        }
    }
}
