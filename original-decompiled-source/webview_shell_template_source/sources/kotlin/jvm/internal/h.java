package kotlin.jvm.internal;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public class h extends b implements g, v5.e {
    private final int arity;
    private final int flags;

    public h(int i6) {
        this(i6, b.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.b
    public v5.b computeReflected() {
        q.f13553a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            return getName().equals(hVar.getName()) && getSignature().equals(hVar.getSignature()) && this.flags == hVar.flags && this.arity == hVar.arity && j.a(getBoundReceiver(), hVar.getBoundReceiver()) && j.a(getOwner(), hVar.getOwner());
        }
        if (obj instanceof v5.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // v5.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // v5.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // v5.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // v5.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.b, v5.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        v5.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public h(int i6, Object obj) {
        this(i6, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.b
    public v5.e getReflected() {
        return (v5.e) super.getReflected();
    }

    public h(int i6, Object obj, Class cls, String str, String str2, int i7) {
        super(obj, cls, str, str2, (i7 & 1) == 1);
        this.arity = i6;
        this.flags = i7 >> 1;
    }
}
