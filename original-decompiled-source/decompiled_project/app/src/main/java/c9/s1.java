package c9;

import b9.a3;
import b9.c3;
import com.basitce.htmltoapk.Hilt_HtmlToApkApplication;
import com.basitce.htmltoapk.data.local.entity.ProjectEntity;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class s1 extends androidx.lifecycle.w0 {
    public static final List<Integer> A = qg.p.j(-15000801, -1754827, -14785578, -13722289, -689152, -7461718);
    public static final List<Integer> B = qg.p.j(-5317, -8978685, -12532481, -32597);
    public static final List<Float> C = qg.p.j(Float.valueOf(0.0025f), Float.valueOf(0.005f), Float.valueOf(0.009f));
    public static final List<Float> D;
    public static final List<Float> E;

    /* renamed from: b, reason: collision with root package name */
    public final Hilt_HtmlToApkApplication f5270b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.s f5271c;

    /* renamed from: d, reason: collision with root package name */
    public final x0.x1 f5272d;

    /* renamed from: e, reason: collision with root package name */
    public final x0.x1 f5273e;

    /* renamed from: f, reason: collision with root package name */
    public final x0.x1 f5274f;

    /* renamed from: g, reason: collision with root package name */
    public final x0.x1 f5275g;

    /* renamed from: h, reason: collision with root package name */
    public final x0.x1 f5276h;

    /* renamed from: i, reason: collision with root package name */
    public final x0.x1 f5277i;

    /* renamed from: j, reason: collision with root package name */
    public final x0.x1 f5278j;

    /* renamed from: k, reason: collision with root package name */
    public final x0.x1 f5279k;

    /* renamed from: l, reason: collision with root package name */
    public final x0.x1 f5280l;

    /* renamed from: m, reason: collision with root package name */
    public final x0.v1 f5281m;

    /* renamed from: n, reason: collision with root package name */
    public final x0.v1 f5282n;

    /* renamed from: o, reason: collision with root package name */
    public final x0.v1 f5283o;

    /* renamed from: p, reason: collision with root package name */
    public final x0.v1 f5284p;

    /* renamed from: q, reason: collision with root package name */
    public final x0.x1 f5285q;

    /* renamed from: r, reason: collision with root package name */
    public final x0.v1 f5286r;

    /* renamed from: s, reason: collision with root package name */
    public final qg.l<List<b>> f5287s;

    /* renamed from: t, reason: collision with root package name */
    public final qg.l<List<b>> f5288t;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList<File> f5289u;

    /* renamed from: v, reason: collision with root package name */
    public final ArrayList<a3> f5290v;

    /* renamed from: w, reason: collision with root package name */
    public ProjectEntity f5291w;

    /* renamed from: x, reason: collision with root package name */
    public int f5292x;

    /* renamed from: y, reason: collision with root package name */
    public long f5293y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f5294z;

    static {
        Float fValueOf = Float.valueOf(0.015f);
        Float fValueOf2 = Float.valueOf(0.025f);
        D = qg.p.j(fValueOf, fValueOf2, Float.valueOf(0.04f));
        E = qg.p.j(fValueOf2, Float.valueOf(0.035f), Float.valueOf(0.05f));
    }

    public s1(Hilt_HtmlToApkApplication hilt_HtmlToApkApplication, n8.s projectRepository) {
        kotlin.jvm.internal.r.e(projectRepository, "projectRepository");
        this.f5270b = hilt_HtmlToApkApplication;
        this.f5271c = projectRepository;
        this.f5272d = bg.b.h("");
        this.f5273e = bg.b.h(Boolean.TRUE);
        this.f5274f = bg.b.h(Boolean.FALSE);
        this.f5275g = bg.b.h(null);
        this.f5276h = bg.b.h(qg.z.f22752a);
        this.f5277i = bg.b.h(qg.b0.f22711a);
        this.f5278j = bg.b.h(null);
        this.f5279k = bg.b.h(null);
        this.f5280l = bg.b.h("pen");
        this.f5281m = new x0.v1(A.get(0).intValue());
        this.f5282n = new x0.v1(B.get(0).intValue());
        this.f5283o = new x0.v1(1);
        this.f5284p = new x0.v1(1);
        this.f5285q = bg.b.h(null);
        this.f5286r = new x0.v1(0);
        this.f5287s = new qg.l<>();
        this.f5288t = new qg.l<>();
        this.f5289u = new ArrayList<>();
        this.f5290v = new ArrayList<>();
        this.f5293y = 1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object f(s1 s1Var, File file, vg.c cVar) {
        p1 p1Var;
        a3 a3Var;
        Object objE;
        s1Var.getClass();
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i10 = p1Var.f5175f;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                p1Var.f5175f = i10 - PKIFailureInfo.systemUnavail;
            } else {
                p1Var = new p1(s1Var, cVar);
            }
        }
        Object obj = p1Var.f5173d;
        ug.a aVar = ug.a.f29706a;
        int i11 = p1Var.f5175f;
        if (i11 == 0) {
            pg.q.b(obj);
            a3Var = new a3(file);
            p1Var.f5170a = s1Var;
            p1Var.f5171b = file;
            p1Var.f5172c = a3Var;
            p1Var.f5175f = 1;
            objE = a3Var.f3734f ? qg.z.f22752a : ph.h.e(a3Var.f3731c, new c3(a3Var, null), p1Var);
            if (objE == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a3 a3Var2 = p1Var.f5172c;
            file = p1Var.f5171b;
            s1 s1Var2 = p1Var.f5170a;
            pg.q.b(obj);
            a3Var = a3Var2;
            s1Var = s1Var2;
            objE = obj;
        }
        List list = (List) objE;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Empty PDF");
        }
        s1Var.f5289u.add(file);
        s1Var.f5290v.add(a3Var);
        return list;
    }

    @Override // androidx.lifecycle.w0
    public final void e() {
        ArrayList<a3> arrayList = this.f5290v;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            a3 a3Var = arrayList.get(i11);
            i11++;
            int i12 = i10 + 1;
            if (i10 < 0) {
                qg.p.o();
                throw null;
            }
            a3Var.l(i10 > 0);
            i10 = i12;
        }
    }

    public final void g(long j10, v1 v1Var) {
        Object next;
        Iterator<T> it = j().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (((b) next).f5057a == j10) {
                    break;
                }
            }
        }
        b bVar = (b) next;
        if (bVar == null) {
            return;
        }
        q(j10, qg.x.P(v1Var, bVar.f5063g));
    }

    public final void h(ArrayList arrayList) {
        if (arrayList.equals(j())) {
            return;
        }
        List<b> listJ = j();
        qg.l<List<b>> lVar = this.f5287s;
        lVar.addLast(listJ);
        if (lVar.f22729c > 60) {
            lVar.removeFirst();
        }
        this.f5288t.clear();
        this.f5276h.setValue(arrayList);
        x0.v1 v1Var = this.f5286r;
        v1Var.f(v1Var.g() + 1);
        HashSet hashSet = new HashSet();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hashSet.add(Long.valueOf(((b) obj).f5057a));
        }
        Set<Long> setK = k();
        HashSet hashSet2 = new HashSet();
        for (Object obj2 : setK) {
            if (hashSet.contains(Long.valueOf(((Number) obj2).longValue()))) {
                hashSet2.add(obj2);
            }
        }
        this.f5277i.setValue(hashSet2);
    }

    public final boolean i() {
        return this.f5286r.g() >= 0 && !this.f5287s.isEmpty();
    }

    public final List<b> j() {
        return (List) this.f5276h.getValue();
    }

    public final Set<Long> k() {
        return (Set) this.f5277i.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        pg.n nVar;
        int iM = m();
        b bVar = (b) qg.x.E(iM - 1, j());
        if (bVar == null) {
            bVar = (b) qg.x.D(j());
        }
        if (bVar != null) {
            float f10 = bVar.f5061e;
            float f11 = bVar.f5060d;
            nVar = bVar.f5062f % 180 == 0 ? new pg.n(Float.valueOf(f11), Float.valueOf(f10)) : new pg.n(Float.valueOf(f10), Float.valueOf(f11));
        } else {
            nVar = new pg.n(Float.valueOf(595.0f), Float.valueOf(842.0f));
        }
        float fFloatValue = ((Number) nVar.f21469a).floatValue();
        float fFloatValue2 = ((Number) nVar.f21470b).floatValue();
        long j10 = this.f5293y;
        this.f5293y = 1 + j10;
        b bVar2 = new b(j10, -1, 0, fFloatValue, fFloatValue2);
        ArrayList arrayListE0 = qg.x.e0(j());
        arrayListE0.add(iM, bVar2);
        h(arrayListE0);
        this.f5277i.setValue(qg.n0.g(Long.valueOf(j10)));
        this.f5279k.setValue(Long.valueOf(j10));
    }

    public final int m() {
        int iNextIndex;
        List<b> listJ = j();
        ListIterator<b> listIterator = listJ.listIterator(listJ.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (k().contains(Long.valueOf(listIterator.previous().f5057a))) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        return iNextIndex >= 0 ? iNextIndex + 1 : j().size();
    }

    public final void n(int i10) {
        ArrayList arrayListE0 = qg.x.e0(j());
        if (i10 < 0) {
            int size = arrayListE0.size();
            for (int i11 = 1; i11 < size; i11++) {
                if (k().contains(Long.valueOf(((b) arrayListE0.get(i11)).f5057a))) {
                    int i12 = i11 - 1;
                    if (!k().contains(Long.valueOf(((b) arrayListE0.get(i12)).f5057a))) {
                        Object obj = arrayListE0.get(i12);
                        arrayListE0.set(i12, arrayListE0.get(i11));
                        pg.f0 f0Var = pg.f0.f21461a;
                        arrayListE0.set(i11, obj);
                    }
                }
            }
        } else {
            for (int size2 = arrayListE0.size() - 2; -1 < size2; size2--) {
                if (k().contains(Long.valueOf(((b) arrayListE0.get(size2)).f5057a))) {
                    int i13 = size2 + 1;
                    if (!k().contains(Long.valueOf(((b) arrayListE0.get(i13)).f5057a))) {
                        Object obj2 = arrayListE0.get(i13);
                        arrayListE0.set(i13, arrayListE0.get(size2));
                        pg.f0 f0Var2 = pg.f0.f21461a;
                        arrayListE0.set(size2, obj2);
                    }
                }
            }
        }
        h(arrayListE0);
    }

    public final void o(int i10) {
        List<b> listJ = j();
        ArrayList arrayList = new ArrayList(qg.p.h(listJ, 10));
        for (b bVarA : listJ) {
            if (k().contains(Long.valueOf(bVarA.f5057a))) {
                bVarA = b.a(bVarA, 0L, (((bVarA.f5062f + i10) % 360) + 360) % 360, null, 95);
            }
            arrayList.add(bVarA);
        }
        h(arrayList);
    }

    public final void p(Integer num) {
        this.f5275g.setValue(num);
    }

    public final void q(long j10, ArrayList arrayList) {
        ArrayList arrayList2;
        List<b> listJ = j();
        ArrayList arrayList3 = new ArrayList(qg.p.h(listJ, 10));
        for (b bVarA : listJ) {
            if (bVarA.f5057a == j10) {
                arrayList2 = arrayList;
                bVarA = b.a(bVarA, 0L, 0, arrayList2, 63);
            } else {
                arrayList2 = arrayList;
            }
            arrayList3.add(bVarA);
            arrayList = arrayList2;
        }
        h(arrayList3);
    }
}
