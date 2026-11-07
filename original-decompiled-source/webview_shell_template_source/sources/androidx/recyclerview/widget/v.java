package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1719a;

    public v(RecyclerView recyclerView) {
        this.f1719a = recyclerView;
    }

    public final void a(int i6) {
        RecyclerView recyclerView = this.f1719a;
        View childAt = recyclerView.getChildAt(i6);
        if (childAt != null) {
            RecyclerView.b0 b0VarM = RecyclerView.M(childAt);
            RecyclerView.e eVar = recyclerView.E;
            if (eVar != null && b0VarM != null) {
                eVar.f(b0VarM);
            }
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i6);
    }
}
