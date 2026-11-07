package p5;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class y0<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final k f21315a = new k(false);

    /* renamed from: b, reason: collision with root package name */
    public static final j f21316b = new j(true);

    /* renamed from: c, reason: collision with root package name */
    public static final m f21317c = new m(false);

    /* renamed from: d, reason: collision with root package name */
    public static final l f21318d = new l(true);

    /* renamed from: e, reason: collision with root package name */
    public static final h f21319e = new h(false);

    /* renamed from: f, reason: collision with root package name */
    public static final g f21320f = new g(true);

    /* renamed from: g, reason: collision with root package name */
    public static final p5.e f21321g = new p5.e(false);

    /* renamed from: h, reason: collision with root package name */
    public static final p5.d f21322h = new p5.d(true);

    /* renamed from: i, reason: collision with root package name */
    public static final g1 f21323i = new g1(true);

    /* renamed from: j, reason: collision with root package name */
    public static final f1 f21324j = new f1(true);

    public static final class a<D extends Enum<?>> extends e<D> {

        /* renamed from: l, reason: collision with root package name */
        public final Class<D> f21325l;

        public a(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f21325l = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // p5.y0.e, p5.y0
        public final String b() {
            return this.f21325l.getName();
        }

        @Override // p5.y0.e
        /* renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D g(String str) {
            D d10;
            Class<D> cls = this.f21325l;
            D[] enumConstants = cls.getEnumConstants();
            kotlin.jvm.internal.r.d(enumConstants, "getEnumConstants(...)");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (mh.t.j(d10.name(), str, true)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder sbA = e.e.a("Enum value ", str, " not found for type ");
            sbA.append(cls.getName());
            sbA.append('.');
            throw new IllegalArgumentException(sbA.toString());
        }
    }

    public static final class b<D extends Parcelable> extends y0<D[]> {

        /* renamed from: k, reason: collision with root package name */
        public final Class<D[]> f21326k;

        public b(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f21326k = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // p5.y0
        public final Object a(Bundle bundle, String str) {
            kotlin.jvm.internal.r.e(bundle, "bundle");
            return (Parcelable[]) bundle.get(str);
        }

        @Override // p5.y0
        public final String b() {
            return this.f21326k.getName();
        }

        @Override // p5.y0
        /* renamed from: d */
        public final Object g(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p5.y0
        public final void e(Bundle bundle, String key, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            kotlin.jvm.internal.r.e(key, "key");
            this.f21326k.cast(parcelableArr);
            bundle.putParcelableArray(key, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.r.a(this.f21326k, ((b) obj).f21326k);
        }

        @Override // p5.y0
        public final boolean f(Object obj, Object obj2) {
            return qg.m.b((Parcelable[]) obj, (Parcelable[]) obj2);
        }

        public final int hashCode() {
            return this.f21326k.hashCode();
        }
    }

    public static final class c<D> extends y0<D> {

        /* renamed from: k, reason: collision with root package name */
        public final Class<D> f21327k;

        public c(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f21327k = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // p5.y0
        public final D a(Bundle bundle, String str) {
            kotlin.jvm.internal.r.e(bundle, "bundle");
            return (D) bundle.get(str);
        }

        @Override // p5.y0
        public final String b() {
            return this.f21327k.getName();
        }

        @Override // p5.y0
        /* renamed from: d */
        public final D g(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // p5.y0
        public final void e(Bundle bundle, String key, D d10) {
            kotlin.jvm.internal.r.e(key, "key");
            this.f21327k.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) d10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.r.a(this.f21327k, ((c) obj).f21327k);
        }

        public final int hashCode() {
            return this.f21327k.hashCode();
        }
    }

    public static final class d<D extends Serializable> extends y0<D[]> {

        /* renamed from: k, reason: collision with root package name */
        public final Class<D[]> f21328k;

        public d(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f21328k = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // p5.y0
        public final Object a(Bundle bundle, String str) {
            kotlin.jvm.internal.r.e(bundle, "bundle");
            return (Serializable[]) bundle.get(str);
        }

        @Override // p5.y0
        public final String b() {
            return this.f21328k.getName();
        }

        @Override // p5.y0
        /* renamed from: d */
        public final Object g(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // p5.y0
        public final void e(Bundle bundle, String key, Object obj) {
            ?? r42 = (Serializable[]) obj;
            kotlin.jvm.internal.r.e(key, "key");
            this.f21328k.cast(r42);
            bundle.putSerializable(key, r42);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !d.class.equals(obj.getClass())) {
                return false;
            }
            return kotlin.jvm.internal.r.a(this.f21328k, ((d) obj).f21328k);
        }

        @Override // p5.y0
        public final boolean f(Object obj, Object obj2) {
            return qg.m.b((Serializable[]) obj, (Serializable[]) obj2);
        }

        public final int hashCode() {
            return this.f21328k.hashCode();
        }
    }

    public y0(boolean z10) {
    }

    public abstract T a(Bundle bundle, String str);

    public abstract String b();

    public Object c(Object obj, String str) {
        return g(str);
    }

    /* renamed from: d */
    public abstract T g(String str);

    public abstract void e(Bundle bundle, String str, T t3);

    public boolean f(T t3, T t10) {
        return kotlin.jvm.internal.r.a(t3, t10);
    }

    public final String toString() {
        return b();
    }

    public static class e<D extends Serializable> extends y0<D> {

        /* renamed from: k, reason: collision with root package name */
        public final Class<D> f21329k;

        public e(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (!cls.isEnum()) {
                this.f21329k = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        @Override // p5.y0
        public final Object a(Bundle bundle, String str) {
            kotlin.jvm.internal.r.e(bundle, "bundle");
            return (Serializable) bundle.get(str);
        }

        @Override // p5.y0
        public String b() {
            return this.f21329k.getName();
        }

        @Override // p5.y0
        public final void e(Bundle bundle, String key, Object obj) {
            Serializable value = (Serializable) obj;
            kotlin.jvm.internal.r.e(key, "key");
            kotlin.jvm.internal.r.e(value, "value");
            this.f21329k.cast(value);
            bundle.putSerializable(key, value);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            return kotlin.jvm.internal.r.a(this.f21329k, ((e) obj).f21329k);
        }

        @Override // p5.y0
        public D g(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f21329k.hashCode();
        }

        public e(Class cls, int i10) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f21329k = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
