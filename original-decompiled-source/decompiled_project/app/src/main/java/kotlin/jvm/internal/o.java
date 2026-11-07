package kotlin.jvm.internal;

/* loaded from: classes2.dex */
public class o extends e implements n, kh.e {
    private final int arity;
    private final int flags;

    public o(int i10) {
        this(i10, e.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.e
    public kh.b computeReflected() {
        h0.f16332a.getClass();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return getName().equals(oVar.getName()) && getSignature().equals(oVar.getSignature()) && this.flags == oVar.flags && this.arity == oVar.arity && r.a(getBoundReceiver(), oVar.getBoundReceiver()) && r.a(getOwner(), oVar.getOwner());
        }
        if (obj instanceof kh.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // kh.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kh.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kh.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kh.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.e, kh.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        kh.b bVarCompute = compute();
        if (bVarCompute != this) {
            return bVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public o(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.e
    public kh.e getReflected() {
        return (kh.e) super.getReflected();
    }

    public o(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = i11 >> 1;
    }
}
