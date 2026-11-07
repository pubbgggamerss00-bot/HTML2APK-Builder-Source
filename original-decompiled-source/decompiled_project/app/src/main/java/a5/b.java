package a5;

import a5.c;
import android.content.res.AssetManager;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import com.basitce.htmltoapk.data.apkgenerator.binaryxml.BinaryXmlFormat;
import j2.y;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
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
import m0.r;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jf.dexlib2.analysis.RegisterType;
import p.i0;

/* loaded from: classes.dex */
public final class b {
    public static final e U;
    public static final e[][] V;
    public static final e[] W;
    public static final HashMap<Integer, e>[] X;
    public static final HashMap<String, e>[] Y;
    public static final HashSet<String> Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final HashMap<Integer, Integer> f28a0;

    /* renamed from: b0, reason: collision with root package name */
    public static final Charset f29b0;

    /* renamed from: c0, reason: collision with root package name */
    public static final byte[] f30c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final byte[] f31d0;

    /* renamed from: e0, reason: collision with root package name */
    public static final Pattern f32e0;

    /* renamed from: f0, reason: collision with root package name */
    public static final Pattern f33f0;

    /* renamed from: g0, reason: collision with root package name */
    public static final Pattern f34g0;

    /* renamed from: a, reason: collision with root package name */
    public final String f42a;

    /* renamed from: b, reason: collision with root package name */
    public final FileDescriptor f43b;

    /* renamed from: c, reason: collision with root package name */
    public final AssetManager.AssetInputStream f44c;

    /* renamed from: d, reason: collision with root package name */
    public int f45d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, d>[] f46e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f47f;

    /* renamed from: g, reason: collision with root package name */
    public ByteOrder f48g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f49h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f50i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f51j;

    /* renamed from: k, reason: collision with root package name */
    public int f52k;

    /* renamed from: l, reason: collision with root package name */
    public int f53l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f54m;

    /* renamed from: n, reason: collision with root package name */
    public int f55n;

    /* renamed from: o, reason: collision with root package name */
    public int f56o;

    /* renamed from: p, reason: collision with root package name */
    public int f57p;

    /* renamed from: q, reason: collision with root package name */
    public int f58q;

    /* renamed from: r, reason: collision with root package name */
    public int f59r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f60s;

    /* renamed from: t, reason: collision with root package name */
    public static final boolean f35t = Log.isLoggable("ExifInterface", 3);

    /* renamed from: u, reason: collision with root package name */
    public static final List<Integer> f36u = Arrays.asList(1, 6, 3, 8);

    /* renamed from: v, reason: collision with root package name */
    public static final List<Integer> f37v = Arrays.asList(2, 7, 4, 5);

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f38w = {8, 8, 8};

    /* renamed from: x, reason: collision with root package name */
    public static final int[] f39x = {8};

    /* renamed from: y, reason: collision with root package name */
    public static final byte[] f40y = {-1, -40, -1};

    /* renamed from: z, reason: collision with root package name */
    public static final byte[] f41z = {102, 116, 121, 112};
    public static final byte[] A = {109, 105, 102, 49};
    public static final byte[] B = {104, 101, 105, 99};
    public static final byte[] C = {79, 76, 89, 77, 80, 0};
    public static final byte[] D = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    public static final byte[] E = {-119, 80, 78, 71, RegisterType.LONG_HI, 10, 26, 10};
    public static final byte[] F = {101, 88, 73, 102};
    public static final byte[] G = {73, 72, 68, 82};
    public static final byte[] H = {73, 69, 78, 68};
    public static final byte[] I = {82, 73, 70, 70};
    public static final byte[] J = {87, 69, 66, 80};
    public static final byte[] K = {69, 88, 73, 70};
    public static final byte[] L = {-99, 1, 42};
    public static final byte[] M = "VP8X".getBytes(Charset.defaultCharset());
    public static final byte[] N = "VP8L".getBytes(Charset.defaultCharset());
    public static final byte[] O = "VP8 ".getBytes(Charset.defaultCharset());
    public static final byte[] P = "ANIM".getBytes(Charset.defaultCharset());
    public static final byte[] Q = "ANMF".getBytes(Charset.defaultCharset());
    public static final String[] R = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    public static final int[] S = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    public static final byte[] T = {65, 83, 67, 73, 73, 0, 0, 0};

    public class a extends MediaDataSource {

        /* renamed from: a, reason: collision with root package name */
        public long f61a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f62b;

        public a(g gVar) {
            this.f62b = gVar;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
        }

        @Override // android.media.MediaDataSource
        public final long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public final int readAt(long j10, byte[] bArr, int i10, int i11) throws IOException {
            if (i11 == 0) {
                return 0;
            }
            if (j10 < 0) {
                return -1;
            }
            try {
                long j11 = this.f61a;
                g gVar = this.f62b;
                if (j11 != j10) {
                    if (j11 >= 0 && j10 >= j11 + gVar.f63a.available()) {
                        return -1;
                    }
                    gVar.seek(j10);
                    this.f61a = j10;
                }
                if (i11 > gVar.f63a.available()) {
                    i11 = gVar.f63a.available();
                }
                int i12 = gVar.read(bArr, i10, i11);
                if (i12 >= 0) {
                    this.f61a += i12;
                    return i12;
                }
            } catch (IOException unused) {
            }
            this.f61a = -1L;
            return -1;
        }
    }

    public static class c extends FilterOutputStream {

        /* renamed from: a, reason: collision with root package name */
        public final OutputStream f68a;

        /* renamed from: b, reason: collision with root package name */
        public ByteOrder f69b;

        public c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f68a = outputStream;
            this.f69b = byteOrder;
        }

        public final void E(int i10) throws IOException {
            if (i10 > 65535) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 16-bit unsigned integer");
            }
            p((short) i10);
        }

        public final void h(int i10) throws IOException {
            this.f68a.write(i10);
        }

        public final void l(int i10) throws IOException {
            ByteOrder byteOrder = this.f69b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f68a;
            if (byteOrder == byteOrder2) {
                outputStream.write(i10 & 255);
                outputStream.write((i10 >>> 8) & 255);
                outputStream.write((i10 >>> 16) & 255);
                outputStream.write((i10 >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((i10 >>> 24) & 255);
                outputStream.write((i10 >>> 16) & 255);
                outputStream.write((i10 >>> 8) & 255);
                outputStream.write(i10 & 255);
            }
        }

        public final void p(short s10) throws IOException {
            ByteOrder byteOrder = this.f69b;
            ByteOrder byteOrder2 = ByteOrder.LITTLE_ENDIAN;
            OutputStream outputStream = this.f68a;
            if (byteOrder == byteOrder2) {
                outputStream.write(s10 & 255);
                outputStream.write((s10 >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                outputStream.write((s10 >>> 8) & 255);
                outputStream.write(s10 & 255);
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr) throws IOException {
            this.f68a.write(bArr);
        }

        public final void z(long j10) throws IOException {
            if (j10 > BodyPartID.bodyIdMax) {
                throw new IllegalArgumentException("val is larger than the maximum value of a 32-bit unsigned integer");
            }
            l((int) j10);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public final void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f68a.write(bArr, i10, i11);
        }
    }

    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f70a;

        /* renamed from: b, reason: collision with root package name */
        public final int f71b;

        /* renamed from: c, reason: collision with root package name */
        public final long f72c;

        /* renamed from: d, reason: collision with root package name */
        public final byte[] f73d;

        public d(int i10, int i11, byte[] bArr) {
            this(-1L, bArr, i10, i11);
        }

        public static d a(String str) {
            byte[] bytes = str.concat("\u0000").getBytes(b.f29b0);
            return new d(2, bytes.length, bytes);
        }

        public static d b(long j10, ByteOrder byteOrder) {
            return c(new long[]{j10}, byteOrder);
        }

        public static d c(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.S[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j10 : jArr) {
                byteBufferWrap.putInt((int) j10);
            }
            return new d(4, jArr.length, byteBufferWrap.array());
        }

        public static d d(f[] fVarArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.S[5] * fVarArr.length]);
            byteBufferWrap.order(byteOrder);
            for (f fVar : fVarArr) {
                byteBufferWrap.putInt((int) fVar.f78a);
                byteBufferWrap.putInt((int) fVar.f79b);
            }
            return new d(5, fVarArr.length, byteBufferWrap.array());
        }

        public static d e(int i10, ByteOrder byteOrder) {
            return f(new int[]{i10}, byteOrder);
        }

        public static d f(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[b.S[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i10 : iArr) {
                byteBufferWrap.putShort((short) i10);
            }
            return new d(3, iArr.length, byteBufferWrap.array());
        }

        public final double g(ByteOrder byteOrder) throws Throwable {
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
            return fVar.f78a / fVar.f79b;
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
            int i10 = 0;
            if (objJ instanceof long[]) {
                long[] jArr = (long[]) objJ;
                while (i10 < jArr.length) {
                    sb.append(jArr[i10]);
                    i10++;
                    if (i10 != jArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof int[]) {
                int[] iArr = (int[]) objJ;
                while (i10 < iArr.length) {
                    sb.append(iArr[i10]);
                    i10++;
                    if (i10 != iArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (objJ instanceof double[]) {
                double[] dArr = (double[]) objJ;
                while (i10 < dArr.length) {
                    sb.append(dArr[i10]);
                    i10++;
                    if (i10 != dArr.length) {
                        sb.append(",");
                    }
                }
                return sb.toString();
            }
            if (!(objJ instanceof f[])) {
                return null;
            }
            f[] fVarArr = (f[]) objJ;
            while (i10 < fVarArr.length) {
                sb.append(fVarArr[i10].f78a);
                sb.append('/');
                sb.append(fVarArr[i10].f79b);
                i10++;
                if (i10 != fVarArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Not initialized variable reg: 4, insn: 0x0032: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:17:0x0032 */
        /* JADX WARN: Removed duplicated region for block: B:103:0x012e A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r14v11, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
        /* JADX WARN: Type inference failed for: r14v23, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v24, types: [long[]] */
        /* JADX WARN: Type inference failed for: r14v25, types: [a5.b$f[]] */
        /* JADX WARN: Type inference failed for: r14v26, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v27, types: [int[]] */
        /* JADX WARN: Type inference failed for: r14v28, types: [a5.b$f[]] */
        /* JADX WARN: Type inference failed for: r14v29, types: [double[]] */
        /* JADX WARN: Type inference failed for: r14v30, types: [java.io.Serializable] */
        /* JADX WARN: Type inference failed for: r14v31, types: [double[]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Serializable j(ByteOrder byteOrder) throws Throwable {
            C0002b c0002b;
            InputStream inputStream;
            ?? str;
            byte b10;
            byte[] bArr = this.f73d;
            InputStream inputStream2 = null;
            try {
                try {
                    c0002b = new C0002b(bArr);
                    try {
                        c0002b.f65c = byteOrder;
                        int i10 = this.f70a;
                        int length = 0;
                        int i11 = this.f71b;
                        switch (i10) {
                            case 1:
                            case 6:
                                if (bArr.length == 1 && (b10 = bArr[0]) >= 0 && b10 <= 1) {
                                    String str2 = new String(new char[]{(char) (b10 + 48)});
                                    try {
                                        c0002b.close();
                                        return str2;
                                    } catch (IOException e10) {
                                        Log.e("ExifInterface", "IOException occurred while closing InputStream", e10);
                                        return str2;
                                    }
                                }
                                str = new String(bArr, b.f29b0);
                                break;
                                break;
                            case 2:
                            case 7:
                                if (i11 >= b.T.length) {
                                    int i12 = 0;
                                    while (true) {
                                        byte[] bArr2 = b.T;
                                        if (i12 >= bArr2.length) {
                                            length = bArr2.length;
                                        } else if (bArr[i12] == bArr2[i12]) {
                                            i12++;
                                        }
                                    }
                                }
                                StringBuilder sb = new StringBuilder();
                                while (length < i11) {
                                    byte b11 = bArr[length];
                                    if (b11 == 0) {
                                        str = sb.toString();
                                        break;
                                    } else {
                                        if (b11 >= 32) {
                                            sb.append((char) b11);
                                        } else {
                                            sb.append('?');
                                        }
                                        length++;
                                    }
                                }
                                str = sb.toString();
                            case 3:
                                str = new int[i11];
                                while (length < i11) {
                                    str[length] = c0002b.readUnsignedShort();
                                    length++;
                                }
                            case 4:
                                str = new long[i11];
                                while (length < i11) {
                                    str[length] = c0002b.readInt() & BodyPartID.bodyIdMax;
                                    length++;
                                }
                            case 5:
                                str = new f[i11];
                                while (length < i11) {
                                    str[length] = new f(c0002b.readInt() & BodyPartID.bodyIdMax, c0002b.readInt() & BodyPartID.bodyIdMax);
                                    length++;
                                }
                            case 8:
                                str = new int[i11];
                                while (length < i11) {
                                    str[length] = c0002b.readShort();
                                    length++;
                                }
                            case 9:
                                str = new int[i11];
                                while (length < i11) {
                                    str[length] = c0002b.readInt();
                                    length++;
                                }
                            case 10:
                                str = new f[i11];
                                while (length < i11) {
                                    str[length] = new f(c0002b.readInt(), c0002b.readInt());
                                    length++;
                                }
                            case 11:
                                str = new double[i11];
                                while (length < i11) {
                                    str[length] = c0002b.readFloat();
                                    length++;
                                }
                            case 12:
                                str = new double[i11];
                                while (length < i11) {
                                    str[length] = c0002b.readDouble();
                                    length++;
                                }
                            default:
                                try {
                                    c0002b.close();
                                    return null;
                                } catch (IOException e11) {
                                    Log.e("ExifInterface", "IOException occurred while closing InputStream", e11);
                                    return null;
                                }
                        }
                        try {
                            c0002b.close();
                            return str;
                        } catch (IOException e12) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e12);
                            return str;
                        }
                    } catch (IOException e13) {
                        e = e13;
                        Log.w("ExifInterface", "IOException occurred during reading a value", e);
                        if (c0002b != null) {
                            try {
                                c0002b.close();
                            } catch (IOException e14) {
                                Log.e("ExifInterface", "IOException occurred while closing InputStream", e14);
                            }
                        }
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream2 = inputStream;
                    if (inputStream2 != null) {
                        try {
                            inputStream2.close();
                        } catch (IOException e15) {
                            Log.e("ExifInterface", "IOException occurred while closing InputStream", e15);
                        }
                    }
                    throw th;
                }
            } catch (IOException e16) {
                e = e16;
                c0002b = null;
            } catch (Throwable th3) {
                th = th3;
                if (inputStream2 != null) {
                }
                throw th;
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(b.R[this.f70a]);
            sb.append(", data length:");
            return x0.a.a(sb, this.f73d.length, ")");
        }

        public d(long j10, byte[] bArr, int i10, int i11) {
            this.f70a = i10;
            this.f71b = i11;
            this.f72c = j10;
            this.f73d = bArr;
        }
    }

    public static class f {

        /* renamed from: a, reason: collision with root package name */
        public final long f78a;

        /* renamed from: b, reason: collision with root package name */
        public final long f79b;

        public f(long j10, long j11) {
            if (j11 == 0) {
                this.f78a = 0L;
                this.f79b = 1L;
            } else {
                this.f78a = j10;
                this.f79b = j11;
            }
        }

        public final String toString() {
            return this.f78a + "/" + this.f79b;
        }
    }

    static {
        e[] eVarArr = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ImageWidth", 256, 3, 4), new e("ImageLength", BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("Orientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", BinaryXmlFormat.RES_TABLE_TYPE_TYPE, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("SensorTopBorder", 4, 4), new e("SensorLeftBorder", 5, 4), new e("SensorBottomBorder", 6, 4), new e("SensorRightBorder", 7, 4), new e("ISO", 23, 3), new e("JpgFromRaw", 46, 7), new e("Xmp", 700, 1)};
        e[] eVarArr2 = {new e("ExposureTime", 33434, 5), new e("FNumber", 33437, 5), new e("ExposureProgram", 34850, 3), new e("SpectralSensitivity", 34852, 2), new e("PhotographicSensitivity", 34855, 3), new e("OECF", 34856, 7), new e("SensitivityType", 34864, 3), new e("StandardOutputSensitivity", 34865, 4), new e("RecommendedExposureIndex", 34866, 4), new e("ISOSpeed", 34867, 4), new e("ISOSpeedLatitudeyyy", 34868, 4), new e("ISOSpeedLatitudezzz", 34869, 4), new e("ExifVersion", 36864, 2), new e("DateTimeOriginal", 36867, 2), new e("DateTimeDigitized", 36868, 2), new e("OffsetTime", 36880, 2), new e("OffsetTimeOriginal", 36881, 2), new e("OffsetTimeDigitized", 36882, 2), new e("ComponentsConfiguration", 37121, 7), new e("CompressedBitsPerPixel", 37122, 5), new e("ShutterSpeedValue", 37377, 10), new e("ApertureValue", 37378, 5), new e("BrightnessValue", 37379, 10), new e("ExposureBiasValue", 37380, 10), new e("MaxApertureValue", 37381, 5), new e("SubjectDistance", 37382, 5), new e("MeteringMode", 37383, 3), new e("LightSource", 37384, 3), new e("Flash", 37385, 3), new e("FocalLength", 37386, 5), new e("SubjectArea", 37396, 3), new e("MakerNote", 37500, 7), new e("UserComment", 37510, 7), new e("SubSecTime", 37520, 2), new e("SubSecTimeOriginal", 37521, 2), new e("SubSecTimeDigitized", 37522, 2), new e("FlashpixVersion", 40960, 7), new e("ColorSpace", 40961, 3), new e("PixelXDimension", 40962, 3, 4), new e("PixelYDimension", 40963, 3, 4), new e("RelatedSoundFile", 40964, 2), new e("InteroperabilityIFDPointer", 40965, 4), new e("FlashEnergy", 41483, 5), new e("SpatialFrequencyResponse", 41484, 7), new e("FocalPlaneXResolution", 41486, 5), new e("FocalPlaneYResolution", 41487, 5), new e("FocalPlaneResolutionUnit", 41488, 3), new e("SubjectLocation", 41492, 3), new e("ExposureIndex", 41493, 5), new e("SensingMethod", 41495, 3), new e("FileSource", 41728, 7), new e("SceneType", 41729, 7), new e("CFAPattern", 41730, 7), new e("CustomRendered", 41985, 3), new e("ExposureMode", 41986, 3), new e("WhiteBalance", 41987, 3), new e("DigitalZoomRatio", 41988, 5), new e("FocalLengthIn35mmFilm", 41989, 3), new e("SceneCaptureType", 41990, 3), new e("GainControl", 41991, 3), new e("Contrast", 41992, 3), new e("Saturation", 41993, 3), new e("Sharpness", 41994, 3), new e("DeviceSettingDescription", 41995, 7), new e("SubjectDistanceRange", 41996, 3), new e("ImageUniqueID", 42016, 2), new e("CameraOwnerName", 42032, 2), new e("BodySerialNumber", 42033, 2), new e("LensSpecification", 42034, 5), new e("LensMake", 42035, 2), new e("LensModel", 42036, 2), new e("Gamma", 42240, 5), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        e[] eVarArr3 = {new e("GPSVersionID", 0, 1), new e("GPSLatitudeRef", 1, 2), new e("GPSLatitude", 2, 5, 10), new e("GPSLongitudeRef", 3, 2), new e("GPSLongitude", 4, 5, 10), new e("GPSAltitudeRef", 5, 1), new e("GPSAltitude", 6, 5), new e("GPSTimeStamp", 7, 5), new e("GPSSatellites", 8, 2), new e("GPSStatus", 9, 2), new e("GPSMeasureMode", 10, 2), new e("GPSDOP", 11, 5), new e("GPSSpeedRef", 12, 2), new e("GPSSpeed", 13, 5), new e("GPSTrackRef", 14, 2), new e("GPSTrack", 15, 5), new e("GPSImgDirectionRef", 16, 2), new e("GPSImgDirection", 17, 5), new e("GPSMapDatum", 18, 2), new e("GPSDestLatitudeRef", 19, 2), new e("GPSDestLatitude", 20, 5), new e("GPSDestLongitudeRef", 21, 2), new e("GPSDestLongitude", 22, 5), new e("GPSDestBearingRef", 23, 2), new e("GPSDestBearing", 24, 5), new e("GPSDestDistanceRef", 25, 2), new e("GPSDestDistance", 26, 5), new e("GPSProcessingMethod", 27, 7), new e("GPSAreaInformation", 28, 7), new e("GPSDateStamp", 29, 2), new e("GPSDifferential", 30, 3), new e("GPSHPositioningError", 31, 5)};
        e[] eVarArr4 = {new e("InteroperabilityIndex", 1, 2)};
        e[] eVarArr5 = {new e("NewSubfileType", 254, 4), new e("SubfileType", 255, 4), new e("ThumbnailImageWidth", 256, 3, 4), new e("ThumbnailImageLength", BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, 3, 4), new e("BitsPerSample", 258, 3), new e("Compression", 259, 3), new e("PhotometricInterpretation", 262, 3), new e("ImageDescription", 270, 2), new e("Make", 271, 2), new e("Model", 272, 2), new e("StripOffsets", 273, 3, 4), new e("ThumbnailOrientation", 274, 3), new e("SamplesPerPixel", 277, 3), new e("RowsPerStrip", 278, 3, 4), new e("StripByteCounts", 279, 3, 4), new e("XResolution", 282, 5), new e("YResolution", 283, 5), new e("PlanarConfiguration", 284, 3), new e("ResolutionUnit", 296, 3), new e("TransferFunction", 301, 3), new e("Software", 305, 2), new e("DateTime", 306, 2), new e("Artist", 315, 2), new e("WhitePoint", 318, 5), new e("PrimaryChromaticities", 319, 5), new e("SubIFDPointer", 330, 4), new e("JPEGInterchangeFormat", BinaryXmlFormat.RES_TABLE_TYPE_TYPE, 4), new e("JPEGInterchangeFormatLength", 514, 4), new e("YCbCrCoefficients", 529, 5), new e("YCbCrSubSampling", 530, 3), new e("YCbCrPositioning", 531, 3), new e("ReferenceBlackWhite", 532, 5), new e("Copyright", 33432, 2), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("DNGVersion", 50706, 1), new e("DefaultCropSize", 50720, 3, 4)};
        U = new e("StripOffsets", 273, 3);
        V = new e[][]{eVarArr, eVarArr2, eVarArr3, eVarArr4, eVarArr5, eVarArr, new e[]{new e("ThumbnailImage", 256, 7), new e("CameraSettingsIFDPointer", 8224, 4), new e("ImageProcessingIFDPointer", 8256, 4)}, new e[]{new e("PreviewImageStart", BinaryXmlFormat.RES_XML_END_NAMESPACE_TYPE, 4), new e("PreviewImageLength", 258, 4)}, new e[]{new e("AspectFrame", 4371, 3)}, new e[]{new e("ColorSpace", 55, 3)}};
        W = new e[]{new e("SubIFDPointer", 330, 4), new e("ExifIFDPointer", 34665, 4), new e("GPSInfoIFDPointer", 34853, 4), new e("InteroperabilityIFDPointer", 40965, 4), new e("CameraSettingsIFDPointer", 8224, 1), new e("ImageProcessingIFDPointer", 8256, 1)};
        X = new HashMap[10];
        Y = new HashMap[10];
        Z = new HashSet<>(Arrays.asList("FNumber", "DigitalZoomRatio", "ExposureTime", "SubjectDistance", "GPSTimeStamp"));
        f28a0 = new HashMap<>();
        Charset charsetForName = Charset.forName("US-ASCII");
        f29b0 = charsetForName;
        f30c0 = "Exif\u0000\u0000".getBytes(charsetForName);
        f31d0 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale).setTimeZone(TimeZone.getTimeZone("UTC"));
        int i10 = 0;
        while (true) {
            e[][] eVarArr6 = V;
            if (i10 >= eVarArr6.length) {
                HashMap<Integer, Integer> map = f28a0;
                e[] eVarArr7 = W;
                map.put(Integer.valueOf(eVarArr7[0].f74a), 5);
                map.put(Integer.valueOf(eVarArr7[1].f74a), 1);
                map.put(Integer.valueOf(eVarArr7[2].f74a), 2);
                map.put(Integer.valueOf(eVarArr7[3].f74a), 3);
                map.put(Integer.valueOf(eVarArr7[4].f74a), 7);
                map.put(Integer.valueOf(eVarArr7[5].f74a), 8);
                Pattern.compile(".*[1-9].*");
                f32e0 = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                f33f0 = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                f34g0 = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            X[i10] = new HashMap<>();
            Y[i10] = new HashMap<>();
            for (e eVar : eVarArr6[i10]) {
                X[i10].put(Integer.valueOf(eVar.f74a), eVar);
                Y[i10].put(eVar.f75b, eVar);
            }
            i10++;
        }
    }

    public b(String str) throws Throwable {
        e[][] eVarArr = V;
        this.f46e = new HashMap[eVarArr.length];
        this.f47f = new HashSet(eVarArr.length);
        this.f48g = ByteOrder.BIG_ENDIAN;
        if (str == null) {
            throw new NullPointerException("filename cannot be null");
        }
        FileInputStream fileInputStream = null;
        this.f44c = null;
        this.f42a = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (p(fileInputStream2.getFD())) {
                    this.f43b = fileInputStream2.getFD();
                } else {
                    this.f43b = null;
                }
                r(fileInputStream2);
                a5.c.b(fileInputStream2);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream = fileInputStream2;
                a5.c.b(fileInputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static Pair<Integer, Integer> n(String str) throws NumberFormatException {
        if (str.contains(",")) {
            String[] strArrSplit = str.split(",", -1);
            Pair<Integer, Integer> pairN = n(strArrSplit[0]);
            if (((Integer) pairN.first).intValue() == 2) {
                return pairN;
            }
            for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                Pair<Integer, Integer> pairN2 = n(strArrSplit[i10]);
                int iIntValue = (((Integer) pairN2.first).equals(pairN.first) || ((Integer) pairN2.second).equals(pairN.first)) ? ((Integer) pairN.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairN.second).intValue() == -1 || !(((Integer) pairN2.first).equals(pairN.second) || ((Integer) pairN2.second).equals(pairN.second))) ? -1 : ((Integer) pairN.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairN = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairN = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairN;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j10 = Long.parseLong(str);
                    return (j10 < 0 || j10 > 65535) ? j10 < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1) : new Pair<>(3, 4);
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
                long j11 = (long) Double.parseDouble(strArrSplit2[0]);
                long j12 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j11 >= 0 && j12 >= 0) {
                    if (j11 <= 2147483647L && j12 <= 2147483647L) {
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

    public static boolean p(FileDescriptor fileDescriptor) {
        try {
            c.a.c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            if (!f35t) {
                return false;
            }
            Log.d("ExifInterface", "The file descriptor for the given input is not seekable");
            return false;
        }
    }

    public static ByteOrder u(C0002b c0002b) throws IOException {
        short s10 = c0002b.readShort();
        boolean z10 = f35t;
        if (s10 == 18761) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align II");
            }
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s10 == 19789) {
            if (z10) {
                Log.d("ExifInterface", "readExifSegment: Byte Align MM");
            }
            return ByteOrder.BIG_ENDIAN;
        }
        throw new IOException("Invalid byte order: " + Integer.toHexString(s10));
    }

    public final void A(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        if (f35t) {
            Log.d("ExifInterface", "savePngAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        C0002b c0002b = new C0002b(bufferedInputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        c cVar = new c(bufferedOutputStream, byteOrder);
        a5.c.d(c0002b, cVar, E.length);
        if (this.f56o == 0) {
            int i10 = c0002b.readInt();
            cVar.l(i10);
            a5.c.d(c0002b, cVar, i10 + 8);
        } else {
            a5.c.d(c0002b, cVar, (r2 - r7.length) - 8);
            c0002b.h(c0002b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                c cVar2 = new c(byteArrayOutputStream2, byteOrder);
                H(cVar2);
                byte[] byteArray = ((ByteArrayOutputStream) cVar2.f68a).toByteArray();
                cVar.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                cVar.l((int) crc32.getValue());
                a5.c.b(byteArrayOutputStream2);
                a5.c.e(c0002b, cVar);
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                a5.c.b(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void B(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        int i10;
        int i11;
        int i12;
        int i13;
        ByteArrayOutputStream byteArrayOutputStream2;
        c cVar;
        byte[] bArr;
        boolean z10;
        if (f35t) {
            Log.d("ExifInterface", "saveWebpAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C0002b c0002b = new C0002b(bufferedInputStream, byteOrder);
        c cVar2 = new c(bufferedOutputStream, byteOrder);
        byte[] bArr2 = I;
        a5.c.d(c0002b, cVar2, bArr2.length);
        byte[] bArr3 = J;
        c0002b.h(bArr3.length + 4);
        ByteArrayOutputStream byteArrayOutputStream3 = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    c cVar3 = new c(byteArrayOutputStream4, byteOrder);
                    int i14 = this.f56o;
                    try {
                        try {
                            if (i14 != 0) {
                                a5.c.d(c0002b, cVar3, (i14 - ((bArr2.length + 4) + bArr3.length)) - 8);
                                c0002b.h(4);
                                int i15 = c0002b.readInt();
                                if (i15 % 2 != 0) {
                                    i15++;
                                }
                                c0002b.h(i15);
                                H(cVar3);
                            } else {
                                byte[] bArr4 = new byte[4];
                                c0002b.readFully(bArr4);
                                byte[] bArr5 = M;
                                boolean zEquals = Arrays.equals(bArr4, bArr5);
                                byte[] bArr6 = O;
                                byte[] bArr7 = N;
                                if (!zEquals) {
                                    if (Arrays.equals(bArr4, bArr6) || Arrays.equals(bArr4, bArr7)) {
                                        int i16 = c0002b.readInt();
                                        int i17 = i16 % 2 == 1 ? i16 + 1 : i16;
                                        byte[] bArr8 = new byte[3];
                                        boolean zEquals2 = Arrays.equals(bArr4, bArr6);
                                        boolean z11 = true;
                                        byte[] bArr9 = L;
                                        if (zEquals2) {
                                            c0002b.readFully(bArr8);
                                            byte[] bArr10 = new byte[3];
                                            c0002b.readFully(bArr10);
                                            if (!Arrays.equals(bArr9, bArr10)) {
                                                throw new IOException("Error checking VP8 signature");
                                            }
                                            i10 = c0002b.readInt();
                                            i17 -= 10;
                                            i11 = (i10 << 18) >> 18;
                                            i12 = (i10 << 2) >> 18;
                                            z11 = false;
                                        } else if (!Arrays.equals(bArr4, bArr7)) {
                                            i10 = 0;
                                            i11 = 0;
                                            z11 = false;
                                            i12 = 0;
                                        } else {
                                            if (c0002b.readByte() != 47) {
                                                throw new IOException("Error checking VP8L signature");
                                            }
                                            i10 = c0002b.readInt();
                                            i11 = (i10 & 16383) + 1;
                                            i12 = ((i10 & 268419072) >>> 14) + 1;
                                            if ((i10 & 268435456) == 0) {
                                                z11 = false;
                                            }
                                            i17 -= 5;
                                        }
                                        cVar3.write(bArr5);
                                        cVar3.l(10);
                                        byte[] bArr11 = new byte[10];
                                        if (z11) {
                                            i13 = i11;
                                            bArr11[0] = (byte) (bArr11[0] | RegisterType.UNINIT_REF);
                                        } else {
                                            i13 = i11;
                                        }
                                        bArr11[0] = (byte) (bArr11[0] | 8);
                                        int i18 = i13 - 1;
                                        byteArrayOutputStream2 = byteArrayOutputStream4;
                                        int i19 = i12 - 1;
                                        cVar = cVar2;
                                        try {
                                            bArr11[4] = (byte) i18;
                                            bArr11[5] = (byte) (i18 >> 8);
                                            bArr11[6] = (byte) (i18 >> 16);
                                            bArr11[7] = (byte) i19;
                                            bArr11[8] = (byte) (i19 >> 8);
                                            bArr11[9] = (byte) (i19 >> 16);
                                            cVar3.write(bArr11);
                                            cVar3.write(bArr4);
                                            cVar3.l(i16);
                                        } catch (Exception e10) {
                                            e = e10;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th2) {
                                            th = th2;
                                            byteArrayOutputStream = byteArrayOutputStream2;
                                            byteArrayOutputStream3 = byteArrayOutputStream;
                                            a5.c.b(byteArrayOutputStream3);
                                            throw th;
                                        }
                                        try {
                                            if (Arrays.equals(bArr4, bArr6)) {
                                                cVar3.write(bArr8);
                                                cVar3.write(bArr9);
                                                cVar3.l(i10);
                                            } else {
                                                if (Arrays.equals(bArr4, bArr7)) {
                                                    cVar3.write(47);
                                                    cVar3.l(i10);
                                                }
                                                a5.c.d(c0002b, cVar3, i17);
                                                H(cVar3);
                                            }
                                            a5.c.d(c0002b, cVar3, i17);
                                            H(cVar3);
                                        } catch (Exception e11) {
                                            e = e11;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            throw new IOException("Failed to save WebP file", e);
                                        } catch (Throwable th3) {
                                            th = th3;
                                            byteArrayOutputStream3 = byteArrayOutputStream2;
                                            a5.c.b(byteArrayOutputStream3);
                                            throw th;
                                        }
                                    }
                                    a5.c.e(c0002b, cVar3);
                                    c cVar4 = cVar;
                                    cVar4.l(byteArrayOutputStream2.size() + bArr3.length);
                                    cVar4.write(bArr3);
                                    byteArrayOutputStream = byteArrayOutputStream2;
                                    byteArrayOutputStream.writeTo(cVar4);
                                    a5.c.b(byteArrayOutputStream);
                                    return;
                                }
                                int i20 = c0002b.readInt();
                                byte[] bArr12 = new byte[i20 % 2 == 1 ? i20 + 1 : i20];
                                c0002b.readFully(bArr12);
                                byte b10 = (byte) (8 | bArr12[0]);
                                bArr12[0] = b10;
                                boolean z12 = ((b10 >> 1) & 1) == 1;
                                cVar3.write(bArr5);
                                cVar3.l(i20);
                                cVar3.write(bArr12);
                                if (z12) {
                                    byte[] bArr13 = P;
                                    do {
                                        bArr = new byte[4];
                                        c0002b.readFully(bArr);
                                        int i21 = c0002b.readInt();
                                        cVar3.write(bArr);
                                        cVar3.l(i21);
                                        if (i21 % 2 == 1) {
                                            i21++;
                                        }
                                        a5.c.d(c0002b, cVar3, i21);
                                    } while (!Arrays.equals(bArr, bArr13));
                                    while (true) {
                                        byte[] bArr14 = new byte[4];
                                        try {
                                            c0002b.readFully(bArr14);
                                            z10 = !Arrays.equals(bArr14, Q);
                                        } catch (EOFException unused) {
                                            z10 = true;
                                        }
                                        if (z10) {
                                            break;
                                        }
                                        int i22 = c0002b.readInt();
                                        cVar3.write(bArr14);
                                        cVar3.l(i22);
                                        if (i22 % 2 == 1) {
                                            i22++;
                                        }
                                        a5.c.d(c0002b, cVar3, i22);
                                    }
                                    H(cVar3);
                                } else {
                                    while (true) {
                                        byte[] bArr15 = new byte[4];
                                        c0002b.readFully(bArr15);
                                        int i23 = c0002b.readInt();
                                        cVar3.write(bArr15);
                                        cVar3.l(i23);
                                        if (i23 % 2 == 1) {
                                            i23++;
                                        }
                                        a5.c.d(c0002b, cVar3, i23);
                                        if (Arrays.equals(bArr15, bArr6) || (bArr7 != null && Arrays.equals(bArr15, bArr7))) {
                                            break;
                                        }
                                    }
                                    H(cVar3);
                                }
                            }
                            byteArrayOutputStream.writeTo(cVar4);
                            a5.c.b(byteArrayOutputStream);
                            return;
                        } catch (Exception e12) {
                            e = e12;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            throw new IOException("Failed to save WebP file", e);
                        } catch (Throwable th4) {
                            th = th4;
                            byteArrayOutputStream3 = byteArrayOutputStream;
                            a5.c.b(byteArrayOutputStream3);
                            throw th;
                        }
                        cVar = cVar2;
                        byteArrayOutputStream2 = byteArrayOutputStream4;
                        a5.c.e(c0002b, cVar3);
                        c cVar42 = cVar;
                        cVar42.l(byteArrayOutputStream2.size() + bArr3.length);
                        cVar42.write(bArr3);
                        byteArrayOutputStream = byteArrayOutputStream2;
                    } catch (Exception e13) {
                        e = e13;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    } catch (Throwable th5) {
                        th = th5;
                        byteArrayOutputStream3 = byteArrayOutputStream4;
                    }
                } catch (Exception e14) {
                    e = e14;
                    byteArrayOutputStream = byteArrayOutputStream4;
                } catch (Throwable th6) {
                    th = th6;
                    byteArrayOutputStream = byteArrayOutputStream4;
                }
            } catch (Exception e15) {
                e = e15;
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(String str, String str2) throws NumberFormatException {
        e eVar;
        int i10;
        String str3;
        int i11;
        d dVar;
        int i12;
        boolean z10;
        boolean z11;
        String str4 = str;
        String strReplaceAll = str2;
        String str5 = "ExifInterface";
        if (("DateTime".equals(str4) || "DateTimeOriginal".equals(str4) || "DateTimeDigitized".equals(str4)) && strReplaceAll != null) {
            boolean zFind = f33f0.matcher(strReplaceAll).find();
            boolean zFind2 = f34g0.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19 || (!zFind && !zFind2)) {
                Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        boolean zEquals = "ISOSpeedRatings".equals(str4);
        boolean z12 = f35t;
        if (zEquals) {
            if (z12) {
                Log.d("ExifInterface", "setAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str4 = "PhotographicSensitivity";
        }
        int i13 = 2;
        int i14 = 1;
        if (strReplaceAll != null && Z.contains(str4)) {
            if (str4.equals("GPSTimeStamp")) {
                Matcher matcher = f32e0.matcher(strReplaceAll);
                if (!matcher.find()) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = ((long) (Double.parseDouble(strReplaceAll) * 10000.0d)) + "/10000";
                } catch (NumberFormatException unused) {
                    Log.w("ExifInterface", "Invalid value for " + str4 + " : " + strReplaceAll);
                    return;
                }
            }
        }
        int i15 = 0;
        while (i15 < V.length) {
            if ((i15 != 4 || this.f49h) && (eVar = Y[i15].get(str4)) != null) {
                int i16 = eVar.f77d;
                int i17 = eVar.f76c;
                HashMap<String, d>[] mapArr = this.f46e;
                if (strReplaceAll == null) {
                    mapArr[i15].remove(str4);
                } else {
                    Pair<Integer, Integer> pairN = n(strReplaceAll);
                    if (i17 == ((Integer) pairN.first).intValue() || i17 == ((Integer) pairN.second).intValue()) {
                        i16 = i17;
                        int[] iArr = S;
                        switch (i16) {
                            case 1:
                                i10 = i15;
                                str3 = str5;
                                HashMap<String, d> map = mapArr[i10];
                                i11 = i14;
                                if (strReplaceAll.length() != i11 || strReplaceAll.charAt(0) < '0' || strReplaceAll.charAt(0) > '1') {
                                    byte[] bytes = strReplaceAll.getBytes(f29b0);
                                    dVar = new d(i11, bytes.length, bytes);
                                } else {
                                    byte[] bArr = new byte[i11];
                                    bArr[0] = (byte) (strReplaceAll.charAt(0) - '0');
                                    dVar = new d(i11, i11, bArr);
                                }
                                map.put(str4, dVar);
                                break;
                            case 2:
                            case 7:
                                i10 = i15;
                                str3 = str5;
                                i12 = i14;
                                z10 = false;
                                mapArr[i10].put(str4, d.a(strReplaceAll));
                                i11 = i12;
                                break;
                            case 3:
                                i10 = i15;
                                str3 = str5;
                                i12 = i14;
                                z10 = false;
                                String[] strArrSplit = strReplaceAll.split(",", -1);
                                int[] iArr2 = new int[strArrSplit.length];
                                for (int i18 = 0; i18 < strArrSplit.length; i18++) {
                                    iArr2[i18] = Integer.parseInt(strArrSplit[i18]);
                                }
                                mapArr[i10].put(str4, d.f(iArr2, this.f48g));
                                i11 = i12;
                                break;
                            case 4:
                                i10 = i15;
                                str3 = str5;
                                i12 = i14;
                                z10 = false;
                                String[] strArrSplit2 = strReplaceAll.split(",", -1);
                                long[] jArr = new long[strArrSplit2.length];
                                for (int i19 = 0; i19 < strArrSplit2.length; i19++) {
                                    jArr[i19] = Long.parseLong(strArrSplit2[i19]);
                                }
                                mapArr[i10].put(str4, d.c(jArr, this.f48g));
                                i11 = i12;
                                break;
                            case 5:
                                i10 = i15;
                                i12 = i14;
                                z10 = false;
                                String[] strArrSplit3 = strReplaceAll.split(",", -1);
                                f[] fVarArr = new f[strArrSplit3.length];
                                int i20 = 0;
                                while (i20 < strArrSplit3.length) {
                                    String[] strArrSplit4 = strArrSplit3[i20].split("/", -1);
                                    int i21 = i20;
                                    fVarArr[i21] = new f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i12]));
                                    i20 = i21 + 1;
                                    str5 = str5;
                                }
                                str3 = str5;
                                mapArr[i10].put(str4, d.d(fVarArr, this.f48g));
                                i11 = i12;
                                break;
                            case 6:
                            case 8:
                            case 11:
                            default:
                                if (z12) {
                                    a5.a.a(i16, "Data format isn't one of expected formats: ", str5);
                                    break;
                                }
                                break;
                            case 9:
                                i10 = i15;
                                i12 = i14;
                                z11 = false;
                                String[] strArrSplit5 = strReplaceAll.split(",", -1);
                                int length = strArrSplit5.length;
                                int[] iArr3 = new int[length];
                                for (int i22 = 0; i22 < strArrSplit5.length; i22++) {
                                    iArr3[i22] = Integer.parseInt(strArrSplit5[i22]);
                                }
                                HashMap<String, d> map2 = mapArr[i10];
                                ByteOrder byteOrder = this.f48g;
                                ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[iArr[9] * length]);
                                byteBufferWrap.order(byteOrder);
                                for (int i23 = 0; i23 < length; i23++) {
                                    byteBufferWrap.putInt(iArr3[i23]);
                                }
                                map2.put(str4, new d(9, length, byteBufferWrap.array()));
                                str3 = str5;
                                i11 = i12;
                                break;
                            case 10:
                                i10 = i15;
                                z11 = false;
                                String[] strArrSplit6 = strReplaceAll.split(",", -1);
                                int length2 = strArrSplit6.length;
                                f[] fVarArr2 = new f[length2];
                                int i24 = 0;
                                while (i24 < strArrSplit6.length) {
                                    String[] strArrSplit7 = strArrSplit6[i24].split("/", -1);
                                    int i25 = i14;
                                    f[] fVarArr3 = fVarArr2;
                                    fVarArr3[i24] = new f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i25]));
                                    i24++;
                                    iArr = iArr;
                                    i14 = i25;
                                    fVarArr2 = fVarArr3;
                                    strArrSplit6 = strArrSplit6;
                                }
                                int[] iArr4 = iArr;
                                i12 = i14;
                                f[] fVarArr4 = fVarArr2;
                                HashMap<String, d> map3 = mapArr[i10];
                                ByteOrder byteOrder2 = this.f48g;
                                ByteBuffer byteBufferWrap2 = ByteBuffer.wrap(new byte[iArr4[10] * length2]);
                                byteBufferWrap2.order(byteOrder2);
                                for (int i26 = 0; i26 < length2; i26++) {
                                    f fVar = fVarArr4[i26];
                                    byteBufferWrap2.putInt((int) fVar.f78a);
                                    byteBufferWrap2.putInt((int) fVar.f79b);
                                }
                                map3.put(str4, new d(10, length2, byteBufferWrap2.array()));
                                str3 = str5;
                                i11 = i12;
                                break;
                            case 12:
                                String[] strArrSplit8 = strReplaceAll.split(",", -1);
                                int length3 = strArrSplit8.length;
                                double[] dArr = new double[length3];
                                for (int i27 = 0; i27 < strArrSplit8.length; i27++) {
                                    dArr[i27] = Double.parseDouble(strArrSplit8[i27]);
                                }
                                HashMap<String, d> map4 = mapArr[i15];
                                ByteOrder byteOrder3 = this.f48g;
                                ByteBuffer byteBufferWrap3 = ByteBuffer.wrap(new byte[iArr[12] * length3]);
                                byteBufferWrap3.order(byteOrder3);
                                int i28 = 0;
                                while (i28 < length3) {
                                    byteBufferWrap3.putDouble(dArr[i28]);
                                    i28++;
                                    i15 = i15;
                                }
                                i10 = i15;
                                map4.put(str4, new d(12, length3, byteBufferWrap3.array()));
                                str3 = str5;
                                i11 = i14;
                                break;
                        }
                    } else if (i16 == -1 || !(i16 == ((Integer) pairN.first).intValue() || i16 == ((Integer) pairN.second).intValue())) {
                        if (i17 != i14 && i17 != 7 && i17 != i13) {
                            if (z12) {
                                StringBuilder sbA = e.e.a("Given tag (", str4, ") value didn't match with one of expected formats: ");
                                String[] strArr = R;
                                sbA.append(strArr[i17]);
                                sbA.append(i16 == -1 ? "" : ", " + strArr[i16]);
                                sbA.append(" (guess: ");
                                sbA.append(strArr[((Integer) pairN.first).intValue()]);
                                sbA.append(((Integer) pairN.second).intValue() != -1 ? ", " + strArr[((Integer) pairN.second).intValue()] : "");
                                sbA.append(")");
                                Log.d(str5, sbA.toString());
                            }
                        }
                        i16 = i17;
                        int[] iArr5 = S;
                        switch (i16) {
                        }
                    } else {
                        int[] iArr52 = S;
                        switch (i16) {
                        }
                    }
                }
                i10 = i15;
                str3 = str5;
                i11 = i14;
            } else {
                i10 = i15;
                str3 = str5;
                i11 = i14;
            }
            i14 = i11;
            str5 = str3;
            i15 = i10 + 1;
            i13 = 2;
        }
    }

    public final void D(C0002b c0002b) throws Throwable {
        String str;
        d dVar;
        int iH;
        HashMap<String, d> map = this.f46e[4];
        d dVar2 = map.get("Compression");
        if (dVar2 == null) {
            this.f55n = 6;
            o(c0002b, map);
            return;
        }
        int iH2 = dVar2.h(this.f48g);
        this.f55n = iH2;
        int i10 = 1;
        if (iH2 != 1) {
            if (iH2 == 6) {
                o(c0002b, map);
                return;
            } else if (iH2 != 7) {
                return;
            }
        }
        d dVar3 = map.get("BitsPerSample");
        String str2 = "ExifInterface";
        if (dVar3 != null) {
            int[] iArr = (int[]) dVar3.j(this.f48g);
            int[] iArr2 = f38w;
            if (Arrays.equals(iArr2, iArr) || (this.f45d == 3 && (dVar = map.get("PhotometricInterpretation")) != null && (((iH = dVar.h(this.f48g)) == 1 && Arrays.equals(iArr, f39x)) || (iH == 6 && Arrays.equals(iArr, iArr2))))) {
                d dVar4 = map.get("StripOffsets");
                d dVar5 = map.get("StripByteCounts");
                if (dVar4 == null || dVar5 == null) {
                    return;
                }
                long[] jArrC = a5.c.c(dVar4.j(this.f48g));
                long[] jArrC2 = a5.c.c(dVar5.j(this.f48g));
                if (jArrC == null || jArrC.length == 0) {
                    Log.w("ExifInterface", "stripOffsets should not be null or have zero length.");
                    return;
                }
                if (jArrC2 == null || jArrC2.length == 0) {
                    Log.w("ExifInterface", "stripByteCounts should not be null or have zero length.");
                    return;
                }
                if (jArrC.length != jArrC2.length) {
                    Log.w("ExifInterface", "stripOffsets and stripByteCounts should have same length.");
                    return;
                }
                long j10 = 0;
                for (long j11 : jArrC2) {
                    j10 += j11;
                }
                int i11 = (int) j10;
                byte[] bArr = new byte[i11];
                this.f51j = true;
                this.f50i = true;
                this.f49h = true;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                while (i12 < jArrC.length) {
                    int i15 = (int) jArrC[i12];
                    int i16 = (int) jArrC2[i12];
                    if (i12 < jArrC.length - i10) {
                        str = str2;
                        if (i15 + i16 != jArrC[i12 + 1]) {
                            this.f51j = false;
                        }
                    } else {
                        str = str2;
                    }
                    int i17 = i15 - i13;
                    if (i17 < 0) {
                        Log.d(str, "Invalid strip offset value");
                        return;
                    }
                    String str3 = str;
                    try {
                        c0002b.h(i17);
                        int i18 = i13 + i17;
                        byte[] bArr2 = new byte[i16];
                        try {
                            c0002b.readFully(bArr2);
                            i13 = i18 + i16;
                            System.arraycopy(bArr2, 0, bArr, i14, i16);
                            i14 += i16;
                            i12++;
                            str2 = str3;
                            i10 = 1;
                        } catch (EOFException unused) {
                            Log.d(str3, "Failed to read " + i16 + " bytes.");
                            return;
                        }
                    } catch (EOFException unused2) {
                        Log.d(str3, "Failed to skip " + i17 + " bytes.");
                        return;
                    }
                }
                this.f54m = bArr;
                if (this.f51j) {
                    this.f52k = (int) jArrC[0];
                    this.f53l = i11;
                    return;
                }
                return;
            }
        }
        if (f35t) {
            Log.d("ExifInterface", "Unsupported data type value");
        }
    }

    public final void E(int i10, int i11) throws Throwable {
        HashMap<String, d>[] mapArr = this.f46e;
        boolean zIsEmpty = mapArr[i10].isEmpty();
        boolean z10 = f35t;
        if (zIsEmpty || mapArr[i11].isEmpty()) {
            if (z10) {
                Log.d("ExifInterface", "Cannot perform swap since only one image data exists");
                return;
            }
            return;
        }
        d dVar = mapArr[i10].get("ImageLength");
        d dVar2 = mapArr[i10].get("ImageWidth");
        d dVar3 = mapArr[i11].get("ImageLength");
        d dVar4 = mapArr[i11].get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            if (z10) {
                Log.d("ExifInterface", "First image does not contain valid size information");
                return;
            }
            return;
        }
        if (dVar3 == null || dVar4 == null) {
            if (z10) {
                Log.d("ExifInterface", "Second image does not contain valid size information");
                return;
            }
            return;
        }
        int iH = dVar.h(this.f48g);
        int iH2 = dVar2.h(this.f48g);
        int iH3 = dVar3.h(this.f48g);
        int iH4 = dVar4.h(this.f48g);
        if (iH >= iH3 || iH2 >= iH4) {
            return;
        }
        HashMap<String, d> map = mapArr[i10];
        mapArr[i10] = mapArr[i11];
        mapArr[i11] = map;
    }

    public final void F(g gVar, int i10) throws Throwable {
        d dVarE;
        d dVarE2;
        HashMap<String, d>[] mapArr = this.f46e;
        d dVar = mapArr[i10].get("DefaultCropSize");
        d dVar2 = mapArr[i10].get("SensorTopBorder");
        d dVar3 = mapArr[i10].get("SensorLeftBorder");
        d dVar4 = mapArr[i10].get("SensorBottomBorder");
        d dVar5 = mapArr[i10].get("SensorRightBorder");
        if (dVar != null) {
            if (dVar.f70a == 5) {
                f[] fVarArr = (f[]) dVar.j(this.f48g);
                if (fVarArr == null || fVarArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(fVarArr));
                    return;
                } else {
                    dVarE = d.d(new f[]{fVarArr[0]}, this.f48g);
                    dVarE2 = d.d(new f[]{fVarArr[1]}, this.f48g);
                }
            } else {
                int[] iArr = (int[]) dVar.j(this.f48g);
                if (iArr == null || iArr.length != 2) {
                    Log.w("ExifInterface", "Invalid crop size values. cropSize=" + Arrays.toString(iArr));
                    return;
                }
                dVarE = d.e(iArr[0], this.f48g);
                dVarE2 = d.e(iArr[1], this.f48g);
            }
            mapArr[i10].put("ImageWidth", dVarE);
            mapArr[i10].put("ImageLength", dVarE2);
            return;
        }
        if (dVar2 != null && dVar3 != null && dVar4 != null && dVar5 != null) {
            int iH = dVar2.h(this.f48g);
            int iH2 = dVar4.h(this.f48g);
            int iH3 = dVar5.h(this.f48g);
            int iH4 = dVar3.h(this.f48g);
            if (iH2 <= iH || iH3 <= iH4) {
                return;
            }
            d dVarE3 = d.e(iH2 - iH, this.f48g);
            d dVarE4 = d.e(iH3 - iH4, this.f48g);
            mapArr[i10].put("ImageLength", dVarE3);
            mapArr[i10].put("ImageWidth", dVarE4);
            return;
        }
        d dVar6 = mapArr[i10].get("ImageLength");
        d dVar7 = mapArr[i10].get("ImageWidth");
        if (dVar6 == null || dVar7 == null) {
            d dVar8 = mapArr[i10].get("JPEGInterchangeFormat");
            d dVar9 = mapArr[i10].get("JPEGInterchangeFormatLength");
            if (dVar8 == null || dVar9 == null) {
                return;
            }
            int iH5 = dVar8.h(this.f48g);
            int iH6 = dVar8.h(this.f48g);
            gVar.seek(iH5);
            byte[] bArr = new byte[iH6];
            gVar.readFully(bArr);
            e(new C0002b(bArr), iH5, i10);
        }
    }

    public final void G() throws Throwable {
        E(0, 5);
        E(0, 4);
        E(5, 4);
        HashMap<String, d>[] mapArr = this.f46e;
        d dVar = mapArr[1].get("PixelXDimension");
        d dVar2 = mapArr[1].get("PixelYDimension");
        if (dVar != null && dVar2 != null) {
            mapArr[0].put("ImageWidth", dVar);
            mapArr[0].put("ImageLength", dVar2);
        }
        if (mapArr[4].isEmpty() && q(mapArr[5])) {
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        if (!q(mapArr[4])) {
            Log.d("ExifInterface", "No image meets the size requirements of a thumbnail image.");
        }
        y(0, "ThumbnailOrientation", "Orientation");
        y(0, "ThumbnailImageLength", "ImageLength");
        y(0, "ThumbnailImageWidth", "ImageWidth");
        y(5, "ThumbnailOrientation", "Orientation");
        y(5, "ThumbnailImageLength", "ImageLength");
        y(5, "ThumbnailImageWidth", "ImageWidth");
        y(4, "Orientation", "ThumbnailOrientation");
        y(4, "ImageLength", "ThumbnailImageLength");
        y(4, "ImageWidth", "ThumbnailImageWidth");
    }

    public final void H(c cVar) throws IOException {
        HashMap<String, d>[] mapArr;
        char c10;
        char c11;
        int i10;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        e[][] eVarArr = V;
        int[] iArr4 = new int[eVarArr.length];
        int[] iArr5 = new int[eVarArr.length];
        e[] eVarArr2 = W;
        for (e eVar : eVarArr2) {
            x(eVar.f75b);
        }
        if (this.f49h) {
            if (this.f50i) {
                x("StripOffsets");
                x("StripByteCounts");
            } else {
                x("JPEGInterchangeFormat");
                x("JPEGInterchangeFormatLength");
            }
        }
        int i11 = 0;
        while (true) {
            int length = eVarArr.length;
            mapArr = this.f46e;
            if (i11 >= length) {
                break;
            }
            Object[] array = mapArr[i11].entrySet().toArray();
            int length2 = array.length;
            int i12 = 0;
            while (i12 < length2) {
                Map.Entry entry = (Map.Entry) array[i12];
                if (entry.getValue() == null) {
                    iArr3 = iArr4;
                    mapArr[i11].remove(entry.getKey());
                } else {
                    iArr3 = iArr4;
                }
                i12++;
                iArr4 = iArr3;
            }
            i11++;
        }
        int[] iArr6 = iArr4;
        if (!mapArr[1].isEmpty()) {
            mapArr[0].put(eVarArr2[1].f75b, d.b(0L, this.f48g));
        }
        if (mapArr[2].isEmpty()) {
            c10 = 2;
        } else {
            c10 = 2;
            mapArr[0].put(eVarArr2[2].f75b, d.b(0L, this.f48g));
        }
        if (mapArr[3].isEmpty()) {
            c11 = 3;
        } else {
            c11 = 3;
            mapArr[1].put(eVarArr2[3].f75b, d.b(0L, this.f48g));
        }
        if (!this.f49h) {
            i10 = 1;
            iArr = iArr5;
        } else if (this.f50i) {
            mapArr[4].put("StripOffsets", d.e(0, this.f48g));
            mapArr[4].put("StripByteCounts", d.e(this.f53l, this.f48g));
            i10 = 1;
            iArr = iArr5;
        } else {
            mapArr[4].put("JPEGInterchangeFormat", d.b(0L, this.f48g));
            i10 = 1;
            iArr = iArr5;
            mapArr[4].put("JPEGInterchangeFormatLength", d.b(this.f53l, this.f48g));
        }
        int i13 = 0;
        while (true) {
            int length3 = eVarArr.length;
            iArr2 = S;
            if (i13 >= length3) {
                break;
            }
            Iterator<Map.Entry<String, d>> it = mapArr[i13].entrySet().iterator();
            int i14 = 0;
            while (it.hasNext()) {
                d value = it.next().getValue();
                value.getClass();
                int i15 = iArr2[value.f70a] * value.f71b;
                if (i15 > 4) {
                    i14 += i15;
                }
            }
            iArr[i13] = iArr[i13] + i14;
            i13++;
        }
        int size = 8;
        for (int i16 = 0; i16 < eVarArr.length; i16++) {
            if (!mapArr[i16].isEmpty()) {
                iArr6[i16] = size;
                size = (mapArr[i16].size() * 12) + 6 + iArr[i16] + size;
            }
        }
        if (this.f49h) {
            if (this.f50i) {
                mapArr[4].put("StripOffsets", d.e(size, this.f48g));
            } else {
                mapArr[4].put("JPEGInterchangeFormat", d.b(size, this.f48g));
            }
            this.f52k = size;
            size += this.f53l;
        }
        if (this.f45d == 4) {
            size += 8;
        }
        if (f35t) {
            for (int i17 = 0; i17 < eVarArr.length; i17++) {
                Log.d("ExifInterface", String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i17), Integer.valueOf(iArr6[i17]), Integer.valueOf(mapArr[i17].size()), Integer.valueOf(iArr[i17]), Integer.valueOf(size)));
            }
        }
        if (!mapArr[i10].isEmpty()) {
            mapArr[0].put(eVarArr2[i10].f75b, d.b(iArr6[i10], this.f48g));
        }
        if (!mapArr[c10].isEmpty()) {
            mapArr[0].put(eVarArr2[c10].f75b, d.b(iArr6[c10], this.f48g));
        }
        if (!mapArr[c11].isEmpty()) {
            mapArr[i10].put(eVarArr2[c11].f75b, d.b(iArr6[c11], this.f48g));
        }
        int i18 = this.f45d;
        if (i18 == 4) {
            if (size > 65535) {
                throw new IllegalStateException(ad.b.b(size, "Size of exif data (", " bytes) exceeds the max size of a JPEG APP1 segment (65536 bytes)"));
            }
            cVar.E(size);
            cVar.write(f30c0);
        } else if (i18 == 13) {
            cVar.l(size);
            cVar.write(F);
        } else if (i18 == 14) {
            cVar.write(K);
            cVar.l(size);
        }
        cVar.p(this.f48g == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        cVar.f69b = this.f48g;
        cVar.E(42);
        cVar.z(8L);
        for (int i19 = 0; i19 < eVarArr.length; i19++) {
            if (!mapArr[i19].isEmpty()) {
                cVar.E(mapArr[i19].size());
                int size2 = (mapArr[i19].size() * 12) + iArr6[i19] + 2 + 4;
                for (Map.Entry<String, d> entry2 : mapArr[i19].entrySet()) {
                    int i20 = Y[i19].get(entry2.getKey()).f74a;
                    d value2 = entry2.getValue();
                    value2.getClass();
                    int i21 = value2.f71b;
                    int i22 = value2.f70a;
                    int i23 = iArr2[i22] * i21;
                    cVar.E(i20);
                    cVar.E(i22);
                    cVar.l(i21);
                    if (i23 > 4) {
                        cVar.z(size2);
                        size2 += i23;
                    } else {
                        cVar.write(value2.f73d);
                        if (i23 < 4) {
                            while (i23 < 4) {
                                cVar.h(0);
                                i23++;
                            }
                        }
                    }
                }
                if (i19 != 0 || mapArr[4].isEmpty()) {
                    cVar.z(0L);
                } else {
                    cVar.z(iArr6[4]);
                }
                Iterator<Map.Entry<String, d>> it2 = mapArr[i19].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f73d;
                    if (bArr.length > 4) {
                        cVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        if (this.f49h) {
            cVar.write(l());
        }
        if (this.f45d == 14 && size % 2 == i10) {
            cVar.h(0);
        }
        cVar.f69b = ByteOrder.BIG_ENDIAN;
    }

    public final void a() {
        String strB = b("DateTimeOriginal");
        HashMap<String, d>[] mapArr = this.f46e;
        if (strB != null && b("DateTime") == null) {
            mapArr[0].put("DateTime", d.a(strB));
        }
        if (b("ImageWidth") == null) {
            mapArr[0].put("ImageWidth", d.b(0L, this.f48g));
        }
        if (b("ImageLength") == null) {
            mapArr[0].put("ImageLength", d.b(0L, this.f48g));
        }
        if (b("Orientation") == null) {
            mapArr[0].put("Orientation", d.b(0L, this.f48g));
        }
        if (b("LightSource") == null) {
            mapArr[1].put("LightSource", d.b(0L, this.f48g));
        }
    }

    public final String b(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        d dVarC = c(str);
        if (dVarC != null) {
            int i10 = dVarC.f70a;
            if (!Z.contains(str)) {
                return dVarC.i(this.f48g);
            }
            if (str.equals("GPSTimeStamp")) {
                if (i10 != 5 && i10 != 10) {
                    Log.w("ExifInterface", "GPS Timestamp format is not rational. format=" + i10);
                    return null;
                }
                f[] fVarArr = (f[]) dVarC.j(this.f48g);
                if (fVarArr == null || fVarArr.length != 3) {
                    Log.w("ExifInterface", "Invalid GPS Timestamp array. array=" + Arrays.toString(fVarArr));
                    return null;
                }
                f fVar = fVarArr[0];
                Integer numValueOf = Integer.valueOf((int) (fVar.f78a / fVar.f79b));
                f fVar2 = fVarArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (fVar2.f78a / fVar2.f79b));
                f fVar3 = fVarArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (fVar3.f78a / fVar3.f79b)));
            }
            try {
                return Double.toString(dVarC.g(this.f48g));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    public final d c(String str) {
        if (str == null) {
            throw new NullPointerException("tag shouldn't be null");
        }
        if ("ISOSpeedRatings".equals(str)) {
            if (f35t) {
                Log.d("ExifInterface", "getExifAttribute: Replacing TAG_ISO_SPEED_RATINGS with TAG_PHOTOGRAPHIC_SENSITIVITY.");
            }
            str = "PhotographicSensitivity";
        }
        for (int i10 = 0; i10 < V.length; i10++) {
            d dVar = this.f46e[i10].get(str);
            if (dVar != null) {
                return dVar;
            }
        }
        return null;
    }

    public final void d(g gVar) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                c.b.a(mediaMetadataRetriever, new a(gVar));
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
                HashMap<String, d>[] mapArr = this.f46e;
                if (strExtractMetadata != null) {
                    mapArr[0].put("ImageWidth", d.e(Integer.parseInt(strExtractMetadata), this.f48g));
                }
                if (strExtractMetadata2 != null) {
                    mapArr[0].put("ImageLength", d.e(Integer.parseInt(strExtractMetadata2), this.f48g));
                }
                if (strExtractMetadata3 != null) {
                    int i10 = Integer.parseInt(strExtractMetadata3);
                    mapArr[0].put("Orientation", d.e(i10 != 90 ? i10 != 180 ? i10 != 270 ? 1 : 8 : 3 : 6, this.f48g));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i11 = Integer.parseInt(strExtractMetadata4);
                    int i12 = Integer.parseInt(strExtractMetadata5);
                    if (i12 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    gVar.seek(i11);
                    byte[] bArr = new byte[6];
                    gVar.readFully(bArr);
                    int i13 = i11 + 6;
                    int i14 = i12 - 6;
                    if (!Arrays.equals(bArr, f30c0)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i14];
                    gVar.readFully(bArr2);
                    this.f56o = i13;
                    v(0, bArr2);
                }
                if (f35t) {
                    Log.d("ExifInterface", "Heif meta: " + strExtractMetadata + "x" + strExtractMetadata2 + ", rotation " + strExtractMetadata3);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th2) {
            mediaMetadataRetriever.release();
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0190, code lost:
    
        r24.f65c = r23.f48g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0194, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(C0002b c0002b, int i10, int i11) throws Throwable {
        int i12;
        boolean z10 = f35t;
        if (z10) {
            Log.d("ExifInterface", "getJpegAttributes starting with: " + c0002b);
        }
        c0002b.f65c = ByteOrder.BIG_ENDIAN;
        byte b10 = c0002b.readByte();
        byte b11 = -1;
        if (b10 != -1) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b10 & 255));
        }
        if (c0002b.readByte() != -40) {
            throw new IOException("Invalid marker: " + Integer.toHexString(b10 & 255));
        }
        int i13 = 2;
        while (true) {
            byte b12 = c0002b.readByte();
            if (b12 != b11) {
                throw new IOException("Invalid marker:" + Integer.toHexString(b12 & 255));
            }
            byte b13 = c0002b.readByte();
            if (z10) {
                Log.d("ExifInterface", "Found JPEG segment indicator: " + Integer.toHexString(b13 & 255));
            }
            if (b13 != -39 && b13 != -38) {
                int unsignedShort = c0002b.readUnsignedShort();
                int i14 = unsignedShort - 2;
                int i15 = i13 + 4;
                if (z10) {
                    Log.d("ExifInterface", "JPEG segment: " + Integer.toHexString(b13 & 255) + " (length: " + unsignedShort + ")");
                }
                if (i14 < 0) {
                    throw new IOException("Invalid length");
                }
                HashMap<String, d>[] mapArr = this.f46e;
                if (b13 == -31) {
                    byte[] bArr = new byte[i14];
                    c0002b.readFully(bArr);
                    int i16 = i15 + i14;
                    byte[] bArr2 = f30c0;
                    if (bArr2 != null && i14 >= bArr2.length) {
                        for (int i17 = 0; i17 < bArr2.length; i17++) {
                            i12 = 0;
                            if (bArr[i17] == bArr2[i17]) {
                            }
                        }
                        i12 = 0;
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr2.length, i14);
                        this.f56o = i10 + i15 + bArr2.length;
                        v(i11, bArrCopyOfRange);
                        D(new C0002b(bArrCopyOfRange));
                        i15 = i16;
                        i14 = i12;
                    } else {
                        i12 = 0;
                    }
                    byte[] bArr3 = f31d0;
                    if (bArr3 != null && i14 >= bArr3.length) {
                        int i18 = i12;
                        while (true) {
                            if (i18 >= bArr3.length) {
                                int length = i15 + bArr3.length;
                                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, bArr3.length, i14);
                                if (b("Xmp") == null) {
                                    mapArr[i12].put("Xmp", new d(length, bArrCopyOfRange2, 1, bArrCopyOfRange2.length));
                                    this.f60s = true;
                                }
                            } else if (bArr[i18] == bArr3[i18]) {
                                i18++;
                            }
                        }
                    }
                    i15 = i16;
                    i14 = i12;
                } else if (b13 != -2) {
                    switch (b13) {
                        case -64:
                        case -63:
                        case -62:
                        case -61:
                            break;
                        default:
                            switch (b13) {
                                case -59:
                                case -58:
                                case -57:
                                    break;
                                default:
                                    switch (b13) {
                                        case -55:
                                        case -54:
                                        case -53:
                                            break;
                                        default:
                                            switch (b13) {
                                            }
                                    }
                            }
                    }
                    c0002b.h(1);
                    mapArr[i11].put(i11 != 4 ? "ImageLength" : "ThumbnailImageLength", d.b(c0002b.readUnsignedShort(), this.f48g));
                    mapArr[i11].put(i11 != 4 ? "ImageWidth" : "ThumbnailImageWidth", d.b(c0002b.readUnsignedShort(), this.f48g));
                    i14 = unsignedShort - 7;
                } else {
                    byte[] bArr4 = new byte[i14];
                    c0002b.readFully(bArr4);
                    if (b("UserComment") == null) {
                        mapArr[1].put("UserComment", d.a(new String(bArr4, f29b0)));
                    }
                    i14 = 0;
                }
                if (i14 < 0) {
                    throw new IOException("Invalid length");
                }
                c0002b.h(i14);
                i13 = i15 + i14;
                b11 = -1;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:169|12|(4:164|13|150|14)|(16:17|(2:19|20)(1:28)|23|29|(1:31)|32|(4:152|35|(7:154|39|40|(3:43|(1:45)(2:46|(1:48))|(1:179)(3:177|51|52))(1:180)|53|36|37)|176)|34|160|65|162|66|67|(1:73)(1:72)|74|(1:87)(8:156|89|158|90|91|(1:93)(1:94)|95|(1:109)(3:111|(2:112|(2:114|(2:171|116)(1:117))(2:170|118))|(1:120)(4:122|(2:123|(2:125|(1:173)(1:128))(3:172|129|(2:130|(1:174)(2:132|(1:175)(1:135)))))|127|(1:137)(1:139)))))|16|160|65|162|66|67|(3:69|73|74)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0061, code lost:
    
        if (r9 < 16) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00f1, code lost:
    
        r5 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00f6, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00f8, code lost:
    
        if (r5 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00fa, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x00fd, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00fe, code lost:
    
        if (r2 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0100, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0103, code lost:
    
        r0 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(BufferedInputStream bufferedInputStream) throws Throwable {
        C0002b c0002b;
        int i10;
        C0002b c0002b2;
        int i11;
        C0002b c0002b3;
        C0002b c0002b4;
        int i12;
        int i13;
        C0002b c0002b5;
        long j10;
        byte[] bArr;
        long j11;
        bufferedInputStream.mark(5000);
        byte[] bArr2 = new byte[5000];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i14 = 0;
        while (true) {
            byte[] bArr3 = f40y;
            if (i14 >= bArr3.length) {
                return 4;
            }
            if (bArr2[i14] != bArr3[i14]) {
                byte[] bytes = "FUJIFILMCCD-RAW".getBytes(Charset.defaultCharset());
                for (int i15 = 0; i15 < bytes.length; i15++) {
                    if (bArr2[i15] != bytes[i15]) {
                        int i16 = 1;
                        try {
                            c0002b2 = new C0002b(bArr2);
                            try {
                                try {
                                    j10 = c0002b2.readInt();
                                    bArr = new byte[4];
                                    c0002b2.readFully(bArr);
                                } catch (Exception e10) {
                                    e = e10;
                                    i10 = 0;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                c0002b = c0002b2;
                                if (c0002b != null) {
                                    c0002b.close();
                                }
                                throw th;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            i10 = 0;
                            c0002b2 = null;
                        } catch (Throwable th3) {
                            th = th3;
                            c0002b = null;
                        }
                        if (Arrays.equals(bArr, f41z)) {
                            if (j10 == 1) {
                                j10 = c0002b2.readLong();
                                j11 = 16;
                            } else {
                                j11 = 8;
                            }
                            i10 = 0;
                            long j12 = 5000;
                            if (j10 > j12) {
                                j10 = j12;
                            }
                            long j13 = j10 - j11;
                            if (j13 >= 8) {
                                try {
                                    byte[] bArr4 = new byte[4];
                                    boolean z10 = false;
                                    boolean z11 = false;
                                    for (long j14 = 0; j14 < j13 / 4; j14++) {
                                        try {
                                            c0002b2.readFully(bArr4);
                                            if (j14 != 1) {
                                                if (Arrays.equals(bArr4, A)) {
                                                    z10 = true;
                                                } else if (Arrays.equals(bArr4, B)) {
                                                    z11 = true;
                                                }
                                                if (z10 && z11) {
                                                    c0002b2.close();
                                                    return 12;
                                                }
                                            }
                                        } catch (EOFException unused) {
                                        }
                                    }
                                } catch (Exception e12) {
                                    e = e12;
                                    if (f35t) {
                                        Log.d("ExifInterface", "Exception parsing HEIF file type box.", e);
                                    }
                                    if (c0002b2 != null) {
                                        c0002b2.close();
                                    }
                                    C0002b c0002b6 = new C0002b(bArr2);
                                    ByteOrder byteOrderU = u(c0002b6);
                                    this.f48g = byteOrderU;
                                    c0002b6.f65c = byteOrderU;
                                    short s10 = c0002b6.readShort();
                                    if (s10 == 20306) {
                                    }
                                    if (i11 == 0) {
                                    }
                                }
                            }
                            c0002b2.close();
                            C0002b c0002b62 = new C0002b(bArr2);
                            ByteOrder byteOrderU2 = u(c0002b62);
                            this.f48g = byteOrderU2;
                            c0002b62.f65c = byteOrderU2;
                            short s102 = c0002b62.readShort();
                            i11 = (s102 == 20306 || s102 == 21330) ? 1 : i10;
                            c0002b62.close();
                            if (i11 == 0) {
                                return 7;
                            }
                            try {
                                c0002b5 = new C0002b(bArr2);
                            } catch (Exception unused2) {
                                c0002b4 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                c0002b3 = null;
                            }
                            try {
                                ByteOrder byteOrderU3 = u(c0002b5);
                                this.f48g = byteOrderU3;
                                c0002b5.f65c = byteOrderU3;
                                i12 = c0002b5.readShort() == 85 ? 1 : i10;
                                c0002b5.close();
                            } catch (Exception unused3) {
                                c0002b4 = c0002b5;
                                if (c0002b4 != null) {
                                    c0002b4.close();
                                }
                                i12 = i10;
                                if (i12 == 0) {
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                c0002b3 = c0002b5;
                                if (c0002b3 != null) {
                                    c0002b3.close();
                                }
                                throw th;
                            }
                            if (i12 == 0) {
                                return 10;
                            }
                            int i17 = i10;
                            while (true) {
                                byte[] bArr5 = E;
                                if (i17 >= bArr5.length) {
                                    i13 = 1;
                                    break;
                                }
                                if (bArr2[i17] != bArr5[i17]) {
                                    i13 = i10;
                                    break;
                                }
                                i17++;
                            }
                            if (i13 != 0) {
                                return 13;
                            }
                            int i18 = i10;
                            while (true) {
                                byte[] bArr6 = I;
                                if (i18 >= bArr6.length) {
                                    int i19 = i10;
                                    while (true) {
                                        byte[] bArr7 = J;
                                        if (i19 >= bArr7.length) {
                                            break;
                                        }
                                        if (bArr2[bArr6.length + i19 + 4] != bArr7[i19]) {
                                            break;
                                        }
                                        i19++;
                                    }
                                } else {
                                    if (bArr2[i18] != bArr6[i18]) {
                                        break;
                                    }
                                    i18++;
                                }
                            }
                            i16 = i10;
                            if (i16 != 0) {
                                return 14;
                            }
                            return i10;
                        }
                        c0002b2.close();
                        i10 = 0;
                        C0002b c0002b622 = new C0002b(bArr2);
                        ByteOrder byteOrderU22 = u(c0002b622);
                        this.f48g = byteOrderU22;
                        c0002b622.f65c = byteOrderU22;
                        short s1022 = c0002b622.readShort();
                        if (s1022 == 20306) {
                            c0002b622.close();
                        }
                        if (i11 == 0) {
                        }
                    }
                }
                return 9;
            }
            i14++;
        }
    }

    public final void g(g gVar) throws Throwable {
        int i10;
        int i11;
        j(gVar);
        HashMap<String, d>[] mapArr = this.f46e;
        d dVar = mapArr[1].get("MakerNote");
        if (dVar != null) {
            g gVar2 = new g(dVar.f73d);
            gVar2.f65c = this.f48g;
            byte[] bArr = C;
            byte[] bArr2 = new byte[bArr.length];
            gVar2.readFully(bArr2);
            gVar2.seek(0L);
            byte[] bArr3 = D;
            byte[] bArr4 = new byte[bArr3.length];
            gVar2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                gVar2.seek(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                gVar2.seek(12L);
            }
            w(gVar2, 6);
            d dVar2 = mapArr[7].get("PreviewImageStart");
            d dVar3 = mapArr[7].get("PreviewImageLength");
            if (dVar2 != null && dVar3 != null) {
                mapArr[5].put("JPEGInterchangeFormat", dVar2);
                mapArr[5].put("JPEGInterchangeFormatLength", dVar3);
            }
            d dVar4 = mapArr[8].get("AspectFrame");
            if (dVar4 != null) {
                int[] iArr = (int[]) dVar4.j(this.f48g);
                if (iArr == null || iArr.length != 4) {
                    Log.w("ExifInterface", "Invalid aspect frame values. frame=" + Arrays.toString(iArr));
                    return;
                }
                int i12 = iArr[2];
                int i13 = iArr[0];
                if (i12 <= i13 || (i10 = iArr[3]) <= (i11 = iArr[1])) {
                    return;
                }
                int i14 = (i12 - i13) + 1;
                int i15 = (i10 - i11) + 1;
                if (i14 < i15) {
                    int i16 = i14 + i15;
                    i15 = i16 - i15;
                    i14 = i16 - i15;
                }
                d dVarE = d.e(i14, this.f48g);
                d dVarE2 = d.e(i15, this.f48g);
                mapArr[0].put("ImageWidth", dVarE);
                mapArr[0].put("ImageLength", dVarE2);
            }
        }
    }

    public final void h(C0002b c0002b) throws Throwable {
        if (f35t) {
            Log.d("ExifInterface", "getPngAttributes starting with: " + c0002b);
        }
        c0002b.f65c = ByteOrder.BIG_ENDIAN;
        byte[] bArr = E;
        c0002b.h(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i10 = c0002b.readInt();
                byte[] bArr2 = new byte[4];
                c0002b.readFully(bArr2);
                int i11 = length + 8;
                if (i11 == 16 && !Arrays.equals(bArr2, G)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, H)) {
                    return;
                }
                if (Arrays.equals(bArr2, F)) {
                    byte[] bArr3 = new byte[i10];
                    c0002b.readFully(bArr3);
                    int i12 = c0002b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i12) {
                        this.f56o = i11;
                        v(0, bArr3);
                        G();
                        D(new C0002b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i12 + ", calculated CRC value: " + crc32.getValue());
                }
                int i13 = i10 + 4;
                c0002b.h(i13);
                length = i11 + i13;
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt PNG file.");
            }
        }
    }

    public final void i(C0002b c0002b) throws Throwable {
        boolean z10 = f35t;
        if (z10) {
            Log.d("ExifInterface", "getRafAttributes starting with: " + c0002b);
        }
        c0002b.h(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c0002b.readFully(bArr);
        c0002b.readFully(bArr2);
        c0002b.readFully(bArr3);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        int i11 = ByteBuffer.wrap(bArr2).getInt();
        int i12 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i11];
        c0002b.h(i10 - c0002b.f64b);
        c0002b.readFully(bArr4);
        e(new C0002b(bArr4), i10, 5);
        c0002b.h(i12 - c0002b.f64b);
        c0002b.f65c = ByteOrder.BIG_ENDIAN;
        int i13 = c0002b.readInt();
        if (z10) {
            a5.a.a(i13, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        for (int i14 = 0; i14 < i13; i14++) {
            int unsignedShort = c0002b.readUnsignedShort();
            int unsignedShort2 = c0002b.readUnsignedShort();
            if (unsignedShort == U.f74a) {
                short s10 = c0002b.readShort();
                short s11 = c0002b.readShort();
                d dVarE = d.e(s10, this.f48g);
                d dVarE2 = d.e(s11, this.f48g);
                HashMap<String, d>[] mapArr = this.f46e;
                mapArr[0].put("ImageLength", dVarE);
                mapArr[0].put("ImageWidth", dVarE2);
                if (z10) {
                    Log.d("ExifInterface", "Updated to length: " + ((int) s10) + ", width: " + ((int) s11));
                    return;
                }
                return;
            }
            c0002b.h(unsignedShort2);
        }
    }

    public final void j(g gVar) throws Throwable {
        s(gVar);
        w(gVar, 0);
        F(gVar, 0);
        F(gVar, 5);
        F(gVar, 4);
        G();
        if (this.f45d == 8) {
            HashMap<String, d>[] mapArr = this.f46e;
            d dVar = mapArr[1].get("MakerNote");
            if (dVar != null) {
                g gVar2 = new g(dVar.f73d);
                gVar2.f65c = this.f48g;
                gVar2.h(6);
                w(gVar2, 9);
                d dVar2 = mapArr[9].get("ColorSpace");
                if (dVar2 != null) {
                    mapArr[1].put("ColorSpace", dVar2);
                }
            }
        }
    }

    public final void k(g gVar) throws Throwable {
        if (f35t) {
            Log.d("ExifInterface", "getRw2Attributes starting with: " + gVar);
        }
        j(gVar);
        HashMap<String, d>[] mapArr = this.f46e;
        d dVar = mapArr[0].get("JpgFromRaw");
        if (dVar != null) {
            e(new C0002b(dVar.f73d), (int) dVar.f72c, 5);
        }
        d dVar2 = mapArr[0].get("ISO");
        d dVar3 = mapArr[1].get("PhotographicSensitivity");
        if (dVar2 == null || dVar3 != null) {
            return;
        }
        mapArr[1].put("PhotographicSensitivity", dVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final byte[] l() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        Exception e10;
        InputStream inputStream = null;
        if (this.f49h) {
            byte[] bArr = this.f54m;
            if (bArr != null) {
                return bArr;
            }
            try {
                fileInputStream = this.f44c;
                if (fileInputStream != null) {
                    try {
                        if (!fileInputStream.markSupported()) {
                            Log.d("ExifInterface", "Cannot read thumbnail from inputstream without mark/reset support");
                            a5.c.b(fileInputStream);
                            return null;
                        }
                        fileInputStream.reset();
                        fileDescriptor = null;
                        try {
                            try {
                                C0002b c0002b = new C0002b(fileInputStream);
                                c0002b.h(this.f52k + this.f56o);
                                byte[] bArr2 = new byte[this.f53l];
                                c0002b.readFully(bArr2);
                                this.f54m = bArr2;
                                a5.c.b(fileInputStream);
                                if (fileDescriptor != null) {
                                    a5.c.a(fileDescriptor);
                                }
                                return bArr2;
                            } catch (Exception e11) {
                                e10 = e11;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = fileInputStream;
                            a5.c.b(inputStream);
                            if (fileDescriptor != null) {
                                a5.c.a(fileDescriptor);
                            }
                            throw th;
                        }
                    } catch (Exception e12) {
                        e10 = e12;
                        fileDescriptor = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileDescriptor = null;
                        inputStream = fileInputStream;
                        a5.c.b(inputStream);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                } else {
                    if (this.f42a != null) {
                        fileInputStream = new FileInputStream(this.f42a);
                        fileDescriptor = null;
                        C0002b c0002b2 = new C0002b(fileInputStream);
                        c0002b2.h(this.f52k + this.f56o);
                        byte[] bArr22 = new byte[this.f53l];
                        c0002b2.readFully(bArr22);
                        this.f54m = bArr22;
                        a5.c.b(fileInputStream);
                        if (fileDescriptor != null) {
                        }
                        return bArr22;
                    }
                    FileDescriptor fileDescriptorB = c.a.b(this.f43b);
                    try {
                        c.a.c(fileDescriptorB, 0L, OsConstants.SEEK_SET);
                        fileDescriptor = fileDescriptorB;
                        fileInputStream = new FileInputStream(fileDescriptorB);
                        C0002b c0002b22 = new C0002b(fileInputStream);
                        c0002b22.h(this.f52k + this.f56o);
                        byte[] bArr222 = new byte[this.f53l];
                        c0002b22.readFully(bArr222);
                        this.f54m = bArr222;
                        a5.c.b(fileInputStream);
                        if (fileDescriptor != null) {
                        }
                        return bArr222;
                    } catch (Exception e13) {
                        e10 = e13;
                        fileDescriptor = fileDescriptorB;
                        fileInputStream = null;
                    } catch (Throwable th4) {
                        th = th4;
                        fileDescriptor = fileDescriptorB;
                        a5.c.b(inputStream);
                        if (fileDescriptor != null) {
                        }
                        throw th;
                    }
                }
            } catch (Exception e14) {
                fileInputStream = null;
                e10 = e14;
                fileDescriptor = null;
            } catch (Throwable th5) {
                th = th5;
                fileDescriptor = null;
            }
            Log.d("ExifInterface", "Encountered exception while getting thumbnail", e10);
            a5.c.b(fileInputStream);
            if (fileDescriptor != null) {
                a5.c.a(fileDescriptor);
            }
        }
        return null;
    }

    public final void m(C0002b c0002b) throws Throwable {
        if (f35t) {
            Log.d("ExifInterface", "getWebpAttributes starting with: " + c0002b);
        }
        c0002b.f65c = ByteOrder.LITTLE_ENDIAN;
        c0002b.h(I.length);
        int i10 = c0002b.readInt() + 8;
        byte[] bArr = J;
        c0002b.h(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                c0002b.readFully(bArr2);
                int i11 = c0002b.readInt();
                int i12 = length + 8;
                if (Arrays.equals(K, bArr2)) {
                    byte[] bArr3 = new byte[i11];
                    c0002b.readFully(bArr3);
                    this.f56o = i12;
                    v(0, bArr3);
                    D(new C0002b(bArr3));
                    return;
                }
                if (i11 % 2 == 1) {
                    i11++;
                }
                length = i12 + i11;
                if (length == i10) {
                    return;
                }
                if (length > i10) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c0002b.h(i11);
            } catch (EOFException unused) {
                throw new IOException("Encountered corrupt WebP file.");
            }
        }
    }

    public final void o(C0002b c0002b, HashMap map) throws Throwable {
        d dVar = (d) map.get("JPEGInterchangeFormat");
        d dVar2 = (d) map.get("JPEGInterchangeFormatLength");
        if (dVar == null || dVar2 == null) {
            return;
        }
        int iH = dVar.h(this.f48g);
        int iH2 = dVar2.h(this.f48g);
        if (this.f45d == 7) {
            iH += this.f57p;
        }
        if (iH > 0 && iH2 > 0) {
            this.f49h = true;
            if (this.f42a == null && this.f44c == null && this.f43b == null) {
                byte[] bArr = new byte[iH2];
                c0002b.h(iH);
                c0002b.readFully(bArr);
                this.f54m = bArr;
            }
            this.f52k = iH;
            this.f53l = iH2;
        }
        if (f35t) {
            Log.d("ExifInterface", "Setting thumbnail attributes with offset: " + iH + ", length: " + iH2);
        }
    }

    public final boolean q(HashMap map) throws IOException {
        d dVar = (d) map.get("ImageLength");
        d dVar2 = (d) map.get("ImageWidth");
        if (dVar == null || dVar2 == null) {
            return false;
        }
        return dVar.h(this.f48g) <= 512 && dVar2.h(this.f48g) <= 512;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0091 A[Catch: all -> 0x0017, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:5:0x0006, B:7:0x000b, B:14:0x0020, B:20:0x003d, B:22:0x0048, B:30:0x005e, B:25:0x004f, B:28:0x0057, B:29:0x005b, B:31:0x0068, B:33:0x0071, B:35:0x0077, B:37:0x007d, B:39:0x0083, B:45:0x0091), top: B:57:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r(InputStream inputStream) {
        boolean z10 = f35t;
        if (inputStream == null) {
            throw new NullPointerException("inputstream shouldn't be null");
        }
        for (int i10 = 0; i10 < V.length; i10++) {
            try {
                try {
                    this.f46e[i10] = new HashMap<>();
                } catch (Throwable th2) {
                    a();
                    if (z10) {
                        t();
                    }
                    throw th2;
                }
            } catch (IOException e10) {
                e = e10;
                if (z10) {
                    Log.w("ExifInterface", "Invalid image: ExifInterface got an unsupported image format file(ExifInterface supports JPEG and some RAW image formats only) or a corrupted JPEG file to ExifInterface.", e);
                }
                a();
                if (z10) {
                    return;
                }
                t();
                return;
            } catch (UnsupportedOperationException e11) {
                e = e11;
                if (z10) {
                }
                a();
                if (z10) {
                }
            }
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
        int iF = f(bufferedInputStream);
        this.f45d = iF;
        if (iF == 4 || iF == 9 || iF == 13 || iF == 14) {
            C0002b c0002b = new C0002b(bufferedInputStream);
            int i11 = this.f45d;
            if (i11 == 4) {
                e(c0002b, 0, 0);
            } else if (i11 == 13) {
                h(c0002b);
            } else if (i11 == 9) {
                i(c0002b);
            } else if (i11 == 14) {
                m(c0002b);
            }
        } else {
            g gVar = new g(bufferedInputStream);
            int i12 = this.f45d;
            if (i12 == 12) {
                d(gVar);
            } else if (i12 == 7) {
                g(gVar);
            } else if (i12 == 10) {
                k(gVar);
            } else {
                j(gVar);
            }
            gVar.seek(this.f56o);
            D(gVar);
        }
        a();
        if (z10) {
            t();
        }
    }

    public final void s(g gVar) throws IOException {
        ByteOrder byteOrderU = u(gVar);
        this.f48g = byteOrderU;
        gVar.f65c = byteOrderU;
        int unsignedShort = gVar.readUnsignedShort();
        int i10 = this.f45d;
        if (i10 != 7 && i10 != 10 && unsignedShort != 42) {
            throw new IOException("Invalid start code: " + Integer.toHexString(unsignedShort));
        }
        int i11 = gVar.readInt();
        if (i11 < 8) {
            throw new IOException(y.a(i11, "Invalid first Ifd offset: "));
        }
        int i12 = i11 - 8;
        if (i12 > 0) {
            gVar.h(i12);
        }
    }

    public final void t() {
        int i10 = 0;
        while (true) {
            HashMap<String, d>[] mapArr = this.f46e;
            if (i10 >= mapArr.length) {
                return;
            }
            StringBuilder sbB = i0.b(i10, "The size of tag group[", "]: ");
            sbB.append(mapArr[i10].size());
            Log.d("ExifInterface", sbB.toString());
            for (Map.Entry<String, d> entry : mapArr[i10].entrySet()) {
                d value = entry.getValue();
                Log.d("ExifInterface", "tagName: " + entry.getKey() + ", tagType: " + value.toString() + ", tagValue: '" + value.i(this.f48g) + "'");
            }
            i10++;
        }
    }

    public final void v(int i10, byte[] bArr) throws IOException {
        g gVar = new g(bArr);
        s(gVar);
        w(gVar, i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(g gVar, int i10) throws IOException {
        HashMap<String, d>[] mapArr;
        HashSet hashSet;
        boolean z10;
        short s10;
        HashMap<String, d>[] mapArr2;
        long j10;
        long j11;
        boolean z11;
        int i11;
        long j12;
        int i12;
        e eVar;
        HashSet hashSet2;
        String str;
        int unsignedShort;
        long j13;
        int i13 = i10;
        int i14 = gVar.f64b;
        int i15 = gVar.f67e;
        Integer numValueOf = Integer.valueOf(i14);
        HashSet hashSet3 = this.f47f;
        hashSet3.add(numValueOf);
        short s11 = gVar.readShort();
        String str2 = "ExifInterface";
        boolean z12 = f35t;
        if (z12) {
            a5.a.a(s11, "numberOfDirectoryEntry: ", "ExifInterface");
        }
        if (s11 <= 0) {
            return;
        }
        short s12 = 0;
        while (true) {
            mapArr = this.f46e;
            if (s12 >= s11) {
                break;
            }
            int unsignedShort2 = gVar.readUnsignedShort();
            int unsignedShort3 = gVar.readUnsignedShort();
            int i16 = gVar.readInt();
            long j14 = gVar.f64b + 4;
            short s13 = s11;
            e eVar2 = X[i13].get(Integer.valueOf(unsignedShort2));
            if (z12) {
                z10 = z12;
                s10 = s12;
                mapArr2 = mapArr;
                hashSet = hashSet3;
                Log.d(str2, String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i13), Integer.valueOf(unsignedShort2), eVar2 != null ? eVar2.f75b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i16)));
            } else {
                hashSet = hashSet3;
                z10 = z12;
                s10 = s12;
                mapArr2 = mapArr;
            }
            if (eVar2 != null) {
                if (unsignedShort3 > 0) {
                    if (unsignedShort3 < S.length) {
                        int i17 = eVar2.f76c;
                        if (i17 == 7 || unsignedShort3 == 7 || i17 == unsignedShort3 || (i11 = eVar2.f77d) == unsignedShort3 || (((i17 == 4 || i11 == 4) && unsignedShort3 == 3) || (((i17 == 9 || i11 == 9) && unsignedShort3 == 8) || ((i17 == 12 || i11 == 12) && unsignedShort3 == 11)))) {
                            if (unsignedShort3 == 7) {
                                unsignedShort3 = i17;
                            }
                            j10 = j14;
                            j11 = i16 * r13[unsignedShort3];
                            if (j11 < 0 || j11 > 2147483647L) {
                                if (z10) {
                                    a5.a.a(i16, "Skip the tag entry since the number of components is invalid: ", str2);
                                }
                                z11 = false;
                                if (z11) {
                                    gVar.seek(j10);
                                    str = str2;
                                    hashSet2 = hashSet;
                                } else {
                                    long j15 = j10;
                                    if (j11 > 4) {
                                        int i18 = gVar.readInt();
                                        if (z10) {
                                            a5.a.a(i18, "seek to data offset: ", str2);
                                        }
                                        i12 = unsignedShort2;
                                        if (this.f45d != 7) {
                                            eVar = eVar2;
                                            j12 = j15;
                                            gVar.seek(i18);
                                        } else {
                                            if ("MakerNote".equals(eVar2.f75b)) {
                                                this.f57p = i18;
                                            } else {
                                                if (i13 == 6 && "ThumbnailImage".equals(eVar2.f75b)) {
                                                    this.f58q = i18;
                                                    this.f59r = i16;
                                                    d dVarE = d.e(6, this.f48g);
                                                    j12 = j15;
                                                    d dVarB = d.b(this.f58q, this.f48g);
                                                    eVar = eVar2;
                                                    d dVarB2 = d.b(this.f59r, this.f48g);
                                                    mapArr2[4].put("Compression", dVarE);
                                                    mapArr2[4].put("JPEGInterchangeFormat", dVarB);
                                                    mapArr2[4].put("JPEGInterchangeFormatLength", dVarB2);
                                                }
                                                gVar.seek(i18);
                                            }
                                            eVar = eVar2;
                                            j12 = j15;
                                            gVar.seek(i18);
                                        }
                                    } else {
                                        j12 = j15;
                                        i12 = unsignedShort2;
                                        eVar = eVar2;
                                    }
                                    Integer num = f28a0.get(Integer.valueOf(i12));
                                    if (z10) {
                                        Log.d(str2, "nextIfdType: " + num + " byteCount: " + j11);
                                    }
                                    if (num != null) {
                                        if (unsignedShort3 != 3) {
                                            if (unsignedShort3 == 4) {
                                                j13 = gVar.readInt() & BodyPartID.bodyIdMax;
                                            } else if (unsignedShort3 == 8) {
                                                unsignedShort = gVar.readShort();
                                            } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                                                unsignedShort = gVar.readInt();
                                            } else {
                                                j13 = -1;
                                            }
                                            if (z10) {
                                                Log.d(str2, String.format("Offset: %d, tagName: %s", Long.valueOf(j13), eVar.f75b));
                                            }
                                            if (j13 > 0 || (i15 != -1 && j13 >= i15)) {
                                                hashSet2 = hashSet;
                                                if (z10) {
                                                    String strA = r.a("Skip jump into the IFD since its offset is invalid: ", j13);
                                                    if (i15 != -1) {
                                                        strA = strA + " (total length: " + i15 + ")";
                                                    }
                                                    Log.d(str2, strA);
                                                }
                                            } else {
                                                hashSet2 = hashSet;
                                                if (!hashSet2.contains(Integer.valueOf((int) j13))) {
                                                    gVar.seek(j13);
                                                    w(gVar, num.intValue());
                                                } else if (z10) {
                                                    Log.d(str2, "Skip jump into the IFD since it has already been read: IfdType " + num + " (at " + j13 + ")");
                                                }
                                            }
                                            gVar.seek(j12);
                                            str = str2;
                                        } else {
                                            unsignedShort = gVar.readUnsignedShort();
                                        }
                                        j13 = unsignedShort;
                                        if (z10) {
                                        }
                                        if (j13 > 0) {
                                            hashSet2 = hashSet;
                                            if (z10) {
                                            }
                                            gVar.seek(j12);
                                            str = str2;
                                        }
                                    } else {
                                        hashSet2 = hashSet;
                                        long j16 = j12;
                                        int i19 = gVar.f64b + this.f56o;
                                        byte[] bArr = new byte[(int) j11];
                                        gVar.readFully(bArr);
                                        str = str2;
                                        d dVar = new d(i19, bArr, unsignedShort3, i16);
                                        HashMap<String, d> map = mapArr2[i10];
                                        String str3 = eVar.f75b;
                                        map.put(str3, dVar);
                                        if ("DNGVersion".equals(str3)) {
                                            this.f45d = 3;
                                        }
                                        if ((("Make".equals(str3) || "Model".equals(str3)) && dVar.i(this.f48g).contains("PENTAX")) || ("Compression".equals(str3) && dVar.h(this.f48g) == 65535)) {
                                            this.f45d = 8;
                                        }
                                        if (gVar.f64b != j16) {
                                            gVar.seek(j16);
                                        }
                                    }
                                }
                                s12 = (short) (s10 + 1);
                                i13 = i10;
                                str2 = str;
                                hashSet3 = hashSet2;
                                s11 = s13;
                                z12 = z10;
                            } else {
                                z11 = true;
                                if (z11) {
                                }
                                s12 = (short) (s10 + 1);
                                i13 = i10;
                                str2 = str;
                                hashSet3 = hashSet2;
                                s11 = s13;
                                z12 = z10;
                            }
                        } else if (z10) {
                            Log.d(str2, "Skip the tag entry since data format (" + R[unsignedShort3] + ") is unexpected for tag: " + eVar2.f75b);
                        }
                    }
                }
                j10 = j14;
                if (z10) {
                    a5.a.a(unsignedShort3, "Skip the tag entry since data format is invalid: ", str2);
                }
                j11 = 0;
                z11 = false;
                if (z11) {
                }
                s12 = (short) (s10 + 1);
                i13 = i10;
                str2 = str;
                hashSet3 = hashSet2;
                s11 = s13;
                z12 = z10;
            } else if (z10) {
                a5.a.a(unsignedShort2, "Skip the tag entry since tag number is not defined: ", str2);
            }
            j10 = j14;
            j11 = 0;
            z11 = false;
            if (z11) {
            }
            s12 = (short) (s10 + 1);
            i13 = i10;
            str2 = str;
            hashSet3 = hashSet2;
            s11 = s13;
            z12 = z10;
        }
        HashSet hashSet4 = hashSet3;
        String str4 = str2;
        boolean z13 = z12;
        int i20 = gVar.readInt();
        if (z13) {
            Log.d(str4, String.format("nextIfdOffset: %d", Integer.valueOf(i20)));
        }
        long j17 = i20;
        if (j17 <= 0) {
            if (z13) {
                a5.a.a(i20, "Stop reading file since a wrong offset may cause an infinite loop: ", str4);
            }
        } else {
            if (hashSet4.contains(Integer.valueOf(i20))) {
                if (z13) {
                    a5.a.a(i20, "Stop reading file since re-reading an IFD may cause an infinite loop: ", str4);
                    return;
                }
                return;
            }
            gVar.seek(j17);
            if (mapArr[4].isEmpty()) {
                w(gVar, 4);
            } else if (mapArr[5].isEmpty()) {
                w(gVar, 5);
            }
        }
    }

    public final void x(String str) {
        for (int i10 = 0; i10 < V.length; i10++) {
            this.f46e[i10].remove(str);
        }
    }

    public final void y(int i10, String str, String str2) {
        HashMap<String, d>[] mapArr = this.f46e;
        if (mapArr[i10].isEmpty() || mapArr[i10].get(str) == null) {
            return;
        }
        HashMap<String, d> map = mapArr[i10];
        map.put(str2, map.get(str));
        mapArr[i10].remove(str);
    }

    public final void z(BufferedInputStream bufferedInputStream, BufferedOutputStream bufferedOutputStream) throws IOException {
        if (f35t) {
            Log.d("ExifInterface", "saveJpegAttributes starting with (inputStream: " + bufferedInputStream + ", outputStream: " + bufferedOutputStream + ")");
        }
        C0002b c0002b = new C0002b(bufferedInputStream);
        c cVar = new c(bufferedOutputStream, ByteOrder.BIG_ENDIAN);
        if (c0002b.readByte() != -1) {
            throw new IOException("Invalid marker");
        }
        cVar.h(-1);
        if (c0002b.readByte() != -40) {
            throw new IOException("Invalid marker");
        }
        cVar.h(-40);
        String strB = b("Xmp");
        HashMap<String, d>[] mapArr = this.f46e;
        d dVarRemove = (strB == null || !this.f60s) ? null : mapArr[0].remove("Xmp");
        cVar.h(-1);
        cVar.h(-31);
        H(cVar);
        if (dVarRemove != null) {
            mapArr[0].put("Xmp", dVarRemove);
        }
        byte[] bArr = new byte[4096];
        while (c0002b.readByte() == -1) {
            byte b10 = c0002b.readByte();
            if (b10 == -39 || b10 == -38) {
                cVar.h(-1);
                cVar.h(b10);
                a5.c.e(c0002b, cVar);
                return;
            }
            if (b10 != -31) {
                cVar.h(-1);
                cVar.h(b10);
                int unsignedShort = c0002b.readUnsignedShort();
                cVar.E(unsignedShort);
                int i10 = unsignedShort - 2;
                if (i10 < 0) {
                    throw new IOException("Invalid length");
                }
                while (i10 > 0) {
                    int i11 = c0002b.read(bArr, 0, Math.min(i10, 4096));
                    if (i11 >= 0) {
                        cVar.write(bArr, 0, i11);
                        i10 -= i11;
                    }
                }
            } else {
                int unsignedShort2 = c0002b.readUnsignedShort();
                int i12 = unsignedShort2 - 2;
                if (i12 < 0) {
                    throw new IOException("Invalid length");
                }
                byte[] bArr2 = new byte[6];
                if (i12 >= 6) {
                    c0002b.readFully(bArr2);
                    if (Arrays.equals(bArr2, f30c0)) {
                        c0002b.h(unsignedShort2 - 8);
                    }
                }
                cVar.h(-1);
                cVar.h(b10);
                cVar.E(unsignedShort2);
                if (i12 >= 6) {
                    i12 = unsignedShort2 - 8;
                    cVar.write(bArr2);
                }
                while (i12 > 0) {
                    int i13 = c0002b.read(bArr, 0, Math.min(i12, 4096));
                    if (i13 >= 0) {
                        cVar.write(bArr, 0, i13);
                        i12 -= i13;
                    }
                }
            }
        }
        throw new IOException("Invalid marker");
    }

    /* renamed from: a5.b$b, reason: collision with other inner class name */
    public static class C0002b extends InputStream implements DataInput {

        /* renamed from: a, reason: collision with root package name */
        public final DataInputStream f63a;

        /* renamed from: b, reason: collision with root package name */
        public int f64b;

        /* renamed from: c, reason: collision with root package name */
        public ByteOrder f65c;

        /* renamed from: d, reason: collision with root package name */
        public byte[] f66d;

        /* renamed from: e, reason: collision with root package name */
        public final int f67e;

        public C0002b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
            this.f67e = bArr.length;
        }

        @Override // java.io.InputStream
        public final int available() throws IOException {
            return this.f63a.available();
        }

        public final void h(int i10) throws IOException {
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10 - i11;
                DataInputStream dataInputStream = this.f63a;
                int iSkip = (int) dataInputStream.skip(i12);
                if (iSkip <= 0) {
                    if (this.f66d == null) {
                        this.f66d = new byte[8192];
                    }
                    iSkip = dataInputStream.read(this.f66d, 0, Math.min(8192, i12));
                    if (iSkip == -1) {
                        throw new EOFException(ad.b.b(i10, "Reached EOF while skipping ", " bytes."));
                    }
                }
                i11 += iSkip;
            }
            this.f64b += i11;
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        @Override // java.io.InputStream
        public final int read() throws IOException {
            this.f64b++;
            return this.f63a.read();
        }

        @Override // java.io.DataInput
        public final boolean readBoolean() throws IOException {
            this.f64b++;
            return this.f63a.readBoolean();
        }

        @Override // java.io.DataInput
        public final byte readByte() throws IOException {
            this.f64b++;
            int i10 = this.f63a.read();
            if (i10 >= 0) {
                return (byte) i10;
            }
            throw new EOFException();
        }

        @Override // java.io.DataInput
        public final char readChar() throws IOException {
            this.f64b += 2;
            return this.f63a.readChar();
        }

        @Override // java.io.DataInput
        public final double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public final float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr, int i10, int i11) throws IOException {
            this.f64b += i11;
            this.f63a.readFully(bArr, i10, i11);
        }

        @Override // java.io.DataInput
        public final int readInt() throws IOException {
            this.f64b += 4;
            DataInputStream dataInputStream = this.f63a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f65c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i13 << 24) + (i12 << 16) + (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 24) + (i11 << 16) + (i12 << 8) + i13;
            }
            throw new IOException("Invalid byte order: " + this.f65c);
        }

        @Override // java.io.DataInput
        public final String readLine() throws IOException {
            Log.d("ExifInterface", "Currently unsupported");
            return null;
        }

        @Override // java.io.DataInput
        public final long readLong() throws IOException {
            long j10;
            long j11;
            this.f64b += 8;
            DataInputStream dataInputStream = this.f63a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            int i12 = dataInputStream.read();
            int i13 = dataInputStream.read();
            int i14 = dataInputStream.read();
            int i15 = dataInputStream.read();
            int i16 = dataInputStream.read();
            int i17 = dataInputStream.read();
            if ((i10 | i11 | i12 | i13 | i14 | i15 | i16 | i17) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f65c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j10 = (i17 << 56) + (i16 << 48) + (i15 << 40) + (i14 << 32) + (i13 << 24) + (i12 << 16) + (i11 << 8);
                j11 = i10;
            } else {
                if (byteOrder != ByteOrder.BIG_ENDIAN) {
                    throw new IOException("Invalid byte order: " + this.f65c);
                }
                j10 = (i10 << 56) + (i11 << 48) + (i12 << 40) + (i13 << 32) + (i14 << 24) + (i15 << 16) + (i16 << 8);
                j11 = i17;
            }
            return j10 + j11;
        }

        @Override // java.io.DataInput
        public final short readShort() throws IOException {
            this.f64b += 2;
            DataInputStream dataInputStream = this.f63a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f65c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((i11 << 8) + i10);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((i10 << 8) + i11);
            }
            throw new IOException("Invalid byte order: " + this.f65c);
        }

        @Override // java.io.DataInput
        public final String readUTF() throws IOException {
            this.f64b += 2;
            return this.f63a.readUTF();
        }

        @Override // java.io.DataInput
        public final int readUnsignedByte() throws IOException {
            this.f64b++;
            return this.f63a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public final int readUnsignedShort() throws IOException {
            this.f64b += 2;
            DataInputStream dataInputStream = this.f63a;
            int i10 = dataInputStream.read();
            int i11 = dataInputStream.read();
            if ((i10 | i11) < 0) {
                throw new EOFException();
            }
            ByteOrder byteOrder = this.f65c;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (i11 << 8) + i10;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (i10 << 8) + i11;
            }
            throw new IOException("Invalid byte order: " + this.f65c);
        }

        @Override // java.io.InputStream
        public final void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public final int skipBytes(int i10) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        public C0002b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        @Override // java.io.InputStream
        public final int read(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.f63a.read(bArr, i10, i11);
            this.f64b += i12;
            return i12;
        }

        @Override // java.io.DataInput
        public final void readFully(byte[] bArr) throws IOException {
            this.f64b += bArr.length;
            this.f63a.readFully(bArr);
        }

        public C0002b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f63a = dataInputStream;
            dataInputStream.mark(0);
            this.f64b = 0;
            this.f65c = byteOrder;
            this.f67e = inputStream instanceof C0002b ? ((C0002b) inputStream).f67e : -1;
        }
    }

    public static class g extends C0002b {
        public g(byte[] bArr) throws IOException {
            super(bArr);
            this.f63a.mark(Integer.MAX_VALUE);
        }

        public final void seek(long j10) throws IOException {
            int i10 = this.f64b;
            if (i10 > j10) {
                this.f64b = 0;
                this.f63a.reset();
            } else {
                j10 -= i10;
            }
            h((int) j10);
        }

        public g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f63a.mark(Integer.MAX_VALUE);
                return;
            }
            throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f74a;

        /* renamed from: b, reason: collision with root package name */
        public final String f75b;

        /* renamed from: c, reason: collision with root package name */
        public final int f76c;

        /* renamed from: d, reason: collision with root package name */
        public final int f77d;

        public e(String str, int i10, int i11) {
            this.f75b = str;
            this.f74a = i10;
            this.f76c = i11;
            this.f77d = -1;
        }

        public e(String str, int i10, int i11, int i12) {
            this.f75b = str;
            this.f74a = i10;
            this.f76c = i11;
            this.f77d = i12;
        }
    }

    public b(FileDescriptor fileDescriptor) throws Throwable {
        boolean z10;
        FileInputStream fileInputStream;
        Throwable th2;
        e[][] eVarArr = V;
        this.f46e = new HashMap[eVarArr.length];
        this.f47f = new HashSet(eVarArr.length);
        this.f48g = ByteOrder.BIG_ENDIAN;
        if (fileDescriptor != null) {
            this.f44c = null;
            this.f42a = null;
            if (p(fileDescriptor)) {
                this.f43b = fileDescriptor;
                try {
                    fileDescriptor = c.a.b(fileDescriptor);
                    z10 = true;
                } catch (Exception e10) {
                    throw new IOException("Failed to duplicate file descriptor", e10);
                }
            } else {
                this.f43b = null;
                z10 = false;
            }
            try {
                fileInputStream = new FileInputStream(fileDescriptor);
                try {
                    r(fileInputStream);
                    a5.c.b(fileInputStream);
                    if (z10) {
                        a5.c.a(fileDescriptor);
                    }
                } catch (Throwable th3) {
                    th2 = th3;
                    a5.c.b(fileInputStream);
                    if (z10) {
                        a5.c.a(fileDescriptor);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream = null;
                th2 = th4;
            }
        } else {
            throw new NullPointerException("fileDescriptor cannot be null");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(InputStream inputStream) throws IOException {
        e[][] eVarArr = V;
        this.f46e = new HashMap[eVarArr.length];
        this.f47f = new HashSet(eVarArr.length);
        this.f48g = ByteOrder.BIG_ENDIAN;
        if (inputStream != null) {
            this.f42a = null;
            if (inputStream instanceof AssetManager.AssetInputStream) {
                this.f44c = (AssetManager.AssetInputStream) inputStream;
                this.f43b = null;
            } else if (inputStream instanceof FileInputStream) {
                FileInputStream fileInputStream = (FileInputStream) inputStream;
                if (p(fileInputStream.getFD())) {
                    this.f44c = null;
                    this.f43b = fileInputStream.getFD();
                } else {
                    this.f44c = null;
                    this.f43b = null;
                }
            }
            r(inputStream);
            return;
        }
        throw new NullPointerException("inputStream cannot be null");
    }
}
