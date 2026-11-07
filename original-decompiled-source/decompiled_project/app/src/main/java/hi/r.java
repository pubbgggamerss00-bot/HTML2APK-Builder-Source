package hi;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.bouncycastle.crypto.hpke.HPKE;

/* loaded from: classes2.dex */
public final class r implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public byte f13107a;

    /* renamed from: b, reason: collision with root package name */
    public final f0 f13108b;

    /* renamed from: c, reason: collision with root package name */
    public final Inflater f13109c;

    /* renamed from: d, reason: collision with root package name */
    public final s f13110d;

    /* renamed from: e, reason: collision with root package name */
    public final CRC32 f13111e;

    public r(l0 source) {
        kotlin.jvm.internal.r.e(source, "source");
        f0 f0Var = new f0(source);
        this.f13108b = f0Var;
        Inflater inflater = new Inflater(true);
        this.f13109c = inflater;
        this.f13110d = new s(f0Var, inflater);
        this.f13111e = new CRC32();
    }

    public static void h(int i10, int i11, String str) throws IOException {
        if (i11 == i10) {
            return;
        }
        StringBuilder sbA = v5.b.a(str, ": actual 0x");
        sbA.append(mh.x.G(8, b.d(i11)));
        sbA.append(" != expected 0x");
        sbA.append(mh.x.G(8, b.d(i10)));
        throw new IOException(sbA.toString());
    }

    @Override // hi.l0
    public final m0 b() {
        return this.f13108b.f13057a.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f13110d.close();
    }

    public final void l(g gVar, long j10, long j11) {
        g0 g0Var = gVar.f13060a;
        kotlin.jvm.internal.r.b(g0Var);
        while (true) {
            int i10 = g0Var.f13065c;
            int i11 = g0Var.f13064b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= i10 - i11;
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
        }
        while (j11 > 0) {
            int iMin = (int) Math.min(g0Var.f13065c - r6, j11);
            this.f13111e.update(g0Var.f13063a, (int) (g0Var.f13064b + j10), iMin);
            j11 -= iMin;
            g0Var = g0Var.f13068f;
            kotlin.jvm.internal.r.b(g0Var);
            j10 = 0;
        }
    }

    @Override // hi.l0
    public final long y(long j10, g sink) throws DataFormatException, IOException {
        r rVar = this;
        kotlin.jvm.internal.r.e(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(m0.r.a("byteCount < 0: ", j10).toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        byte b10 = rVar.f13107a;
        CRC32 crc32 = rVar.f13111e;
        f0 f0Var = rVar.f13108b;
        if (b10 == 0) {
            f0Var.u0(10L);
            g gVar = f0Var.f13058b;
            byte bZ = gVar.z(3L);
            boolean z10 = ((bZ >> 1) & 1) == 1;
            if (z10) {
                rVar.l(f0Var.f13058b, 0L, 10L);
            }
            h(8075, f0Var.readShort(), "ID1ID2");
            f0Var.skip(8L);
            if (((bZ >> 2) & 1) == 1) {
                f0Var.u0(2L);
                if (z10) {
                    l(f0Var.f13058b, 0L, 2L);
                }
                long jZ = gVar.Z() & HPKE.aead_EXPORT_ONLY;
                f0Var.u0(jZ);
                if (z10) {
                    l(f0Var.f13058b, 0L, jZ);
                }
                f0Var.skip(jZ);
            }
            if (((bZ >> 3) & 1) == 1) {
                long jL = f0Var.l((byte) 0, 0L, Long.MAX_VALUE);
                if (jL == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    l(f0Var.f13058b, 0L, jL + 1);
                }
                f0Var.skip(jL + 1);
            }
            if (((bZ >> 4) & 1) == 1) {
                long jL2 = f0Var.l((byte) 0, 0L, Long.MAX_VALUE);
                if (jL2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    rVar = this;
                    rVar.l(f0Var.f13058b, 0L, jL2 + 1);
                } else {
                    rVar = this;
                }
                f0Var.skip(jL2 + 1);
            } else {
                rVar = this;
            }
            if (z10) {
                h(f0Var.E(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            rVar.f13107a = (byte) 1;
        }
        if (rVar.f13107a == 1) {
            long j11 = sink.f13061b;
            long jY = rVar.f13110d.y(j10, sink);
            if (jY != -1) {
                rVar.l(sink, j11, jY);
                return jY;
            }
            rVar.f13107a = (byte) 2;
        }
        if (rVar.f13107a == 2) {
            h(f0Var.p(), (int) crc32.getValue(), "CRC");
            h(f0Var.p(), (int) rVar.f13109c.getBytesWritten(), "ISIZE");
            rVar.f13107a = (byte) 3;
            if (!f0Var.h()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}
