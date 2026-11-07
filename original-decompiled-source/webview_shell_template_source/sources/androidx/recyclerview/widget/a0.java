package androidx.recyclerview.widget;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class a0 extends RecyclerView.o {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f1584a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1585b = new a();

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a extends RecyclerView.q {

        /* renamed from: a, reason: collision with root package name */
        public boolean f1586a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void a(RecyclerView recyclerView, int i6) {
            if (i6 == 0 && this.f1586a) {
                this.f1586a = false;
                a0.this.c();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.q
        public final void b(RecyclerView recyclerView, int i6, int i7) {
            if (i6 == 0 && i7 == 0) {
                return;
            }
            this.f1586a = true;
        }
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f1584a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        a aVar = this.f1585b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.B0;
            if (arrayList != null) {
                arrayList.remove(aVar);
            }
            this.f1584a.setOnFlingListener(null);
        }
        this.f1584a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f1584a.j(aVar);
            this.f1584a.setOnFlingListener(this);
            new Scroller(this.f1584a.getContext(), new DecelerateInterpolator());
            c();
        }
    }

    public abstract int[] b(RecyclerView.m mVar, View view);

    public final void c() {
        RecyclerView.m layoutManager;
        RecyclerView recyclerView = this.f1584a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return;
        }
        u uVar = (u) this;
        View viewE = layoutManager.e() ? u.e(layoutManager, uVar.g(layoutManager)) : layoutManager.d() ? u.e(layoutManager, uVar.f(layoutManager)) : null;
        if (viewE == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i6 = iArrB[0];
        if (i6 == 0 && iArrB[1] == 0) {
            return;
        }
        this.f1584a.i0(i6, iArrB[1], false);
    }
}
