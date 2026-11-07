package kotlin.jvm.internal;

import b6.l;
import y5.b0;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class m extends b implements p5.a, v5.f {
    public final boolean s;

    public m(b6.l lVar) {
        super(lVar, b0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", true);
        this.s = false;
    }

    @Override // p5.a
    public final Object a() {
        return ((l.b) this).b();
    }

    @Override // kotlin.jvm.internal.b
    public final v5.b compute() {
        return this.s ? this : super.compute();
    }

    @Override // kotlin.jvm.internal.b
    public final v5.b computeReflected() {
        q.f13553a.getClass();
        return this;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            return getOwner().equals(mVar.getOwner()) && getName().equals(mVar.getName()) && getSignature().equals(mVar.getSignature()) && j.a(getBoundReceiver(), mVar.getBoundReceiver());
        }
        if (obj instanceof v5.f) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b
    public final v5.b getReflected() {
        if (this.s) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (v5.f) super.getReflected();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    public final String toString() {
        v5.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
