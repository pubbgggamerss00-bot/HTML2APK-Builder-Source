package h7;

/* loaded from: classes.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f12278a = new a();

    public static final class a implements c {
        @Override // h7.c
        public final boolean equals(Object obj, Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj instanceof w7.f) || !(obj2 instanceof w7.f)) {
                return kotlin.jvm.internal.r.a(obj, obj2);
            }
            w7.f fVar = (w7.f) obj;
            w7.f fVar2 = (w7.f) obj2;
            return kotlin.jvm.internal.r.a(fVar.f31328a, fVar2.f31328a) && kotlin.jvm.internal.r.a(fVar.f31329b, fVar2.f31329b) && kotlin.jvm.internal.r.a(fVar.f31331d, fVar2.f31331d) && kotlin.jvm.internal.r.a(fVar.f31342o, fVar2.f31342o) && fVar.f31343p == fVar2.f31343p && fVar.f31344q == fVar2.f31344q;
        }

        @Override // h7.c
        public final int hashCode(Object obj) {
            if (!(obj instanceof w7.f)) {
                if (obj != null) {
                    return obj.hashCode();
                }
                return 0;
            }
            w7.f fVar = (w7.f) obj;
            return fVar.f31344q.hashCode() + ((fVar.f31343p.hashCode() + ((fVar.f31342o.hashCode() + ((fVar.f31331d.hashCode() + ((fVar.f31329b.hashCode() + (fVar.f31328a.hashCode() * 31)) * 961)) * 961)) * 31)) * 31);
        }

        public final String toString() {
            return "AsyncImageModelEqualityDelegate.Default";
        }
    }

    boolean equals(Object obj, Object obj2);

    int hashCode(Object obj);
}
