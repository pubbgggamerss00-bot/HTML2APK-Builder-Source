package j2;

import android.content.res.Resources;
import com.basitce.htmltoapk.R;
import com.yalantis.ucrop.view.CropImageView;
import i2.e0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Comparator<q2.t>[] f14705a;

    /* renamed from: b, reason: collision with root package name */
    public static final a f14706b;

    public static final class a extends kotlin.jvm.internal.s implements eh.p<q2.t, q2.t, Integer> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14707a = new a(2);

        @Override // eh.p
        public final Integer invoke(q2.t tVar, q2.t tVar2) {
            q2.l lVar = tVar.f21811d;
            q2.c0<Float> c0Var = q2.w.f21837r;
            return Integer.valueOf(Float.compare(((Number) lVar.g(c0Var, c0.f14672a)).floatValue(), ((Number) tVar2.f21811d.g(c0Var, d0.f14693a)).floatValue()));
        }
    }

    public static final class b extends kotlin.jvm.internal.s implements eh.a<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public static final b f14708a = new b(0);

        @Override // eh.a
        public final /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    public static final class c<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f14709a;

        public c(Comparator comparator) {
            e0.c cVar = i2.e0.U;
            this.f14709a = comparator;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            int iCompare = this.f14709a.compare(t3, t10);
            return iCompare != 0 ? iCompare : i2.e0.X.compare(((q2.t) t3).f21810c, ((q2.t) t10).f21810c);
        }
    }

    public static final class d<T> implements Comparator {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f14710a;

        public d(c cVar) {
            this.f14710a = cVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t3, T t10) {
            int iCompare = this.f14710a.compare(t3, t10);
            return iCompare != 0 ? iCompare : i0.x1.b(Integer.valueOf(((q2.t) t3).f21814g), Integer.valueOf(((q2.t) t10).f21814g));
        }
    }

    static {
        Comparator<q2.t>[] comparatorArr = new Comparator[2];
        int i10 = 0;
        while (i10 < 2) {
            Comparator comparator = i10 == 0 ? t4.f14906a : k3.f14825a;
            e0.c cVar = i2.e0.U;
            comparatorArr[i10] = new d(new c(comparator));
            i10++;
        }
        f14705a = comparatorArr;
        f14706b = a.f14707a;
    }

    public static final boolean a(q2.t tVar) {
        q2.l lVarI = tVar.i();
        return !lVarI.f21799a.b(q2.w.f21828i);
    }

    public static final i2.e0 b(i2.e0 e0Var, eh.l<? super i2.e0, Boolean> lVar) {
        for (i2.e0 e0VarG = e0Var.G(); e0VarG != null; e0VarG = e0VarG.G()) {
            if (lVar.invoke(e0VarG).booleanValue()) {
                return e0VarG;
            }
        }
        return null;
    }

    public static final void c(q2.t tVar, ArrayList<q2.t> arrayList, p.y<List<q2.t>> yVar, p.i<w4> iVar, Resources resources) {
        boolean zG = g(tVar);
        int i10 = tVar.f21814g;
        boolean zBooleanValue = ((Boolean) tVar.f21811d.g(q2.w.f21832m, b.f14708a)).booleanValue();
        if ((zBooleanValue || h(tVar, resources)) && iVar.a(i10)) {
            arrayList.add(tVar);
        }
        if (zBooleanValue) {
            yVar.h(i10, i(zG, q2.t.h(7, tVar), iVar, resources));
            return;
        }
        List listH = q2.t.h(7, tVar);
        int size = listH.size();
        for (int i11 = 0; i11 < size; i11++) {
            c((q2.t) listH.get(i11), arrayList, yVar, iVar, resources);
        }
    }

    public static final boolean d(q2.t tVar) {
        s2.a aVar = (s2.a) q2.m.a(tVar.f21811d, q2.w.H);
        q2.l lVar = tVar.f21811d;
        q2.i iVar = (q2.i) q2.m.a(lVar, q2.w.f21842w);
        boolean z10 = aVar != null;
        if (((Boolean) q2.m.a(lVar, q2.w.G)) == null || (iVar != null && iVar.f21770a == 4)) {
            return z10;
        }
        return true;
    }

    public static final String e(q2.t tVar, Resources resources) {
        Collection collection;
        CharSequence charSequence;
        Object objA = q2.m.a(tVar.f21811d, q2.w.f21821b);
        q2.l lVar = tVar.f21811d;
        s2.a aVar = (s2.a) q2.m.a(lVar, q2.w.H);
        q2.i iVar = (q2.i) q2.m.a(lVar, q2.w.f21842w);
        if (aVar != null) {
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 && objA == null) {
                        objA = resources.getString(R.string.indeterminate);
                    }
                } else if (iVar != null && iVar.f21770a == 2 && objA == null) {
                    objA = resources.getString(R.string.state_off);
                }
            } else if (iVar != null && iVar.f21770a == 2 && objA == null) {
                objA = resources.getString(R.string.state_on);
            }
        }
        Boolean bool = (Boolean) q2.m.a(lVar, q2.w.G);
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            if ((iVar == null || iVar.f21770a != 4) && objA == null) {
                objA = zBooleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        q2.h hVar = (q2.h) q2.m.a(lVar, q2.w.f21822c);
        if (hVar != null) {
            if (hVar != q2.h.f21766d) {
                if (objA == null) {
                    jh.d dVar = hVar.f21768b;
                    float f10 = dVar.f15743b;
                    float f11 = dVar.f15742a;
                    float fFloatValue = Float.valueOf(f10).floatValue() - Float.valueOf(f11).floatValue() == CropImageView.DEFAULT_ASPECT_RATIO ? 0.0f : (hVar.f21767a - Float.valueOf(f11).floatValue()) / (Float.valueOf(dVar.f15743b).floatValue() - Float.valueOf(f11).floatValue());
                    if (fFloatValue < CropImageView.DEFAULT_ASPECT_RATIO) {
                        fFloatValue = 0.0f;
                    }
                    if (fFloatValue > 1.0f) {
                        fFloatValue = 1.0f;
                    }
                    objA = resources.getString(R.string.template_percent, Integer.valueOf(fFloatValue == CropImageView.DEFAULT_ASPECT_RATIO ? 0 : fFloatValue == 1.0f ? 100 : jh.j.m(Math.round(fFloatValue * 100), 1, 99)));
                }
            } else if (objA == null) {
                objA = resources.getString(R.string.in_progress);
            }
        }
        q2.c0<t2.b> c0Var = q2.w.D;
        if (lVar.f21799a.b(c0Var)) {
            q2.l lVarI = new q2.t(tVar.f21808a, true, tVar.f21810c, lVar).i();
            Collection collection2 = (Collection) q2.m.a(lVarI, q2.w.f21820a);
            objA = ((collection2 == null || collection2.isEmpty()) && ((collection = (Collection) q2.m.a(lVarI, q2.w.f21845z)) == null || collection.isEmpty()) && ((charSequence = (CharSequence) q2.m.a(lVarI, c0Var)) == null || charSequence.length() == 0)) ? resources.getString(R.string.state_empty) : null;
        }
        return (String) objA;
    }

    public static final t2.b f(q2.t tVar) {
        q2.l lVar = tVar.f21811d;
        q2.c0<List<String>> c0Var = q2.w.f21820a;
        t2.b bVar = (t2.b) q2.m.a(lVar, q2.w.D);
        List list = (List) q2.m.a(tVar.f21811d, q2.w.f21845z);
        return bVar == null ? list != null ? (t2.b) qg.x.D(list) : null : bVar;
    }

    public static final boolean g(q2.t tVar) {
        return tVar.f21810c.C == f3.r.f8829b;
    }

    public static final boolean h(q2.t tVar, Resources resources) {
        List list = (List) q2.m.a(tVar.f21811d, q2.w.f21820a);
        return !x4.d(tVar) && (tVar.f21811d.f21801c || (tVar.m() && ((list != null ? (String) qg.x.D(list) : null) != null || f(tVar) != null || e(tVar, resources) != null || d(tVar))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2 A[EDGE_INSN: B:49:0x00c2->B:28:0x00c2 BREAK  A[LOOP:2: B:17:0x005a->B:27:0x00bf]] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d8 A[LOOP:1: B:8:0x0038->B:30:0x00d8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00dc A[EDGE_INSN: B:47:0x00dc->B:31:0x00dc BREAK  A[LOOP:1: B:8:0x0038->B:30:0x00d8], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList i(boolean z10, List list, p.i iVar, Resources resources) {
        p.y yVar = p.j.f20648a;
        p.y yVar2 = new p.y();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            c((q2.t) list.get(i10), arrayList, yVar2, iVar, resources);
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int i11 = qg.p.i(arrayList);
        if (i11 >= 0) {
            int i12 = 0;
            while (true) {
                q2.t tVar = (q2.t) arrayList.get(i12);
                if (i12 != 0) {
                    float f10 = tVar.f().f21132b;
                    float f11 = tVar.f().f21134d;
                    boolean z11 = f10 >= f11;
                    int i13 = qg.p.i(arrayList2);
                    if (i13 >= 0) {
                        int i14 = 0;
                        while (true) {
                            p1.e eVar = (p1.e) ((pg.n) arrayList2.get(i14)).f21469a;
                            float f12 = eVar.f21132b;
                            float f13 = eVar.f21134d;
                            boolean z12 = f12 >= f13;
                            if (!z11 && !z12 && Math.max(f10, f12) < Math.min(f11, f13)) {
                                arrayList2.set(i14, new pg.n(new p1.e(Math.max(eVar.f21131a, CropImageView.DEFAULT_ASPECT_RATIO), Math.max(eVar.f21132b, f10), Math.min(eVar.f21133c, Float.POSITIVE_INFINITY), Math.min(f13, f11)), ((pg.n) arrayList2.get(i14)).f21470b));
                                ((List) ((pg.n) arrayList2.get(i14)).f21470b).add(tVar);
                                break;
                            }
                            if (i14 == i13) {
                                break;
                            }
                            i14++;
                        }
                        arrayList2.add(new pg.n(tVar.f(), qg.p.k(tVar)));
                        if (i12 != i11) {
                            break;
                        }
                        i12++;
                    } else {
                        arrayList2.add(new pg.n(tVar.f(), qg.p.k(tVar)));
                        if (i12 != i11) {
                        }
                    }
                }
            }
        }
        qg.t.v(arrayList2, c5.f14688a);
        ArrayList arrayList3 = new ArrayList();
        Comparator<q2.t> comparator = f14705a[!z10 ? 1 : 0];
        int size2 = arrayList2.size();
        for (int i15 = 0; i15 < size2; i15++) {
            pg.n nVar = (pg.n) arrayList2.get(i15);
            qg.t.v((List) nVar.f21470b, comparator);
            arrayList3.addAll((Collection) nVar.f21470b);
        }
        final a aVar = f14706b;
        qg.t.v(arrayList3, new Comparator() { // from class: j2.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((Number) aVar.invoke(obj, obj2)).intValue();
            }
        });
        int size3 = 0;
        while (size3 <= qg.p.i(arrayList3)) {
            List list2 = (List) yVar2.b(((q2.t) arrayList3.get(size3)).f21814g);
            if (list2 != null) {
                if (h((q2.t) arrayList3.get(size3), resources)) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
