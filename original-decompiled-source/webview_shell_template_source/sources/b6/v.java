package b6;

import android.app.Application;
import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzv;
import com.google.android.gms.ads.nonagon.signalgeneration.zzaa;
import com.google.android.gms.ads.nonagon.signalgeneration.zzau;
import com.google.android.gms.internal.ads.mi1;
import com.google.android.gms.internal.ads.zn;
import com.google.android.gms.internal.ads.zr1;
import com.google.android.gms.internal.consent_sdk.f0;
import com.google.android.gms.internal.consent_sdk.z8;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class v implements mi1, zr1, z8 {
    public final /* synthetic */ int s;

    /* renamed from: t, reason: collision with root package name */
    public final Object f2049t;

    public /* synthetic */ v(int i6, Object obj) {
        this.s = i6;
        this.f2049t = obj;
    }

    @Override // com.google.android.gms.internal.ads.zr1
    /* renamed from: a */
    public /* bridge */ /* synthetic */ void mo2a(Object obj) {
        zzau zzauVar = (zzau) this.f2049t;
        zzo.zze("Initialized webview successfully for SDKCore.");
        if (((Boolean) zzbe.zzc().a(zn.B9)).booleanValue()) {
            zzaa.zzd(zzauVar.zzp, null, "sgs", new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzauVar.zzH.get())));
            zzauVar.zzG.set(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public void c(int i6, long j6) {
        ((zzk) this.f2049t).zzi.c(i6, System.currentTimeMillis() - j6);
    }

    @Override // com.google.android.gms.internal.ads.mi1
    public void f(int i6, String str, long j6) {
        ((zzk) this.f2049t).zzi.d(i6, System.currentTimeMillis() - j6, null, null, str);
    }

    @Override // com.google.android.gms.internal.ads.zr1
    public void j(Throwable th) {
        zzv.zzp().h("SignalGeneratorImpl.initializeWebViewForSignalCollection", th);
        zzau zzauVar = (zzau) this.f2049t;
        zzaa.zzd(zzauVar.zzp, null, "sgf", new Pair("sgf_reason", th.getMessage()), new Pair("se", "query_g"), new Pair("ad_format", AdFormat.BANNER.name()), new Pair("rtype", Integer.toString(6)), new Pair("scar", "true"), new Pair("sgi_rn", Integer.toString(zzauVar.zzH.get())));
        zzo.zzh("Failed to initialize webview for loading SDKCore. ", th);
        if (!((Boolean) zzbe.zzc().a(zn.B9)).booleanValue() || zzauVar.zzG.get()) {
            return;
        }
        if (zzauVar.zzH.getAndIncrement() < ((Integer) zzbe.zzc().a(zn.C9)).intValue()) {
            zzauVar.zzT();
        }
    }

    public String toString() {
        switch (this.s) {
            case 0:
                return "<" + ((String) this.f2049t) + '>';
            default:
                return super.toString();
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.a9
    public Object zzb() {
        return new f0((Application) ((com.google.android.gms.internal.consent_sdk.f) this.f2049t).f11718t);
    }
}
