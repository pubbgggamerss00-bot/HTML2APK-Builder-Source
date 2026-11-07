package e3;

import android.content.Context;
import android.content.res.Resources;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.internal.ads.cg;
import d3.a;
import d3.a.c;
import d3.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class r<O extends a.c> implements e.a, e.b {
    public boolean A;
    public final /* synthetic */ d E;

    /* renamed from: t, reason: collision with root package name */
    public final a.e f12894t;

    /* renamed from: u, reason: collision with root package name */
    public final a<O> f12895u;

    /* renamed from: v, reason: collision with root package name */
    public final j f12896v;

    /* renamed from: y, reason: collision with root package name */
    public final int f12899y;

    /* renamed from: z, reason: collision with root package name */
    public final b0 f12900z;
    public final LinkedList s = new LinkedList();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f12897w = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f12898x = new HashMap();
    public final ArrayList B = new ArrayList();
    public c3.b C = null;
    public int D = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public r(d dVar, d3.d<O> dVar2) {
        this.E = dVar;
        o3.f fVar = dVar.E;
        Looper looper = fVar.getLooper();
        c.a aVarB = dVar2.b();
        com.google.android.gms.common.internal.c cVar = new com.google.android.gms.common.internal.c(aVarB.f2421a, aVarB.f2422b, aVarB.f2423c, aVarB.f2424d);
        a.AbstractC0045a<?, O> abstractC0045a = dVar2.f12715c.f12710a;
        com.google.android.gms.common.internal.l.f(abstractC0045a);
        a.e eVarA = abstractC0045a.a(dVar2.f12713a, looper, cVar, dVar2.f12716d, this, this);
        String str = dVar2.f12714b;
        if (str != null && (eVarA instanceof com.google.android.gms.common.internal.b)) {
            ((com.google.android.gms.common.internal.b) eVarA).setAttributionTag(str);
        }
        this.f12894t = eVarA;
        this.f12895u = dVar2.f12717e;
        this.f12896v = new j();
        this.f12899y = dVar2.f12718f;
        if (!eVarA.requiresSignIn()) {
            this.f12900z = null;
            return;
        }
        Context context = dVar.f12869w;
        c.a aVarB2 = dVar2.b();
        this.f12900z = new b0(context, fVar, new com.google.android.gms.common.internal.c(aVarB2.f2421a, aVarB2.f2422b, aVarB2.f2423c, aVarB2.f2424d));
    }

    public final void a(c3.b bVar) {
        HashSet hashSet = this.f12897w;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        h0 h0Var = (h0) it.next();
        if (com.google.android.gms.common.internal.k.a(bVar, c3.b.f2165x)) {
            this.f12894t.getEndpointPackageName();
        }
        h0Var.getClass();
        throw null;
    }

    public final void b(Status status) {
        com.google.android.gms.common.internal.l.c(this.E.E);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z6) {
        com.google.android.gms.common.internal.l.c(this.E.E);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.s.iterator();
        while (it.hasNext()) {
            g0 g0Var = (g0) it.next();
            if (!z6 || g0Var.f12878a == 2) {
                if (status != null) {
                    g0Var.a(status);
                } else {
                    g0Var.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.s;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i6 = 0; i6 < size; i6++) {
            g0 g0Var = (g0) arrayList.get(i6);
            if (!this.f12894t.isConnected()) {
                return;
            }
            if (h(g0Var)) {
                linkedList.remove(g0Var);
            }
        }
    }

    public final void e() {
        d dVar = this.E;
        com.google.android.gms.common.internal.l.c(dVar.E);
        this.C = null;
        a(c3.b.f2165x);
        o3.f fVar = dVar.E;
        if (this.A) {
            a<O> aVar = this.f12895u;
            fVar.removeMessages(11, aVar);
            fVar.removeMessages(9, aVar);
            this.A = false;
        }
        Iterator it = this.f12898x.values().iterator();
        if (it.hasNext()) {
            ((a0) it.next()).getClass();
            throw null;
        }
        d();
        g();
    }

    public final void f(int i6) {
        d dVar = this.E;
        o3.f fVar = dVar.E;
        com.google.android.gms.common.internal.l.c(dVar.E);
        this.C = null;
        this.A = true;
        String lastDisconnectMessage = this.f12894t.getLastDisconnectMessage();
        j jVar = this.f12896v;
        jVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i6 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i6 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (lastDisconnectMessage != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(lastDisconnectMessage);
        }
        jVar.a(true, new Status(20, sb.toString(), null, null));
        a<O> aVar = this.f12895u;
        Message messageObtain = Message.obtain(fVar, 9, aVar);
        Status status = d.G;
        fVar.sendMessageDelayed(messageObtain, 5000L);
        fVar.sendMessageDelayed(Message.obtain(fVar, 11, aVar), 120000L);
        dVar.f12871y.f2504a.clear();
        Iterator it = this.f12898x.values().iterator();
        if (it.hasNext()) {
            ((a0) it.next()).getClass();
            throw null;
        }
    }

    public final void g() {
        d dVar = this.E;
        o3.f fVar = dVar.E;
        a<O> aVar = this.f12895u;
        fVar.removeMessages(12, aVar);
        fVar.sendMessageDelayed(fVar.obtainMessage(12, aVar), dVar.s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean h(g0 g0Var) throws Resources.NotFoundException {
        c3.d dVar;
        if (!(g0Var instanceof w)) {
            j jVar = this.f12896v;
            a.e eVar = this.f12894t;
            g0Var.d(jVar, eVar.requiresSignIn());
            try {
                g0Var.c(this);
                return true;
            } catch (DeadObjectException unused) {
                n(1);
                eVar.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        w wVar = (w) g0Var;
        c3.d[] dVarArrG = wVar.g(this);
        if (dVarArrG == null || dVarArrG.length == 0) {
            dVar = null;
        } else {
            c3.d[] availableFeatures = this.f12894t.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new c3.d[0];
            }
            w.a aVar = new w.a(availableFeatures.length);
            for (c3.d dVar2 : availableFeatures) {
                aVar.put(dVar2.s, Long.valueOf(dVar2.l()));
            }
            int length = dVarArrG.length;
            for (int i6 = 0; i6 < length; i6++) {
                dVar = dVarArrG[i6];
                Long l4 = (Long) aVar.get(dVar.s);
                if (l4 == null || l4.longValue() < dVar.l()) {
                    break;
                }
            }
            dVar = null;
        }
        if (dVar == null) {
            j jVar2 = this.f12896v;
            a.e eVar2 = this.f12894t;
            g0Var.d(jVar2, eVar2.requiresSignIn());
            try {
                g0Var.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                n(1);
                eVar2.disconnect("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.f12894t.getClass().getName();
        String str = dVar.s;
        long jL = dVar.l();
        StringBuilder sb = new StringBuilder(name.length() + 77 + String.valueOf(str).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(str);
        sb.append(", ");
        sb.append(jL);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.E.F || !wVar.f(this)) {
            wVar.b(new d3.k(dVar));
            return true;
        }
        s sVar = new s(this.f12895u, dVar);
        int iIndexOf = this.B.indexOf(sVar);
        if (iIndexOf >= 0) {
            s sVar2 = (s) this.B.get(iIndexOf);
            this.E.E.removeMessages(15, sVar2);
            o3.f fVar = this.E.E;
            Message messageObtain = Message.obtain(fVar, 15, sVar2);
            Status status = d.G;
            fVar.sendMessageDelayed(messageObtain, 5000L);
        } else {
            this.B.add(sVar);
            o3.f fVar2 = this.E.E;
            Message messageObtain2 = Message.obtain(fVar2, 15, sVar);
            Status status2 = d.G;
            fVar2.sendMessageDelayed(messageObtain2, 5000L);
            o3.f fVar3 = this.E.E;
            fVar3.sendMessageDelayed(Message.obtain(fVar3, 16, sVar), 120000L);
            c3.b bVar = new c3.b(2, null, null);
            if (!i(bVar)) {
                this.E.b(bVar, this.f12899y);
            }
        }
        return false;
    }

    public final boolean i(c3.b bVar) {
        synchronized (d.I) {
        }
        return false;
    }

    @Override // e3.c
    public final void i1() {
        Looper looperMyLooper = Looper.myLooper();
        o3.f fVar = this.E.E;
        if (looperMyLooper == fVar.getLooper()) {
            e();
        } else {
            fVar.post(new com.google.android.gms.ads.internal.client.v(2, this));
        }
    }

    public final boolean j(boolean z6) {
        com.google.android.gms.common.internal.l.c(this.E.E);
        a.e eVar = this.f12894t;
        if (eVar.isConnected() && this.f12898x.size() == 0) {
            j jVar = this.f12896v;
            if (jVar.f12888a.isEmpty() && jVar.f12889b.isEmpty()) {
                eVar.disconnect("Timing out service connection.");
                return true;
            }
            if (z6) {
                g();
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v6, types: [d3.a$e, t3.f] */
    public final void k() {
        d dVar = this.E;
        com.google.android.gms.common.internal.l.c(dVar.E);
        a.e eVar = this.f12894t;
        if (eVar.isConnected() || eVar.isConnecting()) {
            return;
        }
        try {
            com.google.android.gms.common.internal.y yVar = dVar.f12871y;
            Context context = dVar.f12869w;
            SparseIntArray sparseIntArray = yVar.f2504a;
            com.google.android.gms.common.internal.l.f(context);
            int iC = 0;
            if (eVar.requiresGooglePlayServices()) {
                int minApkVersion = eVar.getMinApkVersion();
                int i6 = yVar.f2504a.get(minApkVersion, -1);
                if (i6 != -1) {
                    iC = i6;
                } else {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= sparseIntArray.size()) {
                            iC = -1;
                            break;
                        }
                        int iKeyAt = sparseIntArray.keyAt(i7);
                        if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                            break;
                        } else {
                            i7++;
                        }
                    }
                    if (iC == -1) {
                        iC = yVar.f2505b.c(context, minApkVersion);
                    }
                    sparseIntArray.put(minApkVersion, iC);
                }
            }
            if (iC != 0) {
                c3.b bVar = new c3.b(iC, null, null);
                String name = eVar.getClass().getName();
                String string = bVar.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                Log.w("GoogleApiManager", sb.toString());
                m(bVar, null);
                return;
            }
            u uVar = new u(dVar, eVar, this.f12895u);
            if (eVar.requiresSignIn()) {
                b0 b0Var = this.f12900z;
                com.google.android.gms.common.internal.l.f(b0Var);
                Handler handler = b0Var.f12859t;
                com.google.android.gms.common.internal.c cVar = b0Var.f12862w;
                t3.f fVar = b0Var.f12863x;
                if (fVar != null) {
                    fVar.disconnect();
                }
                cVar.f2420g = Integer.valueOf(System.identityHashCode(b0Var));
                b0Var.f12863x = b0Var.f12860u.a(b0Var.s, handler.getLooper(), cVar, cVar.f2419f, b0Var, b0Var);
                b0Var.f12864y = uVar;
                Set<Scope> set = b0Var.f12861v;
                if (set == null || set.isEmpty()) {
                    handler.post(new com.google.android.gms.ads.internal.client.x(2, b0Var));
                } else {
                    b0Var.f12863x.c();
                }
            }
            try {
                eVar.connect(uVar);
            } catch (SecurityException e6) {
                m(new c3.b(10, null, null), e6);
            }
        } catch (IllegalStateException e7) {
            m(new c3.b(10, null, null), e7);
        }
    }

    public final void l(w wVar) {
        com.google.android.gms.common.internal.l.c(this.E.E);
        boolean zIsConnected = this.f12894t.isConnected();
        LinkedList linkedList = this.s;
        if (zIsConnected) {
            if (h(wVar)) {
                g();
                return;
            } else {
                linkedList.add(wVar);
                return;
            }
        }
        linkedList.add(wVar);
        c3.b bVar = this.C;
        if (bVar == null || bVar.f2166t == 0 || bVar.f2167u == null) {
            k();
        } else {
            m(bVar, null);
        }
    }

    public final void m(c3.b bVar, RuntimeException runtimeException) {
        t3.f fVar;
        com.google.android.gms.common.internal.l.c(this.E.E);
        b0 b0Var = this.f12900z;
        if (b0Var != null && (fVar = b0Var.f12863x) != null) {
            fVar.disconnect();
        }
        com.google.android.gms.common.internal.l.c(this.E.E);
        this.C = null;
        this.E.f12871y.f2504a.clear();
        a(bVar);
        if ((this.f12894t instanceof g3.d) && bVar.f2166t != 24) {
            d dVar = this.E;
            dVar.f12866t = true;
            o3.f fVar2 = dVar.E;
            fVar2.sendMessageDelayed(fVar2.obtainMessage(19), 300000L);
        }
        if (bVar.f2166t == 4) {
            b(d.H);
            return;
        }
        if (this.s.isEmpty()) {
            this.C = bVar;
            return;
        }
        if (runtimeException != null) {
            com.google.android.gms.common.internal.l.c(this.E.E);
            c(null, runtimeException, false);
            return;
        }
        if (!this.E.F) {
            b(d.c(this.f12895u, bVar));
            return;
        }
        c(d.c(this.f12895u, bVar), null, true);
        if (this.s.isEmpty() || i(bVar) || this.E.b(bVar, this.f12899y)) {
            return;
        }
        if (bVar.f2166t == 18) {
            this.A = true;
        }
        if (!this.A) {
            b(d.c(this.f12895u, bVar));
        } else {
            o3.f fVar3 = this.E.E;
            fVar3.sendMessageDelayed(Message.obtain(fVar3, 9, this.f12895u), 5000L);
        }
    }

    @Override // e3.c
    public final void n(int i6) {
        Looper looperMyLooper = Looper.myLooper();
        o3.f fVar = this.E.E;
        if (looperMyLooper == fVar.getLooper()) {
            f(i6);
        } else {
            fVar.post(new cg(i6, 2, this));
        }
    }

    public final void o() {
        com.google.android.gms.common.internal.l.c(this.E.E);
        Status status = d.G;
        b(status);
        j jVar = this.f12896v;
        jVar.getClass();
        jVar.a(false, status);
        for (f fVar : (f[]) this.f12898x.keySet().toArray(new f[0])) {
            l(new f0(fVar, new v3.f()));
        }
        a(new c3.b(4, null, null));
        a.e eVar = this.f12894t;
        if (eVar.isConnected()) {
            eVar.onUserSignOut(new q(this));
        }
    }

    @Override // e3.g
    public final void r(c3.b bVar) {
        m(bVar, null);
    }
}
