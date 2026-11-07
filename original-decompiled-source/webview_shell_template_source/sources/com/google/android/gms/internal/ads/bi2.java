package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class bi2 {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3190a;

    /* renamed from: b, reason: collision with root package name */
    public final s42 f3191b;

    /* renamed from: c, reason: collision with root package name */
    public final zh2 f3192c;

    /* renamed from: d, reason: collision with root package name */
    public final ei2 f3193d;

    /* renamed from: e, reason: collision with root package name */
    public final am0 f3194e;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f3196g;

    /* renamed from: i, reason: collision with root package name */
    public long f3197i;

    /* renamed from: j, reason: collision with root package name */
    public os1 f3198j;

    /* renamed from: k, reason: collision with root package name */
    public s1 f3199k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f3200l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ei2 f3201m;

    /* renamed from: f, reason: collision with root package name */
    public final b1 f3195f = new b1();
    public boolean h = true;

    public bi2(ei2 ei2Var, Uri uri, lo1 lo1Var, tg2 tg2Var, ei2 ei2Var2, am0 am0Var) {
        this.f3201m = ei2Var;
        this.f3190a = uri;
        this.f3191b = new s42(lo1Var);
        this.f3192c = tg2Var;
        this.f3193d = ei2Var2;
        this.f3194e = am0Var;
        fh2.f4686a.getAndIncrement();
        this.f3198j = b(0L);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(2:16|17)|18|(5:20|160|21|22|(18:24|25|156|32|(1:34)(1:35)|36|(1:38)(1:39)|40|(1:42)(1:43)|44|(1:46)(1:47)|48|(4:50|152|51|(17:53|54|(1:60)|61|(1:68)(1:65)|69|(1:76)|77|(1:79)|80|(1:(3:137|82|(6:146|84|1c2|93|(6:169|95|1f5|99|100|172)(1:171)|170)(2:168|111))(1:167))|(3:114|(1:116)|117)|118|142|119|165|(2:164|176)(1:166))(6:154|55|56|(0)|61|(14:63|68|69|(3:71|74|76)|77|(0)|80|(2:(0)(0)|170)|(0)|118|142|119|165|(0)(0))(0)))(4:56|(0)|61|(0)(0))|(2:125|(1:127))|128|144|129|130)(3:26|150|27))(1:31)|28|156|32|(0)(0)|36|(0)(0)|40|(0)(0)|44|(0)(0)|48|(0)(0)|(0)|128|144|129|130) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0174, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[LOOP:0: B:3:0x0006->B:166:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0214 A[EDGE_INSN: B:167:0x0214->B:112:0x0214 BREAK  A[LOOP:1: B:81:0x01ba->B:170:0x01ba], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b4 A[Catch: all -> 0x0174, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ca A[Catch: all -> 0x0174, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e0 A[Catch: all -> 0x0174, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f6 A[Catch: all -> 0x0174, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0112 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0146 A[Catch: all -> 0x0174, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157 A[Catch: all -> 0x0174, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a9 A[Catch: all -> 0x0174, TRY_LEAVE, TryCatch #10 {all -> 0x0174, blocks: (B:32:0x00a9, B:34:0x00b4, B:36:0x00c0, B:38:0x00ca, B:40:0x00d6, B:42:0x00e0, B:44:0x00ec, B:46:0x00f6, B:48:0x0108, B:50:0x0112, B:51:0x0118, B:60:0x0146, B:61:0x014d, B:63:0x0157, B:65:0x015b, B:69:0x0178, B:71:0x0194, B:74:0x019d, B:76:0x01a1, B:77:0x01a5, B:79:0x01a9, B:55:0x0122, B:58:0x0138, B:27:0x007c, B:30:0x0097), top: B:156:0x00a9 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() throws Throwable {
        long j6;
        long j7;
        long jC;
        boolean z6;
        int i6;
        List list;
        String str;
        List list2;
        String str2;
        List list3;
        String str3;
        List list4;
        boolean zEquals;
        List list5;
        int i7;
        lo1 lo1Var;
        k3 k3Var;
        lo1 lo1Var2;
        int iE;
        x0 x0Var;
        int i8;
        int i9;
        int i10;
        while (!this.f3196g) {
            int i11 = 0;
            try {
                j7 = this.f3195f.f2886a;
                os1 os1VarB = b(j7);
                this.f3198j = os1VarB;
                jC = this.f3191b.c(os1VarB);
            } catch (Throwable th) {
                th = th;
                j6 = -1;
            }
            if (this.f3196g) {
                tg2 tg2Var = (tg2) this.f3192c;
                if (tg2Var.a() != -1) {
                    this.f3195f.f2886a = tg2Var.a();
                }
                try {
                    this.f3191b.zzd();
                    return;
                } catch (IOException unused) {
                    return;
                }
            }
            if (jC != -1) {
                jC += j7;
                ei2 ei2Var = this.f3201m;
                ei2Var.F.post(new u(12, ei2Var));
            }
            long j8 = jC;
            ei2 ei2Var2 = this.f3201m;
            Map mapZze = this.f3191b.f8790a.zze();
            List list6 = (List) mapZze.get("icy-br");
            if (list6 != null) {
                String str4 = (String) list6.get(0);
                try {
                    i10 = Integer.parseInt(str4) * CameraAccessExceptionCompat.CAMERA_DEPRECATED_HAL;
                } catch (NumberFormatException unused2) {
                    j6 = -1;
                    i10 = -1;
                }
                if (i10 > 0) {
                    j6 = -1;
                    z6 = true;
                    i6 = i10;
                    list = (List) mapZze.get("icy-genre");
                    if (list != null) {
                        str = (String) list.get(0);
                        z6 = true;
                    } else {
                        str = null;
                    }
                    list2 = (List) mapZze.get("icy-name");
                    if (list2 != null) {
                        str2 = (String) list2.get(0);
                        z6 = true;
                    } else {
                        str2 = null;
                    }
                    list3 = (List) mapZze.get("icy-url");
                    if (list3 != null) {
                        str3 = (String) list3.get(0);
                        z6 = true;
                    } else {
                        str3 = null;
                    }
                    list4 = (List) mapZze.get("icy-pub");
                    if (list4 != null) {
                        zEquals = ((String) list4.get(0)).equals("1");
                        z6 = true;
                    } else {
                        zEquals = false;
                    }
                    list5 = (List) mapZze.get("icy-metaint");
                    if (list5 != null) {
                        String str5 = (String) list5.get(0);
                        try {
                            i9 = Integer.parseInt(str5);
                        } catch (NumberFormatException unused3) {
                            i9 = -1;
                        }
                        if (i9 > 0) {
                            z6 = true;
                            i7 = i9;
                            ei2Var2.H = z6 ? new k3(i6, i7, str, str2, str3, zEquals) : null;
                            lo1Var = this.f3191b;
                            k3Var = this.f3201m.H;
                            if (k3Var != null || (i8 = k3Var.f6232x) == -1) {
                                lo1Var2 = lo1Var;
                            } else {
                                lo1 eh2Var = new eh2(lo1Var, i8, this);
                                s1 s1VarO = this.f3201m.o(new di2(0, true));
                                this.f3199k = s1VarO;
                                s1VarO.b(ei2.f4305g0);
                                lo1Var2 = eh2Var;
                            }
                            ((tg2) this.f3192c).b(lo1Var2, this.f3190a, this.f3191b.f8790a.zze(), j7, j8, this.f3193d);
                            if (this.f3201m.H != null && (x0Var = ((tg2) this.f3192c).f9279b) != null && (x0Var instanceof f5)) {
                                ((f5) x0Var).f4488p = true;
                            }
                            if (this.h) {
                                zh2 zh2Var = this.f3192c;
                                long j9 = this.f3197i;
                                x0 x0Var2 = ((tg2) zh2Var).f9279b;
                                x0Var2.getClass();
                                x0Var2.c(j7, j9);
                                this.h = false;
                            }
                            iE = 0;
                            while (true) {
                                if (iE == 0) {
                                    break;
                                }
                                try {
                                    if (this.f3196g) {
                                        iE = 0;
                                        break;
                                    }
                                    try {
                                        am0 am0Var = this.f3194e;
                                        synchronized (am0Var) {
                                            while (!am0Var.s) {
                                                am0Var.wait();
                                            }
                                        }
                                        zh2 zh2Var2 = this.f3192c;
                                        b1 b1Var = this.f3195f;
                                        tg2 tg2Var2 = (tg2) zh2Var2;
                                        x0 x0Var3 = tg2Var2.f9279b;
                                        x0Var3.getClass();
                                        p0 p0Var = tg2Var2.f9280c;
                                        p0Var.getClass();
                                        iE = x0Var3.e(p0Var, b1Var);
                                        long jA = ((tg2) this.f3192c).a();
                                        if (jA > this.f3201m.f4316y + j7) {
                                            am0 am0Var2 = this.f3194e;
                                            synchronized (am0Var2) {
                                                am0Var2.s = false;
                                            }
                                            ei2 ei2Var3 = this.f3201m;
                                            ei2Var3.F.post(ei2Var3.E);
                                            j7 = jA;
                                        }
                                    } catch (InterruptedException unused4) {
                                        throw new InterruptedIOException();
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    i11 = iE;
                                }
                            }
                            if (iE != 1) {
                                tg2 tg2Var3 = (tg2) this.f3192c;
                                if (tg2Var3.a() != j6) {
                                    this.f3195f.f2886a = tg2Var3.a();
                                }
                                i11 = iE;
                            }
                            try {
                                this.f3191b.zzd();
                            } catch (IOException unused5) {
                            }
                            if (i11 == 0) {
                                return;
                            }
                        } else {
                            try {
                                qs0.f("IcyHeaders", "Invalid metadata interval: " + str5);
                                i7 = -1;
                            } catch (NumberFormatException unused6) {
                                qs0.f("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                                i7 = i9;
                                ei2Var2.H = z6 ? new k3(i6, i7, str, str2, str3, zEquals) : null;
                                lo1Var = this.f3191b;
                                k3Var = this.f3201m.H;
                                if (k3Var != null) {
                                }
                                if (i11 != 1) {
                                }
                                this.f3191b.zzd();
                                throw th;
                            }
                            ei2Var2.H = z6 ? new k3(i6, i7, str, str2, str3, zEquals) : null;
                            lo1Var = this.f3191b;
                            k3Var = this.f3201m.H;
                            if (k3Var != null) {
                                lo1Var2 = lo1Var;
                                ((tg2) this.f3192c).b(lo1Var2, this.f3190a, this.f3191b.f8790a.zze(), j7, j8, this.f3193d);
                                if (this.f3201m.H != null) {
                                    ((f5) x0Var).f4488p = true;
                                }
                                if (this.h) {
                                }
                                iE = 0;
                                while (true) {
                                    if (iE == 0) {
                                    }
                                }
                                if (iE != 1) {
                                }
                                this.f3191b.zzd();
                                if (i11 == 0) {
                                }
                            }
                        }
                    } else {
                        i7 = -1;
                        ei2Var2.H = z6 ? new k3(i6, i7, str, str2, str3, zEquals) : null;
                        lo1Var = this.f3191b;
                        k3Var = this.f3201m.H;
                        if (k3Var != null) {
                        }
                    }
                    if (i11 != 1) {
                        tg2 tg2Var4 = (tg2) this.f3192c;
                        if (tg2Var4.a() != j6) {
                            this.f3195f.f2886a = tg2Var4.a();
                        }
                    }
                    this.f3191b.zzd();
                    throw th;
                }
                j6 = -1;
                try {
                    qs0.f("IcyHeaders", "Invalid bitrate: " + str4);
                } catch (NumberFormatException unused7) {
                    qs0.f("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                    z6 = false;
                    i6 = i10;
                    list = (List) mapZze.get("icy-genre");
                    if (list != null) {
                    }
                    list2 = (List) mapZze.get("icy-name");
                    if (list2 != null) {
                    }
                    list3 = (List) mapZze.get("icy-url");
                    if (list3 != null) {
                    }
                    list4 = (List) mapZze.get("icy-pub");
                    if (list4 != null) {
                    }
                    list5 = (List) mapZze.get("icy-metaint");
                    if (list5 != null) {
                    }
                    if (i11 != 1) {
                    }
                    this.f3191b.zzd();
                    throw th;
                }
            } else {
                j6 = -1;
            }
            z6 = false;
            i6 = -1;
            list = (List) mapZze.get("icy-genre");
            if (list != null) {
            }
            list2 = (List) mapZze.get("icy-name");
            if (list2 != null) {
            }
            list3 = (List) mapZze.get("icy-url");
            if (list3 != null) {
            }
            list4 = (List) mapZze.get("icy-pub");
            if (list4 != null) {
            }
            list5 = (List) mapZze.get("icy-metaint");
            if (list5 != null) {
            }
            if (i11 != 1) {
            }
            this.f3191b.zzd();
            throw th;
        }
    }

    public final os1 b(long j6) {
        Map map = Collections.EMPTY_MAP;
        Map map2 = ei2.f4304f0;
        Uri uri = this.f3190a;
        if (uri != null) {
            return new os1(uri, map2, j6, -1L, 6);
        }
        throw new IllegalStateException("The uri must be set.");
    }
}
