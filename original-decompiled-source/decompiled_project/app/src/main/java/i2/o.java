package i2;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f13967a = new a();

    public static final class a implements Comparator<e0> {
        @Override // java.util.Comparator
        public final int compare(e0 e0Var, e0 e0Var2) {
            e0 e0Var3 = e0Var;
            e0 e0Var4 = e0Var2;
            int iF = kotlin.jvm.internal.r.f(e0Var3.f13824r, e0Var4.f13824r);
            return iF != 0 ? iF : kotlin.jvm.internal.r.f(e0Var3.hashCode(), e0Var4.hashCode());
        }
    }
}
