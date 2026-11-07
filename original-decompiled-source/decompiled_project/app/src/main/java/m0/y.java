package m0;

import m0.z;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final long f17574a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17575b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17576c;

    /* renamed from: d, reason: collision with root package name */
    public final int f17577d;

    /* renamed from: e, reason: collision with root package name */
    public final int f17578e;

    /* renamed from: f, reason: collision with root package name */
    public final t2.h0 f17579f;

    public y(long j10, int i10, int i11, int i12, int i13, t2.h0 h0Var) {
        this.f17574a = j10;
        this.f17575b = i10;
        this.f17576c = i11;
        this.f17577d = i12;
        this.f17578e = i13;
        this.f17579f = h0Var;
    }

    public final z.a a(int i10) {
        return new z.a(l1.a(this.f17579f, i10), i10, this.f17574a);
    }

    public final n b() {
        int i10 = this.f17576c;
        int i11 = this.f17577d;
        return i10 < i11 ? n.f17424b : i10 > i11 ? n.f17423a : n.f17425c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionInfo(id=");
        sb.append(this.f17574a);
        sb.append(", range=(");
        int i10 = this.f17576c;
        sb.append(i10);
        sb.append('-');
        t2.h0 h0Var = this.f17579f;
        sb.append(l1.a(h0Var, i10));
        sb.append(',');
        int i11 = this.f17577d;
        sb.append(i11);
        sb.append('-');
        sb.append(l1.a(h0Var, i11));
        sb.append("), prevOffset=");
        return b.b.a(sb, this.f17578e, ')');
    }
}
