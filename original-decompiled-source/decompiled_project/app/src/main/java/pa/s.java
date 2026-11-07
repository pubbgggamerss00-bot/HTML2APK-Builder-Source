package pa;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.m0;
import com.google.android.gms.internal.common.zzb;
import com.google.android.gms.internal.common.zzc;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public abstract class s extends zzb implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f21404a;

    public s(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        com.google.android.gms.common.internal.p.b(bArr.length == 25);
        this.f21404a = Arrays.hashCode(bArr);
    }

    public static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    public abstract byte[] c();

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m0)) {
            try {
                m0 m0Var = (m0) obj;
                if (m0Var.zzc() == this.f21404a) {
                    return Arrays.equals(c(), (byte[]) za.b.c(m0Var.zzd()));
                }
            } catch (RemoteException e10) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f21404a;
    }

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        if (i10 == 1) {
            za.b bVarZzd = zzd();
            parcel2.writeNoException();
            zzc.zze(parcel2, bVarZzd);
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.f21404a);
        return true;
    }

    @Override // com.google.android.gms.common.internal.m0
    public final int zzc() {
        return this.f21404a;
    }

    @Override // com.google.android.gms.common.internal.m0
    public final za.b zzd() {
        return new za.b(c());
    }
}
