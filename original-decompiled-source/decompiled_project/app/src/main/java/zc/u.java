package zc;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f35037a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f35038b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f35039c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f35040d;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Class<Object> f35045a;

        /* renamed from: b, reason: collision with root package name */
        public final hd.a f35046b;

        public b(Class cls, hd.a aVar) {
            this.f35045a = cls;
            this.f35046b = aVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f35045a.equals(this.f35045a) && bVar.f35046b.equals(this.f35046b);
        }

        public final int hashCode() {
            return Objects.hash(this.f35045a, this.f35046b);
        }

        public final String toString() {
            return this.f35045a.getSimpleName() + ", object identifier: " + this.f35046b;
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f35047a;

        /* renamed from: b, reason: collision with root package name */
        public final Class<Object> f35048b;

        public c(Class cls, Class cls2) {
            this.f35047a = cls;
            this.f35048b = cls2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f35047a.equals(this.f35047a) && cVar.f35048b.equals(this.f35048b);
        }

        public final int hashCode() {
            return Objects.hash(this.f35047a, this.f35048b);
        }

        public final String toString() {
            return this.f35047a.getSimpleName() + " with serialization type: " + this.f35048b.getSimpleName();
        }
    }

    public u(a aVar) {
        this.f35037a = new HashMap(aVar.f35041a);
        this.f35038b = new HashMap(aVar.f35042b);
        this.f35039c = new HashMap(aVar.f35043c);
        this.f35040d = new HashMap(aVar.f35044d);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f35041a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f35042b;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f35043c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f35044d;

        public a() {
            this.f35041a = new HashMap();
            this.f35042b = new HashMap();
            this.f35043c = new HashMap();
            this.f35044d = new HashMap();
        }

        public final void a(zc.b bVar) throws GeneralSecurityException {
            b bVar2 = new b(bVar.f35000b, bVar.f34999a);
            HashMap map = this.f35042b;
            if (!map.containsKey(bVar2)) {
                map.put(bVar2, bVar);
                return;
            }
            zc.b bVar3 = (zc.b) map.get(bVar2);
            if (bVar3.equals(bVar) && bVar.equals(bVar3)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + bVar2);
        }

        public final void b(d dVar) throws GeneralSecurityException {
            c cVar = new c(dVar.f35001a, dVar.f35002b);
            HashMap map = this.f35041a;
            if (!map.containsKey(cVar)) {
                map.put(cVar, dVar);
                return;
            }
            d dVar2 = (d) map.get(cVar);
            if (dVar2.equals(dVar) && dVar.equals(dVar2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + cVar);
        }

        public final void c(l lVar) throws GeneralSecurityException {
            b bVar = new b(lVar.f35018b, lVar.f35017a);
            HashMap map = this.f35044d;
            if (!map.containsKey(bVar)) {
                map.put(bVar, lVar);
                return;
            }
            l lVar2 = (l) map.get(bVar);
            if (lVar2.equals(lVar) && lVar.equals(lVar2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal parser for already existing object of type: " + bVar);
        }

        public final void d(n nVar) throws GeneralSecurityException {
            c cVar = new c(nVar.f35019a, nVar.f35020b);
            HashMap map = this.f35043c;
            if (!map.containsKey(cVar)) {
                map.put(cVar, nVar);
                return;
            }
            n nVar2 = (n) map.get(cVar);
            if (nVar2.equals(nVar) && nVar.equals(nVar2)) {
                return;
            }
            throw new GeneralSecurityException("Attempt to register non-equal serializer for already existing object of type: " + cVar);
        }

        public a(u uVar) {
            this.f35041a = new HashMap(uVar.f35037a);
            this.f35042b = new HashMap(uVar.f35038b);
            this.f35043c = new HashMap(uVar.f35039c);
            this.f35044d = new HashMap(uVar.f35040d);
        }
    }
}
