package w1;

import androidx.datastore.preferences.protobuf.a1;
import java.util.List;
import kotlin.jvm.internal.r;
import q1.u0;
import r.z1;

/* loaded from: classes.dex */
public final class q extends n {

    /* renamed from: a, reason: collision with root package name */
    public final String f31219a;

    /* renamed from: b, reason: collision with root package name */
    public final List<g> f31220b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31221c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f31222d;

    /* renamed from: e, reason: collision with root package name */
    public final float f31223e;

    /* renamed from: f, reason: collision with root package name */
    public final u0 f31224f;

    /* renamed from: g, reason: collision with root package name */
    public final float f31225g;

    /* renamed from: h, reason: collision with root package name */
    public final float f31226h;

    /* renamed from: j, reason: collision with root package name */
    public final int f31227j;

    /* renamed from: k, reason: collision with root package name */
    public final int f31228k;

    /* renamed from: l, reason: collision with root package name */
    public final float f31229l;

    /* renamed from: m, reason: collision with root package name */
    public final float f31230m;

    /* renamed from: n, reason: collision with root package name */
    public final float f31231n;

    /* renamed from: p, reason: collision with root package name */
    public final float f31232p;

    public q() {
        throw null;
    }

    public q(String str, List list, int i10, u0 u0Var, float f10, u0 u0Var2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
        this.f31219a = str;
        this.f31220b = list;
        this.f31221c = i10;
        this.f31222d = u0Var;
        this.f31223e = f10;
        this.f31224f = u0Var2;
        this.f31225g = f11;
        this.f31226h = f12;
        this.f31227j = i11;
        this.f31228k = i12;
        this.f31229l = f13;
        this.f31230m = f14;
        this.f31231n = f15;
        this.f31232p = f16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && q.class == obj.getClass()) {
            q qVar = (q) obj;
            return r.a(this.f31219a, qVar.f31219a) && r.a(this.f31222d, qVar.f31222d) && this.f31223e == qVar.f31223e && r.a(this.f31224f, qVar.f31224f) && this.f31225g == qVar.f31225g && this.f31226h == qVar.f31226h && this.f31227j == qVar.f31227j && this.f31228k == qVar.f31228k && this.f31229l == qVar.f31229l && this.f31230m == qVar.f31230m && this.f31231n == qVar.f31231n && this.f31232p == qVar.f31232p && this.f31221c == qVar.f31221c && r.a(this.f31220b, qVar.f31220b);
        }
        return false;
    }

    public final int hashCode() {
        int iA = a2.a.a(this.f31220b, this.f31219a.hashCode() * 31, 31);
        u0 u0Var = this.f31222d;
        int iA2 = z1.a(this.f31223e, (iA + (u0Var != null ? u0Var.hashCode() : 0)) * 31, 31);
        u0 u0Var2 = this.f31224f;
        return Integer.hashCode(this.f31221c) + z1.a(this.f31232p, z1.a(this.f31231n, z1.a(this.f31230m, z1.a(this.f31229l, a1.a(this.f31228k, a1.a(this.f31227j, z1.a(this.f31226h, z1.a(this.f31225g, (iA2 + (u0Var2 != null ? u0Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
