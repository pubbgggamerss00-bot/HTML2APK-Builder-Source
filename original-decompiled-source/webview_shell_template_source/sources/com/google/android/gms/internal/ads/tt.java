package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class tt implements yt {
    public final /* synthetic */ int s;

    public /* synthetic */ tt(int i6) {
        this.s = i6;
    }

    @Override // com.google.android.gms.internal.ads.yt
    public final void d(Object obj, Map map) throws NumberFormatException {
        switch (this.s) {
            case 0:
                xa0 xa0Var = (xa0) obj;
                if (TextUtils.isEmpty((CharSequence) map.get("appId"))) {
                    zze.zza("Missing App Id, cannot show LMD Overlay without it");
                    return;
                }
                lk1 lk1Var = new lk1(4);
                lk1Var.f6788v = 8388691;
                byte b7 = (byte) (lk1Var.f6792z | 1);
                lk1Var.f6789w = -1.0f;
                lk1Var.f6792z = (byte) (((byte) (((byte) (b7 | 2)) | 4)) | 8);
                lk1Var.f6787u = (String) map.get("appId");
                lk1Var.f6790x = xa0Var.getWidth();
                lk1Var.f6792z = (byte) (lk1Var.f6792z | 16);
                IBinder windowToken = xa0Var.zzF().getWindowToken();
                if (windowToken == null) {
                    throw new NullPointerException("Null windowToken");
                }
                lk1Var.f6786t = windowToken;
                if (map.containsKey("gravityX") && map.containsKey("gravityY")) {
                    lk1Var.f6788v = Integer.parseInt((String) map.get("gravityX")) | Integer.parseInt((String) map.get("gravityY"));
                    lk1Var.f6792z = (byte) (lk1Var.f6792z | 1);
                } else {
                    lk1Var.f6788v = 81;
                    lk1Var.f6792z = (byte) (lk1Var.f6792z | 1);
                }
                if (map.containsKey("verticalMargin")) {
                    lk1Var.f6789w = Float.parseFloat((String) map.get("verticalMargin"));
                    lk1Var.f6792z = (byte) (lk1Var.f6792z | 2);
                } else {
                    lk1Var.f6789w = 0.02f;
                    lk1Var.f6792z = (byte) (lk1Var.f6792z | 2);
                }
                if (map.containsKey("enifd")) {
                    lk1Var.f6791y = (String) map.get("enifd");
                }
                try {
                    zzv.zzk().zzj(xa0Var, lk1Var.q());
                    return;
                } catch (NullPointerException e6) {
                    zzv.zzp().h("DefaultGmsgHandlers.ShowLMDOverlay", e6);
                    zze.zza("Missing parameters for LMD Overlay show request");
                    return;
                }
            default:
                xa0 xa0Var2 = (xa0) obj;
                if (xa0Var2.g() != null) {
                    ((fa1) xa0Var2.g()).i1(3);
                }
                zzm zzmVarZzL = xa0Var2.zzL();
                if (zzmVarZzL != null) {
                    zzmVarZzL.zzb();
                    return;
                }
                zzm zzmVarZzM = xa0Var2.zzM();
                if (zzmVarZzM != null) {
                    zzmVarZzM.zzb();
                    return;
                } else {
                    zzo.zzj("A GMSG tried to close something that wasn't an overlay.");
                    return;
                }
        }
    }
}
