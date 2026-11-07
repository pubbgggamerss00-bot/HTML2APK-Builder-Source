package df;

import java.io.FilterOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes2.dex */
public final class c extends FilterOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public int f7910a;

    /* renamed from: b, reason: collision with root package name */
    public int f7911b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f7912c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f7913d;

    /* renamed from: e, reason: collision with root package name */
    public int f7914e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7915f;

    /* renamed from: g, reason: collision with root package name */
    public char f7916g;

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            super.close();
        } finally {
            this.f7913d = null;
            this.f7912c = null;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f7914e;
        if (this.f7915f) {
            return;
        }
        int i11 = this.f7911b;
        if (i11 > 0) {
            while (i11 < 4) {
                this.f7912c[i11] = 0;
                i11++;
            }
            h();
            if (this.f7913d[0] == 122) {
                for (int i12 = 0; i12 < 5; i12++) {
                    this.f7913d[i12] = 33;
                }
            }
            for (int i13 = 0; i13 < this.f7911b + 1; i13++) {
                ((FilterOutputStream) this).out.write(this.f7913d[i13]);
                int i14 = this.f7910a - 1;
                this.f7910a = i14;
                if (i14 == 0) {
                    ((FilterOutputStream) this).out.write(10);
                    this.f7910a = i10;
                }
            }
        }
        int i15 = this.f7910a - 1;
        this.f7910a = i15;
        if (i15 == 0) {
            ((FilterOutputStream) this).out.write(10);
        }
        ((FilterOutputStream) this).out.write(this.f7916g);
        ((FilterOutputStream) this).out.write(62);
        ((FilterOutputStream) this).out.write(10);
        this.f7911b = 0;
        this.f7910a = i10;
        this.f7915f = true;
        super.flush();
    }

    public final void h() {
        byte[] bArr = this.f7912c;
        long j10 = ((bArr[3] & 255) | (((bArr[0] << 8) | (bArr[1] & 255)) << 16) | ((bArr[2] & 255) << 8)) & BodyPartID.bodyIdMax;
        if (j10 == 0) {
            byte[] bArr2 = this.f7913d;
            bArr2[0] = 122;
            bArr2[1] = 0;
            return;
        }
        byte[] bArr3 = this.f7913d;
        bArr3[0] = (byte) (r11 + 33);
        long j11 = j10 - ((j10 / 52200625) * 52200625);
        bArr3[1] = (byte) (r9 + 33);
        long j12 = j11 - ((j11 / 614125) * 614125);
        bArr3[2] = (byte) (r9 + 33);
        long j13 = j12 - ((j12 / 7225) * 7225);
        bArr3[3] = (byte) ((j13 / 85) + 33);
        bArr3[4] = (byte) ((j13 % 85) + 33);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte b10;
        this.f7915f = false;
        byte[] bArr = this.f7912c;
        int i11 = this.f7911b;
        int i12 = i11 + 1;
        this.f7911b = i12;
        bArr[i11] = (byte) i10;
        if (i12 < 4) {
            return;
        }
        h();
        for (int i13 = 0; i13 < 5 && (b10 = this.f7913d[i13]) != 0; i13++) {
            ((FilterOutputStream) this).out.write(b10);
            int i14 = this.f7910a - 1;
            this.f7910a = i14;
            if (i14 == 0) {
                ((FilterOutputStream) this).out.write(10);
                this.f7910a = this.f7914e;
            }
        }
        this.f7911b = 0;
    }
}
