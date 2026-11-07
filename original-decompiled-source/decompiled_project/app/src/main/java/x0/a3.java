package x0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a3 implements i1.a, Iterable<Object>, fh.a {

    /* renamed from: b, reason: collision with root package name */
    public int f31610b;

    /* renamed from: d, reason: collision with root package name */
    public int f31612d;

    /* renamed from: e, reason: collision with root package name */
    public int f31613e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31615g;

    /* renamed from: h, reason: collision with root package name */
    public int f31616h;

    /* renamed from: k, reason: collision with root package name */
    public HashMap<b, s0> f31618k;

    /* renamed from: l, reason: collision with root package name */
    public p.y<p.z> f31619l;

    /* renamed from: a, reason: collision with root package name */
    public int[] f31609a = new int[0];

    /* renamed from: c, reason: collision with root package name */
    public Object[] f31611c = new Object[0];

    /* renamed from: f, reason: collision with root package name */
    public final Object f31614f = new Object();

    /* renamed from: j, reason: collision with root package name */
    public ArrayList<b> f31617j = new ArrayList<>();

    public final int c(b bVar) {
        if (this.f31615g) {
            q.c("Use active SlotWriter to determine anchor location instead");
        }
        if (!bVar.a()) {
            b2.a("Anchor refers to a group that was removed");
        }
        return bVar.f31620a;
    }

    public final void e() {
        this.f31618k = new HashMap<>();
    }

    public final z2 f() {
        if (this.f31615g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.f31613e++;
        return new z2(this);
    }

    public final d3 g() {
        if (this.f31615g) {
            q.c("Cannot start a writer when another writer is pending");
        }
        if (this.f31613e > 0) {
            q.c("Cannot start a writer when a reader is pending");
        }
        this.f31615g = true;
        this.f31616h++;
        return new d3(this);
    }

    public final boolean i(b bVar) {
        int iE;
        return bVar.a() && (iE = c3.e(this.f31617j, bVar.f31620a, this.f31610b)) >= 0 && kotlin.jvm.internal.r.a(this.f31617j.get(iE), bVar);
    }

    @Override // java.lang.Iterable
    public final Iterator<Object> iterator() {
        return new r0(this, 0, this.f31610b);
    }
}
