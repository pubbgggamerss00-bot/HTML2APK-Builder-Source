package sd;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class z implements b {

    /* renamed from: a, reason: collision with root package name */
    public final Set<y<?>> f24889a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<y<?>> f24890b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<y<?>> f24891c;

    /* renamed from: d, reason: collision with root package name */
    public final Set<y<?>> f24892d;

    /* renamed from: e, reason: collision with root package name */
    public final Set<y<?>> f24893e;

    /* renamed from: f, reason: collision with root package name */
    public final Set<Class<?>> f24894f;

    /* renamed from: g, reason: collision with root package name */
    public final b f24895g;

    public static class a implements zd.c {

        /* renamed from: a, reason: collision with root package name */
        public final Set<Class<?>> f24896a;

        /* renamed from: b, reason: collision with root package name */
        public final zd.c f24897b;

        public a(Set<Class<?>> set, zd.c cVar) {
            this.f24896a = set;
            this.f24897b = cVar;
        }
    }

    public z(sd.a<?> aVar, b bVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        Set<l> set = aVar.f24838c;
        Set<Class<?>> set2 = aVar.f24842g;
        for (l lVar : set) {
            int i10 = lVar.f24873c;
            int i11 = lVar.f24872b;
            boolean z10 = i10 == 0;
            y<?> yVar = lVar.f24871a;
            if (z10) {
                if (i11 == 2) {
                    hashSet4.add(yVar);
                } else {
                    hashSet.add(yVar);
                }
            } else if (i10 == 2) {
                hashSet3.add(yVar);
            } else if (i11 == 2) {
                hashSet5.add(yVar);
            } else {
                hashSet2.add(yVar);
            }
        }
        if (!set2.isEmpty()) {
            hashSet.add(y.a(zd.c.class));
        }
        this.f24889a = Collections.unmodifiableSet(hashSet);
        this.f24890b = Collections.unmodifiableSet(hashSet2);
        this.f24891c = Collections.unmodifiableSet(hashSet3);
        this.f24892d = Collections.unmodifiableSet(hashSet4);
        this.f24893e = Collections.unmodifiableSet(hashSet5);
        this.f24894f = set2;
        this.f24895g = bVar;
    }

    @Override // sd.b
    public final <T> T a(Class<T> cls) {
        if (!this.f24889a.contains(y.a(cls))) {
            throw new n(ae.e.a(cls, "Attempting to request an undeclared dependency ", "."));
        }
        T t3 = (T) this.f24895g.a(cls);
        return !cls.equals(zd.c.class) ? t3 : (T) new a(this.f24894f, (zd.c) t3);
    }

    @Override // sd.b
    public final <T> Set<T> b(y<T> yVar) {
        if (this.f24892d.contains(yVar)) {
            return this.f24895g.b(yVar);
        }
        throw new n("Attempting to request an undeclared dependency Set<" + yVar + ">.");
    }

    @Override // sd.b
    public final <T> fe.a<T> c(y<T> yVar) {
        if (this.f24891c.contains(yVar)) {
            return this.f24895g.c(yVar);
        }
        throw new n("Attempting to request an undeclared dependency Deferred<" + yVar + ">.");
    }

    @Override // sd.b
    public final <T> fe.b<T> d(Class<T> cls) {
        return h(y.a(cls));
    }

    @Override // sd.b
    public final fe.a e() {
        return c(y.a(nd.b.class));
    }

    @Override // sd.b
    public final <T> fe.b<Set<T>> f(y<T> yVar) {
        if (this.f24893e.contains(yVar)) {
            return this.f24895g.f(yVar);
        }
        throw new n("Attempting to request an undeclared dependency Provider<Set<" + yVar + ">>.");
    }

    @Override // sd.b
    public final <T> T g(y<T> yVar) {
        if (this.f24889a.contains(yVar)) {
            return (T) this.f24895g.g(yVar);
        }
        throw new n("Attempting to request an undeclared dependency " + yVar + ".");
    }

    @Override // sd.b
    public final <T> fe.b<T> h(y<T> yVar) {
        if (this.f24890b.contains(yVar)) {
            return this.f24895g.h(yVar);
        }
        throw new n("Attempting to request an undeclared dependency Provider<" + yVar + ">.");
    }
}
