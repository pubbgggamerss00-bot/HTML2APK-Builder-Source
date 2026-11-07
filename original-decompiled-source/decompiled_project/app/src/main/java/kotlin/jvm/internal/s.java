package kotlin.jvm.internal;

import java.io.Serializable;

/* loaded from: classes2.dex */
public abstract class s<R> implements n<R>, Serializable {
    private final int arity;

    public s(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        h0.f16332a.getClass();
        String strA = i0.a(this);
        r.d(strA, "renderLambdaToString(...)");
        return strA;
    }
}
