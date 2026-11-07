package com.google.android.gms.internal.p002firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import i8.n;
import java.io.CharConversionException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;

/* loaded from: classes2.dex */
public final class zzmy {
    private static final Object zza = new Object();
    private static final String zzb = "zzmy";
    private zzbv zzc;

    public static final class zza {
        private Context zza = null;
        private String zzb = null;
        private String zzc = null;
        private String zzd = null;
        private zzbe zze = null;
        private boolean zzf = true;
        private zzbn zzg = null;
        private zzww zzh = null;
        private zzbv zzi;

        private static zzbv zza(byte[] bArr) throws GeneralSecurityException, IOException {
            return zzbv.zza(zzcc.zza(zzbd.zza(bArr), zzbj.zza()));
        }

        private final zzbe zzb() throws GeneralSecurityException {
            zzmy.zzd();
            zznd zzndVar = new zznd();
            try {
                boolean zZzc = zznd.zzc(this.zzd);
                try {
                    return zzndVar.zza(this.zzd);
                } catch (GeneralSecurityException | ProviderException e10) {
                    if (!zZzc) {
                        throw new KeyStoreException(n.d("the master key ", this.zzd, " exists but is unusable"), e10);
                    }
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e10);
                    return null;
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                return null;
            }
        }

        public final zza zza(zzww zzwwVar) {
            this.zzh = zzwwVar;
            return this;
        }

        public final zza zza(String str) {
            if (str.startsWith("android-keystore://")) {
                if (this.zzf) {
                    this.zzd = str;
                    return this;
                }
                throw new IllegalArgumentException("cannot call withMasterKeyUri() after calling doNotUseKeystore()");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }

        public final zza zza(Context context, String str, String str2) throws IOException {
            if (context != null) {
                this.zza = context;
                this.zzb = str;
                this.zzc = str2;
                return this;
            }
            throw new IllegalArgumentException("need an Android context");
        }

        public final synchronized zzmy zza() throws GeneralSecurityException, IOException {
            zzmy zzmyVar;
            try {
                if (this.zzb != null) {
                    zzww zzwwVar = this.zzh;
                    if (zzwwVar != null && this.zzg == null) {
                        this.zzg = zzbn.zza(zzcm.zza(zzwwVar.zzk()));
                    }
                    synchronized (zzmy.zza) {
                        try {
                            byte[] bArrZzb = zzb(this.zza, this.zzb, this.zzc);
                            if (bArrZzb == null) {
                                if (this.zzd != null) {
                                    this.zze = zzb();
                                }
                                zzbn zzbnVar = this.zzg;
                                if (zzbnVar != null) {
                                    zzbq zzbqVarZza = zzbq.zza(zzbnVar);
                                    zzmy.zza(zzbqVarZza, new zznf(this.zza, this.zzb, this.zzc), this.zze);
                                    this.zzi = zzbv.zza(zzbqVarZza);
                                } else {
                                    throw new GeneralSecurityException("cannot read or generate keyset");
                                }
                            } else if (this.zzd != null) {
                                zzmy.zzd();
                                this.zzi = zzb(bArrZzb);
                            } else {
                                this.zzi = zza(bArrZzb);
                            }
                            zzmyVar = new zzmy(this);
                        } finally {
                        }
                    }
                } else {
                    throw new IllegalArgumentException("keysetName cannot be null");
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return zzmyVar;
        }

        private final zzbv zzb(byte[] bArr) throws GeneralSecurityException, IOException {
            try {
                this.zze = new zznd().zza(this.zzd);
                try {
                    return zzbv.zza(zzbq.zza(zzbd.zza(bArr), this.zze, new byte[0]));
                } catch (IOException | GeneralSecurityException e10) {
                    try {
                        return zza(bArr);
                    } catch (IOException unused) {
                        throw e10;
                    }
                }
            } catch (GeneralSecurityException | ProviderException e11) {
                try {
                    zzbv zzbvVarZza = zza(bArr);
                    Log.w(zzmy.zzb, "cannot use Android Keystore, it'll be disabled", e11);
                    return zzbvVarZza;
                } catch (IOException unused2) {
                    throw e11;
                }
            }
        }

        private static byte[] zzb(Context context, String str, String str2) throws IOException {
            SharedPreferences sharedPreferences;
            if (str != null) {
                Context applicationContext = context.getApplicationContext();
                if (str2 == null) {
                    sharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
                } else {
                    sharedPreferences = applicationContext.getSharedPreferences(str2, 0);
                }
                try {
                    String string = sharedPreferences.getString(str, null);
                    if (string == null) {
                        return null;
                    }
                    return zzzr.zza(string);
                } catch (ClassCastException | IllegalArgumentException unused) {
                    throw new CharConversionException(n.d("can't read keyset; the pref value ", str, " is not a valid hex string"));
                }
            }
            throw new IllegalArgumentException("keysetName cannot be null");
        }
    }

    public static /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzbq zza() throws GeneralSecurityException {
        return this.zzc.zza();
    }

    private zzmy(zza zzaVar) {
        new zznf(zzaVar.zza, zzaVar.zzb, zzaVar.zzc);
        this.zzc = zzaVar.zzi;
    }

    public static /* synthetic */ void zza(zzbq zzbqVar, zzbx zzbxVar, zzbe zzbeVar) throws GeneralSecurityException {
        try {
            if (zzbeVar != null) {
                zzbqVar.zza(zzbxVar, zzbeVar, new byte[0]);
            } else {
                zzcc.zza(zzbqVar, zzbxVar, zzbj.zza());
            }
        } catch (IOException e10) {
            throw new GeneralSecurityException(e10);
        }
    }
}
