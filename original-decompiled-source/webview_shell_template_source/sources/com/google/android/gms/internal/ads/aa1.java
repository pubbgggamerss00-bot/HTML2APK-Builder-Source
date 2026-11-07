package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzr;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Signature;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.regex.Pattern;
import javax.crypto.Cipher;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class aa1 implements sa1, em1, bm1, cy1, zx1, fy1, ax1, l32, eq0, jm0 {
    public final /* synthetic */ int s;

    public /* synthetic */ aa1(int i6) {
        this.s = i6;
    }

    public static int a(int i6) {
        return (int) (Integer.rotateLeft((int) (i6 * (-862048943)), 15) * 461845907);
    }

    public static bj1 c(Context context, int i6, String str, String str2, xh1 xh1Var) {
        bj1 bj1Var;
        ci1 ci1Var = new ci1(context, i6, str, str2, xh1Var);
        try {
            bj1Var = (bj1) ci1Var.f3591d.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e6) {
            ci1Var.b(2009, ci1Var.f3594g, e6);
            bj1Var = null;
        }
        ci1Var.b(3004, ci1Var.f3594g, null);
        if (bj1Var != null) {
            if (bj1Var.f3207u == 7) {
                xh1.f10597e = 3;
            } else {
                xh1.f10597e = 2;
            }
        }
        return bj1Var == null ? new bj1() : bj1Var;
    }

    public static Object e(Future future) {
        Object obj;
        boolean z6 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z6 = true;
            } catch (Throwable th) {
                if (z6) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z6) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static boolean j(int i6) {
        Boolean bool;
        if (i6 - 1 == 0) {
            return !vw1.a();
        }
        if (!vw1.a()) {
            return true;
        }
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            vw1.f9957a.logp(Level.INFO, "com.google.crypto.tink.config.internal.TinkFipsUtil", "checkConscryptIsAvailableAndUsesFipsBoringSsl", "Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static boolean k(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static byte[] l(byte[] bArr) {
        if (bArr.length != 16) {
            throw new IllegalArgumentException("value must be a block.");
        }
        byte[] bArr2 = new byte[16];
        int i6 = 0;
        while (i6 < 16) {
            int i7 = i6 + 1;
            byte b7 = bArr[i6];
            byte b8 = (byte) ((b7 + b7) & 254);
            bArr2[i6] = b8;
            if (i6 < 15) {
                bArr2[i6] = (byte) (((bArr[i7] >> 7) & 1) | b8);
            }
            i6 = i7;
        }
        bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int m(Context context, xh1 xh1Var) throws IOException {
        xh1 xh1Var2;
        int i6;
        char c7;
        int i7;
        FileInputStream fileInputStream;
        byte[] bArr;
        int i8;
        String[] strArr;
        File file = new File(new File(context.getApplicationInfo().dataDir), "lib");
        if (file.exists()) {
            xh1Var2 = xh1Var;
            i6 = 1;
            c7 = 0;
            File[] fileArrListFiles = file.listFiles(new eq1(Pattern.compile(".*\\.so$", 2)));
            if (fileArrListFiles != null && fileArrListFiles.length != 0) {
                try {
                    fileInputStream = new FileInputStream(fileArrListFiles[0]);
                    try {
                        bArr = new byte[20];
                    } finally {
                    }
                } catch (IOException e6) {
                    o(null, e6.toString(), xh1Var2);
                }
                if (fileInputStream.read(bArr) == 20) {
                    byte[] bArr2 = {0, 0};
                    if (bArr[5] != 2) {
                        bArr2[0] = bArr[19];
                        bArr2[1] = bArr[18];
                        short s = ByteBuffer.wrap(bArr2).getShort();
                        if (s == 3) {
                            fileInputStream.close();
                            i7 = 5;
                        } else if (s == 40) {
                            fileInputStream.close();
                            i7 = 3;
                        } else if (s == 62) {
                            fileInputStream.close();
                            i7 = 7;
                        } else if (s == 183) {
                            fileInputStream.close();
                            i7 = 6;
                        } else if (s != 243) {
                            o(bArr, null, xh1Var2);
                        } else {
                            fileInputStream.close();
                            i7 = 8;
                        }
                        if (i7 == 1000) {
                            HashSet hashSet = new HashSet(Arrays.asList("i686", "armv71"));
                            String property = System.getProperty("os.arch");
                            if (TextUtils.isEmpty(property) || !hashSet.contains(property)) {
                                try {
                                    strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
                                } catch (IllegalAccessException e7) {
                                    xh1Var2.b(2024, 0L, e7);
                                } catch (NoSuchFieldException e8) {
                                    xh1Var2.b(2024, 0L, e8);
                                }
                                if (strArr == null || strArr.length <= 0) {
                                    property = Build.CPU_ABI;
                                    if (property == null) {
                                        property = Build.CPU_ABI2;
                                    }
                                } else {
                                    property = strArr[c7];
                                }
                            }
                            if (TextUtils.isEmpty(property)) {
                                o(null, "Empty dev arch", xh1Var2);
                            } else if (property.equalsIgnoreCase("i686") || property.equalsIgnoreCase("x86")) {
                                i8 = 5;
                            } else if (property.equalsIgnoreCase("x86_64")) {
                                i8 = 7;
                            } else if (property.equalsIgnoreCase("arm64-v8a")) {
                                i8 = 6;
                            } else if (property.equalsIgnoreCase("armeabi-v7a") || property.equalsIgnoreCase("armv71")) {
                                i8 = 3;
                            } else if (property.equalsIgnoreCase("riscv64")) {
                                i8 = 8;
                            } else {
                                o(null, property, xh1Var2);
                            }
                            i8 = i6;
                        } else {
                            i8 = i7;
                        }
                        xh1Var2.d(5018, 0L, null, null, i8 != i6 ? i8 != 3 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? i8 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                        return i8;
                    }
                    o(bArr, null, xh1Var2);
                }
                fileInputStream.close();
                i7 = 1;
                if (i7 == 1000) {
                }
                xh1Var2.d(5018, 0L, null, null, i8 != i6 ? i8 != 3 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? i8 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
                return i8;
            }
            xh1Var2.d(5017, 0L, null, null, "No .so");
        } else {
            i6 = 1;
            c7 = 0;
            xh1Var2 = xh1Var;
            xh1Var2.d(5017, 0L, null, null, "No lib/");
        }
        i7 = 1000;
        if (i7 == 1000) {
        }
        xh1Var2.d(5018, 0L, null, null, i8 != i6 ? i8 != 3 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? i8 != 8 ? "null" : "RISCV64" : "X86_64" : "ARM64" : "X86" : "ARM7" : "UNSUPPORTED");
        return i8;
    }

    public static int n(Object obj) {
        return a(obj == null ? 0 : obj.hashCode());
    }

    public static final void o(byte[] bArr, String str, xh1 xh1Var) {
        StringBuilder sb = new StringBuilder("os.arch:");
        sb.append(System.getProperty("os.arch"));
        sb.append(";");
        try {
            String[] strArr = (String[]) Build.class.getField("SUPPORTED_ABIS").get(null);
            if (strArr != null) {
                sb.append("supported_abis:");
                sb.append(Arrays.toString(strArr));
                sb.append(";");
            }
        } catch (IllegalAccessException | NoSuchFieldException unused) {
        }
        sb.append("CPU_ABI:");
        sb.append(Build.CPU_ABI);
        sb.append(";CPU_ABI2:");
        sb.append(Build.CPU_ABI2);
        sb.append(";");
        if (bArr != null) {
            sb.append("ELF:");
            sb.append(Arrays.toString(bArr));
            sb.append(";");
        }
        if (str != null) {
            sb.append("dbg:");
            sb.append(str);
            sb.append(";");
        }
        xh1Var.d(4007, 0L, null, null, sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.fy1
    public Object b(ih1 ih1Var) {
        uv1 uv1Var = (uv1) ih1Var;
        r32 r32Var = uv1Var.f9640w;
        xj1 xj1Var = uv1Var.f9639v;
        ey1 ey1Var = wv1.f10280a;
        return ((Cipher) gw1.f5175f.get()) != null ? new sw1(((r32) xj1Var.f10619t).b(), r32Var.b()) : new g32(1, ((r32) xj1Var.f10619t).b(), r32Var.b());
    }

    @Override // com.google.android.gms.internal.ads.l32
    public /* bridge */ /* synthetic */ Object d(String str, Provider provider) {
        return provider == null ? Signature.getInstance(str) : Signature.getInstance(str, provider);
    }

    @Override // com.google.android.gms.internal.ads.cy1
    public py1 f(lt1 lt1Var) {
        kv1 kv1Var = (kv1) lt1Var;
        w12 w12VarB = x12.B();
        w12VarB.k("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        k22 k22VarB = l22.B();
        String str = kv1Var.f6503a;
        k22VarB.i();
        l22.F((l22) k22VarB.f4126t, str);
        w12VarB.l(((l22) k22VarB.g()).g());
        w12VarB.j(lv1.b(kv1Var.f6504b));
        return py1.a((x12) w12VarB.g());
    }

    @Override // com.google.android.gms.internal.ads.ax1
    public ih1 g(oy1 oy1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 12:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var = oy1Var.f7887c;
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    m02 m02VarD = m02.D(g42Var, u42.f9459c);
                    if (m02VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (m02VarD.E().B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                    }
                    if (m02VarD.F().B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                    }
                    cu1 cu1Var = new cu1();
                    cu1Var.a(m02VarD.E().F().g());
                    cu1Var.b(m02VarD.F().G().g());
                    cu1Var.c(m02VarD.E().E().B());
                    cu1Var.d(m02VarD.F().F().B());
                    cu1Var.f3668e = yv1.a(m02VarD.F().F().C());
                    cu1Var.f3669f = yv1.b(oy1Var.f7889e);
                    fu1 fu1VarE = cu1Var.e();
                    wt1 wt1Var = new wt1();
                    wt1Var.f10270a = fu1VarE;
                    wt1Var.f10271b = xj1.h(m02VarD.E().F().c());
                    wt1Var.f10272c = xj1.h(m02VarD.F().G().c());
                    wt1Var.f10273d = oy1Var.f7890f;
                    return wt1Var.a();
                } catch (u52 unused) {
                    throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                }
            default:
                if (!oy1Var.f7885a.equals("type.googleapis.com/google.crypto.tink.XAesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to XAesGcmProtoSerialization.parseKey");
                }
                try {
                    g42 g42Var2 = oy1Var.f7887c;
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    t22 t22VarD = t22.D(g42Var2, u42.f9459c);
                    if (t22VarD.B() != 0) {
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    }
                    if (t22VarD.F().g() == 32) {
                        return rv1.m(tv1.b(rw1.a(oy1Var.f7889e), t22VarD.E().B()), xj1.h(t22VarD.F().c()), oy1Var.f7890f);
                    }
                    throw new GeneralSecurityException("Only 32 byte key size is accepted");
                } catch (u52 unused2) {
                    throw new GeneralSecurityException("Parsing XAesGcmKey failed");
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zx1
    public lt1 h(py1 py1Var) throws GeneralSecurityException {
        switch (this.s) {
            case 10:
                x12 x12Var = py1Var.f8181b;
                if (!x12Var.H().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var.H())));
                }
                try {
                    g42 g42VarG = x12Var.G();
                    u42 u42Var = u42.f9458b;
                    u62 u62Var = u62.f9474c;
                    return pv1.a(p22.E(g42VarG, u42.f9459c), x12Var.F());
                } catch (u52 e6) {
                    throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e6);
                }
            default:
                x12 x12Var2 = py1Var.f8181b;
                if (!x12Var2.H().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: ".concat(String.valueOf(x12Var2.H())));
                }
                try {
                    g42 g42VarG2 = x12Var2.G();
                    u42 u42Var2 = u42.f9458b;
                    u62 u62Var2 = u62.f9474c;
                    f12 f12VarE = f12.E(g42VarG2, u42.f9459c);
                    if (f12VarE.C() != 0) {
                        throw new GeneralSecurityException("Only version 0 parameters are accepted");
                    }
                    mx mxVar = new mx(2);
                    mxVar.c(f12VarE.B());
                    mxVar.b();
                    mxVar.d();
                    mxVar.f7235w = dw1.a(x12Var2.F());
                    return mxVar.f();
                } catch (u52 e7) {
                    throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e7);
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.bm1
    public Iterator i(cm1 cm1Var, CharSequence charSequence) {
        return new yl1(charSequence);
    }

    @Override // com.google.android.gms.internal.ads.em1
    /* renamed from: zza */
    public Object mo7zza() {
        switch (this.s) {
            case 3:
                return -1;
            default:
                HandlerThread handlerThread = new HandlerThread("OverlayDisplayService", 10);
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
        }
    }

    public /* synthetic */ aa1(fg2 fg2Var) {
        this.s = 23;
    }

    @Override // com.google.android.gms.internal.ads.sa1, com.google.android.gms.internal.ads.eq0, com.google.android.gms.internal.ads.jm0
    /* renamed from: zza */
    public void mo6zza(Object obj) {
        switch (this.s) {
            case 0:
                ((zzr) obj).zzdp();
                break;
            case 18:
                break;
            case 19:
                break;
            case 20:
                break;
            case dn.zzm /* 21 */:
                break;
            case 22:
                break;
            default:
                ef2 ef2Var = ((ki2) obj).f6435b;
                break;
        }
    }
}
