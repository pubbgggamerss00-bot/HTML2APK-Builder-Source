package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.v;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y extends y3.a {

    /* renamed from: d, reason: collision with root package name */
    public final v f2820d;

    /* renamed from: e, reason: collision with root package name */
    public final a f2821e;

    public static class a extends y3.a {

        /* renamed from: d, reason: collision with root package name */
        public final y f2822d;

        /* renamed from: e, reason: collision with root package name */
        public final WeakHashMap f2823e = new WeakHashMap();

        public a(y yVar) {
            this.f2822d = yVar;
        }

        @Override // y3.a
        public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
            y3.a aVar = (y3.a) this.f2823e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : this.f33785a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // y3.a
        public final z3.k b(View view) {
            y3.a aVar = (y3.a) this.f2823e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // y3.a
        public final void c(View view, AccessibilityEvent accessibilityEvent) {
            y3.a aVar = (y3.a) this.f2823e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                super.c(view, accessibilityEvent);
            }
        }

        @Override // y3.a
        public final void d(View view, z3.j jVar) {
            AccessibilityNodeInfo accessibilityNodeInfo = jVar.f34725a;
            y yVar = this.f2822d;
            v vVar = yVar.f2820d;
            v vVar2 = yVar.f2820d;
            boolean zL = vVar.L();
            View.AccessibilityDelegate accessibilityDelegate = this.f33785a;
            if (zL || vVar2.getLayoutManager() == null) {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                return;
            }
            vVar2.getLayoutManager().W(view, jVar);
            y3.a aVar = (y3.a) this.f2823e.get(view);
            if (aVar != null) {
                aVar.d(view, jVar);
            } else {
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            }
        }

        @Override // y3.a
        public final void e(View view, AccessibilityEvent accessibilityEvent) {
            y3.a aVar = (y3.a) this.f2823e.get(view);
            if (aVar != null) {
                aVar.e(view, accessibilityEvent);
            } else {
                super.e(view, accessibilityEvent);
            }
        }

        @Override // y3.a
        public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            y3.a aVar = (y3.a) this.f2823e.get(viewGroup);
            return aVar != null ? aVar.f(viewGroup, view, accessibilityEvent) : this.f33785a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // y3.a
        public final boolean g(View view, int i10, Bundle bundle) {
            y yVar = this.f2822d;
            v vVar = yVar.f2820d;
            v vVar2 = yVar.f2820d;
            if (vVar.L() || vVar2.getLayoutManager() == null) {
                return super.g(view, i10, bundle);
            }
            y3.a aVar = (y3.a) this.f2823e.get(view);
            if (aVar != null) {
                if (aVar.g(view, i10, bundle)) {
                    return true;
                }
            } else if (super.g(view, i10, bundle)) {
                return true;
            }
            v.r rVar = vVar2.getLayoutManager().f2741b.f2661c;
            return false;
        }

        @Override // y3.a
        public final void h(View view, int i10) {
            y3.a aVar = (y3.a) this.f2823e.get(view);
            if (aVar != null) {
                aVar.h(view, i10);
            } else {
                super.h(view, i10);
            }
        }

        @Override // y3.a
        public final void i(View view, AccessibilityEvent accessibilityEvent) {
            y3.a aVar = (y3.a) this.f2823e.get(view);
            if (aVar != null) {
                aVar.i(view, accessibilityEvent);
            } else {
                super.i(view, accessibilityEvent);
            }
        }
    }

    public y(v vVar) {
        this.f2820d = vVar;
        a aVar = this.f2821e;
        if (aVar != null) {
            this.f2821e = aVar;
        } else {
            this.f2821e = new a(this);
        }
    }

    @Override // y3.a
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof v) || this.f2820d.L()) {
            return;
        }
        v vVar = (v) view;
        if (vVar.getLayoutManager() != null) {
            vVar.getLayoutManager().U(accessibilityEvent);
        }
    }

    @Override // y3.a
    public final void d(View view, z3.j jVar) {
        this.f33785a.onInitializeAccessibilityNodeInfo(view, jVar.f34725a);
        v vVar = this.f2820d;
        if (vVar.L() || vVar.getLayoutManager() == null) {
            return;
        }
        v.l layoutManager = vVar.getLayoutManager();
        v vVar2 = layoutManager.f2741b;
        layoutManager.V(vVar2.f2661c, vVar2.f2675j0, jVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[PHI: r7
      0x0079: PHI (r7v8 int) = (r7v4 int), (r7v13 int) binds: [B:32:0x0096, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // y3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean g(View view, int i10, Bundle bundle) {
        int iG;
        int iE;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        v vVar = this.f2820d;
        if (!vVar.L() && vVar.getLayoutManager() != null) {
            v.l layoutManager = vVar.getLayoutManager();
            v.r rVar = layoutManager.f2741b.f2661c;
            int iHeight = layoutManager.f2754o;
            int iWidth = layoutManager.f2753n;
            Rect rect = new Rect();
            if (layoutManager.f2741b.getMatrix().isIdentity() && layoutManager.f2741b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i10 == 4096) {
                iG = layoutManager.f2741b.canScrollVertically(1) ? (iHeight - layoutManager.G()) - layoutManager.D() : 0;
                if (layoutManager.f2741b.canScrollHorizontally(1)) {
                    iE = (iWidth - layoutManager.E()) - layoutManager.F();
                }
                if (iG == 0) {
                }
                layoutManager.f2741b.e0(iE, iG, true);
                return true;
            }
            if (i10 != 8192) {
                iG = 0;
                iE = 0;
            } else {
                iG = layoutManager.f2741b.canScrollVertically(-1) ? -((iHeight - layoutManager.G()) - layoutManager.D()) : 0;
                iE = layoutManager.f2741b.canScrollHorizontally(-1) ? -((iWidth - layoutManager.E()) - layoutManager.F()) : 0;
            }
            if (iG == 0 || iE != 0) {
                layoutManager.f2741b.e0(iE, iG, true);
                return true;
            }
        }
        return false;
    }
}
