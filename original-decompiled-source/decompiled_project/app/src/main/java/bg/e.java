package bg;

import a5.c;
import android.system.OsConstants;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import p.g0;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f4221b = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4222c = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    /* renamed from: a, reason: collision with root package name */
    public final a f4223a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final InputStream f4224a;

        public a(InputStream inputStream) {
            this.f4224a = inputStream;
        }
    }

    public e(InputStream inputStream) {
        this.f4223a = new a(inputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0177 A[Catch: all -> 0x0173, Exception -> 0x0175, TryCatch #15 {Exception -> 0x0175, all -> 0x0173, blocks: (B:92:0x015f, B:94:0x0163, B:101:0x017f, B:100:0x0177), top: B:151:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0163 A[Catch: all -> 0x0173, Exception -> 0x0175, TryCatch #15 {Exception -> 0x0175, all -> 0x0173, blocks: (B:92:0x015f, B:94:0x0163, B:101:0x017f, B:100:0x0177), top: B:151:0x015f }] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v5, types: [java.io.BufferedInputStream, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r25v0, types: [a5.b] */
    /* JADX WARN: Type inference failed for: r8v16 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(a5.b bVar, a5.b bVar2, int i10, int i11) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        File fileCreateTempFile;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        ?? bufferedInputStream = "GPSLongitude";
        String[] strArr = {"FNumber", "DateTime", "DateTimeDigitized", "ExposureTime", "Flash", "FocalLength", "GPSAltitude", "GPSAltitudeRef", "GPSDateStamp", "GPSLatitude", "GPSLatitudeRef", "GPSLongitude", "GPSLongitudeRef", "GPSProcessingMethod", "GPSTimeStamp", "PhotographicSensitivity", "Make", "Model", "SubSecTime", "SubSecTimeDigitized", "SubSecTimeOriginal", "WhiteBalance"};
        for (int i12 = 0; i12 < 22; i12++) {
            String str = strArr[i12];
            String strB = bVar.b(str);
            if (!TextUtils.isEmpty(strB)) {
                bVar2.C(str, strB);
            }
        }
        bVar2.C("ImageWidth", String.valueOf(i10));
        bVar2.C("ImageLength", String.valueOf(i11));
        bVar2.C("Orientation", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.L0);
        int i13 = bVar2.f45d;
        if (i13 != 4 && i13 != 13 && i13 != 14) {
            throw new IOException("ExifInterface only supports saving attributes for JPEG, PNG, and WebP formats.");
        }
        if (bVar2.f43b == null && bVar2.f42a == null) {
            throw new IOException("ExifInterface does not support saving attributes for the current input.");
        }
        if (bVar2.f49h && bVar2.f50i && !bVar2.f51j) {
            throw new IOException("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
        }
        int i14 = bVar2.f55n;
        FileInputStream fileInputStream5 = null;
         = 0;
        ?? r82 = 0;
        FileOutputStream fileOutputStream5 = null;
        bVar2.f54m = (i14 == 6 || i14 == 7) ? bVar2.l() : null;
        try {
            fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (bVar2.f42a != null) {
                fileInputStream2 = new FileInputStream(bVar2.f42a);
            } else {
                c.a.c(bVar2.f43b, 0L, OsConstants.SEEK_SET);
                fileInputStream2 = new FileInputStream(bVar2.f43b);
            }
            fileInputStream = fileInputStream2;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
        }
        try {
            fileOutputStream = new FileOutputStream(fileCreateTempFile);
            try {
                a5.c.e(fileInputStream, fileOutputStream);
                a5.c.b(fileInputStream);
                a5.c.b(fileOutputStream);
                try {
                } catch (Throwable th3) {
                    th = th3;
                    r82 = "GPSLongitudeRef";
                }
                try {
                    try {
                        fileInputStream3 = new FileInputStream(fileCreateTempFile);
                    } catch (Throwable th4) {
                        th = th4;
                        bufferedInputStream = 0;
                    }
                    try {
                        if (bVar2.f42a != null) {
                            fileOutputStream4 = new FileOutputStream(bVar2.f42a);
                        } else {
                            c.a.c(bVar2.f43b, 0L, OsConstants.SEEK_SET);
                            fileOutputStream4 = new FileOutputStream(bVar2.f43b);
                        }
                        fileOutputStream3 = fileOutputStream4;
                        try {
                            bufferedInputStream = new BufferedInputStream(fileInputStream3);
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream3);
                                try {
                                    int i15 = bVar2.f45d;
                                    if (i15 == 4) {
                                        bVar2.z(bufferedInputStream, bufferedOutputStream);
                                    } else if (i15 == 13) {
                                        bVar2.A(bufferedInputStream, bufferedOutputStream);
                                    } else if (i15 == 14) {
                                        bVar2.B(bufferedInputStream, bufferedOutputStream);
                                    }
                                    a5.c.b(bufferedInputStream);
                                    a5.c.b(bufferedOutputStream);
                                    fileCreateTempFile.delete();
                                    bVar2.f54m = null;
                                } catch (Exception e11) {
                                    e = e11;
                                    fileOutputStream5 = fileOutputStream3;
                                    try {
                                        try {
                                            fileInputStream4 = new FileInputStream(fileCreateTempFile);
                                        } catch (Exception e12) {
                                            e = e12;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                        fileInputStream4 = fileInputStream3;
                                    }
                                    try {
                                        if (bVar2.f42a != null) {
                                        }
                                        fileOutputStream5 = fileOutputStream2;
                                        a5.c.e(fileInputStream4, fileOutputStream5);
                                        a5.c.b(fileInputStream4);
                                        a5.c.b(fileOutputStream5);
                                        throw new IOException("Failed to save new file", e);
                                    } catch (Exception e13) {
                                        e = e13;
                                        fileInputStream3 = fileInputStream4;
                                        throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        a5.c.b(fileInputStream4);
                                        a5.c.b(fileOutputStream5);
                                        throw th;
                                    }
                                }
                            } catch (Exception e14) {
                                e = e14;
                            } catch (Throwable th7) {
                                th = th7;
                                a5.c.b(bufferedInputStream);
                                a5.c.b(r82);
                                if (0 == 0) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e15) {
                            e = e15;
                            fileOutputStream5 = fileOutputStream3;
                            fileInputStream4 = new FileInputStream(fileCreateTempFile);
                            if (bVar2.f42a != null) {
                                c.a.c(bVar2.f43b, 0L, OsConstants.SEEK_SET);
                                fileOutputStream2 = new FileOutputStream(bVar2.f43b);
                            } else {
                                fileOutputStream2 = new FileOutputStream(bVar2.f42a);
                            }
                            fileOutputStream5 = fileOutputStream2;
                            a5.c.e(fileInputStream4, fileOutputStream5);
                            a5.c.b(fileInputStream4);
                            a5.c.b(fileOutputStream5);
                            throw new IOException("Failed to save new file", e);
                        }
                    } catch (Exception e16) {
                        e = e16;
                        fileOutputStream3 = null;
                    }
                } catch (Exception e17) {
                    e = e17;
                    fileInputStream3 = null;
                }
            } catch (Exception e18) {
                e = e18;
                fileInputStream5 = fileInputStream;
                try {
                    throw new IOException("Failed to copy original file to temp file", e);
                } catch (Throwable th8) {
                    th = th8;
                    fileInputStream = fileInputStream5;
                    a5.c.b(fileInputStream);
                    a5.c.b(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
                a5.c.b(fileInputStream);
                a5.c.b(fileOutputStream);
                throw th;
            }
        } catch (Exception e19) {
            e = e19;
            fileOutputStream = null;
            fileInputStream5 = fileInputStream;
            throw new IOException("Failed to copy original file to temp file", e);
        } catch (Throwable th10) {
            th = th10;
            fileOutputStream = null;
            fileInputStream5 = fileInputStream;
            fileInputStream = fileInputStream5;
            a5.c.b(fileInputStream);
            a5.c.b(fileOutputStream);
            throw th;
        }
    }

    public final int b() throws IOException {
        int i10;
        InputStream inputStream = this.f4223a.f4224a;
        int i11 = 65280;
        short s10 = 255;
        int i12 = ((inputStream.read() << 8) & 65280) | (inputStream.read() & 255);
        if ((i12 & 65496) == 65496 || i12 == 19789 || i12 == 18761) {
            while (true) {
                short s11 = (short) (inputStream.read() & s10);
                if (s11 == s10) {
                    short s12 = (short) (inputStream.read() & s10);
                    if (s12 == 218) {
                        break;
                    }
                    if (s12 != 217) {
                        i10 = (((inputStream.read() << 8) & i11) | (inputStream.read() & s10)) - 2;
                        if (s12 == 225) {
                            break;
                        }
                        long j10 = i10;
                        long j11 = 0;
                        if (j10 >= 0) {
                            long j12 = j10;
                            while (j12 > 0) {
                                long jSkip = inputStream.skip(j12);
                                if (jSkip > 0) {
                                    j12 -= jSkip;
                                } else {
                                    if (inputStream.read() == -1) {
                                        break;
                                    }
                                    j12--;
                                }
                            }
                            j11 = j10 - j12;
                        }
                        if (j11 == j10) {
                            i11 = 65280;
                            s10 = 255;
                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                            StringBuilder sbA = g0.a(s12, i10, "Unable to skip enough data, type: ", ", wanted to skip: ", ", but actually skipped: ");
                            sbA.append(j11);
                            Log.d("ImageHeaderParser", sbA.toString());
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Found MARKER_EOI in exif segment");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    a5.a.a(s11, "Unknown segmentId=", "ImageHeaderParser");
                }
            }
            i10 = -1;
            if (i10 != -1) {
                byte[] bArr = new byte[i10];
                int i13 = i10;
                while (i13 > 0) {
                    int i14 = inputStream.read(bArr, i10 - i13, i13);
                    if (i14 == -1) {
                        break;
                    }
                    i13 -= i14;
                }
                int i15 = i10 - i13;
                if (i15 == i10) {
                    byte[] bArr2 = f4221b;
                    boolean z10 = i10 > bArr2.length;
                    if (z10) {
                        int i16 = 0;
                        while (true) {
                            if (i16 >= bArr2.length) {
                                break;
                            }
                            if (bArr[i16] != bArr2[i16]) {
                                z10 = false;
                                break;
                            }
                            i16++;
                        }
                    }
                    if (z10) {
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
                        ByteBuffer byteBuffer = (ByteBuffer) byteBufferWrap.order(byteOrder).limit(i10);
                        short s13 = byteBuffer.getShort(6);
                        if (s13 != 19789) {
                            if (s13 == 18761) {
                                byteOrder = ByteOrder.LITTLE_ENDIAN;
                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                a5.a.a(s13, "Unknown endianness = ", "ImageHeaderParser");
                            }
                        }
                        byteBuffer.order(byteOrder);
                        int i17 = byteBuffer.getInt(10);
                        short s14 = byteBuffer.getShort(i17 + 6);
                        for (int i18 = 0; i18 < s14; i18++) {
                            int i19 = (i18 * 12) + i17 + 8;
                            short s15 = byteBuffer.getShort(i19);
                            if (s15 == 274) {
                                short s16 = byteBuffer.getShort(i19 + 2);
                                if (s16 >= 1 && s16 <= 12) {
                                    int i20 = byteBuffer.getInt(i19 + 4);
                                    if (i20 >= 0) {
                                        if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            StringBuilder sbA2 = g0.a(i18, s15, "Got tagIndex=", " tagType=", " formatCode=");
                                            sbA2.append((int) s16);
                                            sbA2.append(" componentCount=");
                                            sbA2.append(i20);
                                            Log.d("ImageHeaderParser", sbA2.toString());
                                        }
                                        int i21 = i20 + f4222c[s16];
                                        if (i21 <= 4) {
                                            int i22 = i19 + 8;
                                            if (i22 >= 0 && i22 <= byteBuffer.remaining()) {
                                                if (i21 >= 0 && i21 + i22 <= byteBuffer.remaining()) {
                                                    return byteBuffer.getShort(i22);
                                                }
                                                if (Log.isLoggable("ImageHeaderParser", 3)) {
                                                    a5.a.a(s15, "Illegal number of bytes for TI tag data tagType=", "ImageHeaderParser");
                                                }
                                            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                                Log.d("ImageHeaderParser", "Illegal tagValueOffset=" + i22 + " tagType=" + ((int) s15));
                                            }
                                        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                            a5.a.a(s16, "Got byte count > 4, not orientation, continuing, formatCode=", "ImageHeaderParser");
                                        }
                                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                        Log.d("ImageHeaderParser", "Negative tiff component count");
                                    }
                                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                                    a5.a.a(s16, "Got invalid format code = ", "ImageHeaderParser");
                                }
                            }
                        }
                    } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                        Log.d("ImageHeaderParser", "Missing jpeg exif preamble");
                    }
                } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                    Log.d("ImageHeaderParser", "Unable to read exif segment data, length: " + i10 + ", actually read: " + i15);
                    return -1;
                }
            } else if (Log.isLoggable("ImageHeaderParser", 3)) {
                Log.d("ImageHeaderParser", "Failed to parse exif segment length, or exif segment not found");
                return -1;
            }
        } else if (Log.isLoggable("ImageHeaderParser", 3)) {
            a5.a.a(i12, "Parser doesn't handle magic number: ", "ImageHeaderParser");
            return -1;
        }
        return -1;
    }
}
