package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzs;
import java.io.IOException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class v80 implements Runnable {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z80 f9757t;

    public /* synthetic */ v80(z80 z80Var, int i6) {
        this.s = i6;
        this.f9757t = z80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.s) {
            case 0:
                z80 z80Var = this.f9757t;
                t80 t80Var = z80Var.f2979t;
                float f6 = t80Var.f9127c ? t80Var.f9129e ? 0.0f : t80Var.f9130f : 0.0f;
                ja0 ja0Var = z80Var.f11218z;
                if (ja0Var == null) {
                    zzo.zzj("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        uc2 uc2Var = ja0Var.A;
                        if (uc2Var != null) {
                            uc2Var.f9530v.a();
                            gb2 gb2Var = uc2Var.f9529u;
                            gb2Var.N();
                            float fMax = Math.max(0.0f, Math.min(f6, 1.0f));
                            if (gb2Var.f4976c0 != fMax) {
                                gb2Var.f4976c0 = fMax;
                                gb2Var.I(1, 2, Float.valueOf(gb2Var.O.f7668e * fMax));
                                as0 as0Var = gb2Var.D;
                                as0Var.c(22, new rj1(fMax));
                                as0Var.b();
                                break;
                            } else {
                                break;
                            }
                        }
                    } catch (IOException e6) {
                        zzo.zzk(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e6);
                        return;
                    }
                }
                break;
            default:
                f80 f80Var = this.f9757t.f11216x;
                if (f80Var != null) {
                    r80 r80Var = f80Var.f4540w;
                    r80Var.f8582t = false;
                    uj1 uj1Var = zzs.zza;
                    uj1Var.removeCallbacks(r80Var);
                    uj1Var.postDelayed(r80Var, 250L);
                    uj1Var.post(new x(5, f80Var));
                    break;
                }
                break;
        }
    }
}
