package ff;

import java.io.BufferedOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class c extends BufferedOutputStream {

    /* renamed from: a, reason: collision with root package name */
    public boolean f11207a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f11208b;

    /* renamed from: c, reason: collision with root package name */
    public int f11209c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11210d;

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final synchronized void flush() throws IOException {
        try {
            if (this.f11207a && !this.f11208b) {
                write(13);
                this.f11209c++;
            }
            this.f11207a = false;
            this.f11208b = false;
            super.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.BufferedOutputStream, java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) throws IOException {
        try {
            if (this.f11209c == 0 && i11 > 10) {
                this.f11210d = false;
                for (int i12 = 0; i12 < 10; i12++) {
                    byte b10 = bArr[i12];
                    if (b10 >= 9 && (b10 <= 10 || b10 >= 32 || b10 == 13)) {
                    }
                    this.f11210d = true;
                    break;
                }
            }
            if (this.f11210d) {
                if (this.f11207a) {
                    this.f11207a = false;
                    if (!this.f11208b && i11 == 1 && bArr[i10] == 10) {
                        return;
                    } else {
                        write(13);
                    }
                }
                if (this.f11208b) {
                    write(10);
                    this.f11208b = false;
                }
                if (i11 > 0) {
                    byte b11 = bArr[(i10 + i11) - 1];
                    if (b11 == 13) {
                        this.f11207a = true;
                        i11--;
                    } else if (b11 == 10) {
                        this.f11208b = true;
                        int i13 = i11 - 1;
                        if (i13 <= 0 || bArr[(i10 + i13) - 1] != 13) {
                            i11 = i13;
                        } else {
                            this.f11207a = true;
                            i11 -= 2;
                        }
                    }
                }
            }
            super.write(bArr, i10, i11);
            this.f11209c += i11;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
