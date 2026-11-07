package x0;

import android.util.Log;
import com.google.protobuf.DescriptorProtos;
import h1.i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ph.s1;

/* loaded from: classes.dex */
public final class k2 extends s {

    /* renamed from: x, reason: collision with root package name */
    public static final sh.z0 f31762x = sh.a1.a(d1.b.f7312d);

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReference<Boolean> f31763y = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: a, reason: collision with root package name */
    public final x0.e f31764a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f31765b;

    /* renamed from: c, reason: collision with root package name */
    public ph.s1 f31766c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f31767d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f31768e;

    /* renamed from: f, reason: collision with root package name */
    public Object f31769f;

    /* renamed from: g, reason: collision with root package name */
    public p.m0<Object> f31770g;

    /* renamed from: h, reason: collision with root package name */
    public final z0.b<f0> f31771h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f31772i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f31773j;

    /* renamed from: k, reason: collision with root package name */
    public final p.l0<Object, Object> f31774k;

    /* renamed from: l, reason: collision with root package name */
    public final o1 f31775l;

    /* renamed from: m, reason: collision with root package name */
    public final p.l0<j1, i1> f31776m;

    /* renamed from: n, reason: collision with root package name */
    public final p.l0<Object, Object> f31777n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f31778o;

    /* renamed from: p, reason: collision with root package name */
    public LinkedHashSet f31779p;

    /* renamed from: q, reason: collision with root package name */
    public ph.m f31780q;

    /* renamed from: r, reason: collision with root package name */
    public b f31781r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f31782s;

    /* renamed from: t, reason: collision with root package name */
    public final sh.z0 f31783t;

    /* renamed from: u, reason: collision with root package name */
    public final ph.u1 f31784u;

    /* renamed from: v, reason: collision with root package name */
    public final tg.h f31785v;

    /* renamed from: w, reason: collision with root package name */
    public final c f31786w;

    public static final class a {
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f31787a;

        public b(Throwable th2) {
            this.f31787a = th2;
        }
    }

    public final class c {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f31788a;

        /* renamed from: b, reason: collision with root package name */
        public static final d f31789b;

        /* renamed from: c, reason: collision with root package name */
        public static final d f31790c;

        /* renamed from: d, reason: collision with root package name */
        public static final d f31791d;

        /* renamed from: e, reason: collision with root package name */
        public static final d f31792e;

        /* renamed from: f, reason: collision with root package name */
        public static final d f31793f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ d[] f31794g;

        static {
            d dVar = new d("ShutDown", 0);
            f31788a = dVar;
            d dVar2 = new d("ShuttingDown", 1);
            f31789b = dVar2;
            d dVar3 = new d("Inactive", 2);
            f31790c = dVar3;
            d dVar4 = new d("InactivePendingWork", 3);
            f31791d = dVar4;
            d dVar5 = new d("Idle", 4);
            f31792e = dVar5;
            d dVar6 = new d("PendingWork", 5);
            f31793f = dVar6;
            d[] dVarArr = {dVar, dVar2, dVar3, dVar4, dVar5, dVar6};
            f31794g = dVarArr;
            i0.u2.e(dVarArr);
        }

        public d() {
            throw null;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f31794g.clone();
        }
    }

    public static final class e extends kotlin.jvm.internal.s implements eh.a<pg.f0> {
        public e() {
            super(0);
        }

        @Override // eh.a
        public final pg.f0 invoke() {
            ph.k<pg.f0> kVarX;
            k2 k2Var = k2.this;
            synchronized (k2Var.f31765b) {
                kVarX = k2Var.x();
                if (((d) k2Var.f31783t.getValue()).compareTo(d.f31789b) <= 0) {
                    Throwable th2 = k2Var.f31767d;
                    CancellationException cancellationException = new CancellationException("Recomposer shutdown; frame clock awaiter will never resume");
                    cancellationException.initCause(th2);
                    throw cancellationException;
                }
            }
            if (kVarX != null) {
                ((ph.m) kVarX).resumeWith(pg.f0.f21461a);
            }
            return pg.f0.f21461a;
        }
    }

    public static final class f extends kotlin.jvm.internal.s implements eh.l<Throwable, pg.f0> {
        public f() {
            super(1);
        }

        @Override // eh.l
        public final pg.f0 invoke(Throwable th2) {
            Throwable th3 = th2;
            CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
            cancellationException.initCause(th3);
            k2 k2Var = k2.this;
            synchronized (k2Var.f31765b) {
                try {
                    ph.s1 s1Var = k2Var.f31766c;
                    if (s1Var != null) {
                        sh.z0 z0Var = k2Var.f31783t;
                        d dVar = d.f31789b;
                        z0Var.getClass();
                        z0Var.j(null, dVar);
                        sh.z0 z0Var2 = k2.f31762x;
                        s1Var.cancel(cancellationException);
                        k2Var.f31780q = null;
                        s1Var.invokeOnCompletion(new l2(k2Var, th3));
                    } else {
                        k2Var.f31767d = cancellationException;
                        sh.z0 z0Var3 = k2Var.f31783t;
                        d dVar2 = d.f31788a;
                        z0Var3.getClass();
                        z0Var3.j(null, dVar2);
                        pg.f0 f0Var = pg.f0.f21461a;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return pg.f0.f21461a;
        }
    }

    public k2(tg.h hVar) {
        x0.e eVar = new x0.e(new e());
        this.f31764a = eVar;
        this.f31765b = new Object();
        this.f31768e = new ArrayList();
        this.f31770g = new p.m0<>((Object) null);
        this.f31771h = new z0.b<>(new f0[16]);
        this.f31772i = new ArrayList();
        this.f31773j = new ArrayList();
        this.f31774k = z0.a.b();
        this.f31775l = new o1();
        this.f31776m = p.w0.b();
        this.f31777n = z0.a.b();
        this.f31783t = sh.a1.a(d.f31790c);
        new AtomicReference(f1.j.f8805a);
        ph.u1 u1Var = new ph.u1((ph.s1) hVar.get(s1.a.f21589a));
        u1Var.invokeOnCompletion(new f());
        this.f31784u = u1Var;
        this.f31785v = hVar.plus(eVar).plus(u1Var);
        this.f31786w = new c();
    }

    public static final void C(ArrayList arrayList, k2 k2Var, v vVar) {
        arrayList.clear();
        synchronized (k2Var.f31765b) {
            try {
                Iterator it = k2Var.f31773j.iterator();
                while (it.hasNext()) {
                    j1 j1Var = (j1) it.next();
                    if (j1Var.f31720c.equals(vVar)) {
                        arrayList.add(j1Var);
                        it.remove();
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final f0 s(k2 k2Var, f0 f0Var, p.m0 m0Var) {
        LinkedHashSet linkedHashSet;
        h1.c cVarC;
        if (!f0Var.n() && !f0Var.k() && ((linkedHashSet = k2Var.f31779p) == null || !linkedHashSet.contains(f0Var))) {
            o2 o2Var = new o2(f0Var);
            r2 r2Var = new r2(m0Var, f0Var);
            h1.h hVarK = h1.n.k();
            h1.c cVar = hVarK instanceof h1.c ? (h1.c) hVarK : null;
            if (cVar == null || (cVarC = cVar.C(o2Var, r2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                h1.h hVarJ = cVarC.j();
                if (m0Var != null) {
                    try {
                        if (m0Var.c()) {
                            f0Var.c(new n2(m0Var, f0Var));
                        }
                    } catch (Throwable th2) {
                        h1.h.q(hVarJ);
                        throw th2;
                    }
                }
                boolean zS = f0Var.s();
                h1.h.q(hVarJ);
                if (zS) {
                    return f0Var;
                }
            } finally {
                u(cVarC);
            }
        }
        return null;
    }

    public static final boolean t(k2 k2Var) {
        List<f0> listA;
        synchronized (k2Var.f31765b) {
            boolean z10 = true;
            if (k2Var.f31770g.b()) {
                if (k2Var.f31771h.f34702c == 0 && !k2Var.y()) {
                    z10 = false;
                }
                return z10;
            }
            z0.d dVar = new z0.d(k2Var.f31770g);
            k2Var.f31770g = new p.m0<>((Object) null);
            synchronized (k2Var.f31765b) {
                listA = k2Var.A();
            }
            try {
                int size = listA.size();
                for (int i10 = 0; i10 < size; i10++) {
                    listA.get(i10).j(dVar);
                    if (((d) k2Var.f31783t.getValue()).compareTo(d.f31789b) <= 0) {
                        break;
                    }
                }
                synchronized (k2Var.f31765b) {
                    k2Var.f31770g = new p.m0<>((Object) null);
                    pg.f0 f0Var = pg.f0.f21461a;
                }
                synchronized (k2Var.f31765b) {
                    if (k2Var.x() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    if (k2Var.f31771h.f34702c == 0 && !k2Var.y()) {
                        z10 = false;
                    }
                }
                return z10;
            } catch (Throwable th2) {
                synchronized (k2Var.f31765b) {
                    p.m0<Object> m0Var = k2Var.f31770g;
                    m0Var.getClass();
                    Iterator<T> it = dVar.iterator();
                    while (it.hasNext()) {
                        m0Var.j(it.next());
                    }
                    throw th2;
                }
            }
        }
    }

    public static void u(h1.c cVar) {
        try {
            if (cVar.w() instanceof i.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            cVar.c();
        }
    }

    public static final void w(k2 k2Var, j1 j1Var, j1 j1Var2) {
        List<j1> list = j1Var2.f31725h;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                j1 j1Var3 = list.get(i10);
                o1 o1Var = k2Var.f31775l;
                g1<Object> g1Var = j1Var3.f31718a;
                z0.a.a(o1Var.f31835a, g1Var, new p1(j1Var3, j1Var));
                z0.a.a(o1Var.f31836b, j1Var, g1Var);
                w(k2Var, j1Var, j1Var3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<x0.f0>] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public final List<f0> A() {
        Object obj = this.f31769f;
        ?? r02 = obj;
        if (obj == null) {
            ArrayList arrayList = this.f31768e;
            RandomAccess arrayList2 = arrayList.isEmpty() ? qg.z.f22752a : new ArrayList(arrayList);
            this.f31769f = arrayList2;
            r02 = arrayList2;
        }
        return r02;
    }

    public final void B(v vVar) {
        synchronized (this.f31765b) {
            ArrayList arrayList = this.f31773j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((j1) arrayList.get(i10)).f31720c.equals(vVar)) {
                    pg.f0 f0Var = pg.f0.f21461a;
                    ArrayList arrayList2 = new ArrayList();
                    C(arrayList2, this, vVar);
                    while (!arrayList2.isEmpty()) {
                        D(arrayList2, null);
                        C(arrayList2, this, vVar);
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x0148, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x014d, code lost:
    
        if (r4 >= r3) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0157, code lost:
    
        if (((pg.n) r10.get(r4)).f21470b == 0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0159, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x015c, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x016a, code lost:
    
        if (r9 >= r4) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016c, code lost:
    
        r11 = (pg.n) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        if (r11.f21470b != 0) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0176, code lost:
    
        r11 = (x0.j1) r11.f21469a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x017d, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x017e, code lost:
    
        if (r11 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0180, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0183, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0186, code lost:
    
        r4 = r16.f31765b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0188, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0189, code lost:
    
        qg.t.p(r3, r16.f31773j);
        r3 = pg.f0.f21461a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0190, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0191, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x019f, code lost:
    
        if (r9 >= r4) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a1, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01aa, code lost:
    
        if (((pg.n) r11).f21470b == 0) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01ac, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01af, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b2, code lost:
    
        r10 = r3;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List<f0> D(List<j1> list, p.m0<Object> m0Var) {
        h1.c cVarC;
        ArrayList arrayList;
        HashMap map = new HashMap(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            j1 j1Var = list.get(i10);
            v vVar = j1Var.f31720c;
            Object arrayList2 = map.get(vVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(vVar, arrayList2);
            }
            ((ArrayList) arrayList2).add(j1Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            f0 f0Var = (f0) entry.getKey();
            List list2 = (List) entry.getValue();
            if (f0Var.n()) {
                q.c("Check failed");
            }
            o2 o2Var = new o2(f0Var);
            r2 r2Var = new r2(m0Var, f0Var);
            h1.h hVarK = h1.n.k();
            h1.c cVar = hVarK instanceof h1.c ? (h1.c) hVarK : null;
            if (cVar == null || (cVarC = cVar.C(o2Var, r2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                h1.h hVarJ = cVarC.j();
                try {
                    synchronized (this.f31765b) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i11 = 0; i11 < size2; i11++) {
                                j1 j1Var2 = (j1) list2.get(i11);
                                Object objC = z0.a.c(this.f31774k, j1Var2.f31718a);
                                j1 j1Var3 = (j1) objC;
                                if (j1Var3 != null) {
                                    this.f31775l.a(j1Var3);
                                }
                                arrayList.add(new pg.n(j1Var2, objC));
                            }
                            int size3 = arrayList.size();
                            int i12 = 0;
                            while (true) {
                                if (i12 >= size3) {
                                    break;
                                }
                                pg.n nVar = (pg.n) arrayList.get(i12);
                                if (nVar.f21470b == 0) {
                                    if (this.f31775l.f31835a.a(((j1) nVar.f21469a).f31718a)) {
                                        ArrayList arrayList3 = new ArrayList(qg.p.h(arrayList, 10));
                                        int size4 = arrayList.size();
                                        int i13 = 0;
                                        while (i13 < size4) {
                                            Object obj = arrayList.get(i13);
                                            i13++;
                                            pg.n nVar2 = (pg.n) obj;
                                            if (nVar2.f21470b == 0) {
                                                o1 o1Var = this.f31775l;
                                                g1<Object> g1Var = ((j1) nVar2.f21469a).f31718a;
                                                p.l0<Object, Object> l0Var = o1Var.f31835a;
                                                p1 p1Var = (p1) z0.a.c(l0Var, g1Var);
                                                if (l0Var.e()) {
                                                    o1Var.f31836b.f();
                                                }
                                                if (p1Var != null) {
                                                    j1 j1Var4 = p1Var.f31849a;
                                                    z0.a.a(this.f31777n, p1Var.f31850b, j1Var4);
                                                    nVar2 = new pg.n(nVar2.f21469a, j1Var4);
                                                }
                                            }
                                            arrayList3.add(nVar2);
                                        }
                                        arrayList = arrayList3;
                                    }
                                }
                                i12++;
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= size5) {
                            break;
                        }
                        if (((pg.n) arrayList.get(i14)).f21470b != 0) {
                            break;
                        }
                        i14++;
                    }
                    f0Var.f(arrayList);
                    pg.f0 f0Var2 = pg.f0.f21461a;
                    h1.h.q(hVarJ);
                } catch (Throwable th2) {
                    h1.h.q(hVarJ);
                    throw th2;
                }
            } finally {
                u(cVarC);
            }
        }
        return qg.x.c0(map.keySet());
    }

    public final void E(Throwable th2, v vVar) throws Throwable {
        if (!f31763y.get().booleanValue() || (th2 instanceof i)) {
            synchronized (this.f31765b) {
                b bVar = this.f31781r;
                if (bVar != null) {
                    throw bVar.f31787a;
                }
                this.f31781r = new b(th2);
                pg.f0 f0Var = pg.f0.f21461a;
            }
            throw th2;
        }
        synchronized (this.f31765b) {
            try {
                Log.e("ComposeInternal", "Error was captured in composition while live edit was enabled.", th2);
                this.f31772i.clear();
                this.f31771h.g();
                this.f31770g = new p.m0<>((Object) null);
                this.f31773j.clear();
                this.f31774k.f();
                this.f31776m.f();
                this.f31781r = new b(th2);
                if (vVar != null) {
                    F(vVar);
                }
                x();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void F(f0 f0Var) {
        ArrayList arrayList = this.f31778o;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f31778o = arrayList;
        }
        if (!arrayList.contains(f0Var)) {
            arrayList.add(f0Var);
        }
        if (this.f31768e.remove(f0Var)) {
            this.f31769f = null;
        }
    }

    @Override // x0.s
    public final void a(v vVar, f1.b bVar) throws Throwable {
        h1.c cVarC;
        boolean z10 = vVar.f31942v.E;
        try {
            o2 o2Var = new o2(vVar);
            r2 r2Var = new r2(null, vVar);
            h1.h hVarK = h1.n.k();
            h1.c cVar = hVarK instanceof h1.c ? (h1.c) hVarK : null;
            if (cVar == null || (cVarC = cVar.C(o2Var, r2Var)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            try {
                h1.h hVarJ = cVarC.j();
                try {
                    vVar.x(bVar);
                    pg.f0 f0Var = pg.f0.f21461a;
                    if (!z10) {
                        h1.n.k().m();
                    }
                    synchronized (this.f31765b) {
                        if (((d) this.f31783t.getValue()).compareTo(d.f31789b) > 0 && !A().contains(vVar)) {
                            this.f31768e.add(vVar);
                            this.f31769f = null;
                        }
                    }
                    try {
                        B(vVar);
                        try {
                            vVar.m();
                            vVar.i();
                            if (z10) {
                                return;
                            }
                            h1.n.k().m();
                        } catch (Throwable th2) {
                            E(th2, null);
                        }
                    } catch (Throwable th3) {
                        E(th3, vVar);
                    }
                } finally {
                    h1.h.q(hVarJ);
                }
            } finally {
                u(cVarC);
            }
        } catch (Throwable th4) {
            E(th4, vVar);
        }
    }

    @Override // x0.s
    public final void b(j1 j1Var) {
        synchronized (this.f31765b) {
            try {
                z0.a.a(this.f31774k, j1Var.f31718a, j1Var);
                if (j1Var.f31725h != null) {
                    w(this, j1Var, j1Var);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.s
    public final boolean d() {
        return f31763y.get().booleanValue();
    }

    @Override // x0.s
    public final boolean e() {
        return false;
    }

    @Override // x0.s
    public final boolean f() {
        return false;
    }

    @Override // x0.s
    public final int h() {
        return DescriptorProtos.Edition.EDITION_2023_VALUE;
    }

    @Override // x0.s
    public final tg.h i() {
        return this.f31785v;
    }

    @Override // x0.s
    public final void j(v vVar) {
        ph.k<pg.f0> kVarX;
        synchronized (this.f31765b) {
            if (this.f31771h.h(vVar)) {
                kVarX = null;
            } else {
                this.f31771h.b(vVar);
                kVarX = x();
            }
        }
        if (kVarX != null) {
            ((ph.m) kVarX).resumeWith(pg.f0.f21461a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    @Override // x0.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(j1 j1Var, i1 i1Var, x0.d<?> dVar) {
        p.q0 q0Var;
        synchronized (this.f31765b) {
            try {
                this.f31776m.l(j1Var, i1Var);
                Object objD = this.f31777n.d(j1Var);
                if (objD == null) {
                    q0Var = p.r0.f20711b;
                    kotlin.jvm.internal.r.c(q0Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
                } else if (objD instanceof p.h0) {
                    q0Var = (p.q0) objD;
                } else {
                    Object[] objArr = p.r0.f20710a;
                    p.h0 h0Var = new p.h0(1);
                    h0Var.g(objD);
                    q0Var = h0Var;
                }
                if (q0Var.e()) {
                    p.l0 l0VarB = i1Var.b(dVar, q0Var);
                    Object[] objArr2 = l0VarB.f20738b;
                    Object[] objArr3 = l0VarB.f20739c;
                    long[] jArr = l0VarB.f20737a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i10 = 0;
                        while (true) {
                            long j10 = jArr[i10];
                            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i11 = 8 - ((~(i10 - length)) >>> 31);
                                for (int i12 = 0; i12 < i11; i12++) {
                                    if ((255 & j10) < 128) {
                                        int i13 = (i10 << 3) + i12;
                                        Object obj = objArr2[i13];
                                        this.f31776m.l((j1) obj, (i1) objArr3[i13]);
                                    }
                                    j10 >>= 8;
                                }
                                if (i11 != 8) {
                                    break;
                                } else if (i10 == length) {
                                    break;
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.s
    public final i1 l(j1 j1Var) {
        i1 i1VarJ;
        synchronized (this.f31765b) {
            i1VarJ = this.f31776m.j(j1Var);
        }
        return i1VarJ;
    }

    @Override // x0.s
    public final void m(Set<i1.a> set) {
    }

    @Override // x0.s
    public final void o(v vVar) {
        synchronized (this.f31765b) {
            try {
                LinkedHashSet linkedHashSet = this.f31779p;
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    this.f31779p = linkedHashSet;
                }
                linkedHashSet.add(vVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // x0.s
    public final void r(v vVar) {
        synchronized (this.f31765b) {
            if (this.f31768e.remove(vVar)) {
                this.f31769f = null;
            }
            this.f31771h.j(vVar);
            this.f31772i.remove(vVar);
            pg.f0 f0Var = pg.f0.f21461a;
        }
    }

    public final void v() {
        synchronized (this.f31765b) {
            try {
                if (((d) this.f31783t.getValue()).compareTo(d.f31792e) >= 0) {
                    sh.z0 z0Var = this.f31783t;
                    d dVar = d.f31789b;
                    z0Var.getClass();
                    z0Var.j(null, dVar);
                }
                pg.f0 f0Var = pg.f0.f21461a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f31784u.cancel((CancellationException) null);
    }

    public final ph.k<pg.f0> x() {
        d dVar;
        sh.z0 z0Var = this.f31783t;
        int iCompareTo = ((d) z0Var.getValue()).compareTo(d.f31789b);
        ArrayList arrayList = this.f31773j;
        ArrayList arrayList2 = this.f31772i;
        z0.b<f0> bVar = this.f31771h;
        if (iCompareTo <= 0) {
            this.f31768e.clear();
            this.f31769f = qg.z.f22752a;
            this.f31770g = new p.m0<>((Object) null);
            bVar.g();
            arrayList2.clear();
            arrayList.clear();
            this.f31778o = null;
            ph.m mVar = this.f31780q;
            if (mVar != null) {
                mVar.cancel(null);
            }
            this.f31780q = null;
            this.f31781r = null;
            return null;
        }
        if (this.f31781r != null) {
            dVar = d.f31790c;
        } else if (this.f31766c == null) {
            this.f31770g = new p.m0<>((Object) null);
            bVar.g();
            dVar = y() ? d.f31791d : d.f31790c;
        } else {
            dVar = (bVar.f34702c == 0 && !this.f31770g.c() && arrayList2.isEmpty() && arrayList.isEmpty() && !y()) ? d.f31792e : d.f31793f;
        }
        z0Var.getClass();
        z0Var.j(null, dVar);
        if (dVar != d.f31793f) {
            return null;
        }
        ph.m mVar2 = this.f31780q;
        this.f31780q = null;
        return mVar2;
    }

    public final boolean y() {
        return (this.f31782s || this.f31764a.f31661f.get() == 0) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean z() {
        boolean z10;
        synchronized (this.f31765b) {
            if (this.f31770g.c() || this.f31771h.f34702c != 0) {
                z10 = true;
            } else if (!y()) {
                z10 = false;
            }
        }
        return z10;
    }
}
