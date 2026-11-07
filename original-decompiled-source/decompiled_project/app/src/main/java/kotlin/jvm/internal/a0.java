package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public abstract class a0 extends e implements kh.i {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f16315a;

    public a0(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.f16315a = false;
    }

    @Override // kotlin.jvm.internal.e
    public final kh.b compute() {
        return this.f16315a ? this : super.compute();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return getOwner().equals(a0Var.getOwner()) && getName().equals(a0Var.getName()) && getSignature().equals(a0Var.getSignature()) && r.a(getBoundReceiver(), a0Var.getBoundReceiver());
        }
        if (obj instanceof kh.i) {
            return obj.equals(compute());
        }
        return false;
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.internal.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final kh.i getReflected() {
        if (this.f16315a) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (kh.i) super.getReflected();
    }

    public final String toString() {
        kh.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }
}
