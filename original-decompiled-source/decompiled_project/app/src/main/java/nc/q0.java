package nc;

import java.io.Serializable;
import java.lang.Comparable;
import nc.j;

/* loaded from: classes2.dex */
public final class q0<C extends Comparable> extends r0 implements lc.l<C> {

    /* renamed from: c, reason: collision with root package name */
    public static final q0<Comparable> f18730c = new q0<>(j.c.f18694b, j.a.f18693b);

    /* renamed from: a, reason: collision with root package name */
    public final j<C> f18731a;

    /* renamed from: b, reason: collision with root package name */
    public final j<C> f18732b;

    public static class a implements lc.e<q0, j> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f18733a = new a();

        @Override // lc.e
        public final j apply(q0 q0Var) {
            return q0Var.f18731a;
        }
    }

    public static class b extends o0<q0<?>> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final b f18734a = new b();

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            q0 q0Var = (q0) obj;
            q0 q0Var2 = (q0) obj2;
            return i.f18686a.a(q0Var.f18731a, q0Var2.f18731a).a(q0Var.f18732b, q0Var2.f18732b).b();
        }
    }

    public q0(j<C> jVar, j<C> jVar2) {
        jVar.getClass();
        this.f18731a = jVar;
        jVar2.getClass();
        this.f18732b = jVar2;
        if (jVar.compareTo(jVar2) > 0 || jVar == j.a.f18693b || jVar2 == j.c.f18694b) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            jVar.b(sb2);
            sb2.append("..");
            jVar2.c(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static q0 a() {
        return new q0(new j.b(0), new j.b(0));
    }

    @Override // lc.l
    @Deprecated
    public final boolean apply(Object obj) {
        Comparable comparable = (Comparable) obj;
        comparable.getClass();
        return this.f18731a.d(comparable) && !this.f18732b.d(comparable);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0) {
            q0 q0Var = (q0) obj;
            if (this.f18731a.equals(q0Var.f18731a) && this.f18732b.equals(q0Var.f18732b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f18732b.hashCode() + (this.f18731a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.f18731a.b(sb);
        sb.append("..");
        this.f18732b.c(sb);
        return sb.toString();
    }
}
