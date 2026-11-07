package hi;

/* loaded from: classes2.dex */
public final class c0 implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final i f13043a;

    /* renamed from: b, reason: collision with root package name */
    public final g f13044b;

    /* renamed from: c, reason: collision with root package name */
    public g0 f13045c;

    /* renamed from: d, reason: collision with root package name */
    public int f13046d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f13047e;

    /* renamed from: f, reason: collision with root package name */
    public long f13048f;

    public c0(i iVar) {
        this.f13043a = iVar;
        g gVarW = iVar.w();
        this.f13044b = gVarW;
        g0 g0Var = gVarW.f13060a;
        this.f13045c = g0Var;
        this.f13046d = g0Var != null ? g0Var.f13064b : -1;
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13043a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f13047e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        if (r3 == r5.f13064b) goto L15;
     */
    @Override // hi.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long y(long j10, g sink) {
        g0 g0Var;
        kotlin.jvm.internal.r.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
        if (this.f13047e) {
            throw new IllegalStateException("closed");
        }
        g0 g0Var2 = this.f13045c;
        g gVar = this.f13044b;
        if (g0Var2 != null) {
            g0 g0Var3 = gVar.f13060a;
            if (g0Var2 == g0Var3) {
                int i10 = this.f13046d;
                kotlin.jvm.internal.r.b(g0Var3);
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.f13043a.Y(this.f13048f + 1)) {
            return -1L;
        }
        if (this.f13045c == null && (g0Var = gVar.f13060a) != null) {
            this.f13045c = g0Var;
            this.f13046d = g0Var.f13064b;
        }
        long jMin = Math.min(j10, gVar.f13061b - this.f13048f);
        this.f13044b.l(sink, this.f13048f, jMin);
        this.f13048f += jMin;
        return jMin;
    }
}
