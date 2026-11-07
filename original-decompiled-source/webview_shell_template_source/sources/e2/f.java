package e2;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.internal.ads.y50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import u0.f0;
import u0.n0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class f implements Cloneable {
    public static final Animator[] O = new Animator[0];
    public static final int[] P = {2, 1, 3, 4};
    public static final a Q = new a();
    public static final ThreadLocal<w.a<Animator, b>> R = new ThreadLocal<>();
    public ArrayList<m> C;
    public ArrayList<m> D;
    public d[] E;
    public final String s = getClass().getName();

    /* renamed from: t, reason: collision with root package name */
    public long f12790t = -1;

    /* renamed from: u, reason: collision with root package name */
    public long f12791u = -1;

    /* renamed from: v, reason: collision with root package name */
    public TimeInterpolator f12792v = null;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<Integer> f12793w = new ArrayList<>();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList<View> f12794x = new ArrayList<>();

    /* renamed from: y, reason: collision with root package name */
    public y50 f12795y = new y50(2);

    /* renamed from: z, reason: collision with root package name */
    public y50 f12796z = new y50(2);
    public k A = null;
    public final int[] B = P;
    public final ArrayList<Animator> F = new ArrayList<>();
    public Animator[] G = O;
    public int H = 0;
    public boolean I = false;
    public boolean J = false;
    public f K = null;
    public ArrayList<d> L = null;
    public ArrayList<Animator> M = new ArrayList<>();
    public androidx.fragment.app.p N = Q;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends androidx.fragment.app.p {
        @Override // androidx.fragment.app.p
        public final Path b(float f6, float f7, float f8, float f9) {
            Path path = new Path();
            path.moveTo(f6, f7);
            path.lineTo(f8, f9);
            return path;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public View f12797a;

        /* renamed from: b, reason: collision with root package name */
        public String f12798b;

        /* renamed from: c, reason: collision with root package name */
        public m f12799c;

        /* renamed from: d, reason: collision with root package name */
        public WindowId f12800d;

        /* renamed from: e, reason: collision with root package name */
        public f f12801e;

        /* renamed from: f, reason: collision with root package name */
        public Animator f12802f;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static abstract class c {
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface d {
        void a();

        default void b(f fVar) {
            d(fVar);
        }

        void c(f fVar);

        void d(f fVar);

        void e();

        default void f(f fVar) {
            g(fVar);
        }

        void g(f fVar);
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public interface e {

        /* renamed from: l, reason: collision with root package name */
        public static final androidx.camera.camera2.internal.compat.workaround.c f12803l = new androidx.camera.camera2.internal.compat.workaround.c();

        /* renamed from: m, reason: collision with root package name */
        public static final androidx.activity.m f12804m = new androidx.activity.m();

        /* renamed from: n, reason: collision with root package name */
        public static final androidx.camera.view.g f12805n = new androidx.camera.view.g();

        /* renamed from: o, reason: collision with root package name */
        public static final androidx.camera.core.t f12806o = new androidx.camera.core.t();

        /* renamed from: p, reason: collision with root package name */
        public static final androidx.camera.core.u f12807p = new androidx.camera.core.u();

        void a(d dVar, f fVar);
    }

    public static void b(y50 y50Var, View view, m mVar) {
        w.a aVar = (w.a) y50Var.s;
        w.a aVar2 = (w.a) y50Var.f10862v;
        SparseArray sparseArray = (SparseArray) y50Var.f10860t;
        w.d dVar = (w.d) y50Var.f10861u;
        aVar.put(view, mVar);
        int id = view.getId();
        if (id >= 0) {
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap<View, n0> weakHashMap = f0.f14480a;
        String strE = f0.d.e(view);
        if (strE != null) {
            if (aVar2.containsKey(strE)) {
                aVar2.put(strE, null);
            } else {
                aVar2.put(strE, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                if (dVar.s) {
                    int i6 = dVar.f14841v;
                    long[] jArr = dVar.f14839t;
                    Object[] objArr = dVar.f14840u;
                    int i7 = 0;
                    for (int i8 = 0; i8 < i6; i8++) {
                        Object obj = objArr[i8];
                        if (obj != w.e.f14842a) {
                            if (i8 != i7) {
                                jArr[i7] = jArr[i8];
                                objArr[i7] = obj;
                                objArr[i8] = null;
                            }
                            i7++;
                        }
                    }
                    dVar.s = false;
                    dVar.f14841v = i7;
                }
                if (x.a.b(dVar.f14839t, dVar.f14841v, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    dVar.d(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) dVar.b(itemIdAtPosition);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    dVar.d(itemIdAtPosition, null);
                }
            }
        }
    }

    public static w.a<Animator, b> p() {
        ThreadLocal<w.a<Animator, b>> threadLocal = R;
        w.a<Animator, b> aVar = threadLocal.get();
        if (aVar != null) {
            return aVar;
        }
        w.a<Animator, b> aVar2 = new w.a<>();
        threadLocal.set(aVar2);
        return aVar2;
    }

    public void B(TimeInterpolator timeInterpolator) {
        this.f12792v = timeInterpolator;
    }

    public void C(androidx.fragment.app.p pVar) {
        if (pVar == null) {
            this.N = Q;
        } else {
            this.N = pVar;
        }
    }

    public void E(long j6) {
        this.f12790t = j6;
    }

    public final void F() {
        if (this.H == 0) {
            u(this, e.f12803l);
            this.J = false;
        }
        this.H++;
    }

    public String G(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f12791u != -1) {
            sb.append("dur(");
            sb.append(this.f12791u);
            sb.append(") ");
        }
        if (this.f12790t != -1) {
            sb.append("dly(");
            sb.append(this.f12790t);
            sb.append(") ");
        }
        if (this.f12792v != null) {
            sb.append("interp(");
            sb.append(this.f12792v);
            sb.append(") ");
        }
        ArrayList<Integer> arrayList = this.f12793w;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f12794x;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i6 = 0; i6 < arrayList.size(); i6++) {
                    if (i6 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i6));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i7 = 0; i7 < arrayList2.size(); i7++) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i7));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void a(d dVar) {
        if (this.L == null) {
            this.L = new ArrayList<>();
        }
        this.L.add(dVar);
    }

    public void c() {
        ArrayList<Animator> arrayList = this.F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.G);
        this.G = O;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.cancel();
        }
        this.G = animatorArr;
        u(this, e.f12805n);
    }

    public abstract void d(m mVar);

    public final void e(View view, boolean z6) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            m mVar = new m(view);
            if (z6) {
                g(mVar);
            } else {
                d(mVar);
            }
            mVar.f12822c.add(this);
            f(mVar);
            if (z6) {
                b(this.f12795y, view, mVar);
            } else {
                b(this.f12796z, view, mVar);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                e(viewGroup.getChildAt(i6), z6);
            }
        }
    }

    public abstract void g(m mVar);

    public final void h(ViewGroup viewGroup, boolean z6) {
        i(z6);
        ArrayList<Integer> arrayList = this.f12793w;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f12794x;
        if (size <= 0 && arrayList2.size() <= 0) {
            e(viewGroup, z6);
            return;
        }
        for (int i6 = 0; i6 < arrayList.size(); i6++) {
            View viewFindViewById = viewGroup.findViewById(arrayList.get(i6).intValue());
            if (viewFindViewById != null) {
                m mVar = new m(viewFindViewById);
                if (z6) {
                    g(mVar);
                } else {
                    d(mVar);
                }
                mVar.f12822c.add(this);
                f(mVar);
                if (z6) {
                    b(this.f12795y, viewFindViewById, mVar);
                } else {
                    b(this.f12796z, viewFindViewById, mVar);
                }
            }
        }
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            View view = arrayList2.get(i7);
            m mVar2 = new m(view);
            if (z6) {
                g(mVar2);
            } else {
                d(mVar2);
            }
            mVar2.f12822c.add(this);
            f(mVar2);
            if (z6) {
                b(this.f12795y, view, mVar2);
            } else {
                b(this.f12796z, view, mVar2);
            }
        }
    }

    public final void i(boolean z6) {
        if (z6) {
            ((w.a) this.f12795y.s).clear();
            ((SparseArray) this.f12795y.f10860t).clear();
            ((w.d) this.f12795y.f10861u).a();
        } else {
            ((w.a) this.f12796z.s).clear();
            ((SparseArray) this.f12796z.f10860t).clear();
            ((w.d) this.f12796z.f10861u).a();
        }
    }

    @Override // 
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f clone() {
        try {
            f fVar = (f) super.clone();
            fVar.M = new ArrayList<>();
            fVar.f12795y = new y50(2);
            fVar.f12796z = new y50(2);
            fVar.C = null;
            fVar.D = null;
            fVar.K = this;
            fVar.L = null;
            return fVar;
        } catch (CloneNotSupportedException e6) {
            throw new RuntimeException(e6);
        }
    }

    public Animator k(ViewGroup viewGroup, m mVar, m mVar2) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void l(ViewGroup viewGroup, y50 y50Var, y50 y50Var2, ArrayList<m> arrayList, ArrayList<m> arrayList2) {
        int i6;
        int i7;
        View view;
        m mVar;
        Animator animator;
        m mVar2;
        w.a<Animator, b> aVarP = p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        o().getClass();
        int i8 = 0;
        while (i8 < size) {
            m mVar3 = arrayList.get(i8);
            m mVar4 = arrayList2.get(i8);
            if (mVar3 != null && !mVar3.f12822c.contains(this)) {
                mVar3 = null;
            }
            if (mVar4 != null && !mVar4.f12822c.contains(this)) {
                mVar4 = null;
            }
            if ((mVar3 != null || mVar4 != null) && (mVar3 == null || mVar4 == null || s(mVar3, mVar4))) {
                Animator animatorK = k(viewGroup, mVar3, mVar4);
                if (animatorK != null) {
                    String str = this.s;
                    if (mVar4 != null) {
                        view = mVar4.f12821b;
                        String[] strArrQ = q();
                        if (strArrQ != null && strArrQ.length > 0) {
                            mVar2 = new m(view);
                            m mVar5 = (m) ((w.a) y50Var2.s).get(view);
                            i6 = size;
                            if (mVar5 != null) {
                                int i9 = 0;
                                while (i9 < strArrQ.length) {
                                    String str2 = strArrQ[i9];
                                    mVar2.f12820a.put(str2, mVar5.f12820a.get(str2));
                                    i9++;
                                    i8 = i8;
                                    mVar5 = mVar5;
                                }
                            }
                            i7 = i8;
                            int i10 = aVarP.f14850u;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= i10) {
                                    animator = animatorK;
                                    break;
                                }
                                b bVar = aVarP.get(aVarP.f(i11));
                                if (bVar.f12799c != null && bVar.f12797a == view && bVar.f12798b.equals(str) && bVar.f12799c.equals(mVar2)) {
                                    animator = null;
                                    break;
                                }
                                i11++;
                            }
                        } else {
                            i6 = size;
                            i7 = i8;
                            animator = animatorK;
                            mVar2 = null;
                        }
                        animatorK = animator;
                        mVar = mVar2;
                    } else {
                        i6 = size;
                        i7 = i8;
                        view = mVar3.f12821b;
                        mVar = null;
                    }
                    if (animatorK != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        b bVar2 = new b();
                        bVar2.f12797a = view;
                        bVar2.f12798b = str;
                        bVar2.f12799c = mVar;
                        bVar2.f12800d = windowId;
                        bVar2.f12801e = this;
                        bVar2.f12802f = animatorK;
                        aVarP.put(animatorK, bVar2);
                        this.M.add(animatorK);
                    }
                }
                i8 = i7 + 1;
                size = i6;
            }
            i6 = size;
            i7 = i8;
            i8 = i7 + 1;
            size = i6;
        }
        if (sparseIntArray.size() != 0) {
            for (int i12 = 0; i12 < sparseIntArray.size(); i12++) {
                b bVar3 = aVarP.get(this.M.get(sparseIntArray.keyAt(i12)));
                bVar3.f12802f.setStartDelay(bVar3.f12802f.getStartDelay() + (sparseIntArray.valueAt(i12) - Long.MAX_VALUE));
            }
        }
    }

    public final void m() {
        int i6 = this.H - 1;
        this.H = i6;
        if (i6 == 0) {
            u(this, e.f12804m);
            for (int i7 = 0; i7 < ((w.d) this.f12795y.f10861u).e(); i7++) {
                View view = (View) ((w.d) this.f12795y.f10861u).f(i7);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i8 = 0; i8 < ((w.d) this.f12796z.f10861u).e(); i8++) {
                View view2 = (View) ((w.d) this.f12796z.f10861u).f(i8);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.J = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 < 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002e, code lost:
    
        if (r6 == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0030, code lost:
    
        r5 = r4.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0033, code lost:
    
        r5 = r4.C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        return r5.get(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x003c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m n(View view, boolean z6) {
        k kVar = this.A;
        if (kVar != null) {
            return kVar.n(view, z6);
        }
        ArrayList<m> arrayList = z6 ? this.C : this.D;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size) {
                i6 = -1;
                break;
            }
            m mVar = arrayList.get(i6);
            if (mVar == null) {
                return null;
            }
            if (mVar.f12821b == view) {
                break;
            }
            i6++;
        }
    }

    public final f o() {
        k kVar = this.A;
        return kVar != null ? kVar.o() : this;
    }

    public String[] q() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m r(View view, boolean z6) {
        k kVar = this.A;
        if (kVar != null) {
            return kVar.r(view, z6);
        }
        return (m) ((w.a) (z6 ? this.f12795y : this.f12796z).s).get(view);
    }

    public boolean s(m mVar, m mVar2) {
        if (mVar != null) {
            HashMap map = mVar.f12820a;
            if (mVar2 != null) {
                HashMap map2 = mVar2.f12820a;
                String[] strArrQ = q();
                if (strArrQ != null) {
                    for (String str : strArrQ) {
                        Object obj = map.get(str);
                        Object obj2 = map2.get(str);
                        if ((obj == null && obj2 == null) ? false : (obj == null || obj2 == null) ? true : !obj.equals(obj2)) {
                            return true;
                        }
                    }
                } else {
                    for (String str2 : map.keySet()) {
                        Object obj3 = map.get(str2);
                        Object obj4 = map2.get(str2);
                        if ((obj3 == null && obj4 == null) ? false : (obj3 == null || obj4 == null) ? true : !obj3.equals(obj4)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean t(View view) {
        int id = view.getId();
        ArrayList<Integer> arrayList = this.f12793w;
        int size = arrayList.size();
        ArrayList<View> arrayList2 = this.f12794x;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return G(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED);
    }

    public final void u(f fVar, e eVar) {
        f fVar2 = this.K;
        if (fVar2 != null) {
            fVar2.u(fVar, eVar);
        }
        ArrayList<d> arrayList = this.L;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.L.size();
        d[] dVarArr = this.E;
        if (dVarArr == null) {
            dVarArr = new d[size];
        }
        this.E = null;
        d[] dVarArr2 = (d[]) this.L.toArray(dVarArr);
        for (int i6 = 0; i6 < size; i6++) {
            eVar.a(dVarArr2[i6], fVar);
            dVarArr2[i6] = null;
        }
        this.E = dVarArr2;
    }

    public void v(View view) {
        if (this.J) {
            return;
        }
        ArrayList<Animator> arrayList = this.F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.G);
        this.G = O;
        for (int i6 = size - 1; i6 >= 0; i6--) {
            Animator animator = animatorArr[i6];
            animatorArr[i6] = null;
            animator.pause();
        }
        this.G = animatorArr;
        u(this, e.f12806o);
        this.I = true;
    }

    public f w(d dVar) {
        f fVar;
        ArrayList<d> arrayList = this.L;
        if (arrayList != null) {
            if (!arrayList.remove(dVar) && (fVar = this.K) != null) {
                fVar.w(dVar);
            }
            if (this.L.size() == 0) {
                this.L = null;
            }
        }
        return this;
    }

    public void x(View view) {
        if (this.I) {
            if (!this.J) {
                ArrayList<Animator> arrayList = this.F;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.G);
                this.G = O;
                for (int i6 = size - 1; i6 >= 0; i6--) {
                    Animator animator = animatorArr[i6];
                    animatorArr[i6] = null;
                    animator.resume();
                }
                this.G = animatorArr;
                u(this, e.f12807p);
            }
            this.I = false;
        }
    }

    public void y() {
        F();
        w.a<Animator, b> aVarP = p();
        ArrayList<Animator> arrayList = this.M;
        int size = arrayList.size();
        int i6 = 0;
        while (i6 < size) {
            Animator animator = arrayList.get(i6);
            i6++;
            Animator animator2 = animator;
            if (aVarP.containsKey(animator2)) {
                F();
                if (animator2 != null) {
                    animator2.addListener(new g(this, aVarP));
                    long j6 = this.f12791u;
                    if (j6 >= 0) {
                        animator2.setDuration(j6);
                    }
                    long j7 = this.f12790t;
                    if (j7 >= 0) {
                        animator2.setStartDelay(animator2.getStartDelay() + j7);
                    }
                    TimeInterpolator timeInterpolator = this.f12792v;
                    if (timeInterpolator != null) {
                        animator2.setInterpolator(timeInterpolator);
                    }
                    animator2.addListener(new h(this));
                    animator2.start();
                }
            }
        }
        this.M.clear();
        m();
    }

    public void z(long j6) {
        this.f12791u = j6;
    }

    public void D() {
    }

    public void A(c cVar) {
    }

    public void f(m mVar) {
    }
}
