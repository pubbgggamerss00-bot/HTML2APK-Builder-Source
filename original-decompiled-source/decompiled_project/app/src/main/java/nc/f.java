package nc;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import nc.l0;

/* loaded from: classes2.dex */
public final class f<F, T> extends o0<F> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final l0.a f18676a = l0.f18719a;

    /* renamed from: b, reason: collision with root package name */
    public final o0<T> f18677b;

    public f(o0 o0Var) {
        o0Var.getClass();
        this.f18677b = o0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(F f10, F f11) {
        this.f18676a.getClass();
        return this.f18677b.compare(((Map.Entry) f10).getKey(), ((Map.Entry) f11).getKey());
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f18676a.equals(fVar.f18676a) && this.f18677b.equals(fVar.f18677b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18676a, this.f18677b});
    }

    public final String toString() {
        return this.f18677b + ".onResultOf(" + this.f18676a + ")";
    }
}
