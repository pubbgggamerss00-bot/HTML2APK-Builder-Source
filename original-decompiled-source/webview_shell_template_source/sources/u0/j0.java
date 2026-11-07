package u0;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class j0 implements Iterator<View>, q5.a {
    public int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f14507t;

    public j0(ViewGroup viewGroup) {
        this.f14507t = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.s < this.f14507t.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i6 = this.s;
        this.s = i6 + 1;
        View childAt = this.f14507t.getChildAt(i6);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i6 = this.s - 1;
        this.s = i6;
        this.f14507t.removeViewAt(i6);
    }
}
