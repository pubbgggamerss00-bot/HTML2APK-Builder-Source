package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class nl extends j52<nl, ml> implements n62 {
    public static final int zza = 5;
    public static final int zzb = 6;
    public static final int zzc = 7;
    public static final int zzd = 8;
    public static final int zze = 9;
    public static final int zzf = 10;
    public static final int zzg = 11;
    public static final int zzh = 12;
    public static final int zzi = 13;
    public static final int zzj = 14;
    public static final int zzk = 15;
    public static final int zzl = 16;
    public static final int zzm = 17;
    public static final int zzn = 18;
    public static final int zzo = 19;
    public static final int zzp = 20;
    private static final nl zzu;
    private static volatile s62<nl> zzv;
    private km zzA;
    private pl zzB;
    private em zzC;
    private sl zzD;
    private int zzE;
    private int zzF;
    private jl zzG;
    private int zzH;
    private int zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private long zzM;
    private int zzw;
    private cm zzx;
    private gm zzy;
    private im zzz;

    static {
        nl nlVar = new nl();
        zzu = nlVar;
        j52.q(nl.class, nlVar);
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            return new w62(zzu, "\u0004\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM"});
        }
        if (iA == 3) {
            return new nl();
        }
        if (iA == 4) {
            return new ml(zzu);
        }
        if (iA == 5) {
            return zzu;
        }
        if (iA != 6) {
            throw null;
        }
        s62<nl> s62Var = zzv;
        if (s62Var != null) {
            return s62Var;
        }
        synchronized (nl.class) {
            try {
                f52Var = zzv;
                if (f52Var == null) {
                    f52Var = new f52();
                    zzv = f52Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f52Var;
    }
}
