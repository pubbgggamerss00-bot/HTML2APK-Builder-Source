package af;

import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class c extends a implements DataOutput {

    /* renamed from: h, reason: collision with root package name */
    public final OutputStream f532h;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f531g = new byte[8];

    /* renamed from: j, reason: collision with root package name */
    public final d f533j = new d();

    public c(OutputStream outputStream) {
        if (outputStream == null) {
            throw new IllegalArgumentException("stream == null!");
        }
        this.f532h = outputStream;
    }

    @Override // af.a
    public final void b(long j10) throws IOException {
        OutputStream outputStream;
        long j11 = this.f525c;
        super.b(j10);
        long j12 = this.f525c;
        int i10 = (int) (j12 - j11);
        long j13 = i10 + j11;
        d dVar = this.f533j;
        long j14 = dVar.f534a;
        ArrayList<byte[]> arrayList = dVar.f536c;
        if (j13 > j14) {
            throw new IndexOutOfBoundsException("Argument out of cache");
        }
        int i11 = (int) (j11 >> 9);
        int i12 = (int) (j11 & 511);
        if (i11 < dVar.f535b) {
            throw new IndexOutOfBoundsException("The requested data are already disposed");
        }
        while (true) {
            outputStream = this.f532h;
            if (i10 <= 0) {
                break;
            }
            byte[] bArr = arrayList.get(i11);
            int iMin = Math.min(512 - i12, i10);
            outputStream.write(bArr, i12, iMin);
            i11++;
            i10 -= iMin;
            i12 = 0;
        }
        int i13 = (int) (j12 >> 9);
        int i14 = dVar.f535b;
        if (i13 > i14) {
            while (i14 < i13) {
                arrayList.set(i14, null);
                i14++;
            }
            dVar.f535b = i13;
        }
        outputStream.flush();
    }

    @Override // af.a
    public final void close() throws IOException {
        d dVar = this.f533j;
        long j10 = dVar.f534a;
        c(j10);
        b(j10);
        a();
        this.f527e = true;
        dVar.f536c.clear();
        dVar.f534a = 0L;
    }

    public final void d() throws IOException {
        int i10;
        a();
        int i11 = this.f526d;
        if (i11 == 0) {
            return;
        }
        int i12 = read();
        if (i12 == -1) {
            i10 = 0;
            this.f526d = 0;
        } else {
            a();
            c(this.f524b - 1);
            i10 = ((-1) << (8 - i11)) & i12;
        }
        write(i10);
    }

    public final void e(int i10, long j10) throws IOException {
        a();
        int i11 = this.f526d;
        if (i11 > 0) {
            int i12 = read();
            if (i12 == -1) {
                i12 = 0;
            } else {
                a();
                c(this.f524b - 1);
            }
            int i13 = 8 - i11;
            if (i10 >= i13) {
                i10 -= i13;
                write((int) ((i12 & (~r0)) | ((j10 >> i10) & ((-1) >>> (32 - i13)))));
            } else {
                int i14 = i11 + i10;
                int i15 = 8 - i14;
                write((int) ((i12 & (~(r11 << i15))) | ((((-1) >>> i10) & j10) << i15)));
                a();
                c(this.f524b - 1);
                this.f526d = i14;
                i10 = 0;
            }
        }
        while (i10 > 7) {
            write((int) ((j10 >> (i10 - 8)) & 255));
            i10 -= 8;
        }
        if (i10 > 0) {
            write((int) ((j10 << (8 - i10)) & 255));
            a();
            c(this.f524b - 1);
            this.f526d = i10;
        }
    }

    @Override // af.a
    public final int read() throws IOException {
        this.f526d = 0;
        int iB = this.f533j.b(this.f524b);
        if (iB >= 0) {
            this.f524b++;
        }
        return iB;
    }

    @Override // java.io.DataOutput
    public final void write(int i10) throws IOException {
        d();
        long j10 = this.f524b;
        d dVar = this.f533j;
        if (j10 >= dVar.f534a) {
            dVar.d(j10);
        }
        dVar.f536c.get((int) (j10 >> 9))[(int) (j10 & 511)] = (byte) i10;
        this.f524b++;
    }

    @Override // java.io.DataOutput
    public final void writeBoolean(boolean z10) throws IOException {
        write(z10 ? 1 : 0);
    }

    @Override // java.io.DataOutput
    public final void writeByte(int i10) throws IOException {
        write(i10);
    }

    @Override // java.io.DataOutput
    public final void writeBytes(String str) throws IOException {
        write(str.getBytes());
    }

    @Override // java.io.DataOutput
    public final void writeChar(int i10) throws IOException {
        writeShort(i10);
    }

    @Override // java.io.DataOutput
    public final void writeChars(String str) throws IOException {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        if (length < 0 || length > charArray.length) {
            throw new IndexOutOfBoundsException();
        }
        for (char c10 : charArray) {
            writeShort(c10);
        }
    }

    @Override // java.io.DataOutput
    public final void writeDouble(double d10) throws IOException {
        writeLong(Double.doubleToLongBits(d10));
    }

    @Override // java.io.DataOutput
    public final void writeFloat(float f10) throws IOException {
        writeInt(Float.floatToIntBits(f10));
    }

    @Override // java.io.DataOutput
    public final void writeInt(int i10) throws IOException {
        ByteOrder byteOrder = this.f523a;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f531g;
        if (byteOrder == byteOrder2) {
            bArr[0] = (byte) (i10 >> 24);
            bArr[1] = (byte) (i10 >> 16);
            bArr[2] = (byte) (i10 >> 8);
            bArr[3] = (byte) i10;
        } else {
            bArr[3] = (byte) (i10 >> 24);
            bArr[2] = (byte) (i10 >> 16);
            bArr[1] = (byte) (i10 >> 8);
            bArr[0] = (byte) i10;
        }
        write(bArr, 0, 4);
    }

    @Override // java.io.DataOutput
    public final void writeLong(long j10) throws IOException {
        ByteOrder byteOrder = this.f523a;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f531g;
        if (byteOrder == byteOrder2) {
            bArr[0] = (byte) (j10 >> 56);
            bArr[1] = (byte) (j10 >> 48);
            bArr[2] = (byte) (j10 >> 40);
            bArr[3] = (byte) (j10 >> 32);
            bArr[4] = (byte) (j10 >> 24);
            bArr[5] = (byte) (j10 >> 16);
            bArr[6] = (byte) (j10 >> 8);
            bArr[7] = (byte) j10;
        } else {
            bArr[7] = (byte) (j10 >> 56);
            bArr[6] = (byte) (j10 >> 48);
            bArr[5] = (byte) (j10 >> 40);
            bArr[4] = (byte) (j10 >> 32);
            bArr[3] = (byte) (j10 >> 24);
            bArr[2] = (byte) (j10 >> 16);
            bArr[1] = (byte) (j10 >> 8);
            bArr[0] = (byte) j10;
        }
        write(bArr, 0, 8);
    }

    @Override // java.io.DataOutput
    public final void writeShort(int i10) throws IOException {
        ByteOrder byteOrder = this.f523a;
        ByteOrder byteOrder2 = ByteOrder.BIG_ENDIAN;
        byte[] bArr = this.f531g;
        if (byteOrder == byteOrder2) {
            bArr[0] = (byte) (i10 >> 8);
            bArr[1] = (byte) i10;
        } else {
            bArr[1] = (byte) (i10 >> 8);
            bArr[0] = (byte) i10;
        }
        write(bArr, 0, 2);
    }

    @Override // java.io.DataOutput
    public final void writeUTF(String str) throws IOException {
        ByteOrder byteOrder = this.f523a;
        this.f523a = ByteOrder.BIG_ENDIAN;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new DataOutputStream(byteArrayOutputStream).writeUTF(str);
        write(byteArrayOutputStream.toByteArray(), 0, byteArrayOutputStream.size());
        this.f523a = byteOrder;
    }

    @Override // af.a
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f526d = 0;
        int iC = this.f533j.c(this.f524b, bArr, i10, i11);
        if (iC > 0) {
            this.f524b += iC;
        }
        return iC;
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.DataOutput
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        d();
        long j10 = this.f524b;
        d dVar = this.f533j;
        dVar.getClass();
        if (i11 <= bArr.length - i10 && i11 >= 0 && i10 >= 0) {
            if (i11 != 0) {
                long j11 = (i11 + j10) - 1;
                if (j11 >= dVar.f534a) {
                    dVar.d(j11);
                }
                int i12 = i11;
                while (i12 > 0) {
                    byte[] bArr2 = dVar.f536c.get((int) (j10 >> 9));
                    int i13 = (int) (511 & j10);
                    int iMin = Math.min(512 - i13, i12);
                    System.arraycopy(bArr, i10, bArr2, i13, iMin);
                    j10 += iMin;
                    i12 -= iMin;
                    i10 += iMin;
                }
            }
            this.f524b += i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
