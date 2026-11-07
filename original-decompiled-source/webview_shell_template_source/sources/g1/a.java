package g1;

import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.camera.camera2.internal.p0;
import androidx.camera.core.impl.utils.Exif;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class a {
    public static final SimpleDateFormat Q;
    public static final e U;
    public static final e[][] V;
    public static final e[] W;
    public static final e X;
    public static final e Y;
    public static final HashMap<Integer, e>[] Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashMap<String, e>[] f13204a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final HashSet<String> f13205b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f13206c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final Charset f13207d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final byte[] f13208e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final byte[] f13209f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f13210g0;

    /* renamed from: h0, reason: collision with root package name */
    public static final Pattern f13211h0;

    /* renamed from: i0, reason: collision with root package name */
    public static final Pattern f13212i0;

    /* renamed from: a, reason: collision with root package name */
    public final String f13220a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f13221b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f13222c;

    /* renamed from: d, reason: collision with root package name */
    public int f13223d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, d>[] f13224e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f13225f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f13226g;
    public boolean h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13227i;

    /* renamed from: j, reason: collision with root package name */
    public int f13228j;

    /* renamed from: k, reason: collision with root package name */
    public int f13229k;

    /* renamed from: l, reason: collision with root package name */
    public byte[] f13230l;

    /* renamed from: m, reason: collision with root package name */
    public int f13231m;

    /* renamed from: n, reason: collision with root package name */
    public int f13232n;

    /* renamed from: o, reason: collision with root package name */
    public int f13233o;

    /* renamed from: p, reason: collision with root package name */
    public int f13234p;

    /* renamed from: q, reason: collision with root package name */
    public int f13235q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f13236r;
    public static final boolean s = Log.isLoggable("ExifInterface", 3);

    /* renamed from: t, reason: collision with root package name */
    public static final List<Integer> f13213t = Arrays.asList(1, 6, 3, 8);

    /* renamed from: u, reason: collision with root package name */
    public static final List<Integer> f13214u = Arrays.asList(2, 7, 4, 5);

    /* renamed from: v, reason: collision with root package name */
    public static final int[] f13215v = {8, 8, 8};

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f13216w = {8};

    /* renamed from: x, reason: collision with root package name */
    public static final byte[] f13217x = {-1, -40, -1};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f13218y = {102, 116, 121, 112};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f13219z = {109, 105, 102, 49};
    public static final byte[] A = {104, 101, 105, 99};
    public static final byte[] B = {79, 76, 89, 77, 80, 0};
    public static final byte[] C = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] D = {-119, 80, 78, 71, 13, 10, 26, 10};
    public static final byte[] E = {101, 88, 73, 102};
    public static final byte[] F = {73, 72, 68, 82};
    public static final byte[] G = {73, 69, 78, 68};
    public static final byte[] H = {82, 73, 70, 70};
    public static final byte[] I = {87, 69, 66, 80};
    public static final byte[] J = {69, 88, 73, 70};
    public static final byte[] K = {-99, 1, 42};
    public static final byte[] L = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] M = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] O = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class b extends InputStream implements DataInput {

        /* renamed from: w, reason: collision with root package name */
        public static final ByteOrder f13238w = ByteOrder.LITTLE_ENDIAN;

        /* renamed from: x, reason: collision with root package name */
        public static final ByteOrder f13239x = ByteOrder.BIG_ENDIAN;
        public final DataInputStream s;

        /* renamed from: t, reason: collision with root package name */
        public ByteOrder f13240t;

        /* renamed from: u, reason: collision with root package name */
        public final int f13241u;

        /* renamed from: v, reason: collision with root package name */
        public int f13242v;

        public b(InputStream inputStream) {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public final void a(long j6) throws IOException {
            int i6 = this.f13242v;
            if (i6 > j6) {
                this.f13242v = 0;
                DataInputStream dataInputStream = this.s;
                dataInputStream.reset();
                dataInputStream.mark(this.f13241u);
            } else {
                j6 -= i6;
            }
            int i7 = (int) j6;
            if (skipBytes(i7) != i7) {
                throw new IOException("Couldn't seek up to the byteCount");
            }
        }

        @Override // java.io.InputStream
        public final int available() {
            return this.s.available();
        }

        @Override // java.io.InputStream
        public final synchronized void mark(int i6) {
            this.s.mark(i6);
        }

        @Override // java.io.InputStream
        public final int read() {
            this.f13242v++;
            return this.s.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() {
            this.f13242v++;
            return this.s.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            int i6 = this.f13242v + 1;
            this.f13242v = i6;
            if (i6 > this.f13241u) {
                throw new EOFException();
            }
            int i7 = this.s.read();
            if (i7 >= 0) {
                return (byte) i7;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() {
            this.f13242v += 2;
            return this.s.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i6, int i7) throws IOException {
            int i8 = this.f13242v + i7;
            this.f13242v = i8;
            if (i8 > this.f13241u) {
                throw new EOFException();
            }
            if (this.s.read(bArr, i6, i7) != i7) {
                throw new IOException("Couldn't read up to the length of buffer");
            }
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            int i6 = this.f13242v + 4;
            this.f13242v = i6;
            if (i6 > this.f13241u) {
                throw new EOFException();
            }
            DataInputStream dataInputStream = this.s;
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            int i9 = dataInputStream.read();
            int i10 = dataInputStream.read();
            if ((i7 | i8 | i9 | i10) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f13240t;
            if (byteOrder == f13238w) {
                return (i10 << 24) + (i9 << 16) + (i8 << 8) + i7;
            }
            if (byteOrder == f13239x) {
                return (i7 << 24) + (i8 << 16) + (i9 << 8) + i10;
            }
            throw new IOException("Invalid byte order: " + this.f13240t);
        }

        @Override // java.io.DataInput
        public final String readLine() {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j6;
            long j7;
            int i6 = this.f13242v + 8;
            this.f13242v = i6;
            if (i6 > this.f13241u) {
                throw new EOFException();
            }
            DataInputStream dataInputStream = this.s;
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            int i9 = dataInputStream.read();
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            if ((i7 | i8 | i9 | i10 | i11 | i12 | i13 | i14) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f13240t;
            if (byteOrder == f13238w) {
                j6 = (i14 << 56) + (i13 << 48) + (i12 << 40) + (i11 << 32) + (i10 << 24) + (i9 << 16) + (i8 << 8);
                j7 = i7;
            } else {
                if (byteOrder != f13239x) {
                    throw new IOException("Invalid byte order: " + this.f13240t);
                }
                j6 = (i7 << 56) + (i8 << 48) + (i9 << 40) + (i10 << 32) + (i11 << 24) + (i12 << 16) + (i13 << 8);
                j7 = i14;
            }
            return j6 + j7;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            int i6 = this.f13242v + 2;
            this.f13242v = i6;
            if (i6 > this.f13241u) {
                throw new EOFException();
            }
            DataInputStream dataInputStream = this.s;
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f13240t;
            if (byteOrder == f13238w) {
                return (short) ((i8 << 8) + i7);
            }
            if (byteOrder == f13239x) {
                return (short) ((i7 << 8) + i8);
            }
            throw new IOException("Invalid byte order: " + this.f13240t);
        }

        @Override // java.io.DataInput
        public final String readUTF() {
            this.f13242v += 2;
            return this.s.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() {
            this.f13242v++;
            return this.s.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            int i6 = this.f13242v + 2;
            this.f13242v = i6;
            if (i6 > this.f13241u) {
                throw new EOFException();
            }
            DataInputStream dataInputStream = this.s;
            int i7 = dataInputStream.read();
            int i8 = dataInputStream.read();
            if ((i7 | i8) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f13240t;
            if (byteOrder == f13238w) {
                return (i8 << 8) + i7;
            }
            if (byteOrder == f13239x) {
                return (i7 << 8) + i8;
            }
            throw new IOException("Invalid byte order: " + this.f13240t);
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i6) {
            int iMin = Math.min(i6, this.f13241u - this.f13242v);
            int iSkipBytes = 0;
            while (iSkipBytes < iMin) {
                iSkipBytes += this.s.skipBytes(iMin - iSkipBytes);
            }
            this.f13242v += iSkipBytes;
            return iSkipBytes;
        }

        public b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f13240t = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.s = dataInputStream;
            int iAvailable = dataInputStream.available();
            this.f13241u = iAvailable;
            this.f13242v = 0;
            dataInputStream.mark(iAvailable);
            this.f13240t = byteOrder;
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i6, int i7) throws IOException {
            int i8 = this.s.read(bArr, i6, i7);
            this.f13242v += i8;
            return i8;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            int length = this.f13242v + bArr.length;
            this.f13242v = length;
            if (length <= this.f13241u) {
                if (this.s.read(bArr, 0, bArr.length) != bArr.length) {
                    throw new IOException("Couldn't read up to the length of buffer");
                }
                return;
            }
            throw new EOFException();
        }

        public b(byte[] bArr) {
            this(new ByteArrayInputStream(bArr));
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class c extends FilterOutputStream {
        public final OutputStream s;

        /* renamed from: t, reason: collision with root package name */
        public ByteOrder f13243t;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.s = outputStream;
            this.f13243t = byteOrder;
        }

        public final void a(int i6) throws IOException {
            this.s.write(i6);
        }

        public final void b(int i6) throws IOException {
            ByteOrder byteOrder = this.f13243t;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.s;
            if (byteOrder == byteOrder2) {
                outputStream.write(i6 & 255);
                outputStream.write((i6 >>> 8) & 255);
                outputStream.write((i6 >>> 16) & 255);
                outputStream.write((i6 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i6 >>> 24) & 255);
                outputStream.write((i6 >>> 16) & 255);
                outputStream.write((i6 >>> 8) & 255);
                outputStream.write(i6 & 255);
            }
        }

        public final void c(short s) throws IOException {
            ByteOrder byteOrder = this.f13243t;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.s;
            if (byteOrder == byteOrder2) {
                outputStream.write(s & 255);
                outputStream.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s >>> 8) & 255);
                outputStream.write(s & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.s.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i6, int i7) throws IOException {
            this.s.write(bArr, i6, i7);
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f13244a;

        /* renamed from: b, reason: collision with root package name */
        public final int f13245b;

        /* renamed from: c, reason: collision with root package name */
        public final long f13246c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f13247d;

        public d(int i6, int i7, byte[] bArr) {
            this(i6, i7, -1L, bArr);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(a.f13207d0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j6, ByteOrder byteOrder) {
            return c(new long[]{j6}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.S[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j6 : jArr) {
                byteBufferWrap.putInt((int) j6);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.S[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f13252a);
                byteBufferWrap.putInt((int) fVar.f13253b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(int i6, ByteOrder byteOrder) {
            return f(new int[]{i6}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[a.S[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i6 : iArr) {
                byteBufferWrap.putShort((short) i6);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public final double g(ByteOrder byteOrder) {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objJ instanceof String) {
                return Double.parseDouble((String) objJ);
            }
            if (objJ instanceof long[]) {
                if (((long[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof int[]) {
                if (((int[]) objJ).length == 1) {
                    return r5[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            f[] fVarArr = (f[]) objJ;
            if (fVarArr.length != 1) {
                throw new NumberFormatException("There are more than one component");
            }
            f fVar = fVarArr[0];
            return fVar.f13252a / fVar.f13253b;
        }

        public final int h(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objJ instanceof String) {
                return Integer.parseInt((String) objJ);
            }
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objJ instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objJ;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        public final String i(ByteOrder byteOrder) throws Throwable {
            Object objJ = j(byteOrder);
            if (objJ == null) {
                return null;
            }
            if (objJ instanceof String) {
                return (String) objJ;
            }
            StringBuilder sb = new StringBuilder();
            int i6 = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i6 < jArr.length) {
                    sb.append(jArr[i6]);
                    i6++;
                    if (i6 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i6 < iArr.length) {
                    sb.append(iArr[i6]);
                    i6++;
                    if (i6 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i6 < dArr.length) {
                    sb.append(dArr[i6]);
                    i6++;
                    if (i6 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objJ instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objJ;
            while (i6 < fVarArr.length) {
                sb.append(fVarArr[i6].f13252a);
                sb.append('/');
                sb.append(fVarArr[i6].f13253b);
                i6++;
                if (i6 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:51), block:B:17:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
        /* JADX WARN: Type inference failed for: r14v25, types: [g1.a$f[]] */
        /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v28, types: [g1.a$f[]] */
        /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
        /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable j(ByteOrder byteOrder) throws Throwable {
            b bVar;
            InputStream inputStream;
            ?? str;
            byte b7;
            byte[] bArr = this.f13247d;
            InputStream inputStream2 = null;
            try {
                try {
                    bVar = new b(bArr);
                    try {
                        bVar.f13240t = byteOrder;
                        int i6 = this.f13244a;
                        int length = 0;
                        int i7 = this.f13245b;
                        switch (i6) {
                            case 1:
                            case 6:
                                if (bArr.length == 1 && (b7 = bArr[0]) >= 0 && b7 <= 1) {
                                    String str2 = new String(new char[]{(char) (b7 + 48)});
                                    try {
                                        bVar.close();
                                        return str2;
                                    } catch (IOException e6) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e6);
                                        return str2;
                                    }
                                }
                                str = new String(bArr, a.f13207d0);
                                break;
                                break;
                            case 2:
                            case 7:
                                if (i7 >= a.T.length) {
                                    int i8 = 0;
                                    while (true) {
                                        byte[] bArr2 = a.T;
                                        if (i8 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i8] == bArr2[i8]) {
                                            i8++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < i7) {
                                    byte b8 = bArr[length];
                                    if (b8 == 0) {
                                        str = sb.toString();
                                        break;
                                    } else {
                                        if (b8 >= 32) {
                                            sb.append((char) b8);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                }
                                str = sb.toString();
                            case 3:
                                str = new int[i7];
                                while (length < i7) {
                                    str[length] = bVar.readUnsignedShort();
                                    length++;
                                }
                            case 4:
                                str = new long[i7];
                                while (length < i7) {
                                    str[length] = bVar.readInt() & 4294967295L;
                                    length++;
                                }
                            case 5:
                                str = new f[i7];
                                while (length < i7) {
                                    str[length] = new f(bVar.readInt() & 4294967295L, bVar.readInt() & 4294967295L);
                                    length++;
                                }
                            case 8:
                                str = new int[i7];
                                while (length < i7) {
                                    str[length] = bVar.readShort();
                                    length++;
                                }
                            case 9:
                                str = new int[i7];
                                while (length < i7) {
                                    str[length] = bVar.readInt();
                                    length++;
                                }
                            case 10:
                                str = new f[i7];
                                while (length < i7) {
                                    str[length] = new f(bVar.readInt(), bVar.readInt());
                                    length++;
                                }
                            case 11:
                                str = new double[i7];
                                while (length < i7) {
                                    str[length] = bVar.readFloat();
                                    length++;
                                }
                            case 12:
                                str = new double[i7];
                                while (length < i7) {
                                    str[length] = bVar.readDouble();
                                    length++;
                                }
                            default:
                                try {
                                    bVar.close();
                                    return null;
                                } catch (IOException e7) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e7);
                                    return null;
                                }
                        }
                        try {
                            bVar.close();
                            return str;
                        } catch (IOException e8) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e8);
                            return str;
                        }
                    } catch (IOException e9) {
                        e = e9;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (bVar != null) {
                            try {
                                bVar.close();
                            } catch (IOException e10) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th) {
                    th = th;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e11) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                        }
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                bVar = null;
            } catch (Throwable th2) {
                th = th2;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(a.R[this.f13244a]);
            sb.append(", data length:");
            return p0.a(sb, this.f13247d.length, ")");
        }

        public d(int i6, int i7, long j6, byte[] bArr) {
            this.f13244a = i6;
            this.f13245b = i7;
            this.f13246c = j6;
            this.f13247d = bArr;
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f13252a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13253b;

        public f(double d7) {
            this((long) (d7 * 10000.0d), 10000L);
        }

        public final String toString() {
            return this.f13252a + "/" + this.f13253b;
        }

        public f(long j6, long j7) {
            if (j7 == 0) {
                this.f13252a = 0L;
                this.f13253b = 1L;
            } else {
                this.f13252a = j6;
                this.f13253b = j7;
            }
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", 257, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e(Exif.TAG_THUMBNAIL_ORIENTATION, 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", 513, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        U = new e("StripOffsets", 273, 3);
        V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", 257, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        X = new e("JPEGInterchangeFormat", 513, 4);
        Y = new e("JPEGInterchangeFormatLength", 514, 4);
        Z = new HashMap[10];
        f13204a0 = new HashMap[10];
        f13205b0 = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f13206c0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f13207d0 = charsetForName;
        f13208e0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f13209f0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        Q = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i6 = 0;
        while (true) {
            e[][] eVarArr6 = V;
            if (i6 >= eVarArr6.length) {
                HashMap<Integer, Integer> map = f13206c0;
                e[] eVarArr7 = W;
                map.put(Integer.valueOf(eVarArr7[0].f13248a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f13248a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f13248a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f13248a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f13248a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f13248a), 8);
                Pattern.compile(".*[1-9].*");
                f13210g0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f13211h0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f13212i0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            Z[i6] = new HashMap<>();
            f13204a0[i6] = new HashMap<>();
            for (e eVar : eVarArr6[i6]) {
                Z[i6].put(Integer.valueOf(eVar.f13248a), eVar);
                f13204a0[i6].put(eVar.f13249b, eVar);
            }
            i6++;
        }
    }

    public a(String str) throws Throwable {
        FileInputStream fileInputStream;
        boolean z6;
        e[][] eVarArr = V;
        this.f13224e = new HashMap[eVarArr.length];
        this.f13225f = new HashSet(eVarArr.length);
        this.f13226g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream2 = null;
        this.f13222c = null;
        this.f13220a = str;
        try {
            fileInputStream = new FileInputStream(str);
        } catch (Throwable th) {
            th = th;
        }
        try {
            try {
                Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                z6 = true;
            } catch (Exception unused) {
                if (s) {
                    Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                }
                z6 = false;
            }
            if (z6) {
                this.f13221b = fileInputStream.getFD();
            } else {
                this.f13221b = null;
            }
            z(fileInputStream);
            c(fileInputStream);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            c(fileInputStream2);
            throw th;
        }
    }

    public static ByteOrder C(b bVar) throws IOException {
        short s3 = bVar.readShort();
        boolean z6 = s;
        if (s3 == 18761) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s3 == 19789) {
            if (z6) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s3));
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b7 : bArr) {
            sb.append(String.format("%02x", Byte.valueOf(b7)));
        }
        return sb.toString();
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e6) {
                throw e6;
            } catch (Exception unused) {
            }
        }
    }

    public static String d(double d7) {
        long j6 = (long) d7;
        double d8 = d7 - j6;
        long j7 = (long) (d8 * 60.0d);
        return j6 + "/1," + j7 + "/1," + Math.round((d8 - (j7 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    public static double e(String str, String str2) {
        try {
            String[] strArrSplit = str.split(",", -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d7 = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d8 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d9 = ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d) + (d8 / 60.0d) + d7;
            if (!str2.equals("S") && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d9;
            }
            return -d9;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] f(Serializable serializable) {
        if (!(serializable instanceof int[])) {
            if (serializable instanceof long[]) {
                return (long[]) serializable;
            }
            return null;
        }
        int[] iArr = (int[]) serializable;
        long[] jArr = new long[iArr.length];
        for (int i6 = 0; i6 < iArr.length; i6++) {
            jArr[i6] = iArr[i6];
        }
        return jArr;
    }

    public static void g(InputStream inputStream, c cVar, int i6) throws IOException {
        byte[] bArr = new byte[8192];
        while (i6 > 0) {
            int iMin = Math.min(i6, 8192);
            int i7 = inputStream.read(bArr, 0, iMin);
            if (i7 != iMin) {
                throw new IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i6 -= i7;
            cVar.write(bArr, 0, i7);
        }
    }

    public static void h(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        while (true) {
            int i6 = inputStream.read(bArr);
            if (i6 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i6);
            }
        }
    }

    public static void i(b bVar, c cVar, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (bVar.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = f13207d0;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            int i6 = bVar.readInt();
            cVar.write(bArr3);
            cVar.b(i6);
            if (i6 % 2 == 1) {
                i6++;
            }
            g(bVar, cVar, i6);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    public static Pair<Integer, Integer> w(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairW = w(strArrSplit[0]);
            if (((Integer) pairW.first).intValue() == 2) {
                return pairW;
            }
            for (int i6 = 1; i6 < strArrSplit.length; i6++) {
                Pair<Integer, Integer> pairW2 = w(strArrSplit[i6]);
                int iIntValue = (((Integer) pairW2.first).equals(pairW.first) || ((Integer) pairW2.second).equals(pairW.first)) ? ((Integer) pairW.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairW.second).intValue() == -1 || !(((Integer) pairW2.first).equals(pairW.second) || ((Integer) pairW2.second).equals(pairW.second))) ? -1 : ((Integer) pairW.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairW = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairW = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairW;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j6 = Long.parseLong(str);
                    return (j6 < 0 || j6 > 65535) ? j6 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j7 = (long) Double.parseDouble(strArrSplit2[0]);
                long j8 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j7 >= 0 && j8 >= 0) {
                    if (j7 <= 2147483647L && j8 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    public final void A(b bVar, int i6) throws IOException {
        ByteOrder byteOrderC = C(bVar);
        this.f13226g = byteOrderC;
        bVar.f13240t = byteOrderC;
        int unsignedShort = bVar.readUnsignedShort();
        int i7 = this.f13223d;
        if (i7 != 7 && i7 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i8 = bVar.readInt();
        if (i8 < 8 || i8 >= i6) {
            throw new IOException(androidx.camera.camera2.internal.compat.workaround.c.d(i8, "Invalid first Ifd offset: "));
        }
        int i9 = i8 - 8;
        if (i9 > 0 && bVar.skipBytes(i9) != i9) {
            throw new IOException(androidx.camera.camera2.internal.compat.workaround.c.d(i9, "Couldn't jump to first Ifd: "));
        }
    }

    public final void B() {
        int i6 = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.f13224e;
            if (i6 >= mapArr.length) {
                return;
            }
            Log.d("ExifInterface", "The size of tag group[" + i6 + "]: " + mapArr[i6].size());
            for (Map.Entry<String, d> entry : mapArr[i6].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i(this.f13226g) + "'");
            }
            i6++;
        }
    }

    public final void D(int i6, byte[] bArr) throws IOException {
        b bVar = new b(bArr);
        A(bVar, bArr.length);
        E(bVar, i6);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(b bVar, int i6) throws IOException {
        HashMap<String, d>[] mapArr;
        HashSet hashSet;
        boolean z6;
        short s3;
        HashMap<String, d>[] mapArr2;
        long j6;
        long j7;
        boolean z7;
        int i7;
        e eVar;
        int i8;
        int i9;
        HashSet hashSet2;
        int unsignedShort;
        long j8;
        HashSet hashSet3;
        long j9;
        int i10 = i6;
        Integer numValueOf = Integer.valueOf(bVar.f13242v);
        HashSet hashSet4 = this.f13225f;
        hashSet4.add(numValueOf);
        int i11 = bVar.f13242v + 2;
        int i12 = bVar.f13241u;
        if (i11 > i12) {
            return;
        }
        short s4 = bVar.readShort();
        boolean z8 = s;
        if (z8) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + ((int) s4));
        }
        if ((s4 * 12) + bVar.f13242v > i12 || s4 <= 0) {
            return;
        }
        short s6 = 0;
        while (true) {
            mapArr = this.f13224e;
            if (s6 >= s4) {
                break;
            }
            int unsignedShort2 = bVar.readUnsignedShort();
            int unsignedShort3 = bVar.readUnsignedShort();
            int i13 = bVar.readInt();
            long j10 = bVar.f13242v + 4;
            short s7 = s4;
            e eVar2 = Z[i10].get(Integer.valueOf(unsignedShort2));
            if (z8) {
                z6 = z8;
                s3 = s6;
                mapArr2 = mapArr;
                hashSet = hashSet4;
                Log.d("ExifInterface", String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i10), Integer.valueOf(unsignedShort2), eVar2 != null ? eVar2.f13249b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i13)));
            } else {
                hashSet = hashSet4;
                z6 = z8;
                s3 = s6;
                mapArr2 = mapArr;
            }
            if (eVar2 != null) {
                if (unsignedShort3 > 0) {
                    if (unsignedShort3 < S.length) {
                        int i14 = eVar2.f13250c;
                        if (i14 == 7 || unsignedShort3 == 7 || i14 == unsignedShort3 || (i7 = eVar2.f13251d) == unsignedShort3 || (((i14 == 4 || i7 == 4) && unsignedShort3 == 3) || (((i14 == 9 || i7 == 9) && unsignedShort3 == 8) || ((i14 == 12 || i7 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i14;
                            }
                            j6 = j10;
                            j7 = i13 * r6[unsignedShort3];
                            if (j7 < 0 || j7 > 2147483647L) {
                                if (z6) {
                                    Log.d("ExifInterface", "Skip the tag entry since the number of components is invalid: " + i13);
                                }
                                z7 = false;
                                if (z7) {
                                    bVar.a(j6);
                                } else {
                                    long j11 = j6;
                                    if (j7 > 4) {
                                        int i15 = bVar.readInt();
                                        if (z6) {
                                            i8 = unsignedShort2;
                                            Log.d("ExifInterface", "seek to data offset: " + i15);
                                        } else {
                                            i8 = unsignedShort2;
                                        }
                                        if (this.f13223d != 7) {
                                            eVar = eVar2;
                                            i9 = unsignedShort3;
                                            j9 = i15;
                                            if (j9 + j7 <= i12) {
                                                bVar.a(j9);
                                            } else {
                                                if (z6) {
                                                    Log.d("ExifInterface", "Skip the tag entry since data offset is invalid: " + i15);
                                                }
                                                bVar.a(j11);
                                            }
                                        } else {
                                            if ("MakerNote".equals(eVar2.f13249b)) {
                                                this.f13233o = i15;
                                            } else {
                                                if (i10 == 6 && "ThumbnailImage".equals(eVar2.f13249b)) {
                                                    this.f13234p = i15;
                                                    this.f13235q = i13;
                                                    d dVarE = d.e(6, this.f13226g);
                                                    eVar = eVar2;
                                                    d dVarB = d.b(this.f13234p, this.f13226g);
                                                    i9 = unsignedShort3;
                                                    d dVarB2 = d.b(this.f13235q, this.f13226g);
                                                    mapArr2[4].put("Compression", dVarE);
                                                    mapArr2[4].put("JPEGInterchangeFormat", dVarB);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", dVarB2);
                                                }
                                                j9 = i15;
                                                if (j9 + j7 <= i12) {
                                                }
                                            }
                                            eVar = eVar2;
                                            i9 = unsignedShort3;
                                            j9 = i15;
                                            if (j9 + j7 <= i12) {
                                            }
                                        }
                                        s6 = (short) (s3 + 1);
                                        hashSet4 = hashSet2;
                                        s4 = s7;
                                        z8 = z6;
                                        i10 = i6;
                                    } else {
                                        eVar = eVar2;
                                        i8 = unsignedShort2;
                                        i9 = unsignedShort3;
                                    }
                                    Integer num = f13206c0.get(Integer.valueOf(i8));
                                    if (z6) {
                                        Log.d("ExifInterface", "nextIfdType: " + num + " byteCount: " + j7);
                                    }
                                    if (num != null) {
                                        int i16 = i9;
                                        if (i16 != 3) {
                                            if (i16 == 4) {
                                                j8 = bVar.readInt() & 4294967295L;
                                            } else if (i16 == 8) {
                                                unsignedShort = bVar.readShort();
                                            } else if (i16 == 9 || i16 == 13) {
                                                unsignedShort = bVar.readInt();
                                            } else {
                                                j8 = -1;
                                            }
                                            if (z6) {
                                                Log.d("ExifInterface", String.format("Offset: %d, tagName: %s", Long.valueOf(j8), eVar.f13249b));
                                            }
                                            if (j8 > 0 || j8 >= i12) {
                                                hashSet3 = hashSet;
                                                if (z6) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since its offset is invalid: " + j8);
                                                }
                                            } else {
                                                hashSet3 = hashSet;
                                                if (!hashSet3.contains(Integer.valueOf((int) j8))) {
                                                    bVar.a(j8);
                                                    E(bVar, num.intValue());
                                                } else if (z6) {
                                                    Log.d("ExifInterface", "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j8 + ")");
                                                }
                                            }
                                            bVar.a(j11);
                                            hashSet2 = hashSet3;
                                        } else {
                                            unsignedShort = bVar.readUnsignedShort();
                                        }
                                        j8 = unsignedShort;
                                        if (z6) {
                                        }
                                        if (j8 > 0) {
                                            hashSet3 = hashSet;
                                            if (z6) {
                                            }
                                            bVar.a(j11);
                                            hashSet2 = hashSet3;
                                        }
                                    } else {
                                        hashSet2 = hashSet;
                                        int i17 = bVar.f13242v + this.f13232n;
                                        byte[] bArr = new byte[(int) j7];
                                        bVar.readFully(bArr);
                                        d dVar = new d(i9, i13, i17, bArr);
                                        HashMap<String, d> map = mapArr2[i6];
                                        String str = eVar.f13249b;
                                        map.put(str, dVar);
                                        if ("DNGVersion".equals(str)) {
                                            this.f13223d = 3;
                                        }
                                        if ((("Make".equals(str) || "Model".equals(str)) && dVar.i(this.f13226g).contains("PENTAX")) || ("Compression".equals(str) && dVar.h(this.f13226g) == 65535)) {
                                            this.f13223d = 8;
                                        }
                                        if (bVar.f13242v != j11) {
                                            bVar.a(j11);
                                        }
                                    }
                                    s6 = (short) (s3 + 1);
                                    hashSet4 = hashSet2;
                                    s4 = s7;
                                    z8 = z6;
                                    i10 = i6;
                                }
                                hashSet2 = hashSet;
                                s6 = (short) (s3 + 1);
                                hashSet4 = hashSet2;
                                s4 = s7;
                                z8 = z6;
                                i10 = i6;
                            } else {
                                z7 = true;
                                if (z7) {
                                }
                                hashSet2 = hashSet;
                                s6 = (short) (s3 + 1);
                                hashSet4 = hashSet2;
                                s4 = s7;
                                z8 = z6;
                                i10 = i6;
                            }
                        } else if (z6) {
                            Log.d("ExifInterface", "Skip the tag entry since data format (" + R[unsignedShort3] + ") is unexpected for tag: " + eVar2.f13249b);
                        }
                    }
                }
                j6 = j10;
                if (z6) {
                    Log.d("ExifInterface", "Skip the tag entry since data format is invalid: " + unsignedShort3);
                }
                j7 = 0;
                z7 = false;
                if (z7) {
                }
                hashSet2 = hashSet;
                s6 = (short) (s3 + 1);
                hashSet4 = hashSet2;
                s4 = s7;
                z8 = z6;
                i10 = i6;
            } else if (z6) {
                Log.d("ExifInterface", "Skip the tag entry since tag number is not defined: " + unsignedShort2);
            }
            j6 = j10;
            j7 = 0;
            z7 = false;
            if (z7) {
            }
            hashSet2 = hashSet;
            s6 = (short) (s3 + 1);
            hashSet4 = hashSet2;
            s4 = s7;
            z8 = z6;
            i10 = i6;
        }
        HashSet hashSet5 = hashSet4;
        boolean z9 = z8;
        if (bVar.f13242v + 4 <= i12) {
            int i18 = bVar.readInt();
            if (z9) {
                Log.d("ExifInterface", String.format("nextIfdOffset: %d", Integer.valueOf(i18)));
            }
            long j12 = i18;
            if (j12 <= 0 || i18 >= i12) {
                if (z9) {
                    Log.d("ExifInterface", "Stop reading file since a wrong offset may cause an infinite loop: " + i18);
                    return;
                }
                return;
            }
            if (hashSet5.contains(Integer.valueOf(i18))) {
                if (z9) {
                    Log.d("ExifInterface", "Stop reading file since re-reading an IFD may cause an infinite loop: " + i18);
                    return;
                }
                return;
            }
            bVar.a(j12);
            if (mapArr[4].isEmpty()) {
                E(bVar, 4);
            } else if (mapArr[5].isEmpty()) {
                E(bVar, 5);
            }
        }
    }

    public final void F(String str) {
        for (int i6 = 0; i6 < V.length; i6++) {
            this.f13224e[i6].remove(str);
        }
    }

    public final void G(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (s) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (dataInputStream.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-1);
        if (dataInputStream.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.a(-40);
        String strJ = j("Xmp");
        HashMap<String, d>[] mapArr = this.f13224e;
        d dVarRemove = (strJ == null || !this.f13236r) ? null : mapArr[0].remove("Xmp");
        cVar.a(-1);
        cVar.a(-31);
        O(cVar);
        if (dVarRemove != null) {
            mapArr[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (dataInputStream.readByte() == -1) {
            byte b7 = dataInputStream.readByte();
            if (b7 == -39 || b7 == -38) {
                cVar.a(-1);
                cVar.a(b7);
                h(dataInputStream, cVar);
                return;
            }
            if (b7 != -31) {
                cVar.a(-1);
                cVar.a(b7);
                int unsignedShort = dataInputStream.readUnsignedShort();
                cVar.c((short) unsignedShort);
                int i6 = unsignedShort - 2;
                if (i6 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i6 > 0) {
                    int i7 = dataInputStream.read(bArr, 0, Math.min(i6, 4096));
                    if (i7 >= 0) {
                        cVar.write(bArr, 0, i7);
                        i6 -= i7;
                    }
                }
            } else {
                int unsignedShort2 = dataInputStream.readUnsignedShort();
                int i8 = unsignedShort2 - 2;
                if (i8 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i8 >= 6) {
                    if (dataInputStream.read(bArr2) != 6) {
                        throw new IOException("Invalid exif");
                    }
                    if (Arrays.equals(bArr2, f13208e0)) {
                        int i9 = unsignedShort2 - 8;
                        if (dataInputStream.skipBytes(i9) != i9) {
                            throw new IOException("Invalid length");
                        }
                    }
                }
                cVar.a(-1);
                cVar.a(b7);
                cVar.c((short) unsignedShort2);
                if (i8 >= 6) {
                    i8 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i8 > 0) {
                    int i10 = dataInputStream.read(bArr, 0, Math.min(i8, 4096));
                    if (i10 >= 0) {
                        cVar.write(bArr, 0, i10);
                        i8 -= i10;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    public final void H(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (s) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        g(dataInputStream, cVar, D.length);
        if (this.f13232n == 0) {
            int i6 = dataInputStream.readInt();
            cVar.b(i6);
            g(dataInputStream, cVar, i6 + 8);
        } else {
            g(dataInputStream, cVar, (r2 - r7.length) - 8);
            dataInputStream.skipBytes(dataInputStream.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                O(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.s).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.b((int) crc32.getValue());
                c(byteArrayOutputStream2);
                h(dataInputStream, cVar);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5, types: [java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    public final void I(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ?? r17;
        c cVar;
        if (s) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        b bVar = new b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr = H;
        g(bVar, cVar2, bArr.length);
        byte[] bArr2 = I;
        bVar.skipBytes(bArr2.length + 4);
        b bVar2 = null;
        try {
            try {
                ?? byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream, byteOrder);
                    int i11 = this.f13232n;
                    try {
                        try {
                            if (i11 != 0) {
                                g(bVar, cVar3, (i11 - ((bArr.length + 4) + bArr2.length)) - 8);
                                bVar.skipBytes(4);
                                bVar.skipBytes(bVar.readInt());
                                O(cVar3);
                            } else {
                                byte[] bArr3 = new byte[4];
                                if (bVar.read(bArr3) != 4) {
                                    throw new IOException("Encountered invalid length while parsing WebP chunk type");
                                }
                                byte[] bArr4 = L;
                                boolean zEquals = Arrays.equals(bArr3, bArr4);
                                byte[] bArr5 = N;
                                byte[] bArr6 = M;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr3, bArr5) || Arrays.equals(bArr3, bArr6)) {
                                        int i12 = bVar.readInt();
                                        int i13 = i12 % 2 == 1 ? i12 + 1 : i12;
                                        byte[] bArr7 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr3, bArr5);
                                        byte[] bArr8 = K;
                                        if (zEquals2) {
                                            bVar.read(bArr7);
                                            byte[] bArr9 = new byte[3];
                                            int i14 = i13;
                                            if (bVar.read(bArr9) != 3 || !Arrays.equals(bArr8, bArr9)) {
                                                throw new IOException("Encountered error while checking VP8 signature");
                                            }
                                            i7 = bVar.readInt();
                                            i8 = (i7 << 18) >> 18;
                                            i6 = i14 - 10;
                                            i9 = (i7 << 2) >> 18;
                                            i10 = 0;
                                        } else {
                                            int i15 = i13;
                                            if (!Arrays.equals(bArr3, bArr6)) {
                                                i6 = i15;
                                                i7 = 0;
                                                i8 = 0;
                                                i9 = 0;
                                                i10 = 0;
                                            } else {
                                                if (bVar.readByte() != 47) {
                                                    throw new IOException("Encountered error while checking VP8L signature");
                                                }
                                                i7 = bVar.readInt();
                                                i10 = i7 & 8;
                                                i8 = ((i7 << 18) >> 18) + 1;
                                                i6 = i15 - 5;
                                                i9 = ((i7 << 4) >> 18) + 1;
                                            }
                                        }
                                        cVar3.write(bArr4);
                                        cVar3.b(10);
                                        byte[] bArr10 = new byte[10];
                                        int i16 = i8;
                                        byte b7 = (byte) (bArr10[0] | 8);
                                        bArr10[0] = b7;
                                        bArr10[0] = (byte) (b7 | (i10 << 4));
                                        int i17 = i16 - 1;
                                        r17 = byteArrayOutputStream;
                                        int i18 = i9 - 1;
                                        cVar = cVar2;
                                        try {
                                            bArr10[4] = (byte) i17;
                                            bArr10[5] = (byte) (i17 >> 8);
                                            bArr10[6] = (byte) (i17 >> 16);
                                            bArr10[7] = (byte) i18;
                                            bArr10[8] = (byte) (i18 >> 8);
                                            bArr10[9] = (byte) (i18 >> 16);
                                            cVar3.write(bArr10);
                                            cVar3.write(bArr3);
                                            cVar3.b(i12);
                                        } catch (Exception e6) {
                                            e = e6;
                                            bVar = r17;
                                            bVar2 = bVar;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th) {
                                            th = th;
                                            bVar = r17;
                                            bVar2 = bVar;
                                            c(bVar2);
                                            throw th;
                                        }
                                        try {
                                            if (Arrays.equals(bArr3, bArr5)) {
                                                cVar3.write(bArr7);
                                                cVar3.write(bArr8);
                                                cVar3.b(i7);
                                            } else {
                                                if (Arrays.equals(bArr3, bArr6)) {
                                                    cVar3.write(47);
                                                    cVar3.b(i7);
                                                }
                                                g(bVar, cVar3, i6);
                                                O(cVar3);
                                                r17 = r17;
                                            }
                                            g(bVar, cVar3, i6);
                                            O(cVar3);
                                            r17 = r17;
                                        } catch (Exception e7) {
                                            e = e7;
                                            bVar2 = r17;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            bVar2 = r17;
                                            c(bVar2);
                                            throw th;
                                        }
                                    }
                                    h(bVar, cVar3);
                                    c cVar4 = cVar;
                                    cVar4.b(r17.size() + bArr2.length);
                                    cVar4.write(bArr2);
                                    ByteArrayOutputStream byteArrayOutputStream2 = r17;
                                    byteArrayOutputStream2.writeTo(cVar4);
                                    c(byteArrayOutputStream2);
                                }
                                int i19 = bVar.readInt();
                                byte[] bArr11 = new byte[i19 % 2 == 1 ? i19 + 1 : i19];
                                bVar.read(bArr11);
                                byte b8 = (byte) (bArr11[0] | 8);
                                bArr11[0] = b8;
                                boolean z6 = ((b8 >> 1) & 1) == 1;
                                cVar3.write(bArr4);
                                cVar3.b(i19);
                                cVar3.write(bArr11);
                                if (z6) {
                                    i(bVar, cVar3, O, null);
                                    while (true) {
                                        byte[] bArr12 = new byte[4];
                                        bufferedInputStream.read(bArr12);
                                        if (!Arrays.equals(bArr12, P)) {
                                            break;
                                        }
                                        int i20 = bVar.readInt();
                                        cVar3.write(bArr12);
                                        cVar3.b(i20);
                                        if (i20 % 2 == 1) {
                                            i20++;
                                        }
                                        g(bVar, cVar3, i20);
                                    }
                                    O(cVar3);
                                } else {
                                    i(bVar, cVar3, bArr5, bArr6);
                                    O(cVar3);
                                }
                            }
                            cVar = cVar2;
                            r17 = byteArrayOutputStream;
                            h(bVar, cVar3);
                            c cVar42 = cVar;
                            cVar42.b(r17.size() + bArr2.length);
                            cVar42.write(bArr2);
                            ByteArrayOutputStream byteArrayOutputStream22 = r17;
                            byteArrayOutputStream22.writeTo(cVar42);
                            c(byteArrayOutputStream22);
                        } catch (Exception e8) {
                            e = e8;
                            bVar2 = byteArrayOutputStream;
                        } catch (Throwable th3) {
                            th = th3;
                            bVar2 = byteArrayOutputStream;
                        }
                    } catch (Exception e9) {
                        e = e9;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } catch (Exception e10) {
                    e = e10;
                    bVar = byteArrayOutputStream;
                } catch (Throwable th5) {
                    th = th5;
                    bVar = byteArrayOutputStream;
                }
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(String str, String str2) {
        e eVar;
        int i6;
        int i7;
        d dVar;
        int i8;
        boolean z6;
        String str3 = str;
        String strReplaceAll = str2;
        if (("DateTime".equals(str3) || "DateTimeOriginal".equals(str3) || "DateTimeDigitized".equals(str3)) && strReplaceAll != null) {
            boolean zFind = f13211h0.matcher(strReplaceAll).find();
            boolean zFind2 = f13212i0.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        boolean zEquals = "ISOSpeedRatings".equals(str3);
        boolean z7 = s;
        if (zEquals) {
            if (z7) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str3 = "PhotographicSensitivity";
        }
        int i9 = 2;
        int i10 = 1;
        if (strReplaceAll != null && f13205b0.contains(str3)) {
            if (str3.equals("GPSTimeStamp")) {
                Matcher matcher = f13210g0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str3 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i11 = 0;
        while (i11 < V.length) {
            if ((i11 != 4 || this.h) && (eVar = f13204a0[i11].get(str3)) != null) {
                int i12 = eVar.f13251d;
                int i13 = eVar.f13250c;
                HashMap<String, d>[] mapArr = this.f13224e;
                if (strReplaceAll == null) {
                    mapArr[i11].remove(str3);
                } else {
                    Pair<Integer, Integer> pairW = w(strReplaceAll);
                    int i14 = -1;
                    if (i13 == ((Integer) pairW.first).intValue() || i13 == ((Integer) pairW.second).intValue()) {
                        i12 = i13;
                        int[] iArr = S;
                        switch (i12) {
                            case 1:
                                i6 = i11;
                                HashMap<String, d> map = mapArr[i6];
                                i7 = i10;
                                if (strReplaceAll.length() != i7 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                    byte[] bytes = strReplaceAll.getBytes(f13207d0);
                                    dVar = new d(i7, bytes.length, bytes);
                                } else {
                                    byte[] bArr = new byte[i7];
                                    bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                    dVar = new d(i7, i7, bArr);
                                }
                                map.put(str3, dVar);
                                break;
                            case 2:
                            case 7:
                                i6 = i11;
                                i8 = i10;
                                z6 = false;
                                mapArr[i6].put(str3, d.a(strReplaceAll));
                                i7 = i8;
                                break;
                            case 3:
                                i6 = i11;
                                i8 = i10;
                                z6 = false;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit.length];
                                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                                    iArr2[i15] = Integer.parseInt(strArrSplit[i15]);
                                }
                                mapArr[i6].put(str3, d.f(iArr2, this.f13226g));
                                i7 = i8;
                                break;
                            case 4:
                                i6 = i11;
                                i8 = i10;
                                z6 = false;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i16 = 0; i16 < strArrSplit2.length; i16++) {
                                    jArr[i16] = Long.parseLong(strArrSplit2[i16]);
                                }
                                mapArr[i6].put(str3, d.c(jArr, this.f13226g));
                                i7 = i8;
                                break;
                            case 5:
                                i6 = i11;
                                i8 = i10;
                                int i17 = -1;
                                z6 = false;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                f[] fVarArr = new f[strArrSplit3.length];
                                int i18 = 0;
                                while (i18 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i18].split("/", i17);
                                    fVarArr[i18] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i8]));
                                    i18++;
                                    i17 = -1;
                                }
                                mapArr[i6].put(str3, d.d(fVarArr, this.f13226g));
                                i7 = i8;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z7) {
                                    Log.d("ExifInterface", "Data format isn't one of expected formats: " + i12);
                                    break;
                                }
                                break;
                            case 9:
                                i6 = i11;
                                i8 = i10;
                                z6 = false;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int length = strArrSplit5.length;
                                int[] iArr3 = new int[length];
                                for (int i19 = 0; i19 < strArrSplit5.length; i19++) {
                                    iArr3[i19] = Integer.parseInt(strArrSplit5[i19]);
                                }
                                HashMap<String, d> map2 = mapArr[i6];
                                ByteOrder byteOrder = this.f13226g;
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (int i20 = 0; i20 < length; i20++) {
                                    byteBufferWrap.putInt(iArr3[i20]);
                                }
                                map2.put(str3, new d(9, length, byteBufferWrap.array()));
                                i7 = i8;
                                break;
                            case 10:
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                int length2 = strArrSplit6.length;
                                f[] fVarArr2 = new f[length2];
                                z6 = false;
                                int i21 = 0;
                                while (i21 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i21].split("/", i14);
                                    int i22 = i10;
                                    int i23 = i21;
                                    fVarArr2[i23] = new f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i22]));
                                    i21 = i23 + 1;
                                    i10 = i22;
                                    i11 = i11;
                                    i14 = -1;
                                }
                                i6 = i11;
                                i8 = i10;
                                HashMap<String, d> map3 = mapArr[i6];
                                ByteOrder byteOrder2 = this.f13226g;
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                for (int i24 = 0; i24 < length2; i24++) {
                                    f fVar = fVarArr2[i24];
                                    byteBufferWrap2.putInt((int) fVar.f13252a);
                                    byteBufferWrap2.putInt((int) fVar.f13253b);
                                }
                                map3.put(str3, new d(10, length2, byteBufferWrap2.array()));
                                i7 = i8;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                int length3 = strArrSplit8.length;
                                double[] dArr = new double[length3];
                                for (int i25 = 0; i25 < strArrSplit8.length; i25++) {
                                    dArr[i25] = Double.parseDouble(strArrSplit8[i25]);
                                }
                                HashMap<String, d> map4 = mapArr[i11];
                                ByteOrder byteOrder3 = this.f13226g;
                                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                for (int i26 = 0; i26 < length3; i26++) {
                                    byteBufferWrap3.putDouble(dArr[i26]);
                                }
                                map4.put(str3, new d(12, length3, byteBufferWrap3.array()));
                                break;
                        }
                    } else if (i12 == -1 || !(i12 == ((Integer) pairW.first).intValue() || i12 == ((Integer) pairW.second).intValue())) {
                        if (i13 != i10 && i13 != 7 && i13 != i9) {
                            if (z7) {
                                StringBuilder sb = new StringBuilder("Given tag (");
                                sb.append(str3);
                                sb.append(") value didn't match with one of expected formats: ");
                                String[] strArr = R;
                                sb.append(strArr[i13]);
                                String str4 = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
                                sb.append(i12 == -1 ? RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED : ", " + strArr[i12]);
                                sb.append(" (guess: ");
                                sb.append(strArr[((Integer) pairW.first).intValue()]);
                                if (((Integer) pairW.second).intValue() != -1) {
                                    str4 = ", " + strArr[((Integer) pairW.second).intValue()];
                                }
                                sb.append(str4);
                                sb.append(")");
                                Log.d("ExifInterface", sb.toString());
                            }
                        }
                        i12 = i13;
                        int[] iArr4 = S;
                        switch (i12) {
                        }
                    } else {
                        int[] iArr42 = S;
                        switch (i12) {
                        }
                    }
                }
                i6 = i11;
                i7 = i10;
            } else {
                i6 = i11;
                i7 = i10;
            }
            i10 = i7;
            i11 = i6 + 1;
            i9 = 2;
        }
    }

    public final void K(b bVar) throws Throwable {
        d dVar;
        int iH;
        HashMap<String, d> map = this.f13224e[4];
        d dVar2 = map.get("Compression");
        if (dVar2 == null) {
            this.f13231m = 6;
            x(bVar, map);
            return;
        }
        int iH2 = dVar2.h(this.f13226g);
        this.f13231m = iH2;
        if (iH2 != 1) {
            if (iH2 == 6) {
                x(bVar, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        d dVar3 = map.get("BitsPerSample");
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f13226g);
            int[] iArr2 = f13215v;
            if (Arrays.equals(iArr2, iArr) || (this.f13223d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((iH = dVar.h(this.f13226g)) == 1 && Arrays.equals(iArr, f13216w)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = map.get("StripOffsets");
                d dVar5 = map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrF = f(dVar4.j(this.f13226g));
                long[] jArrF2 = f(dVar5.j(this.f13226g));
                if (jArrF == null || jArrF.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrF2 == null || jArrF2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrF.length != jArrF2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j6 = 0;
                for (long j7 : jArrF2) {
                    j6 += j7;
                }
                int i6 = (int) j6;
                byte[] bArr = new byte[i6];
                this.f13227i = true;
                this.h = true;
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < jArrF.length; i9++) {
                    int i10 = (int) jArrF[i9];
                    int i11 = (int) jArrF2[i9];
                    if (i9 < jArrF.length - 1 && i10 + i11 != jArrF[i9 + 1]) {
                        this.f13227i = false;
                    }
                    int i12 = i10 - i7;
                    if (i12 < 0) {
                        Log.d("ExifInterface", "Invalid strip offset value");
                        return;
                    }
                    long j8 = i12;
                    if (bVar.skip(j8) != j8) {
                        Log.d("ExifInterface", "Failed to skip " + i12 + " bytes.");
                        return;
                    }
                    int i13 = i7 + i12;
                    byte[] bArr2 = new byte[i11];
                    if (bVar.read(bArr2) != i11) {
                        Log.d("ExifInterface", "Failed to read " + i11 + " bytes.");
                        return;
                    }
                    i7 = i13 + i11;
                    System.arraycopy(bArr2, 0, bArr, i8, i11);
                    i8 += i11;
                }
                this.f13230l = bArr;
                if (this.f13227i) {
                    this.f13228j = (int) jArrF[0];
                    this.f13229k = i6;
                    return;
                }
                return;
            }
        }
        if (s) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void L(int i6, int i7) throws Throwable {
        HashMap<String, d>[] mapArr = this.f13224e;
        boolean zIsEmpty = mapArr[i6].isEmpty();
        boolean z6 = s;
        if (zIsEmpty || mapArr[i7].isEmpty()) {
            if (z6) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = mapArr[i6].get("ImageLength");
        d dVar2 = mapArr[i6].get("ImageWidth");
        d dVar3 = mapArr[i7].get("ImageLength");
        d dVar4 = mapArr[i7].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z6) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z6) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = dVar.h(this.f13226g);
        int iH2 = dVar2.h(this.f13226g);
        int iH3 = dVar3.h(this.f13226g);
        int iH4 = dVar4.h(this.f13226g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap<String, d> map = mapArr[i6];
        mapArr[i6] = mapArr[i7];
        mapArr[i7] = map;
    }

    public final void M(b bVar, int i6) throws Throwable {
        d dVarE;
        d dVarE2;
        HashMap<String, d>[] mapArr = this.f13224e;
        d dVar = mapArr[i6].get("DefaultCropSize");
        d dVar2 = mapArr[i6].get("SensorTopBorder");
        d dVar3 = mapArr[i6].get("SensorLeftBorder");
        d dVar4 = mapArr[i6].get("SensorBottomBorder");
        d dVar5 = mapArr[i6].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f13244a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f13226g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarE = d.d(new f[]{fVarArr[0]}, this.f13226g);
                    dVarE2 = d.d(new f[]{fVarArr[1]}, this.f13226g);
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f13226g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarE = d.e(iArr[0], this.f13226g);
                dVarE2 = d.e(iArr[1], this.f13226g);
            }
            mapArr[i6].put("ImageWidth", dVarE);
            mapArr[i6].put("ImageLength", dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH = dVar2.h(this.f13226g);
            int iH2 = dVar4.h(this.f13226g);
            int iH3 = dVar5.h(this.f13226g);
            int iH4 = dVar3.h(this.f13226g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            d dVarE3 = d.e(iH2 - iH, this.f13226g);
            d dVarE4 = d.e(iH3 - iH4, this.f13226g);
            mapArr[i6].put("ImageLength", dVarE3);
            mapArr[i6].put("ImageWidth", dVarE4);
            return;
        }
        d dVar6 = mapArr[i6].get("ImageLength");
        d dVar7 = mapArr[i6].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i6].get("JPEGInterchangeFormat");
            d dVar9 = mapArr[i6].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH5 = dVar8.h(this.f13226g);
            int iH6 = dVar8.h(this.f13226g);
            bVar.a(iH5);
            byte[] bArr = new byte[iH6];
            bVar.read(bArr);
            n(new b(bArr), iH5, i6);
        }
    }

    public final void N() throws Throwable {
        L(0, 5);
        L(0, 4);
        L(5, 4);
        HashMap<String, d>[] mapArr = this.f13224e;
        d dVar = mapArr[1].get("PixelXDimension");
        d dVar2 = mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && y(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (y(mapArr[4])) {
            return;
        }
        Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
    }

    public final void O(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        char c7;
        char c8;
        int[] iArr;
        e[][] eVarArr = V;
        int[] iArr2 = new int[eVarArr.length];
        int[] iArr3 = new int[eVarArr.length];
        e[] eVarArr2 = W;
        for (e eVar : eVarArr2) {
            F(eVar.f13249b);
        }
        e eVar2 = X;
        String str = eVar2.f13249b;
        String str2 = eVar2.f13249b;
        F(str);
        e eVar3 = Y;
        F(eVar3.f13249b);
        int i6 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f13224e;
            if (i6 >= length) {
                break;
            }
            for (Object obj : mapArr[i6].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    mapArr[i6].remove(entry.getKey());
                }
            }
            i6++;
        }
        int i7 = 1;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].f13249b, d.b(0L, this.f13226g));
        }
        if (mapArr[2].isEmpty()) {
            c7 = 2;
        } else {
            c7 = 2;
            mapArr[0].put(eVarArr2[2].f13249b, d.b(0L, this.f13226g));
        }
        if (mapArr[3].isEmpty()) {
            c8 = 3;
        } else {
            c8 = 3;
            mapArr[1].put(eVarArr2[3].f13249b, d.b(0L, this.f13226g));
        }
        if (this.h) {
            mapArr[4].put(str2, d.b(0L, this.f13226g));
            mapArr[4].put(eVar3.f13249b, d.b(this.f13229k, this.f13226g));
        }
        int i8 = 0;
        while (true) {
            int length2 = eVarArr.length;
            iArr = S;
            if (i8 >= length2) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i8].entrySet().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                d value = it.next().getValue();
                value.getClass();
                int i10 = i7;
                int i11 = iArr[value.f13244a] * value.f13245b;
                if (i11 > 4) {
                    i9 += i11;
                }
                i7 = i10;
            }
            iArr3[i8] = iArr3[i8] + i9;
            i8++;
            i7 = i7;
        }
        int i12 = i7;
        int size = 8;
        for (int i13 = 0; i13 < eVarArr.length; i13++) {
            if (!mapArr[i13].isEmpty()) {
                iArr2[i13] = size;
                size = (mapArr[i13].size() * 12) + 6 + iArr3[i13] + size;
            }
        }
        if (this.h) {
            mapArr[4].put(str2, d.b(size, this.f13226g));
            this.f13228j = size;
            size += this.f13229k;
        }
        if (this.f13223d == 4) {
            size += 8;
        }
        if (s) {
            for (int i14 = 0; i14 < eVarArr.length; i14++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i14), Integer.valueOf(iArr2[i14]), Integer.valueOf(mapArr[i14].size()), Integer.valueOf(iArr3[i14]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i12].isEmpty()) {
            mapArr[0].put(eVarArr2[i12].f13249b, d.b(iArr2[i12], this.f13226g));
        }
        if (!mapArr[c7].isEmpty()) {
            mapArr[0].put(eVarArr2[c7].f13249b, d.b(iArr2[c7], this.f13226g));
        }
        if (!mapArr[c8].isEmpty()) {
            mapArr[i12].put(eVarArr2[c8].f13249b, d.b(iArr2[c8], this.f13226g));
        }
        int i15 = this.f13223d;
        if (i15 == 4) {
            cVar.c((short) size);
            cVar.write(f13208e0);
        } else if (i15 == 13) {
            cVar.b(size);
            cVar.write(E);
        } else if (i15 == 14) {
            cVar.write(J);
            cVar.b(size);
        }
        cVar.c(this.f13226g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f13243t = this.f13226g;
        cVar.c((short) 42);
        cVar.b((int) 8);
        for (int i16 = 0; i16 < eVarArr.length; i16++) {
            if (!mapArr[i16].isEmpty()) {
                cVar.c((short) mapArr[i16].size());
                int size2 = (mapArr[i16].size() * 12) + iArr2[i16] + 2 + 4;
                for (Map.Entry<String, d> entry2 : mapArr[i16].entrySet()) {
                    int i17 = f13204a0[i16].get(entry2.getKey()).f13248a;
                    d value2 = entry2.getValue();
                    value2.getClass();
                    int i18 = value2.f13245b;
                    int i19 = value2.f13244a;
                    int i20 = iArr[i19] * i18;
                    cVar.c((short) i17);
                    cVar.c((short) i19);
                    cVar.b(i18);
                    if (i20 > 4) {
                        cVar.b(size2);
                        size2 += i20;
                    } else {
                        cVar.write(value2.f13247d);
                        if (i20 < 4) {
                            while (i20 < 4) {
                                cVar.a(0);
                                i20++;
                            }
                        }
                    }
                }
                if (i16 != 0 || mapArr[4].isEmpty()) {
                    cVar.b((int) 0);
                } else {
                    cVar.b(iArr2[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = mapArr[i16].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f13247d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.h) {
            cVar.write(u());
        }
        if (this.f13223d == 14 && size % 2 == i12) {
            cVar.a(0);
        }
        cVar.f13243t = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strJ = j("DateTimeOriginal");
        HashMap<String, d>[] mapArr = this.f13224e;
        if (strJ != null && j("DateTime") == null) {
            mapArr[0].put("DateTime", d.a(strJ));
        }
        if (j("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.b(0L, this.f13226g));
        }
        if (j("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.b(0L, this.f13226g));
        }
        if (j("Orientation") == null) {
            mapArr[0].put("Orientation", d.b(0L, this.f13226g));
        }
        if (j("LightSource") == null) {
            mapArr[1].put("LightSource", d.b(0L, this.f13226g));
        }
    }

    public final String j(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarL = l(str);
        if (dVarL != null) {
            int i6 = dVarL.f13244a;
            if (!f13205b0.contains(str)) {
                return dVarL.i(this.f13226g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i6 != 5 && i6 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i6);
                    return null;
                }
                f[] fVarArr = (f[]) dVarL.j(this.f13226g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f13252a / fVar.f13253b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f13252a / fVar2.f13253b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f13252a / fVar3.f13253b)));
            }
            try {
                return Double.toString(dVarL.g(this.f13226g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final int k(int i6, String str) {
        d dVarL = l(str);
        if (dVarL == null) {
            return i6;
        }
        try {
            return dVarL.h(this.f13226g);
        } catch (NumberFormatException unused) {
            return i6;
        }
    }

    public final d l(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (s) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i6 = 0; i6 < V.length; i6++) {
            d dVar = this.f13224e[i6].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void m(b bVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(new C0063a(bVar));
            String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
            String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
            String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
            String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
            if ("yes".equals(strExtractMetadata6)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
            } else if ("yes".equals(strExtractMetadata7)) {
                strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
            } else {
                strExtractMetadata = null;
                strExtractMetadata2 = null;
                strExtractMetadata3 = null;
            }
            HashMap<String, d>[] mapArr = this.f13224e;
            if (strExtractMetadata != null) {
                mapArr[0].put("ImageWidth", d.e(Integer.parseInt(strExtractMetadata), this.f13226g));
            }
            if (strExtractMetadata2 != null) {
                mapArr[0].put("ImageLength", d.e(Integer.parseInt(strExtractMetadata2), this.f13226g));
            }
            if (strExtractMetadata3 != null) {
                int i6 = Integer.parseInt(strExtractMetadata3);
                mapArr[0].put("Orientation", d.e(i6 != 90 ? i6 != 180 ? i6 != 270 ? 1 : 8 : 3 : 6, this.f13226g));
            }
            if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                int i7 = Integer.parseInt(strExtractMetadata4);
                int i8 = Integer.parseInt(strExtractMetadata5);
                if (i8 <= 6) {
                    throw new IOException("Invalid exif length");
                }
                bVar.a(i7);
                byte[] bArr = new byte[6];
                if (bVar.read(bArr) != 6) {
                    throw new IOException("Can't read identifier");
                }
                int i9 = i7 + 6;
                int i10 = i8 - 6;
                if (!Arrays.equals(bArr, f13208e0)) {
                    throw new IOException("Invalid identifier");
                }
                byte[] bArr2 = new byte[i10];
                if (bVar.read(bArr2) != i10) {
                    throw new IOException("Can't read exif");
                }
                this.f13232n = i9;
                D(0, bArr2);
            }
            if (s) {
                Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
            }
            mediaMetadataRetriever.release();
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x01af, code lost:
    
        r24.f13240t = r23.f13226g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x01b3, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(b bVar, int i6, int i7) throws Throwable {
        int i8;
        boolean z6 = s;
        if (z6) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + bVar);
        }
        int i9 = 0;
        bVar.mark(0);
        bVar.f13240t = ByteOrder.BIG_ENDIAN;
        byte b7 = bVar.readByte();
        byte b8 = -1;
        if (b7 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b7 & 255));
        }
        if (bVar.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b7 & 255));
        }
        int i10 = 2;
        while (true) {
            byte b9 = bVar.readByte();
            if (b9 != b8) {
                throw new IOException("Invalid marker:" + Integer.toHexString(b9 & 255));
            }
            byte b10 = bVar.readByte();
            if (z6) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(b10 & 255));
            }
            if (b10 != -39 && b10 != -38) {
                int unsignedShort = bVar.readUnsignedShort();
                int i11 = unsignedShort - 2;
                int i12 = i10 + 4;
                if (z6) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(b10 & 255) + " (length: " + unsignedShort + ")");
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap<String, d>[] mapArr = this.f13224e;
                if (b10 == -31) {
                    byte[] bArr = new byte[i11];
                    bVar.readFully(bArr);
                    int i13 = i12 + i11;
                    byte[] bArr2 = f13208e0;
                    if (bArr2 != null && i11 >= bArr2.length) {
                        int i14 = i9;
                        i8 = i14;
                        while (i14 < bArr2.length) {
                            if (bArr[i14] == bArr2[i14]) {
                                i14++;
                            }
                        }
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i11);
                        this.f13232n = i6 + i12 + bArr2.length;
                        D(i7, bArrCopyOfRange);
                        K(new b(bArrCopyOfRange));
                        i12 = i13;
                        i11 = i8;
                    } else {
                        i8 = i9;
                    }
                    byte[] bArr3 = f13209f0;
                    if (bArr3 != null && i11 >= bArr3.length) {
                        int i15 = i8;
                        while (true) {
                            if (i15 >= bArr3.length) {
                                int length = i12 + bArr3.length;
                                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i11);
                                if (j("Xmp") == null) {
                                    mapArr[i8].put("Xmp", new d(1, bArrCopyOfRange2.length, length, bArrCopyOfRange2));
                                    this.f13236r = true;
                                }
                            } else if (bArr[i15] == bArr3[i15]) {
                                i15++;
                            }
                        }
                    }
                    i12 = i13;
                    i11 = i8;
                } else if (b10 != -2) {
                    switch (b10) {
                        default:
                            switch (b10) {
                                default:
                                    switch (b10) {
                                        default:
                                            switch (b10) {
                                            }
                                        case -55:
                                        case -54:
                                        case -53:
                                            if (bVar.skipBytes(1) != 1) {
                                                throw new IOException("Invalid SOFx");
                                            }
                                            mapArr[i7].put("ImageLength", d.b(bVar.readUnsignedShort(), this.f13226g));
                                            mapArr[i7].put("ImageWidth", d.b(bVar.readUnsignedShort(), this.f13226g));
                                            i11 = unsignedShort - 7;
                                            break;
                                    }
                                case -59:
                                case -58:
                                case -57:
                                    break;
                            }
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                    }
                    i8 = i9;
                } else {
                    byte[] bArr4 = new byte[i11];
                    if (bVar.read(bArr4) != i11) {
                        throw new IOException("Invalid exif");
                    }
                    if (j("UserComment") == null) {
                        mapArr[1].put("UserComment", d.a(new String(bArr4, f13207d0)));
                    }
                    i11 = i9;
                    i8 = i11;
                }
                if (i11 < 0) {
                    throw new IOException("Invalid length");
                }
                if (bVar.skipBytes(i11) != i11) {
                    throw new IOException("Invalid JPEG segment");
                }
                i10 = i12 + i11;
                i9 = i8;
                b8 = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:167|12|158|13|150|14|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(3:152|35|(4:41|(3:44|(1:46)(2:47|(1:49))|(1:179)(3:176|52|53))(2:43|177)|54|36))|34|162|66|160|67|68|(1:74)(1:73)|75|(1:88)(8:156|90|154|91|92|(1:94)(1:95)|96|(1:110)(3:112|(2:113|(2:115|(2:169|117)(1:118))(2:168|119))|(1:121)(4:123|(2:124|(2:126|(1:171)(1:129))(3:170|130|(2:131|(1:172)(2:133|(1:173)(1:136)))))|128|(1:138)(1:140)))))|16|162|66|160|67|68|(3:70|74|75)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f5, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f8, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00fa, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fc, code lost:
    
        if (r5 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fe, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0101, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0102, code lost:
    
        if (r2 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0104, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x010d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010b A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int o(BufferedInputStream bufferedInputStream) throws Throwable {
        b bVar;
        int i6;
        b bVar2;
        int i7;
        b bVar3;
        b bVar4;
        int i8;
        int i9;
        long j6;
        byte[] bArr;
        long j7;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i10 = 0;
        while (true) {
            byte[] bArr3 = f13217x;
            if (i10 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i10] != bArr3[i10]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i11 = 0; i11 < bytes.length; i11++) {
                    if (bArr2[i11] != bytes[i11]) {
                        int i12 = 1;
                        try {
                            bVar2 = new b(bArr2);
                            try {
                                try {
                                    j6 = bVar2.readInt();
                                    bArr = new byte[4];
                                    bVar2.read(bArr);
                                } catch (Exception e6) {
                                    e = e6;
                                    i6 = 0;
                                }
                            } catch (Throwable th) {
                                th = th;
                                bVar = bVar2;
                                if (bVar != null) {
                                    bVar.close();
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            i6 = 0;
                            bVar2 = null;
                        } catch (Throwable th2) {
                            th = th2;
                            bVar = null;
                        }
                        if (Arrays.equals(bArr, f13218y)) {
                            if (j6 == 1) {
                                j6 = bVar2.readLong();
                                j7 = 16;
                            } else {
                                j7 = 8;
                            }
                            i6 = 0;
                            long j8 = 5000;
                            if (j6 > j8) {
                                j6 = j8;
                            }
                            long j9 = j6 - j7;
                            if (j9 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z6 = false;
                                    boolean z7 = false;
                                    for (long j10 = 0; j10 < j9 / 4 && bVar2.read(bArr4) == 4; j10++) {
                                        if (j10 != 1) {
                                            if (Arrays.equals(bArr4, f13219z)) {
                                                z6 = true;
                                            } else if (Arrays.equals(bArr4, A)) {
                                                z7 = true;
                                            }
                                            if (z6 && z7) {
                                                bVar2.close();
                                                return 12;
                                            }
                                        }
                                    }
                                } catch (Exception e8) {
                                    e = e8;
                                    if (s) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (bVar2 != null) {
                                        bVar2.close();
                                    }
                                    b bVar5 = new b(bArr2);
                                    ByteOrder byteOrderC = C(bVar5);
                                    this.f13226g = byteOrderC;
                                    bVar5.f13240t = byteOrderC;
                                    short s3 = bVar5.readShort();
                                    if (s3 == 20306) {
                                    }
                                    if (i7 == 0) {
                                    }
                                }
                            }
                            bVar2.close();
                            b bVar52 = new b(bArr2);
                            ByteOrder byteOrderC2 = C(bVar52);
                            this.f13226g = byteOrderC2;
                            bVar52.f13240t = byteOrderC2;
                            short s32 = bVar52.readShort();
                            i7 = (s32 == 20306 || s32 == 21330) ? 1 : i6;
                            bVar52.close();
                            if (i7 == 0) {
                                return 7;
                            }
                            try {
                                b bVar6 = new b(bArr2);
                                try {
                                    ByteOrder byteOrderC3 = C(bVar6);
                                    this.f13226g = byteOrderC3;
                                    bVar6.f13240t = byteOrderC3;
                                    i8 = bVar6.readShort() == 85 ? 1 : i6;
                                    bVar6.close();
                                } catch (Exception unused) {
                                    bVar4 = bVar6;
                                    if (bVar4 != null) {
                                        bVar4.close();
                                    }
                                    i8 = i6;
                                    if (i8 == 0) {
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    bVar3 = bVar6;
                                    if (bVar3 != null) {
                                        bVar3.close();
                                    }
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                bVar4 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                bVar3 = null;
                            }
                            if (i8 == 0) {
                                return 10;
                            }
                            int i13 = i6;
                            while (true) {
                                byte[] bArr5 = D;
                                if (i13 >= bArr5.length) {
                                    i9 = 1;
                                    break;
                                }
                                if (bArr2[i13] != bArr5[i13]) {
                                    i9 = i6;
                                    break;
                                }
                                i13++;
                            }
                            if (i9 != 0) {
                                return 13;
                            }
                            int i14 = i6;
                            while (true) {
                                byte[] bArr6 = H;
                                if (i14 >= bArr6.length) {
                                    int i15 = i6;
                                    while (true) {
                                        byte[] bArr7 = I;
                                        if (i15 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i15 + 4] != bArr7[i15]) {
                                            break;
                                        }
                                        i15++;
                                    }
                                } else {
                                    if (bArr2[i14] != bArr6[i14]) {
                                        break;
                                    }
                                    i14++;
                                }
                            }
                            i12 = i6;
                            if (i12 != 0) {
                                return 14;
                            }
                            return i6;
                        }
                        bVar2.close();
                        i6 = 0;
                        b bVar522 = new b(bArr2);
                        ByteOrder byteOrderC22 = C(bVar522);
                        this.f13226g = byteOrderC22;
                        bVar522.f13240t = byteOrderC22;
                        short s322 = bVar522.readShort();
                        if (s322 == 20306) {
                            bVar522.close();
                        }
                        if (i7 == 0) {
                        }
                    }
                }
                return 9;
            }
            i10++;
        }
    }

    public final void p(b bVar) throws Throwable {
        int i6;
        int i7;
        s(bVar);
        HashMap<String, d>[] mapArr = this.f13224e;
        d dVar = mapArr[1].get("MakerNote");
        if (dVar != null) {
            b bVar2 = new b(dVar.f13247d);
            bVar2.f13240t = this.f13226g;
            byte[] bArr = B;
            byte[] bArr2 = new byte[bArr.length];
            bVar2.readFully(bArr2);
            bVar2.a(0L);
            byte[] bArr3 = C;
            byte[] bArr4 = new byte[bArr3.length];
            bVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                bVar2.a(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                bVar2.a(12L);
            }
            E(bVar2, 6);
            d dVar2 = mapArr[7].get("PreviewImageStart");
            d dVar3 = mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f13226g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i8 = iArr[2];
                int i9 = iArr[0];
                if (i8 <= i9 || (i6 = iArr[3]) <= (i7 = iArr[1])) {
                    return;
                }
                int i10 = (i8 - i9) + 1;
                int i11 = (i6 - i7) + 1;
                if (i10 < i11) {
                    int i12 = i10 + i11;
                    i11 = i12 - i11;
                    i10 = i12 - i11;
                }
                d dVarE = d.e(i10, this.f13226g);
                d dVarE2 = d.e(i11, this.f13226g);
                mapArr[0].put("ImageWidth", dVarE);
                mapArr[0].put("ImageLength", dVarE2);
            }
        }
    }

    public final void q(b bVar) throws Throwable {
        if (s) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.f13240t = ByteOrder.BIG_ENDIAN;
        byte[] bArr = D;
        bVar.skipBytes(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i6 = bVar.readInt();
                byte[] bArr2 = new byte[4];
                if (bVar.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i7 = length + 8;
                if (i7 == 16 && !Arrays.equals(bArr2, F)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, G)) {
                    return;
                }
                if (Arrays.equals(bArr2, E)) {
                    byte[] bArr3 = new byte[i6];
                    if (bVar.read(bArr3) != i6) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr2));
                    }
                    int i8 = bVar.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i8) {
                        this.f13232n = i7;
                        D(0, bArr3);
                        N();
                        K(new b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i8 + ", calculated CRC value: " + crc32.getValue());
                }
                int i9 = i6 + 4;
                bVar.skipBytes(i9);
                length = i7 + i9;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void r(b bVar) throws Throwable {
        boolean z6 = s;
        if (z6) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.skipBytes(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        bVar.read(bArr);
        bVar.read(bArr2);
        bVar.read(bArr3);
        int i6 = ByteBuffer.wrap(bArr).getInt();
        int i7 = ByteBuffer.wrap(bArr2).getInt();
        int i8 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i7];
        bVar.a(i6);
        bVar.read(bArr4);
        n(new b(bArr4), i6, 5);
        bVar.a(i8);
        bVar.f13240t = ByteOrder.BIG_ENDIAN;
        int i9 = bVar.readInt();
        if (z6) {
            Log.d("ExifInterface", "numberOfDirectoryEntry: " + i9);
        }
        for (int i10 = 0; i10 < i9; i10++) {
            int unsignedShort = bVar.readUnsignedShort();
            int unsignedShort2 = bVar.readUnsignedShort();
            if (unsignedShort == U.f13248a) {
                short s3 = bVar.readShort();
                short s4 = bVar.readShort();
                d dVarE = d.e(s3, this.f13226g);
                d dVarE2 = d.e(s4, this.f13226g);
                HashMap<String, d>[] mapArr = this.f13224e;
                mapArr[0].put("ImageLength", dVarE);
                mapArr[0].put("ImageWidth", dVarE2);
                if (z6) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s3) + ", width: " + ((int) s4));
                    return;
                }
                return;
            }
            bVar.skipBytes(unsignedShort2);
        }
    }

    public final void s(b bVar) throws Throwable {
        A(bVar, bVar.s.available());
        E(bVar, 0);
        M(bVar, 0);
        M(bVar, 5);
        M(bVar, 4);
        N();
        if (this.f13223d == 8) {
            HashMap<String, d>[] mapArr = this.f13224e;
            d dVar = mapArr[1].get("MakerNote");
            if (dVar != null) {
                b bVar2 = new b(dVar.f13247d);
                bVar2.f13240t = this.f13226g;
                bVar2.a(6L);
                E(bVar2, 9);
                d dVar2 = mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void t(b bVar) throws Throwable {
        if (s) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + bVar);
        }
        s(bVar);
        HashMap<String, d>[] mapArr = this.f13224e;
        d dVar = mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            n(new b(dVar.f13247d), (int) dVar.f13246c, 5);
        }
        d dVar2 = mapArr[0].get("ISO");
        d dVar3 = mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076 A[Catch: all -> 0x0091, Exception -> 0x0096, TRY_ENTER, TryCatch #1 {all -> 0x0091, blocks: (B:31:0x0060, B:34:0x0076, B:36:0x0082, B:48:0x0098, B:49:0x009d, B:50:0x009e, B:51:0x00a3, B:56:0x00ac), top: B:69:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009e A[Catch: all -> 0x0091, Exception -> 0x0096, TryCatch #1 {all -> 0x0091, blocks: (B:31:0x0060, B:34:0x0076, B:36:0x0082, B:48:0x0098, B:49:0x009d, B:50:0x009e, B:51:0x00a3, B:56:0x00ac), top: B:69:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] u() throws Throwable {
        Throwable th;
        FileDescriptor fileDescriptor;
        Throwable th2;
        InputStream fileInputStream;
        Exception e6;
        FileDescriptor fileDescriptor2;
        InputStream inputStream = null;
        if (this.h) {
            byte[] bArr = this.f13230l;
            try {
                if (bArr != 0) {
                    return bArr;
                }
                try {
                    fileInputStream = this.f13222c;
                    if (fileInputStream != null) {
                        try {
                            if (!fileInputStream.markSupported()) {
                                Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                                c(fileInputStream);
                                return null;
                            }
                            fileInputStream.reset();
                            fileDescriptor2 = null;
                            try {
                                if (fileInputStream.skip(this.f13228j + this.f13232n) != this.f13228j + this.f13232n) {
                                    throw new IOException("Corrupted image");
                                }
                                byte[] bArr2 = new byte[this.f13229k];
                                if (fileInputStream.read(bArr2) != this.f13229k) {
                                    throw new IOException("Corrupted image");
                                }
                                this.f13230l = bArr2;
                                c(fileInputStream);
                                if (fileDescriptor2 != null) {
                                    try {
                                        Os.close(fileDescriptor2);
                                        return bArr2;
                                    } catch (Exception unused) {
                                        Log.e("ExifInterface", "Error closing fd.");
                                    }
                                }
                                return bArr2;
                            } catch (Exception e7) {
                                e6 = e7;
                            }
                        } catch (Exception e8) {
                            e6 = e8;
                            fileDescriptor2 = null;
                        } catch (Throwable th3) {
                            inputStream = fileInputStream;
                            th2 = th3;
                            fileDescriptor = null;
                            c(inputStream);
                            if (fileDescriptor != null) {
                            }
                        }
                    } else if (this.f13220a != null) {
                        fileInputStream = new FileInputStream(this.f13220a);
                        fileDescriptor2 = null;
                        if (fileInputStream.skip(this.f13228j + this.f13232n) != this.f13228j + this.f13232n) {
                        }
                    } else {
                        FileDescriptor fileDescriptorDup = Os.dup(this.f13221b);
                        try {
                            Os.lseek(fileDescriptorDup, 0L, OsConstants.SEEK_SET);
                            fileDescriptor2 = fileDescriptorDup;
                            fileInputStream = new FileInputStream(fileDescriptorDup);
                            if (fileInputStream.skip(this.f13228j + this.f13232n) != this.f13228j + this.f13232n) {
                            }
                        } catch (Exception e9) {
                            e6 = e9;
                            fileDescriptor2 = fileDescriptorDup;
                            fileInputStream = null;
                        } catch (Throwable th4) {
                            th = th4;
                            fileDescriptor = fileDescriptorDup;
                            th2 = th;
                            c(inputStream);
                            if (fileDescriptor != null) {
                                throw th2;
                            }
                            try {
                                Os.close(fileDescriptor);
                                throw th2;
                            } catch (Exception unused2) {
                                Log.e("ExifInterface", "Error closing fd.");
                                throw th2;
                            }
                        }
                    }
                } catch (Exception e10) {
                    fileInputStream = null;
                    e6 = e10;
                    fileDescriptor2 = null;
                } catch (Throwable th5) {
                    th2 = th5;
                    fileDescriptor = null;
                }
                Log.d("ExifInterface", "Encountered exception while getting thumbnail", e6);
                c(fileInputStream);
                if (fileDescriptor2 != null) {
                    try {
                        Os.close(fileDescriptor2);
                    } catch (Exception unused3) {
                        Log.e("ExifInterface", "Error closing fd.");
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                inputStream = bArr;
            }
        }
        return null;
    }

    public final void v(b bVar) throws Throwable {
        if (s) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + bVar);
        }
        bVar.mark(0);
        bVar.f13240t = ByteOrder.LITTLE_ENDIAN;
        bVar.skipBytes(H.length);
        int i6 = bVar.readInt() + 8;
        int iSkipBytes = bVar.skipBytes(I.length) + 8;
        while (true) {
            try {
                byte[] bArr = new byte[4];
                if (bVar.read(bArr) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i7 = bVar.readInt();
                int i8 = iSkipBytes + 8;
                if (Arrays.equals(J, bArr)) {
                    byte[] bArr2 = new byte[i7];
                    if (bVar.read(bArr2) == i7) {
                        this.f13232n = i8;
                        D(0, bArr2);
                        K(new b(bArr2));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + b(bArr));
                    }
                }
                if (i7 % 2 == 1) {
                    i7++;
                }
                int i9 = i8 + i7;
                if (i9 == i6) {
                    return;
                }
                if (i9 > i6) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                int iSkipBytes2 = bVar.skipBytes(i7);
                if (iSkipBytes2 != i7) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                iSkipBytes = i8 + iSkipBytes2;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void x(b bVar, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH = dVar.h(this.f13226g);
        int iH2 = dVar2.h(this.f13226g);
        if (this.f13223d == 7) {
            iH += this.f13233o;
        }
        int iMin = Math.min(iH2, bVar.f13241u - iH);
        if (iH > 0 && iMin > 0) {
            this.h = true;
            if (this.f13220a == null && this.f13222c == null && this.f13221b == null) {
                byte[] bArr = new byte[iMin];
                bVar.skip(iH);
                bVar.read(bArr);
                this.f13230l = bArr;
            }
            this.f13228j = iH;
            this.f13229k = iMin;
        }
        if (s) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iMin);
        }
    }

    public final boolean y(HashMap map) {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f13226g) <= 512 && dVar2.h(this.f13226g) <= 512;
    }

    public final void z(InputStream inputStream) {
        boolean z6 = s;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i6 = 0; i6 < V.length; i6++) {
            try {
                try {
                    this.f13224e[i6] = new HashMap<>();
                } catch (IOException e6) {
                    if (z6) {
                        Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e6);
                    }
                    a();
                    if (z6) {
                        B();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                a();
                if (z6) {
                    B();
                }
                throw th;
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        this.f13223d = o(bufferedInputStream);
        b bVar = new b(bufferedInputStream);
        switch (this.f13223d) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 11:
                s(bVar);
                break;
            case 4:
                n(bVar, 0, 0);
                a();
                if (z6) {
                    B();
                    return;
                }
                return;
            case 7:
                p(bVar);
                break;
            case 9:
                r(bVar);
                a();
                if (z6) {
                    B();
                    return;
                }
                return;
            case 10:
                t(bVar);
                a();
                if (z6) {
                    B();
                    return;
                }
                return;
            case 12:
                m(bVar);
                break;
            case 13:
                q(bVar);
                a();
                if (z6) {
                    B();
                    return;
                }
                return;
            case 14:
                v(bVar);
                a();
                if (z6) {
                    B();
                    return;
                }
                return;
        }
        bVar.a(this.f13232n);
        K(bVar);
        a();
        if (z6) {
            B();
        }
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f13248a;

        /* renamed from: b, reason: collision with root package name */
        public final String f13249b;

        /* renamed from: c, reason: collision with root package name */
        public final int f13250c;

        /* renamed from: d, reason: collision with root package name */
        public final int f13251d;

        public e(String str, int i6, int i7) {
            this.f13249b = str;
            this.f13248a = i6;
            this.f13250c = i7;
            this.f13251d = -1;
        }

        public e(String str, int i6, int i7, int i8) {
            this.f13249b = str;
            this.f13248a = i6;
            this.f13250c = i7;
            this.f13251d = i8;
        }
    }

    public a(InputStream inputStream) throws IOException, ErrnoException {
        e[][] eVarArr = V;
        this.f13224e = new HashMap[eVarArr.length];
        this.f13225f = new HashSet(eVarArr.length);
        this.f13226g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f13220a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f13222c = (AssetManager.AssetInputStream) inputStream;
                this.f13221b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                try {
                    Os.lseek(fileInputStream.getFD(), 0L, OsConstants.SEEK_CUR);
                    this.f13222c = null;
                    this.f13221b = fileInputStream.getFD();
                } catch (Exception unused) {
                    if (s) {
                        Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
                    }
                }
            } else {
                this.f13222c = null;
                this.f13221b = null;
            }
            z(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    /* renamed from: g1.a$a, reason: collision with other inner class name */
    public class C0063a extends MediaDataSource {
        public long s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f13237t;

        public C0063a(b bVar) {
            this.f13237t = bVar;
        }

        @Override // android.media.MediaDataSource
        public final long getSize() {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j6, byte[] bArr, int i6, int i7) throws IOException {
            if (i7 == 0) {
                return 0;
            }
            if (j6 < 0) {
                return -1;
            }
            try {
                long j7 = this.s;
                b bVar = this.f13237t;
                if (j7 != j6) {
                    if (j7 >= 0 && j6 >= j7 + bVar.s.available()) {
                        return -1;
                    }
                    bVar.a(j6);
                    this.s = j6;
                }
                if (i7 > bVar.s.available()) {
                    i7 = bVar.s.available();
                }
                int i8 = bVar.read(bArr, i6, i7);
                if (i8 >= 0) {
                    this.s += i8;
                    return i8;
                }
            } catch (IOException unused) {
            }
            this.s = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }
    }
}
