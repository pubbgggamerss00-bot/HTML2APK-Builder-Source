package e2;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import com.google.android.gms.internal.ads.y50;
import com.htmltoapk.template.R;
import e2.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final e2.a f12811a;

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<WeakReference<w.a<ViewGroup, ArrayList<f>>>> f12812b;

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList<ViewGroup> f12813c;

    static {
        e2.a aVar = new e2.a();
        aVar.T = false;
        aVar.H(new c(2));
        aVar.H(new b());
        aVar.H(new c(1));
        f12811a = aVar;
        f12812b = new ThreadLocal<>();
        f12813c = new ArrayList<>();
    }

    public static void a(FrameLayout frameLayout, f fVar) {
        ArrayList<ViewGroup> arrayList = f12813c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (fVar == null) {
            fVar = f12811a;
        }
        f fVarClone = fVar.clone();
        ArrayList<f> arrayList2 = b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                f fVar2 = arrayList2.get(i6);
                i6++;
                fVar2.v(frameLayout);
            }
        }
        fVarClone.h(frameLayout, true);
        if (((e) frameLayout.getTag(R.id.transition_current_scene)) != null) {
            throw null;
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        a aVar = new a();
        aVar.s = fVarClone;
        aVar.f12814t = frameLayout;
        frameLayout.addOnAttachStateChangeListener(aVar);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(aVar);
    }

    public static w.a<ViewGroup, ArrayList<f>> b() {
        w.a<ViewGroup, ArrayList<f>> aVar;
        ThreadLocal<WeakReference<w.a<ViewGroup, ArrayList<f>>>> threadLocal = f12812b;
        WeakReference<w.a<ViewGroup, ArrayList<f>>> weakReference = threadLocal.get();
        if (weakReference != null && (aVar = weakReference.get()) != null) {
            return aVar;
        }
        w.a<ViewGroup, ArrayList<f>> aVar2 = new w.a<>();
        threadLocal.set(new WeakReference<>(aVar2));
        return aVar2;
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public f s;

        /* renamed from: t, reason: collision with root package name */
        public ViewGroup f12814t;

        /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
        /* renamed from: e2.j$a$a, reason: collision with other inner class name */
        public class C0052a extends i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ w.a f12815a;

            public C0052a(w.a aVar) {
                this.f12815a = aVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // e2.f.d
            public final void d(f fVar) {
                ((ArrayList) this.f12815a.get(a.this.f12814t)).remove(fVar);
                fVar.w(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:107:0x0249  */
        /* JADX WARN: Removed duplicated region for block: B:134:0x01f5 A[EDGE_INSN: B:134:0x01f5->B:90:0x01f5 BREAK  A[LOOP:1: B:18:0x0084->B:89:0x01eb], SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x01fc  */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean onPreDraw() {
            ArrayList arrayList;
            int i6;
            y50 y50Var;
            w.a aVar;
            w.a aVar2;
            int i7;
            int[] iArr;
            int i8;
            int i9;
            int i10;
            f.b bVar;
            y50 y50Var2;
            boolean z6;
            m mVar;
            View view;
            View view2;
            y50 y50Var3;
            boolean z7;
            f fVar = this.s;
            ViewGroup viewGroup = this.f12814t;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            boolean z8 = true;
            if (!j.f12813c.remove(viewGroup)) {
                return true;
            }
            w.a<ViewGroup, ArrayList<f>> aVarB = j.b();
            ArrayList<f> arrayList2 = aVarB.get(viewGroup);
            if (arrayList2 != null) {
                arrayList = arrayList2.size() > 0 ? new ArrayList(arrayList2) : null;
                arrayList2.add(fVar);
                fVar.a(new C0052a(aVarB));
                i6 = 0;
                fVar.h(viewGroup, false);
                if (arrayList != null) {
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((f) obj).x(viewGroup);
                    }
                }
                fVar.C = new ArrayList<>();
                fVar.D = new ArrayList<>();
                y50 y50Var4 = fVar.f12795y;
                y50Var = fVar.f12796z;
                aVar = new w.a((w.a) y50Var4.s);
                aVar2 = new w.a((w.a) y50Var.s);
                i7 = 0;
                while (true) {
                    iArr = fVar.B;
                    if (i7 < iArr.length) {
                        break;
                    }
                    int i12 = iArr[i7];
                    if (i12 == z8) {
                        y50Var2 = y50Var;
                        z6 = z8;
                        for (int i13 = aVar.f14850u - 1; i13 >= 0; i13--) {
                            View view3 = (View) aVar.f(i13);
                            if (view3 != null && fVar.t(view3) && (mVar = (m) aVar2.remove(view3)) != null && fVar.t(mVar.f12821b)) {
                                fVar.C.add((m) aVar.g(i13));
                                fVar.D.add(mVar);
                            }
                        }
                    } else if (i12 == 2) {
                        y50Var2 = y50Var;
                        z6 = z8;
                        w.a aVar3 = (w.a) y50Var4.f10862v;
                        w.a aVar4 = (w.a) y50Var2.f10862v;
                        int i14 = aVar3.f14850u;
                        for (int i15 = 0; i15 < i14; i15++) {
                            View view4 = (View) aVar3.i(i15);
                            if (view4 != null && fVar.t(view4) && (view = (View) aVar4.get(aVar3.f(i15))) != null && fVar.t(view)) {
                                m mVar2 = (m) aVar.get(view4);
                                m mVar3 = (m) aVar2.get(view);
                                if (mVar2 != null && mVar3 != null) {
                                    fVar.C.add(mVar2);
                                    fVar.D.add(mVar3);
                                    aVar.remove(view4);
                                    aVar2.remove(view);
                                }
                            }
                        }
                    } else if (i12 == 3) {
                        z6 = z8;
                        SparseArray sparseArray = (SparseArray) y50Var4.f10860t;
                        y50Var2 = y50Var;
                        SparseArray sparseArray2 = (SparseArray) y50Var2.f10860t;
                        int size2 = sparseArray.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            View view5 = (View) sparseArray.valueAt(i16);
                            if (view5 != null && fVar.t(view5) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i16))) != null && fVar.t(view2)) {
                                m mVar4 = (m) aVar.get(view5);
                                m mVar5 = (m) aVar2.get(view2);
                                if (mVar4 != null && mVar5 != null) {
                                    fVar.C.add(mVar4);
                                    fVar.D.add(mVar5);
                                    aVar.remove(view5);
                                    aVar2.remove(view2);
                                }
                            }
                        }
                    } else if (i12 != 4) {
                        y50Var2 = y50Var;
                        z6 = z8;
                    } else {
                        w.d dVar = (w.d) y50Var4.f10861u;
                        w.d dVar2 = (w.d) y50Var.f10861u;
                        int iE = dVar.e();
                        int i17 = i6;
                        while (i17 < iE) {
                            View view6 = (View) dVar.f(i17);
                            if (view6 == null || !fVar.t(view6)) {
                                y50Var3 = y50Var;
                            } else {
                                y50Var3 = y50Var;
                                View view7 = (View) dVar2.b(dVar.c(i17));
                                if (view7 != null && fVar.t(view7)) {
                                    m mVar6 = (m) aVar.get(view6);
                                    m mVar7 = (m) aVar2.get(view7);
                                    if (mVar6 != null && mVar7 != null) {
                                        z7 = z8;
                                        fVar.C.add(mVar6);
                                        fVar.D.add(mVar7);
                                        aVar.remove(view6);
                                        aVar2.remove(view7);
                                    }
                                }
                                i17++;
                                y50Var = y50Var3;
                                z8 = z7;
                            }
                            z7 = z8;
                            i17++;
                            y50Var = y50Var3;
                            z8 = z7;
                        }
                        z6 = z8;
                        y50Var2 = y50Var;
                    }
                    i7++;
                    y50Var = y50Var2;
                    z8 = z6;
                    i6 = 0;
                }
                boolean z9 = z8;
                for (i8 = 0; i8 < aVar.f14850u; i8++) {
                    m mVar8 = (m) aVar.i(i8);
                    if (fVar.t(mVar8.f12821b)) {
                        fVar.C.add(mVar8);
                        fVar.D.add(null);
                    }
                }
                for (i9 = 0; i9 < aVar2.f14850u; i9++) {
                    m mVar9 = (m) aVar2.i(i9);
                    if (fVar.t(mVar9.f12821b)) {
                        fVar.D.add(mVar9);
                        fVar.C.add(null);
                    }
                }
                w.a<Animator, f.b> aVarP = f.p();
                int i18 = aVarP.f14850u;
                WindowId windowId = viewGroup.getWindowId();
                i10 = i18 - 1;
                while (i10 >= 0) {
                    Animator animatorF = aVarP.f(i10);
                    if (animatorF != null && (bVar = aVarP.get(animatorF)) != null) {
                        f fVar2 = bVar.f12801e;
                        View view8 = bVar.f12797a;
                        if (view8 != null && windowId.equals(bVar.f12800d)) {
                            m mVar10 = bVar.f12799c;
                            boolean z10 = z9;
                            m mVarR = fVar.r(view8, z10);
                            m mVarN = fVar.n(view8, z10);
                            if (mVarR == null && mVarN == null) {
                                mVarN = (m) ((w.a) fVar.f12796z.s).get(view8);
                            }
                            if ((mVarR != null || mVarN != null) && fVar2.s(mVar10, mVarN)) {
                                fVar2.o().getClass();
                                if (animatorF.isRunning() || animatorF.isStarted()) {
                                    animatorF.cancel();
                                } else {
                                    aVarP.remove(animatorF);
                                }
                            }
                        }
                    }
                    i10--;
                    z9 = true;
                }
                fVar.l(viewGroup, fVar.f12795y, fVar.f12796z, fVar.C, fVar.D);
                fVar.y();
                return true;
            }
            arrayList2 = new ArrayList<>();
            aVarB.put(viewGroup, arrayList2);
            arrayList2.add(fVar);
            fVar.a(new C0052a(aVarB));
            i6 = 0;
            fVar.h(viewGroup, false);
            if (arrayList != null) {
            }
            fVar.C = new ArrayList<>();
            fVar.D = new ArrayList<>();
            y50 y50Var42 = fVar.f12795y;
            y50Var = fVar.f12796z;
            aVar = new w.a((w.a) y50Var42.s);
            aVar2 = new w.a((w.a) y50Var.s);
            i7 = 0;
            while (true) {
                iArr = fVar.B;
                if (i7 < iArr.length) {
                }
                i7++;
                y50Var = y50Var2;
                z8 = z6;
                i6 = 0;
            }
            boolean z92 = z8;
            while (i8 < aVar.f14850u) {
            }
            while (i9 < aVar2.f14850u) {
            }
            w.a<Animator, f.b> aVarP2 = f.p();
            int i182 = aVarP2.f14850u;
            WindowId windowId2 = viewGroup.getWindowId();
            i10 = i182 - 1;
            while (i10 >= 0) {
            }
            fVar.l(viewGroup, fVar.f12795y, fVar.f12796z, fVar.C, fVar.D);
            fVar.y();
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            ViewGroup viewGroup = this.f12814t;
            viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
            viewGroup.removeOnAttachStateChangeListener(this);
            j.f12813c.remove(viewGroup);
            ArrayList<f> arrayList = j.b().get(viewGroup);
            if (arrayList != null && arrayList.size() > 0) {
                int size = arrayList.size();
                int i6 = 0;
                while (i6 < size) {
                    f fVar = arrayList.get(i6);
                    i6++;
                    fVar.x(viewGroup);
                }
            }
            this.s.i(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }
    }
}
