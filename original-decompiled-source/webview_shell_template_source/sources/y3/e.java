package y3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class e<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a, reason: collision with root package name */
    public e1.c f15239a;

    /* renamed from: b, reason: collision with root package name */
    public int f15240b;

    public e() {
        this.f15240b = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        u(coordinatorLayout, v2, i6);
        if (this.f15239a == null) {
            e1.c cVar = new e1.c();
            cVar.f12778d = v2;
            this.f15239a = cVar;
        }
        e1.c cVar2 = this.f15239a;
        View view = (View) cVar2.f12778d;
        cVar2.f12775a = view.getTop();
        cVar2.f12776b = view.getLeft();
        this.f15239a.c();
        int i7 = this.f15240b;
        if (i7 == 0) {
            return true;
        }
        e1.c cVar3 = this.f15239a;
        if (cVar3.f12777c != i7) {
            cVar3.f12777c = i7;
            cVar3.c();
        }
        this.f15240b = 0;
        return true;
    }

    public final int s() {
        e1.c cVar = this.f15239a;
        if (cVar != null) {
            return cVar.f12777c;
        }
        return 0;
    }

    public int t() {
        return s();
    }

    public void u(CoordinatorLayout coordinatorLayout, V v2, int i6) {
        coordinatorLayout.k(v2, i6);
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15240b = 0;
    }
}
