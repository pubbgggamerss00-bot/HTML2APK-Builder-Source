package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.v;

/* loaded from: classes.dex */
public abstract class b0 extends v.n {

    /* renamed from: a, reason: collision with root package name */
    public v f2519a;

    /* renamed from: b, reason: collision with root package name */
    public final a f2520b = new a();

    public class a extends v.p {

        /* renamed from: a, reason: collision with root package name */
        public boolean f2521a = false;

        public a() {
        }

        @Override // androidx.recyclerview.widget.v.p
        public final void a(v vVar, int i10) {
            if (i10 == 0 && this.f2521a) {
                this.f2521a = false;
                b0.this.b();
            }
        }

        @Override // androidx.recyclerview.widget.v.p
        public final void b(v vVar, int i10, int i11) {
            if (i10 == 0 && i11 == 0) {
                return;
            }
            this.f2521a = true;
        }
    }

    public abstract int[] a(v.l lVar, View view);

    public final void b() {
        v.l layoutManager;
        v vVar = this.f2519a;
        if (vVar == null || (layoutManager = vVar.getLayoutManager()) == null) {
            return;
        }
        u uVar = (u) this;
        View viewD = layoutManager.e() ? u.d(layoutManager, uVar.f(layoutManager)) : layoutManager.d() ? u.d(layoutManager, uVar.e(layoutManager)) : null;
        if (viewD == null) {
            return;
        }
        int[] iArrA = a(layoutManager, viewD);
        int i10 = iArrA[0];
        if (i10 == 0 && iArrA[1] == 0) {
            return;
        }
        this.f2519a.e0(i10, iArrA[1], false);
    }
}
