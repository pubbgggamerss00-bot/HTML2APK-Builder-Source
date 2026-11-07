package y3;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class t0 implements Iterator<View>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public int f33895a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f33896b;

    public t0(ViewGroup viewGroup) {
        this.f33896b = viewGroup;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33895a < this.f33896b.getChildCount();
    }

    @Override // java.util.Iterator
    public final View next() {
        int i10 = this.f33895a;
        this.f33895a = i10 + 1;
        View childAt = this.f33896b.getChildAt(i10);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f33895a - 1;
        this.f33895a = i10;
        this.f33896b.removeViewAt(i10);
    }
}
