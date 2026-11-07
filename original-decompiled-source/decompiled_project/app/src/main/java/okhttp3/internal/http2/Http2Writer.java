package okhttp3.internal.http2;

import hi.d0;
import hi.g;
import hi.h;
import j2.y;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import okhttp3.internal.http2.Hpack;
import qg.m;

/* loaded from: classes2.dex */
public final class Http2Writer implements Closeable {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f19720f;

    /* renamed from: a, reason: collision with root package name */
    public final h f19721a;

    /* renamed from: b, reason: collision with root package name */
    public final g f19722b;

    /* renamed from: c, reason: collision with root package name */
    public int f19723c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f19724d;

    /* renamed from: e, reason: collision with root package name */
    public final Hpack.Writer f19725e;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        private Companion() {
        }
    }

    static {
        new Companion(0);
        f19720f = Logger.getLogger(Http2.class.getName());
    }

    public Http2Writer(d0 sink) {
        r.e(sink, "sink");
        this.f19721a = sink;
        g gVar = new g();
        this.f19722b = gVar;
        this.f19723c = 16384;
        this.f19725e = new Hpack.Writer(gVar);
    }

    public final synchronized void E(boolean z10, int i10, ArrayList arrayList) throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        this.f19725e.d(arrayList);
        long j10 = this.f19722b.f13061b;
        long jMin = Math.min(this.f19723c, j10);
        int i11 = j10 == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        p(i10, (int) jMin, 1, i11);
        this.f19721a.j(jMin, this.f19722b);
        if (j10 > jMin) {
            long j11 = j10 - jMin;
            while (j11 > 0) {
                long jMin2 = Math.min(this.f19723c, j11);
                j11 -= jMin2;
                p(i10, (int) jMin2, 9, j11 == 0 ? 4 : 0);
                this.f19721a.j(jMin2, this.f19722b);
            }
        }
    }

    public final synchronized void M(int i10, int i11, boolean z10) throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        p(0, 8, 6, z10 ? 1 : 0);
        this.f19721a.writeInt(i10);
        this.f19721a.writeInt(i11);
        this.f19721a.flush();
    }

    public final synchronized void N(int i10, ErrorCode errorCode) throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        if (errorCode.f19581a == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p(i10, 4, 3, 0);
        this.f19721a.writeInt(errorCode.f19581a);
        this.f19721a.flush();
    }

    public final synchronized void Z(int i10, long j10) throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        p(i10, 4, 8, 0);
        this.f19721a.writeInt((int) j10);
        this.f19721a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.f19724d = true;
        this.f19721a.close();
    }

    public final synchronized void flush() throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        this.f19721a.flush();
    }

    public final synchronized void h(Settings peerSettings) throws IOException {
        try {
            r.e(peerSettings, "peerSettings");
            if (this.f19724d) {
                throw new IOException("closed");
            }
            int i10 = this.f19723c;
            int i11 = peerSettings.f19735a;
            if ((i11 & 32) != 0) {
                i10 = peerSettings.f19736b[5];
            }
            this.f19723c = i10;
            if (((i11 & 2) != 0 ? peerSettings.f19736b[1] : -1) != -1) {
                Hpack.Writer writer = this.f19725e;
                int i12 = (i11 & 2) != 0 ? peerSettings.f19736b[1] : -1;
                writer.getClass();
                int iMin = Math.min(i12, 16384);
                int i13 = writer.f19604d;
                if (i13 != iMin) {
                    if (iMin < i13) {
                        writer.f19602b = Math.min(writer.f19602b, iMin);
                    }
                    writer.f19603c = true;
                    writer.f19604d = iMin;
                    int i14 = writer.f19608h;
                    if (iMin < i14) {
                        if (iMin == 0) {
                            Header[] headerArr = writer.f19605e;
                            m.m(headerArr, 0, headerArr.length, null);
                            writer.f19606f = writer.f19605e.length - 1;
                            writer.f19607g = 0;
                            writer.f19608h = 0;
                        } else {
                            writer.a(i14 - iMin);
                        }
                    }
                }
            }
            p(0, 0, 4, 1);
            this.f19721a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void l(boolean z10, int i10, g gVar, int i11) throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        p(i10, i11, 0, z10 ? 1 : 0);
        if (i11 > 0) {
            h hVar = this.f19721a;
            r.b(gVar);
            hVar.j(i11, gVar);
        }
    }

    public final void p(int i10, int i11, int i12, int i13) throws IOException {
        Level level = Level.FINE;
        Logger logger = f19720f;
        if (logger.isLoggable(level)) {
            Http2.f19609a.getClass();
            logger.fine(Http2.a(false, i10, i11, i12, i13));
        }
        if (i11 > this.f19723c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f19723c + ": " + i11).toString());
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw new IllegalArgumentException(y.a(i10, "reserved bit set: ").toString());
        }
        byte[] bArr = Util.f19393a;
        h hVar = this.f19721a;
        r.e(hVar, "<this>");
        hVar.writeByte((i11 >>> 16) & 255);
        hVar.writeByte((i11 >>> 8) & 255);
        hVar.writeByte(i11 & 255);
        hVar.writeByte(i12 & 255);
        hVar.writeByte(i13 & 255);
        hVar.writeInt(i10 & Integer.MAX_VALUE);
    }

    public final synchronized void z(int i10, ErrorCode errorCode, byte[] bArr) throws IOException {
        if (this.f19724d) {
            throw new IOException("closed");
        }
        if (errorCode.f19581a == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        p(0, bArr.length + 8, 7, 0);
        this.f19721a.writeInt(i10);
        this.f19721a.writeInt(errorCode.f19581a);
        if (bArr.length != 0) {
            this.f19721a.write(bArr);
        }
        this.f19721a.flush();
    }
}
