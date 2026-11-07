package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
enum zzb {
    RESPONSE_CODE_UNSPECIFIED(-999),
    SERVICE_TIMEOUT(-3),
    FEATURE_NOT_SUPPORTED(-2),
    SERVICE_DISCONNECTED(-1),
    OK(0),
    USER_CANCELED(1),
    SERVICE_UNAVAILABLE(2),
    BILLING_UNAVAILABLE(3),
    ITEM_UNAVAILABLE(4),
    DEVELOPER_ERROR(5),
    ERROR(6),
    ITEM_ALREADY_OWNED(7),
    ITEM_NOT_OWNED(8),
    EXPIRED_OFFER_TOKEN(11),
    NETWORK_ERROR(12);

    private static final zzbw zzp;
    private final int zzr;

    static {
        zzbv zzbvVar = new zzbv();
        for (zzb zzbVar : values()) {
            zzbvVar.zza(Integer.valueOf(zzbVar.zzr), zzbVar);
        }
        zzp = zzbvVar.zzb();
    }

    zzb(int i10) {
        this.zzr = i10;
    }

    public static zzb zza(int i10) {
        zzbw zzbwVar = zzp;
        Integer numValueOf = Integer.valueOf(i10);
        return !zzbwVar.containsKey(numValueOf) ? RESPONSE_CODE_UNSPECIFIED : (zzb) zzbwVar.get(numValueOf);
    }
}
