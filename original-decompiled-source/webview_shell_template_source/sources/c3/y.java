package c3;

import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.b1;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: r8-map-id-c2e43b85b3faaa908d3d4eb519a292cdfb67c014e97b7e4873d9aa873c97b949 */
/* loaded from: classes.dex */
public abstract class y extends p3.i implements b1 {
    public final int s;

    public y(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        com.google.android.gms.common.internal.l.b(bArr.length == 25);
        this.s = Arrays.hashCode(bArr);
    }

    public static byte[] i1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e6) {
            throw new AssertionError(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b1) {
            try {
                b1 b1Var = (b1) obj;
                if (b1Var.zze() == this.s) {
                    return Arrays.equals(r(), (byte[]) k3.b.i1(b1Var.zzd()));
                }
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.s;
    }

    @Override // p3.i
    public final boolean n(int i6, Parcel parcel, Parcel parcel2) {
        if (i6 == 1) {
            k3.b bVarZzd = zzd();
            parcel2.writeNoException();
            p3.j.b(parcel2, bVarZzd);
            return true;
        }
        if (i6 != 2) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeInt(this.s);
        return true;
    }

    public abstract byte[] r();

    @Override // com.google.android.gms.common.internal.b1
    public final k3.b zzd() {
        return new k3.b(r());
    }

    @Override // com.google.android.gms.common.internal.b1
    public final int zze() {
        return this.s;
    }
}
