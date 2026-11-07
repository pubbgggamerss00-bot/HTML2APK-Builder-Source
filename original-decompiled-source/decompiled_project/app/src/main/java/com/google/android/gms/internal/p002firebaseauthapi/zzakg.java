package com.google.android.gms.internal.p002firebaseauthapi;

import e1.c;
import h1.y;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import m3.a;

/* loaded from: classes2.dex */
public abstract class zzakg extends zzajm {
    private static final Logger zza = Logger.getLogger(zzakg.class.getName());
    private static final boolean zzb = zzanp.zzc();
    zzakj zze;

    public static abstract class zza extends zzakg {
        final byte[] zza;
        final int zzb;
        int zzc;
        int zzd;

        public zza(int i10) {
            super();
            if (i10 < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i10, 20)];
            this.zza = bArr;
            this.zzb = bArr.length;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        public final void zzb(int i10) {
            if (!zzakg.zzb) {
                while ((i10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i11 = this.zzc;
                    this.zzc = i11 + 1;
                    bArr[i11] = (byte) (i10 | 128);
                    this.zzd++;
                    i10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr2[i12] = (byte) i10;
                this.zzd++;
                return;
            }
            long j10 = this.zzc;
            while ((i10 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i13 = this.zzc;
                this.zzc = i13 + 1;
                zzanp.zza(bArr3, i13, (byte) (i10 | 128));
                i10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i14 = this.zzc;
            this.zzc = i14 + 1;
            zzanp.zza(bArr4, i14, (byte) i10);
            this.zzd += (int) (this.zzc - j10);
        }

        public final void zza(byte b10) {
            int i10 = this.zzc;
            this.zza[i10] = b10;
            this.zzc = i10 + 1;
            this.zzd++;
        }

        public final void zza(int i10) {
            int i11 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = i10 >> 24;
            this.zzc = i11 + 4;
            this.zzd += 4;
        }

        public final void zzb(long j10) {
            if (zzakg.zzb) {
                long j11 = this.zzc;
                while ((j10 & (-128)) != 0) {
                    byte[] bArr = this.zza;
                    int i10 = this.zzc;
                    this.zzc = i10 + 1;
                    zzanp.zza(bArr, i10, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                }
                byte[] bArr2 = this.zza;
                int i11 = this.zzc;
                this.zzc = i11 + 1;
                zzanp.zza(bArr2, i11, (byte) j10);
                this.zzd += (int) (this.zzc - j11);
                return;
            }
            while ((j10 & (-128)) != 0) {
                byte[] bArr3 = this.zza;
                int i12 = this.zzc;
                this.zzc = i12 + 1;
                bArr3[i12] = (byte) (((int) j10) | 128);
                this.zzd++;
                j10 >>>= 7;
            }
            byte[] bArr4 = this.zza;
            int i13 = this.zzc;
            this.zzc = i13 + 1;
            bArr4[i13] = (byte) j10;
            this.zzd++;
        }

        public final void zza(long j10) {
            int i10 = this.zzc;
            byte[] bArr = this.zza;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.zzc = i10 + 8;
            this.zzd += 8;
        }

        public final void zza(int i10, int i11) {
            zzb((i10 << 3) | i11);
        }
    }

    public static class zzb extends IOException {
        public zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zzb(Throwable th2) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th2);
        }

        private zzb(String str, Throwable th2) {
            super(a.a("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th2);
        }

        public zzb(int i10, int i11, int i12, Throwable th2) {
            this(i10, i11, i12, th2);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private zzb(long j10, long j11, int i10, Throwable th2) {
            Locale locale = Locale.US;
            StringBuilder sbA = y.a("Pos: ", ", limit: ", j10);
            sbA.append(j11);
            sbA.append(", len: ");
            sbA.append(i10);
            this(sbA.toString(), th2);
        }
    }

    public static class zzc extends zzakg {
        private final byte[] zza;
        private final int zzb;
        private int zzc;

        public zzc(byte[] bArr, int i10, int i11) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            if (((bArr.length - i11) | i11) < 0) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(c.a(bArr.length, i11, "Array range is invalid. Buffer.length=", ", offset=0, length="));
            }
            this.zza = bArr;
            this.zzc = 0;
            this.zzb = i11;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final int zza() {
            return this.zzb - this.zzc;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b10) throws IOException {
            int i10 = this.zzc;
            try {
                int i11 = i10 + 1;
                try {
                    this.zza[i10] = b10;
                    this.zzc = i11;
                } catch (IndexOutOfBoundsException e10) {
                    e = e10;
                    i10 = i11;
                    throw new zzb(i10, this.zzb, 1, (Throwable) e);
                }
            } catch (IndexOutOfBoundsException e11) {
                e = e11;
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() {
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i10, zzajp zzajpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i10, long j10) throws IOException {
            zzk(i10, 1);
            zzh(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i10, int i11) throws IOException {
            zzk(i10, 5);
            zzk(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i10, int i11) throws IOException {
            zzk(i10, 0);
            zzl(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j10) throws IOException {
            int i10;
            int i11;
            int i12 = this.zzc;
            if (!zzakg.zzb || zza() < 10) {
                while ((j10 & (-128)) != 0) {
                    try {
                        i11 = i12 + 1;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                    }
                    try {
                        this.zza[i12] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i12 = i11;
                    } catch (IndexOutOfBoundsException e11) {
                        e = e11;
                        i12 = i11;
                        throw new zzb(i12, this.zzb, 1, (Throwable) e);
                    }
                }
                i10 = i12 + 1;
                try {
                    this.zza[i12] = (byte) j10;
                } catch (IndexOutOfBoundsException e12) {
                    e = e12;
                    i12 = i10;
                    throw new zzb(i12, this.zzb, 1, (Throwable) e);
                }
            } else {
                while ((j10 & (-128)) != 0) {
                    zzanp.zza(this.zza, i12, (byte) (((int) j10) | 128));
                    j10 >>>= 7;
                    i12++;
                }
                i10 = i12 + 1;
                zzanp.zza(this.zza, i12, (byte) j10);
            }
            this.zzc = i10;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i10) throws IOException {
            int i11 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i11] = (byte) i10;
                bArr[i11 + 1] = (byte) (i10 >> 8);
                bArr[i11 + 2] = (byte) (i10 >> 16);
                bArr[i11 + 3] = i10 >> 24;
                this.zzc = i11 + 4;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(i11, this.zzb, 4, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i10) throws IOException {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i10) throws IOException {
            int i11;
            int i12 = this.zzc;
            while ((i10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                    try {
                        this.zza[i12] = (byte) (i10 | 128);
                        i10 >>>= 7;
                        i12 = i11;
                    } catch (IndexOutOfBoundsException e10) {
                        e = e10;
                        i12 = i11;
                        throw new zzb(i12, this.zzb, 1, (Throwable) e);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    e = e11;
                    throw new zzb(i12, this.zzb, 1, (Throwable) e);
                }
            }
            i11 = i12 + 1;
            this.zza[i12] = (byte) i10;
            this.zzc = i11;
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws IOException {
            try {
                System.arraycopy(bArr, i10, this.zza, this.zzc, i11);
                this.zzc += i11;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(this.zzc, this.zzb, i11, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i10, int i11) throws IOException {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j10) throws IOException {
            int i10 = this.zzc;
            try {
                byte[] bArr = this.zza;
                bArr[i10] = (byte) j10;
                bArr[i10 + 1] = (byte) (j10 >> 8);
                bArr[i10 + 2] = (byte) (j10 >> 16);
                bArr[i10 + 3] = (byte) (j10 >> 24);
                bArr[i10 + 4] = (byte) (j10 >> 32);
                bArr[i10 + 5] = (byte) (j10 >> 40);
                bArr[i10 + 6] = (byte) (j10 >> 48);
                bArr[i10 + 7] = (byte) (j10 >> 56);
                this.zzc = i10 + 8;
            } catch (IndexOutOfBoundsException e10) {
                throw new zzb(i10, this.zzb, 8, (Throwable) e10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i10, int i11) throws IOException {
            zzk(i10, 0);
            zzn(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i10, boolean z10) throws IOException {
            zzk(i10, 0);
            zzb(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i10, zzajp zzajpVar) throws IOException {
            zzk(i10, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i10, int i11) throws IOException {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i10, zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzk(i10, 2);
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i10, int i11) throws IOException {
            zzn((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) throws IOException {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) throws IOException {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i10, zzamc zzamcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i10, long j10) throws IOException {
            zzk(i10, 0);
            zzj(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i10, String str) throws IOException {
            zzk(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) throws IOException {
            int i10 = this.zzc;
            try {
                int iZzj = zzakg.zzj(str.length() * 3);
                int iZzj2 = zzakg.zzj(str.length());
                if (iZzj2 == iZzj) {
                    int i11 = i10 + iZzj2;
                    this.zzc = i11;
                    int iZza = zzant.zza(str, this.zza, i11, zza());
                    this.zzc = i10;
                    zzn((iZza - i10) - iZzj2);
                    this.zzc = iZza;
                    return;
                }
                zzn(zzant.zza(str));
                this.zzc = zzant.zza(str, this.zza, this.zzc, zza());
            } catch (zzanx e10) {
                this.zzc = i10;
                zza(str, e10);
            } catch (IndexOutOfBoundsException e11) {
                throw new zzb(e11);
            }
        }
    }

    public static int zza(double d10) {
        return 8;
    }

    public static int zzb(int i10, int i11) {
        return zzg(i11) + zzj(i10 << 3);
    }

    public static int zzc(long j10) {
        return 8;
    }

    public static int zzd(int i10) {
        return 4;
    }

    public static int zze(long j10) {
        return 8;
    }

    public static int zzf(int i10) {
        if (i10 > 4096) {
            return 4096;
        }
        return i10;
    }

    public static int zzg(int i10) {
        return 4;
    }

    public static int zzh(int i10) {
        return zzj(zza(i10));
    }

    public static int zzi(int i10) {
        return zzj(i10 << 3);
    }

    public static int zzj(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public abstract int zza();

    public abstract void zzb(byte b10) throws IOException;

    public abstract void zzb(int i10, zzamc zzamcVar) throws IOException;

    public abstract void zzb(int i10, String str) throws IOException;

    public abstract void zzb(int i10, boolean z10) throws IOException;

    public abstract void zzb(zzajp zzajpVar) throws IOException;

    public abstract void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException;

    public abstract void zzb(String str) throws IOException;

    public abstract void zzb(byte[] bArr, int i10, int i11) throws IOException;

    public abstract void zzc() throws IOException;

    public abstract void zzc(int i10, zzajp zzajpVar) throws IOException;

    public abstract void zzc(int i10, zzamc zzamcVar, zzamv zzamvVar) throws IOException;

    public abstract void zzc(zzamc zzamcVar) throws IOException;

    public abstract void zzd(int i10, zzajp zzajpVar) throws IOException;

    public abstract void zzf(int i10, long j10) throws IOException;

    public abstract void zzh(int i10, int i11) throws IOException;

    public abstract void zzh(int i10, long j10) throws IOException;

    public abstract void zzh(long j10) throws IOException;

    public abstract void zzi(int i10, int i11) throws IOException;

    public abstract void zzj(long j10) throws IOException;

    public abstract void zzk(int i10) throws IOException;

    public abstract void zzk(int i10, int i11) throws IOException;

    public abstract void zzl(int i10) throws IOException;

    public abstract void zzl(int i10, int i11) throws IOException;

    public final void zzm(int i10) throws IOException {
        zzn(zza(i10));
    }

    public abstract void zzn(int i10) throws IOException;

    public static final class zzd extends zza {
        private final OutputStream zzf;

        public zzd(OutputStream outputStream, int i10) {
            super(i10);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.zzf = outputStream;
        }

        private final void zze() throws IOException {
            this.zzf.write(this.zza, 0, this.zzc);
            this.zzc = 0;
        }

        private final void zzo(int i10) throws IOException {
            if (this.zzb - this.zzc < i10) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajm
        public final void zza(byte[] bArr, int i10, int i11) throws IOException {
            zzc(bArr, i10, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte b10) throws IOException {
            if (this.zzc == this.zzb) {
                zze();
            }
            zza(b10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc() throws IOException {
            if (this.zzc > 0) {
                zze();
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzd(int i10, zzajp zzajpVar) throws IOException {
            zzk(1, 3);
            zzl(2, i10);
            zzc(3, zzajpVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzf(int i10, long j10) throws IOException {
            zzo(18);
            zza(i10, 1);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i10, int i11) throws IOException {
            zzo(14);
            zza(i10, 5);
            zza(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzi(int i10, int i11) throws IOException {
            zzo(20);
            zza(i10, 0);
            if (i11 >= 0) {
                zzb(i11);
            } else {
                zzb(i11);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzj(long j10) throws IOException {
            zzo(10);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i10) throws IOException {
            zzo(4);
            zza(i10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i10) throws IOException {
            if (i10 >= 0) {
                zzn(i10);
            } else {
                zzj(i10);
            }
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzn(int i10) throws IOException {
            zzo(5);
            zzb(i10);
        }

        private final void zzc(byte[] bArr, int i10, int i11) throws IOException {
            int i12 = this.zzb;
            int i13 = this.zzc;
            if (i12 - i13 >= i11) {
                System.arraycopy(bArr, i10, this.zza, i13, i11);
                this.zzc += i11;
            } else {
                int i14 = i12 - i13;
                System.arraycopy(bArr, i10, this.zza, i13, i14);
                int i15 = i10 + i14;
                i11 -= i14;
                this.zzc = this.zzb;
                this.zzd += i14;
                zze();
                if (i11 <= this.zzb) {
                    System.arraycopy(bArr, i15, this.zza, 0, i11);
                    this.zzc = i11;
                } else {
                    this.zzf.write(bArr, i15, i11);
                }
            }
            this.zzd += i11;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzk(int i10, int i11) throws IOException {
            zzn((i10 << 3) | i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzl(int i10, int i11) throws IOException {
            zzo(20);
            zza(i10, 0);
            zzb(i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i10, boolean z10) throws IOException {
            zzo(11);
            zza(i10, 0);
            zza(z10 ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(long j10) throws IOException {
            zzo(8);
            zza(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzh(int i10, long j10) throws IOException {
            zzo(20);
            zza(i10, 0);
            zzb(j10);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(byte[] bArr, int i10, int i11) throws IOException {
            zzn(i11);
            zzc(bArr, 0, i11);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzajp zzajpVar) throws IOException {
            zzn(zzajpVar.zzb());
            zzajpVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzn(((zzajf) zzamcVar).zza(zzamvVar));
            zzamvVar.zza((zzamv) zzamcVar, (zzaof) this.zze);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i10, zzamc zzamcVar) throws IOException {
            zzk(1, 3);
            zzl(2, i10);
            zzk(3, 2);
            zzc(zzamcVar);
            zzk(1, 4);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i10, zzajp zzajpVar) throws IOException {
            zzk(i10, 2);
            zzb(zzajpVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(int i10, zzamc zzamcVar, zzamv zzamvVar) throws IOException {
            zzk(i10, 2);
            zzb(zzamcVar, zzamvVar);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(int i10, String str) throws IOException {
            zzk(i10, 2);
            zzb(str);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzc(zzamc zzamcVar) throws IOException {
            zzn(zzamcVar.zzl());
            zzamcVar.zza(this);
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzakg
        public final void zzb(String str) throws IOException {
            int iZza;
            try {
                int length = str.length() * 3;
                int iZzj = zzakg.zzj(length);
                int i10 = iZzj + length;
                int i11 = this.zzb;
                if (i10 > i11) {
                    byte[] bArr = new byte[length];
                    int iZza2 = zzant.zza(str, bArr, 0, length);
                    zzn(iZza2);
                    zza(bArr, 0, iZza2);
                    return;
                }
                if (i10 > i11 - this.zzc) {
                    zze();
                }
                int iZzj2 = zzakg.zzj(str.length());
                int i12 = this.zzc;
                try {
                    if (iZzj2 == iZzj) {
                        int i13 = i12 + iZzj2;
                        this.zzc = i13;
                        int iZza3 = zzant.zza(str, this.zza, i13, this.zzb - i13);
                        this.zzc = i12;
                        iZza = (iZza3 - i12) - iZzj2;
                        zzb(iZza);
                        this.zzc = iZza3;
                    } else {
                        iZza = zzant.zza(str);
                        zzb(iZza);
                        this.zzc = zzant.zza(str, this.zza, this.zzc, iZza);
                    }
                    this.zzd += iZza;
                } catch (zzanx e10) {
                    this.zzd -= this.zzc - i12;
                    this.zzc = i12;
                    throw e10;
                } catch (ArrayIndexOutOfBoundsException e11) {
                    throw new zzb(e11);
                }
            } catch (zzanx e12) {
                zza(str, e12);
            }
        }
    }

    private zzakg() {
    }

    public static int zza(float f10) {
        return 4;
    }

    public static int zzc(int i10) {
        return zzg(i10);
    }

    public static int zze(int i10) {
        return zzg(i10);
    }

    public static int zzf(int i10, int i11) {
        return zzj(zza(i11)) + zzj(i10 << 3);
    }

    public static int zzg(int i10, int i11) {
        return zzj(i11) + zzj(i10 << 3);
    }

    public final void zzi(long j10) throws IOException {
        zzj(zza(j10));
    }

    public final void zzj(int i10, int i11) throws IOException {
        zzl(i10, zza(i11));
    }

    private static int zza(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static int zzb(int i10, long j10) {
        return zzg(j10) + zzj(i10 << 3);
    }

    public static int zzc(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zzd(int i10, int i11) {
        return zzg(i11) + zzj(i10 << 3);
    }

    public static int zze(int i10, int i11) {
        return zzj(i10 << 3) + 4;
    }

    public static int zza(boolean z10) {
        return 1;
    }

    public static int zzc(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zze(int i10, long j10) {
        return zzg(j10) + zzj(i10 << 3);
    }

    public static int zzf(long j10) {
        return zzg(zza(j10));
    }

    public static int zzg(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    private static long zza(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int zzb(int i10, zzalk zzalkVar) {
        int iZzj = zzj(i10 << 3);
        int iZza = zzalkVar.zza();
        return zzj(iZza) + iZza + iZzj;
    }

    public static int zzd(long j10) {
        return zzg(j10);
    }

    public final void zzg(int i10, long j10) throws IOException {
        zzh(i10, zza(j10));
    }

    public static int zza(int i10, boolean z10) {
        return zzj(i10 << 3) + 1;
    }

    public static int zzd(int i10, long j10) {
        return zzg(zza(j10)) + zzj(i10 << 3);
    }

    public static int zza(byte[] bArr) {
        int length = bArr.length;
        return zzj(length) + length;
    }

    public static int zzb(int i10, zzamc zzamcVar, zzamv zzamvVar) {
        return zza(zzamcVar, zzamvVar) + zzj(i10 << 3);
    }

    public static int zza(int i10, zzajp zzajpVar) {
        int iZzj = zzj(i10 << 3);
        int iZzb = zzajpVar.zzb();
        return zzj(iZzb) + iZzb + iZzj;
    }

    public static int zzb(zzamc zzamcVar) {
        int iZzl = zzamcVar.zzl();
        return zzj(iZzl) + iZzl;
    }

    public static int zza(zzajp zzajpVar) {
        int iZzb = zzajpVar.zzb();
        return zzj(iZzb) + iZzb;
    }

    public static int zzb(int i10, zzajp zzajpVar) {
        return zza(3, zzajpVar) + zzg(2, i10) + (zzj(8) << 1);
    }

    public static int zza(int i10, double d10) {
        return zzj(i10 << 3) + 8;
    }

    public static int zza(int i10, long j10) {
        return zzj(i10 << 3) + 8;
    }

    public static zzakg zzb(byte[] bArr) {
        return new zzc(bArr, 0, bArr.length);
    }

    public static int zza(int i10, float f10) {
        return zzj(i10 << 3) + 4;
    }

    @Deprecated
    public static int zza(int i10, zzamc zzamcVar, zzamv zzamvVar) {
        return ((zzajf) zzamcVar).zza(zzamvVar) + (zzj(i10 << 3) << 1);
    }

    public final void zzb() {
        if (zza() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    @Deprecated
    public static int zza(zzamc zzamcVar) {
        return zzamcVar.zzl();
    }

    public final void zzb(boolean z10) throws IOException {
        zzb(z10 ? (byte) 1 : (byte) 0);
    }

    public static int zza(int i10, zzalk zzalkVar) {
        return zzb(3, zzalkVar) + zzg(2, i10) + (zzj(8) << 1);
    }

    public final void zzb(int i10, double d10) throws IOException {
        zzf(i10, Double.doubleToRawLongBits(d10));
    }

    public final void zzb(double d10) throws IOException {
        zzh(Double.doubleToRawLongBits(d10));
    }

    public final void zzb(int i10, float f10) throws IOException {
        zzh(i10, Float.floatToRawIntBits(f10));
    }

    public static int zza(zzalk zzalkVar) {
        int iZza = zzalkVar.zza();
        return zzj(iZza) + iZza;
    }

    public final void zzb(float f10) throws IOException {
        zzk(Float.floatToRawIntBits(f10));
    }

    public static int zza(int i10, zzamc zzamcVar) {
        return zzb(zzamcVar) + zzj(24) + zzg(2, i10) + (zzj(8) << 1);
    }

    public static int zza(zzamc zzamcVar, zzamv zzamvVar) {
        int iZza = ((zzajf) zzamcVar).zza(zzamvVar);
        return zzj(iZza) + iZza;
    }

    public static int zza(int i10, String str) {
        return zza(str) + zzj(i10 << 3);
    }

    public static int zza(String str) {
        int length;
        try {
            length = zzant.zza(str);
        } catch (zzanx unused) {
            length = str.getBytes(zzalb.zza).length;
        }
        return zzj(length) + length;
    }

    public static zzakg zza(OutputStream outputStream, int i10) {
        return new zzd(outputStream, i10);
    }

    public final void zza(String str, zzanx zzanxVar) throws IOException {
        zza.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzanxVar);
        byte[] bytes = str.getBytes(zzalb.zza);
        try {
            zzn(bytes.length);
            zza(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e10) {
            throw new zzb(e10);
        }
    }
}
