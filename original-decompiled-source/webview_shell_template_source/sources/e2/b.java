package e2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class b extends e2.f {
    public static final String[] S = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    public static final a T = new a(PointF.class, "topLeft");
    public static final C0051b U = new C0051b(PointF.class, "bottomRight");
    public static final c V = new c(PointF.class, "bottomRight");
    public static final d W = new d(PointF.class, "topLeft");
    public static final e X = new e(PointF.class, "position");

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends Property<h, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(h hVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(h hVar, PointF pointF) {
            h hVar2 = hVar;
            PointF pointF2 = pointF;
            hVar2.getClass();
            hVar2.f12781a = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            hVar2.f12782b = iRound;
            int i6 = hVar2.f12786f + 1;
            hVar2.f12786f = i6;
            if (i6 == hVar2.f12787g) {
                o.a(hVar2.f12785e, hVar2.f12781a, iRound, hVar2.f12783c, hVar2.f12784d);
                hVar2.f12786f = 0;
                hVar2.f12787g = 0;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: e2.b$b, reason: collision with other inner class name */
    public class C0051b extends Property<h, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(h hVar) {
            return null;
        }

        @Override // android.util.Property
        public final void set(h hVar, PointF pointF) {
            h hVar2 = hVar;
            PointF pointF2 = pointF;
            hVar2.getClass();
            hVar2.f12783c = Math.round(pointF2.x);
            int iRound = Math.round(pointF2.y);
            hVar2.f12784d = iRound;
            int i6 = hVar2.f12787g + 1;
            hVar2.f12787g = i6;
            if (hVar2.f12786f == i6) {
                o.a(hVar2.f12785e, hVar2.f12781a, hVar2.f12782b, hVar2.f12783c, iRound);
                hVar2.f12786f = 0;
                hVar2.f12787g = 0;
            }
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class c extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            o.a(view2, view2.getLeft(), view2.getTop(), Math.round(pointF2.x), Math.round(pointF2.y));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class d extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            o.a(view2, Math.round(pointF2.x), Math.round(pointF2.y), view2.getRight(), view2.getBottom());
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class e extends Property<View, PointF> {
        @Override // android.util.Property
        public final /* bridge */ /* synthetic */ PointF get(View view) {
            return null;
        }

        @Override // android.util.Property
        public final void set(View view, PointF pointF) {
            View view2 = view;
            PointF pointF2 = pointF;
            int iRound = Math.round(pointF2.x);
            int iRound2 = Math.round(pointF2.y);
            o.a(view2, iRound, iRound2, view2.getWidth() + iRound, view2.getHeight() + iRound2);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class f extends AnimatorListenerAdapter {
        private final h mViewBounds;

        public f(h hVar) {
            this.mViewBounds = hVar;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class g extends i {

        /* renamed from: a, reason: collision with root package name */
        public boolean f12779a = false;

        /* renamed from: b, reason: collision with root package name */
        public final ViewGroup f12780b;

        public g(ViewGroup viewGroup) {
            this.f12780b = viewGroup;
        }

        @Override // e2.i, e2.f.d
        public final void a() {
            n.a(this.f12780b, false);
        }

        @Override // e2.i, e2.f.d
        public final void c(e2.f fVar) {
            n.a(this.f12780b, false);
            this.f12779a = true;
        }

        @Override // e2.f.d
        public final void d(e2.f fVar) {
            if (!this.f12779a) {
                n.a(this.f12780b, false);
            }
            fVar.w(this);
        }

        @Override // e2.i, e2.f.d
        public final void e() {
            n.a(this.f12780b, true);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class h {

        /* renamed from: a, reason: collision with root package name */
        public int f12781a;

        /* renamed from: b, reason: collision with root package name */
        public int f12782b;

        /* renamed from: c, reason: collision with root package name */
        public int f12783c;

        /* renamed from: d, reason: collision with root package name */
        public int f12784d;

        /* renamed from: e, reason: collision with root package name */
        public final View f12785e;

        /* renamed from: f, reason: collision with root package name */
        public int f12786f;

        /* renamed from: g, reason: collision with root package name */
        public int f12787g;

        public h(View view) {
            this.f12785e = view;
        }
    }

    public static void H(m mVar) {
        View view = mVar.f12821b;
        HashMap map = mVar.f12820a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // e2.f
    public final void d(m mVar) {
        H(mVar);
    }

    @Override // e2.f
    public final void g(m mVar) {
        H(mVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e2.f
    public final Animator k(ViewGroup viewGroup, m mVar, m mVar2) {
        int i6;
        b bVar;
        ObjectAnimator objectAnimatorA;
        if (mVar != null) {
            HashMap map = mVar.f12820a;
            if (mVar2 != null) {
                HashMap map2 = mVar2.f12820a;
                ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
                ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
                if (viewGroup2 != null && viewGroup3 != null) {
                    View view = mVar2.f12821b;
                    Rect rect = (Rect) map.get("android:changeBounds:bounds");
                    Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
                    int i7 = rect.left;
                    int i8 = rect2.left;
                    int i9 = rect.top;
                    int i10 = rect2.top;
                    int i11 = rect.right;
                    int i12 = rect2.right;
                    int i13 = rect.bottom;
                    int i14 = rect2.bottom;
                    int i15 = i11 - i7;
                    int i16 = i13 - i9;
                    int i17 = i12 - i8;
                    int i18 = i14 - i10;
                    Rect rect3 = (Rect) map.get("android:changeBounds:clip");
                    Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
                    if ((i15 == 0 || i16 == 0) && (i17 == 0 || i18 == 0)) {
                        i6 = 0;
                    } else {
                        i6 = (i7 == i8 && i9 == i10) ? 0 : 1;
                        if (i11 != i12 || i13 != i14) {
                            i6++;
                        }
                    }
                    if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
                        i6++;
                    }
                    int i19 = i6;
                    if (i19 > 0) {
                        o.a(view, i7, i9, i11, i13);
                        if (i19 != 2) {
                            bVar = this;
                            objectAnimatorA = (i7 == i8 && i9 == i10) ? e2.d.a(view, V, bVar.N.b(i11, i13, i12, i14)) : e2.d.a(view, W, bVar.N.b(i7, i9, i8, i10));
                        } else if (i15 == i17 && i16 == i18) {
                            bVar = this;
                            objectAnimatorA = e2.d.a(view, X, bVar.N.b(i7, i9, i8, i10));
                        } else {
                            bVar = this;
                            h hVar = new h(view);
                            ObjectAnimator objectAnimatorA2 = e2.d.a(hVar, T, bVar.N.b(i7, i9, i8, i10));
                            ObjectAnimator objectAnimatorA3 = e2.d.a(hVar, U, bVar.N.b(i11, i13, i12, i14));
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(objectAnimatorA2, objectAnimatorA3);
                            animatorSet.addListener(new f(hVar));
                            objectAnimatorA = animatorSet;
                        }
                        if (view.getParent() instanceof ViewGroup) {
                            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                            n.a(viewGroup4, true);
                            bVar.o().a(new g(viewGroup4));
                        }
                        return objectAnimatorA;
                    }
                }
            }
        }
        return null;
    }

    @Override // e2.f
    public final String[] q() {
        return S;
    }
}
