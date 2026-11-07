package x0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class b3 implements i1.a, Iterable<Object>, fh.a {

    /* renamed from: a, reason: collision with root package name */
    public final a3 f31623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f31624b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31625c;

    public b3(a3 a3Var, int i10, int i11) {
        this.f31623a = a3Var;
        this.f31624b = i10;
        this.f31625c = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        int i10;
        ArrayList<b> arrayList;
        int iE;
        a3 a3Var = this.f31623a;
        if (a3Var.f31616h != this.f31625c) {
            c3.f();
        }
        HashMap<b, s0> map = a3Var.f31618k;
        s0 s0Var = null;
        int i11 = this.f31624b;
        if (map != null) {
            if (a3Var.f31615g) {
                q.c("use active SlotWriter to crate an anchor for location instead");
            }
            b bVar = (i11 < 0 || i11 >= (i10 = a3Var.f31610b) || (iE = c3.e((arrayList = a3Var.f31617j), i11, i10)) < 0) ? null : arrayList.get(iE);
            if (bVar != null) {
                s0Var = map.get(bVar);
            }
        }
        return s0Var != null ? new p3(a3Var, i11, s0Var, new c()) : new r0(a3Var, i11 + 1, a3Var.f31609a[(i11 * 5) + 3] + i11);
    }
}
