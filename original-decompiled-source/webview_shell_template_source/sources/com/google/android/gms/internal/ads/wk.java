package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class wk extends j52<wk, xk> implements n62 {
    public static final int zza = 1;
    public static final int zzb = 2;
    public static final int zzc = 3;
    public static final int zzd = 4;
    public static final int zze = 5;
    public static final int zzf = 6;
    public static final int zzg = 7;
    public static final int zzh = 8;
    public static final int zzi = 9;
    public static final int zzj = 10;
    public static final int zzk = 11;
    public static final int zzl = 12;
    public static final int zzm = 13;
    private static final p52<om> zzn = new a();
    private static final wk zzo;
    private static volatile s62<wk> zzp;
    private tk zzA;
    private int zzB;
    private int zzC;
    private int zzD;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzu;
    private long zzv;
    private int zzw;
    private long zzx;
    private long zzy;
    private n52 zzz = k52.f6256w;

    /* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
    public class a implements p52<om> {
    }

    static {
        wk wkVar = new wk();
        zzo = wkVar;
        j52.q(wk.class, wkVar);
    }

    public static void B(wk wkVar, ArrayList arrayList) {
        r52 r52Var = wkVar.zzz;
        if (!((v32) r52Var).s) {
            k52 k52Var = (k52) r52Var;
            int i6 = k52Var.f6258u;
            wkVar.zzz = k52Var.b(i6 + i6);
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((k52) wkVar.zzz).f(((om) obj).s);
        }
    }

    public static void C(wk wkVar, bn bnVar) {
        wkVar.getClass();
        wkVar.zzC = bnVar.s;
        wkVar.zzu |= 64;
    }

    public static void D(wk wkVar, bn bnVar) {
        wkVar.getClass();
        wkVar.zzD = bnVar.s;
        wkVar.zzu |= 128;
    }

    public static void E(wk wkVar, int i6) {
        wkVar.zzu |= 256;
        wkVar.zzE = i6;
    }

    public static void F(wk wkVar, al alVar) {
        wkVar.getClass();
        wkVar.zzG = alVar.s;
        wkVar.zzu |= 1024;
    }

    public static void G(wk wkVar, tk tkVar) {
        wkVar.getClass();
        wkVar.zzA = tkVar;
        wkVar.zzu |= 16;
    }

    public static void H(wk wkVar, bn bnVar) {
        wkVar.getClass();
        wkVar.zzF = bnVar.s;
        wkVar.zzu |= AdRequest.MAX_CONTENT_URL_LENGTH;
    }

    public static void I(wk wkVar, long j6) {
        wkVar.zzu |= 8;
        wkVar.zzy = j6;
    }

    public static void J(wk wkVar, long j6) {
        wkVar.zzu |= 4;
        wkVar.zzx = j6;
    }

    public static void K(wk wkVar, bn bnVar) {
        wkVar.getClass();
        wkVar.zzw = bnVar.s;
        wkVar.zzu |= 2;
    }

    public static void L(wk wkVar, long j6) {
        wkVar.zzu |= 1;
        wkVar.zzv = j6;
    }

    public static void M(wk wkVar, long j6) {
        wkVar.zzu |= 2048;
        wkVar.zzH = j6;
    }

    public static void N(wk wkVar, bn bnVar) {
        wkVar.getClass();
        wkVar.zzB = bnVar.s;
        wkVar.zzu |= 32;
    }

    public static xk Q() {
        return zzo.l();
    }

    public static wk S(byte[] bArr) throws u52 {
        wk wkVar = zzo;
        int length = bArr.length;
        u42 u42Var = u42.f9458b;
        u62 u62Var = u62.f9474c;
        j52 j52VarZ = j52.z(wkVar, bArr, length, u42.f9459c);
        j52.y(j52VarZ);
        return (wk) j52VarZ;
    }

    public final long O() {
        return this.zzv;
    }

    public final bn P() {
        int i6 = this.zzw;
        bn bnVar = bn.ENUM_FALSE;
        bn bnVar2 = i6 != 0 ? i6 != 1 ? i6 != 1000 ? null : bn.ENUM_UNKNOWN : bn.ENUM_TRUE : bnVar;
        return bnVar2 == null ? bnVar : bnVar2;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            ld ldVar = ld.f6660e;
            return new w62(zzo, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ࠞ\u0006ဉ\u0004\u0007᠌\u0005\b᠌\u0006\t᠌\u0007\nင\b\u000b᠌\t\f᠌\n\rဂ\u000b", new Object[]{"zzu", "zzv", "zzw", ldVar, "zzx", "zzy", "zzz", nm.f7468a, "zzA", "zzB", ldVar, "zzC", ldVar, "zzD", ldVar, "zzE", "zzF", ldVar, "zzG", zk.f11323a, "zzH"});
        }
        if (iA == 3) {
            return new wk();
        }
        if (iA == 4) {
            return new xk();
        }
        if (iA == 5) {
            return zzo;
        }
        if (iA != 6) {
            throw null;
        }
        s62<wk> s62Var = zzp;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (wk.class) {
            try {
                f52Var = zzp;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzp = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
