package hi;

/* loaded from: classes2.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f13063a;

    /* renamed from: b, reason: collision with root package name */
    public int f13064b;

    /* renamed from: c, reason: collision with root package name */
    public int f13065c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13066d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f13067e;

    /* renamed from: f, reason: collision with root package name */
    public g0 f13068f;

    /* renamed from: g, reason: collision with root package name */
    public g0 f13069g;

    public g0() {
        this.f13063a = new byte[8192];
        this.f13067e = true;
        this.f13066d = false;
    }

    public final g0 a() {
        g0 g0Var = this.f13068f;
        if (g0Var == this) {
            g0Var = null;
        }
        g0 g0Var2 = this.f13069g;
        kotlin.jvm.internal.r.b(g0Var2);
        g0Var2.f13068f = this.f13068f;
        g0 g0Var3 = this.f13068f;
        kotlin.jvm.internal.r.b(g0Var3);
        g0Var3.f13069g = this.f13069g;
        this.f13068f = null;
        this.f13069g = null;
        return g0Var;
    }

    public final void b(g0 segment) {
        kotlin.jvm.internal.r.e(segment, "segment");
        segment.f13069g = this;
        segment.f13068f = this.f13068f;
        g0 g0Var = this.f13068f;
        kotlin.jvm.internal.r.b(g0Var);
        g0Var.f13069g = segment;
        this.f13068f = segment;
    }

    public final g0 c() {
        this.f13066d = true;
        return new g0(this.f13063a, this.f13064b, this.f13065c, true, false);
    }

    public final void d(g0 sink, int i10) {
        kotlin.jvm.internal.r.e(sink, "sink");
        byte[] bArr = sink.f13063a;
        if (!sink.f13067e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f13065c;
        int i12 = i11 + i10;
        if (i12 > 8192) {
            if (sink.f13066d) {
                throw new IllegalArgumentException();
            }
            int i13 = sink.f13064b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            qg.m.c(0, bArr, i13, bArr, i11);
            sink.f13065c -= sink.f13064b;
            sink.f13064b = 0;
        }
        int i14 = sink.f13065c;
        int i15 = this.f13064b;
        qg.m.c(i14, this.f13063a, i15, bArr, i15 + i10);
        sink.f13065c += i10;
        this.f13064b += i10;
    }

    public g0(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        kotlin.jvm.internal.r.e(data, "data");
        this.f13063a = data;
        this.f13064b = i10;
        this.f13065c = i11;
        this.f13066d = z10;
        this.f13067e = z11;
    }
}
