package androidx.camera.core.impl.utils;

import androidx.camera.camera2.internal.p0;
import androidx.camera.core.Logger;
import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final Charset ASCII = StandardCharsets.US_ASCII;
    static final String[] IFD_FORMAT_NAMES = {RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    public ExifAttribute(int i6, int i7, byte[] bArr) {
        this(i6, i7, -1L, bArr);
    }

    public static ExifAttribute createByte(String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(ASCII);
        return new ExifAttribute(1, bytes.length, bytes);
    }

    public static ExifAttribute createDouble(double[] dArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
        byteBufferWrap.order(byteOrder);
        for (double d7 : dArr) {
            byteBufferWrap.putDouble(d7);
        }
        return new ExifAttribute(12, dArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createSLong(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i6 : iArr) {
            byteBufferWrap.putInt(i6);
        }
        return new ExifAttribute(9, iArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createSRational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length]);
        byteBufferWrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            byteBufferWrap.putInt((int) longRational.getNumerator());
            byteBufferWrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(10, longRationalArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createString(String str) {
        byte[] bytes = (str + (char) 0).getBytes(ASCII);
        return new ExifAttribute(2, bytes.length, bytes);
    }

    public static ExifAttribute createULong(long[] jArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        byteBufferWrap.order(byteOrder);
        for (long j6 : jArr) {
            byteBufferWrap.putInt((int) j6);
        }
        return new ExifAttribute(4, jArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createURational(LongRational[] longRationalArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length]);
        byteBufferWrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            byteBufferWrap.putInt((int) longRational.getNumerator());
            byteBufferWrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(5, longRationalArr.length, byteBufferWrap.array());
    }

    public static ExifAttribute createUShort(int[] iArr, ByteOrder byteOrder) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
        byteBufferWrap.order(byteOrder);
        for (int i6 : iArr) {
            byteBufferWrap.putShort((short) i6);
        }
        return new ExifAttribute(3, iArr.length, byteBufferWrap.array());
    }

    public double getDoubleValue(ByteOrder byteOrder) throws Throwable {
        Object value = getValue(byteOrder);
        if (value == null) {
            throw new NumberFormatException("NULL can't be converted to a double value");
        }
        if (value instanceof String) {
            return Double.parseDouble((String) value);
        }
        if (value instanceof long[]) {
            if (((long[]) value).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (value instanceof int[]) {
            if (((int[]) value).length == 1) {
                return r5[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            if (dArr.length == 1) {
                return dArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(value instanceof LongRational[])) {
            throw new NumberFormatException("Couldn't find a double value");
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        if (longRationalArr.length == 1) {
            return longRationalArr[0].toDouble();
        }
        throw new NumberFormatException("There are more than one component");
    }

    public int getIntValue(ByteOrder byteOrder) throws Throwable {
        Object value = getValue(byteOrder);
        if (value == null) {
            throw new NumberFormatException("NULL can't be converted to a integer value");
        }
        if (value instanceof String) {
            return Integer.parseInt((String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }
        if (!(value instanceof int[])) {
            throw new NumberFormatException("Couldn't find a integer value");
        }
        int[] iArr = (int[]) value;
        if (iArr.length == 1) {
            return iArr[0];
        }
        throw new NumberFormatException("There are more than one component");
    }

    public String getStringValue(ByteOrder byteOrder) throws Throwable {
        Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i6 < jArr.length) {
                sb.append(jArr[i6]);
                i6++;
                if (i6 != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i6 < iArr.length) {
                sb.append(iArr[i6]);
                i6++;
                if (i6 != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i6 < dArr.length) {
                sb.append(dArr[i6]);
                i6++;
                if (i6 != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(value instanceof LongRational[])) {
            return null;
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        while (i6 < longRationalArr.length) {
            sb.append(longRationalArr[i6].getNumerator());
            sb.append('/');
            sb.append(longRationalArr[i6].getDenominator());
            i6++;
            if (i6 != longRationalArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:18:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v20, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v22, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v24, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r11v26, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v28, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v30, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r11v32, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v35, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getValue(ByteOrder byteOrder) throws Throwable {
        ByteOrderedDataInputStream byteOrderedDataInputStream;
        InputStream inputStream;
        byte b7;
        byte b8;
        String str;
        InputStream inputStream2 = null;
        try {
            try {
                byteOrderedDataInputStream = new ByteOrderedDataInputStream(this.bytes);
                try {
                    byteOrderedDataInputStream.setByteOrder(byteOrder);
                    int length = 0;
                    switch (this.format) {
                        case 1:
                        case 6:
                            byte[] bArr = this.bytes;
                            if (bArr.length == 1 && (b7 = bArr[0]) >= 0 && b7 <= 1) {
                                str = new String(new char[]{(char) (b7 + 48)});
                                break;
                            } else {
                                String str2 = new String(bArr, ASCII);
                                try {
                                    byteOrderedDataInputStream.close();
                                    return str2;
                                } catch (IOException e6) {
                                    Logger.e(TAG, "IOException occurred while closing InputStream", e6);
                                    return str2;
                                }
                            }
                        case 2:
                        case 7:
                            if (this.numberOfComponents >= EXIF_ASCII_PREFIX.length) {
                                int i6 = 0;
                                while (true) {
                                    byte[] bArr2 = EXIF_ASCII_PREFIX;
                                    if (i6 >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (this.bytes[i6] == bArr2[i6]) {
                                        i6++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < this.numberOfComponents && (b8 = this.bytes[length]) != 0) {
                                if (b8 >= 32) {
                                    sb.append((char) b8);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            break;
                        case 3:
                            ?? r11 = new int[this.numberOfComponents];
                            while (true) {
                                str = r11;
                                if (length < this.numberOfComponents) {
                                    r11[length] = byteOrderedDataInputStream.readUnsignedShort();
                                    length++;
                                }
                            }
                            break;
                        case 4:
                            ?? r112 = new long[this.numberOfComponents];
                            while (true) {
                                str = r112;
                                if (length < this.numberOfComponents) {
                                    r112[length] = byteOrderedDataInputStream.readUnsignedInt();
                                    length++;
                                }
                            }
                            break;
                        case 5:
                            ?? r113 = new LongRational[this.numberOfComponents];
                            while (true) {
                                str = r113;
                                if (length < this.numberOfComponents) {
                                    r113[length] = new LongRational(byteOrderedDataInputStream.readUnsignedInt(), byteOrderedDataInputStream.readUnsignedInt());
                                    length++;
                                }
                            }
                            break;
                        case 8:
                            ?? r114 = new int[this.numberOfComponents];
                            while (true) {
                                str = r114;
                                if (length < this.numberOfComponents) {
                                    r114[length] = byteOrderedDataInputStream.readShort();
                                    length++;
                                }
                            }
                            break;
                        case 9:
                            ?? r115 = new int[this.numberOfComponents];
                            while (true) {
                                str = r115;
                                if (length < this.numberOfComponents) {
                                    r115[length] = byteOrderedDataInputStream.readInt();
                                    length++;
                                }
                            }
                            break;
                        case 10:
                            ?? r116 = new LongRational[this.numberOfComponents];
                            while (true) {
                                str = r116;
                                if (length < this.numberOfComponents) {
                                    r116[length] = new LongRational(byteOrderedDataInputStream.readInt(), byteOrderedDataInputStream.readInt());
                                    length++;
                                }
                            }
                            break;
                        case 11:
                            ?? r117 = new double[this.numberOfComponents];
                            while (true) {
                                str = r117;
                                if (length < this.numberOfComponents) {
                                    r117[length] = byteOrderedDataInputStream.readFloat();
                                    length++;
                                }
                            }
                            break;
                        case 12:
                            ?? r118 = new double[this.numberOfComponents];
                            while (true) {
                                str = r118;
                                if (length < this.numberOfComponents) {
                                    r118[length] = byteOrderedDataInputStream.readDouble();
                                    length++;
                                }
                            }
                            break;
                        default:
                            try {
                                byteOrderedDataInputStream.close();
                                return null;
                            } catch (IOException e7) {
                                Logger.e(TAG, "IOException occurred while closing InputStream", e7);
                                return null;
                            }
                    }
                    try {
                        byteOrderedDataInputStream.close();
                        return str;
                    } catch (IOException e8) {
                        Logger.e(TAG, "IOException occurred while closing InputStream", e8);
                        return str;
                    }
                } catch (IOException e9) {
                    e = e9;
                    Logger.w(TAG, "IOException occurred during reading a value", e);
                    if (byteOrderedDataInputStream != null) {
                        try {
                            byteOrderedDataInputStream.close();
                        } catch (IOException e10) {
                            Logger.e(TAG, "IOException occurred while closing InputStream", e10);
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
                        Logger.e(TAG, "IOException occurred while closing InputStream", e11);
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e = e12;
            byteOrderedDataInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream2 != null) {
            }
            throw th;
        }
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(IFD_FORMAT_NAMES[this.format]);
        sb.append(", data length:");
        return p0.a(sb, this.bytes.length, ")");
    }

    public ExifAttribute(int i6, int i7, long j6, byte[] bArr) {
        this.format = i6;
        this.numberOfComponents = i7;
        this.bytesOffset = j6;
        this.bytes = bArr;
    }

    public static ExifAttribute createDouble(double d7, ByteOrder byteOrder) {
        return createDouble(new double[]{d7}, byteOrder);
    }

    public static ExifAttribute createSLong(int i6, ByteOrder byteOrder) {
        return createSLong(new int[]{i6}, byteOrder);
    }

    public static ExifAttribute createULong(long j6, ByteOrder byteOrder) {
        return createULong(new long[]{j6}, byteOrder);
    }

    public static ExifAttribute createUShort(int i6, ByteOrder byteOrder) {
        return createUShort(new int[]{i6}, byteOrder);
    }

    public static ExifAttribute createSRational(LongRational longRational, ByteOrder byteOrder) {
        return createSRational(new LongRational[]{longRational}, byteOrder);
    }

    public static ExifAttribute createURational(LongRational longRational, ByteOrder byteOrder) {
        return createURational(new LongRational[]{longRational}, byteOrder);
    }
}
