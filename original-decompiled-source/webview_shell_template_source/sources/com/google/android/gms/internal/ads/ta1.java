package com.google.android.gms.internal.ads;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.client.zzs;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class ta1 implements pl1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9167a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9168b;

    public /* synthetic */ ta1(int i6, Object obj) {
        this.f9167a = i6;
        this.f9168b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.pl1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object apply(Object obj) {
        boolean z6;
        String str;
        int i6;
        int i7;
        float f6;
        int i8;
        DisplayMetrics displayMetrics;
        y2 y2VarA;
        int i9 = -1;
        String strZzj = null;
        switch (this.f9167a) {
            case 0:
                zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, (ix0) obj);
                zze.zza("Failed to get a cache key, reverting to legacy flow.");
                xa1 xa1Var = (xa1) this.f9168b;
                va1 va1Var = new va1(null, xa1Var.a());
                xa1Var.f10454d = va1Var;
                return va1Var;
            case 1:
                Throwable th = (Throwable) obj;
                mt mtVar = xt.f10667a;
                if (((Boolean) qp.f8437i.c()).booleanValue()) {
                    zzv.zzp().h("prepareClickUrl.attestation2", th);
                }
                return (String) this.f9168b;
            case 2:
                g51 g51Var = (g51) this.f9168b;
                ec1 ec1Var = g51Var.f4899b;
                zzs zzsVar = ec1Var.f4210e;
                zzs[] zzsVarArr = zzsVar.zzg;
                if (zzsVarArr == null) {
                    String str2 = zzsVar.zza;
                    z6 = zzsVar.zzi;
                    str = str2;
                } else {
                    z6 = false;
                    boolean z7 = false;
                    boolean z8 = false;
                    str = null;
                    for (zzs zzsVar2 : zzsVarArr) {
                        boolean z9 = zzsVar2.zzi;
                        if (!z9 && !z7) {
                            str = zzsVar2.zza;
                            z7 = true;
                        }
                        if (z9) {
                            if (!z8) {
                                z6 = true;
                            }
                            z8 = true;
                        }
                        if (!z7 || !z8) {
                        }
                    }
                }
                Resources resources = g51Var.f4900c.getResources();
                if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
                    i6 = 0;
                    i7 = 0;
                    f6 = 0.0f;
                } else {
                    b70 b70Var = g51Var.f4901d;
                    float f7 = displayMetrics.density;
                    int i10 = displayMetrics.widthPixels;
                    i7 = displayMetrics.heightPixels;
                    f6 = f7;
                    i6 = i10;
                    strZzj = b70Var.d().zzj();
                }
                StringBuilder sb = new StringBuilder();
                zzs[] zzsVarArr2 = zzsVar.zzg;
                if (zzsVarArr2 != null) {
                    int i11 = 0;
                    boolean z10 = false;
                    while (i11 < zzsVarArr2.length) {
                        zzs zzsVar3 = zzsVarArr2[i11];
                        if (zzsVar3.zzi) {
                            z10 = true;
                        } else {
                            if (sb.length() != 0) {
                                sb.append("|");
                            }
                            int i12 = zzsVar3.zze;
                            if (i12 == i9) {
                                i12 = f6 != 0.0f ? (int) (zzsVar3.zzf / f6) : i9;
                            }
                            sb.append(i12);
                            sb.append("x");
                            int i13 = zzsVar3.zzb;
                            if (i13 == -2) {
                                i13 = f6 != 0.0f ? (int) (zzsVar3.zzc / f6) : -2;
                            }
                            sb.append(i13);
                        }
                        i11++;
                        i9 = -1;
                    }
                    if (z10) {
                        if (sb.length() != 0) {
                            i8 = 0;
                            sb.insert(0, "|");
                        } else {
                            i8 = 0;
                        }
                        sb.insert(i8, "320x50");
                    }
                }
                return new h51(zzsVar, str, z6, sb.toString(), f6, i6, i7, strZzj, ec1Var.f4221q);
            case 3:
                ((w51) this.f9168b).f10050a.h("AppSetIdInfoSignal", (Exception) obj);
                return new x51(null, -1, 0);
            case 4:
                f91 f91Var = (f91) this.f9168b;
                AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
                y2 y2Var = new y2();
                if (!f91Var.f4568d) {
                    if (!((Boolean) zzbe.zzc().a(zn.f11418j3)).booleanValue()) {
                        if (f91Var.f4568d) {
                            if (((Boolean) zzbe.zzc().a(zn.f11425k3)).booleanValue()) {
                                try {
                                    ak1 ak1VarF = ak1.f(f91Var.f4565a);
                                    Objects.requireNonNull(info);
                                    String id = info.getId();
                                    Objects.requireNonNull(id);
                                    String packageName = f91Var.f4565a.getPackageName();
                                    long jLongValue = ((Long) zzbe.zzc().a(zn.f11456p3)).longValue();
                                    boolean z11 = f91Var.f4569e;
                                    ak1VarF.getClass();
                                    synchronized (ak1.class) {
                                        y2VarA = ak1VarF.a(id, packageName, jLongValue, z11);
                                    }
                                    y2Var = y2VarA;
                                } catch (IOException | IllegalArgumentException e6) {
                                    zzv.zzp().h("AdIdInfoSignalSource.getPaidV1", e6);
                                    y2Var = new y2();
                                }
                            }
                        }
                    }
                }
                return new g91(info, null, y2Var);
            default:
                ((i91) this.f9168b).f5617a.h("AppSetIdInfoGmscoreSignal", (Exception) obj);
                return new x51(null, -1, 1);
        }
    }
}
