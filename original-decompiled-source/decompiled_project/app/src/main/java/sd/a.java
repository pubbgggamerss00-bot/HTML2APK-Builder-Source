package sd;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f24836a;

    /* renamed from: b, reason: collision with root package name */
    public final Set<y<? super T>> f24837b;

    /* renamed from: c, reason: collision with root package name */
    public final Set<l> f24838c;

    /* renamed from: d, reason: collision with root package name */
    public final int f24839d;

    /* renamed from: e, reason: collision with root package name */
    public final int f24840e;

    /* renamed from: f, reason: collision with root package name */
    public final d<T> f24841f;

    /* renamed from: g, reason: collision with root package name */
    public final Set<Class<?>> f24842g;

    public a(String str, Set<y<? super T>> set, Set<l> set2, int i10, int i11, d<T> dVar, Set<Class<?>> set3) {
        this.f24836a = str;
        this.f24837b = Collections.unmodifiableSet(set);
        this.f24838c = Collections.unmodifiableSet(set2);
        this.f24839d = i10;
        this.f24840e = i11;
        this.f24841f = dVar;
        this.f24842g = Collections.unmodifiableSet(set3);
    }

    public static <T> C0274a<T> a(Class<T> cls) {
        return new C0274a<>(cls, new Class[0]);
    }

    public static <T> C0274a<T> b(y<T> yVar) {
        return new C0274a<>(yVar, new y[0]);
    }

    @SafeVarargs
    public static <T> a<T> c(T t3, Class<T> cls, Class<? super T>... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(y.a(cls));
        for (Class<? super T> cls2 : clsArr) {
            x.a(cls2, "Null interface");
            hashSet.add(y.a(cls2));
        }
        return new a<>(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new androidx.credentials.playservices.controllers.identitycredentials.createdigitalcredential.h(t3), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f24837b.toArray()) + ">{" + this.f24839d + ", type=" + this.f24840e + ", deps=" + Arrays.toString(this.f24838c.toArray()) + "}";
    }

    /* renamed from: sd.a$a, reason: collision with other inner class name */
    public static class C0274a<T> {

        /* renamed from: a, reason: collision with root package name */
        public String f24843a = null;

        /* renamed from: b, reason: collision with root package name */
        public final HashSet f24844b;

        /* renamed from: c, reason: collision with root package name */
        public final HashSet f24845c;

        /* renamed from: d, reason: collision with root package name */
        public int f24846d;

        /* renamed from: e, reason: collision with root package name */
        public int f24847e;

        /* renamed from: f, reason: collision with root package name */
        public d<T> f24848f;

        /* renamed from: g, reason: collision with root package name */
        public final HashSet f24849g;

        public C0274a(Class cls, Class[] clsArr) {
            HashSet hashSet = new HashSet();
            this.f24844b = hashSet;
            this.f24845c = new HashSet();
            this.f24846d = 0;
            this.f24847e = 0;
            this.f24849g = new HashSet();
            hashSet.add(y.a(cls));
            for (Class cls2 : clsArr) {
                x.a(cls2, "Null interface");
                this.f24844b.add(y.a(cls2));
            }
        }

        public final void a(l lVar) {
            if (this.f24844b.contains(lVar.f24871a)) {
                throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
            }
            this.f24845c.add(lVar);
        }

        public final a<T> b() {
            if (this.f24848f != null) {
                return new a<>(this.f24843a, new HashSet(this.f24844b), new HashSet(this.f24845c), this.f24846d, this.f24847e, this.f24848f, this.f24849g);
            }
            throw new IllegalStateException("Missing required property: factory.");
        }

        public C0274a(y yVar, y[] yVarArr) {
            HashSet hashSet = new HashSet();
            this.f24844b = hashSet;
            this.f24845c = new HashSet();
            this.f24846d = 0;
            this.f24847e = 0;
            this.f24849g = new HashSet();
            hashSet.add(yVar);
            for (y yVar2 : yVarArr) {
                x.a(yVar2, "Null interface");
            }
            Collections.addAll(this.f24844b, yVarArr);
        }
    }
}
