package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.Provider;
import java.util.Date;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class yz1 implements cy1, l32, eq0, ef2 {
    public final /* synthetic */ int s;

    public /* synthetic */ yz1(int i6) {
        this.s = i6;
    }

    public static Date a(long j6) {
        return new Date((j6 - 2082844800) * 1000);
    }

    public static void b(byte b7, byte b8, byte b9, byte b10, char[] cArr, int i6) throws u52 {
        if (!j(b8)) {
            if ((((b8 + 112) + (b7 << 28)) >> 30) == 0 && !j(b9) && !j(b10)) {
                int i7 = ((b7 & 7) << 18) | ((b8 & 63) << 12) | ((b9 & 63) << 6) | (b10 & 63);
                cArr[i6] = (char) ((i7 >>> 10) + 55232);
                cArr[i6 + 1] = (char) ((i7 & 1023) + 56320);
                return;
            }
        }
        throw new u52("Protocol message had invalid UTF-8.");
    }

    public static final void c(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i6) {
        if (i6 < 0 || byteBuffer2.remaining() < i6 || byteBuffer3.remaining() < i6 || byteBuffer.remaining() < i6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i7 = 0; i7 < i6; i7++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void e(byte b7, byte b8, byte b9, char[] cArr, int i6) throws u52 {
        if (!j(b8)) {
            if (b7 != -32) {
                if (b7 != -19) {
                    if (!j(b9)) {
                        cArr[i6] = (char) (((b7 & 15) << 12) | ((b8 & 63) << 6) | (b9 & 63));
                        return;
                    }
                } else if (b8 < -96) {
                    b7 = -19;
                    if (!j(b9)) {
                    }
                }
            } else if (b8 >= -96) {
                b7 = -32;
                if (b7 != -19) {
                }
            }
        }
        throw new u52("Protocol message had invalid UTF-8.");
    }

    public static byte[] g(byte[]... bArr) throws GeneralSecurityException {
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= bArr.length) {
                byte[] bArr2 = new byte[i7];
                int i8 = 0;
                for (byte[] bArr3 : bArr) {
                    int length = bArr3.length;
                    System.arraycopy(bArr3, 0, bArr2, i8, length);
                    i8 += length;
                }
                return bArr2;
            }
            int length2 = bArr[i6].length;
            if (i7 > Integer.MAX_VALUE - length2) {
                throw new GeneralSecurityException("exceeded size limit");
            }
            i7 += length2;
            i6++;
        }
    }

    public static void h(byte b7, byte b8, char[] cArr, int i6) throws u52 {
        if (b7 < -62 || j(b8)) {
            throw new u52("Protocol message had invalid UTF-8.");
        }
        cArr[i6] = (char) (((b7 & 31) << 6) | (b8 & 63));
    }

    public static final byte[] i(int i6, byte[] bArr, byte[] bArr2) {
        if (bArr.length - 16 < i6) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[16];
        for (int i7 = 0; i7 < 16; i7++) {
            bArr3[i7] = (byte) (bArr[i7 + i6] ^ bArr2[i7]);
        }
        return bArr3;
    }

    public static boolean j(byte b7) {
        return b7 > -65;
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? KeyFactory.getInstance(str) : KeyFactory.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        switch (this.s) {
            case 0:
                gz1 gz1Var = (gz1) lt1Var;
                w12 w12VarB = x12.B();
                w12VarB.k("type.googleapis.com/google.crypto.tink.AesCmacKey");
                h02 h02VarC = i02.C();
                j02 j02VarC = k02.C();
                int i6 = gz1Var.f5192b;
                j02VarC.i();
                ((k02) j02VarC.f4126t).zzc = i6;
                k02 k02Var = (k02) j02VarC.g();
                h02VarC.i();
                i02.G((i02) h02VarC.f4126t, k02Var);
                int i7 = gz1Var.f5191a;
                h02VarC.i();
                ((i02) h02VarC.f4126t).zzd = i7;
                w12VarB.l(((i02) h02VarC.g()).g());
                w12VarB.j(zz1.b(gz1Var.f5193c));
                return py1.a((x12) w12VarB.g());
            default:
                qz1 qz1Var = (qz1) lt1Var;
                w12 w12VarB2 = x12.B();
                w12VarB2.k("type.googleapis.com/google.crypto.tink.HmacKey");
                q12 q12VarD = r12.D();
                s12 s12VarD = t12.D();
                int i8 = qz1Var.f8489b;
                s12VarD.i();
                ((t12) s12VarD.f4126t).zzd = i8;
                n12 n12Var = (n12) c02.f3353b.a(qz1Var.f8491d);
                s12VarD.i();
                ((t12) s12VarD.f4126t).zzc = n12Var.zza();
                t12 t12Var = (t12) s12VarD.g();
                q12VarD.i();
                r12.I((r12) q12VarD.f4126t, t12Var);
                int i9 = qz1Var.f8488a;
                q12VarD.i();
                ((r12) q12VarD.f4126t).zze = i9;
                w12VarB2.l(((r12) q12VarD.g()).g());
                w12VarB2.j((q22) c02.f3352a.a(qz1Var.f8490c));
                return py1.a((x12) w12VarB2.g());
        }
    }

    @Override // com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 6:
                ((bs) obj).m(new wa2(2, new pb2("Player release timed out."), 1003));
                break;
            case 7:
                ((bs) obj).zzn();
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            default:
                break;
        }
    }
}
