package okhttp3.internal.http2;

import ad.b;
import b.o;
import e1.c;
import hi.f0;
import hi.g;
import hi.i;
import hi.l0;
import hi.m0;
import j2.y;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import jh.e;
import jh.j;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.r;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.http2.Hpack;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.PushObserver;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.crypto.hpke.HPKE;
import qg.m;
import qg.x;

/* loaded from: classes2.dex */
public final class Http2Reader implements Closeable {

    /* renamed from: d, reason: collision with root package name */
    public static final Companion f19684d = new Companion(0);

    /* renamed from: e, reason: collision with root package name */
    public static final Logger f19685e;

    /* renamed from: a, reason: collision with root package name */
    public final i f19686a;

    /* renamed from: b, reason: collision with root package name */
    public final ContinuationSource f19687b;

    /* renamed from: c, reason: collision with root package name */
    public final Hpack.Reader f19688c;

    public static final class Companion {
        public /* synthetic */ Companion(int i10) {
            this();
        }

        public static int a(int i10, int i11, int i12) throws IOException {
            if ((i11 & 8) != 0) {
                i10--;
            }
            if (i12 <= i10) {
                return i10 - i12;
            }
            throw new IOException(c.a(i12, i10, "PROTOCOL_ERROR padding ", " > remaining length "));
        }

        private Companion() {
        }
    }

    public static final class ContinuationSource implements l0 {

        /* renamed from: a, reason: collision with root package name */
        public final i f19689a;

        /* renamed from: b, reason: collision with root package name */
        public int f19690b;

        /* renamed from: c, reason: collision with root package name */
        public int f19691c;

        /* renamed from: d, reason: collision with root package name */
        public int f19692d;

        /* renamed from: e, reason: collision with root package name */
        public int f19693e;

        /* renamed from: f, reason: collision with root package name */
        public int f19694f;

        public ContinuationSource(i source) {
            r.e(source, "source");
            this.f19689a = source;
        }

        @Override // hi.l0
        public final m0 b() {
            return this.f19689a.b();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // hi.l0
        public final long y(long j10, g sink) throws IOException {
            int i10;
            int i11;
            r.e(sink, "sink");
            do {
                int i12 = this.f19693e;
                i iVar = this.f19689a;
                if (i12 == 0) {
                    iVar.skip(this.f19694f);
                    this.f19694f = 0;
                    if ((this.f19691c & 4) == 0) {
                        i10 = this.f19692d;
                        int iS = Util.s(iVar);
                        this.f19693e = iS;
                        this.f19690b = iS;
                        int i13 = iVar.readByte() & 255;
                        this.f19691c = iVar.readByte() & 255;
                        Http2Reader.f19684d.getClass();
                        Logger logger = Http2Reader.f19685e;
                        if (logger.isLoggable(Level.FINE)) {
                            Http2 http2 = Http2.f19609a;
                            int i14 = this.f19692d;
                            int i15 = this.f19690b;
                            int i16 = this.f19691c;
                            http2.getClass();
                            logger.fine(Http2.a(true, i14, i15, i13, i16));
                        }
                        i11 = iVar.readInt() & Integer.MAX_VALUE;
                        this.f19692d = i11;
                        if (i13 != 9) {
                            throw new IOException(i8.c.b(i13, " != TYPE_CONTINUATION"));
                        }
                    }
                } else {
                    long jY = iVar.y(Math.min(j10, i12), sink);
                    if (jY != -1) {
                        this.f19693e -= (int) jY;
                        return jY;
                    }
                }
                return -1L;
            } while (i11 == i10);
            throw new IOException("TYPE_CONTINUATION streamId changed");
        }
    }

    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        r.d(logger, "getLogger(Http2::class.java.name)");
        f19685e = logger;
    }

    public Http2Reader(f0 source) {
        r.e(source, "source");
        this.f19686a = source;
        ContinuationSource continuationSource = new ContinuationSource(source);
        this.f19687b = continuationSource;
        this.f19688c = new Hpack.Reader(continuationSource);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f19686a.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x026d, code lost:
    
        throw new java.io.IOException(j2.y.a(r8, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(boolean z10, final Http2Connection.ReaderRunnable readerRunnable) throws IOException {
        final ErrorCode errorCode;
        Object[] array;
        Companion companion = f19684d;
        i iVar = this.f19686a;
        try {
            iVar.u0(9L);
            int iS = Util.s(iVar);
            if (iS > 16384) {
                throw new IOException(y.a(iS, "FRAME_SIZE_ERROR: "));
            }
            int i10 = iVar.readByte() & 255;
            byte b10 = iVar.readByte();
            int i11 = b10 & 255;
            int i12 = iVar.readInt();
            final int i13 = i12 & Integer.MAX_VALUE;
            Logger logger = f19685e;
            if (logger.isLoggable(Level.FINE)) {
                Http2.f19609a.getClass();
                logger.fine(Http2.a(true, i13, iS, i10, i11));
            }
            if (z10 && i10 != 4) {
                StringBuilder sb = new StringBuilder("Expected a SETTINGS frame but was ");
                Http2.f19609a.getClass();
                String[] strArr = Http2.f19611c;
                sb.append(i10 < strArr.length ? strArr[i10] : Util.h("0x%02x", Integer.valueOf(i10)));
                throw new IOException(sb.toString());
            }
            ErrorCode errorCode2 = null;
            switch (i10) {
                case 0:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                    }
                    boolean z11 = (b10 & 1) != 0;
                    if ((b10 & 32) != 0) {
                        throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                    }
                    i = (8 & b10) != 0 ? iVar.readByte() & 255 : 0;
                    companion.getClass();
                    readerRunnable.a(z11, i13, iVar, Companion.a(iS, i11, i));
                    iVar.skip(i);
                    return true;
                case 1:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                    }
                    boolean z12 = (b10 & 1) != 0;
                    i = (b10 & 8) != 0 ? iVar.readByte() & 255 : 0;
                    if ((b10 & 32) != 0) {
                        p(readerRunnable, i13);
                        iS -= 5;
                    }
                    companion.getClass();
                    readerRunnable.c(i13, l(Companion.a(iS, i11, i), i, i11, i13), z12);
                    return true;
                case 2:
                    if (iS != 5) {
                        throw new IOException(b.b(iS, "TYPE_PRIORITY length: ", " != 5"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_PRIORITY streamId == 0");
                    }
                    p(readerRunnable, i13);
                    return true;
                case 3:
                    if (iS != 4) {
                        throw new IOException(b.b(iS, "TYPE_RST_STREAM length: ", " != 4"));
                    }
                    if (i13 == 0) {
                        throw new IOException("TYPE_RST_STREAM streamId == 0");
                    }
                    int i14 = iVar.readInt();
                    ErrorCode.f19573b.getClass();
                    ErrorCode[] errorCodeArrValues = ErrorCode.values();
                    int length = errorCodeArrValues.length;
                    while (true) {
                        if (i < length) {
                            errorCode = errorCodeArrValues[i];
                            if (errorCode.f19581a != i14) {
                                i++;
                            }
                        } else {
                            errorCode = null;
                        }
                    }
                    if (errorCode == null) {
                        throw new IOException(y.a(i14, "TYPE_RST_STREAM unexpected error code: "));
                    }
                    final Http2Connection http2Connection = Http2Connection.this;
                    Http2Connection.Companion companion2 = Http2Connection.D;
                    if (i13 == 0 || (i12 & 1) != 0) {
                        Http2Stream http2StreamZ = http2Connection.z(i13);
                        if (http2StreamZ == null) {
                            return true;
                        }
                        http2StreamZ.j(errorCode);
                        return true;
                    }
                    TaskQueue taskQueue = http2Connection.f19622j;
                    final String str = http2Connection.f19616c + '[' + i13 + "] onReset";
                    taskQueue.c(new Task(str, http2Connection, i13, errorCode) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1

                        /* renamed from: e, reason: collision with root package name */
                        public final /* synthetic */ Http2Connection f19656e;

                        /* renamed from: f, reason: collision with root package name */
                        public final /* synthetic */ int f19657f;

                        @Override // okhttp3.internal.concurrent.Task
                        public final long a() {
                            ((PushObserver.Companion.PushObserverCancel) this.f19656e.f19624l).getClass();
                            synchronized (this.f19656e) {
                                this.f19656e.C.remove(Integer.valueOf(this.f19657f));
                                pg.f0 f0Var = pg.f0.f21461a;
                            }
                            return -1L;
                        }
                    }, 0L);
                    return true;
                case 4:
                    if (i13 != 0) {
                        throw new IOException("TYPE_SETTINGS streamId != 0");
                    }
                    if ((b10 & 1) != 0) {
                        if (iS != 0) {
                            throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                        }
                        return true;
                    }
                    if (iS % 6 != 0) {
                        throw new IOException(y.a(iS, "TYPE_SETTINGS length % 6 != 0: "));
                    }
                    final Settings settings = new Settings();
                    e eVarP = j.p(j.q(0, iS), 6);
                    int i15 = eVarP.f15744a;
                    int i16 = eVarP.f15745b;
                    int i17 = eVarP.f15746c;
                    if ((i17 > 0 && i15 <= i16) || (i17 < 0 && i16 <= i15)) {
                        while (true) {
                            short s10 = iVar.readShort();
                            byte[] bArr = Util.f19393a;
                            int i18 = s10 & HPKE.aead_EXPORT_ONLY;
                            int i19 = iVar.readInt();
                            if (i18 != 2) {
                                if (i18 == 3) {
                                    i18 = 4;
                                } else if (i18 != 4) {
                                    if (i18 == 5 && (i19 < 16384 || i19 > 16777215)) {
                                        break;
                                    }
                                } else {
                                    if (i19 < 0) {
                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    }
                                    i18 = 7;
                                }
                            } else if (i19 != 0 && i19 != 1) {
                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                            }
                            settings.c(i18, i19);
                            if (i15 != i16) {
                                i15 += i17;
                            }
                        }
                    }
                    Http2Connection http2Connection2 = Http2Connection.this;
                    TaskQueue taskQueue2 = http2Connection2.f19621h;
                    final String strA = o.a(new StringBuilder(), http2Connection2.f19616c, " applyAndAckSettings");
                    taskQueue2.c(new Task(strA) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r5v0, types: [T, okhttp3.internal.http2.Settings] */
                        @Override // okhttp3.internal.concurrent.Task
                        public final long a() {
                            long jA;
                            int i20;
                            Http2Stream[] http2StreamArr;
                            Http2Connection.ReaderRunnable readerRunnable2 = readerRunnable;
                            Settings settings2 = settings;
                            final g0 g0Var = new g0();
                            final Http2Connection http2Connection3 = Http2Connection.this;
                            synchronized (http2Connection3.A) {
                                synchronized (http2Connection3) {
                                    try {
                                        Settings settings3 = http2Connection3.f19631t;
                                        ?? settings4 = new Settings();
                                        settings4.b(settings3);
                                        settings4.b(settings2);
                                        g0Var.f16327a = settings4;
                                        jA = settings4.a() - settings3.a();
                                        http2StreamArr = (jA == 0 || http2Connection3.f19615b.isEmpty()) ? null : (Http2Stream[]) http2Connection3.f19615b.values().toArray(new Http2Stream[0]);
                                        Settings settings5 = (Settings) g0Var.f16327a;
                                        r.e(settings5, "<set-?>");
                                        http2Connection3.f19631t = settings5;
                                        http2Connection3.f19623k.c(new Task(http2Connection3.f19616c + " onSettings") { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                                            /* JADX WARN: Multi-variable type inference failed */
                                            @Override // okhttp3.internal.concurrent.Task
                                            public final long a() {
                                                Http2Connection http2Connection4 = http2Connection3;
                                                http2Connection4.f19614a.a(http2Connection4, (Settings) g0Var.f16327a);
                                                return -1L;
                                            }
                                        }, 0L);
                                        pg.f0 f0Var = pg.f0.f21461a;
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                                try {
                                    http2Connection3.A.h((Settings) g0Var.f16327a);
                                } catch (IOException e10) {
                                    http2Connection3.l(e10);
                                }
                                pg.f0 f0Var2 = pg.f0.f21461a;
                            }
                            if (http2StreamArr == null) {
                                return -1L;
                            }
                            for (Http2Stream http2Stream : http2StreamArr) {
                                synchronized (http2Stream) {
                                    http2Stream.f19700f += jA;
                                    if (jA > 0) {
                                        http2Stream.notifyAll();
                                    }
                                    pg.f0 f0Var3 = pg.f0.f21461a;
                                }
                            }
                            return -1L;
                        }
                    }, 0L);
                    return true;
                case 5:
                    if (i13 == 0) {
                        throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                    }
                    i = (8 & b10) != 0 ? iVar.readByte() & 255 : 0;
                    int i20 = iVar.readInt() & Integer.MAX_VALUE;
                    companion.getClass();
                    readerRunnable.e(i20, l(Companion.a(iS - 4, i11, i), i, i11, i13));
                    return true;
                case 6:
                    if (iS != 8) {
                        throw new IOException(y.a(iS, "TYPE_PING length != 8: "));
                    }
                    if (i13 != 0) {
                        throw new IOException("TYPE_PING streamId != 0");
                    }
                    final int i21 = iVar.readInt();
                    final int i22 = iVar.readInt();
                    if (((b10 & 1) != 0 ? 1 : 0) == 0) {
                        TaskQueue taskQueue3 = Http2Connection.this.f19621h;
                        final String strA2 = o.a(new StringBuilder(), Http2Connection.this.f19616c, " ping");
                        final Http2Connection http2Connection3 = Http2Connection.this;
                        taskQueue3.c(new Task(strA2) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public final long a() throws IOException {
                                Http2Connection http2Connection4 = http2Connection3;
                                try {
                                    http2Connection4.A.M(i21, i22, true);
                                    return -1L;
                                } catch (IOException e10) {
                                    http2Connection4.l(e10);
                                    return -1L;
                                }
                            }
                        }, 0L);
                        return true;
                    }
                    Http2Connection http2Connection4 = Http2Connection.this;
                    synchronized (http2Connection4) {
                        try {
                            if (i21 == 1) {
                                http2Connection4.f19626n++;
                            } else if (i21 != 2) {
                                if (i21 == 3) {
                                    http2Connection4.notifyAll();
                                }
                                pg.f0 f0Var = pg.f0.f21461a;
                            } else {
                                http2Connection4.f19628q++;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return true;
                case 7:
                    if (iS < 8) {
                        throw new IOException(y.a(iS, "TYPE_GOAWAY length < 8: "));
                    }
                    if (i13 != 0) {
                        throw new IOException("TYPE_GOAWAY streamId != 0");
                    }
                    int i23 = iVar.readInt();
                    int i24 = iVar.readInt();
                    int i25 = iS - 8;
                    ErrorCode.f19573b.getClass();
                    ErrorCode[] errorCodeArrValues2 = ErrorCode.values();
                    int length2 = errorCodeArrValues2.length;
                    int i26 = 0;
                    while (true) {
                        if (i26 < length2) {
                            ErrorCode errorCode3 = errorCodeArrValues2[i26];
                            if (errorCode3.f19581a == i24) {
                                errorCode2 = errorCode3;
                            } else {
                                i26++;
                            }
                        }
                    }
                    if (errorCode2 == null) {
                        throw new IOException(y.a(i24, "TYPE_GOAWAY unexpected error code: "));
                    }
                    hi.j debugData = hi.j.f13075d;
                    if (i25 > 0) {
                        debugData = iVar.m(i25);
                    }
                    r.e(debugData, "debugData");
                    debugData.d();
                    Http2Connection http2Connection5 = Http2Connection.this;
                    synchronized (http2Connection5) {
                        array = http2Connection5.f19615b.values().toArray(new Http2Stream[0]);
                        http2Connection5.f19619f = true;
                        pg.f0 f0Var2 = pg.f0.f21461a;
                    }
                    Http2Stream[] http2StreamArr = (Http2Stream[]) array;
                    int length3 = http2StreamArr.length;
                    while (i < length3) {
                        Http2Stream http2Stream = http2StreamArr[i];
                        if (http2Stream.f19695a > i23 && http2Stream.g()) {
                            http2Stream.j(ErrorCode.REFUSED_STREAM);
                            Http2Connection.this.z(http2Stream.f19695a);
                        }
                        i++;
                    }
                    return true;
                case 8:
                    if (iS != 4) {
                        throw new IOException(y.a(iS, "TYPE_WINDOW_UPDATE length !=4: "));
                    }
                    long j10 = iVar.readInt() & 2147483647L;
                    if (j10 == 0) {
                        throw new IOException("windowSizeIncrement was 0");
                    }
                    if (i13 == 0) {
                        Http2Connection http2Connection6 = Http2Connection.this;
                        synchronized (http2Connection6) {
                            http2Connection6.f19635y += j10;
                            http2Connection6.notifyAll();
                            pg.f0 f0Var3 = pg.f0.f21461a;
                        }
                        return true;
                    }
                    Http2Stream http2StreamP = Http2Connection.this.p(i13);
                    if (http2StreamP == null) {
                        return true;
                    }
                    synchronized (http2StreamP) {
                        http2StreamP.f19700f += j10;
                        if (j10 > 0) {
                            http2StreamP.notifyAll();
                        }
                        pg.f0 f0Var4 = pg.f0.f21461a;
                    }
                    return true;
                default:
                    iVar.skip(iS);
                    return true;
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final List<Header> l(int i10, int i11, int i12, int i13) throws IOException {
        ContinuationSource continuationSource = this.f19687b;
        continuationSource.f19693e = i10;
        continuationSource.f19690b = i10;
        continuationSource.f19694f = i11;
        continuationSource.f19691c = i12;
        continuationSource.f19692d = i13;
        Hpack.Reader reader = this.f19688c;
        f0 f0Var = reader.f19596c;
        ArrayList arrayList = reader.f19595b;
        while (!f0Var.h()) {
            byte b10 = f0Var.readByte();
            byte[] bArr = Util.f19393a;
            int i14 = b10 & 255;
            if (i14 == 128) {
                throw new IOException("index == 0");
            }
            if ((b10 & 128) == 128) {
                int iE = reader.e(i14, CertificateBody.profileType);
                int i15 = iE - 1;
                if (i15 >= 0) {
                    Hpack hpack = Hpack.f19591a;
                    hpack.getClass();
                    Header[] headerArr = Hpack.f19592b;
                    if (i15 <= headerArr.length - 1) {
                        hpack.getClass();
                        arrayList.add(headerArr[i15]);
                    }
                }
                Hpack.f19591a.getClass();
                int length = reader.f19598e + 1 + (i15 - Hpack.f19592b.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.f19597d;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        r.b(header);
                        arrayList.add(header);
                    }
                }
                throw new IOException(y.a(iE, "Header index too large "));
            }
            if (i14 == 64) {
                Hpack hpack2 = Hpack.f19591a;
                hi.j jVarD = reader.d();
                hpack2.getClass();
                Hpack.a(jVarD);
                reader.c(new Header(jVarD, reader.d()));
            } else if ((b10 & 64) == 64) {
                reader.c(new Header(reader.b(reader.e(i14, 63) - 1), reader.d()));
            } else if ((b10 & 32) == 32) {
                int iE2 = reader.e(i14, 31);
                reader.f19594a = iE2;
                if (iE2 < 0 || iE2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + reader.f19594a);
                }
                int i16 = reader.f19600g;
                if (iE2 < i16) {
                    if (iE2 == 0) {
                        Header[] headerArr3 = reader.f19597d;
                        m.m(headerArr3, 0, headerArr3.length, null);
                        reader.f19598e = reader.f19597d.length - 1;
                        reader.f19599f = 0;
                        reader.f19600g = 0;
                    } else {
                        reader.a(i16 - iE2);
                    }
                }
            } else if (i14 == 16 || i14 == 0) {
                Hpack hpack3 = Hpack.f19591a;
                hi.j jVarD2 = reader.d();
                hpack3.getClass();
                Hpack.a(jVarD2);
                arrayList.add(new Header(jVarD2, reader.d()));
            } else {
                arrayList.add(new Header(reader.b(reader.e(i14, 15) - 1), reader.d()));
            }
        }
        List<Header> listC0 = x.c0(arrayList);
        arrayList.clear();
        return listC0;
    }

    public final void p(Http2Connection.ReaderRunnable readerRunnable, int i10) throws IOException {
        i iVar = this.f19686a;
        iVar.readInt();
        iVar.readByte();
        byte[] bArr = Util.f19393a;
    }
}
