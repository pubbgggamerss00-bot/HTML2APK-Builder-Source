package x0;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p3 implements Iterator<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31863b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f31864c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31865d;

    /* renamed from: e, reason: collision with root package name */
    public int f31866e;

    public p3(a3 a3Var, int i10, s0 s0Var, ci.a aVar) {
        this.f31862a = a3Var;
        this.f31863b = i10;
        this.f31864c = s0Var;
        this.f31865d = a3Var.f31616h;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        ArrayList<Object> arrayList = this.f31864c.f31912a;
        return arrayList != null && this.f31866e < arrayList.size();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        ArrayList<Object> arrayList = this.f31864c.f31912a;
        if (arrayList != null) {
            int i10 = this.f31866e;
            this.f31866e = i10 + 1;
            obj = arrayList.get(i10);
        } else {
            obj = null;
        }
        boolean z10 = obj instanceof b;
        a3 a3Var = this.f31862a;
        if (z10) {
            return new b3(a3Var, ((b) obj).f31620a, this.f31865d);
        }
        if (!(obj instanceof s0)) {
            q.d("Unexpected group information structure");
            throw new pg.g();
        }
        t2 t2Var = new t2();
        return new q3(a3Var, this.f31863b, (s0) obj, t2Var);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
