package y3;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m0<T> implements Iterator<T>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f33867a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public Iterator<? extends T> f33868b;

    public m0(t0 t0Var) {
        this.f33868b = t0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f33868b.hasNext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Iterator
    public final T next() {
        T next = this.f33868b.next();
        View view = (View) next;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        t0 t0Var = viewGroup != null ? new t0(viewGroup) : null;
        ArrayList arrayList = this.f33867a;
        if (t0Var != null && t0Var.hasNext()) {
            arrayList.add(this.f33868b);
            this.f33868b = t0Var;
            return next;
        }
        while (!this.f33868b.hasNext() && !arrayList.isEmpty()) {
            this.f33868b = (Iterator) qg.x.J(arrayList);
            qg.t.t(arrayList);
        }
        return next;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
