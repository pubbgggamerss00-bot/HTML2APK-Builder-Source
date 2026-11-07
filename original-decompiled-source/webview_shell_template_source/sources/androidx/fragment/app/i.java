package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.j0;
import androidx.fragment.app.k;
import androidx.fragment.app.o;
import com.htmltoapk.template.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class i extends j0 {

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends b {

        /* renamed from: c, reason: collision with root package name */
        public boolean f1138c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f1139d;

        /* renamed from: e, reason: collision with root package name */
        public o.a f1140e;

        /* JADX WARN: Removed duplicated region for block: B:17:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final o.a b(Context context) throws Resources.NotFoundException {
            int iA;
            Animation animationLoadAnimation;
            o.a aVar;
            if (this.f1139d) {
                return this.f1140e;
            }
            j0.d dVar = this.f1141a;
            k kVar = dVar.f1169c;
            boolean z6 = dVar.f1167a == j0.d.c.f1178t;
            boolean z7 = this.f1138c;
            k.c cVar = kVar.Z;
            int i6 = cVar == null ? 0 : cVar.f1206f;
            if (z7) {
                if (z6) {
                    iA = cVar == null ? 0 : cVar.f1204d;
                } else if (cVar != null) {
                    iA = cVar.f1205e;
                }
            } else if (z6) {
                if (cVar != null) {
                    iA = cVar.f1202b;
                }
            } else if (cVar != null) {
                iA = cVar.f1203c;
            }
            kVar.A(0, 0, 0, 0);
            ViewGroup viewGroup = kVar.V;
            o.a aVar2 = null;
            if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
                kVar.V.setTag(R.id.visible_removing_fragment_view_tag, null);
            }
            ViewGroup viewGroup2 = kVar.V;
            if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
                if (iA == 0 && i6 != 0) {
                    iA = i6 != 4097 ? i6 != 8194 ? i6 != 8197 ? i6 != 4099 ? i6 != 4100 ? -1 : z6 ? o.a(context, android.R.attr.activityOpenEnterAnimation) : o.a(context, android.R.attr.activityOpenExitAnimation) : z6 ? R.animator.fragment_fade_enter : R.animator.fragment_fade_exit : z6 ? o.a(context, android.R.attr.activityCloseEnterAnimation) : o.a(context, android.R.attr.activityCloseExitAnimation) : z6 ? R.animator.fragment_close_enter : R.animator.fragment_close_exit : z6 ? R.animator.fragment_open_enter : R.animator.fragment_open_exit;
                }
                if (iA != 0) {
                    boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
                    if (zEquals) {
                        try {
                            animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                        } catch (Resources.NotFoundException e6) {
                            throw e6;
                        } catch (RuntimeException unused) {
                        }
                        if (animationLoadAnimation != null) {
                            aVar = new o.a(animationLoadAnimation);
                            aVar2 = aVar;
                        }
                    } else {
                        try {
                            Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                            if (animatorLoadAnimator != null) {
                                aVar = new o.a(animatorLoadAnimator);
                                aVar2 = aVar;
                            }
                        } catch (RuntimeException e7) {
                            if (zEquals) {
                                throw e7;
                            }
                            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                            if (animationLoadAnimation2 != null) {
                                aVar2 = new o.a(animationLoadAnimation2);
                            }
                        }
                    }
                }
            }
            this.f1140e = aVar2;
            this.f1139d = true;
            return aVar2;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final j0.d f1141a;

        /* renamed from: b, reason: collision with root package name */
        public final q0.c f1142b;

        public b(j0.d dVar, q0.c cVar) {
            this.f1141a = dVar;
            this.f1142b = cVar;
        }

        public final void a() {
            j0.d dVar = this.f1141a;
            HashSet<q0.c> hashSet = dVar.f1171e;
            if (hashSet.remove(this.f1142b) && hashSet.isEmpty()) {
                dVar.b();
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends b {
    }

    @Override // androidx.fragment.app.j0
    public final void b(ArrayList arrayList, boolean z6) throws Resources.NotFoundException {
        j0.d.c cVar;
        j0.d.c cVar2;
        boolean z7;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        j0.d dVar = null;
        j0.d dVar2 = null;
        int i6 = 0;
        while (true) {
            cVar = j0.d.c.f1178t;
            if (i6 >= size) {
                break;
            }
            Object obj = arrayList2.get(i6);
            i6++;
            j0.d dVar3 = (j0.d) obj;
            j0.d.c cVarC = j0.d.c.c(dVar3.f1169c.W);
            int iOrdinal = dVar3.f1167a.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2 || iOrdinal == 3) {
                    }
                } else if (cVarC != cVar) {
                    dVar2 = dVar3;
                }
            }
            if (cVarC == cVar && dVar == null) {
                dVar = dVar3;
            }
        }
        if (y.H(2)) {
            Log.v("FragmentManager", "Executing operations from " + dVar + " to " + dVar2);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        k kVar = ((j0.d) arrayList2.get(arrayList2.size() - 1)).f1169c;
        int size2 = arrayList2.size();
        for (int i7 = 0; i7 < size2; i7++) {
            k.c cVar3 = ((j0.d) arrayList2.get(i7)).f1169c.Z;
            k.c cVar4 = kVar.Z;
            cVar3.f1202b = cVar4.f1202b;
            cVar3.f1203c = cVar4.f1203c;
            cVar3.f1204d = cVar4.f1204d;
            cVar3.f1205e = cVar4.f1205e;
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj2 = arrayList2.get(i8);
            i8++;
            j0.d dVar4 = (j0.d) obj2;
            q0.c cVar5 = new q0.c();
            dVar4.d();
            HashSet<q0.c> hashSet = dVar4.f1171e;
            hashSet.add(cVar5);
            a aVar = new a(dVar4, cVar5);
            aVar.f1139d = false;
            aVar.f1138c = z6;
            arrayList3.add(aVar);
            q0.c cVar6 = new q0.c();
            dVar4.d();
            hashSet.add(cVar6);
            boolean z8 = !z6 ? dVar4 != dVar2 : dVar4 != dVar;
            c cVar7 = new c(dVar4, cVar6);
            j0.d.c cVar8 = dVar4.f1167a;
            k kVar2 = dVar4.f1169c;
            if (cVar8 == cVar) {
                if (z6) {
                    k.c cVar9 = kVar2.Z;
                } else {
                    kVar2.getClass();
                }
                if (z6) {
                    k.c cVar10 = kVar2.Z;
                } else {
                    k.c cVar11 = kVar2.Z;
                }
            } else if (z6) {
                k.c cVar12 = kVar2.Z;
            } else {
                kVar2.getClass();
            }
            if (z8) {
                if (z6) {
                    k.c cVar13 = kVar2.Z;
                } else {
                    kVar2.getClass();
                }
            }
            arrayList4.add(cVar7);
            dVar4.f1170d.add(new d(this, arrayList5, dVar4));
            arrayList2 = arrayList;
        }
        HashMap map = new HashMap();
        int size4 = arrayList4.size();
        int i9 = 0;
        while (i9 < size4) {
            Object obj3 = arrayList4.get(i9);
            i9++;
            j0.d dVar5 = ((c) obj3).f1141a;
            j0.d.c.c(dVar5.f1169c.W);
            j0.d.c cVar14 = dVar5.f1167a;
        }
        int size5 = arrayList4.size();
        int i10 = 0;
        while (i10 < size5) {
            Object obj4 = arrayList4.get(i10);
            i10++;
            c cVar15 = (c) obj4;
            map.put(cVar15.f1141a, Boolean.FALSE);
            cVar15.a();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f1160a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z9 = false;
        int i11 = 0;
        while (i11 < size6) {
            Object obj5 = arrayList3.get(i11);
            i11++;
            boolean z10 = zContainsValue;
            a aVar2 = (a) obj5;
            ArrayList arrayList7 = arrayList3;
            j0.d dVar6 = aVar2.f1141a;
            int i12 = size6;
            j0.d.c cVarC2 = j0.d.c.c(dVar6.f1169c.W);
            j0.d.c cVar16 = dVar6.f1167a;
            if (cVarC2 == cVar16 || !(cVarC2 == cVar || cVar16 == cVar)) {
                cVar2 = cVar;
                z7 = z9;
                viewGroup = viewGroup2;
                aVar2.a();
                zContainsValue = z10;
                size6 = i12;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z9 = z7;
                cVar = cVar2;
            } else {
                o.a aVarB = aVar2.b(context);
                if (aVarB == null) {
                    aVar2.a();
                } else {
                    Animator animator = aVarB.f1215b;
                    if (animator == null) {
                        arrayList6.add(aVar2);
                    } else {
                        j0.d dVar7 = aVar2.f1141a;
                        k kVar3 = dVar7.f1169c;
                        cVar2 = cVar;
                        z7 = z9;
                        if (Boolean.TRUE.equals(map.get(dVar7))) {
                            if (y.H(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + kVar3 + " as this Fragment was involved in a Transition.");
                            }
                            aVar2.a();
                            viewGroup = viewGroup2;
                            zContainsValue = z10;
                            size6 = i12;
                            viewGroup2 = viewGroup;
                            arrayList3 = arrayList7;
                            z9 = z7;
                            cVar = cVar2;
                        } else {
                            boolean z11 = dVar7.f1167a == j0.d.c.f1179u;
                            if (z11) {
                                arrayList5.remove(dVar7);
                            }
                            View view = kVar3.W;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new e(viewGroup3, view, z11, dVar7, aVar2));
                            animator.setTarget(view);
                            animator.start();
                            if (y.H(2)) {
                                Log.v("FragmentManager", "Animator from operation " + dVar7 + " has started.");
                            }
                            aVar2.f1142b.a(new f(animator, dVar7));
                            zContainsValue = z10;
                            size6 = i12;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            cVar = cVar2;
                            z9 = true;
                        }
                    }
                }
                cVar2 = cVar;
                z7 = z9;
                viewGroup = viewGroup2;
                zContainsValue = z10;
                size6 = i12;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z9 = z7;
                cVar = cVar2;
            }
        }
        boolean z12 = zContainsValue;
        boolean z13 = z9;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i13 = 0;
        while (i13 < size7) {
            Object obj6 = arrayList6.get(i13);
            i13++;
            a aVar3 = (a) obj6;
            j0.d dVar8 = aVar3.f1141a;
            k kVar4 = dVar8.f1169c;
            if (z12) {
                if (y.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + kVar4 + " as Animations cannot run alongside Transitions.");
                }
                aVar3.a();
            } else if (z13) {
                if (y.H(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + kVar4 + " as Animations cannot run alongside Animators.");
                }
                aVar3.a();
            } else {
                View view2 = kVar4.W;
                o.a aVarB2 = aVar3.b(context);
                aVarB2.getClass();
                Animation animation = aVarB2.f1214a;
                animation.getClass();
                int i14 = size7;
                if (dVar8.f1167a != j0.d.c.s) {
                    view2.startAnimation(animation);
                    aVar3.a();
                } else {
                    viewGroup4.startViewTransition(view2);
                    o.b bVar = new o.b(animation, viewGroup4, view2);
                    bVar.setAnimationListener(new g(view2, viewGroup4, aVar3, dVar8));
                    view2.startAnimation(bVar);
                    if (y.H(2)) {
                        Log.v("FragmentManager", "Animation from operation " + dVar8 + " has started.");
                    }
                }
                aVar3.f1142b.a(new h(view2, viewGroup4, aVar3, dVar8));
                size7 = i14;
            }
        }
        int size8 = arrayList5.size();
        int i15 = 0;
        while (i15 < size8) {
            Object obj7 = arrayList5.get(i15);
            i15++;
            j0.d dVar9 = (j0.d) obj7;
            dVar9.f1167a.a(dVar9.f1169c.W);
        }
        arrayList5.clear();
        if (y.H(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + dVar + " to " + dVar2);
        }
    }
}
