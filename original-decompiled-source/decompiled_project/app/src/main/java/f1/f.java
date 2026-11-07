package f1;

import a1.d;
import c1.t;
import d0.z1;
import x0.a0;
import x0.a2;
import x0.e2;
import x0.v3;

/* loaded from: classes.dex */
public final class f extends c1.d<e2, v3<Object>> implements a2 {

    /* renamed from: d, reason: collision with root package name */
    public static final f f8790d = new f(t.f4579e, 0);

    public static final class a extends c1.f<e2, v3<Object>> {

        /* renamed from: g, reason: collision with root package name */
        public f f8791g;

        @Override // c1.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof e2) {
                return super.containsKey((e2) obj);
            }
            return false;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public final /* bridge */ boolean containsValue(Object obj) {
            if (obj instanceof v3) {
                return super.containsValue((v3) obj);
            }
            return false;
        }

        @Override // c1.f
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public final f build() {
            Object obj = this.f4564c;
            f fVar = this.f8791g;
            if (obj != fVar.f4557a) {
                this.f4563b = new z1();
                fVar = new f(this.f4564c, this.f4567f);
            }
            this.f8791g = fVar;
            return fVar;
        }

        @Override // c1.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof e2) {
                return (v3) super.get((e2) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof e2) ? obj2 : (v3) super.getOrDefault((e2) obj, (v3) obj2);
        }

        @Override // c1.f, java.util.AbstractMap, java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof e2) {
                return (v3) super.remove((e2) obj);
            }
            return null;
        }
    }

    @Override // c1.d, a1.d
    public final d.a<e2, v3<Object>> builder() {
        a aVar = new a(this);
        aVar.f8791g = this;
        return aVar;
    }

    @Override // x0.z
    public final <T> T c(e2 e2Var) {
        return (T) a0.a(this, e2Var);
    }

    @Override // c1.d, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof e2) {
            return super.containsKey((e2) obj);
        }
        return false;
    }

    @Override // qg.e, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof v3) {
            return super.containsValue((v3) obj);
        }
        return false;
    }

    @Override // x0.a2
    public final f d(e2 e2Var, v3 v3Var) {
        t.a aVarU = this.f4557a.u(e2Var, e2Var.hashCode(), 0, v3Var);
        return aVarU == null ? this : new f(aVarU.f4584a, this.f4558b + aVarU.f4585b);
    }

    @Override // c1.d
    /* renamed from: e */
    public final c1.f<e2, v3<Object>> builder() {
        a aVar = new a(this);
        aVar.f8791g = this;
        return aVar;
    }

    @Override // c1.d, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof e2) {
            return (v3) super.get((e2) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof e2) ? obj2 : (v3) super.getOrDefault((e2) obj, (v3) obj2);
    }

    @Override // c1.d, a1.d
    /* renamed from: builder, reason: avoid collision after fix types in other method */
    public final d.a<e2, v3<Object>> builder2() {
        a aVar = new a(this);
        aVar.f8791g = this;
        return aVar;
    }
}
