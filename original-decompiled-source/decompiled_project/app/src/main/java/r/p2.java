package r;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final y1 f22902a;

    /* renamed from: b, reason: collision with root package name */
    public final l2 f22903b;

    /* renamed from: c, reason: collision with root package name */
    public final j0 f22904c;

    /* renamed from: d, reason: collision with root package name */
    public final f2 f22905d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f22906e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<Object, Object> f22907f;

    public p2(y1 y1Var, l2 l2Var, j0 j0Var, f2 f2Var, boolean z10, Map<Object, Object> map) {
        this.f22902a = y1Var;
        this.f22903b = l2Var;
        this.f22904c = j0Var;
        this.f22905d = f2Var;
        this.f22906e = z10;
        this.f22907f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return kotlin.jvm.internal.r.a(this.f22902a, p2Var.f22902a) && kotlin.jvm.internal.r.a(this.f22903b, p2Var.f22903b) && kotlin.jvm.internal.r.a(this.f22904c, p2Var.f22904c) && kotlin.jvm.internal.r.a(this.f22905d, p2Var.f22905d) && this.f22906e == p2Var.f22906e && kotlin.jvm.internal.r.a(this.f22907f, p2Var.f22907f);
    }

    public final int hashCode() {
        y1 y1Var = this.f22902a;
        int iHashCode = (y1Var == null ? 0 : y1Var.hashCode()) * 31;
        l2 l2Var = this.f22903b;
        int iHashCode2 = (iHashCode + (l2Var == null ? 0 : l2Var.hashCode())) * 31;
        j0 j0Var = this.f22904c;
        int iHashCode3 = (iHashCode2 + (j0Var == null ? 0 : j0Var.hashCode())) * 31;
        f2 f2Var = this.f22905d;
        return this.f22907f.hashCode() + o2.a((iHashCode3 + (f2Var != null ? f2Var.hashCode() : 0)) * 31, 31, this.f22906e);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f22902a + ", slide=" + this.f22903b + ", changeSize=" + this.f22904c + ", scale=" + this.f22905d + ", hold=" + this.f22906e + ", effectsMap=" + this.f22907f + ')';
    }

    public /* synthetic */ p2(y1 y1Var, l2 l2Var, j0 j0Var, f2 f2Var, LinkedHashMap linkedHashMap, int i10) {
        this((i10 & 1) != 0 ? null : y1Var, (i10 & 2) != 0 ? null : l2Var, (i10 & 4) != 0 ? null : j0Var, (i10 & 8) != 0 ? null : f2Var, (i10 & 16) == 0, (Map<Object, Object>) ((i10 & 32) != 0 ? qg.a0.f22708a : linkedHashMap));
    }
}
