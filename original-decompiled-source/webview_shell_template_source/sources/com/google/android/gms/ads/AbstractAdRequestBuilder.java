package com.google.android.gms.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.internal.client.zzeh;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.mediation.MediationExtrasReceiver;
import com.google.android.gms.ads.mediation.customevent.CustomEvent;
import com.google.android.gms.common.internal.l;
import java.util.List;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class AbstractAdRequestBuilder<T extends AbstractAdRequestBuilder<T>> {
    protected final zzeh zza;

    public AbstractAdRequestBuilder() {
        zzeh zzehVar = new zzeh();
        this.zza = zzehVar;
        zzehVar.zzt("B3EEABB8EE11C2BE770B684D95219ECB");
    }

    @Deprecated
    public T addCustomEventExtrasBundle(Class<? extends CustomEvent> cls, Bundle bundle) {
        this.zza.zzo(cls, bundle);
        return (T) self();
    }

    public T addCustomTargeting(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
            zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
        }
        this.zza.zzp(str, str2);
        return (T) self();
    }

    public T addKeyword(String str) {
        this.zza.zzq(str);
        return (T) self();
    }

    public T addNetworkExtrasBundle(Class<? extends MediationExtrasReceiver> cls, Bundle bundle) {
        this.zza.zzr(cls, bundle);
        if (cls.equals(AdMobAdapter.class) && bundle.getBoolean("_emulatorLiveAds")) {
            this.zza.zzu("B3EEABB8EE11C2BE770B684D95219ECB");
        }
        return (T) self();
    }

    public abstract T self();

    public T setAdString(String str) {
        this.zza.zzv(str);
        return (T) self();
    }

    public T setContentUrl(String str) {
        l.g("Content URL must be non-null.", str);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Content URL must be non-empty.");
        }
        int length = str.length();
        Object[] objArr = {Integer.valueOf(AdRequest.MAX_CONTENT_URL_LENGTH), Integer.valueOf(str.length())};
        if (!(length <= 512)) {
            throw new IllegalArgumentException(String.format("Content URL must not exceed %d in length.  Provided length was %d.", objArr));
        }
        this.zza.zzw(str);
        return (T) self();
    }

    public T setHttpTimeoutMillis(int i6) {
        this.zza.zzx(i6);
        return (T) self();
    }

    public T setNeighboringContentUrls(List<String> list) {
        if (list == null) {
            zzo.zzj("neighboring content URLs list should not be null");
            return (T) self();
        }
        this.zza.zzz(list);
        return (T) self();
    }

    public T setRequestAgent(String str) {
        this.zza.zzC(str);
        return (T) self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zza(String str) {
        this.zza.zzt(str);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzb(boolean z6) {
        this.zza.zzy(z6);
        return self();
    }

    public final AbstractAdRequestBuilder zzc(Bundle bundle) {
        this.zza.zzA(bundle);
        return self();
    }

    @Deprecated
    public final AbstractAdRequestBuilder zzd(boolean z6) {
        this.zza.zzD(z6);
        return self();
    }

    public T addCustomTargeting(String str, List<String> list) {
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2) && str2.contains(",")) {
                    zzo.zzj("Value " + str2 + " contains invalid character ',' (comma). The server will parse it as a list of comma-separated values.");
                }
            }
            this.zza.zzp(str, TextUtils.join(",", list));
        }
        return (T) self();
    }
}
