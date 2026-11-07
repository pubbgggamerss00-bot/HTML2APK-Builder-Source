package com.google.android.gms.ads.internal.util.client;

import com.google.android.gms.ads.internal.client.zzbc;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public final class zzu implements zze {
    private final String zza;

    public zzu() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zze
    public final zzt zza(String str) {
        zzt zztVar = zzt.PERMANENT_FAILURE;
        try {
            zzo.zze("Pinging URL: " + str);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URI(str).toURL().openConnection();
            try {
                zzbc.zzb();
                String str2 = this.zza;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                zzl zzlVar = new zzl(null);
                zzlVar.zzc(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.zze(httpURLConnection, responseCode);
                if (responseCode < 200 || responseCode >= 300) {
                    zzo.zzj("Received non-success response code " + responseCode + " from pinging URL: " + str);
                    if (responseCode == 502) {
                        zztVar = zzt.RETRIABLE_FAILURE;
                    }
                } else {
                    zztVar = zzt.SUCCESS;
                }
                httpURLConnection.disconnect();
                return zztVar;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (IOException e6) {
            e = e6;
            zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            return zzt.RETRIABLE_FAILURE;
        } catch (IndexOutOfBoundsException e7) {
            e = e7;
            zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return zztVar;
        } catch (RuntimeException e8) {
            e = e8;
            zzo.zzj("Error while pinging URL: " + str + ". " + e.getMessage());
            return zzt.RETRIABLE_FAILURE;
        } catch (URISyntaxException e9) {
            e = e9;
            zzo.zzj("Error while parsing ping URL: " + str + ". " + e.getMessage());
            return zztVar;
        } finally {
        }
    }

    public zzu(String str) {
        this.zza = str;
    }
}
