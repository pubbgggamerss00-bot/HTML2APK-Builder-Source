package n7;

import hi.g;
import hi.i;
import hi.j;
import hi.p;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class a extends p {

    /* renamed from: c, reason: collision with root package name */
    public static final j f18359c;

    /* renamed from: b, reason: collision with root package name */
    public final g f18360b;

    static {
        j jVar = j.f13075d;
        f18359c = j.a.a("0021F904");
    }

    public a(i iVar) {
        super(iVar);
        this.f18360b = new g();
    }

    public final boolean h(long j10) {
        g gVar = this.f18360b;
        long j11 = gVar.f13061b;
        if (j11 >= j10) {
            return true;
        }
        long j12 = j10 - j11;
        return super.y(j12, gVar) == j12;
    }

    @Override // hi.p, hi.l0
    public final long y(long j10, g gVar) throws EOFException {
        h(j10);
        g gVar2 = this.f18360b;
        if (gVar2.f13061b == 0) {
            return j10 == 0 ? 0L : -1L;
        }
        long j11 = 0;
        while (true) {
            long jE = -1;
            while (true) {
                j jVar = f18359c;
                jE = this.f18360b.E(jVar.f13076a[0], jE + 1, Long.MAX_VALUE);
                if (jE == -1 || (h(jVar.f13076a.length) && gVar2.A0(jE, jVar))) {
                    break;
                }
            }
            if (jE == -1) {
                break;
            }
            long jY = gVar2.y(jE + 4, gVar);
            if (jY < 0) {
                jY = 0;
            }
            j11 += jY;
            if (h(5L) && gVar2.z(4L) == 0) {
                if (((gVar2.z(1L) & 255) | ((gVar2.z(2L) & 255) << 8)) < 2) {
                    gVar.q0(gVar2.z(0L));
                    gVar.q0(10);
                    gVar.q0(0);
                    gVar2.skip(3L);
                }
            }
        }
        if (j11 < j10) {
            long jY2 = gVar2.y(j10 - j11, gVar);
            if (jY2 < 0) {
                jY2 = 0;
            }
            j11 += jY2;
        }
        if (j11 == 0) {
            return -1L;
        }
        return j11;
    }
}
