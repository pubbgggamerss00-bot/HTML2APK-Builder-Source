package xh;

import androidx.datastore.preferences.protobuf.z0;
import c0.g0;
import eh.p;
import eh.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import pg.f0;
import ph.b1;
import ph.m;
import ph.y2;
import qg.x;
import uh.s;
import uh.v;

/* loaded from: classes2.dex */
public final class h<R> implements ph.j, j, y2 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f33581f = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "state$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final tg.h f33582a;

    /* renamed from: c, reason: collision with root package name */
    public Object f33584c;
    private volatile /* synthetic */ Object state$volatile = k.f33600a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f33583b = new ArrayList(2);

    /* renamed from: d, reason: collision with root package name */
    public int f33585d = -1;

    /* renamed from: e, reason: collision with root package name */
    public Object f33586e = k.f33603d;

    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f33587a;

        /* renamed from: b, reason: collision with root package name */
        public final q<Object, j<?>, Object, f0> f33588b;

        /* renamed from: c, reason: collision with root package name */
        public final q<Object, Object, Object, Object> f33589c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f33590d;

        /* renamed from: e, reason: collision with root package name */
        public final vg.i f33591e;

        /* renamed from: f, reason: collision with root package name */
        public final q<j<?>, Object, Object, q<Throwable, Object, tg.h, f0>> f33592f;

        /* renamed from: g, reason: collision with root package name */
        public Object f33593g;

        /* renamed from: h, reason: collision with root package name */
        public int f33594h = -1;

        public a(Object obj, q qVar, q qVar2, v vVar, vg.i iVar, q qVar3) {
            this.f33587a = obj;
            this.f33588b = qVar;
            this.f33589c = qVar2;
            this.f33590d = vVar;
            this.f33591e = iVar;
            this.f33592f = qVar3;
        }

        public final void a() {
            Object obj = this.f33593g;
            if (obj instanceof s) {
                ((s) obj).h(this.f33594h, h.this.f33582a);
                return;
            }
            b1 b1Var = obj instanceof b1 ? (b1) obj : null;
            if (b1Var != null) {
                b1Var.a();
            }
        }
    }

    public h(tg.h hVar) {
        this.f33582a = hVar;
    }

    @Override // xh.j
    public final void a(b1 b1Var) {
        this.f33584c = b1Var;
    }

    @Override // ph.y2
    public final void b(s<?> sVar, int i10) {
        this.f33584c = sVar;
        this.f33585d = i10;
    }

    @Override // xh.j
    public final boolean c(Object obj, Object obj2) {
        return j(obj, obj2) == 0;
    }

    @Override // ph.j
    public final void d(Throwable th2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33581f;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == k.f33601b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, k.f33602c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.f33583b;
            if (arrayList == null) {
                return;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj2 = arrayList.get(i10);
                i10++;
                ((a) obj2).a();
            }
            this.f33586e = k.f33603d;
            this.f33583b = null;
            return;
        }
    }

    @Override // xh.j
    public final void e(Object obj) {
        this.f33586e = obj;
    }

    public final Object f(vg.c cVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33581f;
        Object obj = atomicReferenceFieldUpdater.get(this);
        r.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation.ClauseData<R of kotlinx.coroutines.selects.SelectImplementation>");
        a aVar = (a) obj;
        Object obj2 = this.f33586e;
        ArrayList arrayList = this.f33583b;
        if (arrayList != null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj3 = arrayList.get(i10);
                i10++;
                a aVar2 = (a) obj3;
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, k.f33601b);
            this.f33586e = k.f33603d;
            this.f33583b = null;
        }
        Object objB = aVar.f33589c.b(aVar.f33587a, aVar.f33590d, obj2);
        vg.d dVar = aVar.f33591e;
        return aVar.f33590d == k.f33604e ? ((eh.l) dVar).invoke(cVar) : ((p) dVar).invoke(objB, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(vg.c cVar) throws Throwable {
        i iVar;
        h<R> hVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i10 = iVar.f33599d;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f33599d = i10 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(this, cVar);
            }
        }
        Object obj = iVar.f33597b;
        ug.a aVar = ug.a.f29706a;
        int i11 = iVar.f33599d;
        if (i11 == 0) {
            pg.q.b(obj);
            iVar.f33596a = this;
            iVar.f33599d = 1;
            m mVar = new m(1, ah.p.c(iVar));
            mVar.p();
            loop0: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33581f;
                Object obj2 = atomicReferenceFieldUpdater.get(this);
                v vVar = k.f33600a;
                if (obj2 == vVar) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, mVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    mVar.t(this);
                    break loop0;
                }
                if (obj2 instanceof List) {
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, vVar)) {
                            Iterator it = ((Iterable) obj2).iterator();
                            while (it.hasNext()) {
                                h<R>.a aVarH = h(it.next());
                                r.b(aVarH);
                                aVarH.f33593g = null;
                                aVarH.f33594h = -1;
                                i(aVarH, true);
                            }
                        } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                } else {
                    if (!(obj2 instanceof a)) {
                        throw new IllegalStateException(("unexpected state: " + obj2).toString());
                    }
                    f0 f0Var = f0.f21461a;
                    a aVar2 = (a) obj2;
                    Object obj3 = this.f33586e;
                    q<j<?>, Object, Object, q<Throwable, Object, tg.h, f0>> qVar = aVar2.f33592f;
                    mVar.r(f0Var, qVar != null ? qVar.b(this, aVar2.f33590d, obj3) : null);
                }
            }
            Object objO = mVar.o();
            if (objO != ug.a.f29706a) {
                objO = f0.f21461a;
            }
            if (objO != aVar) {
                hVar = this;
            }
        }
        if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pg.q.b(obj);
            return obj;
        }
        hVar = iVar.f33596a;
        pg.q.b(obj);
        iVar.f33596a = null;
        iVar.f33599d = 2;
        Object objF = hVar.f(iVar);
        return objF == aVar ? aVar : objF;
    }

    public final h<R>.a h(Object obj) {
        ArrayList arrayList = this.f33583b;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            Object obj3 = arrayList.get(i10);
            i10++;
            if (((a) obj3).f33587a == obj) {
                obj2 = obj3;
                break;
            }
        }
        h<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    public final void i(h<R>.a aVar, boolean z10) {
        Object obj = aVar.f33587a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33581f;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z10) {
            ArrayList arrayList = this.f33583b;
            r.b(arrayList);
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj2 = arrayList.get(i10);
                    i10++;
                    if (((a) obj2).f33587a == obj) {
                        throw new IllegalStateException(z0.a(obj, "Cannot use select clauses on the same object: ").toString());
                    }
                }
            }
        }
        aVar.f33588b.b(obj, this, aVar.f33590d);
        if (this.f33586e != k.f33603d) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z10) {
            ArrayList arrayList2 = this.f33583b;
            r.b(arrayList2);
            arrayList2.add(aVar);
        }
        aVar.f33593g = this.f33584c;
        aVar.f33594h = this.f33585d;
        this.f33584c = null;
        this.f33585d = -1;
    }

    public final int j(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f33581f;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof ph.k)) {
                if (r.a(obj3, k.f33601b) || (obj3 instanceof a)) {
                    return 3;
                }
                if (r.a(obj3, k.f33602c)) {
                    return 2;
                }
                if (r.a(obj3, k.f33600a)) {
                    List listC = g0.c(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, listC)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(("Unexpected state: " + obj3).toString());
                }
                ArrayList arrayListP = x.P(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, arrayListP)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            h<R>.a aVarH = h(obj);
            if (aVarH != null) {
                q<j<?>, Object, Object, q<Throwable, Object, tg.h, f0>> qVar = aVarH.f33592f;
                q<Throwable, Object, tg.h, f0> qVarB = qVar != null ? qVar.b(this, aVarH.f33590d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, aVarH)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                ph.k kVar = (ph.k) obj3;
                this.f33586e = obj2;
                v vVarM = kVar.m(f0.f21461a, qVarB);
                if (vVarM == null) {
                    this.f33586e = k.f33603d;
                    return 2;
                }
                kVar.w(vVarM);
                return 0;
            }
            continue;
        }
    }
}
