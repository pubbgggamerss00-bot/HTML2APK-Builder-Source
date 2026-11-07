package vg;

import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.i0;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public abstract class h extends g implements n<Object> {
    private final int arity;

    public h(int i10, tg.e<Object> eVar) {
        super(eVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.n
    public int getArity() {
        return this.arity;
    }

    @Override // vg.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        h0.f16332a.getClass();
        String strA = i0.a(this);
        r.d(strA, "renderLambdaToString(...)");
        return strA;
    }

    public h(int i10) {
        this(i10, null);
    }
}
