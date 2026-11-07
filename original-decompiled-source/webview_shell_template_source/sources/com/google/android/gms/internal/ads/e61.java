package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.util.Base64;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zzad;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzv;
import java.nio.ByteBuffer;
import java.util.UUID;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final /* synthetic */ class e61 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4135b;

    public /* synthetic */ e61(int i6, Object obj) {
        this.f4134a = i6;
        this.f4135b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i6;
        int streamMaxVolume;
        switch (this.f4134a) {
            case 0:
                AudioManager audioManager = (AudioManager) ((f61) this.f4135b).f4507b.getSystemService("audio");
                float fZza = zzv.zzs().zza();
                boolean zZze = zzv.zzs().zze();
                if (audioManager == null) {
                    return new g61(-1, false, false, -1, -1, -1, -1, -1, fZza, zZze, true);
                }
                int mode = audioManager.getMode();
                boolean zIsMusicActive = audioManager.isMusicActive();
                boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
                int streamVolume = audioManager.getStreamVolume(3);
                if (((Boolean) zzbe.zzc().a(zn.Qa)).booleanValue()) {
                    int iZzj = zzv.zzr().zzj(audioManager);
                    streamMaxVolume = audioManager.getStreamMaxVolume(3);
                    i6 = iZzj;
                } else {
                    i6 = -1;
                    streamMaxVolume = -1;
                }
                return new g61(mode, zIsMusicActive, zIsSpeakerphoneOn, streamVolume, i6, streamMaxVolume, audioManager.getRingerMode(), audioManager.getStreamVolume(2), fZza, zZze, false);
            case 1:
                a71 a71Var = (a71) this.f4135b;
                zzv.zzq();
                return new u51(2, zzs.zzt(a71Var.f2595a));
            case 2:
                return new m71(zzad.zzb(((o81) this.f4135b).f7645b, (String) zzbe.zzc().a(zn.X5)), 1);
            case 3:
                ((ud1) this.f4135b).mo5zza();
                return null;
            default:
                hi1 hi1Var = (hi1) this.f4135b;
                kd kdVarB0 = yd.b0();
                AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(hi1Var.f5416a);
                String id = advertisingIdInfo.getId();
                if (id != null && id.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$")) {
                    UUID uuidFromString = UUID.fromString(id);
                    byte[] bArr = new byte[16];
                    ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                    byteBufferWrap.putLong(uuidFromString.getMostSignificantBits());
                    byteBufferWrap.putLong(uuidFromString.getLeastSignificantBits());
                    id = Base64.encodeToString(bArr, 11);
                }
                if (id != null) {
                    kdVarB0.i();
                    yd.B((yd) kdVarB0.f4126t, id);
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    kdVarB0.i();
                    yd.R0((yd) kdVarB0.f4126t, zIsLimitAdTrackingEnabled);
                    kdVarB0.i();
                    yd.p0((yd) kdVarB0.f4126t);
                }
                return (yd) kdVarB0.g();
        }
    }
}
