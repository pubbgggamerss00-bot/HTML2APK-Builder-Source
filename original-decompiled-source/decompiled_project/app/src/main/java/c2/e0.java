package c2;

import androidx.datastore.preferences.protobuf.a1;
import java.util.ArrayList;
import r.e2;
import r.o2;
import r.z1;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f4618a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4619b;

    /* renamed from: c, reason: collision with root package name */
    public final long f4620c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4621d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f4622e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4623f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4624g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4625h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f4626i;

    /* renamed from: j, reason: collision with root package name */
    public final long f4627j;

    /* renamed from: k, reason: collision with root package name */
    public final long f4628k;

    public e0() {
        throw null;
    }

    public e0(long j10, long j11, long j12, long j13, boolean z10, float f10, int i10, boolean z11, ArrayList arrayList, long j14, long j15) {
        this.f4618a = j10;
        this.f4619b = j11;
        this.f4620c = j12;
        this.f4621d = j13;
        this.f4622e = z10;
        this.f4623f = f10;
        this.f4624g = i10;
        this.f4625h = z11;
        this.f4626i = arrayList;
        this.f4627j = j14;
        this.f4628k = j15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return b0.a0.b(this.f4618a, e0Var.f4618a) && this.f4619b == e0Var.f4619b && p1.c.b(this.f4620c, e0Var.f4620c) && p1.c.b(this.f4621d, e0Var.f4621d) && this.f4622e == e0Var.f4622e && Float.compare(this.f4623f, e0Var.f4623f) == 0 && this.f4624g == e0Var.f4624g && this.f4625h == e0Var.f4625h && kotlin.jvm.internal.r.a(this.f4626i, e0Var.f4626i) && p1.c.b(this.f4627j, e0Var.f4627j) && p1.c.b(this.f4628k, e0Var.f4628k);
    }

    public final int hashCode() {
        return Long.hashCode(this.f4628k) + e2.a((this.f4626i.hashCode() + o2.a(a1.a(this.f4624g, z1.a(this.f4623f, o2.a(e2.a(e2.a(e2.a(Long.hashCode(this.f4618a) * 31, 31, this.f4619b), 31, this.f4620c), 31, this.f4621d), 31, this.f4622e), 31), 31), 31, this.f4625h)) * 31, 31, this.f4627j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputEventData(id=");
        sb.append((Object) ("PointerId(value=" + this.f4618a + ')'));
        sb.append(", uptime=");
        sb.append(this.f4619b);
        sb.append(", positionOnScreen=");
        sb.append((Object) p1.c.i(this.f4620c));
        sb.append(", position=");
        sb.append((Object) p1.c.i(this.f4621d));
        sb.append(", down=");
        sb.append(this.f4622e);
        sb.append(", pressure=");
        sb.append(this.f4623f);
        sb.append(", type=");
        int i10 = this.f4624g;
        sb.append((Object) (i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb.append(", activeHover=");
        sb.append(this.f4625h);
        sb.append(", historical=");
        sb.append(this.f4626i);
        sb.append(", scrollDelta=");
        sb.append((Object) p1.c.i(this.f4627j));
        sb.append(", originalEventPosition=");
        sb.append((Object) p1.c.i(this.f4628k));
        sb.append(')');
        return sb.toString();
    }
}
