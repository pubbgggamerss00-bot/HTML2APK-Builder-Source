package com.google.android.gms.internal.ads;

import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import com.google.android.gms.ads.RequestConfiguration;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class yd extends j52 implements n62 {
    private static final yd zza;
    private static volatile s62 zzb;
    private long zzA;
    private long zzB;
    private long zzC;
    private long zzD;
    private long zzE;
    private long zzI;
    private long zzJ;
    private long zzK;
    private long zzM;
    private be zzP;
    private int zzaA;
    private int zzaB;
    private String zzaC;
    private r52 zzaD;
    private int zzaE;
    private r52 zzaF;
    private td zzaG;
    private String zzaH;
    private long zzaI;
    private long zzaJ;
    private long zzaK;
    private long zzaL;
    private long zzaM;
    private long zzaN;
    private String zzaO;
    private pd zzaP;
    private qd zzaQ;
    private long zzaR;
    private long zzaS;
    private int zzaT;
    private long zzaU;
    private String zzaV;
    private int zzaW;
    private boolean zzaX;
    private String zzaY;
    private long zzaZ;
    private vd zzah;
    private r52 zzai;
    private xd zzaj;
    private long zzak;
    private long zzal;
    private long zzam;
    private long zzan;
    private long zzao;
    private long zzap;
    private long zzaq;
    private long zzar;
    private String zzas;
    private long zzat;
    private int zzau;
    private int zzav;
    private int zzaw;
    private int zzax;
    private je zzay;
    private long zzaz;
    private ie zzba;
    private long zzbb;
    private String zzbc;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzu;
    private long zzw;
    private long zzx;
    private long zzy;
    private long zzz;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzF = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzG = "D";
    private String zzH = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzL = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private long zzN = -1;
    private long zzO = -1;
    private long zzQ = -1;
    private long zzR = -1;
    private long zzS = -1;
    private long zzT = -1;
    private long zzU = -1;
    private long zzV = -1;
    private String zzW = "D";
    private String zzX = "D";
    private long zzY = -1;
    private int zzZ = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private int zzaa = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
    private long zzab = -1;
    private long zzac = -1;
    private long zzad = -1;
    private long zzae = -1;
    private long zzaf = -1;
    private int zzag = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;

    static {
        yd ydVar = new yd();
        zza = ydVar;
        j52.q(yd.class, ydVar);
    }

    public yd() {
        v62 v62Var = v62.f9734w;
        this.zzai = v62Var;
        this.zzak = -1L;
        this.zzal = -1L;
        this.zzam = -1L;
        this.zzan = -1L;
        this.zzao = -1L;
        this.zzap = -1L;
        this.zzaq = -1L;
        this.zzar = -1L;
        this.zzas = "D";
        this.zzat = -1L;
        this.zzaz = -1L;
        this.zzaA = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
        this.zzaB = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
        this.zzaC = "D";
        this.zzaD = v62Var;
        this.zzaE = CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
        this.zzaF = v62Var;
        this.zzaH = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzaI = -1L;
        this.zzaJ = -1L;
        this.zzaK = -1L;
        this.zzaL = -1L;
        this.zzaN = -1L;
        this.zzaO = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzaR = -1L;
        this.zzaS = -1L;
        this.zzaV = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzaW = 2;
        this.zzaY = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        this.zzbb = -1L;
        this.zzbc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }

    public static void A0(yd ydVar, vd vdVar) {
        r52 r52Var = ydVar.zzai;
        if (!r52Var.zzc()) {
            int size = r52Var.size();
            ydVar.zzai = r52Var.b(size + size);
        }
        ydVar.zzai.add(vdVar);
    }

    public static /* synthetic */ void B(yd ydVar, String str) {
        str.getClass();
        ydVar.zze |= 8388608;
        ydVar.zzaV = str;
    }

    public static void B0(yd ydVar) {
        ydVar.zzai = v62.f9734w;
    }

    public static /* synthetic */ void C(yd ydVar, long j6) {
        ydVar.zze |= 134217728;
        ydVar.zzaZ = j6;
    }

    public static /* synthetic */ void C0(yd ydVar, long j6) {
        ydVar.zzd |= 67108864;
        ydVar.zzaq = j6;
    }

    public static /* synthetic */ void D(yd ydVar, long j6) {
        ydVar.zze |= 8192;
        ydVar.zzaL = j6;
    }

    public static /* synthetic */ void D0(yd ydVar, String str) {
        str.getClass();
        ydVar.zzd |= 268435456;
        ydVar.zzas = str;
    }

    public static /* synthetic */ void E(yd ydVar, long j6) {
        ydVar.zze |= 4096;
        ydVar.zzaK = j6;
    }

    public static /* synthetic */ void E0(yd ydVar, long j6) {
        ydVar.zzd |= 134217728;
        ydVar.zzar = j6;
    }

    public static /* synthetic */ void F(yd ydVar, String str) {
        str.getClass();
        ydVar.zzd |= 256;
        ydVar.zzX = str;
    }

    public static /* synthetic */ void F0(yd ydVar, long j6) {
        ydVar.zze |= 2048;
        ydVar.zzaJ = j6;
    }

    public static /* synthetic */ void G(yd ydVar, String str) {
        str.getClass();
        ydVar.zzc |= 4194304;
        ydVar.zzF = str;
    }

    public static /* synthetic */ void G0(yd ydVar, String str) {
        str.getClass();
        ydVar.zze |= 65536;
        ydVar.zzaO = str;
    }

    public static /* synthetic */ void H(yd ydVar, long j6) {
        ydVar.zzc |= 1048576;
        ydVar.zzD = j6;
    }

    public static /* synthetic */ void H0(yd ydVar, String str) {
        str.getClass();
        ydVar.zzc |= 2;
        ydVar.zzg = str;
    }

    public static /* synthetic */ void I(yd ydVar, long j6) {
        ydVar.zzc |= 1024;
        ydVar.zzp = j6;
    }

    public static /* synthetic */ void I0(yd ydVar, String str) {
        str.getClass();
        ydVar.zzd |= 128;
        ydVar.zzW = str;
    }

    public static /* synthetic */ void J(yd ydVar, long j6) {
        ydVar.zzc |= 2048;
        ydVar.zzu = j6;
    }

    public static /* synthetic */ void J0(yd ydVar, long j6) {
        ydVar.zzc |= 4;
        ydVar.zzh = j6;
    }

    public static /* synthetic */ void K(yd ydVar, String str) {
        str.getClass();
        ydVar.zzc |= 1;
        ydVar.zzf = str;
    }

    public static /* synthetic */ void K0(yd ydVar, long j6) {
        ydVar.zzd |= 2097152;
        ydVar.zzal = j6;
    }

    public static /* synthetic */ void L(yd ydVar, long j6) {
        ydVar.zzd |= 4194304;
        ydVar.zzam = j6;
    }

    public static /* synthetic */ void L0(yd ydVar, long j6) {
        ydVar.zzc |= 32;
        ydVar.zzk = j6;
    }

    public static /* synthetic */ void M(yd ydVar, long j6) {
        ydVar.zzc |= 524288;
        ydVar.zzC = j6;
    }

    public static /* synthetic */ void M0(yd ydVar, long j6) {
        ydVar.zzc |= 16;
        ydVar.zzj = j6;
    }

    public static /* synthetic */ void N(yd ydVar, long j6) {
        ydVar.zzd |= 8388608;
        ydVar.zzan = j6;
    }

    public static /* synthetic */ void N0(yd ydVar, String str) {
        str.getClass();
        ydVar.zzc |= 16777216;
        ydVar.zzH = str;
    }

    public static /* synthetic */ void O(yd ydVar, long j6) {
        ydVar.zzd |= 64;
        ydVar.zzV = j6;
    }

    public static /* synthetic */ void O0(yd ydVar, long j6) {
        ydVar.zzd |= 32;
        ydVar.zzU = j6;
    }

    public static /* synthetic */ void P(yd ydVar, long j6) {
        ydVar.zzd |= 16;
        ydVar.zzT = j6;
    }

    public static /* synthetic */ void P0(yd ydVar, long j6) {
        ydVar.zzd |= 4096;
        ydVar.zzab = j6;
    }

    public static /* synthetic */ void Q(yd ydVar, long j6) {
        ydVar.zzc |= Integer.MIN_VALUE;
        ydVar.zzO = j6;
    }

    public static /* synthetic */ void Q0(yd ydVar, long j6) {
        ydVar.zzd |= 8192;
        ydVar.zzac = j6;
    }

    public static /* synthetic */ void R(yd ydVar, long j6) {
        ydVar.zzd |= 8;
        ydVar.zzS = j6;
    }

    public static /* synthetic */ void R0(yd ydVar, boolean z6) {
        ydVar.zze |= 33554432;
        ydVar.zzaX = z6;
    }

    public static /* synthetic */ void S(yd ydVar, long j6) {
        ydVar.zzd |= 4;
        ydVar.zzR = j6;
    }

    public static /* synthetic */ void T(yd ydVar, long j6) {
        ydVar.zzc |= 1073741824;
        ydVar.zzN = j6;
    }

    public static /* synthetic */ void U(yd ydVar, long j6) {
        ydVar.zzc |= 32768;
        ydVar.zzy = j6;
    }

    public static /* synthetic */ void V(yd ydVar, long j6) {
        ydVar.zzd |= 2;
        ydVar.zzQ = j6;
    }

    public static /* synthetic */ void W(yd ydVar, long j6) {
        ydVar.zzc |= 8192;
        ydVar.zzw = j6;
    }

    public static /* synthetic */ void X(yd ydVar, long j6) {
        ydVar.zzc |= 16384;
        ydVar.zzx = j6;
    }

    public static /* synthetic */ void Y(yd ydVar, long j6) {
        ydVar.zzd |= 16384;
        ydVar.zzad = j6;
    }

    public static /* synthetic */ void Z(yd ydVar, long j6) {
        ydVar.zze |= 1024;
        ydVar.zzaI = j6;
    }

    public static /* synthetic */ void a0(yd ydVar, vd vdVar) {
        ydVar.zzah = vdVar;
        ydVar.zzd |= 262144;
    }

    public static kd b0() {
        return (kd) zza.l();
    }

    public static /* synthetic */ void c0(yd ydVar, long j6) {
        ydVar.zzc |= 67108864;
        ydVar.zzJ = j6;
    }

    public static /* synthetic */ void d0(yd ydVar, long j6) {
        ydVar.zzc |= 65536;
        ydVar.zzz = j6;
    }

    public static /* synthetic */ void e0(yd ydVar, long j6) {
        ydVar.zzc |= 2097152;
        ydVar.zzE = j6;
    }

    public static /* synthetic */ void f0(yd ydVar, long j6) {
        ydVar.zzc |= 134217728;
        ydVar.zzK = j6;
    }

    public static /* synthetic */ void g0(yd ydVar, long j6) {
        ydVar.zzc |= 33554432;
        ydVar.zzI = j6;
    }

    public static /* synthetic */ void h0(yd ydVar, long j6) {
        ydVar.zzc |= 536870912;
        ydVar.zzM = j6;
    }

    public static /* synthetic */ void i0(yd ydVar, xd xdVar) {
        ydVar.zzaj = xdVar;
        ydVar.zzd |= 524288;
    }

    public static /* synthetic */ void j0(yd ydVar, String str) {
        str.getClass();
        ydVar.zzc |= 268435456;
        ydVar.zzL = str;
    }

    public static /* synthetic */ void o0(yd ydVar, int i6) {
        ydVar.zzaa = i6 - 1;
        ydVar.zzd |= 2048;
    }

    public static /* synthetic */ void p0(yd ydVar) {
        ydVar.zzaW = 5;
        ydVar.zze |= 16777216;
    }

    public static /* synthetic */ void q0(yd ydVar, int i6) {
        ydVar.zzag = i6 - 1;
        ydVar.zzd |= 131072;
    }

    public static /* synthetic */ void r0(yd ydVar, int i6) {
        ydVar.zzaB = i6 - 1;
        ydVar.zze |= 32;
    }

    public static /* synthetic */ void s0(yd ydVar, int i6) {
        ydVar.zzaT = i6 - 1;
        ydVar.zze |= 2097152;
    }

    public static /* synthetic */ void t0(yd ydVar, int i6) {
        ydVar.zzaA = i6 - 1;
        ydVar.zze |= 16;
    }

    public static /* synthetic */ void u0(yd ydVar, int i6) {
        ydVar.zzZ = i6 - 1;
        ydVar.zzd |= 1024;
    }

    public static yd v0() {
        return zza;
    }

    public static yd w0(byte[] bArr, u42 u42Var) throws u52 {
        j52 j52VarZ = j52.z(zza, bArr, bArr.length, u42Var);
        j52.y(j52VarZ);
        return (yd) j52VarZ;
    }

    public final boolean k0() {
        return this.zzaX;
    }

    public final boolean l0() {
        return (this.zzc & 4194304) != 0;
    }

    public final boolean m0() {
        return (this.zze & 268435456) != 0;
    }

    public final int n0() {
        int i6;
        switch (this.zzaW) {
            case 0:
                i6 = 1;
                break;
            case 1:
                i6 = 2;
                break;
            case 2:
                i6 = 3;
                break;
            case 3:
                i6 = 4;
                break;
            case 4:
                i6 = 5;
                break;
            case 5:
                i6 = 6;
                break;
            case 6:
                i6 = 7;
                break;
            case 7:
                i6 = 8;
                break;
            case 8:
                i6 = 9;
                break;
            case 9:
                i6 = 10;
                break;
            default:
                i6 = 0;
                break;
        }
        if (i6 == 0) {
            return 3;
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.j52
    public final Object x(int i6, j52 j52Var) {
        s62 f52Var;
        int iA = s1.b.a(i6);
        if (iA == 0) {
            return (byte) 1;
        }
        if (iA == 2) {
            zc zcVar = zc.f11253c;
            ld ldVar = ld.f6659d;
            return new w62(zza, "\u0001b\u0000\u0003\u0001Įb\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂV\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈW\u0019ဂ[\u001a᠌X\u001bဈ\u0016\u001cဇY\u001dဈ\u0018\u001eဈZ\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0᠌*1᠌+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08᠌19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=A᠌>B᠌?Cဈ<D᠌AEဉBFဂCGဂ8Hဂ9I᠌DJဂ)Kဈ\u0017L᠌EMဈFN\u001bO᠌GP\u001bQဉHRဈISဂJTဂKUဂLVဂMWဂNXဂOYဈPZဉQ[ဉR\\ဂS]ဂT^᠌U_᠌@Éဉ\\ĭဂ]Įဈ^", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzaU", "zzD", "zzE", "zzaV", "zzaZ", "zzaW", zcVar, "zzF", "zzaX", "zzH", "zzaY", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzai", vd.class, "zzU", "zzV", "zzW", "zzX", "zzZ", ldVar, "zzaa", ldVar, "zzah", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", ldVar, "zzaj", "zzak", "zzal", "zzam", "zzan", "zzaq", "zzar", "zzat", "zzau", ee.f4238b, "zzav", he.f5345b, "zzas", "zzax", ld.f6657b, "zzay", "zzaz", "zzao", "zzap", "zzaA", ldVar, "zzY", "zzG", "zzaB", ldVar, "zzaC", "zzaD", sd.class, "zzaE", ldVar, "zzaF", nd.class, "zzaG", "zzaH", "zzaI", "zzaJ", "zzaK", "zzaL", "zzaM", "zzaN", "zzaO", "zzaP", "zzaQ", "zzaR", "zzaS", "zzaT", ld.f6658c, "zzaw", od.f7714b, "zzba", "zzbb", "zzbc"});
        }
        if (iA == 3) {
            return new yd();
        }
        if (iA == 4) {
            return new kd(zza);
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
        synchronized (yd.class) {
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

    public final ie x0() {
        ie ieVar = this.zzba;
        return ieVar == null ? ie.C() : ieVar;
    }

    public final String y0() {
        return this.zzaV;
    }

    public final String z0() {
        return this.zzF;
    }
}
