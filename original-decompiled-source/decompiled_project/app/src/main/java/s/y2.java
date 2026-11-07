package s;

import s.s;

/* loaded from: classes.dex */
public final class y2<V extends s> {

    /* renamed from: a, reason: collision with root package name */
    public final V f24043a;

    /* renamed from: b, reason: collision with root package name */
    public final b0 f24044b;

    public y2() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y2(s sVar, b0 b0Var) {
        this.f24043a = sVar;
        this.f24044b = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y2)) {
            return false;
        }
        y2 y2Var = (y2) obj;
        return kotlin.jvm.internal.r.a(this.f24043a, y2Var.f24043a) && kotlin.jvm.internal.r.a(this.f24044b, y2Var.f24044b);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + ((this.f24044b.hashCode() + (this.f24043a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.f24043a + ", easing=" + this.f24044b + ", arcMode=ArcMode(value=0))";
    }
}
