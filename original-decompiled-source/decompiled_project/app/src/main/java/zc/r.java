package zc;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35025a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35026b;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f35029a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<?> f35030b;

        public b(Class cls, Class cls2) {
            this.f35029a = cls;
            this.f35030b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f35029a.equals(this.f35029a) && bVar.f35030b.equals(this.f35030b);
        }

        public final int hashCode() {
            return Objects.hash(this.f35029a, this.f35030b);
        }

        public final String toString() {
            return this.f35029a.getSimpleName() + " with primitive type: " + this.f35030b.getSimpleName();
        }
    }

    public r(a aVar) {
        this.f35025a = new HashMap(aVar.f35027a);
        this.f35026b = new HashMap(aVar.f35028b);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f35027a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f35028b;

        public a() {
            this.f35027a = new HashMap();
            this.f35028b = new HashMap();
        }

        public final void a(o oVar) throws GeneralSecurityException {
            b bVar = new b(oVar.f35022a, oVar.f35023b);
            HashMap map = this.f35027a;
            if (!map.containsKey(bVar)) {
                map.put(bVar, oVar);
                return;
            }
            p pVar = (p) map.get(bVar);
            if (pVar.equals(oVar) && oVar.equals(pVar)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: " + bVar);
        }

        public final void b(sc.p pVar) throws GeneralSecurityException {
            if (pVar == null) {
                throw new NullPointerException("wrapper must be non-null");
            }
            Class clsC = pVar.c();
            HashMap map = this.f35028b;
            if (!map.containsKey(clsC)) {
                map.put(clsC, pVar);
                return;
            }
            sc.p pVar2 = (sc.p) map.get(clsC);
            if (pVar2.equals(pVar) && pVar.equals(pVar2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type" + clsC);
        }

        public a(r rVar) {
            this.f35027a = new HashMap(rVar.f35025a);
            this.f35028b = new HashMap(rVar.f35026b);
        }
    }
}
