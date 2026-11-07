package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzv;
import java.util.Map;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class h90 implements yt {
    @Override // com.google.android.gms.internal.ads.yt
    public final /* bridge */ /* synthetic */ void d(Object obj, Map map) throws NumberFormatException {
        p80 p80Var = (p80) obj;
        ob0 ob0VarZzq = p80Var.zzq();
        if (ob0VarZzq == null) {
            try {
                ob0 ob0Var = new ob0(p80Var, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                p80Var.v(ob0Var);
                ob0VarZzq = ob0Var;
            } catch (NullPointerException e6) {
                e = e6;
                Throwable th = e;
                zzo.zzh("Unable to parse videoMeta message.", th);
                zzv.zzp().h("VideoMetaGmsgHandler.onGmsg", th);
                return;
            } catch (NumberFormatException e7) {
                e = e7;
                Throwable th2 = e;
                zzo.zzh("Unable to parse videoMeta message.", th2);
                zzv.zzp().h("VideoMetaGmsgHandler.onGmsg", th2);
                return;
            }
        }
        float f6 = Float.parseFloat((String) map.get("duration"));
        boolean zEquals = "1".equals(map.get("muted"));
        float f7 = Float.parseFloat((String) map.get("currentTime"));
        int i6 = Integer.parseInt((String) map.get("playbackState"));
        int i7 = 0;
        if (i6 >= 0 && i6 <= 3) {
            i7 = i6;
        }
        String str = (String) map.get("aspectRatio");
        float f8 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (zzo.zzm(3)) {
            zzo.zze("Video Meta GMSG: currentTime : " + f7 + " , duration : " + f6 + " , isMuted : " + zEquals + " , playbackState : " + i7 + " , aspectRatio : " + str);
        }
        ob0VarZzq.i1(f7, f6, f8, i7, zEquals);
    }
}
