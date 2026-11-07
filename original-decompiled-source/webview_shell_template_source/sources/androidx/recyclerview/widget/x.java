package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class x extends u0.a {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f1721d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1722e;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class a extends u0.a {

        /* renamed from: d, reason: collision with root package name */
        public final x f1723d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f1724e = new WeakHashMap();

        public a(x xVar) {
            this.f1723d = xVar;
        }

        @Override // u0.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            u0.a aVar = (u0.a) this.f1724e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : this.f14446a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // u0.a
        public final v0.c b(View view) {
            u0.a aVar = (u0.a) this.f1724e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // u0.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            u0.a aVar = (u0.a) this.f1724e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // u0.a
        public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) v0.b bVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = bVar.f14729a;
            x xVar = this.f1723d;
            RecyclerView recyclerView = xVar.f1721d;
            RecyclerView recyclerView2 = xVar.f1721d;
            boolean zO = recyclerView.O();
            View.AccessibilityDelegate accessibilityDelegate = this.f14446a;
            if (zO || recyclerView2.getLayoutManager() == null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
            recyclerView2.getLayoutManager().W(view, bVar);
            u0.a aVar = (u0.a) this.f1724e.get(view);
            if (aVar != null) {
                aVar.d(view, bVar);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // u0.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            u0.a aVar = (u0.a) this.f1724e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // u0.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            u0.a aVar = (u0.a) this.f1724e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : this.f14446a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // u0.a
        public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i6, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            x xVar = this.f1723d;
            RecyclerView recyclerView = xVar.f1721d;
            RecyclerView recyclerView2 = xVar.f1721d;
            if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
                return super.g(view, i6, bundle);
            }
            u0.a aVar = (u0.a) this.f1724e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i6, bundle)) {
                    return true;
                }
            } else if (super.g(view, i6, bundle)) {
                return true;
            }
            RecyclerView.s sVar = recyclerView2.getLayoutManager().f1473b.f1422u;
            return false;
        }

        @Override // u0.a
        public final void h(View view, int i6) {
            u0.a aVar = (u0.a) this.f1724e.get(view);
            if (aVar != null) {
                aVar.h(view, i6);
            } else {
                super.h(view, i6);
            }
        }

        @Override // u0.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            u0.a aVar = (u0.a) this.f1724e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public x(RecyclerView recyclerView) {
        this.f1721d = recyclerView;
        a aVar = this.f1722e;
        if (aVar != null) {
            this.f1722e = aVar;
        } else {
            this.f1722e = new a(this);
        }
    }

    @Override // u0.a
    public final void c(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f1721d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // u0.a
    public final void d(@SuppressLint({"InvalidNullabilityOverride"}) View view, @SuppressLint({"InvalidNullabilityOverride"}) v0.b bVar) {
        this.f14446a.onInitializeAccessibilityNodeInfo(view, bVar.f14729a);
        RecyclerView recyclerView = this.f1721d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f1473b;
        layoutManager.V(recyclerView2.f1422u, recyclerView2.f1433z0, bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // u0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(@SuppressLint({"InvalidNullabilityOverride"}) View view, int i6, @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        int iG;
        int iE;
        if (super.g(view, i6, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f1721d;
        if (!recyclerView.O() && recyclerView.getLayoutManager() != null) {
            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
            RecyclerView.s sVar = layoutManager.f1473b.f1422u;
            int iHeight = layoutManager.f1485o;
            int iWidth = layoutManager.f1484n;
            Rect rect = new Rect();
            if (layoutManager.f1473b.getMatrix().isIdentity() && layoutManager.f1473b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i6 == 4096) {
                iG = layoutManager.f1473b.canScrollVertically(1) ? (iHeight - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f1473b.canScrollHorizontally(1)) {
                    iE = (iWidth - layoutManager.E()) - layoutManager.F();
                }
                if (iG == 0) {
                }
                layoutManager.f1473b.i0(iE, iG, true);
                return true;
            }
            if (i6 != 8192) {
                iG = 0;
                iE = 0;
            } else {
                iG = layoutManager.f1473b.canScrollVertically(-1) ? -((iHeight - layoutManager.G()) - layoutManager.D()) : 0;
                iE = layoutManager.f1473b.canScrollHorizontally(-1) ? -((iWidth - layoutManager.E()) - layoutManager.F()) : 0;
            }
            if (iG == 0 || iE != 0) {
                layoutManager.f1473b.i0(iE, iG, true);
                return true;
            }
        }
        return false;
    }
}
