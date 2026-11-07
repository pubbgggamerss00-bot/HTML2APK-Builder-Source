package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class k<R> implements g<R>, Serializable {
    private final int arity;

    public k(int i6) {
        this.arity = i6;
    }

    @Override // kotlin.jvm.internal.g
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        q.f13553a.getClass();
        String strA = r.a(this);
        j.d("renderLambdaToString(...)", strA);
        return strA;
    }
}
