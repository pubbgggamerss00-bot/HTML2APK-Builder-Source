package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class c22 extends j52 implements n62 {
    private static final c22 zza;
    private static volatile s62 zzb;
    private int zzc;
    private r52 zzd = v62.f9734w;

    static {
        c22 c22Var = new c22();
        zza = c22Var;
        j52.q(c22.class, c22Var);
    }

    public static z12 D() {
        return (z12) zza.l();
    }

    public static c22 F(ByteArrayInputStream byteArrayInputStream, u42 u42Var) throws u52 {
        j52 j52VarV = j52.v(zza, new j42(byteArrayInputStream), u42Var);
        j52.y(j52VarV);
        return (c22) j52VarV;
    }

    public static void H(c22 c22Var, b22 b22Var) {
        r52 r52Var = c22Var.zzd;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            c22Var.zzd = r52Var.b(size + size);
        }
        c22Var.zzd.add(b22Var);
    }

    public final int B() {
        return this.zzd.size();
    }

    public final int C() {
        return this.zzc;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b22 E(int i6) {
        return (b22) this.zzd.get(i6);
    }

    public final r52 G() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", b22.class});
        }
        if (iA == 3) {
            return new c22();
        }
        if (iA == 4) {
            return new z12(zza);
        }
        if (iA == 5) {
            return zza;
        }
        if (iA != 6) {
            throw null;
        }
        s62 s62Var = zzb;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (c22.class) {
            try {
                f52Var = zzb;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzb = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
