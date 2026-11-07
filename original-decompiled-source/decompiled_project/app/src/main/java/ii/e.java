package ii;

import h1.y;
import hi.l0;
import hi.p;
import java.io.IOException;
import kotlin.jvm.internal.r;

/* loaded from: classes2.dex */
public final class e extends p {

    /* renamed from: b, reason: collision with root package name */
    public final long f14544b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f14545c;

    /* renamed from: d, reason: collision with root package name */
    public long f14546d;

    public e(l0 l0Var, long j10, boolean z10) {
        super(l0Var);
        this.f14544b = j10;
        this.f14545c = z10;
    }

    @Override // hi.p, hi.l0
    public final long y(long j10, hi.g sink) throws IOException {
        r.e(sink, "sink");
        long j11 = this.f14546d;
        long j12 = this.f14544b;
        if (j11 > j12) {
            j10 = 0;
        } else if (this.f14545c) {
            long j13 = j12 - j11;
            if (j13 == 0) {
                return -1L;
            }
            j10 = Math.min(j10, j13);
        }
        long jY = super.y(j10, sink);
        if (jY != -1) {
            this.f14546d += jY;
        }
        long j14 = this.f14546d;
        if ((j14 >= j12 || jY != -1) && j14 <= j12) {
            return jY;
        }
        if (jY > 0 && j14 > j12) {
            long j15 = sink.f13061b - (j14 - j12);
            hi.g gVar = new hi.g();
            gVar.l0(sink);
            sink.j(j15, gVar);
            gVar.skip(gVar.f13061b);
        }
        StringBuilder sbA = y.a("expected ", " bytes but got ", j12);
        sbA.append(this.f14546d);
        throw new IOException(sbA.toString());
    }
}
